package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzge */
final class zzge extends zzbn {
    private final String zza;
    private final zzoa zzb;

    public /* synthetic */ zzge(String str, zzoa zzoa, zzgd zzgd) {
        this.zza = str;
        this.zzb = zzoa;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.zza;
        zzoa zzoa = this.zzb;
        zzmt zzmt = zzmt.UNKNOWN_KEYMATERIAL;
        zzoa zzoa2 = zzoa.UNKNOWN_PREFIX;
        int ordinal = zzoa.ordinal();
        if (ordinal == 1) {
            str = "TINK";
        } else if (ordinal == 2) {
            str = "LEGACY";
        } else if (ordinal == 3) {
            str = "RAW";
        } else if (ordinal != 4) {
            str = "UNKNOWN";
        } else {
            str = "CRUNCHY";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
