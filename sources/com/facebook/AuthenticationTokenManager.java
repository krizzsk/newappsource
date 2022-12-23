package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p009a8.C0106f;
import p130j2.C5367a;

public final class AuthenticationTokenManager {

    /* renamed from: d */
    public static final C2274a f8392d = new C2274a();

    /* renamed from: e */
    public static AuthenticationTokenManager f8393e;

    /* renamed from: a */
    public final C5367a f8394a;

    /* renamed from: b */
    public final C0106f f8395b;

    /* renamed from: c */
    public AuthenticationToken f8396c;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(intent, "intent");
        }
    }

    /* renamed from: com.facebook.AuthenticationTokenManager$a */
    public static final class C2274a {
    }

    public AuthenticationTokenManager(C5367a aVar, C0106f fVar) {
        this.f8394a = aVar;
        this.f8395b = fVar;
    }
}
