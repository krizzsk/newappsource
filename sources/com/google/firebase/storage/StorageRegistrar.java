package com.google.firebase.storage;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p382be.C13589b;
import p404ce.C13784b;
import p404ce.C13786c;
import p404ce.C13800m;
import p743qd.C19107d;
import p838uf.C19904f;
import p884wd.C20290a;
import p910xf.C20473b;

@Keep
public class StorageRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static /* synthetic */ C20473b lambda$getComponents$0(C13786c cVar) {
        return new C20473b((C19107d) cVar.mo314b(C19107d.class), cVar.mo40719h(C13589b.class), cVar.mo40719h(C20290a.class));
    }

    public List<C13784b<?>> getComponents() {
        C13784b.C13785a<C20473b> a = C13784b.m34444a(C20473b.class);
        a.mo40715a(new C13800m(1, 0, C19107d.class));
        a.mo40715a(new C13800m(0, 1, C13589b.class));
        a.mo40715a(new C13800m(0, 1, C20290a.class));
        a.f33944e = new C16530d();
        return Arrays.asList(new C13784b[]{a.mo40716b(), C19904f.m47417a("fire-gcs", "20.0.2")});
    }
}
