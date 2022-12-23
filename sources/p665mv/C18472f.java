package p665mv;

import android.os.Bundle;
import ce0.C21100e;
import com.moovit.app.ridesharing.RideSharingCenterActivity;
import com.moovit.ridesharing.model.EventRequest;
import p806sv.C19562a;
import p977zz.C20935e;

/* renamed from: mv.f */
public final /* synthetic */ class C18472f implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ RideSharingCenterActivity f47075b;

    public /* synthetic */ C18472f(RideSharingCenterActivity rideSharingCenterActivity) {
        this.f47075b = rideSharingCenterActivity;
    }

    public final void invoke(Object obj) {
        RideSharingCenterActivity rideSharingCenterActivity = this.f47075b;
        EventRequest eventRequest = (EventRequest) obj;
        int i = RideSharingCenterActivity.f39304Z;
        rideSharingCenterActivity.getClass();
        String str = C19562a.f49725p;
        Bundle bundle = new Bundle();
        C21100e.m49373x(eventRequest, "eventRequest");
        bundle.putParcelable("eventRequest", eventRequest);
        int i2 = eventRequest.f42958h;
        C21100e.m49375y(1, Integer.MAX_VALUE, "ticketsAmount", i2);
        bundle.putInt("ticketsAmount", i2);
        C19562a aVar = new C19562a();
        aVar.setArguments(bundle);
        aVar.show(rideSharingCenterActivity.getSupportFragmentManager(), C19562a.f49725p);
    }
}
