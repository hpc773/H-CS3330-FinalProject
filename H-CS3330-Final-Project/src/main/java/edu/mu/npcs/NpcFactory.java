package edu.mu.npcs;

public class NpcFactory {
	NpcFactory(){
		
	}
	
	Entity spawnNPC(NpcType type){
		switch (type){
		case ZOMBIE:
			return new Zombie();
		case SKELETON:
			return new Skeleton();
		case HUMAN:
			return new Human();
		case UNIQUE:
			return new Unique();
		}
	}
}
