package edu.mu.npcs;

/** Factory class to generate NPCs
 * 
 * @author skylarperry
 */
public class NpcFactory {
	public Entity spawnNPC(NpcType type){
		Entity newNpc;
		switch (type){
		case ZOMBIE:
			newNpc = new Zombie();
		case SKELETON:
			newNpc = new Skeleton();
		case HUMAN:
			newNpc = new Human();
		default:
			newNpc = null;
		}
		return newNpc;
	}
}
	
