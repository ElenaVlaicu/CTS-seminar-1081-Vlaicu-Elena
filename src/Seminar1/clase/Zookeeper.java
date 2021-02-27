package Seminar1.clase;

//ctrl shift s sa salvam

public class Zookeeper {

	private String name;

	public Zookeeper(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void feed(Animal animal) {
		//scriu syso ctrl space:
		System.out.println(name+ " hraneste animalul: "+ animal.getName());
	}
}
