package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import com.google.android.datatransport.Priority;
import p237r9.C6268a;
import p237r9.C6269b;
import p237r9.C6270c;
import p237r9.C6272e;
import p250s9.C6488a;
import p275u9.C6753t;
import p275u9.C6756w;
import p404ce.C13802o;
import p956ze.C20839b;

public final class zzlt implements zzlk {
    private C20839b zza;
    private final C20839b zzb;
    private final zzle zzc;

    public zzlt(Context context, zzle zzle) {
        this.zzc = zzle;
        C6488a aVar = C6488a.f20232e;
        C6756w.m15897b(context);
        C6753t c = C6756w.m15896a().mo22929c(aVar);
        if (C6488a.f20231d.contains(new C6269b("json"))) {
            this.zza = new C13802o(new zzlr(c));
        }
        this.zzb = new C13802o(new zzls(c));
    }

    public static C6270c zzb(zzle zzle, zzlc zzlc) {
        return new C6268a(zzlc.zze(zzle.zza(), false), Priority.VERY_LOW);
    }

    public final void zza(zzlc zzlc) {
        if (this.zzc.zza() == 0) {
            C20839b bVar = this.zza;
            if (bVar != null) {
                ((C6272e) bVar.get()).mo22259a(zzb(this.zzc, zzlc));
                return;
            }
            return;
        }
        ((C6272e) this.zzb.get()).mo22259a(zzb(this.zzc, zzlc));
    }
}
