package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import p434dd.C16541a;
import p434dd.C16580t0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.g */
public final class C14266g extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ int f35868c;

    /* renamed from: d */
    public final /* synthetic */ C17573l f35869d;

    /* renamed from: e */
    public final /* synthetic */ C14310r f35870e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14266g(C14310r rVar, C17573l lVar, int i, C17573l lVar2) {
        super(lVar);
        this.f35870e = rVar;
        this.f35868c = i;
        this.f35869d = lVar2;
    }

    /* renamed from: a */
    public final void mo42765a() {
        try {
            C14310r rVar = this.f35870e;
            String str = rVar.f36009a;
            int i = this.f35868c;
            Bundle bundle = new Bundle();
            bundle.putInt(GetBrowserSessionContextCommand.KEY_SESSION_ID, i);
            ((C16580t0) rVar.f36012d.f43217n).mo49353u(str, bundle, C14310r.m35588f(), new C14306q(this.f35870e, this.f35869d));
        } catch (RemoteException e) {
            C14310r.f36007g.mo976c("notifySessionFailed", e, new Object[0]);
        }
    }
}
