package lambdasexcercises.chapter4;

import java.util.stream.Stream;

import lambdasexcercises.domain.Artist;

// Answer to question 1.1 of chapter 4
public interface Performance {

	public String getName();

	public Stream<Artist> getMusicians();

	default Stream<Artist> getAllMusicians() {
		return getMusicians().flatMap(musician -> Stream.concat(Stream.of(musician), musician.getMembers()));
	}

	// Answers to question 1.2

	// A default method cannot override a method from java.lang.Object
	// default int hashCode() {
	// return 1;
	// }

	// A default method cannot override a method from java.lang.Object
	// default boolean equals(Object obj) {
	// return true;
	// }

}
