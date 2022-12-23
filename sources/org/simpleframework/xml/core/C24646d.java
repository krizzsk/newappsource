package org.simpleframework.xml.core;

import ij0.C23675u;
import ij0.C23679v;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.util.ConcurrentCache;

/* renamed from: org.simpleframework.xml.core.d */
public final class C24646d {

    /* renamed from: a */
    public final ConcurrentCache f62377a = new ConcurrentCache();

    /* renamed from: b */
    public final ConcurrentCache f62378b = new ConcurrentCache();

    /* renamed from: c */
    public final ConcurrentCache f62379c = new ConcurrentCache();

    /* renamed from: d */
    public final DefaultType f62380d;

    /* renamed from: e */
    public final C24664u f62381e;

    public C24646d(C24664u uVar, DefaultType defaultType) {
        this.f62380d = defaultType;
        this.f62381e = uVar;
    }

    /* renamed from: a */
    public final C23675u mo61062a(Class cls) {
        C23675u uVar = (C23675u) this.f62379c.get(cls);
        if (uVar != null) {
            return uVar;
        }
        C23679v vVar = new C23679v(cls, this.f62380d);
        this.f62379c.put(cls, vVar);
        return vVar;
    }

    /* renamed from: b */
    public final ContactList mo61063b(Class cls) throws Exception {
        ContactList contactList = (ContactList) this.f62378b.get(cls);
        if (contactList != null) {
            return contactList;
        }
        FieldScanner fieldScanner = new FieldScanner(mo61062a(cls), this.f62381e);
        this.f62378b.put(cls, fieldScanner);
        return fieldScanner;
    }

    /* renamed from: c */
    public final ContactList mo61064c(Class cls) throws Exception {
        ContactList contactList = (ContactList) this.f62377a.get(cls);
        if (contactList != null) {
            return contactList;
        }
        MethodScanner methodScanner = new MethodScanner(mo61062a(cls), this.f62381e);
        this.f62377a.put(cls, methodScanner);
        return methodScanner;
    }
}
