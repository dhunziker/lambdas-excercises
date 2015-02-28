package lambdasexcercises.chapter6;

import java.util.List;

public class Question_2 {

	public static int sequentialMultiplyThrough(List<Integer> linkedListOfNumbers) {
		return linkedListOfNumbers.stream().reduce(5, (acc, x) -> x * acc);
	}

	public static int multiplyThrough(List<Integer> linkedListOfNumbers) {
		return linkedListOfNumbers.parallelStream().reduce(1, (acc, x) -> x * acc) * 5;
	}

}
