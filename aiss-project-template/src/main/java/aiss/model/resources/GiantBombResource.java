package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.GiantBomb.GameSearch;



public class GiantBombResource {

	private static final String GIANTBOMB_API_KEY = "838c5f5111d3e0a1f425e99d75092b2b7b352846";  // TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(GiantBombResource.class.getName());
	
	public GameSearch getSearch(String query) throws UnsupportedEncodingException {

		// TODO: Perform search in Twitch
		// https://www.giantbomb.com/api/search/?api_key=838c5f5111d3e0a1f425e99d75092b2b7b352846&format=json&query=Galactic Attack

		
		String nombre = URLEncoder.encode(query, "UTF-8");		
		String uri = "https://www.giantbomb.com/api/search/?api_key="+GIANTBOMB_API_KEY+"&format=json&query="+nombre+"&resources=game&limit=1";	
		
		log.log(Level.FINE, "URI:" + uri);
		
		ClientResource cr = new ClientResource(uri); 	// Almacena info devuelta en formato JSON
		GameSearch gs = cr.get(GameSearch.class);		// Almacena la misma info pero en formato JAVA
		
		return gs;
	}
}
