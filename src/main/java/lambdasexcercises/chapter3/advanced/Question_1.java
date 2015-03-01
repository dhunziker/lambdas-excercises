package lambdasexcercises.chapter3.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Question_1 {

	public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
		return stream.reduce(new ArrayList<O>(), (List<O> x, I y) -> {
			System.out.println("Accumulate: " + x + " : " + y);
			ArrayList<O> acc = new ArrayList<>(x);
			acc.add(mapper.apply(y));
			return acc;
		}, (List<O> x, List<O> y) -> { // This is never called for sequential streams
			System.out.println("Combine: " + x + " : " + y);
			x.addAll(y);
			return x;
		});
	}

}
