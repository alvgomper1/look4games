package aiss.model.resources;



import org.restlet.resource.ClientResource;

import aiss.model.YouTubeAddToList.ResourceId;
import aiss.model.YouTubeAddToList.Snippet;
import aiss.model.YouTubeAddToList.VideoItemList;



public class YouTubeListResource {

    private final String access_token;
    private final String uri = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&access_token=";


    public YouTubeListResource(String access_token) {
        this.access_token = access_token;
    }

	
    public boolean insertFile(String cadenaIdVideo, String cadenaIdLista) {
    	
    	
    	VideoItemList playlistItem = new VideoItemList();
    	Snippet snippet = new Snippet();
    	ResourceId resourceId = new ResourceId();
    	snippet.setPlaylistId(cadenaIdLista); //"PLu-q7YXucte4R-_8aiYcxoUuFYQF42yeS"
    	resourceId.setKind("youtube#video");
        resourceId.setVideoId(cadenaIdVideo); //"aSjflT_J0Xo"
    	snippet.setResourceId(resourceId);
    	playlistItem.setSnippet(snippet);
        ClientResource cr = null;
        cr = new ClientResource(uri  + access_token); //POST https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&key=[YOUR_API_KEY] 

        cr.post(playlistItem, VideoItemList.class);
        return true;
    }

    

   

   

}
