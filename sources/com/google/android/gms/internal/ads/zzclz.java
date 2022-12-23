package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

final class zzclz implements zzbol {
    public final /* synthetic */ zzcmb zza;

    public zzclz(zzcmb zzcmb) {
        this.zza = zzcmb;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        zzcmb zzcmb = this.zza;
                        if (zzcmb.zzG != parseInt) {
                            zzcmb.zzG = parseInt;
                            this.zza.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    zzcfi.zzk("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
