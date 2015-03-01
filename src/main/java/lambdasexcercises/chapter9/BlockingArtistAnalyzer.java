package lambdasexcercises.chapter9;

import java.util.function.Function;

import lambdasexcercises.domain.Artist;

public class BlockingArtistAnalyzer {

	private final Function<String, Artist> artistLookupService;

	public BlockingArtistAnalyzer(Function<String, Artist> artistLookupService) {
		this.artistLookupService = artistLookupService;
	}

	public boolean isLargerGroup(String artistName, String otherArtistName) {
		return getNumberOfMembers(artistName) > getNumberOfMembers(otherArtistName);
	}

	private long getNumberOfMembers(String artistName) {
		return artistLookupService.apply(artistName).getMembers().count();
	}

}
