
package aiss.model.Walmart;

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
    "thumbnailImage",
    "mediumImage",
    "largeImage",
    "entityType"
})
public class ImageEntity {

    @JsonProperty("thumbnailImage")
    private String thumbnailImage;
    @JsonProperty("mediumImage")
    private String mediumImage;
    @JsonProperty("largeImage")
    private String largeImage;
    @JsonProperty("entityType")
    private String entityType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("thumbnailImage")
    public String getThumbnailImage() {
        return thumbnailImage;
    }

    @JsonProperty("thumbnailImage")
    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    @JsonProperty("mediumImage")
    public String getMediumImage() {
        return mediumImage;
    }

    @JsonProperty("mediumImage")
    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    @JsonProperty("largeImage")
    public String getLargeImage() {
        return largeImage;
    }

    @JsonProperty("largeImage")
    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
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
