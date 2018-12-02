package world;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorldStoriesTest {
	
	Creature dobby;
	Monstre loupGarou;
	boolean dieuVeut;

	@Given("^la creation d une creature$")
	public void la_creation_d_une_creature() throws Throwable {
		dobby = new Creature("Dobby",Type.Elfe); 
	}

	@Given("^d un monstre$")
	public void d_un_monstre() throws Throwable {
	    loupGarou = new Monstre();
	}

	@When("^Dieu le veut$")
	public void dieu_le_veut() throws Throwable {
		dieuVeut = (Math.random() < 0.5);
		if(dieuVeut) {
			dobby.setMeilleurAmi(loupGarou);
		}
	}

	@Then("^la créature devient ami avec le monstre et le monstre avec la creature$")
	public void la_créature_devient_ami_avec_le_monstre_et_le_monstre_avec_la_creature() throws Throwable {
		//assertEquals("Je suis John et je suis l'ami de Jack ", dobby.getMeilleurAmi(), loupGarou);
	}

}
