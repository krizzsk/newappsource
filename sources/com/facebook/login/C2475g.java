package com.facebook.login;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.C2397f0;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.g */
public final class C2475g implements C2397f0.C2398a {

    /* renamed from: a */
    public final /* synthetic */ Bundle f8856a;

    /* renamed from: b */
    public final /* synthetic */ GetTokenLoginMethodHandler f8857b;

    /* renamed from: c */
    public final /* synthetic */ LoginClient.Request f8858c;

    public C2475g(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
        this.f8856a = bundle;
        this.f8857b = getTokenLoginMethodHandler;
        this.f8858c = request;
    }

    /* renamed from: a */
    public final void mo11931a(JSONObject jSONObject) {
        String str;
        try {
            Bundle bundle = this.f8856a;
            if (jSONObject == null) {
                str = null;
            } else {
                str = jSONObject.getString("id");
            }
            bundle.putString("com.facebook.platform.extra.USER_ID", str);
            this.f8857b.mo12637q(this.f8856a, this.f8858c);
        } catch (JSONException e) {
            LoginClient f = this.f8857b.mo12682f();
            LoginClient.Request request = this.f8857b.mo12682f().f8792h;
            String message = e.getMessage();
            ArrayList arrayList = new ArrayList();
            arrayList.add("Caught exception");
            if (message != null) {
                arrayList.add(message);
            }
            f.mo12656d(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), (String) null));
        }
    }

    /* renamed from: b */
    public final void mo11932b(FacebookException facebookException) {
        String str;
        LoginClient f = this.f8857b.mo12682f();
        LoginClient.Request request = this.f8857b.mo12682f().f8792h;
        if (facebookException == null) {
            str = null;
        } else {
            str = facebookException.getMessage();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (str != null) {
            arrayList.add(str);
        }
        f.mo12656d(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), (String) null));
    }
}
