package lambdasexcercises.chapter3;

import static com.insightfullogic.lambdabehave.Suite.describe;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_6_Spec {{

		Question_6 q6 = new Question_6();

		describe("question 6", it -> {
			it.should("count lower case characters", expect -> {
				expect.that(q6.countLowerCaseCharacters("The quick brown fox jumps over the lazy dog")).is(34L);
			});
		});

}}
