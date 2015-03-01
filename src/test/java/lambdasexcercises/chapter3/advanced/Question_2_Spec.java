package lambdasexcercises.chapter3.advanced;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_2_Spec {{

		List<Integer> input = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		describe("chapter 3 - advanced question 2", it -> {
			it.should("divisible by 2", expect -> {
				Predicate<Integer> predicate = x -> x % 2 == 0;
				expect.that(Question_2.filter(input.parallelStream(), predicate)).is(
						input.parallelStream().filter(predicate).collect(toList()));
			});
		});

}}
