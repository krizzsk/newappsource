package p900wt;

import com.moovit.app.itinerary.external.ExternalItineraryActivity;
import com.moovit.network.model.ServerId;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: wt.a */
public final class C20411a extends C20438i<C20414d, C20416f> {

    /* renamed from: b */
    public final /* synthetic */ ServerId f51720b;

    /* renamed from: c */
    public final /* synthetic */ ExternalItineraryActivity f51721c;

    public C20411a(ExternalItineraryActivity externalItineraryActivity, ServerId serverId) {
        this.f51721c = externalItineraryActivity;
        this.f51720b = serverId;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C20414d dVar = (C20414d) cVar;
        C20416f fVar = (C20416f) gVar;
        ExternalItineraryActivity.m38066y2(this.f51721c, fVar.f51727m.get(this.f51721c.f38544X).f14803c, fVar.f51727m.get(this.f51720b).f14803c);
    }

    /* renamed from: w */
    public final boolean mo21415w(C20431c cVar, Exception exc) {
        C20414d dVar = (C20414d) cVar;
        ExternalItineraryActivity.m38066y2(this.f51721c, "", "");
        return true;
    }
}
