package com.appboy.models;

import android.graphics.Color;
import android.net.Uri;
import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1549c3;

@Keep
public class MessageButton implements IPutIntoJson<JSONObject>, IInAppMessageThemeable {
    public static final String BG_COLOR = "bg_color";
    public static final String BORDER_COLOR = "border_color";
    public static final String CLICK_ACTION = "click_action";

    /* renamed from: ID */
    public static final String f6843ID = "id";
    public static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    public static final String TAG = AppboyLogger.getBrazeLogTag(MessageButton.class);
    public static final String TEXT = "text";
    public static final String TEXT_COLOR = "text_color";
    public static final String URI = "uri";
    public int mBackgroundColor;
    public int mBorderColor;
    public ClickAction mClickAction;
    public int mId;
    public JSONObject mJsonObject;
    public C1549c3 mMessageButtonTheme;
    public boolean mOpenUriInWebview;
    public String mText;
    public int mTextColor;
    public Uri mUri;

    public MessageButton() {
        this.mId = -1;
        this.mClickAction = ClickAction.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.mBackgroundColor = parseColor;
        this.mTextColor = -1;
        this.mBorderColor = parseColor;
    }

    public void enableDarkTheme() {
        C1549c3 c3Var = this.mMessageButtonTheme;
        if (c3Var == null) {
            AppboyLogger.m5448d(TAG, "Cannot apply dark theme with a null themes wrapper");
            return;
        }
        if (c3Var.mo5954a() != null) {
            this.mBackgroundColor = this.mMessageButtonTheme.mo5954a().intValue();
        }
        if (this.mMessageButtonTheme.mo5956c() != null) {
            this.mTextColor = this.mMessageButtonTheme.mo5956c().intValue();
        }
        if (this.mMessageButtonTheme.mo5955b() != null) {
            this.mBorderColor = this.mMessageButtonTheme.mo5955b().intValue();
        }
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public ClickAction getClickAction() {
        return this.mClickAction;
    }

    public int getId() {
        return this.mId;
    }

    public boolean getOpenUriInWebview() {
        return this.mOpenUriInWebview;
    }

    public String getText() {
        return this.mText;
    }

    public int getTextColor() {
        return this.mTextColor;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public void setBorderColor(int i) {
        this.mBorderColor = i;
    }

    public boolean setClickAction(ClickAction clickAction) {
        if (clickAction != ClickAction.URI) {
            this.mClickAction = clickAction;
            this.mUri = null;
            return true;
        }
        AppboyLogger.m5459w(TAG, "A non-null URI is required in order to set the button ClickAction to URI.");
        return false;
    }

    public void setOpenUriInWebview(boolean z) {
        this.mOpenUriInWebview = z;
    }

    public void setText(String str) {
        this.mText = str;
    }

    public void setTextColor(int i) {
        this.mTextColor = i;
    }

    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.mId);
            jSONObject.put("click_action", this.mClickAction.toString());
            Uri uri = this.mUri;
            if (uri != null) {
                jSONObject.put("uri", uri.toString());
            }
            jSONObject.putOpt(TEXT, this.mText);
            jSONObject.put("bg_color", this.mBackgroundColor);
            jSONObject.put("text_color", this.mTextColor);
            jSONObject.put("use_webview", this.mOpenUriInWebview);
            jSONObject.put(BORDER_COLOR, this.mBorderColor);
            return jSONObject;
        } catch (JSONException unused) {
            return this.mJsonObject;
        }
    }

    public boolean setClickAction(ClickAction clickAction, Uri uri) {
        if (uri == null && clickAction == ClickAction.URI) {
            AppboyLogger.m5459w(TAG, "A non-null URI is required in order to set the button ClickAction to URI.");
            return false;
        } else if (uri == null || clickAction != ClickAction.URI) {
            return setClickAction(clickAction);
        } else {
            this.mClickAction = clickAction;
            this.mUri = uri;
            return true;
        }
    }

    public MessageButton(JSONObject jSONObject) {
        this(jSONObject, (JSONObject) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MessageButton(org.json.JSONObject r14, org.json.JSONObject r15) {
        /*
            r13 = this;
            java.lang.String r0 = "id"
            r1 = -1
            int r5 = r14.optInt(r0, r1)
            com.appboy.enums.inappmessage.ClickAction r0 = com.appboy.enums.inappmessage.ClickAction.NEWS_FEED
            java.lang.Class<com.appboy.enums.inappmessage.ClickAction> r1 = com.appboy.enums.inappmessage.ClickAction.class
            java.lang.String r2 = "click_action"
            java.lang.Enum r0 = com.appboy.support.JsonUtils.optEnum(r14, r2, r1, r0)
            r6 = r0
            com.appboy.enums.inappmessage.ClickAction r6 = (com.appboy.enums.inappmessage.ClickAction) r6
            java.lang.String r0 = "uri"
            java.lang.String r7 = r14.optString(r0)
            java.lang.String r0 = "text"
            java.lang.String r8 = r14.optString(r0)
            java.lang.String r0 = "bg_color"
            int r9 = r14.optInt(r0)
            java.lang.String r0 = "text_color"
            int r10 = r14.optInt(r0)
            java.lang.String r0 = "use_webview"
            r1 = 0
            boolean r11 = r14.optBoolean(r0, r1)
            java.lang.String r0 = "border_color"
            int r12 = r14.optInt(r0)
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.models.MessageButton.<init>(org.json.JSONObject, org.json.JSONObject):void");
    }

    public MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i, ClickAction clickAction, String str, String str2, int i2, int i3, boolean z, int i4) {
        this.mId = -1;
        this.mClickAction = ClickAction.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.mBackgroundColor = parseColor;
        this.mTextColor = -1;
        this.mBorderColor = parseColor;
        this.mJsonObject = jSONObject;
        this.mId = i;
        this.mClickAction = clickAction;
        if (clickAction == ClickAction.URI && !StringUtils.isNullOrBlank(str)) {
            this.mUri = Uri.parse(str);
        }
        this.mText = str2;
        this.mBackgroundColor = i2;
        this.mTextColor = i3;
        this.mOpenUriInWebview = z;
        this.mBorderColor = i4;
        this.mMessageButtonTheme = jSONObject2 != null ? new C1549c3(jSONObject2) : null;
    }
}
