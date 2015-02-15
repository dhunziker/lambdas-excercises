package lambdasexcercises.chapter4;

import java.util.List;
import java.util.Optional;

import lambdasexcercises.domain.Artist;

public class NewArtists {

	private List<Artist> artists;

	public NewArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public Optional<Artist> getArtists(int index) {
		if (index < 0 || index >= artists.size()) {
			return Optional.empty();
		}

		return Optional.of(artists.get(index));
	}

	public String getArtistName(int index) {
		Optional<Artist> artist = getArtists(index);
		return artist.map(x -> x.getName()).orElse("unknown");
	}

}
