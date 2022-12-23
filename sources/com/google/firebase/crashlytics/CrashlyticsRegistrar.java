package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p358af.C13436c;
import p404ce.C13784b;
import p404ce.C13800m;
import p435de.C16593c;
import p435de.C16596f;
import p459ee.C16810a;
import p743qd.C19107d;
import p836ud.C19885a;
import p838uf.C19904f;

public class CrashlyticsRegistrar implements ComponentRegistrar {
    public final List<C13784b<?>> getComponents() {
        C13784b.C13785a<C16596f> a = C13784b.m34444a(C16596f.class);
        a.mo40715a(new C13800m(1, 0, C19107d.class));
        a.mo40715a(new C13800m(1, 0, C13436c.class));
        a.mo40715a(new C13800m(0, 2, C16810a.class));
        a.mo40715a(new C13800m(0, 2, C19885a.class));
        a.f33944e = new C16593c(this);
        a.mo40717c(2);
        return Arrays.asList(new C13784b[]{a.mo40716b(), C19904f.m47417a("fire-cls", "18.2.13")});
    }
}
