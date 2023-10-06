package strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.quack();
		mallard.fly();
		mallard.swim();
   
		Duck redhead = new RedheadDuck();
		redhead.display();
		redhead.quack();
		redhead.fly();
		redhead.swim();

		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.quack();
		rubber.fly();
		rubber.swim();

		Duck decoy = new DecoyDuck();
		decoy.display();
		decoy.quack();
		decoy.fly();
		decoy.swim();
	}
}
