package lambdasexcercises.chapter5;

import static com.insightfullogic.lambdabehave.Suite.describe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_3_Spec {{

		List<Long> fibonacciSequence = Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L);

		Question_3 q3 = new Question_3();

		describe("chapter 5 - question 3", it -> {
			it.should("calculate fibonacci", expect -> {
				IntStream.range(0, fibonacciSequence.size()).forEach(x -> {
					expect.that(q3.fibonacci(x)).is(fibonacciSequence.get(x));
				});
			});
		});

}}
