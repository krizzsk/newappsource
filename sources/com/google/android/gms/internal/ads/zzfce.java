package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final /* synthetic */ class zzfce implements zzbol {
    public final /* synthetic */ zzfig zza;
    public final /* synthetic */ zzeen zzb;

    public /* synthetic */ zzfce(zzfig zzfig, zzeen zzeen) {
        this.zza = zzfig;
        this.zzb = zzeen;
    }

    public final void zza(Object obj, Map map) {
        zzfig zzfig = this.zza;
        zzeen zzeen = this.zzb;
        zzckz zzckz = (zzckz) obj;
        String str = (String) map.get("u");
        if (str == null) {
            zzcfi.zzj("URL missing from httpTrack GMSG.");
        } else if (!zzckz.zzF().zzak) {
            zzfig.zzc(str, (zzfhq) null);
        } else {
            zzeen.zzd(new zzeep(zzt.zzA().currentTimeMillis(), ((zzcmf) zzckz).zzR().zzb, str, 2));
        }
    }
}
