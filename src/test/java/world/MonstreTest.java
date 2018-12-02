package world;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class MonstreTest {
	
	@Test
	public void testMonstre() {
		Monstre monstre = new Monstre();
		assertEquals("Le petit nom du monstre", "John", monstre.getNom());
	}
	
	@Test
	public void testChangerNom() {
		Monstre monstre = new Monstre();
		String monPetitNom = monstre.getNom();
		monstre.setNom("casimir");
		assertNotSame("Changement de nom", monstre.getNom(), monPetitNom);		
	}
	
	@Test
	public void testAmitie() {
		Monstre monpremierMonstre = new Monstre();
		assertEquals("Je suis John et je suis l'ami de Jack", monpremierMonstre.toString());
	}

}
