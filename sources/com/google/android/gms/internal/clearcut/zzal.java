package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;
import p001a0.C0016g;

final class zzal extends zzae {
    private final Object lock = new Object();
    private String zzec;
    private Object zzed;
    private final /* synthetic */ zzan zzee;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzal(zzao zzao, String str, Object obj, zzan zzan) {
        super(zzao, str, obj, (zzai) null);
        this.zzee = zzan;
    }

    public final Object zza(SharedPreferences sharedPreferences) {
        try {
            return zzb(sharedPreferences.getString(this.zzds, ""));
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.zzds);
            if (valueOf.length() == 0) {
                return null;
            }
            "Invalid byte[] value in SharedPreferences for ".concat(valueOf);
            return null;
        }
    }

    public final Object zzb(String str) {
        Object obj;
        try {
            synchronized (this.lock) {
                if (!str.equals(this.zzec)) {
                    Object zzb = this.zzee.zzb(Base64.decode(str, 3));
                    this.zzec = str;
                    this.zzed = zzb;
                }
                obj = this.zzed;
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            new StringBuilder(C0016g.m25h(str, C0016g.m25h(this.zzds, 27)));
            return null;
        }
    }
}
