package edu.mu.characters.playerclasses;

public class Ranger extends PlayerClassSuper {
	public Ranger() {
		super();
		this.stats.put("Strength", 12);
		this.stats.put("Dexterity", 15);
		this.stats.put("Constitution", 14);
		this.stats.put("Intelligence", 8);
		this.stats.put("Wisdom", 13);
		this.stats.put("Charisma", 10);
		
		this.inventory.put("Weapon", "Bow");
		this.inventory.put("Clothing", "Medium Armor");
		this.inventory.put("Gold", "250");
	}
	@Override
	public void specialMove() {//idk man, maybe nothing, maybe sub ranger out for cleric for healing? idk
		
	}
}
