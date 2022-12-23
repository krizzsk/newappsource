package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class zzeid implements zzeey {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        zzfbg zzfbg2 = zzfbg;
        String optString = zzfbg2.zzw.optString("pubid", "");
        zzfby zzfby = zzfbs.zza.zza;
        zzfbw zzfbw = new zzfbw();
        zzfbw.zzp(zzfby);
        zzfbw.zzs(optString);
        Bundle zzd = zzd(zzfby.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfbg2.zzw.optString(AdMobAdapter.HOUSE_ADS_PARAMETER, (String) null);
        if (optString2 != null) {
            zzd2.putString(AdMobAdapter.HOUSE_ADS_PARAMETER, optString2);
        }
        String optString3 = zzfbg2.zzw.optString(AdMobAdapter.AD_JSON_PARAMETER, (String) null);
        if (optString3 != null) {
            zzd2.putString(AdMobAdapter.AD_PARAMETER, optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfbg2.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfbg2.zzE.optString(next, (String) null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        zzl zzl = zzfby.zzd;
        zzl zzl2 = r5;
        zzl zzl3 = new zzl(zzl.zza, zzl.zzb, zzd2, zzl.zzd, zzl.zze, zzl.zzf, zzl.zzg, zzl.zzh, zzl.zzi, zzl.zzj, zzl.zzk, zzl.zzl, zzd, zzl.zzn, zzl.zzo, zzl.zzp, zzl.zzq, zzl.zzr, zzl.zzs, zzl.zzt, zzl.zzu, zzl.zzv, zzl.zzw, zzl.zzx);
        zzfbw.zzE(zzl2);
        zzfby zzG = zzfbw.zzG();
        Bundle bundle = new Bundle();
        zzfbs zzfbs2 = zzfbs;
        zzfbj zzfbj = zzfbs2.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzfbj.zza));
        bundle2.putInt("refresh_interval", zzfbj.zzc);
        bundle2.putString("gws_query_id", zzfbj.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        Bundle b = C25541a.m63872b("initial_ad_unit_id", zzfbs2.zza.zza.zzf);
        zzfbg zzfbg3 = zzfbg;
        b.putString("allocation_id", zzfbg3.zzx);
        b.putStringArrayList("click_urls", new ArrayList(zzfbg3.zzc));
        b.putStringArrayList("imp_urls", new ArrayList(zzfbg3.zzd));
        b.putStringArrayList("manual_tracking_urls", new ArrayList(zzfbg3.zzq));
        b.putStringArrayList("fill_urls", new ArrayList(zzfbg3.zzn));
        b.putStringArrayList("video_start_urls", new ArrayList(zzfbg3.zzh));
        b.putStringArrayList("video_reward_urls", new ArrayList(zzfbg3.zzi));
        b.putStringArrayList("video_complete_urls", new ArrayList(zzfbg3.zzj));
        b.putString("transaction_id", zzfbg3.zzk);
        b.putString("valid_from_timestamp", zzfbg3.zzl);
        b.putBoolean("is_closable_area_disabled", zzfbg3.zzQ);
        if (zzfbg3.zzm != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("rb_amount", zzfbg3.zzm.zzb);
            bundle3.putString("rb_type", zzfbg3.zzm.zza);
            b.putParcelableArray("rewards", new Bundle[]{bundle3});
        }
        bundle.putBundle("parent_ad_config", b);
        return zzc(zzG, bundle);
    }

    public final boolean zzb(zzfbs zzfbs, zzfbg zzfbg) {
        return !TextUtils.isEmpty(zzfbg.zzw.optString("pubid", ""));
    }

    public abstract zzfvj zzc(zzfby zzfby, Bundle bundle);
}
