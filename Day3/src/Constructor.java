
public class Constructor {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		c1.setCustomerid(1);
		c1.setCustomername("Ajith");
		c1.setCustomercity("Chennai");
		
        Customer c2 = new Customer();
		
		c2.setCustomerid(2);
		c2.setCustomername("Siva");
		c2.setCustomercity("Kanchipuram");
		
		
		
		System.out.println(c1.getCustomerid());
		System.out.println(c1.getCustomername());
		System.out.println(c1.getCustomercity());
		System.out.println("\n"+c2.getCustomerid());
		System.out.println(c2.getCustomername());
		System.out.println(c2.getCustomercity());
	}

}