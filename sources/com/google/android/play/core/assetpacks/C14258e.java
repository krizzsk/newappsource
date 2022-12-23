package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import p434dd.C16541a;
import p434dd.C16580t0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.e */
public final class C14258e extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ int f35825c;

    /* renamed from: d */
    public final /* synthetic */ String f35826d;

    /* renamed from: e */
    public final /* synthetic */ String f35827e;

    /* renamed from: f */
    public final /* synthetic */ int f35828f;

    /* renamed from: g */
    public final /* synthetic */ C17573l f35829g;

    /* renamed from: h */
    public final /* synthetic */ C14310r f35830h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14258e(C14310r rVar, C17573l lVar, int i, String str, String str2, int i2, C17573l lVar2) {
        super(lVar);
        this.f35830h = rVar;
        this.f35825c = i;
        this.f35826d = str;
        this.f35827e = str2;
        this.f35828f = i2;
        this.f35829g = lVar2;
    }

    /* renamed from: a */
    public final void mo42765a() {
        try {
            C14310r rVar = this.f35830h;
            String str = rVar.f36009a;
            int i = this.f35825c;
            String str2 = this.f35826d;
            String str3 = this.f35827e;
            int i2 = this.f35828f;
            Bundle bundle = new Bundle();
            bundle.putInt(GetBrowserSessionContextCommand.KEY_SESSION_ID, i);
            bundle.putString("module_name", str2);
            bundle.putString("slice_id", str3);
            bundle.putInt("chunk_number", i2);
            ((C16580t0) rVar.f36012d.f43217n).mo49350F(str, bundle, C14310r.m35588f(), new C14298o(this.f35830h, this.f35829g));
        } catch (RemoteException e) {
            C14310r.f36007g.mo976c("notifyChunkTransferred", e, new Object[0]);
        }
    }
}
