package p988j$.time.format;

import p988j$.time.C25782a;
import p988j$.time.C25819g;
import p988j$.time.C25826n;
import p988j$.time.chrono.C25786b;
import p988j$.time.chrono.C25791g;
import p988j$.time.temporal.C25841l;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.temporal.C25848s;

/* renamed from: j$.time.format.r */
final class C25813r implements C25841l {

    /* renamed from: a */
    final /* synthetic */ C25786b f64378a;

    /* renamed from: b */
    final /* synthetic */ C25841l f64379b;

    /* renamed from: c */
    final /* synthetic */ C25791g f64380c;

    /* renamed from: d */
    final /* synthetic */ C25826n f64381d;

    C25813r(C25819g gVar, C25841l lVar, C25791g gVar2, C25826n nVar) {
        this.f64378a = gVar;
        this.f64379b = lVar;
        this.f64380c = gVar2;
        this.f64381d = nVar;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo83601b(C25842m mVar) {
        return C25782a.m64407b(this, mVar);
    }

    /* renamed from: d */
    public final C25848s mo83602d(C25842m mVar) {
        return (this.f64378a == null || !mVar.isDateBased()) ? this.f64379b.mo83602d(mVar) : ((C25819g) this.f64378a).mo83602d(mVar);
    }

    /* renamed from: f */
    public final boolean mo83603f(C25842m mVar) {
        return (this.f64378a == null || !mVar.isDateBased()) ? this.f64379b.mo83603f(mVar) : ((C25819g) this.f64378a).mo83603f(mVar);
    }

    /* renamed from: g */
    public final long mo83604g(C25842m mVar) {
        return (this.f64378a == null || !mVar.isDateBased()) ? this.f64379b.mo83604g(mVar) : ((C25819g) this.f64378a).mo83604g(mVar);
    }

    /* renamed from: h */
    public final Object mo83606h(C25845p pVar) {
        return pVar == C25844o.m64619a() ? this.f64380c : pVar == C25844o.m64625g() ? this.f64381d : pVar == C25844o.m64623e() ? this.f64379b.mo83606h(pVar) : pVar.mo83672a(this);
    }
}
