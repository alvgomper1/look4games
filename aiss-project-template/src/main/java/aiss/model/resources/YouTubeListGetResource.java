
package aiss.model.resources;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.YouTubeGetList.ListIdGet;

public class YouTubeListGetResource {

	private static final Logger log = Logger.getLogger(YouTubeListGetResource.class.getName());
	
	private final String access_token;
	private final String uri= "https://www.googleapis.com/youtube/v3/playlists?part=snippet&mine=true&access_token=";
	 public YouTubeListGetResource(String access_token) {
	        this.access_token = access_token;
	    }

	public ListIdGet getIdLista( ) throws UnsupportedEncodingException {
	
		log.log(Level.FINE, "URI:" + uri);
		
		
		ClientResource cr = new ClientResource(uri + access_token); 	// Almacena info devuelta en formato JSON
		ListIdGet lig = cr.get(ListIdGet.class);		// Almacena la misma info pero en formato JAVA
		
		return lig;
	}

	

}