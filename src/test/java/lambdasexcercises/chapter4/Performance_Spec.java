package lambdasexcercises.chapter4;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static java.util.stream.Collectors.joining;
import static lambdasexcercises.domain.SampleData.KINGS_OF_LEON_MEMBERS;

import java.util.List;
import java.util.stream.Stream;

import lambdasexcercises.domain.Artist;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Performance_Spec {{

		LiveAtTheO2 liveAtTheO2 = new LiveAtTheO2(KINGS_OF_LEON_MEMBERS);

		describe("performance", it -> {
			it.should("return band and its members", expect -> {
				expect.that(liveAtTheO2.getAllMusicians().map(artist -> artist.getName()).collect(joining(", ")))
					.is("Kings of Leon, Caleb Followill, Matthew Followill, Jared Followill, Nathan Followill");
			});
		});

}}

class LiveAtTheO2 implements Performance {

	private List<Artist> artists;

	public LiveAtTheO2(List<Artist> artists) {
		this.artists = artists;
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
