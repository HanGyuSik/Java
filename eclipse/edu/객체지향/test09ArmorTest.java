package edu.객체지향;

public class test09ArmorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test09Armor arm = new test09Armor();
		
/*		arm.setName("child");		
		System.out.println("Name : " + arm.getName());
		
		arm.setHeight(180);		
		System.out.println("height : " + arm.getHeight());
		
		arm.setWeight(65);		
		System.out.println("Weight : " + arm.getWeight());
		
		arm.setColor("Yellow");		
		System.out.println("Color : " + arm.getColor());
		
		arm.setFly(true);		
		System.out.println("Fly : " + arm.isFly());
*/		
		System.out.println("Name : " + arm.getName());
		
		test09Armor ar1 = new test09Armor("ReXTT");
		System.out.println("Name : "+ ar1.getName());
		
		test09Armor ar2 = new test09Armor("LED", 178, 67, "Blue", false);
		System.out.println("name : " + ar2.getName());
		System.out.println("Height : " + ar2.getHeight());
		System.out.println("Weight : " + ar2.getWeight());
		System.out.println("Color : " + ar2.getColor());
		System.out.println("Fly : " + ar2.isFly());
	
	}

}

