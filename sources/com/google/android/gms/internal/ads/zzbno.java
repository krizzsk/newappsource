package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.appboy.Constants;
import com.google.android.gms.ads.internal.zzt;
import com.usebutton.sdk.internal.events.Events;
import java.util.Map;

public final class zzbno implements zzbol {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        String str = (String) map.get(Events.PROPERTY_ACTION);
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzcfi.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzcfi.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long parseLong = (Long.parseLong(str4) - zzt.zzA().currentTimeMillis()) + zzt.zzA().elapsedRealtime();
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcli.zzo().zzc(str2, str3, parseLong);
                } catch (NumberFormatException e) {
                    zzcfi.zzk("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzcfi.zzj("No value given for CSI experiment.");
            } else {
                zzcli.zzo().zza().zzd("e", str5);
            }
        } else if (Constants.APPBOY_PUSH_EXTRAS_KEY.equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzcfi.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzcfi.zzj("No name given for CSI extra.");
            } else {
                zzcli.zzo().zza().zzd(str6, str7);
            }
        }
    }
}
