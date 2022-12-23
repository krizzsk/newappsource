package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C14564a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p177n1.C5804e;
import p177n1.C5808h;
import p627lg.C18204c;
import p627lg.C18212k;

public final class zzko {
    private static zzbl<String> zza;
    private final String zzb;
    private final String zzc;
    private final zzkn zzd;
    private final C18212k zze;
    private final Task<String> zzf;
    private final Task<String> zzg;
    private final String zzh;
    private final Map<zzio, Long> zzi = new HashMap();
    private final Map<zzio, zzbp<Object, Long>> zzj = new HashMap();

    public zzko(Context context, C18212k kVar, zzkn zzkn, String str) {
        this.zzb = context.getPackageName();
        this.zzc = C18204c.m44938a(context);
        this.zze = kVar;
        this.zzd = zzkn;
        this.zzh = str;
        C14564a a = C14564a.m36403a();
        zzki zzki = new zzki(str);
        a.getClass();
        this.zzf = C14564a.m36404b(zzki);
        C14564a a2 = C14564a.m36403a();
        kVar.getClass();
        Callable zza2 = zzkj.zza(kVar);
        a2.getClass();
        this.zzg = C14564a.m36404b(zza2);
    }

    public static long zzc(List<Long> list, double d) {
        return list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0)).longValue();
    }

    private final boolean zzf(zzio zzio, long j, long j2) {
        if (this.zzi.get(zzio) != null && j - this.zzi.get(zzio).longValue() <= TimeUnit.SECONDS.toMillis(30)) {
            return false;
        }
        return true;
    }

    private static synchronized zzbl<String> zzg() {
        synchronized (zzko.class) {
            zzbl<String> zzbl = zza;
            if (zzbl != null) {
                return zzbl;
            }
            C5808h a = C5804e.m14236a(Resources.getSystem().getConfiguration());
            zzbi zzbi = new zzbi();
            for (int i = 0; i < a.f18758a.size(); i++) {
                zzbi.zzb(C18204c.m44939b(a.mo21675a(i)));
            }
            zzbl<String> zzc2 = zzbi.zzc();
            zza = zzc2;
            return zzc2;
        }
    }

    public final void zza(zzkm zzkm, zzio zzio) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzf(zzio, elapsedRealtime, 30)) {
            this.zzi.put(zzio, Long.valueOf(elapsedRealtime));
            zzd(zzkm.zza(), zzio);
        }
    }

    public final <K> void zzb(K k, long j, zzio zzio, zzkl<K> zzkl) {
        if (!this.zzj.containsKey(zzio)) {
            this.zzj.put(zzio, zzar.zzr());
        }
        zzbp zzbp = this.zzj.get(zzio);
        zzbp.zzd(k, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzf(zzio, elapsedRealtime, 30)) {
            this.zzi.put(zzio, Long.valueOf(elapsedRealtime));
            for (Object next : zzbp.zzp()) {
                List<Long> zzb2 = zzbp.zzb(next);
                Collections.sort(zzb2);
                zzht zzht = new zzht();
                long j2 = 0;
                for (Long longValue : zzb2) {
                    j2 += longValue.longValue();
                }
                zzht.zzc(Long.valueOf(j2 / ((long) zzb2.size())));
                zzht.zza(Long.valueOf(zzc(zzb2, 100.0d)));
                zzht.zzf(Long.valueOf(zzc(zzb2, 75.0d)));
                zzht.zze(Long.valueOf(zzc(zzb2, 50.0d)));
                zzht.zzd(Long.valueOf(zzc(zzb2, 25.0d)));
                zzht.zzb(Long.valueOf(zzc(zzb2, 0.0d)));
                zzd(zzkl.zza(next, zzbp.zzb(next).size(), zzht.zzg()), zzio);
            }
            this.zzj.remove(zzio);
        }
    }

    public final void zzd(zzkp zzkp, zzio zzio) {
        C14564a.m36405c().execute(new zzkk(this, zzkp, zzio, (byte[]) null));
    }

    public final /* synthetic */ void zze(zzkp zzkp, zzio zzio) {
        zzkp.zze(zzio);
        String zzb2 = zzkp.zzb();
        zzjx zzjx = new zzjx();
        zzjx.zza(this.zzb);
        zzjx.zzb(this.zzc);
        zzjx.zze(zzg());
        zzjx.zzh(Boolean.TRUE);
        zzjx.zzd(zzb2);
        zzjx.zzc(this.zzf.isSuccessful() ? this.zzf.getResult() : LibraryVersion.getInstance().getVersion(this.zzh));
        zzjx.zzf(this.zzg.isSuccessful() ? this.zzg.getResult() : this.zze.mo50630a());
        zzjx.zzj(10);
        zzkp.zzd(zzjx);
        this.zzd.zza(zzkp);
    }
}
