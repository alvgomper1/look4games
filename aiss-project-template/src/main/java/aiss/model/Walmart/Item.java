
package aiss.model.Walmart;

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
    "itemId",
    "parentItemId",
    "name",
    "msrp",
    "salePrice",
    "upc",
    "categoryPath",
    "longDescription",
    "brandName",
    "thumbnailImage",
    "mediumImage",
    "largeImage",
    "productTrackingUrl",
    "ninetySevenCentShipping",
    "standardShipRate",
    "color",
    "marketplace",
    "shipToStore",
    "freeShipToStore",
    "modelNumber",
    "productUrl",
    "customerRating",
    "customerRatingImage",
    "categoryNode",
    "rollBack",
    "bundle",
    "clearance",
    "stock",
    "attributes",
    "addToCartUrl",
    "affiliateAddToCartUrl",
    "freeShippingOver35Dollars",
    "giftOptions",
    "imageEntities",
    "offerType",
    "shippingPassEligible",
    "availableOnline"
})
public class Item {

    @JsonProperty("itemId")
    private Integer itemId;
    @JsonProperty("parentItemId")
    private Integer parentItemId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("msrp")
    private Integer msrp;
    @JsonProperty("salePrice")
    private Integer salePrice;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("categoryPath")
    private String categoryPath;
    @JsonProperty("longDescription")
    private String longDescription;
    @JsonProperty("brandName")
    private String brandName;
    @JsonProperty("thumbnailImage")
    private String thumbnailImage;
    @JsonProperty("mediumImage")
    private String mediumImage;
    @JsonProperty("largeImage")
    private String largeImage;
    @JsonProperty("productTrackingUrl")
    private String productTrackingUrl;
    @JsonProperty("ninetySevenCentShipping")
    private Boolean ninetySevenCentShipping;
    @JsonProperty("standardShipRate")
    private Integer standardShipRate;
    @JsonProperty("color")
    private String color;
    @JsonProperty("marketplace")
    private Boolean marketplace;
    @JsonProperty("shipToStore")
    private Boolean shipToStore;
    @JsonProperty("freeShipToStore")
    private Boolean freeShipToStore;
    @JsonProperty("modelNumber")
    private String modelNumber;
    @JsonProperty("productUrl")
    private String productUrl;
    @JsonProperty("customerRating")
    private String customerRating;
    @JsonProperty("customerRatingImage")
    private String customerRatingImage;
    @JsonProperty("categoryNode")
    private String categoryNode;
    @JsonProperty("rollBack")
    private Boolean rollBack;
    @JsonProperty("bundle")
    private Boolean bundle;
    @JsonProperty("clearance")
    private Boolean clearance;
    @JsonProperty("stock")
    private String stock;
    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonProperty("addToCartUrl")
    private String addToCartUrl;
    @JsonProperty("affiliateAddToCartUrl")
    private String affiliateAddToCartUrl;
    @JsonProperty("freeShippingOver35Dollars")
    private Boolean freeShippingOver35Dollars;
    @JsonProperty("giftOptions")
    private GiftOptions giftOptions;
    @JsonProperty("imageEntities")
    private List<ImageEntity> imageEntities = null;
    @JsonProperty("offerType")
    private String offerType;
    @JsonProperty("shippingPassEligible")
    private Boolean shippingPassEligible;
    @JsonProperty("availableOnline")
    private Boolean availableOnline;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("itemId")
    public Integer getItemId() {
        return itemId;
    }

    @JsonProperty("itemId")
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("parentItemId")
    public Integer getParentItemId() {
        return parentItemId;
    }

