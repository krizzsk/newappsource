package com.google.android.gms.internal.mlkit_common;

final class zzkw extends zzld {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    public final zzld zza(boolean z) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    public final zzld zzb(int i) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzld zzc(String str) {
        this.zza = "common";
        return this;
    }

    public final zzle zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzky(str, this.zzb, this.zzc, (zzkx) null);
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
