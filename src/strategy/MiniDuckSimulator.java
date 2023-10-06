package strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.quack();
		mallard.fly();
		mallard.swim();
   
		Duck redHead = new RedHeadDuck();
		redHead.display();
		redHead.quack();
		redHead.fly();
		redHead.swim();
	}
}
