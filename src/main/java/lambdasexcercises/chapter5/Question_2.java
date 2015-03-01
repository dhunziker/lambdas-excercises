package lambdasexcercises.chapter5;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lambdasexcercises.domain.Artist;

public class Question_2 {

	private static final Comparator<Artist> LENGTH_COMPARATOR = comparing(Artist::length);

	public static Artist byCollecting(List<Artist> artists) {
		return artists.parallelStream().collect(Collectors.maxBy(LENGTH_COMPARATOR)).get();
	}

	public static Artist byReduce(List<Artist> artists) {
		return artists.parallelStream().reduce((x, y) -> {
			return LENGTH_COMPARATOR.compare(y, x) > 0 ? y : x;
		}).get();
	}

	public static Map<String, Long> countWords(List<String> words) {
		return words.parallelStream().collect(groupingBy(x -> x, HashMap::new, counting()));
	}

	public static Map<String, List<String>> groupByWord(List<String> words) {
		return words.parallelStream().collect(new GroupingBy<String, String>());
	}

}
