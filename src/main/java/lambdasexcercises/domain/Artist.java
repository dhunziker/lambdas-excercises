package lambdasexcercises.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Artist {

	private String name;

	private String nationality;

	private List<Artist> members;

	public Artist(String name, String nationality) {
		this.name = name;
		this.nationality = nationality;
	}

	public Artist(String name, String nationality, Artist... members) {
		this(name, nationality);
		this.members = Arrays.asList(members);
	}

	public String getName() {
		return name;
	}

	public String getNationality() {
		return nationality;
	}

	public Stream<Artist> getMembers() {
		return members.stream();
	}

}
