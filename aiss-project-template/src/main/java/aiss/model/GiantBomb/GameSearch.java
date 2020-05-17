
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
    "error",
    "limit",
    "offset",
    "number_of_page_results",
    "number_of_total_results",
    "status_code",
    "results",
    "version"
})
public class GameSearch {

    @JsonProperty("error")
    private String error;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("number_of_page_results")
    private Integer numberOfPageResults;
    @JsonProperty("number_of_total_results")
    private Integer numberOfTotalResults;
    @JsonProperty("status_code")
    private Integer statusCode;
    @JsonProperty("results")
    private List<Result> results = null;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("error")
    public String getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("number_of_page_results")
    public Integer getNumberOfPageResults() {
        return numberOfPageResults;
    }

    @JsonProperty("number_of_page_results")
    public void setNumberOfPageResults(Integer numberOfPageResults) {
        this.numberOfPageResults = numberOfPageResults;
    }

    @JsonProperty("number_of_total_results")
    public Integer getNumberOfTotalResults() {
        return numberOfTotalResults;
    }

    @JsonProperty("number_of_total_results")
    public void setNumberOfTotalResults(Integer numberOfTotalResults) {
        this.numberOfTotalResults = numberOfTotalResults;
    }

    @JsonProperty("status_code")
    public Integer getStatusCode() {
        return statusCode;
    }

    @JsonProperty("status_code")
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
