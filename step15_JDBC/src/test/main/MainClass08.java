package test.main;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		
		//스캐너 객체를 이용해서 회원의 이름과 주소를 입력 받은 다음
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = scan.nextLine();
		System.out.print("주소 입력:");
		String addr = scan.nextLine();
		
		//MemberDto 객체를 이용해서 DB에 저장하려면?
		MemberDto dto = new MemberDto();
		dto.setAddr(addr);
		dto.setName(name);
		MemberDao dao = new MemberDao();
		boolean isSuccess = dao.insert(dto);
		if(isSuccess) {
			System.out.println("row가 추가되었습니다");
		}else {
			System.out.println("저장 실패");
		}
		
	}
}
