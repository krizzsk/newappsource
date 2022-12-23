package p451du;

import com.moovit.app.linedetail.p416ui.LineTripPatternActivity;
import com.moovit.map.MapFragment;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TripId;

/* renamed from: du.q */
public final /* synthetic */ class C16720q implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ LineTripPatternActivity f43551a;

    /* renamed from: b */
    public final /* synthetic */ TransitLineGroup f43552b;

    /* renamed from: c */
    public final /* synthetic */ TransitPatternTrips f43553c;

    /* renamed from: d */
    public final /* synthetic */ TripId f43554d;

    /* renamed from: e */
    public final /* synthetic */ ServerId f43555e;

    public /* synthetic */ C16720q(LineTripPatternActivity lineTripPatternActivity, TransitLineGroup transitLineGroup, TransitPatternTrips transitPatternTrips, TripId tripId, ServerId serverId) {
        this.f43551a = lineTripPatternActivity;
        this.f43552b = transitLineGroup;
        this.f43553c = transitPatternTrips;
        this.f43554d = tripId;
        this.f43555e = serverId;
    }

    /* renamed from: a */
    public final void mo21406a() {
        LineTripPatternActivity lineTripPatternActivity = this.f43551a;
        TransitLineGroup transitLineGroup = this.f43552b;
        TransitPatternTrips transitPatternTrips = this.f43553c;
        TripId tripId = this.f43554d;
        ServerId serverId = this.f43555e;
        int i = LineTripPatternActivity.f38762E0;
        lineTripPatternActivity.mo45443y2(transitLineGroup, transitPatternTrips, tripId, serverId);
    }
}
