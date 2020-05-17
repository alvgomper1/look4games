
package aiss.model.GiantBomb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "aliases",
    "api_detail_url",
    "date_added",
    "date_last_updated",
    "deck",
    "description",
    "expected_release_day",
    "expected_release_month",
    "expected_release_quarter",
    "expected_release_year",
    "guid",
    "id",
    "image",
    "image_tags",
    "name",
    "number_of_user_reviews",
    "original_game_rating",
    "original_release_date",
    "platforms",
    "site_detail_url",
    "resource_type"
})
public class Result {

    @JsonProperty("aliases")
    private Object aliases;
    @JsonProperty("api_detail_url")
    private String apiDetailUrl;
    @JsonProperty("date_added")
    private String dateAdded;
    @JsonProperty("date_last_updated")
    private String dateLastUpdated;
    @JsonProperty("deck")
    private String deck;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("expected_release_day")
    private Object expectedReleaseDay;
    @JsonProperty("expected_release_month")
    private Object expectedReleaseMonth;
    @JsonProperty("expected_release_quarter")
    private Object expectedReleaseQuarter;
    @JsonProperty("expected_release_year")
    private Object expectedReleaseYear;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("image_tags")
    private List<ImageTag> imageTags = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("number_of_user_reviews")
    private Integer numberOfUserReviews;
    @JsonProperty("original_game_rating")
    private Object originalGameRating;
    @JsonProperty("original_release_date")
    private String originalReleaseDate;
    @JsonProperty("platforms")
    private List<Platform> platforms = null;
    @JsonProperty("site_detail_url")
    private String siteDetailUrl;
    @JsonProperty("resource_type")
    private String resourceType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("aliases")
    public Object getAliases() {
        return aliases;
    }

    @JsonProperty("aliases")
    public void setAliases(Object aliases) {
        this.aliases = aliases;
    }

    @JsonProperty("api_detail_url")
    public String getApiDetailUrl() {
        return apiDetailUrl;
    }

    @JsonProperty("api_detail_url")
    public void setApiDetailUrl(String apiDetailUrl) {
        this.apiDetailUrl = apiDetailUrl;
    }

    @JsonProperty("date_added")
    public String getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("date_added")
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("date_last_updated")
    public String getDateLastUpdated() {
        return dateLastUpdated;
    }

    @JsonProperty("date_last_updated")
    public void setDateLastUpdated(String dateLastUpdated) {
        this.dateLastUpdated = dateLastUpdated;
    }

    @JsonProperty("deck")
    public String getDeck() {
        return deck;
    }

    @JsonProperty("deck")
    public void setDeck(String deck) {
        this.deck = deck;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("expected_release_day")
    public Object getExpectedReleaseDay() {
        return expectedReleaseDay;
    }

    @JsonProperty("expected_release_day")
    public void setExpectedReleaseDay(Object expectedReleaseDay) {
        this.expectedReleaseDay = expectedReleaseDay;
    }

    @JsonProperty("expected_release_month")
    public Object getExpectedReleaseMonth() {
        return expectedReleaseMonth;
    }

    @JsonProperty("expected_release_month")
    public void setExpectedReleaseMonth(Object expectedReleaseMonth) {
        this.expectedReleaseMonth = expectedReleaseMonth;
    }

    @JsonProperty("expected_release_quarter")
    public Object getExpectedReleaseQuarter() {
        return expectedReleaseQuarter;
    }

    @JsonProperty("expected_release_quarter")
    public void setExpectedReleaseQuarter(Object expectedReleaseQuarter) {
        this.expectedReleaseQuarter = expectedReleaseQuarter;
    }

    @JsonProperty("expected_release_year")
    public Object getExpectedReleaseYear() {
        return expectedReleaseYear;
    }

    @JsonProperty("expected_release_year")
    public void setExpectedReleaseYear(Object expectedReleaseYear) {
        this.expectedReleaseYear = expectedReleaseYear;
    }

    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    @JsonProperty("image_tags")
    public List<ImageTag> getImageTags() {
        return imageTags;
    }

    @JsonProperty("image_tags")
    public void setImageTags(List<ImageTag> imageTags) {
        this.imageTags = imageTags;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("number_of_user_reviews")
    public Integer getNumberOfUserReviews() {
        return numberOfUserReviews;
    }

    @JsonProperty("number_of_user_reviews")
    public void setNumberOfUserReviews(Integer numberOfUserReviews) {
        this.numberOfUserReviews = numberOfUserReviews;
    }

    @JsonProperty("original_game_rating")
    public Object getOriginalGameRating() {
        return originalGameRating;
    }

    @JsonProperty("original_game_rating")
    public void setOriginalGameRating(Object originalGameRating) {
        this.originalGameRating = originalGameRating;
    }

    @JsonProperty("original_release_date")
    public String getOriginalReleaseDate() {
        return originalReleaseDate;
    }

    @JsonProperty("original_release_date")
    public void setOriginalReleaseDate(String originalReleaseDate) {
        this.originalReleaseDate = originalReleaseDate;
    }

    @JsonProperty("platforms")
    public List<Platform> getPlatforms() {
        return platforms;
    }

    @JsonProperty("platforms")
    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    @JsonProperty("site_detail_url")
    public String getSiteDetailUrl() {
        return siteDetailUrl;
    }

    @JsonProperty("site_detail_url")
    public void setSiteDetailUrl(String siteDetailUrl) {
        this.siteDetailUrl = siteDetailUrl;
    }

    @JsonProperty("resource_type")
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty("resource_type")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
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
