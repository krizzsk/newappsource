package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;
import p001a0.C0017h;

final class zzlb extends zzln {
    private final zzid zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final ModelType zze;
    private final zzij zzf;
    private final int zzg;

    public /* synthetic */ zzlb(zzid zzid, String str, boolean z, boolean z2, ModelType modelType, zzij zzij, int i, zzla zzla) {
        this.zza = zzid;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        this.zze = modelType;
        this.zzf = zzij;
        this.zzg = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzln) {
            zzln zzln = (zzln) obj;
            if (!this.zza.equals(zzln.zzc()) || !this.zzb.equals(zzln.zze()) || this.zzc != zzln.zzg() || this.zzd != zzln.zzf() || !this.zze.equals(zzln.zzb()) || !this.zzf.equals(zzln.zzd()) || this.zzg != zzln.zza()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003;
        int i2 = 1237;
        if (true != this.zzc) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = (hashCode ^ i) * 1000003;
        if (true == this.zzd) {
            i2 = 1231;
        }
        return ((((((i3 ^ i2) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        boolean z = this.zzc;
        boolean z2 = this.zzd;
        String obj2 = this.zze.toString();
        String obj3 = this.zzf.toString();
        int i = this.zzg;
        StringBuilder sb = new StringBuilder(obj3.length() + obj2.length() + str.length() + obj.length() + 187);
        C0017h.m61R(sb, "RemoteModelLoggingOptions{errorCode=", obj, ", tfliteSchemaVersion=", str);
        sb.append(", shouldLogRoughDownloadTime=");
        sb.append(z);
        sb.append(", shouldLogExactDownloadTime=");
        sb.append(z2);
        C0017h.m61R(sb, ", modelType=", obj2, ", downloadStatus=", obj3);
        sb.append(", failureStatusCode=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public final int zza() {
        return this.zzg;
    }

    public final ModelType zzb() {
        return this.zze;
    }

    public final zzid zzc() {
        return this.zza;
    }

    public final zzij zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zzb;
    }

    public final boolean zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zzc;
    }
}
