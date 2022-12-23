package com.google.android.gms.internal.p986firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfr */
public final class zzfr implements zzbj {
    private final SharedPreferences.Editor zza;
    private final String zzb = "GenericIdpKeyset";

    public zzfr(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    public final void zzb(zzlq zzlq) throws IOException {
        if (!this.zza.putString(this.zzb, zzpl.zza(zzlq.zzr())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public final void zzc(zznh zznh) throws IOException {
        if (!this.zza.putString(this.zzb, zzpl.zza(zznh.zzr())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
