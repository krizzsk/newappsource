package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.internal.mlkit_vision_barcode.zzki;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkz;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zznp;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import p674ng.C18548a;
import p674ng.C18549b;
import p722pg.C18922a;
import p767rg.C19261a;
import p767rg.C19267g;
import p791sg.C19459a;

public class BarcodeScannerImpl extends MobileVisionBase<List<C18922a>> implements C18548a {

    /* renamed from: g */
    public static final C18549b f36786g = new C18549b(0);

    public BarcodeScannerImpl(C18549b bVar, C19267g gVar, Executor executor, zznm zznm) {
        super(gVar, executor);
        zzki zzki;
        zzkx zzkx = new zzkx();
        zzkx.zzi(C19261a.m46515a(bVar));
        zzkz zzj = zzkx.zzj();
        zzkl zzkl = new zzkl();
        if (C19261a.m46517c()) {
            zzki = zzki.TYPE_THICK;
        } else {
            zzki = zzki.TYPE_THIN;
        }
        zzkl.zze(zzki);
        zzkl.zzg(zzj);
        zznm.zze(zznp.zze(zzkl, 1), zzkk.ON_DEVICE_BARCODE_CREATE);
    }

    /* renamed from: b */
    public final Task<List<C18922a>> mo43886b(C19459a aVar) {
        return mo43887a(aVar);
    }
}
