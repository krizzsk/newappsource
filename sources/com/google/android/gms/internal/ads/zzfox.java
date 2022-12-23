package com.google.android.gms.internal.ads;

final class zzfox extends zzfpc {
    public final /* synthetic */ zzfoy zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfox(zzfoy zzfoy, zzfpe zzfpe, CharSequence charSequence) {
        super(zzfpe, charSequence);
        this.zza = zzfoy;
    }

    public final int zzc(int i) {
        return i + 1;
    }

    public final int zzd(int i) {
        zzfof zzfof = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfos.zzb(i, length, "index");
        while (i < length) {
            if (zzfof.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
