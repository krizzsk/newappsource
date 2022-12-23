package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;

public final class zzejy implements zzeey {
    private final zzefa zza;
    private final zzefg zzb;
    private final zzfge zzc;
    private final zzfvk zzd;

    public zzejy(zzfge zzfge, zzfvk zzfvk, zzefa zzefa, zzefg zzefg) {
        this.zzc = zzfge;
        this.zzd = zzfvk;
        this.zzb = zzefg;
        this.zza = zzefa;
    }

    @VisibleForTesting
    public static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        zzefb zzefb;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator it = zzfbg.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzefb = null;
                break;
            }
            try {
                zzefb = this.zza.zza((String) it.next(), zzfbg.zzw);
                break;
            } catch (zzfcd unused) {
            }
        }
        if (zzefb == null) {
            return zzfva.zzh(new zzeia("Unable to instantiate mediation adapter class."));
        }
        zzcga zzcga = new zzcga();
        zzefb.zzc.zza(new zzejx(this, zzefb, zzcga));
        if (zzfbg.zzN) {
            Bundle bundle = zzfbs.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfge zzfge = this.zzc;
        return zzffo.zzd(new zzejv(this, zzfbs, zzfbg, zzefb), this.zzd, zzffy.ADAPTER_LOAD_AD_SYN, zzfge).zzb(zzffy.ADAPTER_LOAD_AD_ACK).zzd(zzcga).zzb(zzffy.ADAPTER_WRAP_ADAPTER).zze(new zzejw(this, zzfbs, zzfbg, zzefb)).zza();
    }

    public final boolean zzb(zzfbs zzfbs, zzfbg zzfbg) {
        return !zzfbg.zzu.isEmpty();
    }

    public final /* synthetic */ Object zzc(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb, Void voidR) throws Exception {
        return this.zzb.zza(zzfbs, zzfbg, zzefb);
    }

    public final /* synthetic */ void zzd(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws Exception {
        this.zzb.zzb(zzfbs, zzfbg, zzefb);
    }
}
