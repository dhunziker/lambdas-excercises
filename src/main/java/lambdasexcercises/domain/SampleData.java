package lambdasexcercises.domain;

import static java.util.Arrays.asList;

import java.util.List;

public class SampleData {

	// Kings Of Leon
	public static final List<Artist> KINGS_OF_LEON_MEMBERS = asList(
			new Artist("Caleb Followill", "Nashville"),
			new Artist("Matthew Followill", "Nashville"),
			new Artist("Jared Followill", "Nashville"),
			new Artist("Nathan Followill", "Nashville"));

	public static final Artist KINGS_OF_LEON = new Artist("Kings of Leon", KINGS_OF_LEON_MEMBERS, "Nashville");

	public static final Album YOUNG_AND_YOUNG_MANHOOD = new Album("Youth & Young Manhood", asList(
			new Track("Red Morning Light", 180),
			new Track("Happy Alone", 239),
			new Track("Wasted Time", 166),
			new Track("Joe's Head", 201),
			new Track("Trani", 300)),
			asList(KINGS_OF_LEON));

	// The Beatles
	public static final List<Artist> THE_BEATLES_MEMBERS = asList(
			new Artist("John Lennon", "Liverpool"),
			new Artist("Paul McCartney", "Liverpool"),
			new Artist("George Harrison", "Liverpool"),
			new Artist("Ringo Starr", "Liverpool"));

	public static final Artist THE_BEATLES = new Artist("The Beatles", THE_BEATLES_MEMBERS, "Liverpool");

	public static final Album PLEASE_PLEASE_ME = new Album("Please Please Me", asList(
			new Track("I Saw Her Standing There", 174),
			new Track("Misery", 110)),
			asList(THE_BEATLES));

}
