package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.fyber.inneractive.sdk.protobuf.b1 */
public final class C3481b1 {

    /* renamed from: c */
    public static final C3481b1 f12402c = new C3481b1();

    /* renamed from: a */
    public final C3504g1 f12403a = new C3518i0();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C3498f1<?>> f12404b = new ConcurrentHashMap();

    /* renamed from: a */
    public <T> C3498f1<T> mo14786a(Class<T> cls) {
        C3598u0 u0Var;
        C3583t0 t0Var;
        C3598u0 u0Var2;
        Class<?> cls2;
        Class<GeneratedMessageLite> cls3 = GeneratedMessageLite.class;
        Charset charset = C3609z.f12640a;
        if (cls != null) {
            C3498f1<T> f1Var = this.f12404b.get(cls);
            if (f1Var != null) {
                return f1Var;
            }
            C3518i0 i0Var = (C3518i0) this.f12403a;
            i0Var.getClass();
            Class<?> cls4 = C3507h1.f12439a;
            if (cls3.isAssignableFrom(cls) || (cls2 = C3507h1.f12439a) == null || cls2.isAssignableFrom(cls)) {
                C3555o0 b = i0Var.f12453a.mo14951b(cls);
                if (b.mo14818c()) {
                    if (cls3.isAssignableFrom(cls)) {
                        u0Var2 = new C3598u0(C3507h1.f12442d, C3582t.f12551a, b.mo14817b());
                    } else {
                        C3550m1<?, ?> m1Var = C3507h1.f12440b;
                        C3567r<?> rVar = C3582t.f12552b;
                        if (rVar != null) {
                            u0Var2 = new C3598u0(m1Var, rVar, b.mo14817b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    u0Var = u0Var2;
                } else {
                    boolean z = true;
                    if (cls3.isAssignableFrom(cls)) {
                        if (b.mo14816a() != C3478a1.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            t0Var = C3583t0.m9527a(b, C3606x0.f12636b, C3500g0.f12434b, (C3550m1) C3507h1.f12442d, (C3567r) C3582t.f12551a, C3552n0.f12523b);
                        } else {
                            t0Var = C3583t0.m9527a(b, C3606x0.f12636b, C3500g0.f12434b, (C3550m1) C3507h1.f12442d, (C3567r) null, C3552n0.f12523b);
                        }
                    } else {
                        if (b.mo14816a() != C3478a1.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            C3602v0 v0Var = C3606x0.f12635a;
                            C3500g0 g0Var = C3500g0.f12433a;
                            C3550m1<?, ?> m1Var2 = C3507h1.f12440b;
                            C3567r<?> rVar2 = C3582t.f12552b;
                            if (rVar2 != null) {
                                t0Var = C3583t0.m9527a(b, v0Var, g0Var, (C3550m1) m1Var2, (C3567r) rVar2, C3552n0.f12522a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            t0Var = C3583t0.m9527a(b, C3606x0.f12635a, C3500g0.f12433a, (C3550m1) C3507h1.f12441c, (C3567r) null, C3552n0.f12522a);
                        }
                    }
                    u0Var = t0Var;
                }
                C3498f1<T> putIfAbsent = this.f12404b.putIfAbsent(cls, u0Var);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return u0Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
