package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.Twitch.VideoSearch;

public class TwitchTest {

	@Test
	public void getStreamsTest() throws UnsupportedEncodingException {
		String title = "Fortnite";
		TwitchResource video = new TwitchResource();
		VideoSearch twitchResults = video.getVideoSearch(title);
		
		assertNotNull("The search returned null", twitchResults);
		assertNotNull("The search returned null", twitchResults.getStreams());
		assertFalse("The number of streams of " + title + " is zero", twitchResults.getStreams().size()==0);
		
		System.out.println("The search for " + title + "'s streams returned " + twitchResults.getStreams().size() + " videos.");
		
	
	
	}

}
