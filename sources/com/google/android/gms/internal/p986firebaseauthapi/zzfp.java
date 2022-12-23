package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Build;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfp */
public final class zzfp implements zzbk {
    private static final String zza = "zzfp";
    private KeyStore zzb;

    public zzfp() throws GeneralSecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                KeyStore instance = KeyStore.getInstance(KeyProvider18.ANDROID_KEY_STORE_NAME);
                instance.load((KeyStore.LoadStoreParameter) null);
                this.zzb = instance;
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }
    }

    public final synchronized zzap zza(String str) throws GeneralSecurityException {
        zzfo zzfo;
        zzfo = new zzfo(zzpu.zza("android-keystore://", str), this.zzb);
        byte[] zza2 = zzps.zza(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(zza2, zzfo.zza(zzfo.zzb(zza2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return zzfo;
    }

    public final synchronized boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzc(java.lang.String r3) throws java.security.GeneralSecurityException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r3 = com.google.android.gms.internal.p986firebaseauthapi.zzpu.zza(r0, r3)     // Catch:{ all -> 0x002f }
            java.security.KeyStore r0 = r2.zzb     // Catch:{ NullPointerException -> 0x000f }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x000f }
            monitor-exit(r2)
            return r3
        L_0x000f:
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
            r2.zzb = r0     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
        L_0x0020:
            java.security.KeyStore r0 = r2.zzb     // Catch:{ all -> 0x002f }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r2)
            return r3
        L_0x0028:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x002f }
            r0.<init>(r3)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p986firebaseauthapi.zzfp.zzc(java.lang.String):boolean");
    }
}
