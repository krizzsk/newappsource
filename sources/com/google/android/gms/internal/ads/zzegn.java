package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzw;
import java.util.concurrent.Executor;
import p067e1.C4494j;

public final class zzegn implements zzeey {
    private final Context zza;
    private final zzdkx zzb;
    private final Executor zzc;
    private final zzfbf zzd;

    public zzegn(Context context, Executor executor, zzdkx zzdkx, zzfbf zzfbf) {
        this.zza = context;
        this.zzb = zzdkx;
        this.zzc = executor;
        this.zzd = zzfbf;
    }

    private static String zzd(zzfbg zzfbg) {
        try {
            return zzfbg.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        Uri uri;
        String zzd2 = zzd(zzfbg);
        if (zzd2 != null) {
            uri = Uri.parse(zzd2);
        } else {
            uri = null;
        }
        return zzfva.zzn(zzfva.zzi((Object) null), new zzegl(this, uri, zzfbs, zzfbg), this.zzc);
    }

    public final boolean zzb(zzfbs zzfbs, zzfbg zzfbg) {
        Context context = this.zza;
        if (!(context instanceof Activity) || !zzbiw.zzg(context) || TextUtils.isEmpty(zzd(zzfbg))) {
            return false;
        }
        return true;
    }

    public final zzfvj zzc(Uri uri, zzfbs zzfbs, zzfbg zzfbg, Object obj) throws Exception {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                C4494j.m11720b(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.putExtras(new Bundle());
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            intent.setData(uri);
            zzc zzc2 = new zzc(intent, (zzu) null);
            zzcga zzcga = new zzcga();
            zzdjz zze = this.zzb.zze(new zzcyl(zzfbs, zzfbg, (String) null), new zzdkc(new zzegm(zzcga), (zzcli) null));
            zzcga.zzd(new AdOverlayInfoParcel(zzc2, (zza) null, zze.zza(), (zzw) null, new zzcfo(0, 0, false, false, false), (zzcli) null, (zzdjf) null));
            this.zzd.zza();
            return zzfva.zzi(zze.zzg());
        } catch (Throwable th) {
            zzcfi.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
