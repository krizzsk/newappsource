package p737pv;

import android.content.Context;
import android.content.Intent;
import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.app.ridesharing.EventsProvider;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelEventResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p130j2.C5367a;

/* renamed from: pv.j */
public final class C19019j extends C13780t<C19018i, C19019j, MVPassengerCancelEventResponse> {

    /* renamed from: m */
    public CurrencyAmount f48381m = null;

    public C19019j() {
        super(MVPassengerCancelEventResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        CurrencyAmount currencyAmount;
        C19018i iVar = (C19018i) aVar;
        MVPassengerCancelEventResponse mVPassengerCancelEventResponse = (MVPassengerCancelEventResponse) tBase;
        if (mVPassengerCancelEventResponse.mo31198f()) {
            currencyAmount = C13749c.m34318d(mVPassengerCancelEventResponse.fee);
        } else {
            currencyAmount = null;
        }
        this.f48381m = currencyAmount;
        if (currencyAmount == null) {
            Context context = this.f51773b.f51759b;
            EventsProvider eventsProvider = EventsProvider.f39286k;
            C5367a.m13473a(context).mo21147c(new Intent("com.moovit.events_provider.action.cancel"));
        }
    }
}
