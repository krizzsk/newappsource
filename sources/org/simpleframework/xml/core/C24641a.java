package org.simpleframework.xml.core;

import androidx.appcompat.app.C0262r;
import gj0.C23437p;
import ij0.C23613a1;
import ij0.C23637i;
import ij0.C23639i1;
import ij0.C23640j;
import ij0.C23646l;
import ij0.C23662q;
import ij0.C23663q0;
import ij0.C23665r;
import ij0.C23666r0;
import ij0.C23668s;
import ij0.C23673t0;
import ij0.C23687x1;
import java.util.Iterator;
import kj0.C23810e;
import lj0.C24331h;
import lj0.C24334k;
import p069e3.C4544g;
import p912xh.C20527c;

/* renamed from: org.simpleframework.xml.core.a */
public final class C24641a implements C23662q {

    /* renamed from: a */
    public final C23613a1 f62361a;

    /* renamed from: b */
    public final C24655m f62362b;

    /* renamed from: c */
    public final Collector f62363c = new Collector();

    /* renamed from: d */
    public final C20527c f62364d = new C20527c(1);

    /* renamed from: e */
    public final C23639i1 f62365e;

    /* renamed from: f */
    public final C23810e f62366f;

    /* renamed from: org.simpleframework.xml.core.a$a */
    public static class C24642a {

        /* renamed from: a */
        public final C24641a f62367a;

        /* renamed from: b */
        public final C23668s f62368b;

        /* renamed from: c */
        public final C23646l f62369c;

        /* renamed from: d */
        public final C23666r0 f62370d;

        public C24642a(C24641a aVar, Collector collector, C23646l lVar, C23666r0 r0Var) {
            this.f62367a = aVar;
            this.f62368b = collector;
            this.f62369c = lVar;
            this.f62370d = r0Var;
        }

        /* renamed from: a */
        public Object mo61040a(C24331h hVar) throws Exception {
            Object instance = this.f62370d.getInstance();
            C24659p pVar = this.f62369c.f59793b;
            this.f62370d.mo58774b(instance);
            this.f62367a.mo61038h(hVar, instance, this.f62369c);
            C24641a aVar = this.f62367a;
            aVar.getClass();
            C23673t0 text = pVar.getText();
            if (text != null) {
                aVar.mo61035e(hVar, instance, text);
            }
            this.f62367a.mo61033c(hVar, instance, pVar);
            this.f62367a.mo61034d(hVar, instance, pVar);
            ((Collector) this.f62368b).mo60991a(instance);
            return instance;
        }
    }

    /* renamed from: org.simpleframework.xml.core.a$b */
    public class C24643b extends C24642a {
        public C24643b(C24641a aVar, Collector collector, C23646l lVar, C23666r0 r0Var) {
            super(aVar, collector, lVar, r0Var);
        }

        /* renamed from: a */
        public final Object mo61040a(C24331h hVar) throws Exception {
            C23646l lVar = this.f62369c;
            C24659p pVar = lVar.f59793b;
            this.f62367a.mo61038h(hVar, (Object) null, lVar);
            C24641a aVar = this.f62367a;
            aVar.getClass();
            C23673t0 text = pVar.getText();
            if (text != null) {
                aVar.mo61035e(hVar, (Object) null, text);
            }
            this.f62367a.mo61033c(hVar, (Object) null, pVar);
            this.f62367a.mo61034d(hVar, (Object) null, pVar);
            C23640j jVar = this.f62369c.f59792a;
            C23668s sVar = this.f62368b;
            C23665r rVar = jVar.f59781b;
            double d = 0.0d;
            for (C23665r next : jVar.f59780a) {
                double b = next.mo58849b(sVar);
                if (b > d) {
                    rVar = next;
                    d = b;
                }
            }
            if (rVar != null) {
                Object c = rVar.mo58850c(sVar);
                this.f62370d.mo58774b(c);
                ((Collector) this.f62368b).mo60991a(c);
                return c;
            }
            throw new PersistenceException("Constructor not matched for %s", jVar.f59782c);
        }
    }

