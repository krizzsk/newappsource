package p737pv;

import android.content.Context;
import android.content.Intent;
import c70.C13746a;
import c70.C13780t;
import com.moovit.app.ridesharing.EventsProvider;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEventResponse;
import d70.C16536a;
import java.io.IOException;
import org.apache.thrift.TBase;
import p130j2.C5367a;

/* renamed from: pv.b */
public final class C19011b extends C13780t<C19010a, C19011b, MVPassengerBookEventResponse> {

    /* renamed from: m */
    public RideSharingRegistrationSteps f48366m = null;

    public C19011b() {
        super(MVPassengerBookEventResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19010a aVar2 = (C19010a) aVar;
        MVPassengerBookEventResponse mVPassengerBookEventResponse = (MVPassengerBookEventResponse) tBase;
        if (mVPassengerBookEventResponse.mo31182f()) {
            this.f48366m = C16536a.m42036h(mVPassengerBookEventResponse.steps);
        }
        if (this.f48366m == null) {
            Context context = this.f51773b.f51759b;
            EventsProvider eventsProvider = EventsProvider.f39286k;
            C5367a.m13473a(context).mo21147c(new Intent("com.moovit.events_provider.action.book"));
        }
    }
}
