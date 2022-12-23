package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.VideoContentListener;

/* renamed from: com.fyber.inneractive.sdk.flow.z */
public abstract class C2808z extends C2787q<VideoContentListener> implements VideoContentListener {
    public boolean isOverlayOutside = true;

    public boolean isOverlayOutside() {
        return this.isOverlayOutside;
    }

    public void onCompleted() {
        EventsListenerT eventslistenert = this.mEventsListener;
        if (eventslistenert != null) {
            ((VideoContentListener) eventslistenert).onCompleted();
        }
    }

    public void onPlayerError() {
        EventsListenerT eventslistenert = this.mEventsListener;
        if (eventslistenert != null) {
            ((VideoContentListener) eventslistenert).onPlayerError();
        }
    }

    public void onProgress(int i, int i2) {
        EventsListenerT eventslistenert = this.mEventsListener;
        if (eventslistenert != null) {
            ((VideoContentListener) eventslistenert).onProgress(i, i2);
        }
    }

    public C2808z setOverlayOutside(boolean z) {
        this.isOverlayOutside = z;
        return this;
    }
}
