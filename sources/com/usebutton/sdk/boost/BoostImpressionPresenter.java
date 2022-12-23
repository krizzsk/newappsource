package com.usebutton.sdk.boost;

import com.usebutton.sdk.internal.boost.BoostResponsePrivate;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.impression.BaseImpressionPresenter;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.util.TimeProvider;

class BoostImpressionPresenter extends BaseImpressionPresenter<BoostImpressionViewController> {
    private BoostResponsePrivate boostResponse;

    public BoostImpressionPresenter(TimeProvider timeProvider, Configuration configuration, EventTracker eventTracker) {
        super(timeProvider, configuration, eventTracker);
    }

    public void setBoostResponse(BoostResponsePrivate boostResponsePrivate) {
        this.boostResponse = boostResponsePrivate;
        resetState();
        BoostImpressionViewController boostImpressionViewController = (BoostImpressionViewController) getViewController();
        if (boostImpressionViewController != null) {
            boostImpressionViewController.checkVisibility();
        }
    }

    public void trackImpressionEvent() {
        this.eventTracker.trackEventWithProperties(Events.VIEWABLE_IMPRESSION, this.boostResponse.getEventProperties());
    }
}
