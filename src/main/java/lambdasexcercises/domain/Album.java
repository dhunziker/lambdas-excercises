package lambdasexcercises.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Album {

	private String name;

	private Artist artist;

	private List<Track> tracks;

	public Album(String name, Artist artist, Track... tracks) {
		this.name = name;
		this.artist = artist;
		this.tracks = Arrays.asList(tracks);
	}

	public String getName() {
		return name;
	}

	public Artist getArtist() {
		return artist;
	}

	public Stream<Track> getTracks() {
		return tracks.stream();
	}

}
