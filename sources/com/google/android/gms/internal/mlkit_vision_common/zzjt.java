package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C14564a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p177n1.C5804e;
import p177n1.C5808h;
import p627lg.C18204c;
import p627lg.C18212k;

public final class zzjt {
    public static final /* synthetic */ int zza = 0;
    private static zzp zzb;
    private static final zzr zzc = zzr.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzd;
    private final String zze;
    private final zzjs zzf;
    private final C18212k zzg;
    private final Task zzh;
    private final Task zzi;
    private final String zzj;
    private final int zzk;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();

    public zzjt(Context context, C18212k kVar, zzjs zzjs, String str) {
        int i;
        this.zzd = context.getPackageName();
        this.zze = C18204c.m44938a(context);
        this.zzg = kVar;
        this.zzf = zzjs;
        this.zzj = str;
        C14564a a = C14564a.m36403a();
        zzjr zzjr = new zzjr(str);
        a.getClass();
        this.zzh = C14564a.m36404b(zzjr);
        C14564a a2 = C14564a.m36403a();
        kVar.getClass();
        zzjq zzjq = new zzjq(kVar);
        a2.getClass();
        this.zzi = C14564a.m36404b(zzjq);
        zzr zzr = zzc;
        if (zzr.containsKey(str)) {
            i = DynamiteModule.getRemoteVersion(context, (String) zzr.get(str));
        } else {
            i = -1;
        }
        this.zzk = i;
    }

    private static synchronized zzp zzc() {
        synchronized (zzjt.class) {
            zzp zzp = zzb;
            if (zzp != null) {
                return zzp;
            }
            C5808h a = C5804e.m14236a(Resources.getSystem().getConfiguration());
            zzm zzm2 = new zzm();
            for (int i = 0; i < a.f18758a.size(); i++) {
                zzm2.zzb(C18204c.m44939b(a.mo21675a(i)));
            }
            zzp zzc2 = zzm2.zzc();
            zzb = zzc2;
            return zzc2;
        }
    }

    public final /* synthetic */ void zza(zzju zzju, zzgz zzgz, String str) {
        String str2;
        zzju.zzd(zzgz);
        String zza2 = zzju.zza();
        zzil zzil = new zzil();
        zzil.zzb(this.zzd);
        zzil.zzc(this.zze);
        zzil.zzh(zzc());
        zzil.zzg(Boolean.TRUE);
        zzil.zzl(zza2);
        zzil.zzj(str);
        if (this.zzi.isSuccessful()) {
            str2 = (String) this.zzi.getResult();
        } else {
            str2 = this.zzg.mo50630a();
        }
        zzil.zzi(str2);
        zzil.zzd(10);
        zzil.zzk(Integer.valueOf(this.zzk));
        zzju.zze(zzil);
        this.zzf.zza(zzju);
    }

    public final void zzb(zzkd zzkd, zzgz zzgz) {
        zzgn zzgn;
        zzgs zzgs;
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzl.get(zzgz) == null || elapsedRealtime - ((Long) this.zzl.get(zzgz)).longValue() > TimeUnit.SECONDS.toMillis(30)) {
            this.zzl.put(zzgz, Long.valueOf(elapsedRealtime));
            int i = zzkd.zza;
            int i2 = zzkd.zzb;
            int i3 = zzkd.zzc;
            int i4 = zzkd.zzd;
            int i5 = zzkd.zze;
            long j = zzkd.zzf;
            int i6 = zzkd.zzg;
            zzgr zzgr = new zzgr();
            if (i == -1) {
                zzgn = zzgn.BITMAP;
            } else if (i == 35) {
                zzgn = zzgn.YUV_420_888;
            } else if (i == 842094169) {
                zzgn = zzgn.YV12;
            } else if (i == 16) {
                zzgn = zzgn.NV16;
            } else if (i != 17) {
                zzgn = zzgn.UNKNOWN_FORMAT;
            } else {
                zzgn = zzgn.NV21;
            }
            zzgr.zzd(zzgn);
            if (i2 == 1) {
                zzgs = zzgs.BITMAP;
            } else if (i2 == 2) {
                zzgs = zzgs.BYTEARRAY;
            } else if (i2 == 3) {
                zzgs = zzgs.BYTEBUFFER;
            } else if (i2 != 4) {
                zzgs = zzgs.ANDROID_MEDIA_IMAGE;
            } else {
                zzgs = zzgs.FILEPATH;
            }
            zzgr.zzf(zzgs);
            zzgr.zzc(Integer.valueOf(i3));
            zzgr.zze(Integer.valueOf(i4));
            zzgr.zzg(Integer.valueOf(i5));
            zzgr.zzb(Long.valueOf(j));
            zzgr.zzh(Integer.valueOf(i6));
            zzgu zzj2 = zzgr.zzj();
            zzha zzha = new zzha();
            zzha.zzd(zzj2);
            zzju zzc2 = zzju.zzc(zzha);
            if (this.zzh.isSuccessful()) {
                str = (String) this.zzh.getResult();
            } else {
                str = LibraryVersion.getInstance().getVersion(this.zzj);
            }
            C14564a.m36405c().execute(new zzjp(this, zzc2, zzgz, str, (byte[]) null));
        }
    }
}
