package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzesb implements zzetb {
    public final String zza;
    private final zzfvk zzb;
    private final ScheduledExecutorService zzc;
    private final zzekz zzd;
    private final Context zze;
    private final zzfby zzf;
    private final zzekv zzg;
    private final zzdub zzh;

    public zzesb(zzfvk zzfvk, ScheduledExecutorService scheduledExecutorService, String str, zzekz zzekz, Context context, zzfby zzfby, zzekv zzekv, zzdub zzdub) {
        this.zzb = zzfvk;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzekz;
        this.zze = context;
        this.zzf = zzfby;
        this.zzg = zzekv;
        this.zzh = zzdub;
    }

    public static /* synthetic */ zzfvj zzc(zzesb zzesb) {
        String str;
        Bundle bundle;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzii)).booleanValue()) {
            str = zzesb.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzesb.zzf.zzf;
        }
        Map zza2 = zzesb.zzd.zza(zzesb.zza, str);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfrk) zza2).entrySet().iterator();
        while (true) {
            Bundle bundle2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle3 = zzesb.zzf.zzd.zzm;
            if (bundle3 != null) {
                bundle2 = bundle3.getBundle(str2);
            }
            arrayList.add(zzesb.zze(str2, list, bundle2, true, true));
        }
        for (Map.Entry value : ((zzfrk) zzesb.zzd.zzb()).entrySet()) {
            zzeld zzeld = (zzeld) value.getValue();
            String str3 = zzeld.zza;
            Bundle bundle4 = zzesb.zzf.zzd.zzm;
            if (bundle4 != null) {
                bundle = bundle4.getBundle(str3);
            } else {
                bundle = null;
            }
            arrayList.add(zzesb.zze(str3, Collections.singletonList(zzeld.zzd), bundle, zzeld.zzb, zzeld.zzc));
        }
        return zzfva.zzc(arrayList).zza(new zzery(arrayList), zzesb.zzb);
    }

    private final zzfur zze(String str, List list, Bundle bundle, boolean z, boolean z2) {
        zzfur zzv = zzfur.zzv(zzfva.zzl(new zzerz(this, str, list, bundle, z, z2), this.zzb));
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzbs)).booleanValue()) {
            zzv = (zzfur) zzfva.zzo(zzv, ((Long) zzay.zzc().zzb(zzbhy.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfur) zzfva.zzf(zzv, Throwable.class, new zzesa(str), this.zzb);
    }

    public final int zza() {
        return 32;
    }

    public final zzfvj zzb() {
        return zzfva.zzl(new zzerw(this), this.zzb);
    }

    public final /* synthetic */ zzfvj zzd(String str, List list, Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbvs zzbvs;
        zzbvs zzb2;
        zzcga zzcga = new zzcga();
        if (z2) {
            this.zzg.zzb(str);
            zzb2 = this.zzg.zza(str);
        } else {
            try {
                zzb2 = this.zzh.zzb(str);
            } catch (RemoteException e) {
                zzcfi.zzh("Couldn't create RTB adapter : ", e);
                zzbvs = null;
            }
        }
        zzbvs = zzb2;
        if (zzbvs == null) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzbn)).booleanValue()) {
                zzelc.zzb(str, zzcga);
            } else {
                throw null;
            }
        } else {
            zzelc zzelc = new zzelc(str, zzbvs, zzcga);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzbs)).booleanValue()) {
                this.zzc.schedule(new zzerx(zzelc), ((Long) zzay.zzc().zzb(zzbhy.zzbl)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                zzbvs.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzelc);
            } else {
                zzelc.zzd();
            }
        }
        return zzcga;
    }
}
