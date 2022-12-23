package p054d0;

import android.net.Uri;
import c00.C13719c;
import c00.C13720d;
import c00.C13721e;
import c00.C13722f;
import c70.C13749c;
import com.moovit.app.mot.model.MotActivationRegion;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.tod.bookingflow.model.TodZoneShape;
import com.moovit.app.wondo.tickets.codes.C15648a;
import com.moovit.app.wondo.tickets.model.WondoCode;
import com.moovit.app.wondo.tickets.model.WondoCodeDisplayInfo;
import com.moovit.commons.geo.Polylon;
import com.moovit.image.model.UriImage;
import com.moovit.matrolanguage.MetroLanguage;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount;
import com.moovit.transit.C7841a;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVDayOfWeek;
import com.tranzmate.moovit.protocol.common.MVDirection;
import com.tranzmate.moovit.protocol.gtfs.MVMetroLanguage;
import com.tranzmate.moovit.protocol.metrics.MVNetworkMetrics;
import com.tranzmate.moovit.protocol.payments.MVInputField;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegion;
import com.tranzmate.moovit.protocol.subscriptions.MVGooglePaymentData;
import com.tranzmate.moovit.protocol.subscriptions.MVStorePaymentData;
import com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueAmount;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatusInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneShape;
import com.tranzmate.moovit.protocol.users.MVStaticLineMap;
import com.tranzmate.moovit.protocol.wondo.MVWondoCode;
import d70.C16536a;
import f30.C4678e;
import h60.C17353s0;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import m30.C5679b;
import m30.C5682e;
import n30.C5851d;
import p227r.C6227a;
import p269u2.C6678b;
import p525gw.C17247b;
import p547hu.C17493b;
import p547hu.C17496e;
import p549hw.C17509g;
import p779rs.C19324a;
import p810sz.C19617r;
import p828tt.C19759a;
import p977zz.C20949l;
import p977zz.C20952m0;
import p988j$.time.DayOfWeek;
import q80.C13036y;

