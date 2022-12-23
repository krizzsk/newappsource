package com.usebutton.sdk.purchasepath;

import android.content.Context;
import com.usebutton.sdk.internal.models.AppAction;

public class PurchasePath {
    public final AppAction appAction;

    public interface Listener {
        void onStartResult(Throwable th);
    }

    public PurchasePath(AppAction appAction2) {
        this.appAction = appAction2;
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
