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
		assertEquals("Son petit nom", "Jack", creature.getNom());
		assertEquals("Son petit type", "Yeti", creature.getType());
	}
	
	@Test
	public void testMeilleurAmi() {
		Creature creature = new Creature();
		Monstre monstre = new Monstre();
		creature.définirMeilleurAmi(monstre);
		
		assertEquals("Test de l'amitie creature ", creature.getMeilleurAmi(), monstre);
		assertEquals("Test de l'amitie monstre ", monstre.getMeilleurAmi(), creature);
	}
	
	@Test 
	public void testEsclaves() {
		Creature maitre = new Creature();
		Monstre esclave1 = new Monstre();
		Monstre esclave2 = new Monstre();
		maitre.asservir(esclave1);
		maitre.asservir(esclave2);
		
		assertNotNull("J'ai des esclaves", maitre.getEsclaves());
	}

}
