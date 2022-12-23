package com.google.android.gms.internal.p986firebaseauthapi;

import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpb */
public final class zzpb {
    public static final zzpb zza = new zzpb(new zzpc());
    public static final zzpb zzb = new zzpb(new zzpg());
    public static final zzpb zzc = new zzpb(new zzpi());
    public static final zzpb zzd = new zzpb(new zzph());
    public static final zzpb zze = new zzpb(new zzpd());
    public static final zzpb zzf = new zzpb(new zzpf());
    public static final zzpb zzg = new zzpb(new zzpe());
    private static final Logger zzh = Logger.getLogger(zzpb.class.getName());
    private static final List zzi;
    private static final boolean zzj;
    private final zzpj zzk;

    static {
        if (zzdw.zzb()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, KeyProvider18.CIPHER_PROVIDER_NAME_FOR_RSA, "Conscrypt");
            zzj = false;
        } else if (zzpt.zza()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, KeyProvider18.CIPHER_PROVIDER_NAME_FOR_RSA);
            zzj = true;
        } else {
            zzi = new ArrayList();
            zzj = true;
        }
    }

    public zzpb(zzpj zzpj) {
        this.zzk = zzpj;
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                zzh.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider zza2 : zzi) {
            try {
                return this.zzk.zza(str, zza2);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (zzj) {
            return this.zzk.zza(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
