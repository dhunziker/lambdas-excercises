package lambdasexcercises.chapter5;

import static com.insightfullogic.lambdabehave.Suite.describe;

import java.util.Arrays;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_1_Spec {{

		describe("chapter 5 - question 1", it -> {
			it.should("transform strings to upper case", expect -> {
				expect.that(Question_1.toUpperCase1(Arrays.asList("A","B","HELLO"))).is(Arrays.asList("A","B","HELLO"));
			});

			it.should("transform strings to upper case using method reference", expect -> {
				expect.that(Question_1.toUpperCase2(Arrays.asList("A","B","HELLO"))).is(Arrays.asList("A","B","HELLO"));
			});

			it.should("count numbers in list", expect -> {
				expect.that(Question_1.count1(Arrays.asList(1, 2, 3))).is(6);
			});

			it.should("count numbers in list using method reference", expect -> {
				expect.that(Question_1.count2(Arrays.asList(1, 2, 3))).is(6);
			});

			it.should("concatenate lists", expect -> {
				expect.that(Question_1.concat1(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6))).is(Arrays.asList(1, 2, 3, 4, 5, 6));
			});

			it.should("concatenate lists using method reference", expect -> {
				expect.that(Question_1.concat2(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6))).is(Arrays.asList(1, 2, 3, 4, 5, 6));
			});
		});

}}
