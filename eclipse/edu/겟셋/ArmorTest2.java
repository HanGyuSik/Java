package edu.겟셋;

public class ArmorTest2 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Armor01 suit = new Armor01();
//		suit = null;
		suit.setName("mark6");
		suit.setHeight(180);
		System.out.println(suit.getName() + " : " + suit.getHeight());

	}

}
