package com.appboy.models;

import android.graphics.Color;
import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1536b3;
import p030bo.app.C1594h2;
import p030bo.app.C1687s2;
import p030bo.app.C1707v1;
import p030bo.app.C1721w5;
import p030bo.app.C1739y5;

@Keep
public abstract class InAppMessageImmersiveBase extends InAppMessageWithImageBase implements IInAppMessageImmersive {
    public static final String BUTTONS = "btns";
    public static final String CLOSE_BUTTON_COLOR = "close_btn_color";
    public static final String FRAME_COLOR = "frame_color";
    public static final String HEADER = "header";
    public static final String HEADER_TEXT_ALIGN = "text_align_header";
    public static final String HEADER_TEXT_COLOR = "header_text_color";
    public static final String IMAGE_STYLE = "image_style";
    public static final String TAG = AppboyLogger.getBrazeLogTag(InAppMessageImmersiveBase.class);
    public boolean mButtonClickLogged;
    public String mButtonIdClicked;
    public int mCloseButtonColor;
    public Integer mFrameColor;
    public String mHeader;
    public TextAlign mHeaderTextAlign;
    public int mHeaderTextColor;
    public ImageStyle mImageStyle;
    public List<MessageButton> mMessageButtons;

    public InAppMessageImmersiveBase() {
        this.mHeaderTextColor = Color.parseColor("#333333");
        this.mCloseButtonColor = Color.parseColor("#9B9B9B");
        this.mMessageButtons = Collections.emptyList();
        this.mImageStyle = ImageStyle.TOP;
        this.mFrameColor = null;
        this.mHeaderTextAlign = TextAlign.CENTER;
        this.mButtonIdClicked = null;
    }

    public void enableDarkTheme() {
        super.enableDarkTheme();
        C1536b3 b3Var = this.mInAppMessageDarkThemeWrapper;
        if (b3Var == null) {
            AppboyLogger.m5448d(TAG, "Cannot apply dark theme with a null themes wrapper");
            return;
        }
        if (b3Var.mo5917c() != null) {
            this.mFrameColor = this.mInAppMessageDarkThemeWrapper.mo5917c();
        }
        if (this.mInAppMessageDarkThemeWrapper.mo5916b() != null) {
            this.mCloseButtonColor = this.mInAppMessageDarkThemeWrapper.mo5916b().intValue();
        }
        if (this.mInAppMessageDarkThemeWrapper.mo5918d() != null) {
            this.mHeaderTextColor = this.mInAppMessageDarkThemeWrapper.mo5918d().intValue();
        }
        for (MessageButton enableDarkTheme : this.mMessageButtons) {
            enableDarkTheme.enableDarkTheme();
        }
    }

    public int getCloseButtonColor() {
        return this.mCloseButtonColor;
    }

    public Integer getFrameColor() {
        return this.mFrameColor;
    }

    public String getHeader() {
        return this.mHeader;
    }

    public TextAlign getHeaderTextAlign() {
        return this.mHeaderTextAlign;
    }

    public int getHeaderTextColor() {
        return this.mHeaderTextColor;
    }

    public ImageStyle getImageStyle() {
        return this.mImageStyle;
    }

    public List<MessageButton> getMessageButtons() {
        return this.mMessageButtons;
    }

