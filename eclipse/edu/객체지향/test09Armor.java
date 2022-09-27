package edu.객체지향;

public class test09Armor {
	private String name;
	private int height;
	private int weight;
	private String Color;
	private boolean isFly;
	
	
	public test09Armor() {
		name = "Rex";
	}
	public test09Armor(String name) {
		this.name = name;
	}
	
	
	public test09Armor(String name, int height, int weight, String color, boolean isFly) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		Color = color;
		this.isFly = isFly;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public boolean isFly() {
		return isFly;
	}
	public void setFly(boolean isFly) {
		this.isFly = isFly;
	}
	
	
}

