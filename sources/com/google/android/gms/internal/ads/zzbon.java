package com.google.android.gms.internal.ads;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.Map;

public final class zzbon implements zzbol {
    private final zzboo zza;

    public zzbon(zzboo zzboo, byte[] bArr) {
        this.zza = zzboo;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        boolean equals = DiskLruCache.VERSION_1.equals(map.get("transparentBackground"));
        boolean equals2 = DiskLruCache.VERSION_1.equals(map.get("blur"));
        float f = BitmapDescriptorFactory.HUE_RED;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzcfi.zzh("Fail to parse float", e);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f);
        zzcli.zzav(equals);
    }
}
