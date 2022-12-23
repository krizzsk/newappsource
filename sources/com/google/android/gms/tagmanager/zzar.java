package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
final class zzar extends zzbu {
    private static final String zza = zza.FUNCTION_CALL.toString();
    private static final String zzb = zzb.FUNCTION_CALL_NAME.toString();
    private static final String zzc = zzb.ADDITIONAL_PARAMS.toString();
    private final zzaq zzd;

    public zzar(zzaq zzaq) {
        super(zza, zzb);
        this.zzd = zzaq;
    }

    public final zzak zza(Map<String, zzak> map) {
        String zzn = zzfv.zzn(zzfv.zzl(map.get(zzb)));
        HashMap hashMap = new HashMap();
        zzak zzak = map.get(zzc);
        if (zzak != null) {
            Object zzl = zzfv.zzl(zzak);
            if (!(zzl instanceof Map)) {
                zzdh.zzc("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzfv.zzb();
            }
            for (Map.Entry entry : ((Map) zzl).entrySet()) {
                hashMap.put(entry.getKey().toString(), entry.getValue());
            }
        }
        try {
            return zzfv.zzc(this.zzd.zza(zzn, hashMap));
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(zzn).length() + 34 + String.valueOf(message).length());
            sb.append("Custom macro/tag ");
            sb.append(zzn);
            sb.append(" threw exception ");
            sb.append(message);
            zzdh.zzc(sb.toString());
            return zzfv.zzb();
        }
    }

    public final boolean zzb() {
        return false;
    }
}
