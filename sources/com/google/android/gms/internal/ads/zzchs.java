package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appsflyer.ServerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzk;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

public final class zzchs {
    private final Context zza;
    private final String zzb;
    private final zzcfo zzc;
    private final zzbik zzd;
    private final zzbin zze;
    private final zzbf zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm;
    private zzcgx zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq = -1;

    public zzchs(Context context, zzcfo zzcfo, String str, zzbin zzbin, zzbik zzbik) {
        zzbd zzbd = new zzbd();
        zzbd zzbd2 = zzbd;
        zzbd2.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbd2.zza("1_5", 1.0d, 5.0d);
        zzbd2.zza("5_10", 5.0d, 10.0d);
        zzbd2.zza("10_20", 10.0d, 20.0d);
        zzbd2.zza("20_30", 20.0d, 30.0d);
        zzbd2.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbd.zzb();
        this.zza = context;
        this.zzc = zzcfo;
        this.zzb = str;
        this.zze = zzbin;
        this.zzd = zzbik;
        String str2 = (String) zzay.zzc().zzb(zzbhy.zzy);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzg[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzcfi.zzk("Unable to parse frame hash target time number.", e);
                this.zzg[i] = -1;
            }
        }
    }

    public final void zza(zzcgx zzcgx) {
        zzbif.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcgx.zzj());
        this.zzn = zzcgx;
    }

    public final void zzb() {
        if (this.zzi && !this.zzj) {
            zzbif.zza(this.zze, this.zzd, "vfr2");
            this.zzj = true;
        }
    }

    public final void zzc() {
        this.zzm = true;
        if (this.zzj && !this.zzk) {
            zzbif.zza(this.zze, this.zzd, "vfp2");
            this.zzk = true;
        }
    }

    public final void zzd() {
        if (((Boolean) zzbkc.zza.zze()).booleanValue() && !this.zzo) {
            Bundle b = C25541a.m63872b("type", "native-player-metrics");
            b.putString("request", this.zzb);
            b.putString("player", this.zzn.zzj());
            for (zzbc zzbc : this.zzf.zza()) {
                b.putString("fps_c_".concat(String.valueOf(zzbc.zza)), Integer.toString(zzbc.zze));
                b.putString("fps_p_".concat(String.valueOf(zzbc.zza)), Double.toString(zzbc.zzd));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.zzg;
                if (i < jArr.length) {
                    String str = this.zzh[i];
                    if (str != null) {
                        b.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str);
                    }
                    i++;
                } else {
                    zzt.zzp();
                    Context context = this.zza;
                    String str2 = this.zzc.zza;
                    zzt.zzp();
                    b.putString(ServerParameters.DEVICE_KEY, zzs.zzq());
                    b.putString("eids", TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, zzbhy.zza()));
                    zzaw.zzb();
                    zzcfb.zzu(context, str2, "gmob-apps", b, true, new zzk(context, str2));
                    this.zzo = true;
                    return;
                }
            }
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcgx zzcgx) {
        long j;
        if (this.zzk && !this.zzl) {
            if (zze.zzc() && !this.zzl) {
                zze.zza("VideoMetricsMixin first frame");
            }
            zzbif.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long nanoTime = zzt.zzA().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.zzb(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (nanoTime - this.zzq)));
        }
        this.zzp = this.zzm;
        this.zzq = nanoTime;
        long longValue = ((Long) zzay.zzc().zzb(zzbhy.zzz)).longValue();
        long zza2 = (long) zzcgx.zza();
        int i = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(zza2 - this.zzg[i])) {
                String[] strArr2 = this.zzh;
                int i2 = 8;
                Bitmap bitmap = zzcgx.getBitmap(8, 8);
                long j2 = 63;
                long j3 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        if (Color.green(pixel) + Color.red(pixel) + Color.blue(pixel) > 128) {
                            j = 1;
                        } else {
                            j = 0;
                        }
                        j3 |= j << ((int) j2);
                        i4++;
                        j2--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j3)});
                return;
            }
            zzcgx zzcgx2 = zzcgx;
            i++;
        }
    }
}
