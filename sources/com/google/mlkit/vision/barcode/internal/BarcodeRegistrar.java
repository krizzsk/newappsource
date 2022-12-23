package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p404ce.C13784b;
import p404ce.C13800m;
import p406cg.C13815e;
import p627lg.C18205d;
import p627lg.C18208g;
import p767rg.C19262b;
import p767rg.C19263c;
import p767rg.C19264d;

@KeepForSdk
public class BarcodeRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<C19264d> cls = C19264d.class;
        C13784b.C13785a<C19264d> a = C13784b.m34444a(cls);
        a.mo40715a(new C13800m(1, 0, C18208g.class));
        a.f33944e = C13815e.f34002b;
        C13784b<C19264d> b = a.mo40716b();
        C13784b.C13785a<C19263c> a2 = C13784b.m34444a(C19263c.class);
        a2.mo40715a(new C13800m(1, 0, cls));
        a2.mo40715a(new C13800m(1, 0, C18205d.class));
        a2.f33944e = C19262b.f48956b;
        return zzcc.zzi(b, a2.mo40716b());
    }
}
