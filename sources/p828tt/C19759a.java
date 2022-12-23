package p828tt;

import c00.C13719c;
import c00.C13720d;
import c00.C13721e;
import c00.C13722f;
import c70.C13749c;
import com.moovit.app.animation.Animation;
import com.moovit.app.animation.AnimationFormat;
import com.moovit.app.reports.data.UserReportFeedback;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.Color;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImagePack;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.ItinerarySection;
import com.moovit.itinerary.model.ItinerarySectionBranding;
import com.moovit.metro.ReportCategoryType;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.providers.TicketingEngine;
import com.moovit.ticketing.purchase.station.PurchaseStation;
import com.moovit.transit.C7841a;
import com.moovit.transit.Shape;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.moovit.util.time.StopRealTimeCongestion;
import com.moovit.util.time.Time;
import com.tranzmate.moovit.protocol.Reports4_0.MVReportCreationData;
import com.tranzmate.moovit.protocol.Reports4_0.MVUserReport;
import com.tranzmate.moovit.protocol.common.MVImagePackReferenceWithParams;
import com.tranzmate.moovit.protocol.common.MVUserReportCategoryType;
import com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType;
import com.tranzmate.moovit.protocol.gtfs.MVTripShape;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRide;
import com.tranzmate.moovit.protocol.payments.MVProfileSpec;
import com.tranzmate.moovit.protocol.subscriptions.MVSubscription;
import com.tranzmate.moovit.protocol.taxi.MVTaxiAnimation;
import com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessages;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketClinetEngine;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyConfig;
import com.tranzmate.moovit.protocol.tripplanner.MVSectionSortType;
import com.tranzmate.moovit.protocol.tripplanner.MVSectionType;
import com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSection;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionBranding;
import com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction;
import com.tranzmate.moovit.protocol.users.MVNotificationPayload;
import f10.C16936g;
import h60.C17353s0;
import java.util.Collections;
import java.util.HashMap;
import k40.C5479c;
import n10.C18505b;
import p500fv.C17090o;
import p525gw.C17246a;
import p548hv.C17498a;
import p548hv.C17502d;
import p594jv.C17935f;
import p634ln.C18247a;
import p810sz.C19617r;
import q80.C13036y;
import t30.C6565g;
import t30.C6569j;

