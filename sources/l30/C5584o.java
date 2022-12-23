package l30;

import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polylon;
import p011aa.C0141e;
import p906wz.C20431c;
import p906wz.C20436g;
import w20.C20275b;
import w20.C20276c;

/* renamed from: l30.o */
public final class C5584o extends C0141e {

    /* renamed from: b */
    public final /* synthetic */ String f18293b;

    /* renamed from: c */
    public final /* synthetic */ LatLonE6 f18294c;

    /* renamed from: d */
    public final /* synthetic */ LatLonE6 f18295d;

    /* renamed from: e */
    public final /* synthetic */ C5585p f18296e;

    public C5584o(C5585p pVar, String str, LatLonE6 latLonE6, LatLonE6 latLonE62) {
        this.f18296e = pVar;
        this.f18293b = str;
        this.f18294c = latLonE6;
        this.f18295d = latLonE62;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C20275b bVar = (C20275b) cVar;
        Polylon polylon = ((C20276c) gVar).f51410m;
        if (polylon != null) {
            C5585p.f18297h.put(this.f18293b, polylon);
            this.f18296e.mo21412e(this.f18294c, this.f18295d);
        }
    }
}
