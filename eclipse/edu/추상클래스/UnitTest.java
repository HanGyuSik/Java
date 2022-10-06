package edu.추상클래스;

import java.util.ArrayList;
import java.util.List;

public class UnitTest {

	public static void main(String[] args) {
		List<Unit01> list = new ArrayList<>();
		
		list.add(new SigeTank("Cannon", 175, "sige", "ShockCannon"));
		list.add(new BattleCruiser("Laiser", 550, "Norade", "YamatoCannon"));
		
		for(Unit01 x : list) {
			x.Move();
		}

	}

}
