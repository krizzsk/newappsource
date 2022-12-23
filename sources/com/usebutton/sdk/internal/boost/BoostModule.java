package com.usebutton.sdk.internal.boost;

import com.usebutton.sdk.boost.Boost;
import com.usebutton.sdk.boost.BoostRequest;
import com.usebutton.sdk.boost.BoostResponse;
import com.usebutton.sdk.internal.ButtonRepository;
import com.usebutton.sdk.internal.api.ButtonNetworkException;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.util.ButtonLog;

public class BoostModule implements Boost {
    private static BoostModule boostModule;
    private final ButtonRepository buttonRepository;

    private BoostModule(ButtonRepository buttonRepository2) {
        this.buttonRepository = buttonRepository2;
    }

    public static BoostModule getInstance(ButtonRepository buttonRepository2) {
        if (boostModule == null) {
            boostModule = new BoostModule(buttonRepository2);
        }
        return boostModule;
    }

    public void fetch(BoostRequest boostRequest, final BoostRequest.Listener listener) {
        if (listener == null) {
            ButtonLog.visible("Ignoring fetch request with null listener.");
        } else {
            this.buttonRepository.postBoostView(boostRequest.getId(), new FailableReceiver<BoostResponsePrivate>() {
                public void onError() {
                    listener.onComplete((BoostResponse) null, new ButtonNetworkException("Failed to fetch boost"));
                }

                public void onResult(BoostResponsePrivate boostResponsePrivate) {
                    listener.onComplete(boostResponsePrivate, (Throwable) null);
                }
            });
        }
    }
}
