package p900wt;

import com.moovit.app.MoovitAppApplication;
import com.moovit.app.itinerary.external.ExternalItineraryActivity;
import com.moovit.network.model.ServerId;
import h30.C5047a;
import h30.C5048b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: wt.c */
public final class C20413c extends C20438i<C5047a, C5048b> {

    /* renamed from: b */
    public final /* synthetic */ ServerId f51724b;

    /* renamed from: c */
    public final /* synthetic */ ExternalItineraryActivity f51725c;

    public C20413c(ExternalItineraryActivity externalItineraryActivity, ServerId serverId) {
        this.f51725c = externalItineraryActivity;
        this.f51724b = serverId;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C5047a aVar = (C5047a) cVar;
        C5048b bVar = (C5048b) gVar;
        MoovitAppApplication x = MoovitAppApplication.m37038x();
        ServerId serverId = this.f51724b;
        ExternalItineraryActivity externalItineraryActivity = this.f51725c;
        x.mo44686y(serverId, externalItineraryActivity, externalItineraryActivity.getIntent());
    }

    /* renamed from: w */
    public final boolean mo21415w(C20431c cVar, Exception exc) {
        C5047a aVar = (C5047a) cVar;
        ExternalItineraryActivity externalItineraryActivity = this.f51725c;
        int i = ExternalItineraryActivity.f38542m0;
        externalItineraryActivity.mo45308A2();
        return true;
    }
}