    @JsonProperty("parentItemId")
    public void setParentItemId(Integer parentItemId) {
        this.parentItemId = parentItemId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("msrp")
    public Integer getMsrp() {
        return msrp;
    }

    @JsonProperty("msrp")
    public void setMsrp(Integer msrp) {
        this.msrp = msrp;
    }

    @JsonProperty("salePrice")
    public Integer getSalePrice() {
        return salePrice;
    }

    @JsonProperty("salePrice")
    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("categoryPath")
    public String getCategoryPath() {
        return categoryPath;
    }

    @JsonProperty("categoryPath")
    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    @JsonProperty("longDescription")
    public String getLongDescription() {
        return longDescription;
    }

    @JsonProperty("longDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @JsonProperty("brandName")
    public String getBrandName() {
        return brandName;
    }

    @JsonProperty("brandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

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

    @JsonProperty("productTrackingUrl")
    public String getProductTrackingUrl() {
        return productTrackingUrl;
    }

    @JsonProperty("productTrackingUrl")
    public void setProductTrackingUrl(String productTrackingUrl) {
        this.productTrackingUrl = productTrackingUrl;
    }

    @JsonProperty("ninetySevenCentShipping")
    public Boolean getNinetySevenCentShipping() {
        return ninetySevenCentShipping;
    }

    @JsonProperty("ninetySevenCentShipping")
    public void setNinetySevenCentShipping(Boolean ninetySevenCentShipping) {
        this.ninetySevenCentShipping = ninetySevenCentShipping;
    }

    @JsonProperty("standardShipRate")
    public Integer getStandardShipRate() {
        return standardShipRate;
    }

    @JsonProperty("standardShipRate")
    public void setStandardShipRate(Integer standardShipRate) {
        this.standardShipRate = standardShipRate;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("marketplace")
    public Boolean getMarketplace() {
        return marketplace;
    }

    @JsonProperty("marketplace")
    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }

    @JsonProperty("shipToStore")
    public Boolean getShipToStore() {
        return shipToStore;
    }

    @JsonProperty("shipToStore")
    public void setShipToStore(Boolean shipToStore) {
        this.shipToStore = shipToStore;
    }

    @JsonProperty("freeShipToStore")
    public Boolean getFreeShipToStore() {
        return freeShipToStore;
    }

    @JsonProperty("freeShipToStore")
    public void setFreeShipToStore(Boolean freeShipToStore) {
        this.freeShipToStore = freeShipToStore;
    }

    @JsonProperty("modelNumber")
    public String getModelNumber() {
        return modelNumber;
    }

    @JsonProperty("modelNumber")
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @JsonProperty("productUrl")
    public String getProductUrl() {
        return productUrl;
    }

    @JsonProperty("productUrl")
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    @JsonProperty("customerRating")
    public String getCustomerRating() {
        return customerRating;
    }

    @JsonProperty("customerRating")
    public void setCustomerRating(String customerRating) {
        this.customerRating = customerRating;
    }

    @JsonProperty("customerRatingImage")
    public String getCustomerRatingImage() {
        return customerRatingImage;
    }

    @JsonProperty("customerRatingImage")
    public void setCustomerRatingImage(String customerRatingImage) {
        this.customerRatingImage = customerRatingImage;
    }

    @JsonProperty("categoryNode")
    public String getCategoryNode() {
        return categoryNode;
    }

    @JsonProperty("categoryNode")
    public void setCategoryNode(String categoryNode) {
        this.categoryNode = categoryNode;
    }

    @JsonProperty("rollBack")
    public Boolean getRollBack() {
        return rollBack;
    }

    @JsonProperty("rollBack")
    public void setRollBack(Boolean rollBack) {
        this.rollBack = rollBack;
    }

    @JsonProperty("bundle")
    public Boolean getBundle() {
        return bundle;
    }

    @JsonProperty("bundle")
    public void setBundle(Boolean bundle) {
        this.bundle = bundle;
    }

    @JsonProperty("clearance")
    public Boolean getClearance() {
        return clearance;
    }

    @JsonProperty("clearance")
    public void setClearance(Boolean clearance) {
        this.clearance = clearance;
    }

    @JsonProperty("stock")
    public String getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(String stock) {
        this.stock = stock;
    }

    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("addToCartUrl")
    public String getAddToCartUrl() {
        return addToCartUrl;
    }

    @JsonProperty("addToCartUrl")
    public void setAddToCartUrl(String addToCartUrl) {
        this.addToCartUrl = addToCartUrl;
    }

    @JsonProperty("affiliateAddToCartUrl")
    public String getAffiliateAddToCartUrl() {
        return affiliateAddToCartUrl;
    }

    @JsonProperty("affiliateAddToCartUrl")
    public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
    }

    @JsonProperty("freeShippingOver35Dollars")
    public Boolean getFreeShippingOver35Dollars() {
        return freeShippingOver35Dollars;
    }

    @JsonProperty("freeShippingOver35Dollars")
    public void setFreeShippingOver35Dollars(Boolean freeShippingOver35Dollars) {
        this.freeShippingOver35Dollars = freeShippingOver35Dollars;
    }

    @JsonProperty("giftOptions")
    public GiftOptions getGiftOptions() {
        return giftOptions;
    }

    @JsonProperty("giftOptions")
    public void setGiftOptions(GiftOptions giftOptions) {
        this.giftOptions = giftOptions;
    }

    @JsonProperty("imageEntities")
    public List<ImageEntity> getImageEntities() {
        return imageEntities;
    }

    @JsonProperty("imageEntities")
    public void setImageEntities(List<ImageEntity> imageEntities) {
        this.imageEntities = imageEntities;
    }

    @JsonProperty("offerType")
    public String getOfferType() {
        return offerType;
    }

    @JsonProperty("offerType")
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    @JsonProperty("shippingPassEligible")
    public Boolean getShippingPassEligible() {
        return shippingPassEligible;
    }

    @JsonProperty("shippingPassEligible")
    public void setShippingPassEligible(Boolean shippingPassEligible) {
        this.shippingPassEligible = shippingPassEligible;
    }

    @JsonProperty("availableOnline")
    public Boolean getAvailableOnline() {
        return availableOnline;
    }

    @JsonProperty("availableOnline")
    public void setAvailableOnline(Boolean availableOnline) {
        this.availableOnline = availableOnline;
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
