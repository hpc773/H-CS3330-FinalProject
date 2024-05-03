package edu.mu.characters.playerclasses;

import java.util.HashMap;

public abstract class PlayerClassSuper {
	protected HashMap<String, Integer> stats = new HashMap<String, Integer>();
	protected HashMap<String, String> inventory = new HashMap<String, String>();

	public PlayerClassSuper(HashMap<String, Integer> stats, HashMap<String, String> inventory ) {
		this.stats = stats;
		this.inventory = inventory;
	}
	
	public PlayerClassSuper() {
		// TODO Auto-generated constructor stub
	}

	public HashMap<String, Integer> getStats() {
		return stats;
	}
	
	
	
	
	public HashMap<String, String> getInventory() {
		return inventory;
	}


	public void specialMove() {
		
	}
	public void printStats() {
		stats.forEach((k,v)->System.out.println(k+": "+ v));
	}
	public void printInventory() {
		inventory.forEach((k,v)->System.out.println(k+": "+ v));
	}


}
