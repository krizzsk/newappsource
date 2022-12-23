package com.google.android.gms.internal.ads;

import java.util.Map;

public final /* synthetic */ class zzbnu implements zzbol {
    public static final /* synthetic */ zzbnu zza = new zzbnu();

    private /* synthetic */ zzbnu() {
    }

    public final void zza(Object obj, Map map) {
        zzcmq zzcmq = (zzcmq) obj;
        zzbol zzbol = zzbok.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzaoc zzK = zzcmq.zzK();
            if (zzK != null) {
                zzK.zzc().zzl(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzcfi.zzj("Could not parse touch parameters from gmsg.");
        }
    }
}
