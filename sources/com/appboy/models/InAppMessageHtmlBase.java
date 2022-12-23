package com.appboy.models;

import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1594h2;
import p030bo.app.C1687s2;
import p030bo.app.C1707v1;
import p030bo.app.C1721w5;
import p030bo.app.C1739y5;

@Keep
public abstract class InAppMessageHtmlBase extends InAppMessageBase implements IInAppMessageHtml {
    public static final String TAG = AppboyLogger.getBrazeLogTag(InAppMessageHtmlBase.class);
    public String mAssetsDirectoryLocalUrl;
    public boolean mButtonClickLogged = false;
    public String mButtonIdClicked = null;

    public InAppMessageHtmlBase() {
        this.mOpenUriInWebview = true;
    }

    public String getLocalAssetsDirectoryUrl() {
        return this.mAssetsDirectoryLocalUrl;
    }

    public boolean logButtonClick(String str) {
        if (StringUtils.isNullOrEmpty(this.mTriggerId)) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Trigger id not found. Not logging html in-app message button click for id: " + str);
            return false;
        } else if (StringUtils.isNullOrBlank(str)) {
            AppboyLogger.m5453i(TAG, "Button Id was null or blank for this html in-app message. Ignoring.");
            return false;
        } else if (this.mButtonClickLogged && !getMessageType().equals(MessageType.HTML)) {
            AppboyLogger.m5453i(TAG, "Button click already logged for this html in-app message. Ignoring.");
            return false;
        } else if (this.mBrazeManager == null) {
            AppboyLogger.m5459w(TAG, "Cannot log an html in-app message button click because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4709d(this.mTriggerId, str));
                this.mButtonIdClicked = str;
                this.mButtonClickLogged = true;
                String str3 = TAG;
                AppboyLogger.m5448d(str3, "Logged button click for button id: " + str + " and trigger id: " + this.mTriggerId);
                return true;
            } catch (JSONException e) {
                this.mBrazeManager.mo6242b((Throwable) e);
                return false;
            }
        }
    }

    public void onAfterClosed() {
        super.onAfterClosed();
        if (this.mButtonClickLogged && !StringUtils.isNullOrBlank(this.mTriggerId) && !StringUtils.isNullOrBlank(this.mButtonIdClicked)) {
            this.mBrazeManager.mo6235a((C1721w5) new C1739y5(this.mTriggerId, this.mButtonIdClicked));
        }
    }

    public void setLocalAssetsDirectoryUrl(String str) {
        this.mAssetsDirectoryLocalUrl = str;
    }

    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        if (!map.isEmpty()) {
            setLocalAssetsDirectoryUrl((String) map.values().toArray()[0]);
        }
    }

    public InAppMessageHtmlBase(JSONObject jSONObject, C1707v1 v1Var) {
        super(jSONObject, v1Var);
        this.mOpenUriInWebview = jSONObject.optBoolean("use_webview", true);
    }
}
