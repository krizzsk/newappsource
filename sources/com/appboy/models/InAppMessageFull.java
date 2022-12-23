package com.appboy.models;

import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.CropType;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.support.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1707v1;

@Keep
public class InAppMessageFull extends InAppMessageImmersiveBase {
    public InAppMessageFull() {
        this.mCropType = CropType.CENTER_CROP;
    }

    public MessageType getMessageType() {
        return MessageType.FULL;
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

    public InAppMessageFull(JSONObject jSONObject, C1707v1 v1Var) {
        super(jSONObject, v1Var);
        this.mCropType = (CropType) JsonUtils.optEnum(jSONObject, InAppMessageBase.CROP_TYPE, CropType.class, CropType.CENTER_CROP);
    }
}
