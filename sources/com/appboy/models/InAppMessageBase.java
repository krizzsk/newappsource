package com.appboy.models;

import android.graphics.Color;
import android.net.Uri;
import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.enums.inappmessage.CropType;
import com.appboy.enums.inappmessage.DismissType;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.enums.inappmessage.Orientation;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p001a0.C0016g;
import p030bo.app.C1536b3;
import p030bo.app.C1594h2;
import p030bo.app.C1687s2;
import p030bo.app.C1707v1;
import p030bo.app.C1721w5;
import p030bo.app.C1739y5;

@Keep
public abstract class InAppMessageBase implements IInAppMessage, IInAppMessageThemeable {
    public static final String ANIMATE_IN = "animate_in";
    public static final String ANIMATE_OUT = "animate_out";
    public static final String BG_COLOR = "bg_color";
    public static final String CLICK_ACTION = "click_action";
    public static final String CROP_TYPE = "crop_type";
    public static final String DISMISS_TYPE = "message_close";
    public static final String DURATION = "duration";
    public static final String EXTRAS = "extras";
    public static final String ICON = "icon";
    public static final String ICON_BG_COLOR = "icon_bg_color";
    public static final String ICON_COLOR = "icon_color";
    public static final int INAPP_MESSAGE_DURATION_DEFAULT_MILLIS = 5000;
    public static final int INAPP_MESSAGE_DURATION_MIN_MILLIS = 999;
    public static final String IS_CONTROL = "is_control";
    public static final String MESSAGE = "message";
    public static final String MESSAGE_TEXT_ALIGN = "text_align_message";
    public static final String MESSAGE_TEXT_COLOR = "text_color";
    public static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    public static final String ORIENTATION = "orientation";
    public static final String TAG = AppboyLogger.getBrazeLogTag(InAppMessageBase.class);
    public static final String TRIGGER_ID = "trigger_id";
    public static final String TYPE = "type";
    public static final String URI = "uri";
    public boolean mAnimateIn;
    public boolean mAnimateOut;
    public int mBackgroundColor;
    public C1707v1 mBrazeManager;
    public ClickAction mClickAction;
    public boolean mClickLogged;
    public CropType mCropType;
    public DismissType mDismissType;
    public boolean mDisplayFailureLogged;
    public int mDurationInMilliseconds;
    public long mExpirationTimestamp;
    public Map<String, String> mExtras;
    public String mIcon;
    public int mIconBackgroundColor;
    public int mIconColor;
    public boolean mImpressionLogged;
    public C1536b3 mInAppMessageDarkThemeWrapper;
    public boolean mIsControl;
    public JSONObject mJsonObject;
    public String mMessage;
    public TextAlign mMessageTextAlign;
    public int mMessageTextColor;
    public boolean mOpenUriInWebview;
    public Orientation mOrientation;
    public String mTriggerId;
    public Uri mUri;

    public InAppMessageBase() {
        this.mAnimateIn = true;
        this.mAnimateOut = true;
        this.mClickAction = ClickAction.NONE;
        this.mDismissType = DismissType.AUTO_DISMISS;
        this.mDurationInMilliseconds = INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        this.mOrientation = Orientation.ANY;
        this.mCropType = CropType.FIT_CENTER;
        this.mMessageTextAlign = TextAlign.CENTER;
        this.mOpenUriInWebview = false;
        this.mBackgroundColor = -1;
        this.mMessageTextColor = Color.parseColor("#555555");
        this.mIconColor = -1;
        this.mIconBackgroundColor = Color.parseColor("#ff0073d5");
        this.mImpressionLogged = false;
        this.mClickLogged = false;
        this.mDisplayFailureLogged = false;
        this.mIsControl = false;
        this.mExpirationTimestamp = -1;
    }

