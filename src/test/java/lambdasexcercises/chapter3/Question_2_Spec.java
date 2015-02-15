package lambdasexcercises.chapter3;

import static com.insightfullogic.lambdabehave.Suite.describe;

import java.util.Arrays;

import lambdasexcercises.domain.Artist;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_2_Spec {{

		Artist kingsOfLeon = new Artist("Kings of Leon", "Nashville");

		Artist theBeatles = new Artist("The Beatles", "Liverpool");

		Artist various = new Artist("Various", "Liverpool & Nashville", Arrays.asList(kingsOfLeon, theBeatles));

		Question_2 q2 = new Question_2();

		describe("question 2", it -> {
			it.should("external iteration", expect -> {
				expect.that(q2.externalIteration(Arrays.asList(various))).is(2);
			});

			it.should("internal iteration using map", expect -> {
				expect.that(q2.internalIterationMap(Arrays.asList(various))).is(2);
			});

			it.should("internal iteration using flatMap", expect -> {
				expect.that(q2.internalIterationFlatMap(Arrays.asList(various))).is(2);
			});
		});

}}
