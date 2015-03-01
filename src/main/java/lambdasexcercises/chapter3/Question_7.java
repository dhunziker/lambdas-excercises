package lambdasexcercises.chapter3;

import java.util.List;
import java.util.Optional;

public class Question_7 {

	public static Optional<String> mostLowercaseString(List<String> strings) {
		return strings.stream()
				.sorted((x, y) -> (int) (Question_6.countLowercaseLetters(y) - Question_6.countLowercaseLetters(x)))
				.findFirst();
	}

}
