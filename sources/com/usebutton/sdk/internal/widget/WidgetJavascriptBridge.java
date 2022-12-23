package com.usebutton.sdk.internal.widget;

import android.webkit.JavascriptInterface;
import com.usebutton.sdk.internal.util.ButtonLog;
import org.json.JSONException;
import org.json.JSONObject;

class WidgetJavascriptBridge {
    public static final String INJECTED_OBJECT = "ButtonSdk";
    private static final String TAG = "WidgetJavascriptBridge";
    private Listener listener;

    public interface Listener {
        void onMessageReceived(JSONObject jSONObject);
    }

    @JavascriptInterface
    public void onMessageReceived(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Listener listener2 = this.listener;
            if (listener2 != null) {
                listener2.onMessageReceived(jSONObject);
            }
        } catch (JSONException e) {
            ButtonLog.warn(TAG, "Error parsing widget view json", e);
        }
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
    }
}
