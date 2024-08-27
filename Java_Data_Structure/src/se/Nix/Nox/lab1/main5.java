package se.liu.noaan869.lab1;

public class main5 {
	public static void main(String[] args) {
		int length = 10;
		for (int i = 0; i < length; i++) {
			System.out.println(i + "-fakultet: " + factorial(i));
		}
	}
	/**
	* Calculates f! given f.
	* @param f
	 * @return 
	* @return f!
	*/
	private static int factorial(int f) {
	  if (f == 0) {
	    return 1;
	  }
	
	  int result = 1;
	  for (int i = 1; i <= f; i++) {
	    result *= i;
	  }
	
	  return result;
	}
	
}
