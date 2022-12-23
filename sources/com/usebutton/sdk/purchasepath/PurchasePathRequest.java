package com.usebutton.sdk.purchasepath;

public class PurchasePathRequest {
    private String placementId;
    private String pubRef;
    private final String url;

    public PurchasePathRequest(String str) {
        this.url = str;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getPubRef() {
        return this.pubRef;
    }

    public String getUrl() {
        return this.url;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setPubRef(String str) {
        this.pubRef = str;
    }
}
