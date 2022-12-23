package com.vungle.warren.persistence;

import com.vungle.warren.persistence.DatabaseHelper;
import java.util.List;
import java.util.concurrent.Callable;
import od0.C24568o;

/* renamed from: com.vungle.warren.persistence.c */
public final class C23210c implements Callable<List<C24568o>> {

    /* renamed from: b */
    public final /* synthetic */ C23192a f58910b;

    public C23210c(C23192a aVar) {
        this.f58910b = aVar;
    }

    public final Object call() throws Exception {
        List<C24568o> k = this.f58910b.mo58276k(C24568o.class, this.f58910b.f58874a.mo58264e().query("report", (String[]) null, "status = ?  OR status = ? ", new String[]{String.valueOf(1), String.valueOf(3)}, (String) null, (String) null, (String) null, (String) null));
        for (C24568o next : k) {
            next.f62269a = 2;
            try {
                C23192a.m57223e(this.f58910b, next);
            } catch (DatabaseHelper.DBException unused) {
                return null;
            }
        }
        return k;
    }
}
