package world;

import java.util.ArrayList;

public class Creature {
	
	private String name;
	private Type type;
	private Monster bestFriend;	
	private ArrayList<Monster> slaves;

	public Creature() {
		this.name = "Jack";
		this.type = Type.Yéti;
		this.slaves = new ArrayList<Monster>();
	}
	
	Creature(String name, Type type){
		this.name = name;
		this.type = type;
		this.slaves = new ArrayList<Monster>();
	}

	public String getName() {
		return this.name;
	}

	public Type getType() {
		return this.type;
	}

	public Monster getBestFriend() {
		return bestFriend;
	}

	public void setBestFriend(Monster meilleurAmi) {
		this.bestFriend = meilleurAmi;
	}

	
	public ArrayList<Monster> getEsclaves() {
		return slaves;
	}

	public void setEsclaves(ArrayList<Monster> esclaves) {
		this.slaves = esclaves;
	}

	public void enslave(Monster monstre) {
		slaves.add(monstre);
	}
	
	public void pickBestFriend(Monster futurMeilleurAmi) {
		this.setBestFriend(futurMeilleurAmi);
		futurMeilleurAmi.setBestFriend(this);
	}
	
	public String toString() {
		return "I am " + this.name + " and my type is " + this.type;
	}

}
