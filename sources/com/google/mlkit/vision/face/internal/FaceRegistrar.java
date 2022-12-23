package com.google.mlkit.vision.face.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_face.zzbl;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p404ce.C13784b;
import p404ce.C13800m;
import p627lg.C18205d;
import p627lg.C18208g;
import p845um.C19958a;
import p863vg.C20126c;
import p863vg.C20127d;
import p863vg.C20131h;

@KeepForSdk
public class FaceRegistrar implements ComponentRegistrar {
    @RecentlyNonNull
    public final List<C13784b<?>> getComponents() {
        Class<C20127d> cls = C20127d.class;
        C13784b.C13785a<C20127d> a = C13784b.m34444a(cls);
        a.mo40715a(new C13800m(1, 0, C18208g.class));
        a.f33944e = C19958a.f50751c;
        C13784b<C20127d> b = a.mo40716b();
        C13784b.C13785a<C20126c> a2 = C13784b.m34444a(C20126c.class);
        a2.mo40715a(new C13800m(1, 0, cls));
        a2.mo40715a(new C13800m(1, 0, C18205d.class));
        a2.f33944e = C20131h.f51085b;
        return zzbl.zzh(b, a2.mo40716b());
    }
}
