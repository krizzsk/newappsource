package org.simpleframework.xml.core;

import ij0.C23644k0;
import ij0.C23651m1;
import ij0.C23659p;
import ij0.C23669s0;
import ij0.C23673t0;
import ij0.C23676u0;
import ij0.C23680v0;
import ij0.C23683w0;
import java.lang.annotation.Annotation;
import jj0.C23751b;
import jj0.C23753d;
import lj0.C24330g;
import mj0.C24416v;
import org.simpleframework.xml.DefaultType;

/* renamed from: org.simpleframework.xml.core.u */
public final class C24664u implements C23751b {

    /* renamed from: a */
    public final C23669s0 f62441a;

    /* renamed from: b */
    public final C23651m1 f62442b;

    /* renamed from: c */
    public final C24646d f62443c = new C24646d(this, DefaultType.FIELD);

    /* renamed from: d */
    public final C24646d f62444d;

    /* renamed from: e */
    public final C23676u0 f62445e;

    /* renamed from: f */
    public final C24416v f62446f;

    /* renamed from: g */
    public final C23751b f62447g;

    /* renamed from: h */
    public final C24330g f62448h;

    public C24664u(C23753d dVar, C23644k0 k0Var, C24330g gVar) {
        this.f62446f = new C24416v(k0Var);
        this.f62442b = new C23651m1(this);
        this.f62444d = new C24646d(this, (DefaultType) null);
        this.f62445e = new C23676u0(gVar);
        this.f62441a = new C23669s0();
        this.f62447g = dVar;
        this.f62448h = gVar;
    }

    /* renamed from: e */
    public static Class m62100e(Class cls) {
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        return cls;
    }

    /* renamed from: a */
    public final String mo58847a(String str) {
        return this.f62447g.mo58847a(str);
    }

    /* renamed from: b */
    public final ContactList mo61101b(Class cls, DefaultType defaultType) throws Exception {
        if (defaultType != null) {
            return this.f62443c.mo61063b(cls);
        }
        return this.f62444d.mo61063b(cls);
    }

    /* renamed from: c */
    public final C23673t0 mo61102c(C23659p pVar, Annotation annotation) throws Exception {
        C23676u0 u0Var = this.f62445e;
        u0Var.getClass();
        C23680v0 a = u0Var.mo58869a(pVar, annotation, new C23683w0(pVar, annotation));
        if (a == null || a.f59850b <= 0) {
            return null;
        }
        return a.f59849a.get(0);
    }

    /* renamed from: d */
    public final ContactList mo61103d(Class cls, DefaultType defaultType) throws Exception {
        if (defaultType != null) {
            return this.f62443c.mo61064c(cls);
        }
        return this.f62444d.mo61064c(cls);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [org.simpleframework.xml.core.c] */
    /* JADX WARNING: type inference failed for: r2v5, types: [org.simpleframework.xml.core.n] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.simpleframework.xml.core.C24658o mo61104f(java.lang.Class r6) throws java.lang.Exception {
        /*
            r5 = this;
            ij0.m1 r0 = r5.f62442b
            org.simpleframework.xml.util.ConcurrentCache r1 = r0.f59801a
            java.lang.Object r1 = r1.get(r6)
            org.simpleframework.xml.core.o r1 = (org.simpleframework.xml.core.C24658o) r1
            if (r1 != 0) goto L_0x005a
            org.simpleframework.xml.core.u r1 = r0.f59802b
            org.simpleframework.xml.core.d r1 = r1.f62444d
            ij0.u r1 = r1.mo61062a(r6)
            org.simpleframework.xml.core.u r2 = r0.f59802b
            boolean r2 = r2.mo61105g(r6)
            if (r2 == 0) goto L_0x0022
            org.simpleframework.xml.core.n r2 = new org.simpleframework.xml.core.n
            r2.<init>(r1)
            goto L_0x0054
        L_0x0022:
            org.simpleframework.xml.core.l r2 = new org.simpleframework.xml.core.l
            org.simpleframework.xml.core.u r3 = r0.f59802b
            r2.<init>(r1, r3)
            ij0.p1 r3 = r2.f62406c
            boolean r3 = r3.f59824d
            if (r3 == 0) goto L_0x0054
            org.simpleframework.xml.core.u r3 = r0.f59802b
            r3.getClass()
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r6)
            r4 = 1
            if (r3 == 0) goto L_0x003e
            goto L_0x004b
        L_0x003e:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L_0x0047
            goto L_0x004b
        L_0x0047:
            boolean r4 = r6.isArray()
        L_0x004b:
            if (r4 != 0) goto L_0x0054
            org.simpleframework.xml.core.c r2 = new org.simpleframework.xml.core.c
            org.simpleframework.xml.core.u r3 = r0.f59802b
            r2.<init>(r1, r3)
        L_0x0054:
            r1 = r2
            org.simpleframework.xml.util.ConcurrentCache r0 = r0.f59801a
            r0.put(r6, r1)
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.core.C24664u.mo61104f(java.lang.Class):org.simpleframework.xml.core.o");
    }

    /* renamed from: g */
    public final boolean mo61105g(Class cls) throws Exception {
        if (cls == String.class || cls == Float.class || cls == Double.class || cls == Long.class || cls == Integer.class || cls == Boolean.class || cls.isEnum() || cls.isPrimitive() || this.f62446f.mo60539a(cls) != null) {
            return true;
        }
        return false;
    }
}
