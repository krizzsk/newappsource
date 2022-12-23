package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;

final class zzak extends zzae<String> {
    public zzak(zzao zzao, String str, String str2) {
        super(zzao, str, str2, (zzai) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final String zza(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.zzds, (String) null);
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.zzds);
            if (valueOf.length() != 0) {
                "Invalid string value in SharedPreferences for ".concat(valueOf);
            }
            return null;
        }
    }

    public final /* synthetic */ Object zzb(String str) {
        return str;
    }
}
