package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.GiantBomb.GameSearch;

public class GiantBombTest {

	
	
	@Test
	public void getGameTest() throws UnsupportedEncodingException {
		
		String title = "Fortnite";
		GiantBombResource gbr = new GiantBombResource();
		GameSearch gs = gbr.getSearch(title);
		
		assertNotNull("The search returned null", gs);
		assertNotNull("The search returned null", gs.getResults());
		assertFalse("The number of games of " + title + " is zero", gs.getNumberOfTotalResults()==0);
		
		System.out.println("The search for " + title + " returned " + gs.getNumberOfTotalResults() + " games.");

		
	}
	
}
