package lambdasexcercises.chapter5;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

public class Question_1 {

	public static List<String> toUpperCase1(List<String> strings) {
		return strings.stream().map(string -> string.toUpperCase()).collect(toList());
	}

	// Using method reference
	public static List<String> toUpperCase2(List<String> strings) {
		return strings.stream().map(String::toUpperCase).collect(toList());
	}

	public static int count1(List<Integer> numbers) {
		return numbers.stream().reduce(0, (acc, elem) -> acc + elem);
	}

	// Using method reference
	public static int count2(List<Integer> numbers) {
		return numbers.stream().reduce(0, Integer::sum);
	}

	public static List<Integer> concat1(List<Integer> left, List<Integer> right) {
		return Stream.of(left, right).flatMap(numbers -> numbers.stream()).collect(toList());
	}

	// Using method reference
	public static List<Integer> concat2(List<Integer> left, List<Integer> right) {
		return Stream.of(left, right).flatMap(List::stream).collect(toList());
	}

}
