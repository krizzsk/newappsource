package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzo extends zzft {
    public static final String zza;
    private static final String zzb;
    private static final String zzc = zzb.URL.toString();
    private static final String zzd = zzb.ADDITIONAL_PARAMS.toString();
    private static final String zze = zzb.UNREPEATABLE.toString();
    private static final Set<String> zzf = new HashSet();
    private final zzn zzg;
    private final Context zzh;

    static {
        String zza2 = zza.ARBITRARY_PIXEL.toString();
        zzb = zza2;
        zza = C13715c.m34245k(new StringBuilder(String.valueOf(zza2).length() + 17), "gtm_", zza2, "_unrepeatable");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzo(Context context) {
        super(zzb, zzc);
        zzm zzm = new zzm(context);
        this.zzg = zzm;
        this.zzh = context;
    }

    private final synchronized boolean zzd(String str) {
        Set<String> set = zzf;
        if (set.contains(str)) {
            return true;
        }
        if (!this.zzh.getSharedPreferences(zza, 0).contains(str)) {
            return false;
        }
        set.add(str);
        return true;
    }

    public final void zzc(Map<String, zzak> map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = zze;
        if (map.get(str5) != null) {
            str = zzfv.zzn(zzfv.zzl(map.get(str5)));
        } else {
            str = null;
        }
        if (str == null || !zzd(str)) {
            Uri.Builder buildUpon = Uri.parse(zzfv.zzn(zzfv.zzl(map.get(zzc)))).buildUpon();
            zzak zzak = map.get(zzd);
            if (zzak != null) {
                Object zzl = zzfv.zzl(zzak);
                if (!(zzl instanceof List)) {
                    String valueOf = String.valueOf(buildUpon.build().toString());
                    if (valueOf.length() != 0) {
                        str4 = "ArbitraryPixel: additional params not a list: not sending partial hit: ".concat(valueOf);
                    } else {
                        str4 = new String("ArbitraryPixel: additional params not a list: not sending partial hit: ");
                    }
                    zzdh.zza(str4);
                    return;
                }
                for (Object next : (List) zzl) {
                    if (!(next instanceof Map)) {
                        String valueOf2 = String.valueOf(buildUpon.build().toString());
                        if (valueOf2.length() != 0) {
                            str3 = "ArbitraryPixel: additional params contains non-map: not sending partial hit: ".concat(valueOf2);
                        } else {
                            str3 = new String("ArbitraryPixel: additional params contains non-map: not sending partial hit: ");
                        }
                        zzdh.zza(str3);
                        return;
                    }
                    for (Map.Entry entry : ((Map) next).entrySet()) {
                        buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                    }
                }
            }
            String uri = buildUpon.build().toString();
            zzbh.zzb(((zzm) this.zzg).zza).zza(uri);
            String valueOf3 = String.valueOf(uri);
            if (valueOf3.length() != 0) {
                str2 = "ArbitraryPixel: url = ".concat(valueOf3);
            } else {
                str2 = new String("ArbitraryPixel: url = ");
            }
            zzdh.zzb.zzd(str2);
            if (str != null) {
                synchronized (zzo.class) {
                    zzf.add(str);
                    zzfg.zza(this.zzh, zza, str, InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                }
            }
        }
    }
}
