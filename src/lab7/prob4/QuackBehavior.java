package lab7.prob4;

public interface QuackBehavior {
	default void quack() {
		System.out.println("\tquacking");
	};
}
