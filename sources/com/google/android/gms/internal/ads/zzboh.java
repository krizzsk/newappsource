package com.google.android.gms.internal.ads;

import com.usebutton.sdk.internal.events.Events;
import java.util.Map;

final class zzboh implements zzbol {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        String str = (String) map.get(Events.PROPERTY_ACTION);
        if ("pause".equals(str)) {
            zzcli.zzbn();
        } else if ("resume".equals(str)) {
            zzcli.zzbo();
        }
    }
}
