package aiss.controller.oauth;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.GiantBomb.GameSearch;
import aiss.model.Twitch.VideoSearch;
import aiss.model.Walmart.WalmartSearch;
import aiss.model.Youtube.VideoYtSearch;
import aiss.model.resources.GiantBombResource;
import aiss.model.resources.TwitchResource;
import aiss.model.resources.WalmartResource;
import aiss.model.resources.YouTubeListGetResource;
import aiss.model.resources.YouTubeResource;



/**
 * Servlet implementation class SearchController
 */
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(SearchController.class.getName());
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String query = request.getParameter("searchQuery");
		RequestDispatcher rd = null;
		String accessToken = (String) request.getSession().getAttribute("YouTube-token");
		
		
			YouTubeListGetResource lista = new YouTubeListGetResource(accessToken);
			
			rd = request.getRequestDispatcher("/success.jsp");
			request.setAttribute("listaVideos", lista.getIdLista().getItems());
			

                
			
			
    
		
       

		log.log(Level.FINE, "Searching for games that contain " + query);
		GiantBombResource giantBomb = new GiantBombResource();
		
		GameSearch giantBombResults = giantBomb.getSearch(query);
		

		if (giantBombResults!=null){
			
			
			rd = request.getRequestDispatcher("/success.jsp");
			request.setAttribute("games", giantBombResults.getResults().get(0));
			
			if (giantBombResults.getResults().get(0).getOriginalReleaseDate()!=null) {
			String[] partes =giantBombResults.getResults().get(0).getOriginalReleaseDate().split(" ");
			request.setAttribute("fechaJuego", partes[0]);
			}
			 
			else {
				request.setAttribute("fechaJuego", "No especificada");
			}
			
			
			
			if(giantBombResults.getResults().get(0).getPlatforms()!=null) {
			request.setAttribute("plataformaJuego", giantBombResults.getResults().get(0).getPlatforms().stream().map(x -> x.getName()).collect(Collectors.toList()));
			}
			else {
				request.setAttribute("plataformaJuego","No especificadas");
			}
			
			
			
		} else {
			log.log(Level.SEVERE, "giantBomb object: " + giantBombResults);
			rd = request.getRequestDispatcher("/error.jsp");
		}
	
	
	log.log(Level.FINE, "Searching for videos that contain " + query);
	TwitchResource twitch = new TwitchResource();
	
	VideoSearch twitchResults = twitch.getVideoSearch(query);

	if (twitchResults!=null){
		rd = request.getRequestDispatcher("/success.jsp");
		if(twitchResults.getStreams().stream().filter(x->x.getGame().contains(query)).count()>0) {
			request.setAttribute("videos", twitchResults.getStreams().stream().filter(x->x.getGame().contains(query)).findFirst().get().getChannel().getName());
		}
		
		else {
		request.setAttribute("videos", twitchResults.getStreams().get(0).getChannel().getName());	}	
	} else {
		log.log(Level.SEVERE, "twitch object: " + twitchResults);
		String res = "No hay ningun directo con la cadena de texto que ha introducido, intentelo con otra :(";
		rd = request.getRequestDispatcher("/success.jsp");
		 request.setAttribute("errorVideoTwitch",res);
	}
	
	log.log(Level.FINE, "Searching for products that contain " + query);
	WalmartResource walmart = new WalmartResource();
	
	WalmartSearch walmartResults = walmart.getWalmartSearch(query);

	if (walmartResults!=null){
		
		
		if (walmartResults.getItems().stream().filter(x -> x.getCategoryPath().contains("Games")).count() >0) {
			
			
			rd = request.getRequestDispatcher("/success.jsp");
			request.setAttribute("producto", walmartResults.getItems().stream().filter(x -> x.getCategoryPath().contains("Game")).findFirst().get().getProductUrl());	
		}
		else {request.setAttribute("producto", walmartResults.getItems().get(0).getProductUrl());
		}	
	
	
	} else {
		String res = "No hay ningun producto relacionado con el juego introducido ";
		log.log(Level.SEVERE, "walmart object: " + walmartResults);
		rd = request.getRequestDispatcher("/success.jsp");
		request.setAttribute("errorProducto",res);
	}
	
	
	
	
	log.log(Level.FINE, "Searching for videos that contain " + query);
	YouTubeResource yt = new YouTubeResource();
	
	VideoYtSearch ytResults = yt.getVideo(query);

	if (ytResults!=null){
		rd = request.getRequestDispatcher("/success.jsp");
		
			request.setAttribute("ytVideo1", ytResults.getItems().get(0).getId().getVideoId());
			request.setAttribute("ytVideo2", ytResults.getItems().get(1).getId().getVideoId());
		}
		
	
		
	
	
	
	
	rd.forward(request, response);
	
	}

	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

	
	
}
