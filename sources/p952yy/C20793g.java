package p952yy;

import c00.C13717b;
import c70.C13746a;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.C7923a;
import com.moovit.util.time.StopRealTimeInformation;
import com.tranzmate.moovit.protocol.linearrivals.MVArrival;
import com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalShapeSegment;
import com.tranzmate.moovit.protocol.linearrivals.MVLineArrivals;
import com.tranzmate.moovit.protocol.linearrivals.MVStopArrivalsResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p824tp.C19728f;
import q00.C19047a;
import q00.C19053d;

/* renamed from: yy.g */
public final class C20793g extends C13780t<C20792f, C20793g, MVStopArrivalsResponse> {

    /* renamed from: m */
    public ServerId f52480m = null;

    /* renamed from: n */
    public List<C20787c> f52481n = null;

    public C20793g() {
        super(MVStopArrivalsResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C20792f fVar = (C20792f) aVar;
        List<MVLineArrivals> list = ((MVStopArrivalsResponse) tBase).lineArrivals;
        if (C13717b.m34258e(list)) {
            return null;
        }
        C20786b bVar = fVar.f52479z;
        boolean z = bVar.f52454h;
        boolean z2 = bVar.f52452f;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        for (MVLineArrivals next : list) {
            List<MVArrival> list2 = next.arrivals;
            if (!C13717b.m34258e(list2)) {
                if (z) {
                    for (MVLineArrivalShapeSegment mVLineArrivalShapeSegment : next.shapeSegments) {
                        List<Integer> list3 = mVLineArrivalShapeSegment.shapeSegmentIds;
                        if (list3 != null) {
                            aVar2.f17421h.addAll(list3);
                        }
                    }
                }
                for (MVArrival next2 : list2) {
                    if (z2) {
                        aVar2.f17418e.add(Integer.valueOf(next2.patternId));
                    }
                    if (next2.mo27974h()) {
                        aVar2.f17422i.add(Integer.valueOf(next2.frequencyId));
                    }
                }
            }
        }
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        List<C20787c> list;
        StopRealTimeInformation stopRealTimeInformation;
        C20792f fVar = (C20792f) aVar;
        MVStopArrivalsResponse mVStopArrivalsResponse = (MVStopArrivalsResponse) tBase;
        int i = mVStopArrivalsResponse.stopId;
        this.f52480m = new ServerId(i);
        C19728f fVar2 = fVar.f52476w;
        C19047a aVar2 = fVar.f52477x;
        C20786b bVar = fVar.f52479z;
        ServerId serverId = new ServerId(i);
        Calendar k = C7923a.m18011k(fVar2, mVStopArrivalsResponse.epochDay);
        List<MVLineArrivals> list2 = mVStopArrivalsResponse.lineArrivals;
        if (C13717b.m34258e(list2)) {
            list = Collections.emptyList();
        } else {
            boolean booleanValue = ((Boolean) aVar2.mo51505b(C19053d.f48457I)).booleanValue();
            if (mVStopArrivalsResponse.mo28077i()) {
                stopRealTimeInformation = C7923a.m18005e(mVStopArrivalsResponse.stopRealTimeInfo);
            } else {
                stopRealTimeInformation = null;
            }
            StopRealTimeInformation stopRealTimeInformation2 = stopRealTimeInformation;
            ArrayList arrayList = new ArrayList(list2.size());
            for (MVLineArrivals g : mVStopArrivalsResponse.lineArrivals) {
                arrayList.add(C7923a.m18007g(serverId, k, g, bVar, booleanValue, stopRealTimeInformation2, dVar));
            }
            list = arrayList;
        }
        this.f52481n = list;
    }

    public C20793g(ServerId serverId, List list) {
        super(MVStopArrivalsResponse.class);
        C21100e.m49373x(serverId, "stopId");
        this.f52480m = serverId;
        this.f52481n = list;
    }
}