    public boolean logButtonClick(MessageButton messageButton) {
        if (StringUtils.isNullOrBlank(this.mTriggerId)) {
            AppboyLogger.m5448d(TAG, "Trigger id not found. Not logging button click.");
            return false;
        } else if (messageButton == null) {
            AppboyLogger.m5459w(TAG, "Message button was null. Ignoring button click.");
            return false;
        } else if (this.mButtonClickLogged) {
            AppboyLogger.m5453i(TAG, "Button click already logged for this message. Ignoring.");
            return false;
        } else if (this.mBrazeManager == null) {
            AppboyLogger.m5459w(TAG, "Cannot log a button click because the AppboyManager is null.");
            return false;
        } else {
            try {
                C1687s2 a = C1687s2.m4694a(this.mTriggerId, messageButton);
                this.mButtonIdClicked = C1687s2.m4700a(messageButton);
                this.mBrazeManager.mo6243b((C1594h2) a);
                this.mButtonClickLogged = true;
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

    public void setCloseButtonColor(int i) {
        this.mCloseButtonColor = i;
    }

    public void setFrameColor(Integer num) {
        this.mFrameColor = num;
    }

    public void setHeader(String str) {
        this.mHeader = str;
    }

    public void setHeaderTextAlign(TextAlign textAlign) {
        this.mHeaderTextAlign = textAlign;
    }

    public void setHeaderTextColor(int i) {
        this.mHeaderTextColor = i;
    }

    public void setImageStyle(ImageStyle imageStyle) {
        this.mImageStyle = imageStyle;
    }

    public void setMessageButtons(List<MessageButton> list) {
        if (list == null) {
            AppboyLogger.m5459w(TAG, "Interpreted null parameter in setMessageButtons() by clearing message buttons. Please instead set an empty list.");
            this.mMessageButtons.clear();
            return;
        }
        this.mMessageButtons = list;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.mJsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.putOpt(HEADER, this.mHeader);
            forJsonPut.put(HEADER_TEXT_COLOR, this.mHeaderTextColor);
            forJsonPut.put("close_btn_color", this.mCloseButtonColor);
            forJsonPut.putOpt(IMAGE_STYLE, this.mImageStyle.toString());
            forJsonPut.putOpt(HEADER_TEXT_ALIGN, this.mHeaderTextAlign.toString());
            Integer num = this.mFrameColor;
            if (num != null) {
                forJsonPut.put(FRAME_COLOR, num.intValue());
            }
            if (this.mMessageButtons != null) {
                JSONArray jSONArray = new JSONArray();
                for (MessageButton forJsonPut2 : this.mMessageButtons) {
                    jSONArray.put(forJsonPut2.forJsonPut());
                }
                forJsonPut.put(BUTTONS, jSONArray);
            }
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InAppMessageImmersiveBase(org.json.JSONObject r12, p030bo.app.C1707v1 r13) {
        /*
            r11 = this;
            java.lang.Class<com.appboy.enums.inappmessage.TextAlign> r0 = com.appboy.enums.inappmessage.TextAlign.class
            java.lang.String r1 = "header"
            java.lang.String r5 = r12.optString(r1)
            java.lang.String r1 = "header_text_color"
            int r6 = r12.optInt(r1)
            java.lang.String r1 = "close_btn_color"
            int r7 = r12.optInt(r1)
            com.appboy.enums.inappmessage.ImageStyle r1 = com.appboy.enums.inappmessage.ImageStyle.TOP
            java.lang.Class<com.appboy.enums.inappmessage.ImageStyle> r2 = com.appboy.enums.inappmessage.ImageStyle.class
            java.lang.String r3 = "image_style"
            java.lang.Enum r1 = com.appboy.support.JsonUtils.optEnum(r12, r3, r2, r1)
            r8 = r1
            com.appboy.enums.inappmessage.ImageStyle r8 = (com.appboy.enums.inappmessage.ImageStyle) r8
            com.appboy.enums.inappmessage.TextAlign r1 = com.appboy.enums.inappmessage.TextAlign.CENTER
            java.lang.String r2 = "text_align_header"
            java.lang.Enum r2 = com.appboy.support.JsonUtils.optEnum(r12, r2, r0, r1)
            r9 = r2
            com.appboy.enums.inappmessage.TextAlign r9 = (com.appboy.enums.inappmessage.TextAlign) r9
            java.lang.String r2 = "text_align_message"
            java.lang.Enum r0 = com.appboy.support.JsonUtils.optEnum(r12, r2, r0, r1)
            r10 = r0
            com.appboy.enums.inappmessage.TextAlign r10 = (com.appboy.enums.inappmessage.TextAlign) r10
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r13 = "btns"
            org.json.JSONArray r13 = r12.optJSONArray(r13)
            org.json.JSONArray r12 = p030bo.app.C1665p4.m4609b(r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r13 == 0) goto L_0x0077
            r1 = 0
        L_0x004f:
            int r2 = r13.length()
            if (r1 >= r2) goto L_0x0077
            if (r12 != 0) goto L_0x0064
            com.appboy.models.MessageButton r2 = new com.appboy.models.MessageButton
            org.json.JSONObject r3 = r13.optJSONObject(r1)
            r2.<init>(r3)
            r0.add(r2)
            goto L_0x0074
        L_0x0064:
            com.appboy.models.MessageButton r2 = new com.appboy.models.MessageButton
            org.json.JSONObject r3 = r13.optJSONObject(r1)
            org.json.JSONObject r4 = r12.optJSONObject(r1)
            r2.<init>(r3, r4)
            r0.add(r2)
        L_0x0074:
            int r1 = r1 + 1
            goto L_0x004f
        L_0x0077:
            r11.setMessageButtons(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.models.InAppMessageImmersiveBase.<init>(org.json.JSONObject, bo.app.v1):void");
    }

    public InAppMessageImmersiveBase(JSONObject jSONObject, C1707v1 v1Var, String str, int i, int i2, ImageStyle imageStyle, TextAlign textAlign, TextAlign textAlign2) {
        super(jSONObject, v1Var);
        this.mHeaderTextColor = Color.parseColor("#333333");
        this.mCloseButtonColor = Color.parseColor("#9B9B9B");
        this.mMessageButtons = Collections.emptyList();
        this.mImageStyle = ImageStyle.TOP;
        this.mFrameColor = null;
        this.mHeaderTextAlign = TextAlign.CENTER;
        this.mButtonIdClicked = null;
        this.mHeader = str;
        this.mHeaderTextColor = i;
        this.mCloseButtonColor = i2;
        if (jSONObject.has(FRAME_COLOR)) {
            this.mFrameColor = Integer.valueOf(jSONObject.optInt(FRAME_COLOR));
        }
        this.mImageStyle = imageStyle;
        this.mHeaderTextAlign = textAlign;
        this.mMessageTextAlign = textAlign2;
    }
}
