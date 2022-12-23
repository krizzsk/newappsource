package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.datatransport.Priority;

final class zzke extends zzkg {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final Priority zzd;
    private final int zze;

    public /* synthetic */ zzke(String str, boolean z, boolean z2, Priority priority, int i, zzkc zzkc) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = priority;
        this.zze = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkg) {
            zzkg zzkg = (zzkg) obj;
            if (this.zza.equals(zzkg.zza()) && this.zzb == zzkg.zzb() && this.zzc == zzkg.zzc() && this.zzd.equals(zzkg.zzd()) && this.zze == zzkg.zze()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        int i2 = 1237;
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = (hashCode ^ i) * 1000003;
        if (true == this.zzc) {
            i2 = 1231;
        }
        return ((((i3 ^ i2) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze;
    }

    public final String toString() {
        String str = this.zza;
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        String valueOf = String.valueOf(this.zzd);
        int i = this.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 129 + valueOf.length());
        sb.append("MLKitLoggingOptions{libraryName=");
        sb.append(str);
        sb.append(", enableClearcut=");
        sb.append(z);
        sb.append(", enableFirelog=");
        sb.append(z2);
        sb.append(", firelogEventPriority=");
        sb.append(valueOf);
        sb.append(", firelogEventType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    public final Priority zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zze;
    }
}
