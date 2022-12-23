package com.usebutton.sdk.internal.widget;

enum WidgetMessageType {
    BOOST_READY("Button.boost.ready"),
    EVENTS_TRACK("Button.events.track"),
    PURCHASE_PATH("Button.purchasePath.fetchAndStart"),
    APP_INSTALL("Button.app.install"),
    OPEN_URL("Button.url.open"),
    WIDGET_DISMISS("Button.widget.dismiss"),
    WEB_VIEW_DISMISS("Button.webView.dismiss"),
    BROWSER_GET_CONTEXT("Button.browser.getContext"),
    UNKNOWN("unknown");
    
    private final String apiValue;

    private WidgetMessageType(String str) {
        this.apiValue = str;
    }

    public static WidgetMessageType fromApiValue(String str) {
        for (WidgetMessageType widgetMessageType : values()) {
            if (widgetMessageType.apiValue.equals(str)) {
                return widgetMessageType;
            }
        }
        return UNKNOWN;
    }

    public String getApiValue() {
        return this.apiValue;
    }
}
