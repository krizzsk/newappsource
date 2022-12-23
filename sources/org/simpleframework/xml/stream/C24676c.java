package org.simpleframework.xml.stream;

import lj0.C24327d;
import lj0.C24328e;
import lj0.C24331h;

/* renamed from: org.simpleframework.xml.stream.c */
public final class C24676c {

    /* renamed from: a */
    public final StringBuilder f62473a = new StringBuilder();

    /* renamed from: b */
    public final C24328e f62474b;

    /* renamed from: c */
    public final InputStack f62475c = new InputStack();

    public C24676c(C24328e eVar) {
        this.f62474b = eVar;
    }

    /* renamed from: a */
    public final C24675b mo61117a(C24331h hVar) throws Exception {
        if (!this.f62475c.mo61108m(hVar)) {
            return null;
        }
        C24327d next = this.f62474b.next();
        while (next != null) {
            if (next.mo60477d2()) {
                if (this.f62475c.pop() == hVar) {
                    return null;
                }
            } else if (next.mo60476U()) {
                C24675b bVar = new C24675b(hVar, this, next);
                if (this.f62473a.length() > 0) {
                    this.f62473a.setLength(0);
                }
                if (next.mo60476U()) {
                    this.f62475c.add(bVar);
                }
                return bVar;
            }
            next = this.f62474b.next();
        }
        return null;
    }
}
