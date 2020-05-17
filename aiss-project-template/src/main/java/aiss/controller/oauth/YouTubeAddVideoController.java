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
import aiss.model.YouTubeGetList.ListIdGet;
import aiss.model.resources.GiantBombResource;
import aiss.model.resources.YouTubeListGetResource;
import aiss.model.resources.YouTubeListResource;

public class YouTubeAddVideoController extends HttpServlet {

   
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(YouTubeAddVideoController.class.getName());

  
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
       
    	
    	RequestDispatcher rd = null;
    	String accessToken = (String) req.getSession().getAttribute("YouTube-token");
        String cadenaIdVideo = req.getParameter("cadenaIdVideo");
        String cadenaIdLista = req.getParameter("cadenaIdLista");

		
	
		
		if (accessToken != null && !"".equals(accessToken)) {
            if (cadenaIdVideo != null && !"".equals(cadenaIdVideo)) {
                YouTubeListResource gdResource = new YouTubeListResource(accessToken);
                
                req.setAttribute("videoAdd", gdResource.insertFile(cadenaIdVideo, cadenaIdLista ));
				req.getRequestDispatcher("/redireccion.html").forward(req, resp); 
			}
            
           
        } else {
            log.info("Trying to access YouTube without an access token, redirecting to OAuth servlet");
            req.getRequestDispatcher("/AuthController/YouTube").forward(req, resp);
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
