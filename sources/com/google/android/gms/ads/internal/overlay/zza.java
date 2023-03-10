package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfi;

public final class zza {
    public static final boolean zza(Context context, Intent intent, zzw zzw, zzu zzu, boolean z) {
        if (z) {
            return zzc(context, intent.getData(), zzw, zzu);
        }
        try {
            String uri = intent.toURI();
            zze.zza("Launching an intent: " + uri);
            zzt.zzp();
            zzs.zzI(context, intent);
            if (zzw != null) {
                zzw.zzg();
            }
            if (zzu != null) {
                zzu.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzcfi.zzj(e.getMessage());
            if (zzu != null) {
                zzu.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzc, zzw zzw, zzu zzu) {
        int i = 0;
        if (zzc == null) {
            zzcfi.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbhy.zzc(context);
        Intent intent = zzc.zzh;
        if (intent != null) {
            return zza(context, intent, zzw, zzu, zzc.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzc.zzb)) {
            zzcfi.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzc.zzc)) {
            intent2.setDataAndType(Uri.parse(zzc.zzb), zzc.zzc);
        } else {
            intent2.setData(Uri.parse(zzc.zzb));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.zzd)) {
            intent2.setPackage(zzc.zzd);
        }
        if (!TextUtils.isEmpty(zzc.zze)) {
            String[] split = zzc.zze.split("/", 2);
            if (split.length < 2) {
                zzcfi.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(zzc.zze)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = zzc.zzf;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzcfi.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdA)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzdz)).booleanValue()) {
                zzt.zzp();
                zzs.zzm(context, intent2);
            }
        }
        return zza(context, intent2, zzw, zzu, zzc.zzj);
    }

    private static final boolean zzc(Context context, Uri uri, zzw zzw, zzu zzu) {
        int i;
        try {
            i = zzt.zzp().zzk(context, uri);
            if (zzw != null) {
                zzw.zzg();
            }
        } catch (ActivityNotFoundException e) {
            zzcfi.zzj(e.getMessage());
            i = 6;
        }
        if (zzu != null) {
            zzu.zzb(i);
        }
        if (i != 5) {
            return false;
        }
        return true;
    }
}
