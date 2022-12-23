package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.appboy.models.InAppMessageBase;
import com.appsflyer.ServerParameters;
import com.braze.models.BrazeGeofence;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class zzenj implements zzeta {
    public final zzfby zza;
    private final long zzb;

    public zzenj(zzfby zzfby, long j) {
        Preconditions.checkNotNull(zzfby, "the targeting must not be null");
        this.zza = zzfby;
        this.zzb = j;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Bundle bundle = (Bundle) obj;
        zzl zzl = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzl.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        int i2 = i - 1;
        if (i != 0) {
            boolean z7 = true;
            if (i2 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i2 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzl.zzb));
            if (zzl.zzb != -1) {
                z = true;
            } else {
                z = false;
            }
            zzfcj.zzg(bundle, "cust_age", format, z);
            zzfcj.zzb(bundle, InAppMessageBase.EXTRAS, zzl.zzc);
            Integer valueOf = Integer.valueOf(zzl.zzd);
            if (zzl.zzd != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzfcj.zzf(bundle, "cust_gender", valueOf, z2);
            zzfcj.zzd(bundle, "kw", zzl.zze);
            Integer valueOf2 = Integer.valueOf(zzl.zzg);
            if (zzl.zzg != -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            zzfcj.zzf(bundle, "tag_for_child_directed_treatment", valueOf2, z3);
            if (zzl.zzf) {
                bundle.putBoolean("test_request", true);
            }
            if (zzl.zza < 2 || !zzl.zzh) {
                z4 = false;
            } else {
                z4 = true;
            }
            zzfcj.zzf(bundle, "d_imp_hdr", 1, z4);
            String str = zzl.zzi;
            if (zzl.zza < 2 || TextUtils.isEmpty(str)) {
                z5 = false;
            } else {
                z5 = true;
            }
            zzfcj.zzg(bundle, "ppid", str, z5);
            Location location = zzl.zzk;
            if (location != null) {
                Float valueOf3 = Float.valueOf(location.getAccuracy() * 1000.0f);
                Long valueOf4 = Long.valueOf(location.getTime() * 1000);
                Long valueOf5 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                Long valueOf6 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                Bundle bundle2 = new Bundle();
                bundle2.putFloat(BrazeGeofence.RADIUS_METERS, valueOf3.floatValue());
                bundle2.putLong(ServerParameters.LAT_KEY, valueOf5.longValue());
                bundle2.putLong("long", valueOf6.longValue());
                bundle2.putLong("time", valueOf4.longValue());
                bundle.putBundle("uule", bundle2);
            }
            zzfcj.zzc(bundle, "url", zzl.zzl);
            zzfcj.zzd(bundle, "neighboring_content_urls", zzl.zzv);
            zzfcj.zzb(bundle, "custom_targeting", zzl.zzn);
            zzfcj.zzd(bundle, "category_exclusions", zzl.zzo);
            zzfcj.zzc(bundle, "request_agent", zzl.zzp);
            zzfcj.zzc(bundle, "request_pkg", zzl.zzq);
            Boolean valueOf7 = Boolean.valueOf(zzl.zzr);
            if (zzl.zza >= 7) {
                z6 = true;
            } else {
                z6 = false;
            }
            zzfcj.zze(bundle, "is_designed_for_families", valueOf7, z6);
            if (zzl.zza >= 8) {
                Integer valueOf8 = Integer.valueOf(zzl.zzt);
                if (zzl.zzt == -1) {
                    z7 = false;
                }
                zzfcj.zzf(bundle, "tag_for_under_age_of_consent", valueOf8, z7);
                zzfcj.zzc(bundle, "max_ad_content_rating", zzl.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
