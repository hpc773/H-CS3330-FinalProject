package edu.mu.locations;

import java.util.HashMap;

import edu.mu.characters.PlayerCharacter;

public abstract class LocationSuper {

	protected int strengthMod;
	protected int dexMod;
	protected int constitutionMod;
	protected int IntelligenceMod;
	protected int wisdomMod;
	protected int charismaMod;
	
	
	
	
	
	public abstract void Apply(PlayerCharacter character);
	   

	    

	
	public abstract void Depart(PlayerCharacter character);
	
	

}
