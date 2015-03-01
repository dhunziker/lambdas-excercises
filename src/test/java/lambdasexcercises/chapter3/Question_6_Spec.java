package lambdasexcercises.chapter3;

import static com.insightfullogic.lambdabehave.Suite.describe;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_6_Spec {{

		describe("chapter 3 - question 6", it -> {
			it.should("count lower case characters", expect -> {
				expect.that(Question_6.countLowercaseLetters("The quick brown fox jumps over the lazy dog")).is(34);
			});
		});

}}
