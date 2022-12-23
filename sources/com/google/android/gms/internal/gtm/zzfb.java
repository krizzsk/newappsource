package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;

public final class zzfb extends zzbs {
    private static zzfb zza;

    public zzfb(zzbv zzbv) {
        super(zzbv);
    }

    public static zzfb zza() {
        return zza;
    }

    @VisibleForTesting
    public static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            StringBuilder k = C13555b.m33972k(str);
            k.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            k.append("...");
            k.append(str);
            k.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d));
            return k.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                return obj.getClass().getCanonicalName();
            }
            return str;
        }
    }

    public final void zzb(zzex zzex, String str) {
        String str2;
        String str3;
        if (zzex != null) {
            str2 = zzex.toString();
        } else {
            str2 = "no hit data";
        }
        if (str.length() != 0) {
            str3 = "Discarding hit. ".concat(str);
        } else {
            str3 = new String("Discarding hit. ");
        }
        zzS(str3, str2);
    }

    public final void zzc(Map<String, String> map, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) next.getKey());
            sb.append('=');
            sb.append((String) next.getValue());
        }
        String sb2 = sb.toString();
        if (str.length() != 0) {
            str2 = "Discarding hit. ".concat(str);
        } else {
            str2 = new String("Discarding hit. ");
        }
        zzS(str2, sb2);
    }

    public final void zzd() {
        synchronized (zzfb.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        Preconditions.checkNotNull(str);
        if (zzw().zzb()) {
            zzw();
            c = 'C';
        } else {
            zzw();
            c = 'c';
        }
        char charAt = "01VDIWEA?".charAt(i);
        String str2 = zzbt.zza;
        String zzD = zzbr.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(zzD).length());
        sb.append("3");
        sb.append(charAt);
        sb.append(c);
        sb.append(str2);
        sb.append(":");
        sb.append(zzD);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = sb2.substring(0, 1024);
        }
        zzfh zzp = zzt().zzp();
        if (zzp != null) {
            zzp.zze().zzc(sb2);
        }
    }
}
