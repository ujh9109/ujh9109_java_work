package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {
		//DB에 추가할 회원의 정보라고 가정하자. member table
		String name="누구게";
		String addr ="어디게";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		//resultset은 select 할 때만 필요하다.
		
		try {
			conn = new DBConnector().getConn();
			String sql ="""
					INSERT INTO member
					(num,name,addr)
					VALUES(member_seq.NEXTVAL,?,?)
					""";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			
			int rowCount = pstmt.executeUpdate();
			if(rowCount>0) {
				System.out.println("작업 성공");
			}else {
				System.out.println("작업 실패");
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}//main 메소드 끝

}//MainClas06 클래스 끝
