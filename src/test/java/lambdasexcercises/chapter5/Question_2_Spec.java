package lambdasexcercises.chapter5;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static java.util.stream.Collectors.toList;
import static lambdasexcercises.domain.SampleData.*;

import java.util.Arrays;
import java.util.List;

import lambdasexcercises.domain.Artist;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_2_Spec {{

		List<Artist> artists = THE_BEATLES.getMembers().collect(toList());

		describe("chapter 5 - question 2", it -> {
			it.should("find longest name using collector", expect -> {
				expect.that(Question_2.byCollecting(artists).getName()).is("George Harrison");
			});

			it.should("find longest name using reduce", expect -> {
				expect.that(Question_2.byReduce(artists).getName()).is("George Harrison");
			});

			it.should("count words", expect -> {
				List<String> words = Arrays.asList("John", "Paul", "George", "John", "Paul", "John");
				expect.that(Question_2.countWords(words).get("John").intValue()).is(3);
				expect.that(Question_2.countWords(words).get("Paul").intValue()).is(2);
				expect.that(Question_2.countWords(words).get("George").intValue()).is(1);
			});

			it.should("count words using a custom collector", expect -> {
				List<String> words = Arrays.asList("John", "Paul", "George", "John", "Paul", "John");
				expect.that(Question_2.groupByWord(words).get("John").size()).is(3);
				expect.that(Question_2.groupByWord(words).get("Paul").size()).is(2);
				expect.that(Question_2.groupByWord(words).get("George").size()).is(1);
			});
		});

}}
