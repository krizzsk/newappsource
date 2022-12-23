package p767rg;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zznx;
import p627lg.C18206e;
import p627lg.C18208g;
import p674ng.C18549b;

/* renamed from: rg.d */
public final class C19264d extends C18206e {

    /* renamed from: a */
    public final C18208g f48959a;

    public C19264d(C18208g gVar) {
        this.f48959a = gVar;
    }

    public final Object create(Object obj) {
        String str;
        C19268h hVar;
        C18549b bVar = (C18549b) obj;
        Context b = this.f48959a.mo50623b();
        boolean z = true;
        if (true != C19261a.m46517c()) {
            str = "play-services-mlkit-barcode-scanning";
        } else {
            str = "barcode-scanning";
        }
        zznm zzb = zznx.zzb(str);
        zzcc zzcc = C19270j.f48976h;
        if (DynamiteModule.getLocalVersion(b, ModuleDescriptor.MODULE_ID) <= 0) {
            z = false;
        }
        if (z || GoogleApiAvailabilityLight.getInstance().getApkVersion(b) >= 204500000) {
            hVar = new C19270j(b, bVar, zzb);
        } else {
            hVar = new C19272l(b, bVar, zzb);
        }
        return new C19267g(this.f48959a, bVar, hVar, zzb);
    }
}
