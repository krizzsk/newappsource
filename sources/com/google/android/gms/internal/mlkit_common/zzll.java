package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C14564a;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.util.HashMap;
import java.util.Map;
import p177n1.C5804e;
import p177n1.C5808h;
import p603kg.C18039b;
import p627lg.C18204c;
import p627lg.C18212k;

public final class zzll {
    public static final /* synthetic */ int zza = 0;
    private static zzam zzb;
    private static final zzao zzc = zzao.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzd;
    private final String zze;
    private final zzlk zzf;
    private final C18212k zzg;
    private final Task zzh;
    private final Task zzi;
    private final String zzj;
    private final int zzk;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();

    public zzll(Context context, C18212k kVar, zzlk zzlk, String str) {
        int i;
        this.zzd = context.getPackageName();
        this.zze = C18204c.m44938a(context);
        this.zzg = kVar;
        this.zzf = zzlk;
        this.zzj = str;
        C14564a a = C14564a.m36403a();
        zzlj zzlj = new zzlj(str);
        a.getClass();
        this.zzh = C14564a.m36404b(zzlj);
        C14564a a2 = C14564a.m36403a();
        kVar.getClass();
        zzli zzli = new zzli(kVar);
        a2.getClass();
        this.zzi = C14564a.m36404b(zzli);
        zzao zzao = zzc;
        if (zzao.containsKey(str)) {
            i = DynamiteModule.getRemoteVersion(context, (String) zzao.get(str));
        } else {
            i = -1;
        }
        this.zzk = i;
    }

    private static synchronized zzam zzg() {
        synchronized (zzll.class) {
            zzam zzam = zzb;
            if (zzam != null) {
                return zzam;
            }
            C5808h a = C5804e.m14236a(Resources.getSystem().getConfiguration());
            zzaj zzaj = new zzaj();
            for (int i = 0; i < a.f18758a.size(); i++) {
                zzaj.zzb(C18204c.m44939b(a.mo21675a(i)));
            }
            zzam zzc2 = zzaj.zzc();
            zzb = zzc2;
            return zzc2;
        }
    }

    private final zzjz zzh(String str, String str2) {
        String str3;
        zzjz zzjz = new zzjz();
        zzjz.zzb(this.zzd);
        zzjz.zzc(this.zze);
        zzjz.zzh(zzg());
        zzjz.zzg(Boolean.TRUE);
        zzjz.zzl(str);
        zzjz.zzj(str2);
        if (this.zzi.isSuccessful()) {
            str3 = (String) this.zzi.getResult();
        } else {
            str3 = this.zzg.mo50630a();
        }
        zzjz.zzi(str3);
        zzjz.zzd(10);
        zzjz.zzk(Integer.valueOf(this.zzk));
        return zzjz;
    }

    private final String zzi() {
        if (this.zzh.isSuccessful()) {
            return (String) this.zzh.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzj);
    }

    public final /* synthetic */ void zza(zzlc zzlc, zzie zzie, String str) {
        zzlc.zza(zzie);
        zzlc.zzc(zzh(zzlc.zzd(), str));
        this.zzf.zza(zzlc);
    }

    public final /* synthetic */ void zzb(zzlc zzlc, zzln zzln, C18039b bVar) {
        zzlc.zza(zzie.MODEL_DOWNLOAD);
        zzlc.zzc(zzh(zzln.zze(), zzi()));
        zzlc.zzb(zzlx.zza(bVar, this.zzg, zzln));
        this.zzf.zza(zzlc);
    }

    public final void zzc(zzlc zzlc, zzie zzie) {
        C14564a.m36405c().execute(new zzlg(this, zzlc, zzie, zzi()));
    }

    public final void zzd(zzlc zzlc, C18039b bVar, boolean z, int i) {
        zzlm zzh2 = zzln.zzh();
        zzh2.zzf(false);
        bVar.getClass();
        zzh2.zzd((ModelType) null);
        zzh2.zza(zzij.FAILED);
        zzh2.zzb(zzid.DOWNLOAD_FAILED);
        zzh2.zzc(i);
        zzf(zzlc, bVar, zzh2.zzh());
    }

    public final void zze(zzlc zzlc, C18039b bVar, zzid zzid, boolean z, ModelType modelType, zzij zzij) {
        zzlm zzh2 = zzln.zzh();
        zzh2.zzf(z);
        zzh2.zzd(modelType);
        zzh2.zzb(zzid);
        zzh2.zza(zzij);
        zzf(zzlc, bVar, zzh2.zzh());
    }

    public final void zzf(zzlc zzlc, C18039b bVar, zzln zzln) {
        C14564a.m36405c().execute(new zzlh(this, zzlc, zzln, bVar));
    }
}
