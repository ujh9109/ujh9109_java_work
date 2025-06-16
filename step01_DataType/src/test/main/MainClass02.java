package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//콘솔창에 "main 메소드가 시작되었습니다."
		System.out.println("main 메소드가 시작되었습니다.");
		//국어점수 95를 kor이라는 변수에 담아보세요.
		int kor = 95;
		//영어점수 100을 eng라는 변수에 담아보세요.
		int eng = 100;
		//국어 점수와 영어 점수의 평균을 구한 다음, avg라는 변수에 대입.
		double avg = (kor + eng)/2d;
		//콘솔창에 avg 변수 안에 담은 내용을 출력.
		System.out.println(avg);
		
		//정수끼리 연산하면 결과는 정수만 나온다. 소수점 무시
		//정수와 실수를 연산하면 결과는 실수가 나온다. 소수점 무시 x
		//그렇기 때문에 (kor+eng)/2d. d를 붙여서 실수를 만들어준다.
	
		//원하는 format의 문자열 만들기
		String info = "평균: "+avg;
		String info2 = "국어: " + kor + "영어: " + eng + "평균: "+avg; 
		System.out.println(info);
		System.out.println(info2);

	
	
	
	}

}
