package lambdasexcercises.chapter2;

import java.util.function.Predicate;

public class Question_4 {

	public static void main(String[] args) {
		// The method check(Predicate<Integer>) is ambiguous for the type Question_4
		// new Question_4().check(x -> x > 5);
	}

	boolean check(Predicate<Integer> predicate) {
		return predicate.test(1);
	}

	boolean check(IntPred predicate) {
		return predicate.test(1);
	}

}

interface IntPred {

	boolean test(int value);

}
