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

	List<String> names = THE_BEATLES_MEMBERS.stream().map(Artist::getName).collect(toList());

	Question_2 q2 = new Question_2();

	describe("question 2", it -> {
		it.should("find longest name using collector", expect -> {
			expect.that(q2.findLongestName1(names)).is("Stuart Sutcliffe");
		});

		it.should("find longest name using reduce", expect -> {
			expect.that(q2.findLongestName2(names)).is("Stuart Sutcliffe");
		});

		it.should("count words", expect -> {
			List<String> words = Arrays.asList("John", "Paul", "George", "John", "Paul", "John");
			expect.that(q2.countWords(words).get("John").intValue()).is(3);
			expect.that(q2.countWords(words).get("Paul").intValue()).is(2);
			expect.that(q2.countWords(words).get("George").intValue()).is(1);
		});

		it.should("count words using a custom collector", expect -> {
			List<String> words = Arrays.asList("John", "Paul", "George", "John", "Paul", "John");
			expect.that(q2.groupByWord(words).get("John").size()).is(3);
			expect.that(q2.groupByWord(words).get("Paul").size()).is(2);
			expect.that(q2.groupByWord(words).get("George").size()).is(1);
		});
	});

}}
