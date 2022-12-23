package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C2397f0;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import java.util.ArrayList;
import kotlin.Metadata;
import mf0.C24362h;
import p009a8.C0115o;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: d */
    public String f8827d;

    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo12690q(com.facebook.login.LoginClient.Request r8) {
        /*
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.facebook.internal.f0 r1 = com.facebook.internal.C2397f0.f8630a
            java.util.Set<java.lang.String> r1 = r8.f8799c
            r2 = 0
            if (r1 == 0) goto L_0x0015
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r1 = 0
            goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            if (r1 != 0) goto L_0x0028
            java.util.Set<java.lang.String> r1 = r8.f8799c
            java.lang.String r3 = ","
            java.lang.String r1 = android.text.TextUtils.join(r3, r1)
            java.lang.String r3 = "scope"
            r0.putString(r3, r1)
            r7.mo12680b(r1, r3)
        L_0x0028:
            com.facebook.login.DefaultAudience r1 = r8.f8800d
            if (r1 != 0) goto L_0x002e
            com.facebook.login.DefaultAudience r1 = com.facebook.login.DefaultAudience.NONE
        L_0x002e:
            java.lang.String r1 = r1.getNativeProtocolAudience()
            java.lang.String r3 = "default_audience"
            r0.putString(r3, r1)
            java.lang.String r8 = r8.f8802f
            java.lang.String r8 = r7.mo12681d(r8)
            java.lang.String r1 = "state"
            r0.putString(r1, r8)
            java.util.Date r8 = com.facebook.AccessToken.f8348m
            com.facebook.AccessToken r8 = com.facebook.AccessToken.C2266c.m6110b()
            if (r8 != 0) goto L_0x004c
            r8 = 0
            goto L_0x004e
        L_0x004c:
            java.lang.String r8 = r8.f8355f
        L_0x004e:
            java.lang.String r1 = "0"
            java.lang.String r3 = "1"
            java.lang.String r4 = "access_token"
            if (r8 == 0) goto L_0x007f
            com.facebook.login.LoginClient r5 = r7.mo12682f()
            androidx.fragment.app.FragmentActivity r5 = r5.mo12659g()
            if (r5 != 0) goto L_0x0064
            android.content.Context r5 = p009a8.C0115o.m210a()
        L_0x0064:
            java.lang.String r6 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            android.content.SharedPreferences r2 = r5.getSharedPreferences(r6, r2)
            java.lang.String r5 = "TOKEN"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.getString(r5, r6)
            boolean r2 = mf0.C24362h.m61206a(r8, r2)
            if (r2 == 0) goto L_0x007f
            r0.putString(r4, r8)
            r7.mo12680b(r3, r4)
            goto L_0x0090
        L_0x007f:
            com.facebook.login.LoginClient r8 = r7.mo12682f()
            androidx.fragment.app.FragmentActivity r8 = r8.mo12659g()
            if (r8 != 0) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            com.facebook.internal.C2397f0.m6310d(r8)
        L_0x008d:
            r7.mo12680b(r1, r4)
        L_0x0090:
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "cbt"
            r0.putString(r2, r8)
            a8.o r8 = p009a8.C0115o.f331a
            boolean r8 = p009a8.C0098d0.m169b()
            if (r8 == 0) goto L_0x00a6
            r1 = r3
        L_0x00a6:
            java.lang.String r8 = "ies"
            r0.putString(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.WebLoginMethodHandler.mo12690q(com.facebook.login.LoginClient$Request):android.os.Bundle");
    }

    /* renamed from: r */
    public abstract AccessTokenSource mo12613r();

    /* renamed from: s */
    public final void mo12691s(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        LoginClient.Result result;
        String str;
        LoginClient f = mo12682f();
        String str2 = null;
        this.f8827d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f8827d = bundle.getString("e2e");
            }
            try {
                AccessToken b = LoginMethodHandler.C2463a.m6488b(request.f8799c, bundle, mo12613r(), request.f8801e);
                result = new LoginClient.Result(f.f8792h, LoginClient.Result.Code.SUCCESS, b, LoginMethodHandler.C2463a.m6489c(bundle, request.f8812p), (String) null, (String) null);
                if (f.mo12659g() != null) {
                    try {
                        CookieSyncManager.createInstance(f.mo12659g()).sync();
                    } catch (Exception unused) {
                    }
                    if (b != null) {
                        String str3 = b.f8355f;
                        Context g = mo12682f().mo12659g();
                        if (g == null) {
                            g = C0115o.m210a();
                        }
                        g.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str3).apply();
                    }
                }
            } catch (FacebookException e) {
                LoginClient.Request request2 = f.f8792h;
                String message = e.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                result = new LoginClient.Result(request2, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), (String) null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = new LoginClient.Result(f.f8792h, LoginClient.Result.Code.CANCEL, (AccessToken) null, "User canceled log in.", (String) null);
        } else {
            this.f8827d = null;
            if (facebookException == null) {
                str = null;
            } else {
                str = facebookException.getMessage();
            }
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError a = ((FacebookServiceException) facebookException).mo11900a();
                str2 = String.valueOf(a.f8417c);
                str = a.toString();
            }
            String str4 = str2;
            LoginClient.Request request3 = f.f8792h;
            ArrayList arrayList2 = new ArrayList();
            if (str != null) {
                arrayList2.add(str);
            }
            result = new LoginClient.Result(request3, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList2), str4);
        }
        C2397f0 f0Var = C2397f0.f8630a;
        if (!C2397f0.m6292A(this.f8827d)) {
            mo12683k(this.f8827d);
        }
        f.mo12658f(result);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "source");
    }
}
