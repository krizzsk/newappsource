package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzih */
public final class zzih {
    private ArrayList zza = new ArrayList();
    private zzie zzb = zzie.zza;
    private Integer zzc = null;

    public final zzih zza(zzbe zzbe, int i, zzbn zzbn) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzij(zzbe, i, zzbn, (zzii) null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzih zzb(zzie zzie) {
        if (this.zza != null) {
            this.zzb = zzie;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzih zzc(int i) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzil zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((zzij) arrayList.get(i)).zza() != intValue) {
                        i = i2;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzil zzil = new zzil(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, (zzik) null);
            this.zza = null;
            return zzil;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
