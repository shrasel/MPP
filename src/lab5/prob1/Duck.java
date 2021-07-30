package lab5.prob1;

public abstract class Duck {
	
	FlyBehavior flyBhv;
	QuackBehavior qakBhv;
	
	public Duck(FlyBehavior flyBhv, QuackBehavior qakBhv) {
		this.flyBhv = flyBhv;
		this.qakBhv = qakBhv;
	}
	
	public void swim() {
		System.out.println("\tswimming");
	}
	
	public abstract void display();
	
	public void fly() {
		this.flyBhv.fly();
	}
	
	public void quack() {
		this.qakBhv.quack();
	}

}