    public C24641a(C23639i1 i1Var, C4544g gVar) {
        this.f62361a = new C23613a1(i1Var, gVar);
        this.f62362b = new C24655m(i1Var, gVar);
        this.f62365e = i1Var;
        this.f62366f = gVar;
    }

    /* renamed from: a */
    public final Object mo58815a(C24331h hVar, Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        C23639i1 i1Var = this.f62365e;
        C23646l lVar = new C23646l(((C24664u) i1Var.f59777c).mo61104f(cls), i1Var);
        C23637i iVar = lVar.f59794c;
        C24659p pVar = lVar.f59793b;
        mo61038h(hVar, obj, lVar);
        mo61037g(hVar, obj, pVar);
        this.f62363c.mo60991a(obj);
        C23663q0 q0Var = iVar.f59772b;
        if (q0Var != null) {
            q0Var.mo58846a(iVar.f59774d, obj);
        }
        C23663q0 q0Var2 = iVar.f59771a;
        if (q0Var2 != null) {
            q0Var2.mo58846a(iVar.f59774d, obj);
        }
        return mo61036f(hVar, obj, iVar);
    }

    /* renamed from: b */
    public final Object mo58816b(C24331h hVar) throws Exception {
        C24642a aVar;
        C23666r0 e = this.f62361a.mo58750e(hVar);
        Class type = e.getType();
        if (e.mo58773a()) {
            return e.getInstance();
        }
        if (((C24664u) this.f62365e.f59777c).mo61105g(type)) {
            Class type2 = e.getType();
            Object d = this.f62362b.mo61087d(hVar, type2);
            if (type2 != null) {
                e.mo58774b(d);
            }
            return d;
        }
        C23639i1 i1Var = this.f62365e;
        C23646l lVar = new C23646l(((C24664u) i1Var.f59777c).mo61104f(type), i1Var);
        C23637i iVar = lVar.f59794c;
        C23640j jVar = lVar.f59792a;
        boolean z = false;
        if (jVar.f59780a.size() <= 1 && jVar.f59781b != null) {
            z = true;
        }
        if (z) {
            aVar = new C24642a(this, this.f62363c, lVar, e);
        } else {
            aVar = new C24643b(this, this.f62363c, lVar, e);
        }
        Object a = aVar.mo61040a(hVar);
        C23663q0 q0Var = iVar.f59772b;
        if (q0Var != null) {
            q0Var.mo58846a(iVar.f59774d, a);
        }
        C23663q0 q0Var2 = iVar.f59771a;
        if (q0Var2 != null) {
            q0Var2.mo58846a(iVar.f59774d, a);
        }
        e.mo58774b(a);
        return mo61036f(hVar, a, iVar);
    }

    /* renamed from: c */
    public final void mo61033c(C24331h hVar, Object obj, C24659p pVar) throws Exception {
        Class<?> cls;
        C24334k<C24331h> attributes = hVar.getAttributes();
        LabelMap attributes2 = pVar.getAttributes();
        Iterator<String> it = attributes.iterator();
        while (it.hasNext()) {
            C24331h attribute = hVar.getAttribute(it.next());
            if (attribute != null) {
                String attribute2 = pVar.getAttribute(attribute.getName());
                C23673t0 t0Var = (C23673t0) attributes2.remove(attribute2);
                if (t0Var == null) {
                    C0262r position = attribute.getPosition();
                    C23639i1 i1Var = this.f62365e;
                    C23810e eVar = this.f62366f;
                    i1Var.getClass();
                    if (obj != null) {
                        cls = obj.getClass();
                    } else {
                        cls = eVar.getType();
                    }
                    if (attributes2.mo61000p(this.f62365e) && this.f62364d.f51917a) {
                        throw new AttributeException("Attribute '%s' does not have a match in %s at %s", attribute2, cls, position);
                    }
                } else {
                    mo61035e(attribute, obj, t0Var);
                }
            }
        }
        mo61039i(hVar, attributes2, obj);
    }

