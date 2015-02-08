package lambdasexcercises.chapter2;

import java.util.function.Function;

@SuppressWarnings("unused")
public class Question_1_3 {

	private static final Function<Long, Long> F1 = x -> x + 1;

	// Lambda expression's signature does not match the signature of the
	// functional interface method apply(Long)
	// private static final Function<Long, Long> F2 = (x, y) -> x + 1;

	// Type mismatch: cannot convert from boolean to Long
	// private static final Function<Long, Long> F3 = x -> x == 1;

}
