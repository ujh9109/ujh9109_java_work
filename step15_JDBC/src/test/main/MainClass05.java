package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;

public class MainClass05 {
	public static void main(String[] args) {
		int minSal =2000;
		int maxSal =3000;
		//위의 범위의 sal을 받는 사원들의 empno,ename,sal을 select
		//sal 기준으로 오름차순 정렬
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnector().getConn();
			
			//실행할 sql문의 뼈대 구성하기
			String sql = """
					Select empno,ename,sal
					From emp
					Where sal between ? And ?
					order by sal asc
					""";
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, minSal);
			pstmt.setInt(2, maxSal);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal= rs.getInt("sal");
				System.out.println(empno+" | "+ename+" | "+sal);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//main 메소드 끝
}//MainClass05 클래스 끝
