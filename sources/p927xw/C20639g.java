package p927xw;

import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polylon;
import p011aa.C0141e;
import p906wz.C20431c;
import p906wz.C20436g;
import w20.C20275b;
import w20.C20276c;

/* renamed from: xw.g */
public final class C20639g extends C0141e {

    /* renamed from: b */
    public final /* synthetic */ String f52199b;

    /* renamed from: c */
    public final /* synthetic */ LatLonE6 f52200c;

    /* renamed from: d */
    public final /* synthetic */ LatLonE6 f52201d;

    /* renamed from: e */
    public final /* synthetic */ C20637f f52202e;

    public C20639g(C20637f fVar, String str, LatLonE6 latLonE6, LatLonE6 latLonE62) {
        this.f52202e = fVar;
        this.f52199b = str;
        this.f52200c = latLonE6;
        this.f52201d = latLonE62;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C20275b bVar = (C20275b) cVar;
        Polylon polylon = ((C20276c) gVar).f51410m;
        if (polylon != null) {
            C20637f.f52176u.put(this.f52199b, polylon);
            this.f52202e.mo52820f(this.f52200c, this.f52201d);
        }
    }
}
