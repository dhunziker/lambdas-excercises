package lambdasexcercises.chapter4;

import static com.insightfullogic.lambdabehave.Suite.describe;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

import lambdasexcercises.domain.Artist;

@RunWith(JunitSuiteRunner.class)
public class NewArtists_Spec {{

	List<Artist> kingsOfLeon = Arrays.asList(
			new Artist("Caleb Followill", "Nashville"),
			new Artist("Matthew Followill", "Nashville"),
			new Artist("Jared Followill", "Nashville"),
			new Artist("Nathan Followill", "Nashville"));
	
	NewArtists newArtists = new NewArtists(kingsOfLeon);
	
	describe("artists new", it -> {
		it.should("find Jared Followill", expect -> {
			expect.that(newArtists.getArtistName(2)).is("Jared Followill");
		});
		
		it.should("not find negative index", expect -> {
			expect.that(newArtists.getArtistName(-1)).is("unknown");
		});
		
		it.should("not find invalid index", expect -> {
			expect.that(newArtists.getArtistName(kingsOfLeon.size())).is("unknown");
		});
	});

}}
