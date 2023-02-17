/**
 * @author N'ZO LAGOU
 * Exercice 1 : Implémenter L'héritage Hiérarchique

 ici vous allez créer une classe de base avec une méthode puis hériter
  de la classe de base créée en 2 classes dérivées en utilisant le mot clé "extends".

Ensuite, vous pouvez accéder à la méthode de classe de base en utilisant des
 objets des deux classes dérivées.
 */

package ninja;

public class Animal {
	
	protected  String name;
	protected  String rasse;
	protected  String sexe;
	
	// construtor without parameter
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// construtor avec parameter
	public Animal(String name, String rasse, String sexe) {
		super();
		this.name = name;
		this.rasse = rasse;
		this.sexe = sexe;
	}
	
	
	// getter and setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	//class methode
	public void manger() {
		//System.out.println("les animaux mangent");
	}


}
