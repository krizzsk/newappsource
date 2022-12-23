package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import mf0.C24362h;

/* renamed from: com.facebook.login.o */
public final /* synthetic */ class C2487o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ NativeAppLoginMethodHandler f8890b;

    /* renamed from: c */
    public final /* synthetic */ LoginClient.Request f8891c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f8892d;

    public /* synthetic */ C2487o(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        this.f8890b = nativeAppLoginMethodHandler;
        this.f8891c = request;
        this.f8892d = bundle;
    }

    public final void run() {
        NativeAppLoginMethodHandler nativeAppLoginMethodHandler = this.f8890b;
        LoginClient.Request request = this.f8891c;
        Bundle bundle = this.f8892d;
        C24362h.m61211f(nativeAppLoginMethodHandler, "this$0");
        C24362h.m61211f(request, "$request");
        C24362h.m61211f(bundle, "$extras");
        try {
            nativeAppLoginMethodHandler.mo12684m(bundle, request);
            nativeAppLoginMethodHandler.mo12688t(bundle, request);
        } catch (FacebookServiceException e) {
            FacebookRequestError a = e.mo11900a();
            nativeAppLoginMethodHandler.mo12687s(request, a.f8419e, a.mo11894b(), String.valueOf(a.f8417c));
        } catch (FacebookException e2) {
            nativeAppLoginMethodHandler.mo12687s(request, (String) null, e2.getMessage(), (String) null);
        }
    }
}
