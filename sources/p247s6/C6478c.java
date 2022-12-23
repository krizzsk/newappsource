package p247s6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24362h;
import p241s0.C6302b;
import p413co.C13869o;
import p469eo.C16846b;
import p541ho.C17465b;
import p768rh.C19275b;
import p768rh.C19276c;

/* renamed from: s6.c */
public final class C6478c {

    /* renamed from: a */
    public Object f20214a;

    /* renamed from: b */
    public Object f20215b;

    public /* synthetic */ C6478c(Object obj, Object obj2) {
        this.f20214a = obj;
        this.f20215b = obj2;
    }

    /* renamed from: a */
    public final C17465b mo22587a(Class cls) {
        Object a = ((C16846b) this.f20215b).mo49505a(cls, (String) null);
        C24362h.m61210e(a, "serviceLocator.get(presenterFactoryClass)");
        return (C17465b) a;
    }

    public C6478c(C16846b bVar) {
        this.f20215b = bVar;
        this.f20214a = (C13869o) bVar.mo49505a(C13869o.class, (String) null);
    }

    public C6478c(int i) {
        if (i == 1) {
            this.f20214a = new AtomicInteger();
            this.f20215b = new AtomicInteger();
        } else if (i == 2) {
            C19276c cVar = new C19276c();
            this.f20214a = cVar;
            this.f20215b = new C19275b(cVar);
        } else if (i != 6) {
            this.f20214a = new AtomicReference();
            this.f20215b = new C6302b();
        } else {
            this.f20214a = new ArrayList();
        }
    }
}
