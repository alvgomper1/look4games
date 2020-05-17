package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.Twitch.VideoSearch;


public class TwitchResource {

	private static final String TWITCH_API_KEY = "qo78tzm95kcgjslqoy93064dnjkmkj";  // TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(TwitchResource.class.getName());
	
	public VideoSearch getVideoSearch(String query) throws UnsupportedEncodingException {

		// https://api.twitch.tv/kraken/streams/?game=fortnite&client_id=qo78tzm95kcgjslqoy93064dnjkmkj&limit=1
		// https://api.twitch.tv/kraken/search/streams?query=counter&client_id=qo78tzm95kcgjslqoy93064dnjkmkj&limit=   (definitiva)
		
		String name = URLEncoder.encode(query, "UTF-8");		
		String uri = "https://api.twitch.tv/kraken/search/streams?query="+name+"&client_id="+TWITCH_API_KEY;	
		
		log.log(Level.FINE, "URI:" + uri);
		
		ClientResource cr = new ClientResource(uri); 	// Almacena info devuelta en formato JSON
		VideoSearch vs = cr.get(VideoSearch.class);		// Almacena la misma info pero en formato JAVA
		
		return vs;
	}
}
