
package aiss.model.Twitch;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "game",
    "viewers",
    "video_height",
    "average_fps",
    "delay",
    "created_at",
    "is_playlist",
    "stream_type",
    "preview",
    "channel",
    "_links"
})
public class Stream {

    @JsonProperty("_id")
    private Long id;
    @JsonProperty("game")
    private String game;
    @JsonProperty("viewers")
    private Integer viewers;
    @JsonProperty("video_height")
    private Integer videoHeight;
    @JsonProperty("average_fps")
    private Integer averageFps;
    @JsonProperty("delay")
    private Integer delay;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("is_playlist")
    private Boolean isPlaylist;
    @JsonProperty("stream_type")
    private String streamType;
    @JsonProperty("preview")
    private Preview preview;
    @JsonProperty("channel")
    private Channel channel;
    @JsonProperty("_links")
    private Links__ links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public Long getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("game")
    public String getGame() {
        return game;
    }

    @JsonProperty("game")
    public void setGame(String game) {
        this.game = game;
    }

    @JsonProperty("viewers")
    public Integer getViewers() {
        return viewers;
    }

    @JsonProperty("viewers")
    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }

    @JsonProperty("video_height")
    public Integer getVideoHeight() {
        return videoHeight;
    }

    @JsonProperty("video_height")
    public void setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
    }

    @JsonProperty("average_fps")
    public Integer getAverageFps() {
        return averageFps;
    }

    @JsonProperty("average_fps")
    public void setAverageFps(Integer averageFps) {
        this.averageFps = averageFps;
    }

    @JsonProperty("delay")
    public Integer getDelay() {
        return delay;
    }

    @JsonProperty("delay")
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("is_playlist")
    public Boolean getIsPlaylist() {
        return isPlaylist;
    }

    @JsonProperty("is_playlist")
    public void setIsPlaylist(Boolean isPlaylist) {
        this.isPlaylist = isPlaylist;
    }

    @JsonProperty("stream_type")
    public String getStreamType() {
        return streamType;
    }

    @JsonProperty("stream_type")
    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    @JsonProperty("preview")
    public Preview getPreview() {
        return preview;
    }

    @JsonProperty("preview")
    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    @JsonProperty("channel")
    public Channel getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @JsonProperty("_links")
    public Links__ getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links__ links) {
        this.links = links;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
