package lambdasexcercises.domain;

import java.util.List;
import java.util.stream.Stream;

public class Album {

	private String name;

	private List<Track> tracks;

	private List<Artist> artists;

	public Album(String name, List<Track> tracks, List<Artist> artists) {
		this.name = name;
		this.tracks = tracks;
		this.artists = artists;
	}

	public String getName() {
		return name;
	}

	public Stream<Track> getTracks() {
		return tracks.stream();
	}

	public Stream<Artist> getArtists() {
		return artists.stream();
	}

}
