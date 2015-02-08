package lambdasexcercises.chapter3;

import static java.util.stream.Collectors.joining;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Question_5 {

	public static void main(String[] args) {
		// Side-effect free
		System.out.println(IntStream.range(0, 10).map(x -> x + 1).mapToObj(Integer::toString).collect(joining(", ")));

		// Side-effect
		AtomicInteger count = new AtomicInteger(0);
		System.out.println(IntStream.range(0, 10).map(x -> {
			count.incrementAndGet();
			return count.get();
		}).mapToObj(Integer::toString).collect(joining(", ")));
	}

}
