package lambdasexcercises.chapter3;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static lambdasexcercises.domain.SampleData.KINGS_OF_LEON;
import static lambdasexcercises.domain.SampleData.PLEASE_PLEASE_ME;
import static lambdasexcercises.domain.SampleData.THE_BEATLES;
import static lambdasexcercises.domain.SampleData.YOUNG_AND_YOUNG_MANHOOD;

import java.util.Arrays;
import java.util.List;

import lambdasexcercises.domain.Album;
import lambdasexcercises.domain.Artist;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_1_Spec {{

		List<Artist> artists = Arrays.asList(THE_BEATLES, KINGS_OF_LEON);

		List<Album> albums = Arrays.asList(YOUNG_AND_YOUNG_MANHOOD, PLEASE_PLEASE_ME);

		Question_1 q1 = new Question_1();

		describe("question 1", it -> {
			it.should("add up numbers",	expect -> {
				expect.that(q1.addUp(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream())).is(
						(10 * (10 + 1)) / 2);
			});

			it.should("reduce artists to name and place of origin",	expect -> {
				expect.that(q1.reduceArtists(artists)).contains("The Beatles", "Liverpool",
						"Kings of Leon", "Nashville");
			});

			it.should("filter for albums with more than 3 tracks", expect -> {
				expect.that(q1.filterAlbums(albums).get(0).getName()).is("Youth & Young Manhood");
			});
		});

}}
