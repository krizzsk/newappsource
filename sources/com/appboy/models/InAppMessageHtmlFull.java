package com.appboy.models;

import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.MessageType;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1707v1;

@Keep
public class InAppMessageHtmlFull extends InAppMessageZippedAssetHtmlBase {
    public InAppMessageHtmlFull() {
    }

    public MessageType getMessageType() {
        return MessageType.HTML_FULL;
    }

    public InAppMessageHtmlFull(JSONObject jSONObject, C1707v1 v1Var) {
        super(jSONObject, v1Var);
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.mJsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.put("type", getMessageType().name());
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }
}
