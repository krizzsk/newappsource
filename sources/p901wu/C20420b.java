package p901wu;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.app.navigation.checkin.Checkin;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.navigation.C4229c;
import com.moovit.navigation.NavigationLeg;
import com.moovit.navigation.RequestedNavigationMode;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.tranzmate.moovit.protocol.checkin.MVCheckin;
import com.tranzmate.moovit.protocol.checkin.MVCheckinResponse;
import com.tranzmate.moovit.protocol.checkin.MVShape;
import com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary;
import com.tranzmate.moovit.protocol.gtfs.MVStopMetaData;
import com.tranzmate.moovit.protocol.gtfs.MVSupplementalData;
import com.tranzmate.moovit.protocol.reports.MVReportMode;
import i30.C5268d;
import i30.C5269e;
import i30.C5276j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.apache.thrift.TBase;
import p066e0.C4454r0;
import p435de.C16596f;
import p543hq.C17478e;
import p828tt.C19759a;

/* renamed from: wu.b */
public final class C20420b extends C13780t<C20419a, C20420b, MVCheckinResponse> {

    /* renamed from: m */
    public Checkin f51737m;

    public C20420b() {
        super(MVCheckinResponse.class);
    }

    /* renamed from: h */
    public final C5276j mo40707h(C13746a aVar, TBase tBase) {
        Set set;
        Set set2;
        Set set3;
        C20419a aVar2 = (C20419a) aVar;
        MVSupplementalData mVSupplementalData = ((MVCheckinResponse) tBase).supplementalData;
        if (mVSupplementalData == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<MVLineGroupSummary> list = mVSupplementalData.lineGroupSummaryList;
        if (list != null) {
            arrayList2.addAll(list);
        }
        List<MVStopMetaData> list2 = mVSupplementalData.mVStopSyncedMetaDataList;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        boolean isEmpty = arrayList.isEmpty();
        boolean isEmpty2 = arrayList2.isEmpty();
        boolean isEmpty3 = arrayList3.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty3) {
            return null;
        }
        if (isEmpty) {
            set = Collections.emptySet();
        } else {
            set = C13720d.m34277g(arrayList, (C13722f) null, new C4454r0(14));
        }
        if (isEmpty2) {
            set2 = Collections.emptySet();
        } else {
            set2 = C13720d.m34277g(arrayList2, (C13722f) null, new C17478e(13));
        }
        if (isEmpty3) {
            set3 = Collections.emptySet();
        } else {
            set3 = C13720d.m34277g(arrayList3, (C13722f) null, new C19759a(13));
        }
        return new C5276j(set, set2, set3);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C20419a aVar2 = (C20419a) aVar;
        List<MVShape> list = ((MVCheckinResponse) tBase).checkin.shapes;
        if (C13717b.m34258e(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MVShape mVShape : list) {
            arrayList.addAll(mVShape.shapeStopIds);
        }
        C5269e.C5270a aVar3 = new C5269e.C5270a();
        aVar3.mo21075b(aVar2.f51733w.f15142b);
        aVar3.f17414a.addAll(arrayList);
        return aVar3.mo21074a();
    }

    /* renamed from: j */
    public final C5269e mo40709j(C13746a aVar, TBase tBase) {
        C20419a aVar2 = (C20419a) aVar;
        MVSupplementalData mVSupplementalData = ((MVCheckinResponse) tBase).supplementalData;
        if (mVSupplementalData == null) {
            return null;
        }
        C5269e.C5270a aVar3 = new C5269e.C5270a();
        List<MVLineGroupSummary> list = mVSupplementalData.lineGroupSummaryList;
        if (list != null) {
            for (MVLineGroupSummary next : list) {
                if (next != null) {
                    aVar3.f17416c.add(Integer.valueOf(next.groupId));
                }
            }
        }
        List<MVStopMetaData> list2 = mVSupplementalData.mVStopSyncedMetaDataList;
        if (list2 != null) {
            for (MVStopMetaData mVStopMetaData : list2) {
                aVar3.mo21076c(mVStopMetaData.stopId);
            }
        }
        return aVar3.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        RequestedNavigationMode requestedNavigationMode;
        boolean z;
        C5268d dVar2 = dVar;
        MVCheckin mVCheckin = ((MVCheckinResponse) tBase).checkin;
        ServerId serverId = ((C20419a) aVar).f51733w;
        C16596f a = C16596f.m42113a();
        StringBuilder k = C13555b.m33972k("Decoding checkin guid: ");
        k.append(mVCheckin.guid);
        a.mo49363b(k.toString());
        List<MVShape> list = mVCheckin.shapes;
        if (!C13717b.m34258e(list)) {
            TransitLine b = dVar2.mo21063b(serverId);
            if (b != null) {
                list.size();
                NavigationLeg d = C4229c.m11340d(NavigationLeg.Type.TRANSIT, 0, list, new ServerId(mVCheckin.destinationStopId), serverId, dVar);
                Collection e = C4229c.m11341e(dVar2, list);
                String str = mVCheckin.guid;
                long currentTimeMillis = System.currentTimeMillis();
                long currentTimeMillis2 = System.currentTimeMillis() + ((long) (mVCheckin.nextRefreshSecs * 1000));
                long currentTimeMillis3 = System.currentTimeMillis() + ((long) (mVCheckin.relativeExpirationSeconds * 1000));
                boolean z2 = mVCheckin.reliableStartingPoint;
                if (MVReportMode.Always.equals(mVCheckin.reportMode)) {
                    requestedNavigationMode = RequestedNavigationMode.ACCURATE;
                } else {
                    requestedNavigationMode = RequestedNavigationMode.REGULAR;
                }
                RequestedNavigationMode requestedNavigationMode2 = requestedNavigationMode;
                MVReportMode mVReportMode = mVCheckin.reportMode;
                if (mVReportMode == null || MVReportMode.None.equals(mVReportMode)) {
                    z = false;
                } else {
                    z = true;
                }
                this.f51737m = new Checkin(str, b, currentTimeMillis, currentTimeMillis2, currentTimeMillis3, d, C13720d.m34273c(mVCheckin.criticalAreas, (C13722f) null, new C17478e(1)), e, z2, requestedNavigationMode2, z);
                return;
            }
            throw new BadResponseException("transit line (" + serverId + ") may not be null!");
        }
        throw new BadResponseException("MVCheckinResponse.shapes may not be null or empty!");
    }
}
