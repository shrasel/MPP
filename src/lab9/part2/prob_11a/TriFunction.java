package lab9.part2.prob_11a;

@FunctionalInterface
public interface TriFunction<S, T, U, R> {
	R apply(S s, T t, U u);
}
