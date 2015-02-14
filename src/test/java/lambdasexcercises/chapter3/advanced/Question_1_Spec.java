package lambdasexcercises.chapter3.advanced;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_1_Spec {{

		List<Integer> input = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		Question_1 q1 = new Question_1();

		describe("question 1", it -> {
			it.should("multiply each element by 3", expect -> {
				Function<Integer, Integer> mapper = x -> x * 3;
				expect.that(q1.map(input.parallelStream(), mapper)).is(
						input.parallelStream().map(mapper).collect(toList()));
			});
		});

}}
