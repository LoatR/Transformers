package world;

public class Monster {

	private String name;
	private Creature bestFriend;
	private double height;

	public Monster() {
		this.name = "John";
		this.bestFriend = new Creature();
	}
	
	public Monster(String name, double height) {
		this.name = name;
		this.bestFriend = new Creature();
		this.height = height;
	}
	
	public Monster(String name, Creature meilleurAmi, double height) {
		this.name = name;
		this.bestFriend = new Creature();
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Creature getBestFriend() {
		return bestFriend;
	}

	public void setBestFriend(Creature meilleurAmi) {
		this.bestFriend = meilleurAmi;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void act() {
		think();       
		System.out.println("i am acting so I dance because I have a new friend !");
	}

	public void think() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I am thinking");
		}
	}


	public String toString() {
		return "I am " + this.name + " and I am the best friend of " + this.bestFriend.getName();
	}
}
