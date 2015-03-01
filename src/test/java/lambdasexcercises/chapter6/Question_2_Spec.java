package lambdasexcercises.chapter6;

import static com.insightfullogic.lambdabehave.Suite.describe;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_2_Spec {{

		describe("chapter 6 - question 2", it -> {
			it.should("multiply numbers and result by 5", expect -> {
				List<Integer> numbers = Arrays.asList(1, 2, 3);
				int result = Question_2.multiplyThrough(numbers);
				expect.that(result).is(30);
			});

			it.should("multiply numbers and result by 5 sequentially", expect -> {
				List<Integer> numbers = Arrays.asList(1, 2, 3);
				int result = Question_2.sequentialMultiplyThrough(numbers);
				expect.that(result).is(30);
			});
		});

}}
