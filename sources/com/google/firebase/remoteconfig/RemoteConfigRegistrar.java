package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p358af.C13436c;
import p404ce.C13784b;
import p404ce.C13786c;
import p404ce.C13800m;
import p743qd.C19107d;
import p764rd.C19254b;
import p788sd.C19446a;
import p836ud.C19885a;
import p838uf.C19904f;
import p862vf.C20122f;
import p862vf.C20123g;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static C20122f lambda$getComponents$0(C13786c cVar) {
        C19254b bVar;
        Context context = (Context) cVar.mo314b(Context.class);
        C19107d dVar = (C19107d) cVar.mo314b(C19107d.class);
        C13436c cVar2 = (C13436c) cVar.mo314b(C13436c.class);
        C19446a aVar = (C19446a) cVar.mo314b(C19446a.class);
        synchronized (aVar) {
            if (!aVar.f49466a.containsKey("frc")) {
                aVar.f49466a.put("frc", new C19254b(aVar.f49467b));
            }
            bVar = (C19254b) aVar.f49466a.get("frc");
        }
        return new C20122f(context, dVar, cVar2, bVar, cVar.mo40719h(C19885a.class));
    }

    public List<C13784b<?>> getComponents() {
        C13784b.C13785a<C20122f> a = C13784b.m34444a(C20122f.class);
        a.mo40715a(new C13800m(1, 0, Context.class));
        a.mo40715a(new C13800m(1, 0, C19107d.class));
        a.mo40715a(new C13800m(1, 0, C13436c.class));
        a.mo40715a(new C13800m(1, 0, C19446a.class));
        a.mo40715a(new C13800m(0, 1, C19885a.class));
        a.f33944e = new C20123g();
        a.mo40717c(2);
        return Arrays.asList(new C13784b[]{a.mo40716b(), C19904f.m47417a("fire-rc", "21.1.2")});
    }
}
