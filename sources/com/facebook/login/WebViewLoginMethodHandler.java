package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2410j0;
import com.facebook.internal.C2420m;
import com.facebook.login.LoginClient;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "a", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C2466b();

    /* renamed from: e */
    public C2410j0 f8828e;

    /* renamed from: f */
    public String f8829f;

    /* renamed from: g */
    public final String f8830g = "web_view";

    /* renamed from: h */
    public final AccessTokenSource f8831h = AccessTokenSource.WEB_VIEW;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    public final class C2465a extends C2410j0.C2411a {

        /* renamed from: e */
        public String f8832e = "fbconnect://success";

        /* renamed from: f */
        public LoginBehavior f8833f = LoginBehavior.NATIVE_WITH_FALLBACK;

        /* renamed from: g */
        public LoginTargetApp f8834g = LoginTargetApp.FACEBOOK;

        /* renamed from: h */
        public boolean f8835h;

        /* renamed from: i */
        public boolean f8836i;

        /* renamed from: j */
        public String f8837j;

        /* renamed from: k */
        public String f8838k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2465a(WebViewLoginMethodHandler webViewLoginMethodHandler, FragmentActivity fragmentActivity, String str, Bundle bundle) {
            super(fragmentActivity, str, bundle, 0);
            C24362h.m61211f(webViewLoginMethodHandler, "this$0");
            C24362h.m61211f(str, "applicationId");
        }

        /* renamed from: a */
        public final C2410j0 mo12693a() {
            String str;
            Bundle bundle = this.f8676d;
            if (bundle != null) {
                bundle.putString("redirect_uri", this.f8832e);
                bundle.putString("client_id", this.f8674b);
                String str2 = this.f8837j;
                if (str2 != null) {
                    bundle.putString("e2e", str2);
                    if (this.f8834g == LoginTargetApp.INSTAGRAM) {
                        str = "token,signed_request,graph_domain,granted_scopes";
                    } else {
                        str = "token,signed_request,graph_domain";
                    }
                    bundle.putString("response_type", str);
                    bundle.putString("return_scopes", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                    String str3 = this.f8838k;
                    if (str3 != null) {
                        bundle.putString("auth_type", str3);
                        bundle.putString("login_behavior", this.f8833f.name());
                        if (this.f8835h) {
                            bundle.putString("fx_app", this.f8834g.toString());
                        }
                        if (this.f8836i) {
                            bundle.putString("skip_dedupe", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                        }
                        int i = C2410j0.f8659n;
                        Context context = this.f8673a;
                        if (context != null) {
                            LoginTargetApp loginTargetApp = this.f8834g;
                            C2410j0.C2413c cVar = this.f8675c;
                            C24362h.m61211f(loginTargetApp, "targetApp");
                            C2410j0.m6361a(context);
                            return new C2410j0(context, "oauth", bundle, loginTargetApp, cVar);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
                    }
                    C24362h.m61217l("authType");
                    throw null;
                }
                C24362h.m61217l("e2e");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$b */
    public static final class C2466b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new WebViewLoginMethodHandler(parcel);
        }

        public final Object[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$c */
    public static final class C2467c implements C2410j0.C2413c {

        /* renamed from: a */
        public final /* synthetic */ WebViewLoginMethodHandler f8839a;

        /* renamed from: b */
        public final /* synthetic */ LoginClient.Request f8840b;

        public C2467c(WebViewLoginMethodHandler webViewLoginMethodHandler, LoginClient.Request request) {
            this.f8839a = webViewLoginMethodHandler;
            this.f8840b = request;
        }

        /* renamed from: a */
        public final void mo12584a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler webViewLoginMethodHandler = this.f8839a;
            LoginClient.Request request = this.f8840b;
            webViewLoginMethodHandler.getClass();
            C24362h.m61211f(request, "request");
            webViewLoginMethodHandler.mo12691s(request, bundle, facebookException);
        }
    }

    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: c */
    public final void mo12635c() {
        C2410j0 j0Var = this.f8828e;
        if (j0Var != null) {
            if (j0Var != null) {
                j0Var.cancel();
            }
            this.f8828e = null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public final String mo12608g() {
        return this.f8830g;
    }

    /* renamed from: o */
    public final int mo12612o(LoginClient.Request request) {
        String str;
        Bundle q = mo12690q(request);
        C2467c cVar = new C2467c(this, request);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        C24362h.m61210e(jSONObject2, "e2e.toString()");
        this.f8829f = jSONObject2;
        mo12680b(jSONObject2, "e2e");
        FragmentActivity g = mo12682f().mo12659g();
        if (g == null) {
            return 0;
        }
        boolean x = C2397f0.m6330x(g);
        C2465a aVar = new C2465a(this, g, request.f8801e, q);
        String str2 = this.f8829f;
        if (str2 != null) {
            aVar.f8837j = str2;
            if (x) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            aVar.f8832e = str;
            String str3 = request.f8805i;
            C24362h.m61211f(str3, "authType");
            aVar.f8838k = str3;
            LoginBehavior loginBehavior = request.f8798b;
            C24362h.m61211f(loginBehavior, "loginBehavior");
            aVar.f8833f = loginBehavior;
            LoginTargetApp loginTargetApp = request.f8809m;
            C24362h.m61211f(loginTargetApp, "targetApp");
            aVar.f8834g = loginTargetApp;
            aVar.f8835h = request.f8810n;
            aVar.f8836i = request.f8811o;
            aVar.f8675c = cVar;
            this.f8828e = aVar.mo12693a();
            C2420m mVar = new C2420m();
            mVar.setRetainInstance(true);
            mVar.f8690b = this.f8828e;
            mVar.show(g.getSupportFragmentManager(), "FacebookDialogFragment");
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    /* renamed from: r */
    public final AccessTokenSource mo12613r() {
        return this.f8831h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8829f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "source");
        this.f8829f = parcel.readString();
    }
}
