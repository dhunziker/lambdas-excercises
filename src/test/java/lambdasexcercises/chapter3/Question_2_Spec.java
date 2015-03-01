package lambdasexcercises.chapter3;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static lambdasexcercises.domain.SampleData.KINGS_OF_LEON;

import java.util.Arrays;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_2_Spec {{

		describe("chapter 3 - question 2", it -> {
			it.should("external iteration", expect -> {
				expect.that(Question_2.externalIteration(Arrays.asList(KINGS_OF_LEON))).is(4);
			});

			it.should("internal iteration using map", expect -> {
				expect.that(Question_2.countBandMembersInternalMap(Arrays.asList(KINGS_OF_LEON))).is(4);
			});

			it.should("internal iteration using flatMap", expect -> {
				expect.that(Question_2.countBandMembersInternalFlatMap(Arrays.asList(KINGS_OF_LEON))).is(4);
			});
		});

}}
