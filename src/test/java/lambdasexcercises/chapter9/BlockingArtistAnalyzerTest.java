package lambdasexcercises.chapter9;

import static com.insightfullogic.lambdabehave.Suite.describe;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class BlockingArtistAnalyzerTest {{

		final BlockingArtistAnalyzer analyser = new BlockingArtistAnalyzer(new FakeLookupService()::lookupArtistName);

		describe("compare group sizes", it -> {
			it.should("larger groups are larger", expect -> {
				expect.that(analyser.isLargerGroup("The Beatles", "John Lennon")).is(true);
			});

			it.should("smaller groups arent larger", expect -> {
				expect.that(analyser.isLargerGroup("John Lennon", "The Beatles")).is(false);
			});
		});

}}
