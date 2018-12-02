package world;

public class Monstre {

	private String nom;
	private Creature meilleurAmi;
	private double height;

	public Monstre() {
		this.nom = "John";
		this.meilleurAmi = new Creature();
	}
	
	public Monstre(String name, double height) {
		this.nom = name;
		this.meilleurAmi = new Creature();
		this.height = height;
	}
	
	public Monstre(String name, Creature meilleurAmi, double height) {
		this.nom = name;
		this.meilleurAmi = new Creature();
		this.height = height;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Creature getMeilleurAmi() {
		return meilleurAmi;
	}

	public void setMeilleurAmi(Creature meilleurAmi) {
		this.meilleurAmi = meilleurAmi;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void agir() {
		reflechir();       
		System.out.println("J'agis => je fais la danse de la joie car j'ai un ami !");
	}

	public void reflechir() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Je suis en train de reflechir");
		}
	}


	public String toString() {
		return "Je suis " + this.nom + " et je suis l'ami de " + this.meilleurAmi.getNom();
	}
}
