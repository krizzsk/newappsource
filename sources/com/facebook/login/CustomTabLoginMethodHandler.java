package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.ServerParameters;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.C2393d0;
import com.facebook.internal.C2394e;
import com.facebook.internal.C2397f0;
import com.facebook.login.C2468a;
import com.facebook.login.LoginClient;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.Scopes;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.math.BigInteger;
import java.util.Random;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p253t.C6516g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C2448a();

    /* renamed from: j */
    public static boolean f8751j;

    /* renamed from: e */
    public String f8752e;

    /* renamed from: f */
    public String f8753f;

    /* renamed from: g */
    public String f8754g;

    /* renamed from: h */
    public final String f8755h = "custom_tab";

    /* renamed from: i */
    public final AccessTokenSource f8756i = AccessTokenSource.CHROME_CUSTOM_TAB;

    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    public static final class C2448a implements Parcelable.Creator<CustomTabLoginMethodHandler> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new CustomTabLoginMethodHandler(parcel);
        }

        public final Object[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C2397f0 f0Var = C2397f0.f8630a;
        String bigInteger = new BigInteger(100, new Random()).toString(32);
        C24362h.m61210e(bigInteger, "BigInteger(length * 5, r).toString(32)");
        this.f8753f = bigInteger;
        f8751j = false;
        String[] strArr = C2394e.f8627a;
        this.f8754g = C2394e.m6290c(super.mo12609j());
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public final String mo12608g() {
        return this.f8755h;
    }

    /* renamed from: j */
    public final String mo12609j() {
        return this.f8754g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12610l(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 0
            if (r9 == 0) goto L_0x000c
            java.lang.String r1 = com.facebook.CustomTabMainActivity.f8407j
            boolean r1 = r9.getBooleanExtra(r1, r0)
            if (r1 == 0) goto L_0x000c
            return r0
        L_0x000c:
            r1 = 1
            if (r7 == r1) goto L_0x0010
            return r0
        L_0x0010:
            com.facebook.login.LoginClient r7 = r6.mo12682f()
            com.facebook.login.LoginClient$Request r7 = r7.f8792h
            if (r7 != 0) goto L_0x0019
            return r0
        L_0x0019:
            r2 = 0
            r3 = -1
            if (r8 != r3) goto L_0x0110
            if (r9 == 0) goto L_0x0026
            java.lang.String r8 = com.facebook.CustomTabMainActivity.f8404g
            java.lang.String r8 = r9.getStringExtra(r8)
            goto L_0x0027
        L_0x0026:
            r8 = r2
        L_0x0027:
            if (r8 == 0) goto L_0x010f
            java.lang.String r9 = "fbconnect://cct."
            boolean r9 = uh0.C25081h.m62835F(r8, r9)
            if (r9 != 0) goto L_0x003b
            java.lang.String r9 = super.mo12609j()
            boolean r9 = uh0.C25081h.m62835F(r8, r9)
            if (r9 == 0) goto L_0x010f
        L_0x003b:
            android.net.Uri r8 = android.net.Uri.parse(r8)
            com.facebook.internal.f0 r9 = com.facebook.internal.C2397f0.f8630a
            java.lang.String r9 = r8.getQuery()
            android.os.Bundle r9 = com.facebook.internal.C2397f0.m6298G(r9)
            java.lang.String r8 = r8.getFragment()
            android.os.Bundle r8 = com.facebook.internal.C2397f0.m6298G(r8)
            r9.putAll(r8)
            java.lang.String r8 = "state"
            java.lang.String r8 = r9.getString(r8)     // Catch:{ JSONException -> 0x006f }
            if (r8 != 0) goto L_0x005d
            goto L_0x0070
        L_0x005d:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006f }
            r4.<init>(r8)     // Catch:{ JSONException -> 0x006f }
            java.lang.String r8 = "7_challenge"
            java.lang.String r8 = r4.getString(r8)     // Catch:{ JSONException -> 0x006f }
            java.lang.String r4 = r6.f8753f     // Catch:{ JSONException -> 0x006f }
            boolean r0 = mf0.C24362h.m61206a(r8, r4)     // Catch:{ JSONException -> 0x006f }
            goto L_0x0070
        L_0x006f:
        L_0x0070:
            if (r0 != 0) goto L_0x007e
            com.facebook.FacebookException r8 = new com.facebook.FacebookException
            java.lang.String r9 = "Invalid state parameter"
            r8.<init>((java.lang.String) r9)
            r6.mo12691s(r7, r2, r8)
            goto L_0x010f
        L_0x007e:
            java.lang.String r8 = "error"
            java.lang.String r8 = r9.getString(r8)
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = "error_type"
            java.lang.String r8 = r9.getString(r8)
        L_0x008c:
            java.lang.String r0 = "error_msg"
            java.lang.String r0 = r9.getString(r0)
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "error_message"
            java.lang.String r0 = r9.getString(r0)
        L_0x009a:
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "error_description"
            java.lang.String r0 = r9.getString(r0)
        L_0x00a2:
            java.lang.String r4 = "error_code"
            java.lang.String r4 = r9.getString(r4)
            if (r4 != 0) goto L_0x00ab
            goto L_0x00b1
        L_0x00ab:
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x00b0 }
            goto L_0x00b2
        L_0x00b0:
        L_0x00b1:
            r4 = -1
        L_0x00b2:
            boolean r5 = com.facebook.internal.C2397f0.m6292A(r8)
            if (r5 == 0) goto L_0x00da
            boolean r5 = com.facebook.internal.C2397f0.m6292A(r0)
            if (r5 == 0) goto L_0x00da
            if (r4 != r3) goto L_0x00da
            java.lang.String r8 = "access_token"
            boolean r8 = r9.containsKey(r8)
            if (r8 == 0) goto L_0x00cc
            r6.mo12691s(r7, r9, r2)
            goto L_0x010f
        L_0x00cc:
            java.util.concurrent.Executor r8 = p009a8.C0115o.m212c()
            androidx.emoji2.text.g r0 = new androidx.emoji2.text.g
            r2 = 4
            r0.<init>(r2, r6, r7, r9)
            r8.execute(r0)
            goto L_0x010f
        L_0x00da:
            if (r8 == 0) goto L_0x00f5
            java.lang.String r9 = "access_denied"
            boolean r9 = mf0.C24362h.m61206a(r8, r9)
            if (r9 != 0) goto L_0x00ec
            java.lang.String r9 = "OAuthAccessDeniedException"
            boolean r9 = mf0.C24362h.m61206a(r8, r9)
            if (r9 == 0) goto L_0x00f5
        L_0x00ec:
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            r6.mo12691s(r7, r2, r8)
            goto L_0x010f
        L_0x00f5:
            r9 = 4201(0x1069, float:5.887E-42)
            if (r4 != r9) goto L_0x0102
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            r6.mo12691s(r7, r2, r8)
            goto L_0x010f
        L_0x0102:
            com.facebook.FacebookRequestError r9 = new com.facebook.FacebookRequestError
            r9.<init>(r4, r8, r0)
            com.facebook.FacebookServiceException r8 = new com.facebook.FacebookServiceException
            r8.<init>(r9, r0)
            r6.mo12691s(r7, r2, r8)
        L_0x010f:
            return r1
        L_0x0110:
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            r6.mo12691s(r7, r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.mo12610l(int, int, android.content.Intent):boolean");
    }

    /* renamed from: n */
    public final void mo12611n(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f8753f);
    }

    /* renamed from: o */
    public final int mo12612o(LoginClient.Request request) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        Uri uri;
        LoginClient f = mo12682f();
        if (this.f8754g.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        Bundle q = mo12690q(request);
        q.putString("redirect_uri", this.f8754g);
        if (request.f8809m == LoginTargetApp.INSTAGRAM) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            q.putString("app_id", request.f8801e);
        } else {
            q.putString("client_id", request.f8801e);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        C24362h.m61210e(jSONObject2, "e2e.toString()");
        q.putString("e2e", jSONObject2);
        LoginTargetApp loginTargetApp = request.f8809m;
        LoginTargetApp loginTargetApp2 = LoginTargetApp.INSTAGRAM;
        if (loginTargetApp == loginTargetApp2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            q.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.f8799c.contains(Scopes.OPEN_ID)) {
                q.putString("nonce", request.f8812p);
            }
            q.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        q.putString("code_challenge", request.f8814r);
        CodeChallengeMethod codeChallengeMethod = request.f8815s;
        if (codeChallengeMethod == null) {
            str = null;
        } else {
            str = codeChallengeMethod.name();
        }
        q.putString("code_challenge_method", str);
        q.putString("return_scopes", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        q.putString("auth_type", request.f8805i);
        q.putString("login_behavior", request.f8798b.name());
        C0115o oVar = C0115o.f331a;
        q.putString(ServerParameters.ANDROID_SDK_INT, C24362h.m61216k("15.1.0", "android-"));
        q.putString("sso", "chrome_custom_tab");
        String str2 = "0";
        q.putString("cct_prefetching", C0115o.f343m ? DiskLruCache.VERSION_1 : str2);
        if (request.f8810n) {
            q.putString("fx_app", request.f8809m.toString());
        }
        if (request.f8811o) {
            q.putString("skip_dedupe", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        }
        String str3 = request.f8807k;
        if (str3 != null) {
            q.putString("messenger_page_id", str3);
            if (request.f8808l) {
                str2 = DiskLruCache.VERSION_1;
            }
            q.putString("reset_messenger_state", str2);
        }
        if (f8751j) {
            q.putString("cct_over_app_switch", DiskLruCache.VERSION_1);
        }
        if (C0115o.f343m) {
            if (request.f8809m == loginTargetApp2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                C6516g gVar = C2468a.f8841b;
                if (C24362h.m61206a("oauth", "oauth")) {
                    C2397f0 f0Var = C2397f0.f8630a;
                    uri = C2397f0.m6308b(q, C2393d0.m6287b(), "oauth/authorize");
                } else {
                    C2397f0 f0Var2 = C2397f0.f8630a;
                    String b = C2393d0.m6287b();
                    uri = C2397f0.m6308b(q, b, C0115o.m213d() + "/dialog/" + "oauth");
                }
                C2468a.C2469a.m6505a(uri);
            } else {
                C6516g gVar2 = C2468a.f8841b;
                C2397f0 f0Var3 = C2397f0.f8630a;
                String a = C2393d0.m6286a();
                C2468a.C2469a.m6505a(C2397f0.m6308b(q, a, C0115o.m213d() + "/dialog/" + "oauth"));
            }
        }
        FragmentActivity g = f.mo12659g();
        if (g == null) {
            return 0;
        }
        Intent intent = new Intent(g, CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f8401d, "oauth");
        intent.putExtra(CustomTabMainActivity.f8402e, q);
        String str4 = CustomTabMainActivity.f8403f;
        String str5 = this.f8752e;
        if (str5 == null) {
            str5 = C2394e.m6288a();
            this.f8752e = str5;
        }
        intent.putExtra(str4, str5);
        intent.putExtra(CustomTabMainActivity.f8405h, request.f8809m.toString());
        Fragment fragment = f.f8788d;
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    /* renamed from: r */
    public final AccessTokenSource mo12613r() {
        return this.f8756i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8753f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "source");
        this.f8753f = parcel.readString();
        String[] strArr = C2394e.f8627a;
        this.f8754g = C2394e.m6290c(super.mo12609j());
    }
}
