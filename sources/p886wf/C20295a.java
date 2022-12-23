package p886wf;

import aa0.C7553r;
import ce0.C21100e;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import org.apache.thrift.TBase;
import p693nz.C18648a;
import w50.C20283g;

/* renamed from: wf.a */
public final /* synthetic */ class C20295a implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f51456b;

    /* renamed from: c */
    public final /* synthetic */ Object f51457c;

    /* renamed from: d */
    public final /* synthetic */ Object f51458d;

    public /* synthetic */ C20295a(int i, Object obj, Object obj2) {
        this.f51456b = i;
        this.f51457c = obj;
        this.f51458d = obj2;
    }

    public final Object call() {
        TBase tBase = null;
        switch (this.f51456b) {
            case 0:
                C20299d dVar = (C20299d) this.f51458d;
                C20303h hVar = ((C20297c) this.f51457c).f51465b;
                synchronized (hVar) {
                    FileOutputStream openFileOutput = hVar.f51487a.openFileOutput(hVar.f51488b, 0);
                    try {
                        openFileOutput.write(dVar.toString().getBytes("UTF-8"));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
            case 1:
                ItineraryActivity itineraryActivity = (ItineraryActivity) this.f51457c;
                String str = (String) this.f51458d;
                int i = ItineraryActivity.f38474B0;
                itineraryActivity.getClass();
                if (str == null) {
                    return null;
                }
                C7553r rVar = C7553r.f23033b;
                Class<MVTripPlanRequest> cls = MVTripPlanRequest.class;
                rVar.getClass();
                C21100e.m49355o();
                try {
                    C18648a aVar = (C18648a) rVar.mo23811a(itineraryActivity).get(str);
                    if (aVar != null) {
                        tBase = C21100e.m49324S(cls, aVar.f47516a);
                    }
                } catch (Exception unused) {
                }
                return (MVTripPlanRequest) tBase;
            default:
                return C20283g.m47845b((PaymentOptions) this.f51457c, (PaymentSummaryInfo) this.f51458d);
        }
    }
}
