package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p001a0.C0016g;
import p237r9.C6273f;
import p404ce.C13784b;
import p404ce.C13800m;
import p838uf.C19904f;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    public List<C13784b<?>> getComponents() {
        C13784b.C13785a<C6273f> a = C13784b.m34444a(C6273f.class);
        a.mo40715a(new C13800m(1, 0, Context.class));
        a.f33944e = new C0016g();
        return Arrays.asList(new C13784b[]{a.mo40716b(), C19904f.m47417a("fire-transport", "18.1.6")});
    }
}
