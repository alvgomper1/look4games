
package aiss.model.GiantBomb;

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
    "icon_url",
    "medium_url",
    "screen_url",
    "screen_large_url",
    "small_url",
    "super_url",
    "thumb_url",
    "tiny_url",
    "original_url",
    "image_tags"
})
public class Image {

    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("medium_url")
    private String mediumUrl;
    @JsonProperty("screen_url")
    private String screenUrl;
    @JsonProperty("screen_large_url")
    private String screenLargeUrl;
    @JsonProperty("small_url")
    private String smallUrl;
    @JsonProperty("super_url")
    private String superUrl;
    @JsonProperty("thumb_url")
    private String thumbUrl;
    @JsonProperty("tiny_url")
    private String tinyUrl;
    @JsonProperty("original_url")
    private String originalUrl;
    @JsonProperty("image_tags")
    private String imageTags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("icon_url")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("icon_url")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("medium_url")
    public String getMediumUrl() {
        return mediumUrl;
    }

    @JsonProperty("medium_url")
    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }

    @JsonProperty("screen_url")
    public String getScreenUrl() {
        return screenUrl;
    }

    @JsonProperty("screen_url")
    public void setScreenUrl(String screenUrl) {
        this.screenUrl = screenUrl;
    }

    @JsonProperty("screen_large_url")
    public String getScreenLargeUrl() {
        return screenLargeUrl;
    }

    @JsonProperty("screen_large_url")
    public void setScreenLargeUrl(String screenLargeUrl) {
        this.screenLargeUrl = screenLargeUrl;
    }

    @JsonProperty("small_url")
    public String getSmallUrl() {
        return smallUrl;
    }

    @JsonProperty("small_url")
    public void setSmallUrl(String smallUrl) {
        this.smallUrl = smallUrl;
    }

    @JsonProperty("super_url")
    public String getSuperUrl() {
        return superUrl;
    }

    @JsonProperty("super_url")
    public void setSuperUrl(String superUrl) {
        this.superUrl = superUrl;
    }

    @JsonProperty("thumb_url")
    public String getThumbUrl() {
        return thumbUrl;
    }

    @JsonProperty("thumb_url")
    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    @JsonProperty("tiny_url")
    public String getTinyUrl() {
        return tinyUrl;
    }

    @JsonProperty("tiny_url")
    public void setTinyUrl(String tinyUrl) {
        this.tinyUrl = tinyUrl;
    }

    @JsonProperty("original_url")
    public String getOriginalUrl() {
        return originalUrl;
    }

    @JsonProperty("original_url")
    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    @JsonProperty("image_tags")
    public String getImageTags() {
        return imageTags;
    }

    @JsonProperty("image_tags")
    public void setImageTags(String imageTags) {
        this.imageTags = imageTags;
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
