package lambdasexcercises.chapter3.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Question_2 {

	public <R> List<R> filter(Stream<R> stream, Predicate<? super R> predicate) {
		return stream.reduce(new ArrayList<R>(), (List<R> x, R y) -> {
			System.out.println("Accumulate: " + x + " : " + y);
			ArrayList<R> acc = new ArrayList<>(x);
			if (predicate.test(y)) {
				acc.add((R) y);
			}
			return acc;
		}, (List<R> x, List<R> y) -> { // This is never called for sequential streams
			System.out.println("Combine: " + x + " : " + y);
			x.addAll(y);
			return x;
		});
	}

}
