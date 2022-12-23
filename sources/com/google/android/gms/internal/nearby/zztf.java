package com.google.android.gms.internal.nearby;

import java.io.IOException;
import java.math.RoundingMode;
import p001a0.C0016g;

final class zztf extends zzth {
    private final zzth zza;
    private final String zzb = ":";

    public zztf(zzth zzth, String str, int i) {
        this.zza = zzth;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zza);
        sb.append(".withSeparator(\"");
        return C0016g.m31o(sb, this.zzb, "\", 2)");
    }

    public final int zza(byte[] bArr, CharSequence charSequence) throws zzte {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (this.zzb.indexOf(charAt) < 0) {
                sb.append(charAt);
            }
        }
        return this.zza.zza(bArr, sb);
    }

    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzth zzth = this.zza;
        String str = this.zzb;
        appendable.getClass();
        zzth.zzb(new zzta(2, appendable, str), bArr, 0, i2);
    }

    public final int zzc(int i) {
        return this.zza.zzc(i);
    }

    public final int zzd(int i) {
        int zzd = this.zza.zzd(i);
        return (zztj.zza(Math.max(0, zzd - 1), 2, RoundingMode.FLOOR) * this.zzb.length()) + zzd;
    }

    public final zzth zze(String str, int i) {
        throw null;
    }

    public final CharSequence zzf(CharSequence charSequence) {
        return this.zza.zzf(charSequence);
    }
}
