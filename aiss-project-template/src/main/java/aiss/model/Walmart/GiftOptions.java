
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
    "allowGiftWrap",
    "allowGiftMessage",
    "allowGiftReceipt"
})
public class GiftOptions {

    @JsonProperty("allowGiftWrap")
    private Boolean allowGiftWrap;
    @JsonProperty("allowGiftMessage")
    private Boolean allowGiftMessage;
    @JsonProperty("allowGiftReceipt")
    private Boolean allowGiftReceipt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("allowGiftWrap")
    public Boolean getAllowGiftWrap() {
        return allowGiftWrap;
    }

    @JsonProperty("allowGiftWrap")
    public void setAllowGiftWrap(Boolean allowGiftWrap) {
        this.allowGiftWrap = allowGiftWrap;
    }

    @JsonProperty("allowGiftMessage")
    public Boolean getAllowGiftMessage() {
        return allowGiftMessage;
    }

    @JsonProperty("allowGiftMessage")
    public void setAllowGiftMessage(Boolean allowGiftMessage) {
        this.allowGiftMessage = allowGiftMessage;
    }

    @JsonProperty("allowGiftReceipt")
    public Boolean getAllowGiftReceipt() {
        return allowGiftReceipt;
    }

    @JsonProperty("allowGiftReceipt")
    public void setAllowGiftReceipt(Boolean allowGiftReceipt) {
        this.allowGiftReceipt = allowGiftReceipt;
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
