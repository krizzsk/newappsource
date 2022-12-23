package org.simpleframework.xml.core;

import ij0.C23626e1;
import ij0.C23636h1;
import ij0.C23647l0;
import ij0.C23673t0;
import ij0.C23675u;
import java.util.ArrayList;
import java.util.Iterator;

public final class TreeModel implements C24652j {

    /* renamed from: b */
    public C23647l0 f62350b;

    /* renamed from: c */
    public LabelMap f62351c;

    /* renamed from: d */
    public LabelMap f62352d;

    /* renamed from: e */
    public ModelMap f62353e;

    /* renamed from: f */
    public OrderList f62354f = new OrderList();

    /* renamed from: g */
    public C23636h1 f62355g;

    /* renamed from: h */
    public C23675u f62356h;

    /* renamed from: i */
    public String f62357i;

    /* renamed from: j */
    public C23673t0 f62358j;

    /* renamed from: k */
    public C23673t0 f62359k;

    /* renamed from: l */
    public int f62360l;

    public static class OrderList extends ArrayList<String> {
    }

    public TreeModel(C23636h1 h1Var, C23675u uVar, String str, int i) {
        this.f62351c = new LabelMap(h1Var);
        this.f62352d = new LabelMap(h1Var);
        this.f62353e = new ModelMap(uVar);
        this.f62356h = uVar;
        this.f62355g = h1Var;
        this.f62360l = i;
        this.f62357i = str;
    }

    /* renamed from: C0 */
    public final boolean mo61012C0(String str) {
        return this.f62353e.containsKey(str);
    }

    /* renamed from: D0 */
    public final boolean mo61013D0(String str) {
        return this.f62352d.containsKey(str);
    }

    /* renamed from: E0 */
    public final void mo61014E0(Class cls) throws Exception {
        Iterator<C23673t0> it = this.f62352d.iterator();
        while (it.hasNext()) {
            C23673t0 next = it.next();
            if (next != null) {
                mo61025i(next);
            }
        }
        Iterator<C23673t0> it2 = this.f62351c.iterator();
        while (it2.hasNext()) {
            C23673t0 next2 = it2.next();
            if (next2 != null) {
                mo61025i(next2);
            }
        }
        C23673t0 t0Var = this.f62358j;
        if (t0Var != null) {
            mo61025i(t0Var);
        }
        for (String str : this.f62351c.keySet()) {
            if (((C23673t0) this.f62351c.get(str)) != null) {
                C23647l0 l0Var = this.f62350b;
                if (l0Var != null) {
                    l0Var.getAttribute(str);
                }
            } else {
                throw new AttributeException("Ordered attribute '%s' does not exist in %s", str, cls);
            }
        }
        for (String str2 : this.f62352d.keySet()) {
            ModelList modelList = (ModelList) this.f62353e.get(str2);
            C23673t0 t0Var2 = (C23673t0) this.f62352d.get(str2);
            if (modelList == null && t0Var2 == null) {
                throw new ElementException("Ordered element '%s' does not exist in %s", str2, cls);
            } else if (modelList == null || t0Var2 == null || modelList.isEmpty()) {
                C23647l0 l0Var2 = this.f62350b;
                if (l0Var2 != null) {
                    l0Var2.mo58796j1(str2);
                }
            } else {
                throw new ElementException("Element '%s' is also a path name in %s", str2, cls);
            }
        }
        Iterator<ModelList> it3 = this.f62353e.iterator();
        while (it3.hasNext()) {
            Iterator it4 = it3.next().iterator();
            int i = 1;
            while (true) {
                if (it4.hasNext()) {
                    C24652j jVar = (C24652j) it4.next();
                    if (jVar != null) {
                        String name = jVar.getName();
                        int index = jVar.getIndex();
                        int i2 = i + 1;
                        if (index == i) {
                            jVar.mo61014E0(cls);
                            i = i2;
                        } else {
                            throw new ElementException("Path section '%s[%s]' is out of sequence in %s", name, Integer.valueOf(index), cls);
                        }
                    }
                }
            }
        }
        if (this.f62358j == null) {
            return;
        }
        if (!this.f62352d.isEmpty()) {
            throw new TextException("Text annotation %s used with elements in %s", this.f62358j, cls);
        } else if (mo61016e()) {
            throw new TextException("Text annotation %s can not be used with paths in %s", this.f62358j, cls);
        }
    }

    /* renamed from: V1 */
    public final ModelMap mo61015V1() throws Exception {
        return this.f62353e.mo61005V1();
    }

