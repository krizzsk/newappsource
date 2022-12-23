package com.usebutton.sdk.internal.widget;

import org.json.JSONObject;

public interface WidgetRenderable {
    JSONObject getEventProperties();

    String getMarkup();

    String getMarkupUrl();

    long getRenderTimeoutInMs();
}
