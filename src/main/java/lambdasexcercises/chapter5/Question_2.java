package lambdasexcercises.chapter5;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question_2 {

	private static final Comparator<String> LENGTH_COMPARATOR = comparing(String::length);

	public String findLongestName1(List<String> names) {
		return names.parallelStream().collect(Collectors.maxBy(LENGTH_COMPARATOR)).get();
	}

	public String findLongestName2(List<String> names) {
		return names.parallelStream().reduce("", (x, y) -> {
			return LENGTH_COMPARATOR.compare(y, x) > 0 ? y : x;
		});
	}

	public Map<String, Long> countWords(List<String> words) {
		return words.parallelStream().collect(groupingBy(x -> x, HashMap::new, counting()));
	}

	public Map<String, List<String>> groupByWord(List<String> words) {
		return words.parallelStream().collect(new GroupingBy<String, String>());
	}

}
