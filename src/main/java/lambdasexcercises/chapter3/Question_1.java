package lambdasexcercises.chapter3;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

import lambdasexcercises.domain.Album;
import lambdasexcercises.domain.Artist;

public class Question_1 {

	public Integer addUp(Stream<Integer> numbers) {
		return numbers.reduce(0, (x, y) -> x + y);
	}

	public List<String> reduceArtists(List<Artist> artists) {
		return artists.stream().flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
				.collect(toList());
	}

	public List<Album> filterAlbums(List<Album> albums) {
		return albums.stream().filter(album -> album.getTracks().count() > 3).collect(toList());
	}

}
