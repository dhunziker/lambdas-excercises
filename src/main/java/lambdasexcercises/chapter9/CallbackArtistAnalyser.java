package lambdasexcercises.chapter9;

import java.util.function.Consumer;
import java.util.function.Function;

import lambdasexcercises.domain.Artist;

public class CallbackArtistAnalyser implements ArtistAnalyzer {

	private final Function<String, Artist> artistLookupService;

	public CallbackArtistAnalyser(Function<String, Artist> artistLookupService) {
		this.artistLookupService = artistLookupService;
	}

	@Override
	public void isLargerGroup(String artistName, String otherArtistName, Consumer<Boolean> handler) {
		handler.accept(getNumberOfMembers(artistName) > getNumberOfMembers(otherArtistName));
	}

	private long getNumberOfMembers(String artistName) {
		return artistLookupService.apply(artistName).getMembers().count();
	}

}
