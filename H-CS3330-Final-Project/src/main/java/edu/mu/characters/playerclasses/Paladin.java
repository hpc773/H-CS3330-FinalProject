package edu.mu.characters.playerclasses;

public class Paladin extends PlayerClassSuper {
	private int attackModifier;
	private int magicModifier;
	public Paladin() {
		super();
		this.stats.put("Strength", 15);
		this.stats.put("Dexterity", 8);
		this.stats.put("Constitution", 13);
		this.stats.put("Intelligence", 10);
		this.stats.put("Wisdom", 12);
		this.stats.put("Charisma", 14);
		
		this.inventory.put("Weapon", "Warhammer");
		this.inventory.put("Clothing", "Heavy Armor");
		this.inventory.put("Gold", "250");
		
		double atkDoub = ((Math.floor(stats.get("Strength") - 10) / 2));
		this.attackModifier = (int)(atkDoub);
		double mgcDoub = ((Math.floor(stats.get("Charisma") - 10) / 2));
		this.magicModifier = (int)(mgcDoub);
	}
	@Override
	public void specialMove() {//smite
		
	}
}
