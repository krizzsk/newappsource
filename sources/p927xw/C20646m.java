package p927xw;

import android.content.Intent;
import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.TodRideActivity;
import com.moovit.app.tod.TodRideChangeDestinationConfirmationActivity;
import com.moovit.app.tod.model.TodRideUpdateOffer;
import p543hq.C17474b;
import p596jx.C17968p;
import p596jx.C17969q;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: xw.m */
public final class C20646m extends C20438i<C17968p, C17969q> {

    /* renamed from: b */
    public final /* synthetic */ TodRideActivity f52213b;

    public C20646m(TodRideActivity todRideActivity) {
        this.f52213b = todRideActivity;
    }

    /* renamed from: a */
    public final void mo313a(C20431c cVar, boolean z) {
        C17968p pVar = (C17968p) cVar;
        this.f52213b.mo44506I1();
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C17968p pVar = (C17968p) cVar;
        TodRideActivity todRideActivity = this.f52213b;
        TodRideUpdateOffer todRideUpdateOffer = ((C17969q) gVar).f46051m;
        int i = TodRideChangeDestinationConfirmationActivity.f40015X;
        Intent intent = new Intent(todRideActivity, TodRideChangeDestinationConfirmationActivity.class);
        intent.putExtra("offer", todRideUpdateOffer);
        todRideActivity.startActivity(intent);
    }

    /* renamed from: w */
    public final boolean mo21415w(C20431c cVar, Exception exc) {
        TodRideActivity todRideActivity = this.f52213b;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_ride_change_destination_error");
        aVar.mo49935c(AnalyticsAttributeKey.ERROR_CODE, C13751d.m34343d(exc));
        todRideActivity.mo44545v2(aVar.mo49933a());
        this.f52213b.mo44530n2(C20652s.m48547b(exc, ((C17968p) cVar).f51759b));
        return true;
    }
}
