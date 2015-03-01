package lambdasexcercises.chapter9;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArtistAnalyzerTest {

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		FakeLookupService lookupService = new FakeLookupService();
		Object[][] data = new Object[][] { { new CallbackArtistAnalyser(lookupService::lookupArtistName) },
				{ new CompletableFutureArtistAnalyser(lookupService::lookupArtistName) }, };
		return Arrays.asList(data);
	}

	private final ArtistAnalyzer analyser;

	public ArtistAnalyzerTest(ArtistAnalyzer analyser) {
		this.analyser = analyser;
	}

	@Test
	public void largerGroupsAreLarger() {
		long start = System.currentTimeMillis();
		assertLargerGroup(true, "The Beatles", "John Lennon");
		System.out.println("Time [ms]: " + (System.currentTimeMillis() - start));
	}

	@Test
	public void smallerGroupsArentLarger() {
		long start = System.currentTimeMillis();
		assertLargerGroup(false, "John Lennon", "The Beatles");
		System.out.println("Time [ms]: " + (System.currentTimeMillis() - start));
	}

	private void assertLargerGroup(boolean expected, String artistName, String otherArtistName) {
		AtomicBoolean isLarger = new AtomicBoolean(!expected);
		analyser.isLargerGroup(artistName, otherArtistName, isLarger::set);
		assertEquals(expected, isLarger.get());
	}

}
