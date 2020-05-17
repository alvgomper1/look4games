package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.Youtube.VideoYtSearch;

public class YouTubeTest {

	
	
	@Test
	public void getVideosTest() throws UnsupportedEncodingException {
		
		String title = "Fortnite";
		YouTubeResource yr = new YouTubeResource();
		VideoYtSearch vys = yr.getVideo(title);
		
		assertNotNull("The search returned null", vys); 
		assertNotNull("The search returned null", vys.getItems());
		assertFalse("The number of videos of " + title + " is zero", vys.getItems().size()==0);
		System.out.println("The search for " + title + "'s videos returned " + vys.getItems().size() + " videos.");

	}
	
}
