package test.mypac;



public class Zoo {
	public class Monkey{
		public void say() {
			System.out.println("안녕, 나는 원숭이야");
		}
		
	}
	
	public class Tiger{
		public void roar() {
			System.out.println("어흥~~~");
		}
		
		
			}
	
	public class Bear{
		public void help() {
			System.out.println("과일을 따줘");
		}
		
		
	}

	public Monkey getMonkey() {
		return new Monkey();
	}
	
	public Tiger getTiger() {
		return new Tiger();
	}
	
	public Bear getBear() {
		return new Bear();
	}

}
