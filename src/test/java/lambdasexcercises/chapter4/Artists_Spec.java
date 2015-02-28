package lambdasexcercises.chapter4;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static lambdasexcercises.domain.SampleData.KINGS_OF_LEON_MEMBERS;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Artists_Spec {{

		Artists artists = new Artists(KINGS_OF_LEON_MEMBERS);

		describe("artists", it -> {
			it.should("find Jared Followill", expect -> {
				expect.that(artists.getArtistName(2)).is("Jared Followill");
			});

			it.should("not find negative index", expect -> {
				expect.that(artists.getArtistName(-1)).is("unknown");
			});

			it.should("not find invalid index", expect -> {
				expect.that(artists.getArtistName(KINGS_OF_LEON_MEMBERS.size())).is("unknown");
			});
		});

}}