/* renamed from: tt.a */
public final /* synthetic */ class C19759a implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f50238b;

    public /* synthetic */ C19759a(int i) {
        this.f50238b = i;
    }

    public final Object convert(Object obj) {
        boolean z;
        ReportCategoryType reportCategoryType;
        UserReportFeedback userReportFeedback;
        ItinerarySection.Type type;
        TripPlannerSortType tripPlannerSortType;
        byte b;
        ItinerarySectionBranding itinerarySectionBranding;
        ImagePack imagePack;
        TripPlannerSortType tripPlannerSortType2;
        Image image = null;
        switch (this.f50238b) {
            case 0:
                return ((TripPlannerTransportTypeInfo) obj).f23802b;
            case 1:
                return Long.valueOf(((Time) obj).mo24631g());
            case 2:
                return Polylon.m40195m((String) obj);
            case 3:
                MVUserReport mVUserReport = (MVUserReport) obj;
                String str = mVUserReport.reportId;
                MVReportCreationData mVReportCreationData = mVUserReport.creationData;
                MVUserReportCategoryType mVUserReportCategoryType = mVReportCreationData.categoryUnionType;
                C13719c cVar = C7841a.f23766a;
                F f = mVUserReportCategoryType.setField_;
                boolean z2 = false;
                if (f == MVUserReportCategoryType._Fields.STOP_CATEOGRY) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    reportCategoryType = C7841a.m17870h(mVUserReportCategoryType.mo26437n());
                } else {
                    if (f == MVUserReportCategoryType._Fields.LINE_CATEGORY) {
                        z2 = true;
                    }
                    if (z2) {
                        reportCategoryType = C7841a.m17865c(mVUserReportCategoryType.mo26436m());
                    } else {
                        throw new IllegalStateException("Unknown user report type: " + mVUserReportCategoryType);
                    }
                }
                C17498a aVar = new C17498a(C17090o.m43019c().mo49689d(reportCategoryType), mVReportCreationData.index, mVReportCreationData.text, mVReportCreationData.reportLocationName, mVReportCreationData.creationTime);
                int i = mVUserReport.likesCount;
                int i2 = mVUserReport.dislikeCount;
                boolean z3 = mVUserReport.isOwner;
                String str2 = mVUserReport.userNickName;
                int i3 = C17935f.C17936a.f45998a[mVUserReport.userFeedback.ordinal()];
                if (i3 == 1) {
                    userReportFeedback = UserReportFeedback.NONE;
                } else if (i3 == 2) {
                    userReportFeedback = UserReportFeedback.LIKE;
                } else if (i3 == 3) {
                    userReportFeedback = UserReportFeedback.DISLIKE;
                } else {
                    throw new IllegalStateException("couldn't match correct MVReportUserFeedback");
                }
                return new C17502d(str, aVar, i, i2, z3, str2, userReportFeedback);
            case 4:
                return new C17246a(((MVSubscription) obj).storeProudct.mo31823m().sku);
            case 5:
                return new Animation(AnimationFormat.LOTTIE, ((MVTaxiAnimation) obj).fileName);
            case 6:
                HashMap hashMap = new HashMap();
                C16936g.m42771g((MVNotificationPayload) obj, hashMap);
                return C16936g.m42768d(C16936g.m42766b(hashMap), hashMap);
            case 7:
                MVTripPlanSection mVTripPlanSection = (MVTripPlanSection) obj;
                C19617r rVar = C16080a.f41870a;
                ServerId serverId = new ServerId(mVTripPlanSection.sectionId);
                MVSectionType mVSectionType = mVTripPlanSection.sectionType;
                if (mVSectionType != null) {
                    switch (C16080a.C16081a.f41880j[mVSectionType.ordinal()]) {
                        case 1:
                        case 2:
                            type = ItinerarySection.Type.GO_GREEN;
                            break;
                        case 3:
                            type = ItinerarySection.Type.CARPOOL;
                            break;
                        case 4:
                            type = ItinerarySection.Type.BICYCLE;
                            break;
                        case 5:
                            type = ItinerarySection.Type.BICYCLE_RENTAL;
                            break;
                        case 6:
                            type = ItinerarySection.Type.EVENTS;
                            break;
                        case 7:
                            type = ItinerarySection.Type.NO_GROUPING;
                            break;
                        default:
                            type = ItinerarySection.Type.UNSPECIFIED;
                            break;
                    }
                } else {
                    type = ItinerarySection.Type.UNSPECIFIED;
                }
                ItinerarySection.Type type2 = type;
                if (mVTripPlanSection.mo34708k()) {
                    MVSectionSortType mVSectionSortType = mVTripPlanSection.sortType;
                    switch (C16080a.C16081a.f41879i[mVSectionSortType.ordinal()]) {
                        case 1:
                            tripPlannerSortType2 = TripPlannerSortType.NO_CLIENT_SORTING;
                            break;
                        case 2:
                            tripPlannerSortType2 = TripPlannerSortType.PRICE;
                            break;
                        case 3:
                            tripPlannerSortType2 = TripPlannerSortType.DURATION;
                            break;
                        case 4:
                            tripPlannerSortType2 = TripPlannerSortType.EMISSION;
                            break;
                        case 5:
                            tripPlannerSortType2 = TripPlannerSortType.LEAST_WALKING;
                            break;
                        case 6:
                            tripPlannerSortType2 = TripPlannerSortType.LEAST_TRANSFERS;
                            break;
                        case 7:
                            tripPlannerSortType2 = TripPlannerSortType.EARLIEST_DEPARTURE;
                            break;
                        case 8:
                            tripPlannerSortType2 = TripPlannerSortType.EARLIEST_ARRIVAL;
                            break;
                        default:
                            throw new ApplicationBugException("Unknown section sort type: " + mVSectionSortType);
                    }
                    tripPlannerSortType = tripPlannerSortType2;
                } else {
                    tripPlannerSortType = null;
                }
                String str3 = mVTripPlanSection.name;
                if (mVTripPlanSection.mo34703g()) {
                    b = mVTripPlanSection.maxItemsToDisplay;
                } else {
                    b = 2147483647;
                }
                if (mVTripPlanSection.mo34702f()) {
                    MVTripPlanSectionBranding mVTripPlanSectionBranding = mVTripPlanSection.branding;
                    Color m = C13749c.m34327m(mVTripPlanSectionBranding.bgColor);
                    Color m2 = C13749c.m34327m(mVTripPlanSectionBranding.nameColor);
                    if (mVTripPlanSectionBranding.mo34716f()) {
                        MVImagePackReferenceWithParams mVImagePackReferenceWithParams = mVTripPlanSectionBranding.backdropImage;
                        imagePack = new ImagePack(C16028g.m40829g(mVImagePackReferenceWithParams.rtl), C16028g.m40829g(mVImagePackReferenceWithParams.ltr));
                    } else {
                        imagePack = null;
                    }
                    if (mVTripPlanSectionBranding.mo34718h()) {
                        image = C16028g.m40829g(mVTripPlanSectionBranding.logo);
                    }
                    itinerarySectionBranding = new ItinerarySectionBranding(m, m2, imagePack, image);
                } else {
                    itinerarySectionBranding = null;
                }
                return new ItinerarySection(serverId, type2, tripPlannerSortType, str3, b, false, itinerarySectionBranding);
            case 8:
                return Integer.valueOf(C5479c.m13666c((DbEntityRef) obj));
            case 9:
                return C16080a.m40946b((MVWalkingInstruction) obj);
            case 10:
                return ((MVTaxiLegCustomDeepLinkParameter) obj).value;
            case 11:
                return C16080a.m40969y((TripPlannerTransportType) obj);
            case 12:
                return Integer.valueOf(((ServerId) obj).f15142b);
            case 13:
                MVTripShape mVTripShape = (MVTripShape) obj;
                C13719c cVar2 = C7841a.f23766a;
                return new Shape(new ServerId(mVTripShape.shapeId), Polylon.m40195m(mVTripShape.encodedShape));
            case 14:
                return C6565g.m15497a((MVMicroMobilityIntegrationFlow) obj);
            case 15:
                return C6569j.m15501b((MVMicroMobilityRide) obj);
            case 16:
                return C17353s0.m43399m((MVProfileSpec) obj, Collections.emptyMap());
            case 17:
                TicketingEngine ticketingEngine = (TicketingEngine) obj;
                C19617r rVar2 = C13036y.f32248a;
                int i4 = C13036y.C13037a.f32249a[ticketingEngine.ordinal()];
                if (i4 == 1) {
                    return MVTicketClinetEngine.MASABI;
                }
                if (i4 == 2) {
                    return MVTicketClinetEngine.XIMEDES;
                }
                throw new IllegalStateException("Unknown ticketing engine: " + ticketingEngine);
            case 18:
                C19617r rVar3 = C13036y.f32248a;
                return new ServerId(((MVTicketingAgencyConfig) obj).providerId);
            case 19:
                return C13720d.m34273c(((MVAgencyMessages) obj).messages, (C13722f) null, new C18505b(6));
            case 20:
                C18247a aVar2 = (C18247a) obj;
                return new PurchaseStation((Image) null, Integer.toString(aVar2.f46552a.intValue()), aVar2.f46553b);
            case 21:
                return C7841a.m17870h((MVUserReportStopCategoryType) obj);
            case 22:
                return new ServerId(((Integer) obj).intValue());
            default:
                return (StopRealTimeCongestion) obj;
        }
    }
}
