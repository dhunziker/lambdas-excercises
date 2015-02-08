package lambdasexcercises.chapter3;

import java.util.List;
import java.util.Optional;

public class Question_7 {

	public Optional<String> findStringWithMostLowerCaseCharacters(List<String> strings) {
		return strings.stream().sorted((x, y) -> (int) (countLowerCaseCharacters(y) - countLowerCaseCharacters(x)))
				.findFirst();
	}

	public long countLowerCaseCharacters(String string) {
		return string.chars().filter(Character::isLowerCase).count();
	}

}
