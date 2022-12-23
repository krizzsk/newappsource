package p927xw;

import c70.C13751d;
import com.moovit.app.tod.TodRideActivity;
import p596jx.C17974v;
import p596jx.C17975w;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: xw.k */
public final class C20644k extends C20438i<C17974v, C17975w> {

    /* renamed from: b */
    public final /* synthetic */ String f52210b;

    /* renamed from: c */
    public final /* synthetic */ TodRideActivity f52211c;

    public C20644k(TodRideActivity todRideActivity, String str) {
        this.f52211c = todRideActivity;
        this.f52210b = str;
    }

    /* renamed from: a */
    public final void mo313a(C20431c cVar, boolean z) {
        C17974v vVar = (C17974v) cVar;
        this.f52211c.mo44506I1();
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C17974v vVar = (C17974v) cVar;
        TodRideActivity.m39512y2(this.f52211c, this.f52210b, true);
        this.f52211c.f39997U.mo52823h(((C17975w) gVar).f46059m);
    }

    /* renamed from: w */
    public final boolean mo21415w(C20431c cVar, Exception exc) {
        C17974v vVar = (C17974v) cVar;
        TodRideActivity.m39512y2(this.f52211c, this.f52210b, false);
        this.f52211c.mo44530n2(C13751d.m34341b(this.f52211c, (String) null, exc));
        return true;
    }
}
