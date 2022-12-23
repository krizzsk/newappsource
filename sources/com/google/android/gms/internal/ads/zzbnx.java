package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class zzbnx implements zzbol {
    public static final /* synthetic */ zzbnx zza = new zzbnx();

    private /* synthetic */ zzbnx() {
    }

    public final void zza(Object obj, Map map) {
        boolean z;
        zzcmj zzcmj = (zzcmj) obj;
        zzbol zzbol = zzbok.zza;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgP)).booleanValue()) {
            zzcfi.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            zzcfi.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        if (zzcmj.getContext().getPackageManager().getLaunchIntentForPackage(str) != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        hashMap.put(str, valueOf);
        zze.zza("/canOpenApp;" + str + ";" + valueOf);
        ((zzbrc) zzcmj).zzd("openableApp", hashMap);
    }
}
