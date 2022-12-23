package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import p001a0.C0016g;

final class zzaj extends zzae<Boolean> {
    public zzaj(zzao zzao, String str, Boolean bool) {
        super(zzao, str, bool, (zzai) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final Boolean zza(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.zzds, false));
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.zzds);
            if (valueOf.length() == 0) {
                return null;
            }
            "Invalid boolean value in SharedPreferences for ".concat(valueOf);
            return null;
        }
    }

    public final /* synthetic */ Object zzb(String str) {
        if (zzy.zzcr.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (zzy.zzcs.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        new StringBuilder(C0016g.m25h(str, C0016g.m25h(this.zzds, 28)));
        return null;
    }
}
