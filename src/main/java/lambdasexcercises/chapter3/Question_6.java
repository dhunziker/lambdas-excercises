package lambdasexcercises.chapter3;

public class Question_6 {

	public long countLowerCaseCharacters(String string) {
		return string.chars().filter(Character::isLowerCase).count();
	}

}
