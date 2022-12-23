package com.google.android.gms.internal.mlkit_vision_common;

final class zzjj extends zzjm {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    public final zzjm zza(boolean z) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    public final zzjm zzb(int i) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzjm zzc(String str) {
        this.zza = "vision-common";
        return this;
    }

    public final zzjn zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzjl(str, this.zzb, this.zzc, (zzjk) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
