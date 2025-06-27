package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		
		/*
		 * HashMap<key type, value type>
		 * 
		 * key type은 일반적으로 String type을 가장 많이 사용한다.
		 * value type은 담고싶은 데이터의 타입을 고려해서 지정하면 된다.
		 * value 타입은 오브젝트로 지정하면 어떤 데이터 타입도 다 담을 수 있다.
		 * 순서가 없는 데이터를 다룰 때 사용하면 된다.
		 * dto 클래스 대신 사용하기도 한다.
		 * 
		 * */
		
		Map<String, Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("isMan", true );
		
		
		//데이터를 참조할 때는 get(key) 메소드를 사용한다.
		//오브젝트가 리턴되기 때문에 캐스팅 연산자를 이용해서 맞춰준다.
		int num =(int)map.get("num");
		String name =(String)map.get("name");
		boolean isMan =(boolean)map.get("isMan");
		
		System.out.println(num);
		System.out.println(name);
		System.out.println(isMan);
		
		
		//동일한 키값으로 다시 담으면 수정된다.
		map.put("name", "이정효");
		
		//특정 키값으로 담긴 내용 삭제
		map.remove("isMan");
		
		//모두 삭제. 이 때는 키값 필요 없다.
		map.clear();
		
		
		Map<String, Object> map2 = Map.of(
				"num",2,
				"name","해골",
				"isMan",false);
		
		
		
	}

}
