package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;

public final class zzbg extends WebView {
    private final Handler zza;
    /* access modifiers changed from: private */
    public final zzbm zzb;
    /* access modifiers changed from: private */
    public boolean zzc = false;

    public zzbg(zzbi zzbi, Handler handler, zzbm zzbm) {
        super(zzbi);
        this.zza = handler;
        this.zzb = zzbm;
    }

    public static /* synthetic */ boolean zzc(zzbg zzbg, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzb(String str, String str2) {
        this.zza.post(new zzbd(this, C13715c.m34246l(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, "(", str2, ");")));
    }
}
