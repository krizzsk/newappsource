package com.usebutton.sdk.internal.impression;

import com.usebutton.sdk.impression.CreativeType;
import com.usebutton.sdk.impression.VisibleRateType;

public class ImpressionData {
    private CreativeType creativeType;
    private Long enterTime;
    private String offerId;
    private String url;
    private Long viewedTime;
    private float visibleRate;
    private VisibleRateType visibleRateType = VisibleRateType.UNKNOWN;

    public CreativeType getCreativeType() {
        return this.creativeType;
    }

    public Long getEnterTime() {
        return this.enterTime;
    }

    public String getOfferId() {
        return this.offerId;
    }

    public String getUrl() {
        return this.url;
    }

    public Long getViewedTime() {
        return this.viewedTime;
    }

    public float getVisibleRate() {
        return this.visibleRate;
    }

    public VisibleRateType getVisibleRateType() {
        return this.visibleRateType;
    }

    public void setCreativeType(CreativeType creativeType2) {
        this.creativeType = creativeType2;
    }

    public void setEnterTime(Long l) {
        this.enterTime = l;
    }

    public void setViewedTime(Long l) {
        this.viewedTime = l;
    }

    public void updateRate(String str, VisibleRateType visibleRateType2, float f, String str2) {
        this.url = str;
        this.visibleRateType = visibleRateType2;
        this.visibleRate = f;
        this.offerId = str2;
    }
}
