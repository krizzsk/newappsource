package p948yu;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.app.navigation.itinerary.ItineraryNavigable;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItineraryMetadata;
import com.moovit.navigation.C4229c;
import com.moovit.navigation.NavigationLeg;
import com.moovit.navigation.RequestedNavigationMode;
import com.moovit.network.model.ServerId;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.checkin.MVShape;
import com.tranzmate.moovit.protocol.navigation.MVNavigationLeg;
import com.tranzmate.moovit.protocol.navigation.MVNavigationLegType;
import com.tranzmate.moovit.protocol.navigation.MVNavigationResponse;
import com.tranzmate.moovit.protocol.reports.MVReportMode;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.apache.thrift.TBase;
import p435de.C16596f;
import p875vs.C20228e;

/* renamed from: yu.c */
public final class C20771c extends C13780t<C20769b, C20771c, MVNavigationResponse> {

    /* renamed from: m */
    public ItineraryNavigable f52412m;

    public C20771c() {
        super(MVNavigationResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C20769b bVar = (C20769b) aVar;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        for (MVNavigationLeg next : ((MVNavigationResponse) tBase).legs) {
            if (next.mo29178g()) {
                aVar2.mo21075b(next.lineId);
            }
            List<MVShape> list = next.shapes;
            if (!C13717b.m34258e(list)) {
                for (MVShape mVShape : list) {
                    List<Integer> list2 = mVShape.shapeStopIds;
                    if (list2 != null) {
                        aVar2.f17414a.addAll(list2);
                    }
                }
            }
        }
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        RequestedNavigationMode requestedNavigationMode;
        ServerId serverId;
        NavigationLeg.Type type;
        C20769b bVar = (C20769b) aVar;
        MVNavigationResponse mVNavigationResponse = (MVNavigationResponse) tBase;
        if (!C13717b.m34258e(mVNavigationResponse.legs)) {
            Itinerary itinerary = bVar.f52411w;
            ItineraryMetadata itineraryMetadata = itinerary.f41895c;
            Itinerary itinerary2 = new Itinerary(itinerary.f41894b, new ItineraryMetadata(itineraryMetadata.f41900b, (ServerId) null, 0, (String) null, (CurrencyAmount) null, false, false, false, itineraryMetadata.f41908j, itineraryMetadata.f41909k, itineraryMetadata.f41910l), itinerary.mo48295u0());
            String str = mVNavigationResponse.navigationGuid;
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            List<MVNavigationLeg> list = mVNavigationResponse.legs;
            int i = 0;
            while (true) {
                ServerId serverId2 = null;
                if (i < list.size()) {
                    MVNavigationLeg mVNavigationLeg = list.get(i);
                    if (mVNavigationLeg.mo29178g()) {
                        serverId = new ServerId(mVNavigationLeg.lineId);
                    } else {
                        serverId = null;
                    }
                    if (mVNavigationLeg.mo29177f()) {
                        serverId2 = new ServerId(mVNavigationLeg.destinationStopId);
                    }
                    ServerId serverId3 = serverId2;
                    MVNavigationLegType mVNavigationLegType = mVNavigationLeg.type;
                    switch (C4229c.C4230a.f15094a[mVNavigationLegType.ordinal()]) {
                        case 1:
                            type = NavigationLeg.Type.TAXI;
                            break;
                        case 2:
                            type = NavigationLeg.Type.TRANSIT;
                            break;
                        case 3:
                            type = NavigationLeg.Type.WAIT;
                            break;
                        case 4:
                            type = NavigationLeg.Type.WALK;
                            break;
                        case 5:
                            type = NavigationLeg.Type.BICYCLE;
                            break;
                        case 6:
                            type = NavigationLeg.Type.DOCKLESS;
                            break;
                        case 7:
                            type = NavigationLeg.Type.CAR;
                            break;
                        default:
                            throw new ApplicationBugException("Unknown navigation leg type: " + mVNavigationLegType);
                    }
                    arrayList.add(C4229c.m11340d(type, i, mVNavigationLeg.shapes, serverId3, serverId, dVar));
                    hashSet.addAll(C4229c.m11341e(dVar, mVNavigationLeg.shapes));
                    i++;
                } else {
                    ArrayList<O> c = C13720d.m34273c(mVNavigationResponse.criticalAreas, (C13722f) null, new C20228e(3));
                    long currentTimeMillis2 = System.currentTimeMillis() + ((long) (mVNavigationResponse.relativeExpirationSeconds * 1000));
                    if (MVReportMode.Always.equals(mVNavigationResponse.reportMode)) {
                        requestedNavigationMode = RequestedNavigationMode.ACCURATE;
                    } else {
                        requestedNavigationMode = RequestedNavigationMode.REGULAR;
                    }
                    ItineraryNavigable itineraryNavigable = new ItineraryNavigable(itinerary2, str, currentTimeMillis, arrayList, hashSet, c, currentTimeMillis2, requestedNavigationMode);
                    this.f52412m = itineraryNavigable;
                    try {
                        C4229c.m11342f(itineraryNavigable);
                        return;
                    } catch (Exception e) {
                        C16596f.m42113a().mo49364c(e);
                        return;
                    }
                }
            }
        } else {
            throw new IOException("Missing navigation legs!");
        }
    }
}
