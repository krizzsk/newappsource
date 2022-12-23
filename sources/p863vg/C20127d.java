package p863vg;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzkz;
import p627lg.C18206e;
import p627lg.C18208g;
import p839ug.C19910d;

/* renamed from: vg.d */
public final class C20127d extends C18206e<C19910d, C20129f> {

    /* renamed from: a */
    public final C18208g f51070a;

    public C20127d(C18208g gVar) {
        this.f51070a = gVar;
    }

    public final Object create(Object obj) {
        boolean z;
        C20125b bVar;
        C19910d dVar = (C19910d) obj;
        Context b = this.f51070a.mo50623b();
        if (DynamiteModule.getLocalVersion(b, "com.google.android.gms.vision.dynamite.face") > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || GoogleApiAvailabilityLight.getInstance().getApkVersion(b) >= 204490000) {
            bVar = new C20124a(b, dVar);
        } else {
            bVar = new C20132i(b, dVar);
        }
        return new C20129f(zzkz.zza(C20130g.m47725b()), dVar, bVar);
    }
}
