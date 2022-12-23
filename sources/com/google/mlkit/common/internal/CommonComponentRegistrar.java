package com.google.mlkit.common.internal;

import ce0.C21100e;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzam;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import mf0.C24361g;
import p258t4.C6587a;
import p389bl.C13637c;
import p389bl.C13641g;
import p404ce.C13784b;
import p404ce.C13800m;
import p557ig.C17598a;
import p579jg.C17845a;
import p583jk.C17875h;
import p584jl.C17885a;
import p603kg.C18040c;
import p627lg.C18202a;
import p627lg.C18203b;
import p627lg.C18205d;
import p627lg.C18208g;
import p627lg.C18209h;
import p627lg.C18212k;
import p650mg.C18369a;

@KeepForSdk
public class CommonComponentRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<C17845a> cls = C17845a.class;
        Class<C18202a> cls2 = C18202a.class;
        Class<C18040c.C18041a> cls3 = C18040c.C18041a.class;
        Class<C18208g> cls4 = C18208g.class;
        C13784b<?> bVar = C18212k.f46472b;
        C13784b.C13785a<C18369a> a = C13784b.m34444a(C18369a.class);
        a.mo40715a(new C13800m(1, 0, cls4));
        a.f33944e = C17598a.f45273b;
        C13784b<C18369a> b = a.mo40716b();
        C13784b.C13785a<C18209h> a2 = C13784b.m34444a(C18209h.class);
        a2.f33944e = C24361g.f61683l;
        C13784b<C18209h> b2 = a2.mo40716b();
        C13784b.C13785a<C18040c> a3 = C13784b.m34444a(C18040c.class);
        a3.mo40715a(new C13800m(2, 0, cls3));
        a3.f33944e = C6587a.f20407e;
        C13784b<C18040c> b3 = a3.mo40716b();
        C13784b.C13785a<C18205d> a4 = C13784b.m34444a(C18205d.class);
        a4.mo40715a(new C13800m(1, 1, C18209h.class));
        a4.f33944e = C21100e.f52943d;
        C13784b<C18205d> b4 = a4.mo40716b();
        C13784b.C13785a<C18202a> a5 = C13784b.m34444a(cls2);
        a5.f33944e = C13637c.f33636c;
        C13784b<C18202a> b5 = a5.mo40716b();
        C13784b.C13785a<C18203b> a6 = C13784b.m34444a(C18203b.class);
        a6.mo40715a(new C13800m(1, 0, cls2));
        a6.f33944e = C17875h.f45859c;
        C13784b<C18203b> b6 = a6.mo40716b();
        C13784b.C13785a<C17845a> a7 = C13784b.m34444a(cls);
        a7.mo40715a(new C13800m(1, 0, cls4));
        a7.f33944e = C13641g.f33662c;
        C13784b<C17845a> b7 = a7.mo40716b();
        C13784b.C13785a<C18040c.C18041a> a8 = C13784b.m34444a(cls3);
        a8.f33943d = 1;
        a8.mo40715a(new C13800m(1, 1, cls));
        a8.f33944e = C17885a.f45885g;
        return zzam.zzk(bVar, b, b2, b3, b4, b5, b6, b7, a8.mo40716b());
    }
}
