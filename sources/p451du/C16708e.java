package p451du;

import android.view.View;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.commons.geo.BoxE6;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import java.util.Collections;
import java.util.List;
import p499fu.C17073a;
import p523gu.C17231c;
import p977zz.C20949l;

/* renamed from: du.e */
public final /* synthetic */ class C16708e implements C20949l {

    /* renamed from: b */
    public final /* synthetic */ View f43511b;

    /* renamed from: c */
    public final /* synthetic */ boolean f43512c;

    /* renamed from: d */
    public final /* synthetic */ boolean f43513d;

    /* renamed from: e */
    public final /* synthetic */ TransitLine f43514e;

    /* renamed from: f */
    public final /* synthetic */ C17231c f43515f;

    public /* synthetic */ C16708e(View view, C17231c cVar, TransitLine transitLine, boolean z, boolean z2) {
        this.f43511b = view;
        this.f43512c = z;
        this.f43513d = z2;
        this.f43514e = transitLine;
        this.f43515f = cVar;
    }

    public final boolean invoke(Object obj) {
        BoxE6 boxE6;
        List<TransitPatternTrips> list;
        List<TransitStop> list2;
        TransitStop transitStop;
        Integer num;
        ServerId serverId;
        boolean z = this.f43512c;
        boolean z2 = this.f43513d;
        TransitLine transitLine = this.f43514e;
        C17231c cVar = this.f43515f;
        C15101a.C15108g gVar = (C15101a.C15108g) obj;
        int i = C15101a.f38810T;
        if (!z) {
            boxE6 = null;
        } else {
            boxE6 = cVar.f44548r;
        }
        if (!z) {
            list = null;
        } else if (cVar instanceof C17073a) {
            list = ((C17073a) cVar).f44258z;
        } else {
            list = Collections.singletonList(cVar.f44540j);
        }
        if (!z) {
            list2 = null;
        } else {
            list2 = cVar.f44545o;
        }
        if (!z) {
            transitStop = null;
        } else {
            transitStop = cVar.f44551u;
        }
        if (!z) {
            num = null;
        } else {
            num = Integer.valueOf(cVar.f44552v);
        }
        if (!z) {
            serverId = null;
        } else {
            serverId = cVar.f44547q;
        }
        gVar.mo45416I0(z, z2, transitLine, boxE6, list, list2, transitStop, num, serverId);
        return false;
    }
}
