package lambdasexcercises.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Artist {

	private String name;

	private String nationality;

	private List<Artist> members;

	public Artist(String name, String nationality) {
		this(name, nationality, new ArrayList<>());
	}

	public Artist(String name, String nationality, List<Artist> members) {
		this.name = name;
		this.nationality = nationality;
		this.members = members;
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
