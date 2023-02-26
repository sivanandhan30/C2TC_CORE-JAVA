
public class SwitchCase {

	public static void main(String[] args) {
		char ch = 'S';
		System.out.println("Given Character is: "+ch);
		
		switch(ch) {
		case 's':
			System.out.println(ch+" is lower case");
			break;
		case 'S':
			System.out.println(ch+" is upper case");
			break;
		default :
			System.out.println(ch+" is a digit");
			break;
		}

	}
}