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
	private HashMap<String, String> inventory = new HashMap<String, String>();


	
	
	
	public PlayerCharacter(String name, Races race, PlayerClassSuper playerClass) {
		super(name, race);
		this.stats = playerClass.getStats();
		this.weapon = playerClass.getWeapon();
		this.armor = playerClass.getArmor();
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
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public HashMap<String, String> getInventory() {
		return inventory;
	}
	public void setInventory(HashMap<String, String> inventory) {
		this.inventory = inventory;
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
	//method that handles when the player dies--we can do more with this to restart fight or something else
	public boolean perish() {
		System.out.println("You died!");
		return true;
	}
	//method player uses to attack, changing enemy health
	public boolean attackEnemy(Entity e) {
		int damageAmount = playerClass.getAttackModifier() + this.weapon.getDamage();
		e.setHealth(e.getHealth() - damageAmount);
		return true;
		
	}
	@Override
	public String toString() {
		return "PlayerCharacter [stats=" + stats + ", weapon=" + weapon + ", armor=" + armor + ", playerClass="
				+ playerClass + ", exp=" + exp + ", initiative=" + initiative + ", defense=" + defense + ", inventory="
				+ inventory + ", name=" + name + ", race=" + race + ", health=" + health + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
	







	



	
	}
/**
 * This is the class that defines the player character, along with all of their fields. It inherits from the Character superclass and depends on the playerclasses package, and is created with the CharacterCreator method.
 * 
 * Author: Henry Clark
 * 
 */


	
	
	
	

