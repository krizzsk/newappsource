package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import p434dd.C16541a;
import p434dd.C16580t0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.h */
public final class C14270h extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ int f35882c;

    /* renamed from: d */
    public final /* synthetic */ String f35883d;

    /* renamed from: e */
    public final /* synthetic */ String f35884e;

    /* renamed from: f */
    public final /* synthetic */ int f35885f;

    /* renamed from: g */
    public final /* synthetic */ C17573l f35886g;

    /* renamed from: h */
    public final /* synthetic */ C14310r f35887h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14270h(C14310r rVar, C17573l lVar, int i, String str, String str2, int i2, C17573l lVar2) {
        super(lVar);
        this.f35887h = rVar;
        this.f35882c = i;
        this.f35883d = str;
        this.f35884e = str2;
        this.f35885f = i2;
        this.f35886g = lVar2;
    }

    /* renamed from: a */
    public final void mo42765a() {
        try {
            C14310r rVar = this.f35887h;
            String str = rVar.f36009a;
            int i = this.f35882c;
            String str2 = this.f35883d;
            String str3 = this.f35884e;
            int i2 = this.f35885f;
            Bundle bundle = new Bundle();
            bundle.putInt(GetBrowserSessionContextCommand.KEY_SESSION_ID, i);
            bundle.putString("module_name", str2);
            bundle.putString("slice_id", str3);
            bundle.putInt("chunk_number", i2);
            ((C16580t0) rVar.f36012d.f43217n).mo49351h(str, bundle, C14310r.m35588f(), new C14286l(this.f35887h, this.f35886g));
        } catch (RemoteException e) {
            C14310r.f36007g.mo975b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f35883d, this.f35884e, Integer.valueOf(this.f35885f), Integer.valueOf(this.f35882c));
            this.f35886g.mo50024a(new RuntimeException(e));
        }
    }
}
