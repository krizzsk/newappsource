package com.google.android.play.core.appupdate;

import com.google.android.gms.internal.mlkit_vision_barcode.zzki;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzla;
import com.google.android.gms.internal.mlkit_vision_barcode.zznk;
import com.google.android.gms.internal.mlkit_vision_barcode.zznp;
import java.util.LinkedHashMap;
import p767rg.C19261a;

/* renamed from: com.google.android.play.core.appupdate.h */
public final class C14230h implements zznk {

    /* renamed from: a */
    public final Object f35762a;

    public /* synthetic */ C14230h(Object obj) {
        this.f35762a = obj;
    }

    public final zznp zza() {
        zzki zzki;
        zzkj zzkj = (zzkj) this.f35762a;
        zzkl zzkl = new zzkl();
        if (C19261a.m46517c()) {
            zzki = zzki.TYPE_THICK;
        } else {
            zzki = zzki.TYPE_THIN;
        }
        zzkl.zze(zzki);
        zzla zzla = new zzla();
        zzla.zzb(zzkj);
        zzkl.zzh(zzla.zzc());
        return zznp.zzd(zzkl);
    }

    public C14230h(int i) {
        this.f35762a = new LinkedHashMap((int) ((((float) 3) / 0.75f) + 1.0f));
    }
}
