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

class HumanTest {

	private Human human;
	private PlayerCharacter pc;

	@BeforeEach
	void setUp(){
		human = new Human();
		pc = new PlayerCharacter("Skylar", Races.Dwarf, new Rogue());
		pc.setHealth(10);
	}
	
	@Test
	@RepeatedTest(1000)
	void testSpecialAttack() {
		human.specialAttack(pc);
		
		assertEquals(pc.getHealth(), 5);
	}
	
	@Test
	void testAttack() {
		int expecetedValue = pc.getHealth() - human.getAttack();
		human.attackCharacter(pc);
		assertEquals(expecetedValue, pc.getHealth());
	}
}
