package edu.mu.locations;

import java.util.HashMap;

import edu.mu.characters.PlayerCharacter;

public class Forest extends LocationSuper {

	protected int strengthMod = 0;
	protected int dexMod = 0;
	protected int constitutionMod = -1;
	protected int IntelligenceMod = 2;
	protected int wisdomMod = 0;
	protected int charismaMod = 1;
	
	
	protected HashMap<String, Integer> statsBase = new HashMap<String, Integer>();
	protected HashMap<String, Integer> statsAltered = new HashMap<String, Integer>();
	@Override
	public void Apply(PlayerCharacter character) {
		
		   
			statsBase = character.getStats();
			statsAltered = character.getStats();
			
			int strength = statsBase.get("Strength");
			int dexterity = statsBase.get("Dexterity");
			int intelligence = statsBase.get("Intelligence");
			int wisdom = statsBase.get("Wisdom");
			int constitution = statsBase.get("Constitution");
			int charisma = statsBase.get("Charisma");
			
			
			strength += strengthMod;
			dexterity += dexMod;
			intelligence += IntelligenceMod;
			wisdom += wisdomMod;
			constitution += constitutionMod;
			charisma += charismaMod;
			
			
			
			statsAltered.put("Strength", strength);
			statsAltered.put("Dexterity", dexterity);
			statsAltered.put("Intelligence", intelligence);
			statsAltered.put("Wisdom", wisdom);
			statsAltered.put("Constitution", constitution);
			statsAltered.put("Charisma", charisma);
			
			
			
			character.setStats(statsAltered);
			
			
		
		
	}
	@Override
	public void Depart(PlayerCharacter character) {
		character.setStats(statsBase);
		
	}
		
	
	
	
	
	
	
	
	
	
	



	

}
