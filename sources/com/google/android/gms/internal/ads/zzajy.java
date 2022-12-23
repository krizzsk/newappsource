package com.google.android.gms.internal.ads;

import com.amazonaws.http.HttpHeader;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p988j$.util.DesugarTimeZone;
import zendesk.support.Constants;

public final class zzajy {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzajn.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            zzajn.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static zzaik zzb(zzaix zzaix) {
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        zzaix zzaix2 = zzaix;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzaix2.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get(HttpHeader.DATE);
        if (str != null) {
            j = zza(str);
        } else {
            j = 0;
        }
        String str2 = (String) map.get(Constants.STANDARD_CACHING_HEADER);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, 0);
            int i2 = 0;
            j3 = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j3 = 0;
            j2 = 0;
        }
        String str3 = (String) map.get("Expires");
        if (str3 != null) {
            j4 = zza(str3);
        } else {
            j4 = 0;
        }
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j5 = zza(str4);
        } else {
            j5 = 0;
        }
        String str5 = (String) map.get("ETag");
        if (z) {
            j7 = currentTimeMillis + (j3 * 1000);
            if (i != 0) {
                j8 = j7;
            } else {
                Long.signum(j2);
                j8 = (j2 * 1000) + j7;
            }
            j6 = j8;
        } else {
            j6 = 0;
            if (j <= 0 || j4 < j) {
                j7 = 0;
            } else {
                j7 = currentTimeMillis + (j4 - j);
                j6 = j7;
            }
        }
        zzaik zzaik = new zzaik();
        zzaik.zza = zzaix2.zzb;
        zzaik.zzb = str5;
        zzaik.zzf = j7;
        zzaik.zze = j6;
        zzaik.zzc = j;
        zzaik.zzd = j5;
        zzaik.zzg = map;
        zzaik.zzh = zzaix2.zzd;
        return zzaik;
    }

    public static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
