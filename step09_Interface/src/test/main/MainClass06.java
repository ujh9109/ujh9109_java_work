package test.main;

import test.mypac.Warmer;

public class MainClass06 {
    public static void main(String[] args) {
        Warmer w1 = new Warmer() {
            @Override
            public void warm(String target) {
                System.out.println(target + "을/를 따듯하게 해요");
            }
        };
        
        Warmer w2 = (String target) ->{
        	System.out.println(target+"을/를 따뜻하게 해요");
        };
        
        
       
        useWarmer(w1);
        useWarmer(w2);
        
        Warmer w3 = target -> System.out.println(target + "에 불을 지펴요");
        useWarmer(w3);
        
        useWarmer((String target)->{System.out.println(target+"에 불을 지펴요");});
    
   
    }
    
    public static void useWarmer(Warmer w) {
        w.warm("손");
    }
		
}
		
	
	


