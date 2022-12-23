package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C14564a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p177n1.C5804e;
import p177n1.C5808h;
import p627lg.C18204c;
import p627lg.C18212k;
import p767rg.C19265e;
import p767rg.C19267g;

public final class zznm {
    public static final /* synthetic */ int zza = 0;
    private static zzcc zzb;
    private static final zzce zzc = zzce.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzd;
    private final String zze;
    private final zznl zzf;
    private final C18212k zzg;
    private final Task zzh;
    private final Task zzi;
    private final String zzj;
    private final int zzk;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();

    public zznm(Context context, C18212k kVar, zznl zznl, String str) {
        int i;
        this.zzd = context.getPackageName();
        this.zze = C18204c.m44938a(context);
        this.zzg = kVar;
        this.zzf = zznl;
        this.zzj = str;
        C14564a a = C14564a.m36403a();
        zznj zznj = new zznj(str);
        a.getClass();
        this.zzh = C14564a.m36404b(zznj);
        C14564a a2 = C14564a.m36403a();
        kVar.getClass();
        zzni zzni = new zzni(kVar);
        a2.getClass();
        this.zzi = C14564a.m36404b(zzni);
        zzce zzce = zzc;
        if (zzce.containsKey(str)) {
            i = DynamiteModule.getRemoteVersion(context, (String) zzce.get(str));
        } else {
            i = -1;
        }
        this.zzk = i;
    }

    public static long zza(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized zzcc zzg() {
        synchronized (zznm.class) {
            zzcc zzcc = zzb;
            if (zzcc != null) {
                return zzcc;
            }
            C5808h a = C5804e.m14236a(Resources.getSystem().getConfiguration());
            zzbz zzbz = new zzbz();
            for (int i = 0; i < a.f18758a.size(); i++) {
                zzbz.zzd(C18204c.m44939b(a.mo21675a(i)));
            }
            zzcc zzf2 = zzbz.zzf();
            zzb = zzf2;
            return zzf2;
        }
    }

    private final String zzh() {
        if (this.zzh.isSuccessful()) {
            return (String) this.zzh.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzj);
    }

    private final boolean zzi(zzkk zzkk, long j, long j2) {
        if (this.zzl.get(zzkk) != null && j - ((Long) this.zzl.get(zzkk)).longValue() <= TimeUnit.SECONDS.toMillis(30)) {
            return false;
        }
        return true;
    }

    public final void zzb(zznk zznk, zzkk zzkk) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzi(zzkk, elapsedRealtime, 30)) {
            this.zzl.put(zzkk, Long.valueOf(elapsedRealtime));
            zzf(zznk.zza(), zzkk, zzh());
        }
    }

    public final /* synthetic */ void zzc(zznp zznp, zzkk zzkk, String str) {
        String str2;
        zznp.zzf(zzkk);
        String zzb2 = zznp.zzb();
        zzmc zzmc = new zzmc();
        zzmc.zzb(this.zzd);
        zzmc.zzc(this.zze);
        zzmc.zzh(zzg());
        zzmc.zzg(Boolean.TRUE);
        zzmc.zzl(zzb2);
        zzmc.zzj(str);
        if (this.zzi.isSuccessful()) {
            str2 = (String) this.zzi.getResult();
        } else {
            str2 = this.zzg.mo50630a();
        }
        zzmc.zzi(str2);
        zzmc.zzd(10);
        zzmc.zzk(Integer.valueOf(this.zzk));
        zznp.zzg(zzmc);
        this.zzf.zza(zznp);
    }

    public final void zzd(zzkk zzkk, Object obj, long j, C19265e eVar) {
        zzki zzki;
        if (!this.zzm.containsKey(zzkk)) {
            this.zzm.put(zzkk, zzbh.zzr());
        }
        zzch zzch = (zzch) this.zzm.get(zzkk);
        zzch.zzo(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzi(zzkk, elapsedRealtime, 30)) {
            this.zzl.put(zzkk, Long.valueOf(elapsedRealtime));
            for (Object next : zzch.zzq()) {
                ArrayList arrayList = new ArrayList(zzch.zzc(next));
                Collections.sort(arrayList);
                zzjq zzjq = new zzjq();
                Iterator it = arrayList.iterator();
                long j2 = 0;
                while (it.hasNext()) {
                    j2 += ((Long) it.next()).longValue();
                }
                zzjq.zza(Long.valueOf(j2 / ((long) arrayList.size())));
                zzjq.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzjq.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzjq.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzjq.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzjq.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zzjs zzg2 = zzjq.zzg();
                int size = arrayList.size();
                C19267g gVar = eVar.f48960a;
                zzdy zzdy = (zzdy) next;
                gVar.getClass();
                zzkl zzkl = new zzkl();
                if (gVar.f48974i) {
                    zzki = zzki.TYPE_THICK;
                } else {
                    zzki = zzki.TYPE_THIN;
                }
                zzkl.zze(zzki);
                zzdv zzdv = new zzdv();
                zzdv.zza(Integer.valueOf(size));
                zzdv.zzc(zzdy);
                zzdv.zzb(zzg2);
                zzkl.zzd(zzdv.zze());
                zzf(zznp.zzd(zzkl), zzkk, zzh());
            }
            this.zzm.remove(zzkk);
        }
    }

    public final void zze(zznp zznp, zzkk zzkk) {
        zzf(zznp, zzkk, zzh());
    }

    public final void zzf(zznp zznp, zzkk zzkk, String str) {
        C14564a.m36405c().execute(new zznh(this, zznp, zzkk, str, (byte[]) null));
    }
}
