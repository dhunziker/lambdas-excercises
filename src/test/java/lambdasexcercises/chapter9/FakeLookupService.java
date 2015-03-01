package lambdasexcercises.chapter9;

import static lambdasexcercises.domain.SampleData.THE_BEATLES;
import static lambdasexcercises.domain.SampleData.THE_BEATLES_MEMBERS;
import lambdasexcercises.domain.Artist;

public class FakeLookupService {

	public Artist lookupArtistName(String name) {
		sleepToSimulateLookupLatency();

		switch (name) {
			case "The Beatles":
				return THE_BEATLES;
			case "John Lennon":
				return THE_BEATLES_MEMBERS.get(0);
			default:
				throw new IllegalArgumentException("Unknown artist: " + name);
		}
	}

	private void sleepToSimulateLookupLatency() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
