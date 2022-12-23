package org.simpleframework.xml.core;

import gj0.C23422a;
import gj0.C23424c;
import gj0.C23425d;
import gj0.C23426e;
import gj0.C23427f;
import gj0.C23428g;
import gj0.C23429h;
import gj0.C23430i;
import gj0.C23435n;
import gj0.C23437p;
import ij0.C23640j;
import ij0.C23647l0;
import ij0.C23650m0;
import ij0.C23659p;
import ij0.C23673t0;
import ij0.C23675u;
import ij0.C23676u0;
import ij0.C23680v0;
import ij0.C23683w0;
import ij0.C23693z0;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

/* renamed from: org.simpleframework.xml.core.t */
public final class C24663t {

    /* renamed from: a */
    public C24648f f62429a;

    /* renamed from: b */
    public C23650m0 f62430b;

    /* renamed from: c */
    public C23693z0 f62431c;

    /* renamed from: d */
    public C23640j f62432d;

    /* renamed from: e */
    public LabelMap f62433e;

    /* renamed from: f */
    public LabelMap f62434f;

    /* renamed from: g */
    public LabelMap f62435g;

    /* renamed from: h */
    public C24658o f62436h;

    /* renamed from: i */
    public C24664u f62437i;

    /* renamed from: j */
    public C23673t0 f62438j;

    /* renamed from: k */
    public TreeModel f62439k;

    /* renamed from: l */
    public boolean f62440l;

    public C24663t(C24658o oVar, C23675u uVar, C24664u uVar2) throws Exception {
        C23650m0 m0Var = new C23650m0(uVar, uVar2);
        this.f62430b = m0Var;
        this.f62431c = new C23693z0(m0Var, uVar, uVar2);
        this.f62429a = new C24648f(oVar, uVar);
        this.f62439k = new TreeModel(oVar, uVar, (String) null, 1);
        this.f62433e = new LabelMap(oVar);
        this.f62434f = new LabelMap(oVar);
        this.f62435g = new LabelMap(oVar);
        this.f62436h = oVar;
        this.f62437i = uVar2;
    }

    /* renamed from: a */
    public final void mo61096a(C23659p pVar, Annotation annotation) throws Exception {
        if (annotation instanceof C23422a) {
            mo61097b(pVar, annotation, this.f62433e);
        }
        if (annotation instanceof C23430i) {
            mo61100e(pVar, annotation, this.f62434f);
        }
        if (annotation instanceof C23427f) {
            mo61100e(pVar, annotation, this.f62434f);
        }
        if (annotation instanceof C23429h) {
            mo61100e(pVar, annotation, this.f62434f);
        }
        if (annotation instanceof C23426e) {
            mo61097b(pVar, annotation, this.f62434f);
        }
        if (annotation instanceof C23425d) {
            mo61097b(pVar, annotation, this.f62434f);
        }
        if (annotation instanceof C23428g) {
            mo61097b(pVar, annotation, this.f62434f);
        }
        if (annotation instanceof C23424c) {
            mo61097b(pVar, annotation, this.f62434f);
        }
        if (annotation instanceof C23437p) {
            C23673t0 c = this.f62437i.mo61102c(pVar, annotation);
            if (this.f62438j == null) {
                this.f62438j = c;
            } else {
                throw new AttributeException("Multiple version annotations in %s", annotation);
            }
        }
        if (annotation instanceof C23435n) {
            C23673t0 c2 = this.f62437i.mo61102c(pVar, annotation);
            C23647l0 r = c2.mo58767r();
            String q = c2.mo58766q();
            C24652j jVar = this.f62439k;
            if (!r.isEmpty()) {
                jVar = mo61099d(r);
            }
            if (this.f62435g.get(q) == null) {
                this.f62429a.mo61075a(c2);
                jVar.mo61018g(c2);
                this.f62435g.put(q, c2);
                return;
            }
            throw new TextException("Multiple text annotations in %s", annotation);
        }
    }

    /* renamed from: b */
    public final void mo61097b(C23659p pVar, Annotation annotation, LabelMap labelMap) throws Exception {
        C23673t0 c = this.f62437i.mo61102c(pVar, annotation);
        String q = c.mo58766q();
        String name = c.getName();
        if (labelMap.get(q) == null) {
            mo61098c(c, labelMap);
        } else {
            throw new PersistenceException("Duplicate annotation of name '%s' on %s", name, pVar);
        }
    }

    /* renamed from: c */
    public final void mo61098c(C23673t0 t0Var, LabelMap labelMap) throws Exception {
        C23647l0 r = t0Var.mo58767r();
        String q = t0Var.mo58766q();
        C24652j jVar = this.f62439k;
        if (!r.isEmpty()) {
            jVar = mo61099d(r);
        }
        this.f62429a.mo61075a(t0Var);
        jVar.mo61018g(t0Var);
        labelMap.put(q, t0Var);
    }

    /* renamed from: d */
    public final C24652j mo61099d(C23647l0 l0Var) throws Exception {
        C24652j g1 = this.f62439k.mo61019g1(l0Var);
        if (g1 != null) {
            return g1;
        }
        C24652j jVar = this.f62439k;
        while (jVar != null) {
            String prefix = l0Var.getPrefix();
            String first = l0Var.getFirst();
            int index = l0Var.getIndex();
            if (first != null) {
                jVar = jVar.mo61017f(index, first, prefix);
            }
            if (!l0Var.mo58785A0()) {
                break;
            }
            l0Var = l0Var.mo58797q();
        }
        return jVar;
    }

    /* renamed from: e */
    public final void mo61100e(C23659p pVar, Annotation annotation, LabelMap labelMap) throws Exception {
        List<C23673t0> list;
        C23676u0 u0Var = this.f62437i.f62445e;
        u0Var.getClass();
        C23680v0 a = u0Var.mo58869a(pVar, annotation, new C23683w0(pVar, annotation));
        if (a != null) {
            list = a.f59849a;
        } else {
            list = Collections.emptyList();
        }
        for (C23673t0 next : list) {
            String q = next.mo58766q();
            String name = next.getName();
            if (labelMap.get(q) == null) {
                mo61098c(next, labelMap);
            } else {
                throw new PersistenceException("Duplicate annotation of name '%s' on %s", name, next);
            }
        }
    }
}
