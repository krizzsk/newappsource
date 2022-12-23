package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.datatransport.Priority;

final class zzkd extends zzkf {
    private String zza;
    private Boolean zzb;
    private Boolean zzc;
    private Priority zzd;
    private Integer zze;

    public final zzkf zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null libraryName");
    }

    public final zzkf zzb(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    public final zzkf zzc(boolean z) {
        this.zzc = Boolean.TRUE;
        return this;
    }

    public final zzkf zzd(Priority priority) {
        if (priority != null) {
            this.zzd = priority;
            return this;
        }
        throw new NullPointerException("Null firelogEventPriority");
    }

    public final zzkf zze(int i) {
        this.zze = 0;
        return this;
    }

    public final zzkg zzf() {
        String str;
        String str2;
        if (this.zza == null) {
            str = " libraryName";
        } else {
            str = "";
        }
        if (this.zzb == null) {
            str = str.concat(" enableClearcut");
        }
        if (this.zzc == null) {
            str = String.valueOf(str).concat(" enableFirelog");
        }
        if (this.zzd == null) {
            str = String.valueOf(str).concat(" firelogEventPriority");
        }
        if (this.zze == null) {
            str = String.valueOf(str).concat(" firelogEventType");
        }
        if (str.isEmpty()) {
            return new zzke(this.zza, this.zzb.booleanValue(), this.zzc.booleanValue(), this.zzd, this.zze.intValue(), (zzkc) null);
        }
        if (str.length() != 0) {
            str2 = "Missing required properties:".concat(str);
        } else {
            str2 = new String("Missing required properties:");
        }
        throw new IllegalStateException(str2);
    }
}
