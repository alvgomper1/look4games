package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.Walmart.WalmartSearch;

public class WalmartTest {

	
	
	@Test
	public void getProductsTest() throws UnsupportedEncodingException {
		
		String title = "Fortnite";
		WalmartResource wr = new WalmartResource();
		WalmartSearch ws = wr.getWalmartSearch(title);
		
		assertNotNull("The search returned null", ws);
		assertNotNull("The search returned null", ws.getItems());
		assertFalse("The number of products of " + title + " is zero", ws.getItems().size()==0);
		System.out.println("The search for " + title + " returned " + ws.getItems().size() + " products.");

	}
	
}
