package edu.mu.characters;

import java.util.HashMap;

import edu.mu.characters.playerclasses.PlayerClassEnum;
import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.characters.playerclasses.*;
import edu.mu.npcs.*;

public class PlayerCharacter extends Character{
	private HashMap<String, Integer> stats;
	private Weapons weapon;
	private Armor armor;
	private PlayerClassSuper playerClass;
	private int exp;
	private int initiative;
	private int defense;

	
	
	
	public PlayerCharacter(String name, Races race, PlayerClassSuper playerClass) {
		super(name, race);
		this.stats = playerClass.getStats();
		this.weapon = playerClass.getWeapon();
		this.playerClass = playerClass;
		double initDoub = ((Math.floor(stats.get("Dexterity") - 10) / 2));
		this.initiative = (int)(initDoub);
		double healDoub = ((Math.floor(stats.get("Constitution") - 10) / 2));
		this.health = 10 + (int)(healDoub);
		this.defense = armor.getArmorValue();//need to implement this somehow
		
		
		
	}
	public PlayerCharacter() {
		
	}

	public void printStats() {
		stats.forEach((k,v)->System.out.println(k+": "+ v));
	}
	
	
	
	public HashMap<String, Integer> getStats() {
		return stats;
	}
	public void setStats(HashMap<String, Integer> stats) {
		this.stats = stats;
	}
	
	
	public PlayerClassSuper getPlayerClass() {
		return playerClass;
	}
	public void setPlayerClass(PlayerClassSuper playerClass) {
		this.playerClass = playerClass;
	}
	public void setExp(int newExp) {
		this.exp = newExp;
	}
	public void incrementExp(int incExp) {
		this.exp += incExp;
	}
	public int getExp() {
		return this.exp;
	}
	
	
	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(int initiative) {
		this.initiative = initiative;
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
	//actions
	public boolean perish() {
		System.out.println("You died!");
		return true;
	}
	public boolean attackEnemy(Entity e) {
		int damageAmount = playerClass.getAttackModifier() + this.weapon.getDamage();
		e.setHealth(e.getHealth() - damageAmount);
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	







	



	
	}



	
	
	
	

