package lambdasexcercises.chapter9;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

import lambdasexcercises.domain.Artist;

public class CompletableFutureArtistAnalyser implements ArtistAnalyzer {

	private final Function<String, Artist> artistLookupService;

	public CompletableFutureArtistAnalyser(Function<String, Artist> artistLookupService) {
		this.artistLookupService = artistLookupService;
	}

	@Override
	public void isLargerGroup(String artistName, String otherArtistName, Consumer<Boolean> handler) {
		CompletableFuture<Long> cf1 = CompletableFuture.supplyAsync(() -> getNumberOfMembers(artistName));
		CompletableFuture<Long> cf2 = CompletableFuture.supplyAsync(() -> getNumberOfMembers(otherArtistName));
		handler.accept(cf1.thenCombine(cf2, (length1, lenght2) -> length1 > lenght2).join());
	}

	private long getNumberOfMembers(String artistName) {
		return artistLookupService.apply(artistName).getMembers().count();
	}

}
