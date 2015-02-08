package lambdasexcercises.chapter3;

import static com.insightfullogic.lambdabehave.Suite.describe;

import java.util.Arrays;
import java.util.List;

import lambdasexcercises.domain.Album;
import lambdasexcercises.domain.Artist;
import lambdasexcercises.domain.Track;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_1_Spec {{

		Artist kingsOfLeon = new Artist("Kings of Leon", "Nashville");

		Track t1 = new Track("Red Morning Light", 180);
		Track t2 = new Track("Happy Alone", 239);
		Track t3 = new Track("Wasted Time", 166);
		Track t4 = new Track("Joe's Head", 201);
		Track t5 = new Track("Trani", 300);

		Album youngAndYoungManhood = new Album("Youth & Young Manhood", kingsOfLeon, t1, t2, t3, t4, t5);

		Artist theBeatles = new Artist("The Beatles", "Liverpool");

		Track t6 = new Track("I Saw Her Standing There", 174);
		Track t7 = new Track("Misery", 110);

		Album pleasePleaseMe = new Album("Please Please Me", theBeatles, t6, t7);

		List<Artist> artists = Arrays.asList(theBeatles, kingsOfLeon);

		List<Album> albums = Arrays.asList(youngAndYoungManhood, pleasePleaseMe);

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
