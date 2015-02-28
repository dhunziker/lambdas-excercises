package lambdasexcercises.chapter6;

import static com.insightfullogic.lambdabehave.Suite.describe;

import java.util.stream.IntStream;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_1_Spec {{

		describe("question 1", it -> {
			it.should("sum squares", expect -> {
				IntStream range = IntStream.range(0, 100);
				expect.that(Question_1.sumOfSquares(range)).is(328350);
			});

			it.should("sum squares sequentially", expect -> {
				IntStream range = IntStream.range(0, 100);
				expect.that(Question_1.sequentialSumOfSquares(range)).is(328350);
			});
		});

}}
