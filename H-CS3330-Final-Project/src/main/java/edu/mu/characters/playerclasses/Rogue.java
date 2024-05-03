package edu.mu.characters.playerclasses;

public class Rogue extends PlayerClassSuper {
	public Rogue() {
		super();
		this.stats.put("Strength", 8);
		this.stats.put("Dexterity", 15);
		this.stats.put("Constitution", 10);
		this.stats.put("Intelligence", 13);
		this.stats.put("Wisdom", 12);
		this.stats.put("Charisma", 14);
		
		this.inventory.put("Weapon", "Dagger");
		this.inventory.put("Clothing", "Light Armor");
		this.inventory.put("Gold", "500");//start w more gold, life as a thief?
	}
	@Override
	public void specialMove() {//sneak attack
		
	}
}
