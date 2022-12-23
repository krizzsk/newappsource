package com.appboy.models;

import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.CropType;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.support.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1707v1;

@Keep
public class InAppMessageModal extends InAppMessageImmersiveBase {
    public InAppMessageModal() {
    }

    public MessageType getMessageType() {
        return MessageType.MODAL;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageModal(JSONObject jSONObject, C1707v1 v1Var) {
        super(jSONObject, v1Var);
        Class<CropType> cls = CropType.class;
        if (this.mImageStyle.equals(ImageStyle.GRAPHIC)) {
            this.mCropType = (CropType) JsonUtils.optEnum(jSONObject, InAppMessageBase.CROP_TYPE, cls, CropType.CENTER_CROP);
        } else {
            this.mCropType = (CropType) JsonUtils.optEnum(jSONObject, InAppMessageBase.CROP_TYPE, cls, CropType.FIT_CENTER);
        }
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
