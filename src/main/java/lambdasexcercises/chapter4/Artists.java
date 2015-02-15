package lambdasexcercises.chapter4;

import java.util.List;

import lambdasexcercises.domain.Artist;

public class Artists {

	private List<Artist> artists;

	public Artists(List<Artist> artists) {
		this.artists = artists;
	}

	public Artist getArtists(int index) {
		if (index < 0 || index >= artists.size()) {
			indexException(index);
		}
		return artists.get(index);
	}

	private void indexException(int index) {
		throw new IllegalArgumentException(index + " doesn't correspond to an artist");
	}

	public String getArtistName(int index) {
		try {
			Artist artist = getArtists(index);
			return artist.getName();
		} catch (IllegalArgumentException e) {
			return "unknown";
		}
	}

}
