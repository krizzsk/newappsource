package com.usebutton.sdk.internal.widget;

import com.usebutton.sdk.internal.models.Browser;
import com.usebutton.sdk.internal.util.ButtonLog;
import org.json.JSONException;
import org.json.JSONObject;

class WidgetMessageParser {
    public static final String KEY_ARGUMENTS = "arguments";
    public static final String KEY_BVPT = "bvpt";
    public static final String KEY_CALLBACK = "callback";
    public static final String KEY_MERCHANT_ORG_ID = "merchant_organization_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_STORE_ID = "store_id";
    public static final String KEY_SUCCESS = "success";
    public static final String KEY_TARGET = "target";
    public static final String KEY_TYPE = "type";
    public static final String KEY_URL = "url";
    public static final String KEY_VALUE = "value";
    private static final String TAG = "WidgetMessageParser";
    private Listener listener;

    /* renamed from: com.usebutton.sdk.internal.widget.WidgetMessageParser$1 */
    public static /* synthetic */ class C123831 {
        public static final /* synthetic */ int[] $SwitchMap$com$usebutton$sdk$internal$widget$WidgetMessageType;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.usebutton.sdk.internal.widget.WidgetMessageType[] r0 = com.usebutton.sdk.internal.widget.WidgetMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$usebutton$sdk$internal$widget$WidgetMessageType = r0
                com.usebutton.sdk.internal.widget.WidgetMessageType r1 = com.usebutton.sdk.internal.widget.WidgetMessageType.BOOST_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$widget$WidgetMessageType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.usebutton.sdk.internal.widget.WidgetMessageType r1 = com.usebutton.sdk.internal.widget.WidgetMessageType.EVENTS_TRACK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$widget$WidgetMessageType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.usebutton.sdk.internal.widget.WidgetMessageType r1 = com.usebutton.sdk.internal.widget.WidgetMessageType.PURCHASE_PATH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$widget$WidgetMessageType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.usebutton.sdk.internal.widget.WidgetMessageType r1 = com.usebutton.sdk.internal.widget.WidgetMessageType.APP_INSTALL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$widget$WidgetMessageType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.usebutton.sdk.internal.widget.WidgetMessageType r1 = com.usebutton.sdk.internal.widget.WidgetMessageType.OPEN_URL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$widget$WidgetMessageType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.usebutton.sdk.internal.widget.WidgetMessageType r1 = com.usebutton.sdk.internal.widget.WidgetMessageType.WIDGET_DISMISS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$widget$WidgetMessageType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.usebutton.sdk.internal.widget.WidgetMessageType r1 = com.usebutton.sdk.internal.widget.WidgetMessageType.WEB_VIEW_DISMISS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$widget$WidgetMessageType     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.usebutton.sdk.internal.widget.WidgetMessageType r1 = com.usebutton.sdk.internal.widget.WidgetMessageType.BROWSER_GET_CONTEXT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.widget.WidgetMessageParser.C123831.<clinit>():void");
        }
    }

    public interface Listener {
        void onBrowserGetContext(String str);

        void onInstallApp(String str, String str2);

        void onOpenUrl(String str, String str2);

        void onPurchasePath(String str, String str2, JSONObject jSONObject);

        void onTrackEvent(String str, JSONObject jSONObject);

        void onWebViewDismiss();

        void onWidgetDismiss();

        void onWidgetReady(boolean z);
    }

    public void onMessageReceived(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("type");
            JSONObject optJSONObject = jSONObject.optJSONObject(KEY_ARGUMENTS);
            switch (C123831.$SwitchMap$com$usebutton$sdk$internal$widget$WidgetMessageType[WidgetMessageType.fromApiValue(string).ordinal()]) {
                case 1:
                    Listener listener2 = this.listener;
                    if (listener2 != null && optJSONObject != null) {
                        listener2.onWidgetReady(optJSONObject.getBoolean(KEY_SUCCESS));
                        return;
                    }
                    return;
                case 2:
                    Listener listener3 = this.listener;
                    if (listener3 != null && optJSONObject != null) {
                        listener3.onTrackEvent(optJSONObject.getString("name"), optJSONObject.optJSONObject("value"));
                        return;
                    }
                    return;
                case 3:
                    Listener listener4 = this.listener;
                    if (listener4 != null && optJSONObject != null) {
                        listener4.onPurchasePath(optJSONObject.getString("url"), optJSONObject.optString(KEY_MERCHANT_ORG_ID, (String) null), optJSONObject.optJSONObject("bvpt"));
                        return;
                    }
                    return;
                case 4:
                    Listener listener5 = this.listener;
                    if (listener5 != null && optJSONObject != null) {
                        listener5.onInstallApp(optJSONObject.optString(KEY_STORE_ID, (String) null), optJSONObject.optString("url", (String) null));
                        return;
                    }
                    return;
                case 5:
                    Listener listener6 = this.listener;
                    if (listener6 != null && optJSONObject != null) {
                        listener6.onOpenUrl(optJSONObject.getString("url"), optJSONObject.optString("target", Browser.TARGET_WEBVIEW));
                        return;
                    }
                    return;
                case 6:
                    Listener listener7 = this.listener;
                    if (listener7 != null) {
                        listener7.onWidgetDismiss();
                        return;
                    }
                    return;
                case 7:
                    Listener listener8 = this.listener;
                    if (listener8 != null) {
                        listener8.onWebViewDismiss();
                        return;
                    }
                    return;
                case 8:
                    Listener listener9 = this.listener;
                    if (listener9 != null && optJSONObject != null) {
                        listener9.onBrowserGetContext(optJSONObject.getString(KEY_CALLBACK));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (JSONException e) {
            ButtonLog.warn(TAG, "Failed to parse message", e);
        }
        ButtonLog.warn(TAG, "Failed to parse message", e);
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
    }
}
