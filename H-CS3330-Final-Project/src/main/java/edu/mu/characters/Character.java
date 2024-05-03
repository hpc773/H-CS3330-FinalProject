package edu.mu.characters;

import java.util.HashMap;

import edu.mu.characters.playerclasses.PlayerClassEnum;
import edu.mu.characters.playerclasses.PlayerClassSuper;

abstract class Character {
	
	protected String name;
	protected Races race;
	//private String description;
	protected PlayerClassSuper playerClass;
	//probably going to reduce the number of classes available for simplicity, probably only 4-5 or so
	//fighter, wizard, rogue, ranger? paladin?
	//private HashMap<String, Integer> stats;
	//ADD HEALTH STUFF
	
	public Character(String name, Races race, PlayerClassSuper playerClass) {
		this.name = name;
		this.race = race;
		this.playerClass = playerClass;
	}
	
	
	
	
	
}
