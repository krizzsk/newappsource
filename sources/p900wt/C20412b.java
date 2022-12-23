package p900wt;

import b00.C13557b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.itinerary.external.ExternalItineraryActivity;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import g30.C4773f;
import h30.C5047a;
import java.io.IOException;
import p543hq.C17474b;
import p646lz.C18299a;

/* renamed from: wt.b */
public final class C20412b extends C13557b<ServerId, Void, Boolean> {

    /* renamed from: b */
    public final /* synthetic */ ServerId f51722b;

    /* renamed from: c */
    public final /* synthetic */ ExternalItineraryActivity f51723c;

    public C20412b(ExternalItineraryActivity externalItineraryActivity, ServerId serverId) {
        this.f51723c = externalItineraryActivity;
        this.f51722b = serverId;
    }

    public final Object doInBackground(Object[] objArr) {
        ServerId[] serverIdArr = (ServerId[]) objArr;
        try {
            ExternalItineraryActivity externalItineraryActivity = this.f51723c;
            ServerId serverId = serverIdArr[0];
            C18299a aVar = MoovitAppApplication.m37038x().f37321e;
            ((C4773f) MoovitAppApplication.m37038x().f37321e.mo50693f("METRO_CONTEXT")).getClass();
            C4773f.m12099s(externalItineraryActivity, serverId, aVar, false, true, false);
            return Boolean.TRUE;
        } catch (ServerException | IOException e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.METRO_SYNC);
        aVar.mo49938f(AnalyticsAttributeKey.SUCCESS, bool);
        this.f51723c.mo44545v2(aVar.mo49933a());
        if (bool.booleanValue()) {
            ExternalItineraryActivity externalItineraryActivity = this.f51723c;
            ServerId serverId = this.f51722b;
            externalItineraryActivity.getClass();
            C5047a aVar2 = new C5047a(serverId, externalItineraryActivity.mo44548x1());
            String O = aVar2.mo20772O();
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            externalItineraryActivity.mo44527k2(O, aVar2, requestOptions, new C20413c(externalItineraryActivity, serverId));
            return;
        }
        this.f51723c.mo45308A2();
    }
}
