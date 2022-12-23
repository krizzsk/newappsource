package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p358af.C13436c;
import p358af.C13437d;
import p404ce.C13783a;
import p404ce.C13784b;
import p404ce.C13786c;
import p404ce.C13800m;
import p626lf.C18201b;
import p743qd.C19107d;
import p838uf.C19904f;
import p909xe.C20468e;
import p909xe.C20469f;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static /* synthetic */ C13436c lambda$getComponents$0(C13786c cVar) {
        return new C14459a((C19107d) cVar.mo314b(C19107d.class), cVar.mo40719h(C20469f.class));
    }

    public List<C13784b<?>> getComponents() {
        C13784b.C13785a<C13436c> a = C13784b.m34444a(C13436c.class);
        a.mo40715a(new C13800m(1, 0, C19107d.class));
        a.mo40715a(new C13800m(0, 1, C20469f.class));
        a.f33944e = new C13437d();
        C18201b bVar = new C18201b();
        C13784b.C13785a<C20468e> a2 = C13784b.m34444a(C20468e.class);
        a2.f33943d = 1;
        a2.f33944e = new C13783a(bVar);
        return Arrays.asList(new C13784b[]{a.mo40716b(), a2.mo40716b(), C19904f.m47417a("fire-installations", "17.0.3")});
    }
}
