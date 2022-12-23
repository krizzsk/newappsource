package com.usebutton.sdk.internal.impression;

import com.usebutton.sdk.internal.base.BasePresenter;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.impression.BaseImpressionViewController;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.util.TimeProvider;

public abstract class BaseImpressionPresenter<C extends BaseImpressionViewController> extends BasePresenter<C> {
    public static final TimeProvider TIME_PROVIDER = new TimeProvider() {
        public long getTimeInMs() {
            return System.currentTimeMillis();
        }
    };
    private final Configuration configuration;
    public final EventTracker eventTracker;
    public ImpressionData impressionData = new ImpressionData();
    private final TimeProvider timeProvider;

    public BaseImpressionPresenter(TimeProvider timeProvider2, Configuration configuration2, EventTracker eventTracker2) {
        this.timeProvider = timeProvider2;
        this.configuration = configuration2;
        this.eventTracker = eventTracker2;
    }

    private boolean isVisible(long j, long j2, long j3, long j4, boolean z) {
        if (!z) {
            return false;
        }
        long j5 = j2 * j;
        return j5 > 0 && (j4 * j3) * 100 >= ((long) 50) * j5;
    }

    public void onCheckVisibility(int i, boolean z) {
        BaseImpressionViewController baseImpressionViewController;
        if (!this.configuration.getParameters().isImpressionTrackingDisabled() && i == 0 && z && (baseImpressionViewController = (BaseImpressionViewController) getViewController()) != null) {
            baseImpressionViewController.measureView();
        }
    }

    public void onMeasureView(long j, long j2, long j3, long j4, boolean z) {
        if (isVisible(j, j2, j3, j4, z)) {
            Long enterTime = this.impressionData.getEnterTime();
            if (enterTime == null) {
                this.impressionData.setEnterTime(Long.valueOf(this.timeProvider.getTimeInMs()));
                BaseImpressionViewController baseImpressionViewController = (BaseImpressionViewController) getViewController();
                if (baseImpressionViewController != null) {
                    baseImpressionViewController.postVisibilityCheck();
                }
            } else if (this.impressionData.getViewedTime() == null && this.timeProvider.getTimeInMs() - enterTime.longValue() >= 1000) {
                this.impressionData.setViewedTime(Long.valueOf(this.timeProvider.getTimeInMs()));
                trackImpressionEvent();
            }
        } else {
            resetState();
        }
    }

    public void onViewAttached() {
        BaseImpressionViewController baseImpressionViewController = (BaseImpressionViewController) getViewController();
        if (baseImpressionViewController != null) {
            baseImpressionViewController.addLayoutListener();
        }
    }

    public void onViewDetached() {
        super.onViewDetached();
        BaseImpressionViewController baseImpressionViewController = (BaseImpressionViewController) getViewController();
        if (baseImpressionViewController != null) {
            baseImpressionViewController.removeLayoutListener();
        }
        resetState();
    }

    public void onViewReady(boolean z) {
        BaseImpressionViewController baseImpressionViewController;
        if (z && (baseImpressionViewController = (BaseImpressionViewController) getViewController()) != null) {
            baseImpressionViewController.checkVisibility();
            baseImpressionViewController.removeLayoutListener();
        }
    }

    public void resetState() {
        this.impressionData.setEnterTime((Long) null);
        this.impressionData.setViewedTime((Long) null);
    }

    public abstract void trackImpressionEvent();
}
