package strategy;

public abstract class Duck {
	public Duck() {
	}
	abstract void display();
	public void fly() {
		System.out.println("All ducks fly!");
	}
	public void quack() {
		System.out.println("Quack quack!!");
	}
	public void swim() {
		System.out.println("All ducks float.");
	}
}