    /* renamed from: e */
    public final boolean mo61016e() {
        Iterator<ModelList> it = this.f62353e.iterator();
        while (it.hasNext()) {
            Iterator it2 = it.next().iterator();
            while (true) {
                if (it2.hasNext()) {
                    C24652j jVar = (C24652j) it2.next();
                    if (jVar != null && !jVar.isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return !this.f62353e.isEmpty();
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.simpleframework.xml.core.C24652j mo61017f(int r6, java.lang.String r7, java.lang.String r8) throws java.lang.Exception {
        /*
            r5 = this;
            org.simpleframework.xml.core.ModelMap r8 = r5.f62353e
            java.lang.Object r8 = r8.get(r7)
            org.simpleframework.xml.core.ModelList r8 = (org.simpleframework.xml.core.ModelList) r8
            r0 = 0
            if (r8 == 0) goto L_0x001a
            int r1 = r8.size()
            if (r6 > r1) goto L_0x001a
            int r1 = r6 + -1
            java.lang.Object r8 = r8.get(r1)
            org.simpleframework.xml.core.j r8 = (org.simpleframework.xml.core.C24652j) r8
            goto L_0x001b
        L_0x001a:
            r8 = r0
        L_0x001b:
            if (r8 != 0) goto L_0x0059
            org.simpleframework.xml.core.TreeModel r8 = new org.simpleframework.xml.core.TreeModel
            ij0.h1 r1 = r5.f62355g
            ij0.u r2 = r5.f62356h
            r8.<init>(r1, r2, r7, r6)
            if (r7 == 0) goto L_0x0059
            org.simpleframework.xml.core.ModelMap r6 = r5.f62353e
            java.lang.Object r1 = r6.get(r7)
            org.simpleframework.xml.core.ModelList r1 = (org.simpleframework.xml.core.ModelList) r1
            if (r1 != 0) goto L_0x003a
            org.simpleframework.xml.core.ModelList r1 = new org.simpleframework.xml.core.ModelList
            r1.<init>()
            r6.put(r7, r1)
        L_0x003a:
            int r6 = r8.getIndex()
            int r2 = r1.size()
            r3 = 0
        L_0x0043:
            if (r3 >= r6) goto L_0x0054
            if (r3 < r2) goto L_0x004a
            r1.add(r0)
        L_0x004a:
            int r4 = r6 + -1
            if (r3 != r4) goto L_0x0051
            r1.set(r4, r8)
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0043
        L_0x0054:
            org.simpleframework.xml.core.TreeModel$OrderList r6 = r5.f62354f
            r6.add(r7)
        L_0x0059:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.core.TreeModel.mo61017f(int, java.lang.String, java.lang.String):org.simpleframework.xml.core.j");
    }

    /* renamed from: g */
    public final void mo61018g(C23673t0 t0Var) throws Exception {
        if (t0Var.mo58806t()) {
            String name = t0Var.getName();
            if (this.f62351c.get(name) == null) {
                this.f62351c.put(name, t0Var);
            } else {
                throw new AttributeException("Duplicate annotation of name '%s' on %s", name, t0Var);
            }
        } else if (!t0Var.mo58808v()) {
            String name2 = t0Var.getName();
            if (this.f62352d.get(name2) == null) {
                if (!this.f62354f.contains(name2)) {
                    this.f62354f.add(name2);
                }
                if (t0Var.mo58760I()) {
                    this.f62359k = t0Var;
                }
                this.f62352d.put(name2, t0Var);
                return;
            }
            throw new ElementException("Duplicate annotation of name '%s' on %s", name2, t0Var);
        } else if (this.f62358j == null) {
            this.f62358j = t0Var;
        } else {
            throw new TextException("Duplicate text annotation on %s", t0Var);
        }
    }

    /* renamed from: g1 */
    public final C24652j mo61019g1(C23647l0 l0Var) {
        C24652j o = mo61030o(l0Var.getIndex(), l0Var.getFirst());
        if (l0Var.mo58785A0()) {
            C23626e1.C23627a b2 = l0Var.mo58788b2(1, 0);
            if (o != null) {
                return o.mo61019g1(b2);
            }
        }
        return o;
    }

    public final LabelMap getAttributes() throws Exception {
        return this.f62351c.mo60998i();
    }

    public final LabelMap getElements() throws Exception {
        return this.f62352d.mo60998i();
    }

    public final int getIndex() {
        return this.f62360l;
    }

    public final String getName() {
        return this.f62357i;
    }

    public final C23673t0 getText() {
        C23673t0 t0Var = this.f62359k;
        if (t0Var != null) {
            return t0Var;
        }
        return this.f62358j;
    }

    /* renamed from: i */
    public final void mo61025i(C23673t0 t0Var) throws Exception {
        C23647l0 r = t0Var.mo58767r();
        C23647l0 l0Var = this.f62350b;
        if (l0Var != null) {
            String q = l0Var.mo58797q();
            String q2 = r.mo58797q();
            if (!q.equals(q2)) {
                throw new PathException("Path '%s' does not match '%s' in %s", q, q2, this.f62356h);
            }
            return;
        }
        this.f62350b = r;
    }

    public final boolean isEmpty() {
        if (this.f62358j == null && this.f62352d.isEmpty() && this.f62351c.isEmpty()) {
            return !mo61016e();
        }
        return false;
    }

    public final Iterator<String> iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f62354f.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList.iterator();
    }

    /* renamed from: j */
    public final void mo61028j(String str) throws Exception {
        this.f62351c.put(str, (Object) null);
    }

    /* renamed from: n1 */
    public final boolean mo61029n1(String str) {
        return this.f62351c.containsKey(str);
    }

    /* renamed from: o */
    public final C24652j mo61030o(int i, String str) {
        ModelList modelList = (ModelList) this.f62353e.get(str);
        if (modelList == null || i > modelList.size()) {
            return null;
        }
        return (C24652j) modelList.get(i - 1);
    }

    /* renamed from: r */
    public final C23647l0 mo61031r() {
        return this.f62350b;
    }

    public final String toString() {
        return String.format("model '%s[%s]'", new Object[]{this.f62357i, Integer.valueOf(this.f62360l)});
    }
}
