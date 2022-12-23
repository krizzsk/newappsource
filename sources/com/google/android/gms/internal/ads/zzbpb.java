package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.usebutton.sdk.internal.events.Events;
import java.util.Map;

public final class zzbpb implements zzbol {
    private final zzbpa zza;

    public zzbpb(zzbpa zzbpa) {
        this.zza = zzbpa;
    }

    public static void zzb(zzcli zzcli, zzbpa zzbpa) {
        zzcli.zzaf("/reward", new zzbpb(zzbpa));
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get(Events.PROPERTY_ACTION);
        if ("grant".equals(str)) {
            zzcaw zzcaw = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzcaw = new zzcaw(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                zzcfi.zzk("Unable to parse reward amount.", e);
            }
            this.zza.zza(zzcaw);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
