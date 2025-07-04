package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;


public class MainClass04 {
	public static void main(String[] args) {
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnector().getConn();
		
			String sql = """
					SELECT empno,ename,deptno,dname
					from emp
					inner join dept using(deptno)
					order by empno asc
					""";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String ename = rs.getString("ename");
				
				String info = String.format("사원번호:%d 사원이름:%s 부서번호:%d 부서명:%s",empno,ename,deptno,dname);
				System.out.println(info);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

