public class NestedIfElse {

	public static void main(String[] args) {
		int n = 15;
		int o = 25;
		int p = 14;
		System.out.println("The Numbers Are:"+n+" "+o+" "+p);
		System.out.print("The Largest Number is: ");
		
		if(n > o) {
			if(n > p) 
				System.out.println(n);
			else 
				System.out.println(p);
		}
		
		else {
			if (p > o) 
				System.out.println(p);
			else 
				System.out.println(o);
			}

	}

}