package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.lang.reflect.InvocationTargetException;

public final class zzag extends zzgr {
    private Boolean zza;
    private zzaf zzb = zzae.zza;
    private Boolean zzc;

    public zzag(zzfy zzfy) {
        super(zzfy);
    }

    public static final long zzA() {
        return ((Long) zzeb.zzC.zza((Object) null)).longValue();
    }

    private final String zzB(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            this.zzs.zzay().zzd().zzb("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.zzs.zzay().zzd().zzb("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzeb.zzc.zza((Object) null)).longValue();
    }

    public final double zza(String str, zzea zzea) {
        if (str == null) {
            return ((Double) zzea.zza((Object) null)).doubleValue();
        }
        String zza2 = this.zzb.zza(str, zzea.zzb());
        if (TextUtils.isEmpty(zza2)) {
            return ((Double) zzea.zza((Object) null)).doubleValue();
        }
        try {
            return ((Double) zzea.zza(Double.valueOf(Double.parseDouble(zza2)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzea.zza((Object) null)).doubleValue();
        }
    }

    public final int zzb(String str) {
        return zzf(str, zzeb.zzG, 500, 2000);
    }

    public final int zzc() {
        zzlh zzv = this.zzs.zzv();
        Boolean zzj = zzv.zzs.zzt().zzj();
        if (zzv.zzm() >= 201500) {
            return 100;
        }
        if (zzj == null || zzj.booleanValue()) {
            return 25;
        }
        return 100;
    }

    public final int zzd(String str) {
        return zzf(str, zzeb.zzH, 25, 100);
    }

    public final int zze(String str, zzea zzea) {
        if (str == null) {
            return ((Integer) zzea.zza((Object) null)).intValue();
        }
        String zza2 = this.zzb.zza(str, zzea.zzb());
        if (TextUtils.isEmpty(zza2)) {
            return ((Integer) zzea.zza((Object) null)).intValue();
        }
        try {
            return ((Integer) zzea.zza(Integer.valueOf(Integer.parseInt(zza2)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzea.zza((Object) null)).intValue();
        }
    }

    public final int zzf(String str, zzea zzea, int i, int i2) {
        return Math.max(Math.min(zze(str, zzea), i2), i);
    }

    public final long zzh() {
        this.zzs.zzaw();
        return 73000;
    }

    public final long zzi(String str, zzea zzea) {
        if (str == null) {
            return ((Long) zzea.zza((Object) null)).longValue();
        }
        String zza2 = this.zzb.zza(str, zzea.zzb());
        if (TextUtils.isEmpty(zza2)) {
            return ((Long) zzea.zza((Object) null)).longValue();
        }
        try {
            return ((Long) zzea.zza(Long.valueOf(Long.parseLong(zza2)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzea.zza((Object) null)).longValue();
        }
    }

    @VisibleForTesting
    public final Bundle zzj() {
        try {
            if (this.zzs.zzau().getPackageManager() == null) {
                this.zzs.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzs.zzau()).getApplicationInfo(this.zzs.zzau().getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzs.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.zzs.zzay().zzd().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean zzk(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            C16530d.m42018k(this.zzs, "Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!zzj.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(zzj.getBoolean(str));
        }
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    public final String zzn() {
        this.zzs.zzaw();
        return "FA";
    }

    public final String zzo(String str, zzea zzea) {
        if (str == null) {
            return (String) zzea.zza((Object) null);
        }
        return (String) zzea.zza(this.zzb.zza(str, zzea.zzb()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026 A[SYNTHETIC, Splitter:B:8:0x0026] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzp(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzj()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            com.google.android.gms.measurement.internal.zzfy r4 = r3.zzs
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            p379.C16530d.m42018k(r4, r0)
            goto L_0x001a
        L_0x0014:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x001c
        L_0x001a:
            r4 = r1
            goto L_0x0024
        L_0x001c:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0024:
            if (r4 == 0) goto L_0x0050
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzs     // Catch:{ NotFoundException -> 0x0040 }
            android.content.Context r0 = r0.zzau()     // Catch:{ NotFoundException -> 0x0040 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0040 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0040 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0040 }
            if (r4 != 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0040 }
            return r4
        L_0x0040:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzd()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zzb(r2, r4)
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.zzp(java.lang.String):java.util.List");
    }

    public final void zzq(zzaf zzaf) {
        this.zzb = zzaf;
    }

    public final boolean zzr() {
        Boolean zzk = zzk("google_analytics_adid_collection_enabled");
        if (zzk == null || zzk.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzs(String str, zzea zzea) {
        if (str == null) {
            return ((Boolean) zzea.zza((Object) null)).booleanValue();
        }
        String zza2 = this.zzb.zza(str, zzea.zzb());
        if (TextUtils.isEmpty(zza2)) {
            return ((Boolean) zzea.zza((Object) null)).booleanValue();
        }
        return ((Boolean) zzea.zza(Boolean.valueOf(DiskLruCache.VERSION_1.equals(zza2)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return DiskLruCache.VERSION_1.equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean zzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        if (zzk == null || zzk.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzv() {
        this.zzs.zzaw();
        Boolean zzk = zzk("firebase_analytics_collection_deactivated");
        if (zzk == null || !zzk.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean zzw(String str) {
        return DiskLruCache.VERSION_1.equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk("app_measurement_lite");
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        if (this.zza.booleanValue() || !this.zzs.zzN()) {
            return true;
        }
        return false;
    }

    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = this.zzs.zzau().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.zzc = Boolean.valueOf(z);
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        this.zzs.zzay().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
