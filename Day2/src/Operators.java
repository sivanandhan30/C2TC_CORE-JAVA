public class Operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		++a; //a = 11
		int c = ++a + b + a--; //a = 12, b = 20, So c = 12 + 20 + 12 = 44.... Then a = 11 
		System.out.println("Value of C Is: "+c);
		System.out.println("Value of A Is: "+a);
		
		int d = c++ + a + b--;//c = 44, b = 20, a = 11, So d = 44 + 11 + 20 = 75 .... Then c = 45, b = 19
		System.out.println("Value of D Is: "+d);
	}

}