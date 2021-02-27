package Seminar1.clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface{

	private Zookeeper zookeeper;
	private java.util.List<Animal> animalList;
	
	public Zoo() {
		animalList = new ArrayList<>();
		zookeeper = new Zookeeper("Ion");
	}
	
	public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
	
	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void feedAllAnimals() {
		for(Animal animal: animalList) {
			zookeeper.feed(animal);
		}
	}
}
