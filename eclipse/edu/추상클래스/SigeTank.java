package edu.추상클래스;

class SigeTank extends Unit01 {
	private String WeaPone;

	public SigeTank(String attack, int hp, String name, String WeaPone) {
		super(attack, hp, name);
		this.WeaPone = WeaPone;
	}

	@Override
	void Move() {
		System.out.println(super.toString());
		System.out.println("\t SigeTank [WeaPone=" + WeaPone + "]");
	}
	
	
}
