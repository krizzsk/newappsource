package com.google.android.gms.internal.p986firebaseauthapi;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec$Builder;
import android.util.Log;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.google.android.gms.stats.CodePackage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfl */
public final class zzfl {
    /* access modifiers changed from: private */
    public zzbj zza = null;
    private String zzb = null;
    /* access modifiers changed from: private */
    public zzap zzc = null;
    private zzbf zzd = null;
    /* access modifiers changed from: private */
    public zzbi zze;
    private zzfq zzf = null;

    private final zzap zzh() throws GeneralSecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            zzfp zzfp = new zzfp();
            boolean zzc2 = zzfp.zzc(this.zzb);
            if (!zzc2) {
                try {
                    String str = this.zzb;
                    if (!new zzfp().zzc(str)) {
                        String zza2 = zzpu.zza("android-keystore://", str);
                        KeyGenerator instance = KeyGenerator.getInstance(KeyProvider18.KEY_ALGORITHM_AES, KeyProvider18.ANDROID_KEY_STORE_NAME);
                        instance.init(new KeyGenParameterSpec$Builder(zza2, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
                        instance.generateKey();
                    } else {
                        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
                    }
                } catch (GeneralSecurityException | ProviderException unused) {
                    String unused2 = zzfn.zzb;
                    return null;
                }
            }
            try {
                return zzfp.zza(this.zzb);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!zzc2) {
                    String unused3 = zzfn.zzb;
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.zzb}), e);
            }
        } else {
            String unused4 = zzfn.zzb;
            return null;
        }
    }

    private final zzbi zzi() throws GeneralSecurityException, IOException {
        zzap zzap = this.zzc;
        if (zzap != null) {
            try {
                return zzbi.zzf(zzbh.zzh(this.zzf, zzap));
            } catch (zzacp | GeneralSecurityException unused) {
                String unused2 = zzfn.zzb;
            }
        }
        return zzbi.zzf(zzar.zzb(this.zzf));
    }

    @Deprecated
    public final zzfl zzd(zzmz zzmz) {
        String zzf2 = zzmz.zzf();
        byte[] zzt = zzmz.zze().zzt();
        zzoa zzd2 = zzmz.zzd();
        int i = zzfn.zza;
        zzoa zzoa = zzoa.UNKNOWN_PREFIX;
        int ordinal = zzd2.ordinal();
        int i2 = 4;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal == 3) {
            i2 = 3;
        } else if (ordinal != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.zzd = zzbf.zze(zzf2, zzt, i2);
        return this;
    }

    public final zzfl zze(String str) {
        if (str.startsWith("android-keystore://")) {
            this.zzb = str;
            return this;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    public final zzfl zzf(Context context, String str, String str2) throws IOException {
        if (context != null) {
            this.zzf = new zzfq(context, "GenericIdpKeyset", str2);
            this.zza = new zzfr(context, "GenericIdpKeyset", str2);
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public final synchronized zzfn zzg() throws GeneralSecurityException, IOException {
        zzbi zzbi;
        if (this.zzb != null) {
            this.zzc = zzh();
        }
        try {
            zzbi = zzi();
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(zzfn.zzb, 4)) {
                String unused = zzfn.zzb;
                String.format("keyset not found, will generate a new one. %s", new Object[]{e.getMessage()});
            }
            if (this.zzd != null) {
                zzbi = zzbi.zze();
                zzbi.zzc(this.zzd);
                zzbi.zzd(zzbi.zzb().zzd().zzb(0).zza());
                if (this.zzc != null) {
                    zzbi.zzb().zzf(this.zza, this.zzc);
                } else {
                    zzar.zza(zzbi.zzb(), this.zza);
                }
            } else {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }
        this.zze = zzbi;
        return new zzfn(this, (zzfm) null);
    }
}
