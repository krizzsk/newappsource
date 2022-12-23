package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.Map;

final class zzcw extends zzbu {
    private static final String zza = zza.INSTALL_REFERRER.toString();
    private static final String zzb = zzb.COMPONENT.toString();
    private final Context zzc;

    public zzcw(Context context) {
        super(zza, new String[0]);
        this.zzc = context;
    }

    public final zzak zza(Map<String, zzak> map) {
        String str;
        String str2 = zzb;
        if (map.get(str2) != null) {
            str = zzfv.zzn(zzfv.zzl(map.get(str2)));
        } else {
            str = null;
        }
        String zzb2 = zzcx.zzb(this.zzc, str);
        if (zzb2 != null) {
            return zzfv.zzc(zzb2);
        }
        return zzfv.zzb();
    }

    public final boolean zzb() {
        return true;
    }
}
