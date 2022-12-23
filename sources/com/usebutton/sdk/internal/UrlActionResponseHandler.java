package com.usebutton.sdk.internal;

import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Response;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.models.UrlMatcher;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.net.URL;

class UrlActionResponseHandler implements FailableReceiver<Response<AppAction>> {
    private static final String LINK_ERROR_TEMPLATE = "Failed to fetch app action for url: '%s' (requestId = %s)";
    private static final String TAG = "UrlActionResponseHandler";
    private final EventTracker eventTracker;
    private final AppActionCallbacks invoker;
    private final URL url;
    private final UrlMatcher urlMatcher;

    public UrlActionResponseHandler(URL url2, UrlMatcher urlMatcher2, EventTracker eventTracker2, AppActionCallbacks appActionCallbacks) {
        this.url = url2;
        this.urlMatcher = urlMatcher2;
        this.eventTracker = eventTracker2;
        this.invoker = appActionCallbacks;
    }

    public void onError() {
        this.invoker.onNoAction();
    }

    public void onResult(Response<AppAction> response) {
        if (response == null) {
            this.invoker.onNoAction();
        } else if (response.object() == null) {
            if (this.urlMatcher.canExchangeUrl(this.url)) {
                ButtonLog.warnFormat(TAG, LINK_ERROR_TEMPLATE, this.url, response.requestId());
            }
            this.invoker.onNoAction();
        } else {
            this.eventTracker.trackActionAvailable(response.object().getMeta());
            this.invoker.onAction(response.object());
        }
    }
}
