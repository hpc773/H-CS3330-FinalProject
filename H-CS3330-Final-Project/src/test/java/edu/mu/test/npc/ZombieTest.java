package edu.mu.test.npc;

import static org.junit.jupiter.api.Assertions.*;

import edu.mu.characters.playerclasses.*;
import edu.mu.npcs.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import edu.mu.characters.PlayerCharacter;
import edu.mu.characters.Races;

import org.junit.jupiter.api.Test;

class ZombieTest {
	
	private Zombie zombie;
	private PlayerCharacter pc;

	
	@BeforeEach
	void setUp(){
		zombie = new Zombie();
		pc = new PlayerCharacter("Skylar", Races.Dwarf, new Rogue());
		pc.setHealth(10);
	}
	
	@Test
	@RepeatedTest(1000)
	void testSpecialAttack() {
		zombie.specialAttack(pc);
		
		assertEquals(pc.getHealth(), 5);
	}
	
	@Test
	void testAttack() {
		int expecetedValue = pc.getHealth() - zombie.getAttack();
		zombie.attackCharacter(pc);
		assertEquals(expecetedValue, pc.getHealth());
	}

}
