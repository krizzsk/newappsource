package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzu {
    private static boolean zza;
    private final String zzb;
    private final zzt zzc;
    private zzt zzd;

    public /* synthetic */ zzu(String str, zzs zzs) {
        zzt zzt = new zzt((zzs) null);
        this.zzc = zzt;
        this.zzd = zzt;
        if (!zza) {
            synchronized (zzu.class) {
                if (!zza) {
                    zza = true;
                }
            }
        }
        this.zzb = str;
    }

    private final zzu zze(String str, @NullableDecl Object obj) {
        zzt zzt = new zzt((zzs) null);
        this.zzd.zzc = zzt;
        this.zzd = zzt;
        zzt.zzb = obj;
        str.getClass();
        zzt.zza = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zzb);
        sb.append('{');
        zzt zzt = this.zzc.zzc;
        String str = "";
        while (zzt != null) {
            Object obj = zzt.zzb;
            sb.append(str);
            String str2 = zzt.zza;
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
            zzt = zzt.zzc;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzu zza(String str, @NullableDecl Object obj) {
        zze(str, obj);
        return this;
    }

    public final zzu zzb(String str, boolean z) {
        zze("trackingEnabled", String.valueOf(z));
        return this;
    }

    public final zzu zzc(String str, float f) {
        zze(str, String.valueOf(f));
        return this;
    }

    public final zzu zzd(String str, int i) {
        zze(str, String.valueOf(i));
        return this;
    }
}
