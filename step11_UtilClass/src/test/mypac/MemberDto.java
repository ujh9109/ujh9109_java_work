package test.mypac;

public class MemberDto {
	
	//필드 선언
	private int num;
	private String name;
	private String addr;
	
	
	//디폴트 생성자 
	public MemberDto() {
		
	}

	//필드의 모든 인자를 매개변수로 이용하는 생성자
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	
	
	//세터, 게터 메서드 선언
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

}
