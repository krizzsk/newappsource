package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p001a0.C0017h;
import p404ce.C13784b;
import p404ce.C13786c;
import p404ce.C13800m;
import p788sd.C19446a;
import p836ud.C19885a;
import p838uf.C19904f;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static /* synthetic */ C19446a lambda$getComponents$0(C13786c cVar) {
        return new C19446a((Context) cVar.mo314b(Context.class), cVar.mo40719h(C19885a.class));
    }

    public List<C13784b<?>> getComponents() {
        C13784b.C13785a<C19446a> a = C13784b.m34444a(C19446a.class);
        a.mo40715a(new C13800m(1, 0, Context.class));
        a.mo40715a(new C13800m(0, 1, C19885a.class));
        a.f33944e = new C0017h();
        return Arrays.asList(new C13784b[]{a.mo40716b(), C19904f.m47417a("fire-abt", "21.0.2")});
    }
}