/* renamed from: d0.q */
public final /* synthetic */ class C4303q implements C6227a, C13721e, C20949l {

    /* renamed from: b */
    public final /* synthetic */ int f15231b;

    public /* synthetic */ C4303q(int i) {
        this.f15231b = i;
    }

    public Object apply(Object obj) {
        switch (this.f15231b) {
            case 0:
                List list = (List) obj;
                return null;
            default:
                return Boolean.valueOf(((C6678b) obj).isWriteAheadLoggingEnabled());
        }
    }

    public Object convert(Object obj) {
        int i = 2;
        String str = null;
        switch (this.f15231b) {
            case 0:
                return ((TripPlannerTransportTypeInfo) obj).f23802b;
            case 1:
                MVStaticLineMap mVStaticLineMap = (MVStaticLineMap) obj;
                return new C19324a(new ServerId(mVStaticLineMap.mapId), mVStaticLineMap.caption, mVStaticLineMap.url, mVStaticLineMap.lastUpdated, -1, -1);
            case 2:
                return Integer.valueOf(((ServerId) obj).f15142b);
            case 3:
                int i2 = C17496e.f45040j;
                return ((C17493b) obj).f45032d;
            case 4:
                MVPTBRegion mVPTBRegion = (MVPTBRegion) obj;
                return new MotActivationRegion(new ServerId(mVPTBRegion.regionId), mVPTBRegion.name, C13720d.m34273c(mVPTBRegion.polygons, (C13722f) null, new C19759a(2)));
            case 5:
                HashSet hashSet = MoovitSubscriptionsManager.f39757g;
                return ((C17247b) obj).f44574a.f44573a;
            case 6:
                MVGooglePaymentData mVGooglePaymentData = (MVGooglePaymentData) obj;
                int i3 = C17509g.f45077w;
                MVStorePaymentData mVStorePaymentData = new MVStorePaymentData();
                mVGooglePaymentData.getClass();
                mVStorePaymentData.setField_ = MVStorePaymentData._Fields.GOOGLE;
                mVStorePaymentData.value_ = mVGooglePaymentData;
                return mVStorePaymentData;
            case 7:
                MVTodZoneShape mVTodZoneShape = (MVTodZoneShape) obj;
                return new TodZoneShape(mVTodZoneShape.shapeId, Polylon.m40195m(mVTodZoneShape.polyline));
            case 8:
                DayOfWeek dayOfWeek = (DayOfWeek) obj;
                C20952m0<Integer> m0Var = C13749c.f33838a;
                switch (C13749c.C13750a.f33850l[dayOfWeek.ordinal()]) {
                    case 1:
                        return MVDayOfWeek.SUNDAY;
                    case 2:
                        return MVDayOfWeek.MONDAY;
                    case 3:
                        return MVDayOfWeek.TUESDAY;
                    case 4:
                        return MVDayOfWeek.WEDNESDAY;
                    case 5:
                        return MVDayOfWeek.THURSDAY;
                    case 6:
                        return MVDayOfWeek.FRIDAY;
                    case 7:
                        return MVDayOfWeek.SATURDAY;
                    default:
                        throw new IllegalStateException("Unknown day of week type: " + dayOfWeek);
                }
            case 9:
                return new ServerId(((Integer) obj).intValue());
            case 10:
                WondoCode wondoCode = (WondoCode) obj;
                if (!wondoCode.f40700f) {
                    i = 1;
                }
                return new C15648a.C15650b(i, wondoCode);
            case 11:
                MVWondoCode mVWondoCode = (MVWondoCode) obj;
                return new WondoCode(new ServerId(mVWondoCode.codeId), mVWondoCode.code, new WondoCodeDisplayInfo(mVWondoCode.providerName, UriImage.m40912c(mVWondoCode.iconProviderUrl, new String[0]), UriImage.m40912c(mVWondoCode.iconUrl, new String[0]), mVWondoCode.previewDescription, mVWondoCode.title, mVWondoCode.codeDescription, mVWondoCode.availabilityText, mVWondoCode.experationText, Uri.parse(mVWondoCode.legalUrl)), mVWondoCode.isAvailable, mVWondoCode.isExpired);
            case 12:
                return new ServerId(((Integer) obj).intValue());
            case 13:
                return new ServerId(((Integer) obj).intValue());
            case 14:
                MVMetroLanguage mVMetroLanguage = (MVMetroLanguage) obj;
                C13719c cVar = C7841a.f23766a;
                String str2 = mVMetroLanguage.name;
                if (!mVMetroLanguage.isDefault) {
                    str = mVMetroLanguage.key;
                }
                return new MetroLanguage(str2, str);
            case 15:
                C4678e eVar = (C4678e) obj;
                int i4 = eVar.f15927a;
                String str3 = eVar.f15928b;
                int i5 = eVar.f15929c;
                String str4 = eVar.f15930d;
                boolean z = eVar.f15931e;
                boolean z2 = eVar.f15932f;
                boolean z3 = eVar.f15933g;
                boolean z4 = eVar.f15934h;
                MVNetworkMetrics mVNetworkMetrics = new MVNetworkMetrics();
                mVNetworkMetrics.typeId = i4;
                mVNetworkMetrics.mo28524w();
                mVNetworkMetrics.typeName = str3;
                mVNetworkMetrics.subtypeId = i5;
                mVNetworkMetrics.mo28523v();
                mVNetworkMetrics.subtypeName = str4;
                mVNetworkMetrics.isAvailable = z;
                mVNetworkMetrics.mo28518r();
                mVNetworkMetrics.isConnected = z2;
                mVNetworkMetrics.mo28519s();
                mVNetworkMetrics.isFailover = z3;
                mVNetworkMetrics.mo28520t();
                mVNetworkMetrics.isRoaming = z4;
                mVNetworkMetrics.mo28522u();
                int i6 = eVar.f15935i;
                if (i6 != -1) {
                    mVNetworkMetrics.downstreamBandwidth = i6;
                    mVNetworkMetrics.mo28517q();
                }
                int i7 = eVar.f15936j;
                if (i7 != -1) {
                    mVNetworkMetrics.upstreamBandwidth = i7;
                    mVNetworkMetrics.mo28525y();
                }
                return mVNetworkMetrics;
            case 16:
                return new ServerId(((Integer) obj).intValue());
            case 17:
                return C13749c.m34321g((MVInputField) obj);
            case 18:
                return Collections.unmodifiableList((List) obj);
            case 19:
                return C17353s0.m43396j((MVPaymentMethodInfo) obj);
            case 20:
                return Integer.valueOf(C16536a.m42030b((MVDirection) obj));
            case 21:
                return ((LocationDescriptor) obj).f23649d;
            case 22:
                MVTicketStatusInfo mVTicketStatusInfo = (MVTicketStatusInfo) obj;
                if (mVTicketStatusInfo.mo33132g()) {
                    return C13036y.m32955g(mVTicketStatusInfo.ticketStatus);
                }
                return null;
            case 23:
                MVStoredValueAmount mVStoredValueAmount = (MVStoredValueAmount) obj;
                C19617r rVar = C13036y.f32248a;
                CurrencyAmount d = C13749c.m34318d(mVStoredValueAmount.amount);
                String str5 = mVStoredValueAmount.name;
                if (mVStoredValueAmount.mo32944g()) {
                    str = mVStoredValueAmount.explanation;
                }
                return new PurchaseStoredValueAmount(d, str5, str, mVStoredValueAmount.isDefault);
            case 24:
                return Collections.unmodifiableList((List) obj);
            default:
                return new ServerId(((Integer) obj).intValue());
        }
    }

    public boolean invoke(Object obj) {
        MicroMobilityAction microMobilityAction;
        int i = this.f15231b;
        C5679b bVar = (C5679b) obj;
        String str = C5682e.f18466k;
        C5851d dVar = new C5851d(Integer.valueOf(i));
        ServerId serverId = bVar.f18461n;
        if (serverId == null || (microMobilityAction = bVar.f18463p) == null) {
            return false;
        }
        bVar.mo21529m2(serverId, microMobilityAction, dVar);
        return false;
    }
}
