package com.google.android.gms.internal.mlkit_vision_barcode;

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

public final class zznu implements zznl {
    private C20839b zza;
    private final C20839b zzb;
    private final zzne zzc;

    public zznu(Context context, zzne zzne) {
        this.zzc = zzne;
        C6488a aVar = C6488a.f20232e;
        C6756w.m15897b(context);
        C6753t c = C6756w.m15896a().mo22929c(aVar);
        if (C6488a.f20231d.contains(new C6269b("json"))) {
            this.zza = new C13802o(new zzns(c));
        }
        this.zzb = new C13802o(new zznt(c));
    }

    public static C6270c zzb(zzne zzne, zznp zznp) {
        int zza2 = zzne.zza();
        if (zznp.zza() != 0) {
            return new C6268a(zznp.zzc(zza2, false), Priority.DEFAULT);
        }
        return new C6268a(zznp.zzc(zza2, false), Priority.VERY_LOW);
    }

    public final void zza(zznp zznp) {
        if (this.zzc.zza() == 0) {
            C20839b bVar = this.zza;
            if (bVar != null) {
                ((C6272e) bVar.get()).mo22259a(zzb(this.zzc, zznp));
                return;
            }
            return;
        }
        ((C6272e) this.zzb.get()).mo22259a(zzb(this.zzc, zznp));
    }
}
