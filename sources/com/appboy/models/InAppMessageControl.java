package com.appboy.models;

import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1594h2;
import p030bo.app.C1687s2;
import p030bo.app.C1707v1;

@Keep
public class InAppMessageControl extends InAppMessageBase {
    public static final String TAG = AppboyLogger.getBrazeLogTag(InAppMessageControl.class);
    public boolean mControlImpressionLogged = false;

    public InAppMessageControl(JSONObject jSONObject, C1707v1 v1Var) {
        super(jSONObject, v1Var);
    }

    public MessageType getMessageType() {
        return MessageType.CONTROL;
    }

    public boolean logImpression() {
        if (this.mControlImpressionLogged) {
            AppboyLogger.m5453i(TAG, "Control impression already logged for this in-app message. Ignoring.");
            return false;
        } else if (StringUtils.isNullOrEmpty(this.mTriggerId)) {
            AppboyLogger.m5459w(TAG, "Trigger Id not found. Not logging in-app message control impression.");
            return false;
        } else if (this.mBrazeManager == null) {
            AppboyLogger.m5459w(TAG, "Cannot log an in-app message control impression because the AppboyManager is null.");
            return false;
        } else {
            try {
                AppboyLogger.m5457v(TAG, "Logging control in-app message impression event");
                this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4717i(this.mTriggerId));
                this.mControlImpressionLogged = true;
                return true;
            } catch (JSONException e) {
                this.mBrazeManager.mo6242b((Throwable) e);
                return false;
            }
        }
    }
}
