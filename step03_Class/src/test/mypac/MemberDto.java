package test.mypac;

public class MemberDto {
	//필드 정의하기.
	//접근 지정자가 private로 되어 있으면 외부에서 접근 불가.
	private int num;
	private String name;
	private String addr;
	
	
	//클래스명과 동일. 리턴 타입을 명시하지 않음. -> 메소드가 아니라 생성자.
	//객체를 new하는 시점에 호출된다.
	//객체를 new하는 시점에 무언가 초기화 작업을 할게 있으면 여기서 설정한다.
	public MemberDto() {
		System.out.println("MemberDto 클래스의 생성자가 호출됨!");
	} 
	
	public MemberDto(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	} 
	//생성자는 필요에 따라서 다른 모양으로 여러 개 정의할 수도 있다.
	
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
