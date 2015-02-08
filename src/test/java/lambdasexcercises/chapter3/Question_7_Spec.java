package lambdasexcercises.chapter3;

import static com.insightfullogic.lambdabehave.Suite.describe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_7_Spec {{

		List<String> strings = Arrays.asList("HELLO", "HELLo", "HELlo", "HEllo", "Hello", "hello");

		Question_7 q7 = new Question_7();

		describe("question 7", it -> {
			it.should("find string with most lower case characters", expect -> {
				expect.that(q7.findStringWithMostLowerCaseCharacters(strings).get()).is("hello");
			});

			it.should("no value present for empty list", expect -> {
				expect.that(q7.findStringWithMostLowerCaseCharacters(new ArrayList<>()).isPresent()).is(false);
			});
		});

}}
