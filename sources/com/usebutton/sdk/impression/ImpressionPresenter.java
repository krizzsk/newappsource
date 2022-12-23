package com.usebutton.sdk.impression;

import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.impression.BaseImpressionPresenter;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.util.TimeProvider;

class ImpressionPresenter extends BaseImpressionPresenter<ImpressionViewController> {
    public ImpressionPresenter(TimeProvider timeProvider, Configuration configuration, EventTracker eventTracker) {
        super(timeProvider, configuration, eventTracker);
    }

    public CreativeType getCreativeType() {
        return this.impressionData.getCreativeType();
    }

    public String getOfferId() {
        return this.impressionData.getOfferId();
    }

    public String getUrl() {
        return this.impressionData.getUrl();
    }

    public float getVisibleRate() {
        return this.impressionData.getVisibleRate();
    }

    public VisibleRateType getVisibleRateType() {
        return this.impressionData.getVisibleRateType();
    }

    public void setCreativeType(CreativeType creativeType) {
        this.impressionData.setCreativeType(creativeType);
    }

    public void track(String str, VisibleRateType visibleRateType, float f, String str2) {
        this.impressionData.updateRate(str, visibleRateType, f, str2);
        resetState();
        ImpressionViewController impressionViewController = (ImpressionViewController) getViewController();
        if (impressionViewController != null) {
            impressionViewController.checkVisibility();
        }
    }

    public void trackImpressionEvent() {
        this.eventTracker.trackEventWithProperties(Events.VIEWABLE_IMPRESSION, "url", this.impressionData.getUrl(), Events.PROPERTY_OFFER_ID, this.impressionData.getOfferId(), Events.PROPERTY_VISIBLE_RATE_TYPE, this.impressionData.getVisibleRateType().getEventValue(), Events.PROPERTY_VISIBLE_RATE, String.valueOf(this.impressionData.getVisibleRate()), Events.PROPERTY_CREATIVE_TYPE, this.impressionData.getCreativeType().getEventValue());
    }
}
