package com.google.android.gms.tagmanager;

import com.appboy.models.MessageButton;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

final class zzbz extends zzbu {
    private static final String zza = zza.HASH.toString();
    private static final String zzb = zzb.ARG0.toString();
    private static final String zzc = zzb.ALGORITHM.toString();
    private static final String zzd = zzb.INPUT_FORMAT.toString();

    public zzbz() {
        super(zza, zzb);
    }

    public final zzak zza(Map<String, zzak> map) {
        String str;
        byte[] bArr;
        String str2;
        String str3;
        zzak zzak = map.get(zzb);
        if (zzak == null || zzak == zzfv.zzb()) {
            return zzfv.zzb();
        }
        String zzn = zzfv.zzn(zzfv.zzl(zzak));
        zzak zzak2 = map.get(zzc);
        if (zzak2 == null) {
            str = "MD5";
        } else {
            str = zzfv.zzn(zzfv.zzl(zzak2));
        }
        zzak zzak3 = map.get(zzd);
        String zzn2 = zzak3 == null ? MessageButton.TEXT : zzfv.zzn(zzfv.zzl(zzak3));
        if (MessageButton.TEXT.equals(zzn2)) {
            bArr = zzn.getBytes();
        } else if ("base16".equals(zzn2)) {
            bArr = zzp.zzb(zzn);
        } else {
            String valueOf = String.valueOf(zzn2);
            if (valueOf.length() != 0) {
                str3 = "Hash: unknown input format: ".concat(valueOf);
            } else {
                str3 = new String("Hash: unknown input format: ");
            }
            zzdh.zza(str3);
            return zzfv.zzb();
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return zzfv.zzc(zzp.zza(instance.digest()));
        } catch (NoSuchAlgorithmException unused) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str2 = "Hash: unknown algorithm: ".concat(valueOf2);
            } else {
                str2 = new String("Hash: unknown algorithm: ");
            }
            zzdh.zza(str2);
            return zzfv.zzb();
        }
    }

    public final boolean zzb() {
        return true;
    }
}
