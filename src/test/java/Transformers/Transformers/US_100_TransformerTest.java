package Transformers.Transformers;
import CarSimulation.Car;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import world.Monster;
import static org.junit.Assert.*;

public class US_100_TransformerTest {
	private Car car;
	private Monster monster;
	private Transformer bill;

	

	@Given("^a Car$")
	public void a_Car() throws Exception {
	  this.car = new Car(30,220);
	}

	@Given("^a Monster$")
	public void a_Monster() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   this.monster = new Monster("Shrek",2);
	}

	@When("^a Creature wants$")
	public void a_Creature_wants() throws Exception {
	    this.bill = new Transformer(car,monster);
	}

	@Then("^the Car and the Monster merge into a transformer$")
	public void the_Car_and_the_Monster_merge_into_a_transformer() throws Exception {
	    assertNotNull(bill);
	}

	@SuppressWarnings("deprecation")
	@Then("^the power of the Transformer is the product of the height of the Monster and the capacity of the Car$")
	public void the_power_of_the_Transformer_is_the_product_of_the_height_of_the_Monster_and_the_capacity_of_the_Car() throws Exception {
	    assertEquals(bill.getPower(),this.car.getCapacite()*this.monster.getHeight());
	}
}
