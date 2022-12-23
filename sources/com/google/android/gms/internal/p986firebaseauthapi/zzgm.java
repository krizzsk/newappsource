package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgm */
public final class zzgm {
    private static final zzgm zza = new zzgm();
    private final AtomicReference zzb = new AtomicReference(new zzhe(new zzgy(), (zzhd) null));

    public static zzgm zzb() {
        return zza;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        return new com.google.android.gms.internal.p986firebaseauthapi.zzgf(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        throw new com.google.android.gms.internal.p986firebaseauthapi.zzhf("Creating a LegacyProtoKey failed", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.p986firebaseauthapi.zzaw zza(com.google.android.gms.internal.p986firebaseauthapi.zzgv r2, com.google.android.gms.internal.p986firebaseauthapi.zzca r3) {
        /*
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb     // Catch:{ GeneralSecurityException -> 0x000d }
            java.lang.Object r0 = r0.get()     // Catch:{ GeneralSecurityException -> 0x000d }
            com.google.android.gms.internal.firebase-auth-api.zzhe r0 = (com.google.android.gms.internal.p986firebaseauthapi.zzhe) r0     // Catch:{ GeneralSecurityException -> 0x000d }
            com.google.android.gms.internal.firebase-auth-api.zzaw r2 = r0.zza(r2, r3)     // Catch:{ GeneralSecurityException -> 0x000d }
            return r2
        L_0x000d:
            com.google.android.gms.internal.firebase-auth-api.zzgf r0 = new com.google.android.gms.internal.firebase-auth-api.zzgf     // Catch:{ GeneralSecurityException -> 0x0013 }
            r0.<init>(r2, r3)     // Catch:{ GeneralSecurityException -> 0x0013 }
            return r0
        L_0x0013:
            r2 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzhf r3 = new com.google.android.gms.internal.firebase-auth-api.zzhf
            java.lang.String r0 = "Creating a LegacyProtoKey failed"
            r3.<init>(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p986firebaseauthapi.zzgm.zza(com.google.android.gms.internal.firebase-auth-api.zzgv, com.google.android.gms.internal.firebase-auth-api.zzca):com.google.android.gms.internal.firebase-auth-api.zzaw");
    }

    public final synchronized void zzc(zzfv zzfv) throws GeneralSecurityException {
        zzgy zzgy = new zzgy((zzhe) this.zzb.get());
        zzgy.zza(zzfv);
        this.zzb.set(new zzhe(zzgy, (zzhd) null));
    }

    public final synchronized void zzd(zzfy zzfy) throws GeneralSecurityException {
        zzgy zzgy = new zzgy((zzhe) this.zzb.get());
        zzgy.zzb(zzfy);
        this.zzb.set(new zzhe(zzgy, (zzhd) null));
    }

    public final synchronized void zze(zzgp zzgp) throws GeneralSecurityException {
        zzgy zzgy = new zzgy((zzhe) this.zzb.get());
        zzgy.zzc(zzgp);
        this.zzb.set(new zzhe(zzgy, (zzhd) null));
    }

    public final synchronized void zzf(zzgs zzgs) throws GeneralSecurityException {
        zzgy zzgy = new zzgy((zzhe) this.zzb.get());
        zzgy.zzd(zzgs);
        this.zzb.set(new zzhe(zzgy, (zzhd) null));
    }
}
