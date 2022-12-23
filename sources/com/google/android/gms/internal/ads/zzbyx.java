package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appsflyer.ServerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p358af.C13437d;

public final class zzbyx implements zzbyz {
    @VisibleForTesting
    public static zzbyz zza;
    @VisibleForTesting
    public static zzbyz zzb;
    private static final Object zzc = new Object();
    private final Object zzd = new Object();
    private final Context zze;
    private final WeakHashMap zzf = new WeakHashMap();
    private final ExecutorService zzg;
    private final zzcfo zzh;

    public zzbyx(Context context, zzcfo zzcfo) {
        zzfnt.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcfo;
    }

    public static zzbyz zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbjw.zze.zze()).booleanValue()) {
                    if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgw)).booleanValue()) {
                        zza = new zzbyx(context, zzcfo.zza());
                    }
                }
                zza = new zzbyy();
            }
        }
        return zza;
    }

    public static zzbyz zzb(Context context, zzcfo zzcfo) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbjw.zze.zze()).booleanValue()) {
                    if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgw)).booleanValue()) {
                        zzbyx zzbyx = new zzbyx(context, zzcfo);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbyx.zzd) {
                                zzbyx.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbyw(zzbyx, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbyv(zzbyx, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbyx;
                    }
                }
                zzb = new zzbyy();
            }
        }
        return zzb;
    }

    public final void zzc(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzcfb.zzm(stackTraceElement.getClassName());
                    z2 |= zzbyx.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                zze(th, "", 1.0f);
            }
        }
    }

    public final void zzd(Throwable th, String str) {
        zze(th, str, 1.0f);
    }

    public final void zze(Throwable th, String str, float f) {
        int i;
        boolean z;
        String str2;
        String str3;
        if (zzcfb.zzf(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            double d = (double) f;
            double random = Math.random();
            if (f > BitmapDescriptorFactory.HUE_RED) {
                i = (int) (1.0f / f);
            } else {
                i = 1;
            }
            if (random < d) {
                ArrayList arrayList = new ArrayList();
                try {
                    z = Wrappers.packageManager(this.zze).isCallerInstantApp();
                } catch (Throwable th2) {
                    zzcfi.zzh("Error fetching instant app info", th2);
                    z = false;
                }
                try {
                    str2 = this.zze.getPackageName();
                } catch (Throwable unused) {
                    zzcfi.zzj("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str4 = Build.MANUFACTURER;
                String str5 = Build.MODEL;
                if (!str5.startsWith(str4)) {
                    str5 = C13437d.m33706k(str4, " ", str5);
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(ServerParameters.DEVICE_KEY, str5).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, zzbhy.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "448117567").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbjw.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze)));
                if (true != this.zzh.zze) {
                    str3 = "0";
                } else {
                    str3 = DiskLruCache.VERSION_1;
                }
                arrayList.add(appendQueryParameter2.appendQueryParameter("lite", str3).toString());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.zzg.execute(new zzbyu(new zzcfn((String) null), (String) it.next()));
                }
            }
        }
    }
}