    /* renamed from: d */
    public final void mo61034d(C24331h hVar, Object obj, C24659p pVar) throws Exception {
        Class<?> cls;
        LabelMap elements = pVar.getElements();
        C24331h b = hVar.mo60485b();
        while (b != null) {
            C24659p l = pVar.mo61084l(b.getName());
            if (l != null) {
                mo61037g(b, obj, l);
            } else {
                String t1 = pVar.mo61085t1(b.getName());
                C23673t0 t0Var = (C23673t0) elements.remove(t1);
                if (t0Var == null) {
                    t0Var = (C23687x1) this.f62363c.f62343c.get(t1);
                }
                if (t0Var == null) {
                    C0262r position = b.getPosition();
                    C23639i1 i1Var = this.f62365e;
                    C23810e eVar = this.f62366f;
                    i1Var.getClass();
                    if (obj != null) {
                        cls = obj.getClass();
                    } else {
                        cls = eVar.getType();
                    }
                    if (!elements.mo61000p(this.f62365e) || !this.f62364d.f51917a) {
                        b.mo60486c();
                    } else {
                        throw new ElementException("Element '%s' does not have a match in %s at %s", t1, cls, position);
                    }
                } else {
                    Object e = mo61035e(b, obj, t0Var);
                    for (String remove : t0Var.mo58759H()) {
                        C23673t0 t0Var2 = (C23673t0) elements.remove(remove);
                    }
                    if (t0Var.mo58769w()) {
                        this.f62363c.mo60992b(t0Var, e);
                    }
                }
            }
            b = hVar.mo60485b();
        }
        mo61039i(hVar, elements, obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61035e(lj0.C24331h r4, java.lang.Object r5, ij0.C23673t0 r6) throws java.lang.Exception {
        /*
            r3 = this;
            ij0.i1 r0 = r3.f62365e
            ij0.q r0 = r6.mo58754B(r0)
            boolean r1 = r6.mo58758G()
            if (r1 == 0) goto L_0x0037
            org.simpleframework.xml.core.Collector r1 = r3.f62363c
            r1.getClass()
            java.lang.Object r2 = r6.getKey()
            org.simpleframework.xml.core.Collector$Registry r1 = r1.f62342b
            java.lang.Object r1 = r1.get(r2)
            ij0.x1 r1 = (ij0.C23687x1) r1
            ij0.p r2 = r6.mo58755C()
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r1.f59863a
            java.lang.Object r0 = r0.mo58815a(r4, r1)
            goto L_0x003b
        L_0x002a:
            if (r5 == 0) goto L_0x0037
            java.lang.Object r1 = r2.get(r5)
            if (r1 == 0) goto L_0x0037
            java.lang.Object r0 = r0.mo58815a(r4, r1)
            goto L_0x003b
        L_0x0037:
            java.lang.Object r0 = r0.mo58816b(r4)
        L_0x003b:
            if (r0 != 0) goto L_0x0074
            androidx.appcompat.app.r r4 = r4.getPosition()
            ij0.i1 r1 = r3.f62365e
            kj0.e r2 = r3.f62366f
            r1.getClass()
            if (r5 == 0) goto L_0x004f
            java.lang.Class r5 = r5.getClass()
            goto L_0x0053
        L_0x004f:
            java.lang.Class r5 = r2.getType()
        L_0x0053:
            boolean r1 = r6.mo58762c()
            if (r1 == 0) goto L_0x0081
            xh.c r1 = r3.f62364d
            boolean r1 = r1.f51917a
            if (r1 != 0) goto L_0x0060
            goto L_0x0081
        L_0x0060:
            org.simpleframework.xml.core.ValueRequiredException r0 = new org.simpleframework.xml.core.ValueRequiredException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            r1[r6] = r5
            r5 = 2
            r1[r5] = r4
            java.lang.String r4 = "Empty value for %s in %s at %s"
            r0.<init>(r4, r1)
            throw r0
        L_0x0074:
            ij0.i1 r4 = r3.f62365e
            java.lang.Object r4 = r6.mo58753A(r4)
            if (r0 == r4) goto L_0x0081
            org.simpleframework.xml.core.Collector r4 = r3.f62363c
            r4.mo60992b(r6, r0)
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.core.C24641a.mo61035e(lj0.h, java.lang.Object, ij0.t0):java.lang.Object");
    }

    /* renamed from: f */
    public final Object mo61036f(C24331h hVar, Object obj, C23637i iVar) throws Exception {
        if (obj == null) {
            return obj;
        }
        C0262r position = hVar.getPosition();
        C23663q0 q0Var = iVar.f59773c;
        if (q0Var != null) {
            obj = q0Var.mo58846a(iVar.f59774d, obj);
        }
        Class type = this.f62366f.getType();
        Class<?> cls = obj.getClass();
        if (type.isAssignableFrom(cls)) {
            return obj;
        }
        throw new ElementException("Type %s does not match %s at %s", cls, type, position);
    }

    /* renamed from: g */
    public final void mo61037g(C24331h hVar, Object obj, C24659p pVar) throws Exception {
        C23673t0 text = pVar.getText();
        if (text != null) {
            mo61035e(hVar, obj, text);
        }
        mo61033c(hVar, obj, pVar);
        mo61034d(hVar, obj, pVar);
    }

    /* renamed from: h */
    public final void mo61038h(C24331h hVar, Object obj, C23646l lVar) throws Exception {
        C23673t0 t0Var = lVar.f59795d;
        Class type = this.f62366f.getType();
        if (t0Var != null) {
            C24331h remove = hVar.getAttributes().remove(t0Var.getName());
            if (remove != null) {
                Object e = mo61035e(remove, obj, t0Var);
                Class type2 = this.f62366f.getType();
                if (e != null) {
                    Double valueOf = Double.valueOf(((C24664u) this.f62365e.f59777c).mo61104f(type2).mo61045e().revision());
                    if (!e.equals(this.f62364d)) {
                        C20527c cVar = this.f62364d;
                        cVar.getClass();
                        cVar.f51917a = e.equals(valueOf);
                        return;
                    }
                    return;
                }
                return;
            }
            C23437p e2 = ((C24664u) this.f62365e.f59777c).mo61104f(type).mo61045e();
            this.f62364d.getClass();
            Double valueOf2 = Double.valueOf(1.0d);
            Double valueOf3 = Double.valueOf(e2.revision());
            this.f62363c.mo60992b(t0Var, valueOf2);
            C20527c cVar2 = this.f62364d;
            cVar2.getClass();
            if (valueOf2 != null) {
                cVar2.f51917a = valueOf2.equals(valueOf3);
            } else if (valueOf3 != null) {
                cVar2.f51917a = valueOf3.equals(Double.valueOf(1.0d));
            }
        }
    }

    /* renamed from: i */
    public final void mo61039i(C24331h hVar, LabelMap labelMap, Object obj) throws Exception {
        Class<?> cls;
        C23639i1 i1Var = this.f62365e;
        C23810e eVar = this.f62366f;
        i1Var.getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = eVar.getType();
        }
        C0262r position = hVar.getPosition();
        Iterator<C23673t0> it = labelMap.iterator();
        while (it.hasNext()) {
            C23673t0 next = it.next();
            if (!next.mo58762c() || !this.f62364d.f51917a) {
                Object A = next.mo58753A(this.f62365e);
                if (A != null) {
                    this.f62363c.mo60992b(next, A);
                }
            } else {
                throw new ValueRequiredException("Unable to satisfy %s for %s at %s", next, cls, position);
            }
        }
    }
}
