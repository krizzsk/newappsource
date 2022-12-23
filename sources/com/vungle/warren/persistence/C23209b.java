package com.vungle.warren.persistence;

import com.vungle.warren.persistence.DatabaseHelper;
import java.util.List;
import java.util.concurrent.Callable;
import od0.C24568o;

/* renamed from: com.vungle.warren.persistence.b */
public final class C23209b implements Callable<List<C24568o>> {

    /* renamed from: b */
    public final /* synthetic */ C23192a f58909b;

    public C23209b(C23192a aVar) {
        this.f58909b = aVar;
    }

    public final Object call() throws Exception {
        List<C24568o> t = this.f58909b.mo58285t(C24568o.class);
        for (C24568o next : t) {
            next.f62269a = 2;
            try {
                C23192a.m57223e(this.f58909b, next);
            } catch (DatabaseHelper.DBException unused) {
                return null;
            }
        }
        return t;
    }
}
