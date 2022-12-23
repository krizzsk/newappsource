package com.facebook.login;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;
import com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment;
import mf0.C24362h;
import p009a8.C0109i;

/* renamed from: com.facebook.login.k */
public final /* synthetic */ class C2481k implements CallbackManagerImpl.C2365a {

    /* renamed from: a */
    public final /* synthetic */ C2483m f8873a;

    /* renamed from: b */
    public final /* synthetic */ C0109i f8874b;

    public /* synthetic */ C2481k(C2483m mVar, FacebookConnectProviderFragment.C15637a aVar) {
        this.f8873a = mVar;
        this.f8874b = aVar;
    }

    /* renamed from: a */
    public final boolean mo12522a(int i, Intent intent) {
        C2483m mVar = this.f8873a;
        C0109i iVar = this.f8874b;
        C24362h.m61211f(mVar, "this$0");
        mVar.mo12702c(i, intent, iVar);
        return true;
    }
}
