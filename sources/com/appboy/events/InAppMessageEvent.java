package com.appboy.events;

import androidx.annotation.Keep;
import com.appboy.models.IInAppMessage;
import com.appboy.support.JsonUtils;
import org.json.JSONObject;

@Keep
public class InAppMessageEvent {
    public final IInAppMessage mInAppMessage;
    public final String mUserId;

    public InAppMessageEvent(IInAppMessage iInAppMessage, String str) {
        this.mUserId = str;
        iInAppMessage.getClass();
        this.mInAppMessage = iInAppMessage;
    }

    public IInAppMessage getInAppMessage() {
        return this.mInAppMessage;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public String toString() {
        return JsonUtils.getPrettyPrintedString((JSONObject) this.mInAppMessage.forJsonPut());
    }
}
