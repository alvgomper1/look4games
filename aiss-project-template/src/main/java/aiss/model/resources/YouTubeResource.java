package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.Youtube.VideoYtSearch;


public class YouTubeResource {

	private static final Logger log = Logger.getLogger(YouTubeResource.class.getName());
	//https://www.googleapis.com/youtube/v3/search?part=snippet&order=viewCount&q=fortnite&type=video&key=AIzaSyCMSAS4B8tKvdgmXjreHPp8Elk6JRtUuIs
	private static final String APIKEY = "AIzaSyCMSAS4B8tKvdgmXjreHPp8Elk6JRtUuIs";
	  
			

	

	public VideoYtSearch getVideo(String param) throws UnsupportedEncodingException {
		String query = URLEncoder.encode(param, "UTF-8");
		String uri = "https://www.googleapis.com/youtube/v3/search?part=snippet&q="+query+"&type=video&key="+APIKEY;
		
		// https://www.googleapis.com/youtube/v3/playlists?part=snippet&mine=true&key=AIzaSyCMSAS4B8tKvdgmXjreHPp8Elk6JRtUuIs
		
		
		log.log(Level.FINE, "URI:" + uri);
		
		
		ClientResource cr = new ClientResource(uri); 	// Almacena info devuelta en formato JSON
		VideoYtSearch vys = cr.get(VideoYtSearch.class);		// Almacena la misma info pero en formato JAVA
		
		return vys;
	}

	

}