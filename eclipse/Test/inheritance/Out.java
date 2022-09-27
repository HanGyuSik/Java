package Test.inheritance;

public class Out extends Vehicle {

	public static void main(String[] args) {
		Sedan s1 = new Sedan();
		RV r1 = new RV();
		SUV s2 = new SUV();
		
		s1.setName("A");
		s1.setPrice(5000);
		s1.setCc(2000);
		s1.setWeight(600);
		
		r1.setName("B");
		r1.setPrice(6000);
		r1.setCc(3000);
		r1.setHeight(200);
		
		s2.setName("C");
		s2.setPrice(9000);
		s2.setCc(2500);
		s2.setColor("red");
		
		System.out.println(s1.toString());
		System.out.println(r1.toString());
		System.out.println(s2.toString());
		
	}

}
