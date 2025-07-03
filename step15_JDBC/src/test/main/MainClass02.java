package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MainClass02 {
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			
			conn=DriverManager.getConnection(url, "scott", "TIGER");
			
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			String sql = """
					SELECT empno,ename,job,sal 
					FROM emp 
					ORDER BY EMPNO ASC
					""";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				double sal = rs.getDouble("sal");
			
				System.out.println(empno+" | "+ename+" | "+job+" | "+sal);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

