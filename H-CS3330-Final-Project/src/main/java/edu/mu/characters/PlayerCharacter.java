package edu.mu.characters;

import java.util.HashMap;

import edu.mu.characters.playerclasses.PlayerClassEnum;
import edu.mu.characters.playerclasses.*;
import edu.mu.npcs.*;

public class PlayerCharacter extends Character{
	private HashMap<String, Integer> stats;
	private HashMap<String, String> inventory;
	private PlayerClassSuper playerClass;
	private int exp;
	private int initiative;

	
	
	
	public PlayerCharacter(String name, Races race, PlayerClassSuper playerClass, HashMap<String, Integer> stats, HashMap<String,String> inventory) {
		super(name, race);
		this.stats = stats;
		this.inventory = inventory;
		this.playerClass = playerClass;
		double initDoub = ((Math.floor(stats.get("Dexterity") - 10) / 2));
		this.initiative = (int)(initDoub);
		double healDoub = ((Math.floor(stats.get("Constitution") - 10) / 2));
		this.health = 10 + (int)(healDoub);
		
		
		
	}
	public PlayerCharacter() {
		
	}

	public void printStats() {
		stats.forEach((k,v)->System.out.println(k+": "+ v));
	}
	public void printInventory() {
		inventory.forEach((k,v)->System.out.println(k+": "+ v));
	}
	
	
	public HashMap<String, Integer> getStats() {
		return stats;
	}
	public void setStats(HashMap<String, Integer> stats) {
		this.stats = stats;
	}
	public HashMap<String, String> getInventory() {
		return inventory;
	}
	public void setInventory(HashMap<String, String> inventory) {
		this.inventory = inventory;
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
	
	
	
	//actions
	public boolean perish() {
		System.out.println("You died!");
		return true;
	}
	public boolean attack(Entity e) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "PlayerCharacter [stats=" + stats + ", inventory=" + inventory + ", playerClass=" + playerClass
				+ ", exp=" + exp + ", initiative=" + initiative + ", name=" + name + ", race=" + race + ", health="
				+ health + "]";
	}







	



	
	}



	
	
	
	

