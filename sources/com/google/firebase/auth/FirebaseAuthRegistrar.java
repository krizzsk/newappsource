package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p382be.C13589b;
import p382be.C13596e0;
import p404ce.C13783a;
import p404ce.C13784b;
import p404ce.C13786c;
import p404ce.C13800m;
import p584jl.C17886b;
import p626lf.C18201b;
import p743qd.C19107d;
import p838uf.C19904f;
import p909xe.C20468e;
import p909xe.C20469f;

@KeepForSdk
@Keep
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(C13786c cVar) {
        return new C13596e0((C19107d) cVar.mo314b(C19107d.class), cVar.mo40719h(C20469f.class));
    }

    @Keep
    public List<C13784b<?>> getComponents() {
        C13784b.C13785a aVar = new C13784b.C13785a(FirebaseAuth.class, new Class[]{C13589b.class});
        aVar.mo40715a(new C13800m(1, 0, C19107d.class));
        aVar.mo40715a(new C13800m(1, 1, C20469f.class));
        aVar.f33944e = C17886b.f45888b;
        aVar.mo40717c(2);
        C18201b bVar = new C18201b();
        C13784b.C13785a<C20468e> a = C13784b.m34444a(C20468e.class);
        a.f33943d = 1;
        a.f33944e = new C13783a(bVar);
        return Arrays.asList(new C13784b[]{aVar.mo40716b(), a.mo40716b(), C19904f.m47417a("fire-auth", "21.0.8")});
    }
}
