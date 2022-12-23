package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzil */
public final class zzil {
    private final zzie zza;
    private final List zzb;
    private final Integer zzc;

    public /* synthetic */ zzil(zzie zzie, List list, Integer num, zzik zzik) {
        this.zza = zzie;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzil)) {
            return false;
        }
        zzil zzil = (zzil) obj;
        if (this.zza.equals(zzil.zza) && this.zzb.equals(zzil.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzil.zzc;
            if (num == num2) {
                return true;
            }
            if (num == null || !num.equals(num2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.zza, this.zzb, this.zzc});
    }
}
