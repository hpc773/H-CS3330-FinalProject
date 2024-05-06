package edu.mu.characters;

import java.util.HashMap;

import edu.mu.characters.playerclasses.PlayerClassEnum;
import edu.mu.characters.playerclasses.PlayerClassSuper;

abstract class Character {
	
	protected String name;
	protected Races race;
	//private String description;

	//probably going to reduce the number of classes available for simplicity, probably only 4-5 or so
	//fighter, wizard, rogue, ranger? paladin?
	//private HashMap<String, Integer> stats;
	protected int health;
	
	public Character(String name, Races race, int health) {
		this.name = name;
		this.race = race;
		
		this.health = health;
	
	}
	public Character() {
		
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Races getRace() {
		return race;
	}
	public void setRace(Races race) {
		this.race = race;
	}
	public void setHealth(int newHealth) {
		this.health = newHealth;
	}
	public void incrementHealth(int incHealth) {
		this.health += incHealth;
	}
	public int getHealth() {
		return this.health;
	}
	
	
	
	
	
}
