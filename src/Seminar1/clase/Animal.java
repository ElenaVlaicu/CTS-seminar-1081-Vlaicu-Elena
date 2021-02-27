package Seminar1.clase;

//clasa abstracta (in java) = nu e ca in c++ ca sa fie obligatoriu o metoda virtual pura(abstracta)
// = nu poate fi instantiata dar pot mosteni alte clase si poate fi mostenita de alte clase

public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
