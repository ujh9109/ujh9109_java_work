package test.main;

public class MainClass11 {
	public static void main(String[] args) {
	
		int i = 0;
		while (i<5) {
			System.out.println(i +"반복합니다.");
			i++;
		}
		System.out.println("---------------------");
		
		int j = 0;
		while(true) {//무한루프 돌다가 break문을 만나면 탈출
			System.out.println(j+"반복합니다.");
			j++;
			if(j==5) {
				break;
			}
		}
		
		
		
	}
}
