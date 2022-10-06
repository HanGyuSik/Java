package edu.추상클래스;

class BattleCruiser extends Unit01 {
	private String skill;

	public BattleCruiser(String attack, int hp, String name, String skill) {
		super(attack, hp, name);
		this.skill = skill;
	}

	@Override
	void Move() {
		System.out.println(super.toString());
		System.out.println("\t BattleCruiser [skill=" + skill + "]");
	}

}
