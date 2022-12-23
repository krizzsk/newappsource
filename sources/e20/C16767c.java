package e20;

import c00.C13733n;
import com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineAlternative;
import com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLeg;
import com.tranzmate.moovit.protocol.tripplanner.MVWaitToMultiLineLeg;

/* renamed from: e20.c */
public final /* synthetic */ class C16767c implements C13733n {

    /* renamed from: b */
    public final /* synthetic */ MVWaitToMultiLineLeg f43649b;

    public /* synthetic */ C16767c(MVWaitToMultiLineLeg mVWaitToMultiLineLeg) {
        this.f43649b = mVWaitToMultiLineLeg;
    }

    public final Object convert(Object obj) {
        MVWaitToMultiLineLeg mVWaitToMultiLineLeg = this.f43649b;
        MVWaitToLineAlternative mVWaitToLineAlternative = (MVWaitToLineAlternative) obj;
        MVWaitToLineLeg mVWaitToLineLeg = new MVWaitToLineLeg(mVWaitToLineAlternative.time, mVWaitToLineAlternative.waitToLineId, mVWaitToMultiLineLeg.waitAtStopId, mVWaitToMultiLineLeg.departOnStopId, mVWaitToLineAlternative.futureDepartureTimes, mVWaitToLineAlternative.waitOnVehicle, mVWaitToMultiLineLeg.metroId);
        if (mVWaitToLineAlternative.mo34823g()) {
            mVWaitToLineLeg.serviceAlert = mVWaitToLineAlternative.serviceAlert;
        }
        return mVWaitToLineLeg;
    }
}
