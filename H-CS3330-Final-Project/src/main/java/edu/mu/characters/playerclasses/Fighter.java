package edu.mu.characters.playerclasses;

import java.util.HashMap;

public class Fighter extends PlayerClassSuper {
	private int attackModifier;
	public Fighter() {
		super();
		this.stats.put("Strength", 15);
		this.stats.put("Dexterity", 13);
		this.stats.put("Constitution", 14);
		this.stats.put("Intelligence", 8);
		this.stats.put("Wisdom", 12);
		this.stats.put("Charisma", 10);
		
		this.inventory.put("Weapon", "Sword");
		this.inventory.put("Clothing", "Medium Armor");
		this.inventory.put("Gold", "250");
		
		double atkDoub = ((Math.floor(stats.get("Strength") - 10) / 2));
		this.attackModifier = (int)(atkDoub);
	}
	@Override
	public void specialMove() {//extra attack
		
	}
}
	
	
