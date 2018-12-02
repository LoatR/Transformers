package world;

import java.util.ArrayList;

public class Creature {
	
	private String nom;
	private Type type;
	private Monstre meilleurAmi;	
	private ArrayList<Monstre> esclaves;

	public Creature() {
		this.nom = "Jack";
		this.type = Type.Yéti;
		this.esclaves = new ArrayList<Monstre>();
	}
	
	Creature(String name, Type type){
		this.nom = name;
		this.type = type;
		this.esclaves = new ArrayList<Monstre>();
	}

	public String getNom() {
		return this.nom;
	}

	public Type getType() {
		return this.type;
	}

	public Monstre getMeilleurAmi() {
		return meilleurAmi;
	}

	public void setMeilleurAmi(Monstre meilleurAmi) {
		this.meilleurAmi = meilleurAmi;
	}

	
	public ArrayList<Monstre> getEsclaves() {
		return esclaves;
	}

	public void setEsclaves(ArrayList<Monstre> esclaves) {
		this.esclaves = esclaves;
	}

	public void asservir(Monstre monstre) {
		esclaves.add(monstre);
	}
	
	public void définirMeilleurAmi(Monstre futurMeilleurAmi) {
		this.setMeilleurAmi(futurMeilleurAmi);
		futurMeilleurAmi.setMeilleurAmi(this);
	}
	
	public String toString() {
		return "Je suis " + this.nom + " le " + this.type;
	}

}
