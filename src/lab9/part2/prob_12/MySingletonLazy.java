package lab9.part2.prob_12;

import java.util.Optional;

public class MySingletonLazy {
	private String value;
	private static MySingletonLazy instance = null;

	private MySingletonLazy() {
	}

	public static void main(String[] args) {
		MySingletonLazy instance1, instance2;
		instance1 = getInstance();
		instance2 = getInstance();

		System.out.println(instance1 + "\n" + instance2);

	}

	public static MySingletonLazy getInstance() {
		return Optional.ofNullable(instance).orElseGet(MySingletonLazy::createInstance);
	}

	private static MySingletonLazy createInstance() {
		if (instance == null)
			instance = new MySingletonLazy();
		return instance;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
