package org.simpleframework.xml.core;

import ij0.C23619c1;
import ij0.C23640j;
import ij0.C23652n;
import ij0.C23659p;
import ij0.C23665r;
import ij0.C23673t0;
import ij0.C23675u;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: org.simpleframework.xml.core.f */
public final class C24648f {

    /* renamed from: a */
    public ArrayList f62388a = new ArrayList();

    /* renamed from: b */
    public C23640j f62389b;

    /* renamed from: c */
    public LabelMap f62390c = new LabelMap();

    /* renamed from: d */
    public LabelMap f62391d = new LabelMap();

    /* renamed from: e */
    public LabelMap f62392e = new LabelMap();

    /* renamed from: f */
    public C23652n f62393f = new C23652n();

    /* renamed from: g */
    public C24658o f62394g;

    /* renamed from: h */
    public C23675u f62395h;

    public C24648f(C24658o oVar, C23675u uVar) {
        this.f62394g = oVar;
        this.f62395h = uVar;
    }

    /* renamed from: b */
    public static void m62008b(C23673t0 t0Var, LabelMap labelMap) throws Exception {
        String name = t0Var.getName();
        String q = t0Var.mo58766q();
        if (!labelMap.containsKey(name)) {
            labelMap.put(name, t0Var);
        } else if (!((C23673t0) labelMap.get(name)).mo58766q().equals(name)) {
            labelMap.remove(name);
        }
        labelMap.put(q, t0Var);
    }

    /* renamed from: d */
    public static C23673t0 m62009d(C23619c1 c1Var, LabelMap labelMap) throws Exception {
        String name = c1Var.getName();
        C23673t0 t0Var = (C23673t0) labelMap.get(c1Var.mo58747q());
        if (t0Var == null) {
            return (C23673t0) labelMap.get(name);
        }
        return t0Var;
    }

    /* renamed from: a */
    public final void mo61075a(C23673t0 t0Var) throws Exception {
        if (t0Var.mo58806t()) {
            m62008b(t0Var, this.f62390c);
        } else if (t0Var.mo58808v()) {
            m62008b(t0Var, this.f62392e);
        } else {
            m62008b(t0Var, this.f62391d);
        }
    }

    /* renamed from: c */
    public final C23673t0 mo61076c(C23619c1 c1Var) throws Exception {
        if (c1Var.mo58779t()) {
            return m62009d(c1Var, this.f62390c);
        }
        if (c1Var.mo58780v()) {
            return m62009d(c1Var, this.f62392e);
        }
        return m62009d(c1Var, this.f62391d);
    }

    /* renamed from: e */
    public final void mo61077e(LabelMap labelMap) throws Exception {
        Iterator<C23673t0> it = labelMap.iterator();
        while (it.hasNext()) {
            C23673t0 next = it.next();
            if (next != null && next.mo58755C().mo58840c()) {
                throw new ConstructorException("Default constructor can not accept read only %s in %s", next, this.f62395h);
            }
        }
    }

    /* renamed from: f */
    public final void mo61078f(LabelMap labelMap, ArrayList arrayList) throws Exception {
        Iterator<C23673t0> it = labelMap.iterator();
        while (it.hasNext()) {
            C23673t0 next = it.next();
            if (next != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C24661r a = ((C23665r) it2.next()).mo58848a();
                    C23659p C = next.mo58755C();
                    Object key = next.getKey();
                    if (C.mo58840c() && ((C23619c1) a.f62424b.get(key)) == null) {
                        it2.remove();
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw new ConstructorException("No constructor accepts all read only values in %s", this.f62395h);
        }
    }
}
