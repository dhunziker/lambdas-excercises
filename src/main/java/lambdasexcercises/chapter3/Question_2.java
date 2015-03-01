package lambdasexcercises.chapter3;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingInt;

import java.util.List;
import java.util.stream.Stream;

import lambdasexcercises.domain.Artist;

public class Question_2 {

	public static int externalIteration(List<Artist> artists) {
		int totalMembers = 0;
		for (Artist artist : artists) {
			Stream<Artist> members = artist.getMembers();
			totalMembers += members.count();
		}
		return totalMembers;
	}

	public static int countBandMembersInternalMap(List<Artist> artists) {
		return artists.stream().map(Artist::getMembers).collect(summingInt(members -> (int) members.count()));
	}

	public static int countBandMembersInternalFlatMap(List<Artist> artists) {
		return artists.stream().flatMap(Artist::getMembers).collect(counting()).intValue();
	}

}
