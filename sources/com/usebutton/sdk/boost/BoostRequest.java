package com.usebutton.sdk.boost;

public class BoostRequest {
    private final String boostViewId;

    public interface Listener {
        void onComplete(BoostResponse boostResponse, Throwable th);
    }

    public BoostRequest(String str) {
        this.boostViewId = str.trim();
    }

    public String getId() {
        return this.boostViewId;
    }
}
