package p205p3;

import androidx.work.impl.WorkDatabase;
import p081f3.C4653e;
import p081f3.C4656h;
import p179n3.C5842a;
import p192o3.C5958q;
import p218q3.C6165a;

/* renamed from: p3.p */
public final class C6054p implements C4653e {

    /* renamed from: a */
    public final C6165a f19296a;

    /* renamed from: b */
    public final C5842a f19297b;

    /* renamed from: c */
    public final C5958q f19298c;

    static {
        C4656h.m11961e("WMFgUpdater");
    }

    public C6054p(WorkDatabase workDatabase, C5842a aVar, C6165a aVar2) {
        this.f19297b = aVar;
        this.f19296a = aVar2;
        this.f19298c = workDatabase.mo5701q();
    }
}
