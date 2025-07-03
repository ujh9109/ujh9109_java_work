package test.main;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass07 {
	
	public static boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		//resultset은 select 할 때만 필요하다.
		
		//변경된 row의 갯수를 담을 변수 선언하고 0으로 초기화
		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			String sql ="""
					INSERT INTO member
					(num,name,addr)
					VALUES(member_seq.NEXTVAL,?,?)
					""";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			
			//변화된 row의 갯수 리턴받기.(추가,수정,삭제)
			rowCount = pstmt.executeUpdate();
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
			//닫을 때는 역순.
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		
		//변화된 rowCount값을 조사해서 직업의 성공 여부를 알아낼 수 있다.
		
		if(rowCount>0) {
			return true; // 작업 성공이면 true 리턴
		}else {
			return false; // 작업 성공이면 false 리턴
		}
	}
	
	
	
	public static void main(String[] args) {
		//DB에 추가할 회원의 정보라고 가정하자. member table
		String name="누구게";
		String addr ="어디게";
		
		//insert(name,addr);
		
		MemberDto dto = new MemberDto();
		
		
		dto.setAddr(addr);
		dto.setName(name);
		
		insert(dto);
		
		boolean isSucces = insert(dto);
		if(isSucces) {
			System.out.println("성공했습니다.");
		}else {
			System.out.println("실패했습니다.");
		}
		
	}//main 메소드 끝

}//MainClas07 클래스 끝
