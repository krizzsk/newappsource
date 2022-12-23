package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

public final class zzv {
    private final String zza;
    private final zzu zzb;
    private zzu zzc;

    public /* synthetic */ zzv(String str, zzs zzs) {
        zzu zzu = new zzu((zzs) null);
        this.zzb = zzu;
        this.zzc = zzu;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzu zzu = this.zzb.zzc;
        String str = "";
        while (zzu != null) {
            Object obj = zzu.zzb;
            sb.append(str);
            String str2 = zzu.zza;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzu = zzu.zzc;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzv zza(String str, Object obj) {
        zzu zzu = new zzu((zzs) null);
        this.zzc.zzc = zzu;
        this.zzc = zzu;
        zzu.zzb = obj;
        zzu.zza = str;
        return this;
    }

    public final zzv zzb(String str, boolean z) {
        String valueOf = String.valueOf(z);
        zzt zzt = new zzt((zzs) null);
        this.zzc.zzc = zzt;
        this.zzc = zzt;
        zzt.zzb = valueOf;
        zzt.zza = "isManifestFile";
        return this;
    }
}
