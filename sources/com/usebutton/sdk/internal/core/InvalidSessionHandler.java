package com.usebutton.sdk.internal.core;

import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.api.ButtonHttpStatusException;
import com.usebutton.sdk.internal.util.ButtonLog;

public class InvalidSessionHandler implements ExceptionHandler {
    public boolean handle(Throwable th) {
        if (th instanceof ButtonHttpStatusException) {
            ButtonHttpStatusException buttonHttpStatusException = (ButtonHttpStatusException) th;
            if (buttonHttpStatusException.wasUnauthorized()) {
                ButtonPrivate.getButton().getStorage().setSessionId((String) null);
                ButtonLog.visibleFormat("Button Session ID is not authorized (Request ID: %s)", buttonHttpStatusException.getRequestId());
                return true;
            }
        }
        return false;
    }
}
