package org.simpleframework.xml.core;

import ij0.C23647l0;
import ij0.C23673t0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: org.simpleframework.xml.core.k */
public final class C24653k implements C24659p {

    /* renamed from: b */
    public LabelMap f62400b;

    /* renamed from: c */
    public LabelMap f62401c;

    /* renamed from: d */
    public ModelMap f62402d;

    /* renamed from: e */
    public C24652j f62403e;

    public C24653k(C24652j jVar) {
        this.f62403e = jVar;
    }

    public final String getAttribute(String str) throws Exception {
        C23647l0 r = this.f62403e.mo61031r();
        if (r == null) {
            return str;
        }
        return r.getAttribute(str);
    }

    public final LabelMap getAttributes() throws Exception {
        if (this.f62400b == null) {
            this.f62400b = this.f62403e.getAttributes();
        }
        return this.f62400b;
    }

    public final LabelMap getElements() throws Exception {
        if (this.f62401c == null) {
            this.f62401c = this.f62403e.getElements();
        }
        return this.f62401c;
    }

    public final C23673t0 getText() throws Exception {
        return this.f62403e.getText();
    }

    public final Iterator<String> iterator() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.f62403e) {
            arrayList.add(add);
        }
        return arrayList.iterator();
    }

    /* renamed from: l */
    public final C24659p mo61084l(String str) throws Exception {
        C24652j jVar;
        if (this.f62402d == null) {
            this.f62402d = this.f62403e.mo61015V1();
        }
        ModelList modelList = (ModelList) this.f62402d.get(str);
        if (modelList != null) {
            while (true) {
                if (modelList.isEmpty()) {
                    jVar = null;
                    break;
                }
                jVar = (C24652j) modelList.remove(0);
                if (!jVar.isEmpty()) {
                    break;
                }
            }
            if (jVar != null) {
                return new C24653k(jVar);
            }
        }
        return null;
    }

    /* renamed from: t1 */
    public final String mo61085t1(String str) throws Exception {
        C23647l0 r = this.f62403e.mo61031r();
        if (r == null) {
            return str;
        }
        return r.mo58796j1(str);
    }
}
