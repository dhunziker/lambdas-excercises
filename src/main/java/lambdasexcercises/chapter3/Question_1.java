package lambdasexcercises.chapter3;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

import lambdasexcercises.domain.Album;
import lambdasexcercises.domain.Artist;

public class Question_1 {

	public static int addUp(Stream<Integer> numbers) {
		return numbers.reduce(0, (x, y) -> x + y);
	}

	public static List<String> getNamesAndOrigins(List<Artist> artists) {
		return artists.stream().flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
				.collect(toList());
	}

	public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> albums) {
		return albums.stream().filter(album -> album.getTracks().count() > 3).collect(toList());
	}

}
