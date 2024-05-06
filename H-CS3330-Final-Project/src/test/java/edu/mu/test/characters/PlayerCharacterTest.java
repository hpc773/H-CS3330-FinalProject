package edu.mu.test.characters;

import static org.junit.jupiter.api.Assertions.*;

import edu.mu.characters.playerclasses.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import edu.mu.characters.PlayerCharacter;
import edu.mu.characters.Races;



public class PlayerCharacterTest {

	private PlayerCharacter pc;
	
	@BeforeEach
	void setUp() {
		pc = new PlayerCharacter();
	}
	//--GETTERS AND SETTERS--------------------------------
	@Test
	@Order(1)
	@DisplayName("testing name getter/setter")
	void testsetName() {
		pc.setName("Henry");
		assertEquals("Henry", pc.getName());
		
		
	}
	@Test
	@Order(2)
	@DisplayName("testing race getter/setter")
	void testsetRace() {
		pc.setRace(Races.Dwarf);
		assertEquals(Races.Dwarf, pc.getRace());
		
		
	}
	@Test
	@Order(3)
	@DisplayName("testing health getter/setter")
	void testsetHealth() {
		pc.setHealth(20);
		assertEquals(20, pc.getHealth());
		
		
	}
	@Test
	@Order(4)
	@DisplayName("testing exp getter/setter")
	void testsetExp() {
		pc.setExp(100);
		assertEquals(100, pc.getExp());
		
		
	}
	//now for more complicated ones
	@Test
	@Order(5)
	@DisplayName("testing player class getter/setter")
	void testsetPlayerClass() {
		PlayerClassSuper pTest = new Paladin();
		pc.setPlayerClass(new Paladin());
		pTest.equals(pc.getPlayerClass());
		
		
	}
	@Test
	@Order(6)
	@DisplayName("testing inventory getter/setter")
	void testsetInventory() {
		PlayerClassSuper pTest = new Ranger();
		pc.setPlayerClass(new Ranger());
		pTest.getInventory().equals(pc.getInventory());
	}
	@Test
	@Order(6)
	@DisplayName("testing stats getter/setter")
	void testsetStats() {
		PlayerClassSuper pTest = new Wizard();
		pc.setPlayerClass(new Wizard());
		pTest.getStats().equals(pc.getStats());
	}
	
	//----------------------------------------------------------
	
	
	
}
