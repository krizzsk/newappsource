package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ie0.C23587b;
import java.util.Arrays;
import java.util.List;
import p009a8.C0111k;
import p237r9.C6273f;
import p358af.C13436c;
import p404ce.C13784b;
import p404ce.C13786c;
import p404ce.C13800m;
import p532hf.C17427b;
import p532hf.C17429d;
import p602kf.C18030a;
import p602kf.C18031b;
import p602kf.C18032c;
import p602kf.C18033d;
import p602kf.C18034e;
import p602kf.C18035f;
import p602kf.C18036g;
import p602kf.C18037h;
import p743qd.C19107d;
import p838uf.C19904f;
import p862vf.C20122f;

@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static C17427b providesFirebasePerformance(C13786c cVar) {
        C18030a aVar = new C18030a((C19107d) cVar.mo314b(C19107d.class), (C13436c) cVar.mo314b(C13436c.class), cVar.mo40719h(C20122f.class), cVar.mo40719h(C6273f.class));
        return (C17427b) C23587b.m57773b(new C17429d(new C18032c(aVar), new C18034e(aVar), new C18033d(aVar), new C18037h(aVar), new C18035f(aVar), new C18031b(aVar), new C18036g(aVar))).get();
    }

    @Keep
    public List<C13784b<?>> getComponents() {
        C13784b.C13785a<C17427b> a = C13784b.m34444a(C17427b.class);
        a.mo40715a(new C13800m(1, 0, C19107d.class));
        a.mo40715a(new C13800m(1, 1, C20122f.class));
        a.mo40715a(new C13800m(1, 0, C13436c.class));
        a.mo40715a(new C13800m(1, 1, C6273f.class));
        a.f33944e = new C0111k(1);
        return Arrays.asList(new C13784b[]{a.mo40716b(), C19904f.m47417a("fire-perf", "20.1.1")});
    }
}
