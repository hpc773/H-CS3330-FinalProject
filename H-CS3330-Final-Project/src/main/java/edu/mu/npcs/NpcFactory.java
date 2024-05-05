package edu.mu.npcs;

/** Factory class to generate NPCs
 * 
 * @author skylarperry
 */
public class NpcFactory {
	Entity spawnNPC(NpcType type){
		Entity newNpc;
		switch (type){
		case ZOMBIE:
			newNpc = new Zombie();
		case SKELETON:
			newNpc = new Skeleton();
		case HUMAN:
			newNpc = new Human();
		case UNIQUE:
			newNpc = new Unique();
		}
		return newNpc;
	}
}
