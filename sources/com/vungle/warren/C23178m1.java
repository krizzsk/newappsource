package com.vungle.warren;

import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.Objects;
import od0.C24573q;

/* renamed from: com.vungle.warren.m1 */
public final class C23178m1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C24573q f58837b;

    /* renamed from: c */
    public final /* synthetic */ C23181n1 f58838c;

    public C23178m1(C23181n1 n1Var, C24573q qVar) {
        this.f58838c = n1Var;
        this.f58837b = qVar;
    }

    public final void run() {
        try {
            C23192a aVar = this.f58838c.f58854m;
            if (aVar != null) {
                C24573q qVar = this.f58837b;
                if (qVar != null) {
                    aVar.mo58288w(qVar);
                    this.f58838c.f58852k.incrementAndGet();
                    C23181n1 n1Var = C23181n1.f58840o;
                    Objects.toString(this.f58838c.f58852k);
                    Objects.toString(this.f58837b.f62301a);
                    int i = this.f58838c.f58852k.get();
                    C23181n1 n1Var2 = this.f58838c;
                    if (i >= n1Var2.f58851j) {
                        C23181n1.m57207a(n1Var2, n1Var2.f58854m.mo58282q(C24573q.class).get());
                        Objects.toString(this.f58838c.f58852k);
                    }
                }
            }
        } catch (DatabaseHelper.DBException unused) {
            C23181n1 n1Var3 = C23181n1.f58840o;
            VungleLogger.m57029b("n1", "Could not save event to DB");
        }
    }
}
