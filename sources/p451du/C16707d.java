package p451du;

import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import java.util.Collections;
import java.util.List;
import p499fu.C17073a;
import p523gu.C17231c;
import p977zz.C20949l;

/* renamed from: du.d */
public final /* synthetic */ class C16707d implements C20949l {

    /* renamed from: b */
    public final /* synthetic */ C15101a f43504b;

    /* renamed from: c */
    public final /* synthetic */ C17231c f43505c;

    /* renamed from: d */
    public final /* synthetic */ TransitStop f43506d;

    /* renamed from: e */
    public final /* synthetic */ int f43507e;

    /* renamed from: f */
    public final /* synthetic */ List f43508f;

    /* renamed from: g */
    public final /* synthetic */ TransitStop f43509g;

    /* renamed from: h */
    public final /* synthetic */ int f43510h;

    public /* synthetic */ C16707d(C15101a aVar, C17231c cVar, TransitStop transitStop, int i, List list, TransitStop transitStop2, int i2) {
        this.f43504b = aVar;
        this.f43505c = cVar;
        this.f43506d = transitStop;
        this.f43507e = i;
        this.f43508f = list;
        this.f43509g = transitStop2;
        this.f43510h = i2;
    }

    public final boolean invoke(Object obj) {
        List<TransitPatternTrips> list;
        C15101a aVar = this.f43504b;
        C17231c cVar = this.f43505c;
        TransitStop transitStop = this.f43506d;
        int i = this.f43507e;
        List list2 = this.f43508f;
        TransitStop transitStop2 = this.f43509g;
        int i2 = this.f43510h;
        C15101a.C15108g gVar = (C15101a.C15108g) obj;
        int i3 = C15101a.f38810T;
        aVar.getClass();
        if (cVar instanceof C17073a) {
            list = ((C17073a) cVar).f44258z;
        } else {
            list = Collections.singletonList(cVar.f44540j);
        }
        gVar.mo45420i(aVar.f38826P, list, transitStop, i, list2, transitStop2, i2);
        return false;
    }
}
