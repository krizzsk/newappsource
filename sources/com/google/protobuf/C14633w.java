package com.google.protobuf;

import com.google.protobuf.C14606i;
import com.google.protobuf.C14616l;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p911xg.C20512t;

/* renamed from: com.google.protobuf.w */
public final class C14633w<T> implements C20512t<T> {

    /* renamed from: a */
    public final C14629t f36896a;

    /* renamed from: b */
    public final C14597c0<?, ?> f36897b;

    /* renamed from: c */
    public final boolean f36898c;

    /* renamed from: d */
    public final C14603g<?> f36899d;

    public C14633w(C14597c0<?, ?> c0Var, C14603g<?> gVar, C14629t tVar) {
        this.f36897b = c0Var;
        this.f36898c = gVar.mo44071d(tVar);
        this.f36899d = gVar;
        this.f36896a = tVar;
    }

    /* renamed from: a */
    public final void mo44129a(T t, T t2) {
        C14597c0<?, ?> c0Var = this.f36897b;
        Class<?> cls = C14636z.f36903a;
        c0Var.mo44042f(t, c0Var.mo44041e(c0Var.mo44037a(t), c0Var.mo44037a(t2)));
        if (this.f36898c) {
            C14636z.m36692A(this.f36899d, t, t2);
        }
    }

    /* renamed from: b */
    public final void mo44130b(T t) {
        this.f36897b.mo44040d(t);
        this.f36899d.mo44072e(t);
    }

    /* renamed from: c */
    public final boolean mo44131c(T t) {
        return this.f36899d.mo44069b(t).mo44081i();
    }

    /* renamed from: d */
    public final int mo44132d(T t) {
        C14597c0<?, ?> c0Var = this.f36897b;
        int c = c0Var.mo44039c(c0Var.mo44037a(t)) + 0;
        if (!this.f36898c) {
            return c;
        }
        C14606i<?> b = this.f36899d.mo44069b(t);
        int i = 0;
        for (int i2 = 0; i2 < b.f36853a.mo43994d(); i2++) {
            i += C14606i.m36602f(b.f36853a.mo43991c(i2));
        }
        for (Map.Entry<T, Object> f : b.f36853a.mo43995e()) {
            i += C14606i.m36602f(f);
        }
        return c + i;
    }

    /* renamed from: e */
    public final void mo44133e(Object obj, C14602f fVar) throws IOException {
        Iterator<Map.Entry<?, Object>> k = this.f36899d.mo44069b(obj).mo44082k();
        while (k.hasNext()) {
            Map.Entry next = k.next();
            C14606i.C14608b bVar = (C14606i.C14608b) next.getKey();
            if (bVar.mo43957B() == WireFormat$JavaType.MESSAGE) {
                bVar.mo43962x();
                bVar.isPacked();
                if (next instanceof C14616l.C14617a) {
                    bVar.getNumber();
                    fVar.mo44061l(0, ((C14616l.C14617a) next).f36863b.getValue().mo44104b());
                } else {
                    bVar.getNumber();
                    fVar.mo44061l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        C14597c0<?, ?> c0Var = this.f36897b;
        c0Var.mo44043g(c0Var.mo44037a(obj), fVar);
    }

    public final boolean equals(T t, T t2) {
        if (!this.f36897b.mo44037a(t).equals(this.f36897b.mo44037a(t2))) {
            return false;
        }
        if (this.f36898c) {
            return this.f36899d.mo44069b(t).equals(this.f36899d.mo44069b(t2));
        }
        return true;
    }

    public final int hashCode(T t) {
        int hashCode = this.f36897b.mo44037a(t).hashCode();
        if (this.f36898c) {
            return (hashCode * 53) + this.f36899d.mo44069b(t).hashCode();
        }
        return hashCode;
    }
}
