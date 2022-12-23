package com.vungle.warren;

import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import od0.C24573q;

/* renamed from: com.vungle.warren.l1 */
public final class C23175l1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ boolean f58828b;

    /* renamed from: c */
    public final /* synthetic */ C23192a f58829c;

    /* renamed from: d */
    public final /* synthetic */ C23181n1 f58830d;

    public C23175l1(C23181n1 n1Var, boolean z, C23192a aVar) {
        this.f58830d = n1Var;
        this.f58828b = z;
        this.f58829c = aVar;
    }

    public final void run() {
        if (!this.f58830d.f58847f.isEmpty() && this.f58828b) {
            for (C24573q d : this.f58830d.f58847f) {
                this.f58830d.mo58250d(d);
            }
        }
        this.f58830d.f58847f.clear();
        int i = this.f58830d.f58851j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object add : this.f58829c.mo58282q(C24573q.class).get()) {
            arrayList2.add(add);
            if (arrayList2.size() == i) {
                arrayList.add(arrayList2);
                arrayList2 = new ArrayList();
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            int size = list.size();
            C23181n1 n1Var = this.f58830d;
            if (size >= n1Var.f58851j) {
                try {
                    C23181n1.m57207a(n1Var, list);
                } catch (DatabaseHelper.DBException e) {
                    C23181n1 n1Var2 = C23181n1.f58840o;
                    e.getLocalizedMessage();
                }
            } else {
                n1Var.f58852k.set(list.size());
            }
        }
    }
}
