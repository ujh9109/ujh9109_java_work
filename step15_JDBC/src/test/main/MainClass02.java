package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MainClass02 {
	public static void main(String[] args) {
		//db에 접속해서 작업을 하려면 Connection 객체가 필요하다.
		
		Connection conn = null;
		
		try {
			//오라클 드라이버 로딩
			//ojdbc jar 파일이 있어야 아래의 코드가 동작한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "TIGER");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		//select 작업을 위해서 필요한 객체를 담을 지역변수 미리 만들기
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//실행할 sql문 미리 준비하기 
			//자바 10부터 추가된 문법.
			String sql = """
					SELECT empno,ename,job,sal 
					FROM emp 
					ORDER BY EMPNO ASC
					""";
			//sql문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//반복문 돌면서
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				double sal = rs.getDouble("sal");
				//현재 커서가 위치한 곳의 데이터를 테스트로 출력해보기
				System.out.println(empno+" | "+ename+" | "+job+" | "+sal);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

