package world;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class CreatureTest {
	

	@Test
	public void testCreature() {
		Creature creature = new Creature();
		assertEquals("Son petit nom", "Jack", creature.getName());
		assertEquals("Son petit type", "Yeti", creature.getType());
	}
	
	@Test
	public void testMeilleurAmi() {
		Creature creature = new Creature();
		Monster monstre = new Monster();
		creature.pickBestFriend(monstre);
		
		assertEquals("Test de l'amitie creature ", creature.getBestFriend(), monstre);
		assertEquals("Test de l'amitie monstre ", monstre.getBestFriend(), creature);
	}
	
	@Test 
	public void testEsclaves() {
		Creature maitre = new Creature();
		Monster esclave1 = new Monster();
		Monster esclave2 = new Monster();
		maitre.enslave(esclave1);
		maitre.enslave(esclave2);
		
		assertNotNull("J'ai des esclaves", maitre.getEsclaves());
	}

}
