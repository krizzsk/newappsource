package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.C14565a;
import java.util.List;
import p404ce.C13784b;
import p404ce.C13800m;
import p815tg.C19678h;

@KeepForSdk
public class VisionCommonRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        C13784b.C13785a<C14565a> a = C13784b.m34444a(C14565a.class);
        a.mo40715a(new C13800m(2, 0, C14565a.C14566a.class));
        a.f33944e = C19678h.f49958b;
        return zzp.zzi(a.mo40716b());
    }
}
