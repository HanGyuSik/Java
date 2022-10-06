package edu.추상클래스;

abstract class Unit01 {
	private String attack;
	private int hp;
	private String name;

	public Unit01(String attack, int hp, String name) { // 생성자
		this.attack = attack;
		this.hp = hp;
		this.name = name;
	}

	abstract void Move();

	@Override
	public String toString() {
		return "Unit01 [attack=" + attack + ", hp=" + hp + ", name=" + name + "]";
	}

}