    public void enableDarkTheme() {
        C1536b3 b3Var = this.mInAppMessageDarkThemeWrapper;
        if (b3Var == null) {
            AppboyLogger.m5448d(TAG, "Cannot apply dark theme with a null themes wrapper");
            return;
        }
        if (b3Var.mo5915a() != null) {
            this.mBackgroundColor = this.mInAppMessageDarkThemeWrapper.mo5915a().intValue();
        }
        if (this.mInAppMessageDarkThemeWrapper.mo5920f() != null) {
            this.mIconColor = this.mInAppMessageDarkThemeWrapper.mo5920f().intValue();
        }
        if (this.mInAppMessageDarkThemeWrapper.mo5919e() != null) {
            this.mIconBackgroundColor = this.mInAppMessageDarkThemeWrapper.mo5919e().intValue();
        }
        if (this.mInAppMessageDarkThemeWrapper.mo5921g() != null) {
            this.mMessageTextColor = this.mInAppMessageDarkThemeWrapper.mo5921g().intValue();
        }
    }

    public boolean getAnimateIn() {
        return this.mAnimateIn;
    }

    public boolean getAnimateOut() {
        return this.mAnimateOut;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public ClickAction getClickAction() {
        return this.mClickAction;
    }

    public CropType getCropType() {
        return this.mCropType;
    }

    public DismissType getDismissType() {
        return this.mDismissType;
    }

    public int getDurationInMilliseconds() {
        return this.mDurationInMilliseconds;
    }

    public long getExpirationTimestamp() {
        return this.mExpirationTimestamp;
    }

    public Map<String, String> getExtras() {
        return this.mExtras;
    }

    public String getIcon() {
        return this.mIcon;
    }

    public int getIconBackgroundColor() {
        return this.mIconBackgroundColor;
    }

    public int getIconColor() {
        return this.mIconColor;
    }

    public Map<String, String> getLocalPrefetchedAssetPaths() {
        return Collections.emptyMap();
    }

    public String getMessage() {
        return this.mMessage;
    }

    public TextAlign getMessageTextAlign() {
        return this.mMessageTextAlign;
    }

    public int getMessageTextColor() {
        return this.mMessageTextColor;
    }

    public boolean getOpenUriInWebView() {
        return this.mOpenUriInWebview;
    }

    public Orientation getOrientation() {
        return this.mOrientation;
    }

    public List<String> getRemoteAssetPathsForPrefetch() {
        return Collections.emptyList();
    }

    public String getTriggerId() {
        return this.mTriggerId;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean isControl() {
        return this.mIsControl;
    }

    public boolean logClick() {
        if (StringUtils.isNullOrBlank(this.mTriggerId)) {
            AppboyLogger.m5448d(TAG, "Trigger id not found. Not logging in-app message click.");
            return false;
        } else if (this.mClickLogged && !getMessageType().equals(MessageType.HTML)) {
            AppboyLogger.m5453i(TAG, "Click already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.mDisplayFailureLogged) {
            AppboyLogger.m5453i(TAG, "Display failure already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.mBrazeManager == null) {
            AppboyLogger.m5459w(TAG, "Cannot log an in-app message click because the AppboyManager is null.");
            return false;
        } else {
            AppboyLogger.m5457v(TAG, "Logging click on in-app message");
            try {
                this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4716h(this.mTriggerId));
                this.mClickLogged = true;
                return true;
            } catch (JSONException e) {
                this.mBrazeManager.mo6242b((Throwable) e);
                return false;
            }
        }
    }

    public boolean logDisplayFailure(InAppMessageFailureType inAppMessageFailureType) {
        if (StringUtils.isNullOrBlank(this.mTriggerId)) {
            AppboyLogger.m5448d(TAG, "Trigger id not found. Not logging in-app message display failure.");
            return false;
        } else if (this.mDisplayFailureLogged) {
            AppboyLogger.m5453i(TAG, "Display failure already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.mClickLogged) {
            AppboyLogger.m5453i(TAG, "Click already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.mImpressionLogged) {
            AppboyLogger.m5453i(TAG, "Impression already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.mBrazeManager == null) {
            AppboyLogger.m5459w(TAG, "Cannot log an in-app message display failure because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4693a(this.mTriggerId, inAppMessageFailureType));
                this.mDisplayFailureLogged = true;
                return true;
            } catch (JSONException e) {
                this.mBrazeManager.mo6242b((Throwable) e);
                return false;
            }
        }
    }

    public boolean logImpression() {
        if (StringUtils.isNullOrEmpty(this.mTriggerId)) {
            AppboyLogger.m5448d(TAG, "Trigger id not found. Not logging in-app message impression.");
            return false;
        } else if (this.mImpressionLogged) {
            AppboyLogger.m5453i(TAG, "Impression already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.mDisplayFailureLogged) {
            AppboyLogger.m5453i(TAG, "Display failure already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.mBrazeManager == null) {
            AppboyLogger.m5459w(TAG, "Cannot log an in-app message impression because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4718j(this.mTriggerId));
                this.mImpressionLogged = true;
                return true;
            } catch (JSONException e) {
                this.mBrazeManager.mo6242b((Throwable) e);
                return false;
            }
        }
    }

    public void onAfterClosed() {
        if (this.mClickLogged && !StringUtils.isNullOrEmpty(this.mTriggerId)) {
            this.mBrazeManager.mo6235a((C1721w5) new C1739y5(this.mTriggerId));
        }
    }

    public void setAnimateIn(boolean z) {
        this.mAnimateIn = z;
    }

    public void setAnimateOut(boolean z) {
        this.mAnimateOut = z;
    }

    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public boolean setClickAction(ClickAction clickAction) {
        if (clickAction != ClickAction.URI) {
            this.mClickAction = clickAction;
            this.mUri = null;
            return true;
        }
        AppboyLogger.m5459w(TAG, "A non-null URI is required in order to set the message ClickAction to URI.");
        return false;
    }

    public void setCropType(CropType cropType) {
        this.mCropType = cropType;
    }

    public void setDismissType(DismissType dismissType) {
        this.mDismissType = dismissType;
    }

    public void setDurationInMilliseconds(int i) {
        if (i < 999) {
            this.mDurationInMilliseconds = INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
            String str = TAG;
            StringBuilder s = C0016g.m35s("Requested in-app message duration ", i, " is lower than the minimum of ", INAPP_MESSAGE_DURATION_MIN_MILLIS, ". Defaulting to ");
            s.append(this.mDurationInMilliseconds);
            s.append(" milliseconds.");
            AppboyLogger.m5448d(str, s.toString());
            return;
        }
        this.mDurationInMilliseconds = i;
        String str2 = TAG;
        StringBuilder k = C13555b.m33972k("Set in-app message duration to ");
        k.append(this.mDurationInMilliseconds);
        k.append(" milliseconds.");
        AppboyLogger.m5448d(str2, k.toString());
    }

    public void setExpirationTimestamp(long j) {
        this.mExpirationTimestamp = j;
    }

    public void setExtras(Map<String, String> map) {
        this.mExtras = map;
    }

    public void setIcon(String str) {
        this.mIcon = str;
    }

    public void setIconBackgroundColor(int i) {
        this.mIconBackgroundColor = i;
    }

    public void setIconColor(int i) {
        this.mIconColor = i;
    }

    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        this.mMessageTextAlign = textAlign;
    }

    public void setMessageTextColor(int i) {
        this.mMessageTextColor = i;
    }

    public void setOpenUriInWebView(boolean z) {
        this.mOpenUriInWebview = z;
    }

    public void setOrientation(Orientation orientation) {
        this.mOrientation = orientation;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.mJsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(MESSAGE, this.mMessage);
            jSONObject2.put(DURATION, this.mDurationInMilliseconds);
            jSONObject2.putOpt(TRIGGER_ID, this.mTriggerId);
            jSONObject2.putOpt("click_action", this.mClickAction.toString());
            jSONObject2.putOpt(DISMISS_TYPE, this.mDismissType.toString());
            Uri uri = this.mUri;
            if (uri != null) {
                jSONObject2.put("uri", uri.toString());
            }
            jSONObject2.put("use_webview", this.mOpenUriInWebview);
            jSONObject2.put(ANIMATE_IN, this.mAnimateIn);
            jSONObject2.put(ANIMATE_OUT, this.mAnimateOut);
            jSONObject2.put("bg_color", this.mBackgroundColor);
            jSONObject2.put("text_color", this.mMessageTextColor);
            jSONObject2.put(ICON_COLOR, this.mIconColor);
            jSONObject2.put(ICON_BG_COLOR, this.mIconBackgroundColor);
            jSONObject2.putOpt("icon", this.mIcon);
            jSONObject2.putOpt(CROP_TYPE, this.mCropType.toString());
            jSONObject2.putOpt("orientation", this.mOrientation.toString());
            jSONObject2.putOpt(MESSAGE_TEXT_ALIGN, this.mMessageTextAlign.toString());
            jSONObject2.putOpt(IS_CONTROL, Boolean.valueOf(this.mIsControl));
            if (this.mExtras != null) {
                JSONObject jSONObject3 = new JSONObject();
                for (String next : this.mExtras.keySet()) {
                    jSONObject3.put(next, this.mExtras.get(next));
                }
                jSONObject2.put(EXTRAS, jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean setClickAction(ClickAction clickAction, Uri uri) {
        if (uri == null && clickAction == ClickAction.URI) {
            AppboyLogger.m5459w(TAG, "A non-null URI is required in order to set the message ClickAction to URI.");
            return false;
        } else if (uri == null || clickAction != ClickAction.URI) {
            return setClickAction(clickAction);
        } else {
            this.mClickAction = clickAction;
            this.mUri = uri;
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InAppMessageBase(org.json.JSONObject r26, p030bo.app.C1707v1 r27) {
        /*
            r25 = this;
            r15 = r26
            r0 = r25
            r20 = r26
            r21 = r27
            java.lang.String r1 = "message"
            java.lang.String r1 = r15.optString(r1)
            java.lang.String r2 = "extras"
            org.json.JSONObject r2 = r15.optJSONObject(r2)
            java.util.Map r2 = com.appboy.support.JsonUtils.convertJSONObjectToMap(r2)
            java.lang.String r3 = "animate_in"
            r4 = 1
            boolean r3 = r15.optBoolean(r3, r4)
            java.lang.String r5 = "animate_out"
            boolean r4 = r15.optBoolean(r5, r4)
            com.appboy.enums.inappmessage.ClickAction r5 = com.appboy.enums.inappmessage.ClickAction.NONE
            java.lang.Class<com.appboy.enums.inappmessage.ClickAction> r6 = com.appboy.enums.inappmessage.ClickAction.class
            java.lang.String r7 = "click_action"
            java.lang.Enum r5 = com.appboy.support.JsonUtils.optEnum(r15, r7, r6, r5)
            com.appboy.enums.inappmessage.ClickAction r5 = (com.appboy.enums.inappmessage.ClickAction) r5
            java.lang.String r6 = "uri"
            java.lang.String r6 = r15.optString(r6)
            java.lang.String r7 = "bg_color"
            int r7 = r15.optInt(r7)
            java.lang.String r8 = "icon_color"
            int r8 = r15.optInt(r8)
            java.lang.String r9 = "icon_bg_color"
            int r9 = r15.optInt(r9)
            java.lang.String r10 = "text_color"
            int r10 = r15.optInt(r10)
            java.lang.String r11 = "icon"
            java.lang.String r11 = r15.optString(r11)
            com.appboy.enums.inappmessage.DismissType r12 = com.appboy.enums.inappmessage.DismissType.AUTO_DISMISS
            java.lang.Class<com.appboy.enums.inappmessage.DismissType> r13 = com.appboy.enums.inappmessage.DismissType.class
            java.lang.String r14 = "message_close"
            java.lang.Enum r12 = com.appboy.support.JsonUtils.optEnum(r15, r14, r13, r12)
            com.appboy.enums.inappmessage.DismissType r12 = (com.appboy.enums.inappmessage.DismissType) r12
            java.lang.String r13 = "duration"
            int r13 = r15.optInt(r13)
            java.lang.String r14 = "trigger_id"
            java.lang.String r14 = r15.optString(r14)
            r23 = r0
            com.appboy.enums.inappmessage.Orientation r0 = com.appboy.enums.inappmessage.Orientation.ANY
            r27 = r1
            java.lang.Class<com.appboy.enums.inappmessage.Orientation> r1 = com.appboy.enums.inappmessage.Orientation.class
            r24 = r2
            java.lang.String r2 = "orientation"
            java.lang.Enum r0 = com.appboy.support.JsonUtils.optEnum(r15, r2, r1, r0)
            r17 = r0
            com.appboy.enums.inappmessage.Orientation r17 = (com.appboy.enums.inappmessage.Orientation) r17
            java.lang.String r0 = "use_webview"
            r1 = 0
            boolean r18 = r15.optBoolean(r0, r1)
            java.lang.String r0 = "is_control"
            boolean r19 = r15.optBoolean(r0)
            bo.app.b3 r22 = p030bo.app.C1665p4.m4606a(r26)
            r15 = 0
            r16 = 0
            r1 = r27
            r0 = r23
            r2 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.models.InAppMessageBase.<init>(org.json.JSONObject, bo.app.v1):void");
    }

    public InAppMessageBase(String str, Map<String, String> map, boolean z, boolean z2, ClickAction clickAction, String str2, int i, int i2, int i3, int i4, String str3, DismissType dismissType, int i5, String str4, boolean z3, boolean z4, Orientation orientation, boolean z5, boolean z6, JSONObject jSONObject, C1707v1 v1Var, C1536b3 b3Var) {
        ClickAction clickAction2 = clickAction;
        DismissType dismissType2 = dismissType;
        this.mAnimateIn = true;
        this.mAnimateOut = true;
        this.mClickAction = ClickAction.NONE;
        this.mDismissType = DismissType.AUTO_DISMISS;
        this.mDurationInMilliseconds = INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        this.mOrientation = Orientation.ANY;
        this.mCropType = CropType.FIT_CENTER;
        this.mMessageTextAlign = TextAlign.CENTER;
        this.mOpenUriInWebview = false;
        this.mBackgroundColor = -1;
        this.mMessageTextColor = Color.parseColor("#555555");
        this.mIconColor = -1;
        this.mIconBackgroundColor = Color.parseColor("#ff0073d5");
        this.mImpressionLogged = false;
        this.mClickLogged = false;
        this.mDisplayFailureLogged = false;
        this.mIsControl = false;
        this.mExpirationTimestamp = -1;
        this.mMessage = str;
        this.mExtras = map;
        this.mAnimateIn = z;
        this.mAnimateOut = z2;
        this.mClickAction = clickAction2;
        if (clickAction2 == ClickAction.URI && !StringUtils.isNullOrBlank(str2)) {
            this.mUri = Uri.parse(str2);
        }
        if (dismissType2 == DismissType.SWIPE) {
            this.mDismissType = DismissType.MANUAL;
        } else {
            this.mDismissType = dismissType2;
        }
        setDurationInMilliseconds(i5);
        this.mBackgroundColor = i;
        this.mIconColor = i2;
        this.mIconBackgroundColor = i3;
        this.mMessageTextColor = i4;
        this.mIcon = str3;
        this.mOrientation = orientation;
        this.mTriggerId = str4;
        this.mImpressionLogged = z3;
        this.mClickLogged = z4;
        this.mOpenUriInWebview = z5;
        this.mIsControl = z6;
        this.mJsonObject = jSONObject;
        this.mBrazeManager = v1Var;
        this.mInAppMessageDarkThemeWrapper = b3Var;
    }
}
