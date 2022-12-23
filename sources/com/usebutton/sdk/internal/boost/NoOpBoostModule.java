package com.usebutton.sdk.internal.boost;

import com.usebutton.sdk.boost.Boost;
import com.usebutton.sdk.boost.BoostRequest;
import com.usebutton.sdk.boost.BoostResponse;

public class NoOpBoostModule implements Boost {
    public void fetch(BoostRequest boostRequest, BoostRequest.Listener listener) {
        if (listener != null) {
            listener.onComplete((BoostResponse) null, new IllegalStateException("Button.configure() must be called before using Boost API"));
        }
    }
}
