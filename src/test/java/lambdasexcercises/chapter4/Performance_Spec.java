package lambdasexcercises.chapter4;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static java.util.stream.Collectors.joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lambdasexcercises.domain.Artist;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Performance_Spec {{

		Artist kingsOfLeon = new Artist("Kings of Leon", "Nashville", Arrays.asList(
				new Artist("Caleb Followill", "Nashville"),
				new Artist("Matthew Followill", "Nashville"),
				new Artist("Jared Followill", "Nashville"),
				new Artist("Nathan Followill", "Nashville")));

		LiveAtTheO2 liveAtTheO2 = new LiveAtTheO2(kingsOfLeon);

		describe("performance", it -> {
			it.should("return band and its members", expect -> {
				expect.that(liveAtTheO2.getAllMusicians().map(artist -> artist.getName()).collect(joining(", ")))
					.is("Kings of Leon, Caleb Followill, Matthew Followill, Jared Followill, Nathan Followill");
			});
		});

	}

	static class LiveAtTheO2 implements Performance {

		private List<Artist> artists;

		public LiveAtTheO2(Artist... artists) {
			this.artists = Arrays.asList(artists);
		}

		@Override
		public String getName() {
			return "Live @ the O2";
		}

		@Override
		public Stream<Artist> getMusicians() {
			return artists.stream();
		}

	}

}
