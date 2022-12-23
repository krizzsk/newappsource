package com.appboy.p044ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.appboy.models.IInAppMessageHtml;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.Braze;
import com.google.android.gms.ads.AdError;
import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: com.appboy.ui.inappmessage.jsinterface.AppboyInAppMessageHtmlJavascriptInterface */
public class AppboyInAppMessageHtmlJavascriptInterface {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageHtmlJavascriptInterface.class);
    private final Context mContext;
    private final IInAppMessageHtml mInAppMessage;
    private final AppboyInAppMessageHtmlUserJavascriptInterface mUserInterface;

    public AppboyInAppMessageHtmlJavascriptInterface(Context context, IInAppMessageHtml iInAppMessageHtml) {
        this.mContext = context;
        this.mUserInterface = new AppboyInAppMessageHtmlUserJavascriptInterface(context);
        this.mInAppMessage = iInAppMessageHtml;
    }

    @JavascriptInterface
    public AppboyInAppMessageHtmlUserJavascriptInterface getUser() {
        return this.mUserInterface;
    }

    @JavascriptInterface
    public void logButtonClick(String str) {
        this.mInAppMessage.logButtonClick(str);
    }

    @JavascriptInterface
    public void logClick() {
        this.mInAppMessage.logClick();
    }

    @JavascriptInterface
    public void logCustomEventWithJSON(String str, String str2) {
        Braze.getInstance(this.mContext).logCustomEvent(str, parseProperties(str2));
    }

    @JavascriptInterface
    public void logPurchaseWithJSON(String str, double d, String str2, int i, String str3) {
        String str4 = str;
        String str5 = str2;
        Braze.getInstance(this.mContext).logPurchase(str4, str5, new BigDecimal(Double.toString(d)), i, parseProperties(str3));
    }

    public AppboyProperties parseProperties(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.equals(AdError.UNDEFINED_DOMAIN) || str.equals(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING)) {
                return null;
            }
            return new AppboyProperties(new JSONObject(str));
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5452e(str2, "Failed to parse properties JSON String: " + str, e);
            return null;
        }
    }

    @JavascriptInterface
    public void requestImmediateDataFlush() {
        Braze.getInstance(this.mContext).requestImmediateDataFlush();
    }
}
