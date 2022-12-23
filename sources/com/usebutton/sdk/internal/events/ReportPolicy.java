package com.usebutton.sdk.internal.events;

import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.functional.Getter;
import com.usebutton.sdk.internal.functional.Observable;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.util.Publisher;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReportPolicy {
    private static final Getter<Long> ABSOLUTE_CLOCK = new Getter<Long>() {
        public Long get() {
            return Long.valueOf(System.currentTimeMillis());
        }
    };
    private static final Set<String> IMPORTANT_EVENTS = new HashSet(Arrays.asList(new String[]{Events.APP_DEEPLINK, Events.BUTTON_TAPPED, Events.APP_INSTALL_SUCCESS, Events.APP_INSTALL_REFERRER_RECEIVED, Events.DEEPLINK_RECEIVED, Events.DEEPLINK_AVAILABLE, Events.REFERRER_CHANGED, Events.BUTTON_ACTION_AVAILABLE, Events.APP_INSTALL_NOTIFICATION_ACTION, Events.APP_INSTALL_NOTIFICATION_DISMISSED, Events.INTERACTIVE_BUTTON_ITEM_SELECTED, Events.WEB_WEBVIEW_OPEN, Events.WEB_WEBVIEW_DISMISS}));
    private Publisher<Listener> mPublisher;
    private final Storage mStorage;
    private final Getter<Long> mTimeGetter;
    private Long mTimeOfLastReport;

    public interface Listener {
        void onShouldReport();
    }

    public ReportPolicy(Storage storage) {
        this(storage, ABSOLUTE_CLOCK);
    }

    private Configuration getConfiguration() {
        Configuration configuration = this.mStorage.getConfiguration();
        if (configuration == null) {
            return Configuration.emptyConfiguration();
        }
        return configuration;
    }

    private void publishShouldReport() {
        this.mPublisher.perform(new Publisher.Action<Listener>() {
            public void perform(Listener listener) {
                listener.onShouldReport();
            }
        });
    }

    public Observable<Listener> getObservable() {
        return this.mPublisher;
    }

    public long getTimeOfLastReport() {
        if (this.mTimeOfLastReport == null) {
            this.mTimeOfLastReport = Long.valueOf(Math.min(this.mTimeGetter.get().longValue(), this.mStorage.getTimeOfLastEventReport()));
        }
        return this.mTimeOfLastReport.longValue();
    }

    public void onAppLaunch() {
        long longValue = this.mTimeGetter.get().longValue();
        if (longValue - getTimeOfLastReport() >= ((long) (getConfiguration().getParameters().getEventReportIntervalSeconds() * 1000))) {
            this.mTimeOfLastReport = Long.valueOf(longValue);
            publishShouldReport();
        }
    }

    public void onEvent(String str) {
        if (IMPORTANT_EVENTS.contains(str)) {
            publishShouldReport();
        } else if (!str.startsWith("btn:")) {
            publishShouldReport();
        }
    }

    public void onEventsReported() {
        this.mStorage.setTimeOfLastEventReport(this.mTimeGetter.get().longValue());
    }

    public void onOrder() {
        publishShouldReport();
    }

    public ReportPolicy(Storage storage, Getter<Long> getter) {
        this.mTimeOfLastReport = null;
        this.mPublisher = new Publisher<>();
        this.mStorage = storage;
        this.mTimeGetter = getter;
    }
}
