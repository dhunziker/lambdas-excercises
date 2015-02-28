package lambdasexcercises.chapter6;

import java.util.stream.IntStream;

public class Question_1 {

	public static int sumOfSquares(IntStream range) {
		return range.parallel().map(x -> x * x).sum();
	}

	public static int sequentialSumOfSquares(IntStream range) {
		return range.map(x -> x * x).sum();
	}

}
