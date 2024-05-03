package edu.mu.characters;

import java.util.HashMap;
import java.util.Scanner;

import edu.mu.characters.playerclasses.PlayerClassEnum;
import edu.mu.characters.playerclasses.*;

public class CharacterCreator{
	public PlayerCharacter createCharacter() {
		Scanner in = new Scanner(System.in);
		String name;
		Races race;
		PlayerClassSuper playerClass = null;
		//HashMap<String, Integer> stats = new HashMap<String, Integer>();
		
		System.out.println("Welcome to the character creator.");
		
		name = nameCreator(in);
		race = raceCreator(in);
		PlayerClassEnum playerClassEnumVar = createClass(in);
		
		switch(playerClassEnumVar) {
		case Fighter:
			playerClass = new Fighter();
			break;
		case Paladin:
			playerClass = new Paladin();
			break;
		case Ranger:
			playerClass = new Ranger();
			break;
		case Rogue:
			playerClass = new Rogue();
			break;
		case Wizard:
			playerClass = new Wizard();
			break;
		default:
		}
		System.out.println("Character Created!");		
		
		
		
		
		
		return new PlayerCharacter (name, race, playerClass, playerClass.getStats(), playerClass.getInventory());
		
		
		
		
		
		
	}
	public String nameCreator(Scanner in) {
		String createName;
		
		System.out.println("What is your name?");
		while(true) {
			try {
				createName = in.nextLine();
				if(createName == "") {
					System.out.println("\nPlease enter a name.");
					continue;
				}
				break;
			}
			catch(Exception e){
				System.out.println("\nPlease enter another name.");
				continue;
			}
		}
		return createName;
		
	}
	public Races raceCreator(Scanner in) {
		Races createRace;
		System.out.println("\nPlease select a playable race. Enter an integer from 1 to 7.");
		while(true) {
			System.out.println("[1] Elf"
					+ "\n[2] Human"
					+ "\n[3] Dwarf"
					+ "\n[4] Halfling"
					+ "\n[5] Half Elf"
					+ "\n[6] Gnome"
					+ "\n[7] Tiefling");
			String raceChoice = in.nextLine();
			try {
				int raceNo = Integer.parseInt(raceChoice);
				createRace = Races.values()[raceNo - 1];
				break;
			}
			catch(Exception e) {
				System.out.println("Please enter an integer between 1-7.");
				continue;
			}
		
		}
		return createRace;
	}
	public PlayerClassEnum createClass(Scanner in) {
		PlayerClassEnum createPClass = null;
		System.out.println("Please select a playable class.");
		boolean a;
		while( a = true) {
			System.out.println("[1] Fighter"
					+ "\n[2] Paladin"
					+ "\n[3] Ranger"
					+ "\n[4] Rogue"
					+ "\n[5] Wizard");
			String classChoice = in.nextLine();
			try {
				int classNo = Integer.parseInt(classChoice);
				
				switch(classNo) {
				case 1://fighter
					System.out.println("Fighters are warriors of unparalleled skill."
							+ " They are equipped with Medium Armor, a sword, and have the ability to attack twice in one turn once per battle."
							+ "\nTheir stat distribution is:"
							+ "\nStrength: 15"
							+ "\nDexterity: 13"
							+ "\nConstitution: 14"
							+ "\nIntelligence: 8"
							+ "\nWisdom: 12"
							+ "\nCharisma: 10");
					createPClass = PlayerClassEnum.Fighter;
					break;
				case 2://paladin
					System.out.println("Paladins are warriors whose immense power comes from a powerful oath, allowing them to smite their enemies with powerful magic."
							+ " They are equipped with Heavy Armor, a warhammer, and can combine magic with weapon strikes to increase their power."
							+ "\nTheir stat distribution is:"
							+ "\nStrength: 15"
							+ "\nDexterity: 8"
							+ "\nConstitution: 13"
							+ "\nIntelligence: 10"
							+ "\nWisdom: 12"
							+ "\nCharisma: 14");
					createPClass = PlayerClassEnum.Paladin;
					break;
				case 3://ranger
					System.out.println("Rangers live in the wilderness, using their knowledge of nature and skill with archery to hunt their prey, human or animal."
							+ " They are equipped with Medium Armor, a bow, and."//finish this one...... maybe the ability to appear "invisible" to enemies/hiding?
							+ "\nTheir stat distribution is:"
							+ "\nStrength: 12"
							+ "\nDexterity: 15"
							+ "\nConstitution: 14"
							+ "\nIntelligence: 8"
							+ "\nWisdom: 12"
							+ "\nCharisma: 10");
					createPClass = PlayerClassEnum.Ranger;
					break;
				case 4://rogue
					System.out.println("Rogues subvert their enemies, either through stealth or a sharp tongue."
							+ " They are equipped with Light Armor, a dagger, and have the ability to start off battles with a devastating sneak attack."
							+ "\nTheir stat distribution is:"
							+ "\nStrength: 8"
							+ "\nDexterity: 15"
							+ "\nConstitution: 10"
							+ "\nIntelligence: 13"
							+ "\nWisdom: 12"
							+ "\nCharisma: 14");
					createPClass = PlayerClassEnum.Rogue;
					break;
				case 5://wizard
					System.out.println("Wizards are scholars and powerful users of magic."
							+ " They are equipped with a Robe, a staff, and the ability to perform ranged attacks with magic."
							+ "\nTheir stat distribution is:"
							+ "\nStrength: 8"
							+ "\nDexterity: 14"
							+ "\nConstitution: 13"
							+ "\nIntelligence: 15"
							+ "\nWisdom: 10"
							+ "\nCharisma: 12");
					createPClass = PlayerClassEnum.Wizard;
					break;
					
				default:
					System.out.println("Please enter an integer between 1-5.");
					continue;
				}
				break;
			}
			catch(Exception e) {
				System.out.println("Please enter an integer between 1-5.");
				System.out.println(e.getMessage());
				
				continue;
			}
		}
		return createPClass;
	}
	
}
