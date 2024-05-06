package edu.mu.test.npc;

import static org.junit.Assert.assertThat;
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

class SkeletonTest {
	
	private Skeleton skeleton;
	private PlayerCharacter pc;

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@BeforeEach
	void setUp(){
		skeleton = new Skeleton();
		pc = new PlayerCharacter("Skylar", Races.Dwarf, new Rogue());
		pc.setHealth(10);
	}
	
	@Test
	@RepeatedTest(1000)
	void testSpecialAttack() {
		skeleton.specialAttack(pc);
		
		assert(pc.getHealth() == 8 || pc.getHealth() == 6 || pc.getHealth() == 4 || pc.getHealth() == 2 || pc.getHealth() == 0);
	}
	
	@Test
	void testAttack() {
		int expecetedValue = pc.getHealth() - skeleton.getAttack();
		skeleton.attackCharacter(pc);
		assertEquals(expecetedValue, pc.getHealth());
	}

}
