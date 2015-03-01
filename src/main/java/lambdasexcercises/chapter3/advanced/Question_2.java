package lambdasexcercises.chapter3.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Question_2 {

	public static <I> List<I> filter(Stream<I> stream, Predicate<I> predicate) {
		return stream.reduce(new ArrayList<I>(), (List<I> x, I y) -> {
			System.out.println("Accumulate: " + x + " : " + y);
			ArrayList<I> acc = new ArrayList<>(x);
			if (predicate.test(y)) {
				acc.add(y);
			}
			return acc;
		}, (List<I> x, List<I> y) -> { // This is never called for sequential streams
			System.out.println("Combine: " + x + " : " + y);
			x.addAll(y);
			return x;
		});
	}

}
