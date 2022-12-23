package com.usebutton.sdk.internal.api;

import com.usebutton.sdk.action.ActionQuery;
import com.usebutton.sdk.internal.models.AppAction;

public interface AppActionCache {
    boolean contains(String str, String str2, ActionQuery actionQuery);

    AppAction get(String str, String str2, ActionQuery actionQuery);

    void put(String str, String str2, ActionQuery actionQuery, AppAction appAction);
}
