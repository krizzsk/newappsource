package p952yy;

import c00.C13717b;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.C7923a;
import com.moovit.util.time.StopRealTimeInformation;
import com.tranzmate.moovit.protocol.linearrivals.MVArrival;
import com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalShapeSegment;
import com.tranzmate.moovit.protocol.linearrivals.MVLineArrivals;
import com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalsResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import org.apache.thrift.TBase;
import p824tp.C19728f;
import q00.C19047a;
import q00.C19053d;

/* renamed from: yy.e */
public final class C20791e extends C13780t<C20789d, C20791e, MVLineArrivalsResponse> {

    /* renamed from: m */
    public C20787c f52474m;

    public C20791e() {
        super(MVLineArrivalsResponse.class);
        this.f52474m = null;
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C20789d dVar = (C20789d) aVar;
        MVLineArrivals mVLineArrivals = ((MVLineArrivalsResponse) tBase).lineArrivals;
        if (mVLineArrivals != null) {
            List<MVArrival> list = mVLineArrivals.arrivals;
            if (!C13717b.m34258e(list)) {
                C20786b bVar = dVar.f52462A;
                boolean z = bVar.f52454h;
                boolean z2 = bVar.f52452f;
                C5269e.C5270a aVar2 = new C5269e.C5270a();
                if (z) {
                    for (MVLineArrivalShapeSegment mVLineArrivalShapeSegment : mVLineArrivals.shapeSegments) {
                        List<Integer> list2 = mVLineArrivalShapeSegment.shapeSegmentIds;
                        if (list2 != null) {
                            aVar2.f17421h.addAll(list2);
                        }
                    }
                }
                for (MVArrival next : list) {
                    if (z2) {
                        aVar2.f17418e.add(Integer.valueOf(next.patternId));
                    }
                    if (next.mo27974h()) {
                        aVar2.f17422i.add(Integer.valueOf(next.frequencyId));
                    }
                }
                return aVar2.mo21074a();
            }
        }
        return null;
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        StopRealTimeInformation stopRealTimeInformation;
        C20789d dVar2 = (C20789d) aVar;
        MVLineArrivalsResponse mVLineArrivalsResponse = (MVLineArrivalsResponse) tBase;
        C19728f fVar = dVar2.f52464w;
        C19047a aVar2 = dVar2.f52465x;
        C20786b bVar = dVar2.f52462A;
        ServerId serverId = new ServerId(mVLineArrivalsResponse.stopId);
        Calendar k = C7923a.m18011k(fVar, mVLineArrivalsResponse.epochDay);
        boolean booleanValue = ((Boolean) aVar2.mo51505b(C19053d.f48457I)).booleanValue();
        if (mVLineArrivalsResponse.mo28059i()) {
            stopRealTimeInformation = C7923a.m18005e(mVLineArrivalsResponse.stopRealTimeInfo);
        } else {
            stopRealTimeInformation = null;
        }
        this.f52474m = C7923a.m18007g(serverId, k, mVLineArrivalsResponse.lineArrivals, bVar, booleanValue, stopRealTimeInformation, dVar);
    }

    public C20791e(C20787c cVar) {
        super(MVLineArrivalsResponse.class);
        this.f52474m = cVar;
    }
}
