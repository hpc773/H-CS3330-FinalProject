package edu.mu.characters;

import java.util.HashMap;

import edu.mu.characters.playerclasses.PlayerClassEnum;
import edu.mu.characters.playerclasses.*;

public class PlayerCharacter extends Character{
	private HashMap<String, Integer> stats;
	private HashMap<String, String> inventory;
	private PlayerClassSuper playerClass;
	private int exp;
	
	
	
	public PlayerCharacter(String name, Races race, PlayerClassSuper playerClass, int health, HashMap<String, Integer> stats, HashMap<String,String> inventory) {
		super(name, race, health);
		this.stats = stats;
		this.inventory = inventory;
		this.playerClass = playerClass;
		
	}

	
	
	public void printStats() {
		stats.forEach((k,v)->System.out.println(k+": "+ v));
	}
	public void printInventory() {
		inventory.forEach((k,v)->System.out.println(k+": "+ v));
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



	@Override
	public String toString() {
		return "PlayerCharacter [stats=" + stats+ ", inventory="+ inventory + ", name=" + name + ", race=" + race
				+ ", playerClass=" + playerClass + "]";
	}



	



	
	}



	
	
	
	

