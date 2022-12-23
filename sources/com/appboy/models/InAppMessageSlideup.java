package com.appboy.models;

import android.graphics.Color;
import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.CropType;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.enums.inappmessage.SlideFrom;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1536b3;
import p030bo.app.C1707v1;

@Keep
public class InAppMessageSlideup extends InAppMessageWithImageBase {
    public static final String CHEVRON_COLOR = "close_btn_color";
    public static final String SLIDE_FROM = "slide_from";
    public static final String TAG = AppboyLogger.getBrazeLogTag(InAppMessageSlideup.class);
    public int mChevronColor;
    public SlideFrom mSlideFrom;

    public InAppMessageSlideup() {
        this.mSlideFrom = SlideFrom.BOTTOM;
        this.mChevronColor = Color.parseColor("#9B9B9B");
        this.mMessageTextAlign = TextAlign.START;
    }

    public void enableDarkTheme() {
        super.enableDarkTheme();
        C1536b3 b3Var = this.mInAppMessageDarkThemeWrapper;
        if (b3Var == null) {
            AppboyLogger.m5448d(TAG, "Cannot apply dark theme with a null themes wrapper");
        } else if (b3Var.mo5916b().intValue() != -1) {
            this.mChevronColor = this.mInAppMessageDarkThemeWrapper.mo5916b().intValue();
        }
    }

    public int getChevronColor() {
        return this.mChevronColor;
    }

    public MessageType getMessageType() {
        return MessageType.SLIDEUP;
    }

    public SlideFrom getSlideFrom() {
        return this.mSlideFrom;
    }

    public void setChevronColor(int i) {
        this.mChevronColor = i;
    }

    public void setSlideFrom(SlideFrom slideFrom) {
        this.mSlideFrom = slideFrom;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.mJsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.putOpt(SLIDE_FROM, this.mSlideFrom.toString());
            forJsonPut.put("close_btn_color", this.mChevronColor);
            forJsonPut.put("type", getMessageType().name());
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }

    public InAppMessageSlideup(JSONObject jSONObject, C1707v1 v1Var) {
        this(jSONObject, v1Var, (SlideFrom) JsonUtils.optEnum(jSONObject, SLIDE_FROM, SlideFrom.class, SlideFrom.BOTTOM), jSONObject.optInt("close_btn_color"));
    }

    public InAppMessageSlideup(JSONObject jSONObject, C1707v1 v1Var, SlideFrom slideFrom, int i) {
        super(jSONObject, v1Var);
        SlideFrom slideFrom2 = SlideFrom.BOTTOM;
        this.mSlideFrom = slideFrom2;
        this.mChevronColor = Color.parseColor("#9B9B9B");
        this.mSlideFrom = slideFrom;
        if (slideFrom == null) {
            this.mSlideFrom = slideFrom2;
        }
        this.mChevronColor = i;
        this.mCropType = (CropType) JsonUtils.optEnum(jSONObject, InAppMessageBase.CROP_TYPE, CropType.class, CropType.FIT_CENTER);
        this.mMessageTextAlign = (TextAlign) JsonUtils.optEnum(jSONObject, InAppMessageBase.MESSAGE_TEXT_ALIGN, TextAlign.class, TextAlign.START);
    }
}
