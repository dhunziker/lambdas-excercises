package lambdasexcercises.chapter3.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Question_1 {

	public <T, R> List<R> map(Stream<T> stream, Function<? super T, ? extends R> mapper) {
		return stream.reduce(new ArrayList<R>(), (List<R> x, T y) -> {
			System.out.println("Accumulate: " + x + " : " + y);
			ArrayList<R> acc = new ArrayList<>(x);
			acc.add(mapper.apply(y));
			return acc;
		}, (List<R> x, List<R> y) -> { // This is never called for sequential streams
			System.out.println("Combine: " + x + " : " + y);
			x.addAll(y);
			return x;
		});
	}

}
