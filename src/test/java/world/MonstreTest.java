package world;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class MonstreTest {
	
	@Test
	public void testMonstre() {
		Monster monstre = new Monster();
		assertEquals("Le petit nom du monstre", "John", monstre.getName());
	}
	
	@Test
	public void testChangerNom() {
		Monster monstre = new Monster();
		String monPetitNom = monstre.getName();
		monstre.setName("casimir");
		assertNotSame("Changement de nom", monstre.getName(), monPetitNom);		
	}
	
	@Test
	public void testAmitie() {
		Monster monpremierMonstre = new Monster();
		assertEquals("Je suis John et je suis l'ami de Jack", monpremierMonstre.toString());
	}

}
