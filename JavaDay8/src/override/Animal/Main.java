package override.Animal;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animal = new Animal[3];
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Tiger tiger = new Tiger();
		
		animal[0] = dog;
		animal[1] = cat;
		animal[2] = tiger;
		
		for(int i=0;i<animal.length;i++) {
			animal[i].eat();
			animal[i].walk();
			animal[i].makeNoise();
			System.out.println("______________________");
		}

	}

}
