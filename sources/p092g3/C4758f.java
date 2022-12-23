package p092g3;

import android.os.Build;
import androidx.work.C1385a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p081f3.C4656h;
import p192o3.C5956p;
import p192o3.C5958q;
import p192o3.C5959r;

/* renamed from: g3.f */
public final class C4758f {

    /* renamed from: a */
    public static final /* synthetic */ int f16055a = 0;

    static {
        C4656h.m11961e("Schedulers");
    }

    /* renamed from: a */
    public static void m12072a(C1385a aVar, WorkDatabase workDatabase, List<C4757e> list) {
        int i;
        if (list != null && list.size() != 0) {
            C5958q q = workDatabase.mo5701q();
            workDatabase.mo5187c();
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    i = aVar.f5150h / 2;
                } else {
                    i = aVar.f5150h;
                }
                C5959r rVar = (C5959r) q;
                ArrayList c = rVar.mo21945c(i);
                ArrayList b = rVar.mo21944b();
                if (c.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        rVar.mo21954l(currentTimeMillis, ((C5956p) it.next()).f19082a);
                    }
                }
                workDatabase.mo5194j();
                workDatabase.mo5191g();
                if (c.size() > 0) {
                    C5956p[] pVarArr = (C5956p[]) c.toArray(new C5956p[c.size()]);
                    for (C4757e next : list) {
                        if (next.mo20272d()) {
                            next.mo20270a(pVarArr);
                        }
                    }
                }
                if (b.size() > 0) {
                    C5956p[] pVarArr2 = (C5956p[]) b.toArray(new C5956p[b.size()]);
                    for (C4757e next2 : list) {
                        if (!next2.mo20272d()) {
                            next2.mo20270a(pVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.mo5191g();
                throw th;
            }
        }
    }
}
