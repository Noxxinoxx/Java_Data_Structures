package se.liu.noaan869.lab1;

public class main6 {
	
	public static void main(String[] args) {
		int number = 4;
		System.out.println(isPrime(number));
		isPrime1();
	}
	
	
	
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {
			int rest = number % i; 
			if(rest == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void isPrime1() {
		
       int i =0;
       int t =0;
	   int length = 100;
	   int offset = 1;
	   int over = 2;

       for (i = 1; i <= length; i++){
          int cou =0; 	  
          for(t = i; t >= offset; t--){
             if(i % t == 0) {
            	 cou += 1;
	     	 }
          }
		  if (cou == over) {
		     System.out.println(i);
		  }	
       }	
       
	}

	
}
