package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.appboy.models.MessageButton;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.Map;

final class zzbq extends zzbu {
    private static final String zza = zza.ENCODE.toString();
    private static final String zzb = zzb.ARG0.toString();
    private static final String zzc = zzb.NO_PADDING.toString();
    private static final String zzd = zzb.INPUT_FORMAT.toString();
    private static final String zze = zzb.OUTPUT_FORMAT.toString();

    public zzbq() {
        super(zza, zzb);
    }

    public final zzak zza(Map<String, zzak> map) {
        String str;
        byte[] bArr;
        String str2;
        String str3;
        String str4;
        zzak zzak = map.get(zzb);
        if (zzak == null || zzak == zzfv.zzb()) {
            return zzfv.zzb();
        }
        String zzn = zzfv.zzn(zzfv.zzl(zzak));
        zzak zzak2 = map.get(zzd);
        String zzn2 = zzak2 == null ? MessageButton.TEXT : zzfv.zzn(zzfv.zzl(zzak2));
        zzak zzak3 = map.get(zze);
        if (zzak3 == null) {
            str = "base16";
        } else {
            str = zzfv.zzn(zzfv.zzl(zzak3));
        }
        zzak zzak4 = map.get(zzc);
        int i = 2;
        if (zzak4 != null && zzfv.zzg(zzfv.zzl(zzak4)).booleanValue()) {
            i = 3;
        }
        try {
            if (MessageButton.TEXT.equals(zzn2)) {
                bArr = zzn.getBytes();
            } else if ("base16".equals(zzn2)) {
                bArr = zzp.zzb(zzn);
            } else if ("base64".equals(zzn2)) {
                bArr = Base64.decode(zzn, i);
            } else if ("base64url".equals(zzn2)) {
                bArr = Base64.decode(zzn, i | 8);
            } else {
                String valueOf = String.valueOf(zzn2);
                if (valueOf.length() != 0) {
                    str4 = "Encode: unknown input format: ".concat(valueOf);
                } else {
                    str4 = new String("Encode: unknown input format: ");
                }
                zzdh.zza(str4);
                return zzfv.zzb();
            }
            if ("base16".equals(str)) {
                str2 = zzp.zza(bArr);
            } else if ("base64".equals(str)) {
                str2 = Base64.encodeToString(bArr, i);
            } else if ("base64url".equals(str)) {
                str2 = Base64.encodeToString(bArr, i | 8);
            } else {
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str3 = "Encode: unknown output format: ".concat(valueOf2);
                } else {
                    str3 = new String("Encode: unknown output format: ");
                }
                zzdh.zza(str3);
                return zzfv.zzb();
            }
            return zzfv.zzc(str2);
        } catch (IllegalArgumentException unused) {
            zzdh.zza("Encode: invalid input:");
            return zzfv.zzb();
        }
    }

    public final boolean zzb() {
        return true;
    }
}
