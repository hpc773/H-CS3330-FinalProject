package edu.mu.characters.playerclasses;

import java.util.HashMap;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.npcs.Entity;

public abstract class PlayerClassSuper {
	protected HashMap<String, Integer> stats = new HashMap<String, Integer>();
	protected Weapons weapon;
	protected Armor armor;
	protected int attackModifier;

	/*public PlayerClassSuper(HashMap<String, Integer> stats, Weapons weapon, Armor armor ) {
		this.stats = stats;
		this.weapon = weapon;
		this.armor = armor;
	}*/
	
	public PlayerClassSuper() {
		// TODO Auto-generated constructor stub
	}

	public HashMap<String, Integer> getStats() {
		return stats;
	}
	
	
	
	
	


	public Weapons getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapons weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public abstract boolean specialMove(Entity e);
	

	public int getAttackModifier() {
		return attackModifier;
	}

	public void setAttackModifier(int attackModifier) {
		this.attackModifier = attackModifier;
	}
	


}
