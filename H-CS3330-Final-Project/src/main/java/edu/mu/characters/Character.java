package edu.mu.characters;
/**
 * This is the parent class of the PlayerCharacter class. 
 * @author Henry Clark
 */
import java.util.HashMap;

import edu.mu.characters.playerclasses.PlayerClassEnum;
import edu.mu.characters.playerclasses.PlayerClassSuper;

abstract class Character {
	
	protected String name;
	protected Races race;
	protected int health;
	
	public Character(String name, Races race ) {
		this.name = name;
		this.race = race;
		

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
