package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzz */
final class zzz extends zzad {
    public final /* synthetic */ zzaa zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzz(zzaa zzaa, zzaf zzaf, CharSequence charSequence) {
        super(zzaf, charSequence);
        this.zza = zzaa;
    }

    public final int zzc(int i) {
        return i + 1;
    }

    public final int zzd(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzy.zzb(i, length, "index");
        while (i < length) {
            if (charSequence.charAt(i) == '.') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
