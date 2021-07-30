package lab5.prob1;

public class MallardDuck extends Duck{

	public MallardDuck() {
		super(new FlyWithWings(), new Quack());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("\tdisplaying");
		
	}
	

}
