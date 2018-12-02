package Transformers.Transformers;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import CarSimulation.Car;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import world.Monstre;

public class US_200_BattleTest {
	private Transformer octopus;
	private Transformer flipper;
	private List<Car> cars;
	private List<Monstre> monsters;
	private Battle battle;
	private Transformer winner;
	
	@Given("^Two Transformers$")
	public void two_Transformers() throws Exception {
	    this.cars = new ArrayList<Car>();
	    cars.add(new Car(40, 500));
	    cars.add(new Car(23, 1945));
	    this.monsters = new ArrayList<Monstre>();
	    monsters.add(new Monstre("poulpe",3.24));
	    monsters.add(new Monstre("dauphin", 1.93));
	    
	    this.octopus = new Transformer(cars.get(1), monsters.get(0));
	    this.flipper = new Transformer(cars.get(0), monsters.get(1));
	}

	@When("^the fight starts$")
	public void the_fight_starts() throws Exception {
		this.battle = new Battle(this.octopus, this.flipper);
	}

	@Then("^each transformer will start fighting using its strategy to attack$")
	public void each_transformer_will_start_fighting_using_its_strategy_to_attack() throws Exception {
		this.winner = this.battle.beat();
	}

	@Then("^the fight ends when a transformer is being killed$")
	public void the_fight_ends_when_a_transformer_is_being_killed() throws Exception {
	    assertTrue(this.winner.getPower() > 0);
	    
	}
}
