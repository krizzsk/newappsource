package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.internal.C2440z;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.LoginClient;
import java.util.Set;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p262t8.C6606a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new C2456a();

    /* renamed from: e */
    public final String f8783e = "instagram_login";

    /* renamed from: f */
    public final AccessTokenSource f8784f = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;

    /* renamed from: com.facebook.login.InstagramAppLoginMethodHandler$a */
    public static final class C2456a implements Parcelable.Creator<InstagramAppLoginMethodHandler> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new InstagramAppLoginMethodHandler(parcel);
        }

        public final Object[] newArray(int i) {
            return new InstagramAppLoginMethodHandler[i];
        }
    }

    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public final String mo12608g() {
        return this.f8783e;
    }

    /* renamed from: o */
    public final int mo12612o(LoginClient.Request request) {
        Class<C2440z> cls;
        LoginClient.Request request2 = request;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        C24362h.m61210e(jSONObject2, "e2e.toString()");
        C2440z zVar = C2440z.f8743a;
        Context g = mo12682f().mo12659g();
        if (g == null) {
            g = C0115o.m210a();
        }
        String str = request2.f8801e;
        Set<String> set = request2.f8799c;
        boolean b = request.mo12666b();
        DefaultAudience defaultAudience = request2.f8800d;
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        DefaultAudience defaultAudience2 = defaultAudience;
        String d = mo12681d(request2.f8802f);
        String str2 = request2.f8805i;
        String str3 = request2.f8807k;
        boolean z = request2.f8808l;
        boolean z2 = request2.f8810n;
        boolean z3 = request2.f8811o;
        Class<C2440z> cls2 = C2440z.class;
        Intent intent = null;
        if (!C6606a.m15601b(cls2)) {
            try {
                C24362h.m61211f(str, "applicationId");
                C24362h.m61211f(set, "permissions");
                C24362h.m61211f(defaultAudience2, "defaultAudience");
                C24362h.m61211f(str2, "authType");
                cls = cls2;
                try {
                    intent = C2440z.m6412s(g, C2440z.f8743a.mo12599d(new C2440z.C2442b(), str, set, jSONObject2, b, defaultAudience2, d, str2, false, str3, z, LoginTargetApp.INSTAGRAM, z2, z3, ""));
                } catch (Throwable th) {
                    th = th;
                    C6606a.m15600a(cls, th);
                    mo12680b(jSONObject2, "e2e");
                    CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
                    return mo12689u(intent) ? 1 : 0;
                }
            } catch (Throwable th2) {
                th = th2;
                cls = cls2;
                C6606a.m15600a(cls, th);
                mo12680b(jSONObject2, "e2e");
                CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
                return mo12689u(intent) ? 1 : 0;
            }
        }
        mo12680b(jSONObject2, "e2e");
        CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        return mo12689u(intent) ? 1 : 0;
    }

    /* renamed from: r */
    public final AccessTokenSource mo12641r() {
        return this.f8784f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        super.writeToParcel(parcel, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "source");
    }
}
