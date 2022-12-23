package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import p434dd.C16541a;
import p434dd.C16580t0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.f */
public final class C14262f extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ int f35848c;

    /* renamed from: d */
    public final /* synthetic */ String f35849d;

    /* renamed from: e */
    public final /* synthetic */ C17573l f35850e;

    /* renamed from: f */
    public final /* synthetic */ int f35851f;

    /* renamed from: g */
    public final /* synthetic */ C14310r f35852g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14262f(C14310r rVar, C17573l lVar, int i, String str, C17573l lVar2, int i2) {
        super(lVar);
        this.f35852g = rVar;
        this.f35848c = i;
        this.f35849d = str;
        this.f35850e = lVar2;
        this.f35851f = i2;
    }

    /* renamed from: a */
    public final void mo42765a() {
        try {
            C14310r rVar = this.f35852g;
            String str = rVar.f36009a;
            int i = this.f35848c;
            String str2 = this.f35849d;
            Bundle bundle = new Bundle();
            bundle.putInt(GetBrowserSessionContextCommand.KEY_SESSION_ID, i);
            bundle.putString("module_name", str2);
            ((C16580t0) rVar.f36012d.f43217n).mo49355z(str, bundle, C14310r.m35588f(), new C14302p(this.f35852g, this.f35850e, this.f35848c, this.f35849d, this.f35851f));
        } catch (RemoteException e) {
            C14310r.f36007g.mo976c("notifyModuleCompleted", e, new Object[0]);
        }
    }
}
