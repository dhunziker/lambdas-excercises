package lambdasexcercises.chapter3;

public class Question_6 {

	public static int countLowercaseLetters(String string) {
		return (int) string.chars().filter(Character::isLowerCase).count();
	}

}
