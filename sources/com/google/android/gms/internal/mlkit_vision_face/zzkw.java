package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import com.google.android.datatransport.Priority;
import p237r9.C6268a;
import p237r9.C6270c;
import p237r9.C6272e;
import p250s9.C6488a;
import p275u9.C6753t;
import p275u9.C6756w;
import p404ce.C13802o;
import p956ze.C20839b;

public final class zzkw implements zzkn {
    private final C20839b<C6272e<byte[]>> zza;
    private final C20839b<C6272e<byte[]>> zzb;
    private final zzkg zzc;

    public zzkw(Context context, zzkg zzkg) {
        this.zzc = zzkg;
        C6756w.m15897b(context);
        C6753t c = C6756w.m15896a().mo22929c(C6488a.f20232e);
        this.zza = new C13802o(new zzkr(c));
        this.zzb = new C13802o(new zzks(c));
    }

    public static C6270c<byte[]> zzb(zzkg zzkg, zzkp zzkp) {
        int zze = zzkg.zze();
        int i = zzkv.zza[zzkg.zzd().ordinal()];
        if (i == 1) {
            return new C6268a(zzkp.zza(zze, false), Priority.HIGHEST);
        }
        if (i != 2) {
            return new C6268a(zzkp.zza(zze, false), Priority.DEFAULT);
        }
        return new C6268a(zzkp.zza(zze, false), Priority.VERY_LOW);
    }

    public final void zza(zzkp zzkp) {
        if (this.zzc.zze() == 0) {
            this.zza.get().mo22259a(zzb(this.zzc, zzkp));
        } else {
            this.zzb.get().mo22259a(zzb(this.zzc, zzkp));
        }
    }
}
