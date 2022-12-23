package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import com.appboy.models.InAppMessageWithImageBase;
import com.appboy.models.outgoing.AttributionData;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.models.outgoing.TwitterUser;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.JsonUtils;
import com.appboy.support.StringUtils;
import com.appboy.support.ValidationUtils;
import com.appsflyer.ServerParameters;
import com.braze.enums.BrazeDateFormat;
import com.usebutton.sdk.context.Identifiers;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.g4 */
public class C1587g4 extends C1688s3<C1680r2> {

    /* renamed from: j */
    public static final String f5716j = AppboyLogger.getBrazeLogTag(C1587g4.class);

    /* renamed from: d */
    public final C1742z1 f5717d;

    /* renamed from: e */
    public final C1558d4 f5718e;

    /* renamed from: f */
    public final String f5719f;

    /* renamed from: g */
    public final C1550c4 f5720g;

    /* renamed from: h */
    public final SharedPreferences f5721h;

    /* renamed from: i */
    public final SharedPreferences f5722i;

    public C1587g4(Context context, C1742z1 z1Var, C1558d4 d4Var, C1550c4 c4Var) {
        this(context, (String) null, (String) null, z1Var, d4Var, c4Var);
    }

    /* renamed from: a */
    public synchronized void mo6087a(Gender gender) {
        if (gender == null) {
            mo6105c("gender", (Object) null);
        } else {
            mo6105c("gender", gender.forJsonPut());
        }
    }

    /* renamed from: d */
    public synchronized void mo6107d(String str) {
        mo6105c(FacebookUser.FIRST_NAME_KEY, str);
    }

    /* renamed from: e */
    public synchronized void mo6109e(String str) {
        mo6105c("home_city", str);
    }

    /* renamed from: f */
    public synchronized void mo6111f(String str) {
        mo6105c("language", str);
    }

    /* renamed from: g */
    public synchronized void mo6113g(String str) {
        mo6105c(FacebookUser.LAST_NAME_KEY, str);
    }

    /* renamed from: h */
    public synchronized boolean mo6115h(String str) {
        if (str != null) {
            try {
                str = str.trim();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            if (!ValidationUtils.isValidPhoneNumber(str)) {
                String str2 = f5716j;
                AppboyLogger.m5459w(str2, "Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): " + str);
                return false;
            }
        }
        return mo6105c("phone", str);
    }

    /* renamed from: i */
    public synchronized void mo6116i(String str) {
        mo6105c("user_id", str);
    }

    /* renamed from: j */
    public synchronized boolean mo6117j(String str) {
        if (!C1604i4.m4315a(str, this.f5718e.mo6006b())) {
            AppboyLogger.m5459w(f5716j, "Custom attribute key cannot be null.");
            return false;
        }
        return mo6101b(ValidationUtils.ensureBrazeFieldLength(str), JSONObject.NULL);
    }

    public C1587g4(Context context, String str, String str2, C1742z1 z1Var, C1558d4 d4Var, C1550c4 c4Var) {
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str, str2);
        this.f5721h = context.getSharedPreferences("com.appboy.storage.user_cache.v3" + cacheFileSuffix, 0);
        this.f5722i = context.getSharedPreferences("com.appboy.storage.user_cache.push_token_store" + cacheFileSuffix, 0);
        this.f5717d = z1Var;
        this.f5718e = d4Var;
        this.f5719f = str;
        this.f5720g = c4Var;
    }

    /* renamed from: b */
    public synchronized void mo6100b(String str) {
        mo6105c(ServerParameters.COUNTRY, str);
    }

