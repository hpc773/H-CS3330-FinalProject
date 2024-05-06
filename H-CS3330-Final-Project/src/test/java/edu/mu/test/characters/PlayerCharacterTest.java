package edu.mu.test.characters;

import static org.junit.jupiter.api.Assertions.*;

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
	
	
}
