package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.appboy.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfr;
import com.google.android.gms.internal.gtm.zzfs;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

@VisibleForTesting
public class Tracker extends zzbs {
    private boolean zza;
    private final Map<String, String> zzb;
    private final Map<String, String> zzc = new HashMap();
    /* access modifiers changed from: private */
    public final zzez zzd;
    /* access modifiers changed from: private */
    public final zzv zze;
    private ExceptionReporter zzf;
    /* access modifiers changed from: private */
    public zzfr zzg;

    public Tracker(zzbv zzbv, String str, zzez zzez) {
        super(zzbv);
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        if (str != null) {
            hashMap.put("&tid", str);
        }
        hashMap.put("useSecure", DiskLruCache.VERSION_1);
        hashMap.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.zzd = new zzez(60, 2000, "tracking", zzC());
        this.zze = new zzv(this, zzbv);
    }

    private static void zzZ(Map<String, String> map, Map<String, String> map2) {
        Preconditions.checkNotNull(map2);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String zzn = zzn(next);
                if (zzn != null) {
                    map2.put(zzn, (String) next.getValue());
                }
            }
        }
    }

    private static String zzn(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        if (!key.startsWith("&") || key.length() < 2) {
            return null;
        }
        return entry.getKey().substring(1);
    }

    public void enableAdvertisingIdCollection(boolean z) {
        this.zza = z;
    }

    public void enableAutoActivityTracking(boolean z) {
        this.zze.zzc(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enableExceptionReporting(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.analytics.ExceptionReporter r0 = r2.zzf     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0007
            r1 = 0
            goto L_0x0008
        L_0x0007:
            r1 = 1
        L_0x0008:
            if (r1 != r3) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            if (r3 == 0) goto L_0x0026
            android.content.Context r3 = r2.zzo()     // Catch:{ all -> 0x0034 }
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ all -> 0x0034 }
            com.google.android.gms.analytics.ExceptionReporter r1 = new com.google.android.gms.analytics.ExceptionReporter     // Catch:{ all -> 0x0034 }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x0034 }
            r2.zzf = r1     // Catch:{ all -> 0x0034 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "Uncaught exceptions will be reported to Google Analytics"
            r2.zzO(r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0026:
            java.lang.Thread$UncaughtExceptionHandler r3 = r0.zza()     // Catch:{ all -> 0x0034 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "Uncaught exceptions will not be reported to Google Analytics"
            r2.zzO(r3)     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.Tracker.enableExceptionReporting(boolean):void");
    }

    public String get(String str) {
        zzW();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.zzb.containsKey(str)) {
            return this.zzb.get(str);
        }
        if (str.equals("&ul")) {
            return zzfs.zzd(Locale.getDefault());
        }
        if (str.equals("&cid")) {
            return zzv().zzb();
        }
        if (str.equals("&sr")) {
            return zzx().zzb();
        }
        if (str.equals("&aid")) {
            return zzu().zza().zzd();
        }
        if (str.equals("&an")) {
            return zzu().zza().zzf();
        }
        if (str.equals("&av")) {
            return zzu().zza().zzg();
        }
        if (str.equals("&aiid")) {
            return zzu().zza().zze();
        }
        return null;
    }

    public void send(Map<String, String> map) {
        boolean z;
        long currentTimeMillis = zzC().currentTimeMillis();
        if (zzp().getAppOptOut()) {
            zzF("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean isDryRunEnabled = zzp().isDryRunEnabled();
        HashMap hashMap = new HashMap();
        zzZ(this.zzb, hashMap);
        zzZ(map, hashMap);
        String str = this.zzb.get("useSecure");
        int i = 1;
        if (str == null || str.equalsIgnoreCase(InneractiveMediationDefs.SHOW_HOUSE_AD_YES) || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase(DiskLruCache.VERSION_1) || (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase("0"))) {
            z = true;
        } else {
            z = false;
        }
        Map<String, String> map2 = this.zzc;
        Preconditions.checkNotNull(hashMap);
        for (Map.Entry next : map2.entrySet()) {
            String zzn = zzn(next);
            if (zzn != null && !hashMap.containsKey(zzn)) {
                hashMap.put(zzn, (String) next.getValue());
            }
        }
        this.zzc.clear();
        String str2 = (String) hashMap.get(Constants.APPBOY_PUSH_TITLE_KEY);
        if (TextUtils.isEmpty(str2)) {
            zzz().zzc(hashMap, "Missing hit type parameter");
            return;
        }
        String str3 = (String) hashMap.get("tid");
        if (!TextUtils.isEmpty(str3)) {
            boolean z2 = this.zza;
            synchronized (this) {
                if ("screenview".equalsIgnoreCase(str2) || "pageview".equalsIgnoreCase(str2) || "appview".equalsIgnoreCase(str2) || TextUtils.isEmpty(str2)) {
                    String str4 = this.zzb.get("&a");
                    Preconditions.checkNotNull(str4);
                    int parseInt = Integer.parseInt(str4) + 1;
                    if (parseInt < Integer.MAX_VALUE) {
                        i = parseInt;
                    }
                    this.zzb.put("&a", Integer.toString(i));
                }
            }
            zzq().zzi(new zzu(this, hashMap, z2, str2, currentTimeMillis, isDryRunEnabled, z, str3));
            return;
        }
        zzz().zzc(hashMap, "Missing tracking id parameter");
    }

    public void set(String str, String str2) {
        Preconditions.checkNotNull(str, "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.zzb.put(str, str2);
        }
    }

    public void setAnonymizeIp(boolean z) {
        set("&aip", zzfs.zzc(z));
    }

    public void setAppId(String str) {
        set("&aid", str);
    }

    public void setAppInstallerId(String str) {
        set("&aiid", str);
    }

    public void setAppName(String str) {
        set("&an", str);
    }

    public void setAppVersion(String str) {
        set("&av", str);
    }

    public void setCampaignParamsOnNextHit(Uri uri) {
        String str;
        if (uri != null && !uri.isOpaque()) {
            String queryParameter = uri.getQueryParameter("referrer");
            if (!TextUtils.isEmpty(queryParameter)) {
                String valueOf = String.valueOf(queryParameter);
                if (valueOf.length() != 0) {
                    str = "http://hostname/?".concat(valueOf);
                } else {
                    str = new String("http://hostname/?");
                }
                Uri parse = Uri.parse(str);
                String queryParameter2 = parse.getQueryParameter("utm_id");
                if (queryParameter2 != null) {
                    this.zzc.put("&ci", queryParameter2);
                }
                String queryParameter3 = parse.getQueryParameter("anid");
                if (queryParameter3 != null) {
                    this.zzc.put("&anid", queryParameter3);
                }
                String queryParameter4 = parse.getQueryParameter("utm_campaign");
                if (queryParameter4 != null) {
                    this.zzc.put("&cn", queryParameter4);
                }
                String queryParameter5 = parse.getQueryParameter("utm_content");
                if (queryParameter5 != null) {
                    this.zzc.put("&cc", queryParameter5);
                }
                String queryParameter6 = parse.getQueryParameter("utm_medium");
                if (queryParameter6 != null) {
                    this.zzc.put("&cm", queryParameter6);
                }
                String queryParameter7 = parse.getQueryParameter("utm_source");
                if (queryParameter7 != null) {
                    this.zzc.put("&cs", queryParameter7);
                }
                String queryParameter8 = parse.getQueryParameter("utm_term");
                if (queryParameter8 != null) {
                    this.zzc.put("&ck", queryParameter8);
                }
                String queryParameter9 = parse.getQueryParameter("dclid");
                if (queryParameter9 != null) {
                    this.zzc.put("&dclid", queryParameter9);
                }
                String queryParameter10 = parse.getQueryParameter("gclid");
                if (queryParameter10 != null) {
                    this.zzc.put("&gclid", queryParameter10);
                }
                String queryParameter11 = parse.getQueryParameter("aclid");
                if (queryParameter11 != null) {
                    this.zzc.put("&aclid", queryParameter11);
                }
            }
        }
    }

    public void setClientId(String str) {
        set("&cid", str);
    }

    public void setEncoding(String str) {
        set("&de", str);
    }

    public void setHostname(String str) {
        set("&dh", str);
    }

    public void setLanguage(String str) {
        set("&ul", str);
    }

    public void setLocation(String str) {
        set("&dl", str);
    }

    public void setPage(String str) {
        set("&dp", str);
    }

    public void setReferrer(String str) {
        set("&dr", str);
    }

    public void setSampleRate(double d) {
        set("&sf", Double.toString(d));
    }

    public void setScreenColors(String str) {
        set("&sd", str);
    }

    public void setScreenName(String str) {
        set("&cd", str);
    }

    public void setScreenResolution(int i, int i2) {
        if (i >= 0 || i2 >= 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            set("&sr", sb.toString());
            return;
        }
        zzR("Invalid width or height. The values should be non-negative.");
    }

    public void setSessionTimeout(long j) {
        this.zze.zze(j * 1000);
    }

    public void setTitle(String str) {
        set("&dt", str);
    }

    public void setUseSecure(boolean z) {
        set("useSecure", zzfs.zzc(z));
    }

    public void setViewportSize(String str) {
        set("&vp", str);
    }

    public final void zzd() {
        this.zze.zzX();
        String zza2 = zzB().zza();
        if (zza2 != null) {
            set("&an", zza2);
        }
        String zzb2 = zzB().zzb();
        if (zzb2 != null) {
            set("&av", zzb2);
        }
    }

    public final void zzm(zzfr zzfr) {
        boolean z;
        boolean z2;
        zzO("Loading Tracker config values");
        this.zzg = zzfr;
        String str = zzfr.zza;
        if (str != null) {
            set("&tid", str);
            zzP("trackingId loaded", str);
        }
        double d = zzfr.zzb;
        if (d >= 0.0d) {
            String d2 = Double.toString(d);
            set("&sf", d2);
            zzP("Sample frequency loaded", d2);
        }
        int i = zzfr.zzc;
        if (i >= 0) {
            setSessionTimeout((long) i);
            zzP("Session timeout loaded", Integer.valueOf(i));
        }
        int i2 = zzfr.zzd;
        boolean z3 = false;
        if (i2 != -1) {
            if (1 != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            enableAutoActivityTracking(z2);
            zzP("Auto activity tracking loaded", Boolean.valueOf(z2));
        }
        int i3 = zzfr.zze;
        if (i3 != -1) {
            if (i3 != 0) {
                set("&aip", DiskLruCache.VERSION_1);
            }
            if (1 != i3) {
                z = false;
            } else {
                z = true;
            }
            zzP("Anonymize ip loaded", Boolean.valueOf(z));
        }
        if (zzfr.zzf == 1) {
            z3 = true;
        }
        enableExceptionReporting(z3);
    }
}
