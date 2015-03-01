package lambdasexcercises.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Artist {

	private String name;

	private List<Artist> members;

	private String nationality;

	public Artist(String name, String nationality) {
		this(name, Collections.emptyList(), nationality);
	}

	public Artist(String name, List<Artist> members, String nationality) {
		this.name = name;
		this.members = new ArrayList<>(members);
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public Stream<Artist> getMembers() {
		return members.stream();
	}

	public String getNationality() {
		return nationality;
	}

	public int length() {
		return name.length();
	}

}
