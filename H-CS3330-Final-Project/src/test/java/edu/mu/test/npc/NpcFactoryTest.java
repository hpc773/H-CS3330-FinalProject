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
import org.junit.jupiter.api.Test;

import edu.mu.characters.PlayerCharacter;
import edu.mu.characters.Races;

import org.junit.jupiter.api.Test;

class NpcFactoryTest {

	NpcFactory factory = new NpcFactory();
	Entity npc;
	
	@Test
	void SkeletonTest(){
		NpcType expectedType = NpcType.SKELETON;
		
		npc = factory.spawnNPC(NpcType.SKELETON);
		assertEquals(npc.getType(), expectedType);
	}
	
	@Test
	void ZombieTest(){
		NpcType expectedType = NpcType.ZOMBIE;		
		npc = factory.spawnNPC(NpcType.ZOMBIE);
		assertEquals(npc.getType(), expectedType);
	}
	
	@Test
	void HumanTest(){
		NpcType expectedType = NpcType.HUMAN;
		
		npc = factory.spawnNPC(NpcType.HUMAN);
		assertEquals(npc.getType(), expectedType);
	}
	

}
