package p736pu;

import c00.C13721e;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationFareInfo;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.commons.request.BadResponseException;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitStop;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivation;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationStatus;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBFareInfo;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType;
import i30.C5268d;
import p736pu.C19000i;
import p824tp.C19728f;

/* renamed from: pu.h */
public final /* synthetic */ class C18999h implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ C19728f f48346b;

    /* renamed from: c */
    public final /* synthetic */ String f48347c;

    /* renamed from: d */
    public final /* synthetic */ C5268d f48348d;

    public /* synthetic */ C18999h(C19728f fVar, String str, C5268d dVar) {
        this.f48346b = fVar;
        this.f48347c = str;
        this.f48348d = dVar;
    }

    public final Object convert(Object obj) {
        MotActivation.Status status;
        Image image;
        String str;
        DbEntityRef<TransitAgency> dbEntityRef;
        MotActivation.ActivationType activationType;
        MotActivationPrice motActivationPrice;
        MotActivationFareInfo motActivationFareInfo;
        MotActivation.ActivationType activationType2;
        MotActivationPrice motActivationPrice2;
        MotActivationStationInfo motActivationStationInfo;
        long j;
        DbEntityRef<TransitStop> dbEntityRef2;
        C19728f fVar = this.f48346b;
        String str2 = this.f48347c;
        C5268d dVar = this.f48348d;
        MVPTBActivation mVPTBActivation = (MVPTBActivation) obj;
        ServerId serverId = new ServerId(mVPTBActivation.activationId);
        String str3 = mVPTBActivation.activationTitle;
        String str4 = mVPTBActivation.profileName;
        String str5 = mVPTBActivation.agencyName;
        MVPTBActivationStatus mVPTBActivationStatus = mVPTBActivation.ticketStatus;
        int i = C19000i.C19001a.f48349a[mVPTBActivationStatus.ordinal()];
        if (i == 1) {
            status = MotActivation.Status.ACTIVE;
        } else if (i == 2) {
            status = MotActivation.Status.COMPLETED;
        } else if (i == 3) {
            status = MotActivation.Status.HISTORICAL;
        } else {
            throw new IllegalStateException("Unknown activation status: " + mVPTBActivationStatus);
        }
        if (mVPTBActivation.mo30816m()) {
            image = C16028g.m40829g(mVPTBActivation.backgroundImage);
        } else {
            image = null;
        }
        if (mVPTBActivation.mo30821s()) {
            str = mVPTBActivation.qrCode;
        } else {
            str = null;
        }
        TransitAgency transitAgency = (TransitAgency) fVar.f50167c.get(new ServerId(mVPTBActivation.agencyId));
        if (transitAgency != null) {
            dbEntityRef = DbEntityRef.newAgencyRef(transitAgency);
        } else {
            dbEntityRef = null;
        }
        MVPTBTransitType mVPTBTransitType = mVPTBActivation.transitType;
        switch (C19000i.C19001a.f48350b[mVPTBTransitType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                activationType = MotActivation.ActivationType.DEPARTURE;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                activationType = MotActivation.ActivationType.ENTRANCE_ONLY;
                break;
            case 9:
                activationType = MotActivation.ActivationType.ENTRANCE_AND_EXIT;
                break;
            default:
                throw new IllegalStateException("Unknown transit type: " + mVPTBTransitType);
        }
        if (mVPTBActivation.mo30810h()) {
            motActivationPrice = C19000i.m46111b(mVPTBActivation.activationPrice);
        } else {
            motActivationPrice = null;
        }
        if (mVPTBActivation.mo30818p() || !mVPTBActivation.mo30817o()) {
            motActivationFareInfo = null;
        } else {
            MVPTBFareInfo mVPTBFareInfo = mVPTBActivation.fareInfo;
            motActivationFareInfo = new MotActivationFareInfo(mVPTBFareInfo.radius, new ServerId(mVPTBFareInfo.fareCode));
        }
        if (mVPTBActivation.mo30818p()) {
            ServerId serverId2 = new ServerId(mVPTBActivation.fromStopId);
            DbEntityRef<TransitStop> newTransitStopRef = DbEntityRef.newTransitStopRef(serverId2);
            TransitStop c = dVar.mo21064c(serverId2);
            if (c != null) {
                newTransitStopRef.resolveTo(c);
            }
            if (mVPTBActivation.mo30824u()) {
                motActivationPrice2 = motActivationPrice;
                ServerId serverId3 = new ServerId(mVPTBActivation.toStopId);
                dbEntityRef2 = DbEntityRef.newTransitStopRef(serverId3);
                TransitStop c2 = dVar.mo21064c(serverId3);
                if (c2 != null) {
                    dbEntityRef2.resolveTo(c2);
                }
            } else {
                motActivationPrice2 = motActivationPrice;
                dbEntityRef2 = null;
            }
            motActivationStationInfo = new MotActivationStationInfo(newTransitStopRef, dbEntityRef2);
            activationType2 = activationType;
        } else {
            motActivationPrice2 = motActivationPrice;
            activationType2 = activationType;
            motActivationStationInfo = null;
        }
        long j2 = mVPTBActivation.activationTime;
        boolean z = mVPTBActivation.isAnonymous;
        if (mVPTBActivation.mo30808f()) {
            j = mVPTBActivation.activationCompletionTime;
        } else {
            j = -1;
        }
        long j3 = j;
        if (motActivationFareInfo == null && motActivationStationInfo == null) {
            throw new BadResponseException("Only one fareInfo/stationInfo must be none null!");
        }
        return new MotActivation(serverId, str3, str4, str5, str2, status, image, str, dbEntityRef, activationType2, motActivationPrice2, motActivationFareInfo, motActivationStationInfo, j2, j3, z);
    }
}
