package org.simpleframework.xml.stream;

import androidx.appcompat.app.C0262r;
import lj0.C24327d;
import lj0.C24331h;
import lj0.C24334k;

/* renamed from: org.simpleframework.xml.stream.b */
public final class C24675b implements C24331h {

    /* renamed from: a */
    public final InputNodeMap f62469a;

    /* renamed from: b */
    public final C24676c f62470b;

    /* renamed from: c */
    public final C24331h f62471c;

    /* renamed from: d */
    public final C24327d f62472d;

    public C24675b(C24331h hVar, C24676c cVar, C24327d dVar) {
        this.f62469a = new InputNodeMap(this, dVar);
        this.f62470b = cVar;
        this.f62471c = hVar;
        this.f62472d = dVar;
    }

    /* renamed from: a */
    public final boolean mo60484a() {
        return true;
    }

    /* renamed from: b */
    public final C24331h mo60485b() throws Exception {
        return this.f62470b.mo61117a(this);
    }

    /* renamed from: c */
    public final void mo60486c() throws Exception {
        do {
        } while (this.f62470b.mo61117a(this) != null);
    }

    public final C24331h getAttribute(String str) {
        return this.f62469a.mo61107a(str);
    }

    public final C24334k<C24331h> getAttributes() {
        return this.f62469a;
    }

    public final String getName() {
        return this.f62472d.getName();
    }

    public final C0262r getPosition() {
        return new C0262r(this.f62472d, 13);
    }

    public final String getValue() throws Exception {
        C24676c cVar = this.f62470b;
        if (cVar.f62475c.mo61108m(this)) {
            if (cVar.f62473a.length() <= 0 && cVar.f62474b.peek().mo60477d2()) {
                if (cVar.f62475c.mo61111i() != this) {
                    cVar.f62475c.pop();
                    cVar.f62474b.next();
                }
            }
            C24327d peek = cVar.f62474b.peek();
            while (cVar.f62475c.mo61111i() == this && peek.mo60480v()) {
                C24327d peek2 = cVar.f62474b.peek();
                if (peek2.mo60480v()) {
                    cVar.f62473a.append(peek2.getValue());
                }
                cVar.f62474b.next();
                peek = cVar.f62474b.peek();
            }
            if (cVar.f62473a.length() > 0) {
                String sb = cVar.f62473a.toString();
                cVar.f62473a.setLength(0);
                return sb;
            }
        }
        return null;
    }

    public final String toString() {
        return String.format("element %s", new Object[]{getName()});
    }
}
