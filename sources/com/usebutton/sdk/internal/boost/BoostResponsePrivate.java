package com.usebutton.sdk.internal.boost;

import com.usebutton.sdk.boost.BoostResponse;
import com.usebutton.sdk.internal.widget.WidgetRenderable;
import org.json.JSONException;
import org.json.JSONObject;

public class BoostResponsePrivate extends BoostResponse implements WidgetRenderable {
    private static final String KEY_EVENT_VALUE = "event_value";
    private static final String KEY_MARKUP = "markup";
    private static final String KEY_RENDER_TIMEOUT = "render_timeout";
    private final JSONObject eventProperties;
    private final String markup;
    private final long renderTimeoutInMs;

    private BoostResponsePrivate(String str, long j, JSONObject jSONObject) {
        this.markup = str;
        this.renderTimeoutInMs = j;
        this.eventProperties = jSONObject;
    }

    public static BoostResponsePrivate fromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null && !jSONObject.isNull("markup")) {
            return new BoostResponsePrivate(jSONObject.getString("markup"), jSONObject.optLong("render_timeout", 3000), jSONObject.getJSONObject(KEY_EVENT_VALUE));
        }
        return null;
    }

    public JSONObject getEventProperties() {
        return this.eventProperties;
    }

    public String getMarkup() {
        return this.markup;
    }

    public String getMarkupUrl() {
        return "";
    }

    public long getRenderTimeoutInMs() {
        return this.renderTimeoutInMs;
    }
}
