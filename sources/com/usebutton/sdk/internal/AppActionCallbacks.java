package com.usebutton.sdk.internal;

import com.usebutton.sdk.internal.models.AppAction;

public interface AppActionCallbacks {
    void onAction(AppAction appAction);

    void onNoAction();
}
