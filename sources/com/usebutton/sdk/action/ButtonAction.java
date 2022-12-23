package com.usebutton.sdk.action;

import android.content.Context;
import com.usebutton.sdk.internal.models.AppAction;

public class ButtonAction {
    private final AppAction appAction;

    public interface Listener {
        void onStartResult(Throwable th);
    }

    public ButtonAction(AppAction appAction2) {
        this.appAction = appAction2;
    }

    public AppAction getAppAction() {
        return this.appAction;
    }

    public String getAttributionToken() {
        return this.appAction.getMeta().getSourceToken();
    }

    public void start(Context context) {
        start(context, (Listener) null);
    }

    public void start(Context context, final Listener listener) {
        this.appAction.invokeAction(context, new AppAction.Listener() {
            public void onFailure(Throwable th) {
                Listener listener = listener;
                if (listener != null) {
                    listener.onStartResult(th);
                }
            }

            public void onSuccess() {
                Listener listener = listener;
                if (listener != null) {
                    listener.onStartResult((Throwable) null);
                }
            }
        });
    }
}
