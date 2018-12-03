package Transformers.Transformers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import CarSimulation.Car;
import world.Monster;

public class TransformerTest {
	private Car car;
	private Monster monster;
	private Transformer bill;

	@SuppressWarnings("deprecation")
	public void createTest() {
		this.car = new Car(30, 220);
		this.monster = new Monster("Shrek", 2);
		this.bill = new Transformer(car, monster);
		double powerLeft = this.car.getCapacite() * this.monster.getHeight();
		assertNotNull(this.bill);
		assertEquals(this.bill.getPower(), powerLeft);
	}

	public void gettersTest() {
		this.car = new Car(30, 220);
		this.monster = new Monster("Shrek", 2);
		this.bill = new Transformer(car, monster);
		assertNotNull(bill.getMonster());
		assertNotNull(bill.getVoiture());
		assertNotNull(bill.getPower());
	}

	public void settersTest() {
		this.car = new Car(30, 220);
		this.monster = new Monster("Shrek", 2);
		this.bill = new Transformer(car, monster);
		this.bill.setMonster(new Monster("Pickachu", 4));
		this.bill.setVoiture(new Car(20, 1000));
		assertNotEquals(bill.getMonster(), this.monster);
		assertNotEquals(bill.getVoiture(), this.car);
	}

	public void attackTest() {
		this.car = new Car(30, 220);
		this.monster = new Monster("Shrek", 2);
		this.bill = new Transformer(car, monster);
		Transformer mat = new Transformer(new Car(20, 1000), new Monster(
				"Pickachu", 4));
		while (!this.bill.isDead()) {
			mat.attack(bill);
		}
		assertTrue(bill.isDead());
	}
}