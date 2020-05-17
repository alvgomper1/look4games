package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;


import aiss.model.Walmart.WalmartSearch;



public class WalmartResource {

	private static final String WALMART_API_KEY = "52svmzhghxhn36ntxmugm3ab";  // TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(WalmartResource.class.getName());
	
	public WalmartSearch getWalmartSearch(String query) throws UnsupportedEncodingException {

		// TODO: Perform search in Twitch
		// http://api.walmartlabs.com/v1/search?query=fortnite&format=json&apiKey=52svmzhghxhn36ntxmugm3ab


		
		String nombre = URLEncoder.encode(query, "UTF-8");		
		String uri = "http://api.walmartlabs.com/v1/search?query="+nombre+"&format=json&apiKey="+WALMART_API_KEY;
					
		
		log.log(Level.FINE, "URI:" + uri);
		
		ClientResource cr = new ClientResource(uri); 	// Almacena info devuelta en formato JSON
		WalmartSearch ws = cr.get(WalmartSearch.class);		// Almacena la misma info pero en formato JAVA
		
		return ws;
	}
}