    /* renamed from: c */
    public synchronized boolean mo6104c(String str) {
        if (str != null) {
            try {
                str = str.trim();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            if (!ValidationUtils.isValidEmailAddress(str)) {
                String str2 = f5716j;
                AppboyLogger.m5459w(str2, "Email address is not valid: " + str);
                return false;
            }
        }
        return mo6105c("email", str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo6106d() {
        /*
            r3 = this;
            org.json.JSONObject r0 = r3.mo6110f()
            java.lang.String r1 = "custom"
            boolean r2 = r0.has(r1)
            if (r2 == 0) goto L_0x0019
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch:{ JSONException -> 0x0011 }
            goto L_0x001a
        L_0x0011:
            r0 = move-exception
            java.lang.String r1 = f5716j
            java.lang.String r2 = "Could not create custom attributes json object from preferences."
            com.appboy.support.AppboyLogger.m5452e(r1, r2, r0)
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x0021
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1587g4.mo6106d():org.json.JSONObject");
    }

    /* renamed from: e */
    public String mo6108e() {
        return this.f5719f;
    }

    /* renamed from: f */
    public JSONObject mo6110f() {
        String string = this.f5721h.getString("user_cache_attributes_object", (String) null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            String str = f5716j;
            AppboyLogger.m5452e(str, "Failed to load user object json from prefs with json string: " + string, e);
            return new JSONObject();
        }
    }

    /* renamed from: g */
    public synchronized void mo6112g() {
        AppboyLogger.m5457v(f5716j, "Push token cache cleared.");
        this.f5722i.edit().clear().apply();
    }

    /* renamed from: a */
    public synchronized boolean mo6094a(int i, Month month, int i2) {
        if (month == null) {
            AppboyLogger.m5459w(f5716j, "Month cannot be null.");
            return false;
        }
        return mo6105c("dob", DateTimeUtils.formatDate(DateTimeUtils.createDate(i, month.getValue(), i2), BrazeDateFormat.SHORT));
    }

    /* renamed from: b */
    public synchronized void mo6098b(NotificationSubscriptionType notificationSubscriptionType) {
        if (notificationSubscriptionType == null) {
            mo6105c("push_subscribe", (Object) null);
        } else {
            mo6105c("push_subscribe", notificationSubscriptionType.forJsonPut());
        }
    }

    /* renamed from: b */
    public final boolean mo6102b(JSONObject jSONObject) {
        if (this.f5720g.mo5958a()) {
            AppboyLogger.m5459w(f5716j, "SDK is disabled. Not writing to user cache.");
            return false;
        }
        SharedPreferences.Editor edit = this.f5721h.edit();
        edit.putString("user_cache_attributes_object", jSONObject.toString());
        edit.apply();
        return true;
    }

    /* renamed from: h */
    public C1680r2 mo6103c() {
        if (!StringUtils.isNullOrEmpty(this.f5719f)) {
            mo6116i(this.f5719f);
        }
        JSONObject f = mo6110f();
        try {
            mo6093a(f);
        } catch (JSONException e) {
            AppboyLogger.m5452e(f5716j, "Couldn't add push token to outbound json", e);
        }
        this.f5721h.edit().clear().apply();
        return new C1680r2(f);
    }

    /* renamed from: c */
    public final boolean mo6105c(String str, Object obj) {
        JSONObject f = mo6110f();
        if (obj == null) {
            try {
                f.put(str, JSONObject.NULL);
            } catch (JSONException unused) {
                String str2 = f5716j;
                AppboyLogger.m5459w(str2, "Failed to write to user object json from prefs with key: [" + str + "] value: [" + obj + "] ");
                return false;
            }
        } else {
            f.put(str, obj);
        }
        return mo6102b(f);
    }

    /* renamed from: a */
    public synchronized void mo6088a(NotificationSubscriptionType notificationSubscriptionType) {
        if (notificationSubscriptionType == null) {
            mo6105c("email_subscribe", (Object) null);
        } else {
            mo6105c("email_subscribe", notificationSubscriptionType.forJsonPut());
        }
    }

    /* renamed from: a */
    public synchronized void mo6091a(TwitterUser twitterUser) {
        mo6097a("twitter", twitterUser != null ? twitterUser.forJsonPut() : null);
    }

    /* renamed from: a */
    public synchronized void mo6090a(FacebookUser facebookUser) {
        mo6097a(Identifiers.IDENTIFIER_FACEBOOK, facebookUser != null ? facebookUser.forJsonPut() : null);
    }

    /* renamed from: b */
    public boolean mo6101b(String str, Object obj) {
        JSONObject d = mo6106d();
        if (obj == null) {
            try {
                d.put(str, JSONObject.NULL);
            } catch (JSONException e) {
                String str2 = f5716j;
                AppboyLogger.m5460w(str2, "Could not write to custom attributes json object with key: [" + str + "] value: [" + obj + "] ", e);
                return false;
            }
        } else {
            d.put(str, obj);
        }
        return mo6105c("custom", d);
    }

    /* renamed from: a */
    public synchronized void mo6089a(AttributionData attributionData) {
        mo6097a("ab_install_attribution", attributionData != null ? attributionData.forJsonPut() : null);
    }

    /* renamed from: a */
    public synchronized void mo6092a(String str) {
        mo6105c(InAppMessageWithImageBase.REMOTE_IMAGE_URL, str);
    }

    /* renamed from: a */
    public synchronized boolean mo6096a(String str, Object obj) {
        if (!C1604i4.m4315a(str, this.f5718e.mo6006b())) {
            AppboyLogger.m5459w(f5716j, "Custom attribute key cannot be null.");
            return false;
        }
        String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
        if (!(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Long)) {
            if (!(obj instanceof Double)) {
                if (obj instanceof String) {
                    return mo6101b(ensureBrazeFieldLength, (Object) ValidationUtils.ensureBrazeFieldLength((String) obj));
                } else if (obj instanceof Date) {
                    return mo6101b(ensureBrazeFieldLength, (Object) DateTimeUtils.formatDate((Date) obj, BrazeDateFormat.LONG));
                } else if (obj instanceof String[]) {
                    return mo6101b(ensureBrazeFieldLength, (Object) JsonUtils.constructJsonArray((T[]) (String[]) obj));
                } else {
                    String str2 = f5716j;
                    AppboyLogger.m5459w(str2, "Could not add unsupported custom attribute type with key: " + ensureBrazeFieldLength + " and value: " + obj);
                    return false;
                }
            }
        }
        return mo6101b(ensureBrazeFieldLength, obj);
    }

    /* renamed from: a */
    public synchronized boolean mo6095a(String str, long j) {
        return mo6096a(str, (Object) DateTimeUtils.createDate(j));
    }

    /* renamed from: a */
    public void mo6093a(JSONObject jSONObject) {
        String a = this.f5717d.mo5912a();
        if (a == null) {
            AppboyLogger.m5448d(f5716j, "Cannot add null push token to attributes object.");
        } else if (!a.equals(this.f5722i.getString("push_token", (String) null))) {
            jSONObject.put("push_token", a);
        }
    }

    /* renamed from: a */
    public void mo6099b(C1680r2 r2Var, boolean z) {
        if (r2Var == null || r2Var.mo6346w() == null) {
            AppboyLogger.m5448d(f5716j, "Tried to confirm with a null outbound user. Doing nothing.");
            return;
        }
        JSONObject w = r2Var.mo6346w();
        if (!z) {
            JSONObject f = mo6110f();
            JSONObject mergeJsonObjects = JsonUtils.mergeJsonObjects(w, f);
            mergeJsonObjects.remove("push_token");
            JSONObject optJSONObject = f.optJSONObject("custom");
            JSONObject optJSONObject2 = w.optJSONObject("custom");
            if (optJSONObject != null && optJSONObject2 != null) {
                try {
                    mergeJsonObjects.put("custom", JsonUtils.mergeJsonObjects(optJSONObject2, optJSONObject));
                } catch (JSONException e) {
                    AppboyLogger.m5460w(f5716j, "Failed to add merged custom attributes back to user object.", e);
                }
            } else if (optJSONObject != null) {
                mergeJsonObjects.put("custom", optJSONObject);
            } else if (optJSONObject2 != null) {
                mergeJsonObjects.put("custom", optJSONObject2);
            }
            SharedPreferences.Editor edit = this.f5721h.edit();
            edit.putString("user_cache_attributes_object", mergeJsonObjects.toString());
            edit.apply();
        } else if (w.has("push_token")) {
            SharedPreferences.Editor edit2 = this.f5722i.edit();
            edit2.putString("push_token", w.optString("push_token"));
            edit2.apply();
        }
    }

    /* renamed from: a */
    public boolean mo6097a(String str, JSONObject jSONObject) {
        JSONObject f = mo6110f();
        if (jSONObject == null) {
            try {
                f.put(str, JSONObject.NULL);
            } catch (JSONException unused) {
                String str2 = f5716j;
                AppboyLogger.m5459w(str2, "Failed to write to user object json from prefs with key: [" + str + "] value: [" + jSONObject + "] ");
                return false;
            }
        } else {
            JSONObject optJSONObject = f.optJSONObject(str);
            if (optJSONObject != null) {
                f.put(str, JsonUtils.mergeJsonObjects(optJSONObject, jSONObject));
            } else {
                f.put(str, jSONObject);
            }
        }
        return mo6102b(f);
    }
}
