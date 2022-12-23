package p066e0;

import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import android.util.JsonReader;
import c00.C13721e;
import ce0.C21100e;
import com.appboy.support.AppboyFileUtils;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.slider.C14115c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.payment.account.creditcard.PaymentCreditCardActivity;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.gateway.C16328a;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.ticketing.ticket.C7753a;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.transit.LocationDescriptor;
import h80.C12738c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0098d0;
import p009a8.C0115o;
import p009a8.C0120s;
import p009a8.C0121t;
import p041ca.C1835u;
import p145k5.C5494m;
import p173ma.C5735h;
import p173ma.C5739k;
import p223q8.C6212a;
import p237r9.C6269b;
import p249s8.C6486a;
import p262t8.C6606a;
import p287v8.C6873a;
import p289va.C6927w;
import p543hq.C17474b;
import p577je.C17746a0;
import p577je.C17803n;
import p584jl.C17885a;
import p601ke.C18028a;
import p785ry.C19381a;
import p785ry.C19385e;
import p837ue.C19895d;
import p910xf.C20475d;
import p910xf.C20482k;
import p910xf.C20488n;
import p977zz.C20949l;
import r60.C19234e;
import r60.C19242g;
import s90.C13076d;
import v40.C25754i;
import z70.C13324c;

/* renamed from: e0.r0 */
public final /* synthetic */ class C4454r0 implements FeatureManager.C2369a, C1835u.C1836a, C5739k, C18028a.C18029a, C20488n.C20489a, C14115c, SuccessContinuation, C20949l, C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f15515b;

    public /* synthetic */ C4454r0(int i) {
        this.f15515b = i;
    }

    /* renamed from: a */
    public C5735h[] mo19990a() {
        return new C5735h[]{new C6927w()};
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        C6269b bVar = C1835u.f6351g;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: b */
    public C5735h[] mo252b(Uri uri, Map map) {
        return mo19990a();
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r6v20, types: [java.util.HashSet] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04e9  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object convert(java.lang.Object r32) {
        /*
            r31 = this;
            r0 = r31
            int r1 = r0.f15515b
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 0
            r7 = -1
            switch(r1) {
                case 0: goto L_0x056b;
                case 1: goto L_0x0529;
                case 2: goto L_0x0520;
                case 3: goto L_0x0513;
                case 4: goto L_0x050c;
                case 5: goto L_0x0503;
                case 6: goto L_0x04fa;
                case 7: goto L_0x027b;
                case 8: goto L_0x0211;
                case 9: goto L_0x0206;
                case 10: goto L_0x01ee;
                case 11: goto L_0x01e7;
                case 12: goto L_0x01da;
                case 13: goto L_0x01d1;
                case 14: goto L_0x01c8;
                case 15: goto L_0x01bf;
                case 16: goto L_0x01ab;
                case 17: goto L_0x019d;
                case 18: goto L_0x0190;
                case 19: goto L_0x0158;
                case 20: goto L_0x0149;
                case 21: goto L_0x0139;
                case 22: goto L_0x012e;
                case 23: goto L_0x0125;
                case 24: goto L_0x011c;
                case 25: goto L_0x001e;
                case 26: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x05a6
        L_0x0010:
            r1 = r32
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x001e:
            r1 = r32
            com.tranzmate.moovit.protocol.gtfs.MVMetroRouteType r1 = (com.tranzmate.moovit.protocol.gtfs.MVMetroRouteType) r1
            c00.c r3 = com.moovit.transit.C7841a.f23766a
            com.tranzmate.moovit.protocol.common.MVRouteType r3 = r1.routeType
            int r6 = r3.getValue()
            com.moovit.network.model.ServerId r8 = new com.moovit.network.model.ServerId
            r8.<init>(r6)
            boolean r6 = r1.mo27459f()
            if (r6 == 0) goto L_0x0049
            com.tranzmate.moovit.protocol.clienttexts.MVClientText r6 = r1.clientOverrideTextResourceId
            zz.m0<java.lang.Integer> r7 = c70.C13749c.f33838a
            int r6 = r6.getValue()
            zz.m0<java.lang.Integer> r7 = c70.C13749c.f33838a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r6 = r7.mo53030d(r6)
        L_0x0047:
            r9 = r6
            goto L_0x0083
        L_0x0049:
            int[] r6 = com.moovit.transit.C7841a.C7842a.f23769a
            int r7 = r3.ordinal()
            r6 = r6[r7]
            switch(r6) {
                case 1: goto L_0x0080;
                case 2: goto L_0x007d;
                case 3: goto L_0x007a;
                case 4: goto L_0x0077;
                case 5: goto L_0x0074;
                case 6: goto L_0x0071;
                case 7: goto L_0x006e;
                case 8: goto L_0x006b;
                default: goto L_0x0054;
            }
        L_0x0054:
            com.moovit.commons.request.BadResponseException r1 = new com.moovit.commons.request.BadResponseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unknown transit type: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x006b:
            int r6 = p824tp.C19746x.transit_type_default_funicular
            goto L_0x0047
        L_0x006e:
            int r6 = p824tp.C19746x.transit_type_default_gondola
            goto L_0x0047
        L_0x0071:
            int r6 = p824tp.C19746x.transit_type_default_cable
            goto L_0x0047
        L_0x0074:
            int r6 = p824tp.C19746x.transit_type_default_ferry
            goto L_0x0047
        L_0x0077:
            int r6 = p824tp.C19746x.transit_type_default_bus
            goto L_0x0047
        L_0x007a:
            int r6 = p824tp.C19746x.transit_type_default_rail
            goto L_0x0047
        L_0x007d:
            int r6 = p824tp.C19746x.transit_type_default_subway
            goto L_0x0047
        L_0x0080:
            int r6 = p824tp.C19746x.transit_type_default_tram
            goto L_0x0047
        L_0x0083:
            int r6 = r1.image
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.moovit.image.model.Image r10 = com.moovit.image.C16028g.m40823a(r6)
            if (r10 == 0) goto L_0x0100
            int[] r6 = com.moovit.transit.C7841a.C7842a.f23769a
            int r7 = r3.ordinal()
            r6 = r6[r7]
            switch(r6) {
                case 1: goto L_0x00c6;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00b4;
                case 8: goto L_0x00b1;
                default: goto L_0x009a;
            }
        L_0x009a:
            com.moovit.commons.request.BadResponseException r1 = new com.moovit.commons.request.BadResponseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unknown transit type vehicle type: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x00b1:
            com.moovit.transit.TransitType$VehicleType r3 = com.moovit.transit.TransitType.VehicleType.FUNICULAR
            goto L_0x00c8
        L_0x00b4:
            com.moovit.transit.TransitType$VehicleType r3 = com.moovit.transit.TransitType.VehicleType.GONDOLA
            goto L_0x00c8
        L_0x00b7:
            com.moovit.transit.TransitType$VehicleType r3 = com.moovit.transit.TransitType.VehicleType.CABLE
            goto L_0x00c8
        L_0x00ba:
            com.moovit.transit.TransitType$VehicleType r3 = com.moovit.transit.TransitType.VehicleType.FERRY
            goto L_0x00c8
        L_0x00bd:
            com.moovit.transit.TransitType$VehicleType r3 = com.moovit.transit.TransitType.VehicleType.BUS
            goto L_0x00c8
        L_0x00c0:
            com.moovit.transit.TransitType$VehicleType r3 = com.moovit.transit.TransitType.VehicleType.TRAIN
            goto L_0x00c8
        L_0x00c3:
            com.moovit.transit.TransitType$VehicleType r3 = com.moovit.transit.TransitType.VehicleType.SUBWAY
            goto L_0x00c8
        L_0x00c6:
            com.moovit.transit.TransitType$VehicleType r3 = com.moovit.transit.TransitType.VehicleType.TRAM
        L_0x00c8:
            r11 = r3
            com.tranzmate.moovit.protocol.common.MVViewType r1 = r1.viewType
            int[] r3 = com.moovit.transit.C7841a.C7842a.f23771c
            int r6 = r1.ordinal()
            r3 = r3[r6]
            if (r3 == r4) goto L_0x00f6
            if (r3 == r5) goto L_0x00f3
            if (r3 != r2) goto L_0x00dc
            com.moovit.transit.TransitType$ViewType r1 = com.moovit.transit.TransitType.ViewType.PLATFORMS
            goto L_0x00f8
        L_0x00dc:
            com.moovit.commons.request.BadResponseException r2 = new com.moovit.commons.request.BadResponseException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown transit type view type: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x00f3:
            com.moovit.transit.TransitType$ViewType r1 = com.moovit.transit.TransitType.ViewType.TRIPS
            goto L_0x00f8
        L_0x00f6:
            com.moovit.transit.TransitType$ViewType r1 = com.moovit.transit.TransitType.ViewType.DEFAULT
        L_0x00f8:
            r12 = r1
            com.moovit.transit.TransitType r1 = new com.moovit.transit.TransitType
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            return r1
        L_0x0100:
            com.moovit.commons.request.BadResponseException r1 = new com.moovit.commons.request.BadResponseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Transit type, "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " icon may not be null"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x011c:
            r1 = r32
            java.lang.String r1 = (java.lang.String) r1
            com.moovit.commons.geo.Polylon r1 = com.moovit.commons.geo.Polylon.m40195m(r1)
            return r1
        L_0x0125:
            r1 = r32
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            return r1
        L_0x012e:
            r1 = r32
            com.moovit.network.model.ServerId r1 = (com.moovit.network.model.ServerId) r1
            int r1 = r1.f15142b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x0139:
            r1 = r32
            com.tranzmate.moovit.protocol.common.MVLinkedTextLink r1 = (com.tranzmate.moovit.protocol.common.MVLinkedTextLink) r1
            zz.m0<java.lang.Integer> r2 = c70.C13749c.f33838a
            java.lang.String r2 = r1.text
            java.lang.String r1 = r1.action
            zz.i0 r3 = new zz.i0
            r3.<init>(r2, r1)
            return r3
        L_0x0149:
            r1 = r32
            com.moovit.payment.registration.steps.profile.PaymentProfile r1 = (com.moovit.payment.registration.steps.profile.PaymentProfile) r1
            int r2 = h60.C17330k1.f44719x
            com.moovit.network.model.ServerId r1 = r1.f42828b
            int r1 = r1.f15142b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x0158:
            r1 = r32
            com.tranzmate.moovit.protocol.payments.MVPaymentAccountId r1 = (com.tranzmate.moovit.protocol.payments.MVPaymentAccountId) r1
            sz.r r2 = h60.C17353s0.f44739a
            java.lang.String r2 = r1.f27421id
            com.tranzmate.moovit.protocol.payments.MVIdentificationType r1 = r1.idType
            int[] r3 = h60.C17353s0.C17354a.f44749j
            int r6 = r1.ordinal()
            r3 = r3[r6]
            if (r3 == r4) goto L_0x0188
            if (r3 != r5) goto L_0x0171
            com.moovit.payment.registration.steps.id.PaymentAccountId$IdType r1 = com.moovit.payment.registration.steps.p420id.PaymentAccountId.IdType.PASSPORT
            goto L_0x018a
        L_0x0171:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown id type: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0188:
            com.moovit.payment.registration.steps.id.PaymentAccountId$IdType r1 = com.moovit.payment.registration.steps.p420id.PaymentAccountId.IdType.SSN
        L_0x018a:
            com.moovit.payment.registration.steps.id.PaymentAccountId r3 = new com.moovit.payment.registration.steps.id.PaymentAccountId
            r3.<init>(r2, r1)
            return r3
        L_0x0190:
            r1 = r32
            com.moovit.payment.account.model.PaymentAccountProfile r1 = (com.moovit.payment.account.model.PaymentAccountProfile) r1
            com.moovit.payment.registration.steps.profile.PaymentProfile r1 = r1.f64033b
            com.moovit.network.model.ServerId r1 = r1.f42828b
            java.lang.String r1 = r1.mo19751c()
            return r1
        L_0x019d:
            r1 = r32
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x01ab:
            r1 = r32
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityDamageReport r1 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityDamageReport) r1
            java.lang.String r2 = r1.damageDescription
            boolean r3 = r1.mo28675g()
            if (r3 == 0) goto L_0x01b9
            long r7 = r1.reportDate
        L_0x01b9:
            com.moovit.micromobility.damage.MicroMobilityDamageReport r1 = new com.moovit.micromobility.damage.MicroMobilityDamageReport
            r1.<init>(r2, r7)
            return r1
        L_0x01bf:
            r1 = r32
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow r1 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow) r1
            com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = t30.C6565g.m15497a(r1)
            return r1
        L_0x01c8:
            r1 = r32
            com.tranzmate.moovit.protocol.gtfs.MVStopMetaData r1 = (com.tranzmate.moovit.protocol.gtfs.MVStopMetaData) r1
            com.moovit.transit.TransitStop r1 = com.moovit.transit.C7841a.m17867e(r1)
            return r1
        L_0x01d1:
            r1 = r32
            com.moovit.tripplanner.TripPlannerTransportType r1 = (com.moovit.tripplanner.TripPlannerTransportType) r1
            com.tranzmate.moovit.protocol.common.MVRouteType r1 = com.moovit.itinerary.C16080a.m40969y(r1)
            return r1
        L_0x01da:
            r1 = r32
            com.moovit.database.DbEntityRef r1 = (com.moovit.database.DbEntityRef) r1
            int r1 = k40.C5479c.m13666c(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x01e7:
            r1 = r32
            com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter r1 = (com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter) r1
            java.lang.String r1 = r1.value
            return r1
        L_0x01ee:
            r1 = r32
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            sz.r r2 = com.moovit.itinerary.C16080a.f41870a
            com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter r2 = new com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r3, r1)
            return r2
        L_0x0206:
            r1 = r32
            com.moovit.network.model.ServerId r1 = (com.moovit.network.model.ServerId) r1
            int r1 = r1.f15142b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x0211:
            r1 = r32
            com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPoint r1 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPoint) r1
            com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType r6 = r1.type
            int[] r7 = p596jx.C17964m.C17965a.f46043c
            int r8 = r6.ordinal()
            r7 = r7[r8]
            if (r7 == r4) goto L_0x0247
            if (r7 == r5) goto L_0x0245
            if (r7 == r2) goto L_0x0242
            r2 = 4
            if (r7 != r2) goto L_0x022b
            r4 = 3
            r6 = 3
            goto L_0x0249
        L_0x022b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown way-point type: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0242:
            r4 = 2
            r6 = 2
            goto L_0x0249
        L_0x0245:
            r6 = 1
            goto L_0x0249
        L_0x0247:
            r4 = 0
            r6 = 0
        L_0x0249:
            int r2 = r1.f29612id
            com.moovit.network.model.ServerId r7 = new com.moovit.network.model.ServerId
            r7.<init>(r2)
            com.tranzmate.moovit.protocol.common.MVLatLon r2 = r1.location
            com.moovit.commons.geo.LatLonE6 r8 = c70.C13749c.m34322h(r2)
            java.lang.String r9 = r1.locationName
            r2 = 0
            r4 = 1135869952(0x43b40000, float:360.0)
            double r10 = r1.bearing
            float r5 = (float) r10
            int r10 = p977zz.C20936e0.f52684d
            float r4 = java.lang.Math.min(r4, r5)
            float r10 = java.lang.Math.max(r2, r4)
            byte r2 = r1.pickupPassengersCount
            int r11 = java.lang.Math.max(r3, r2)
            byte r1 = r1.dropOffPassengersCount
            int r12 = java.lang.Math.max(r3, r1)
            fx.i r1 = new fx.i
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x027b:
            r1 = r32
            com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfiguration r1 = (com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfiguration) r1
            com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfigurationMetadata r3 = r1.metadata
            int r1 = r1.taxiId
            com.moovit.network.model.ServerId r8 = new com.moovit.network.model.ServerId
            r8.<init>(r1)
            java.lang.String r9 = r3.providerAnalyticName
            java.lang.String r10 = r3.name
            int r1 = r3.mainColor
            com.moovit.commons.utils.Color r11 = c70.C13749c.m34327m(r1)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r1 = r3.shortImage
            com.moovit.image.model.Image r12 = com.moovit.image.C16028g.m40829g(r1)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r1 = r3.longImage
            com.moovit.image.model.Image r13 = com.moovit.image.C16028g.m40829g(r1)
            boolean r1 = r3.mo32161N()
            if (r1 == 0) goto L_0x02ac
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r1 = r3.vehicleImage
            com.moovit.image.model.Image r1 = com.moovit.image.C16028g.m40829g(r1)
            r14 = r1
            goto L_0x02ad
        L_0x02ac:
            r14 = r6
        L_0x02ad:
            boolean r1 = r3.mo32152D()
            if (r1 == 0) goto L_0x02b7
            java.lang.String r1 = r3.paymentContext
            r15 = r1
            goto L_0x02b8
        L_0x02b7:
            r15 = r6
        L_0x02b8:
            boolean r1 = r3.mo32153E()
            if (r1 == 0) goto L_0x02c9
            java.util.List<com.tranzmate.moovit.protocol.taxi.MVTaxiPolygon> r1 = r3.polygons
            hq.e r4 = new hq.e
            r4.<init>(r2)
            java.util.HashSet r6 = c00.C13720d.m34277g(r1, r6, r4)
        L_0x02c9:
            r16 = r6
            java.lang.String r1 = r3.androidSchema
            java.lang.String r2 = r3.deepLinkUri
            java.lang.String r4 = r3.myLocationDeepLinkUri
            java.lang.String r5 = r3.downloadLink
            com.moovit.app.taxi.providers.TaxiAppInfo r6 = new com.moovit.app.taxi.providers.TaxiAppInfo
            r6.<init>(r1, r2, r4, r5)
            com.tranzmate.moovit.protocol.taxi.MVTaxiSuggestRoutes r1 = r3.suggestRoutes
            java.lang.String r2 = r1.taxiPriceLabel
            java.lang.String r4 = r1.pickupTimeText
            java.lang.String r5 = r1.futurePickupTimeText
            boolean r7 = r1.mo32277f()
            if (r7 == 0) goto L_0x02ed
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r1.backdropImage
            com.moovit.image.model.Image r7 = com.moovit.image.C16028g.m40829g(r7)
            goto L_0x02ee
        L_0x02ed:
            r7 = 0
        L_0x02ee:
            r21 = r7
            com.moovit.app.taxi.providers.TaxiButtonSpec r7 = new com.moovit.app.taxi.providers.TaxiButtonSpec
            java.lang.String r0 = r1.cta
            r32 = r6
            int r6 = r3.ctaTextColor
            com.moovit.commons.utils.Color r6 = c70.C13749c.m34327m(r6)
            r24 = r15
            int r15 = r3.ctaBackgroundColor
            com.moovit.commons.utils.Color r15 = c70.C13749c.m34327m(r15)
            r7.<init>(r0, r6, r15)
            boolean r0 = r1.mo32281i()
            if (r0 == 0) goto L_0x0314
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r0 = r1.mapMarker
            com.moovit.image.model.Image r0 = com.moovit.image.C16028g.m40829g(r0)
            goto L_0x0315
        L_0x0314:
            r0 = 0
        L_0x0315:
            r23 = r0
            com.moovit.app.taxi.providers.TaxiTripPlanConfig r0 = new com.moovit.app.taxi.providers.TaxiTripPlanConfig
            r17 = r0
            r18 = r2
            r19 = r4
            r20 = r5
            r22 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23)
            boolean r1 = r3.mo32179l()
            if (r1 == 0) goto L_0x0399
            com.tranzmate.moovit.protocol.taxi.MVTaxiDashboardConfig r1 = r3.dashboard
            com.tranzmate.moovit.protocol.conf.MVDashboardSection r2 = r1.host
            java.lang.String r18 = r2.name()
            java.lang.String r2 = r1.title
            java.lang.String r4 = r1.subtitle
            com.tranzmate.moovit.protocol.taxi.MVTaxiVisibility r5 = r1.visibility
            int[] r6 = com.moovit.app.taxi.providers.C15445a.C15446a.f39994a
            int r7 = r5.ordinal()
            r6 = r6[r7]
            r7 = 1
            if (r6 == r7) goto L_0x0368
            r7 = 2
            if (r6 == r7) goto L_0x0365
            r7 = 3
            if (r6 != r7) goto L_0x034e
            com.moovit.app.taxi.providers.TaxiVisibility r5 = com.moovit.app.taxi.providers.TaxiVisibility.PAYMENT_ACCOUNT_CONNECTED
            goto L_0x036a
        L_0x034e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown taxi visibility : "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0365:
            com.moovit.app.taxi.providers.TaxiVisibility r5 = com.moovit.app.taxi.providers.TaxiVisibility.NOT_INSTALLED
            goto L_0x036a
        L_0x0368:
            com.moovit.app.taxi.providers.TaxiVisibility r5 = com.moovit.app.taxi.providers.TaxiVisibility.ALWAYS
        L_0x036a:
            r21 = r5
            com.moovit.app.taxi.providers.TaxiButtonSpec r5 = new com.moovit.app.taxi.providers.TaxiButtonSpec
            java.lang.String r6 = r1.cta
            int r7 = r3.ctaTextColor
            com.moovit.commons.utils.Color r7 = c70.C13749c.m34327m(r7)
            int r15 = r3.ctaBackgroundColor
            com.moovit.commons.utils.Color r15 = c70.C13749c.m34327m(r15)
            r5.<init>(r6, r7, r15)
            boolean r6 = r1.mo32093h()
            if (r6 == 0) goto L_0x0388
            java.lang.String r1 = r1.dashboardDeeplink
            goto L_0x0389
        L_0x0388:
            r1 = 0
        L_0x0389:
            r23 = r1
            com.moovit.app.taxi.providers.TaxiDashboardConfig r1 = new com.moovit.app.taxi.providers.TaxiDashboardConfig
            r17 = r1
            r19 = r2
            r20 = r4
            r22 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x039a
        L_0x0399:
            r1 = 0
        L_0x039a:
            r19 = r1
            boolean r1 = r3.mo32183q()
            if (r1 == 0) goto L_0x0427
            com.tranzmate.moovit.protocol.taxi.MVTaxiFabConfig r1 = r3.fab
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 3
            r2.<init>(r4)
            com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation[] r4 = new com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation[r4]
            com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation r5 = r1.primary
            r6 = 0
            r4[r6] = r5
            com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation r5 = r1.promo
            r6 = 1
            r4[r6] = r5
            com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation r5 = r1.secondary
            r6 = 2
            r4[r6] = r5
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x03c3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x03fb
            java.lang.Object r5 = r4.next()
            com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation r5 = (com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation) r5
            if (r5 != 0) goto L_0x03d2
            goto L_0x03c3
        L_0x03d2:
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r6 = r5.icon
            com.moovit.image.model.Image r6 = com.moovit.image.C16028g.m40829g(r6)
            java.lang.String r7 = r5.title
            boolean r15 = r5.mo32138h()
            if (r15 == 0) goto L_0x03e7
            int r5 = r5.titleColor
            com.moovit.commons.utils.Color r5 = c70.C13749c.m34327m(r5)
            goto L_0x03f2
        L_0x03e7:
            com.moovit.app.MoovitAppApplication r5 = com.moovit.app.MoovitAppApplication.m37038x()
            r15 = 2130969025(0x7f0401c1, float:1.754672E38)
            com.moovit.commons.utils.Color r5 = com.moovit.commons.utils.Color.m40220d(r15, r5)
        L_0x03f2:
            com.moovit.app.taxi.providers.TaxiFabConfig$TaxiFabPage r15 = new com.moovit.app.taxi.providers.TaxiFabConfig$TaxiFabPage
            r15.<init>(r6, r7, r5)
            r2.add(r15)
            goto L_0x03c3
        L_0x03fb:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x0402
            r2 = 0
        L_0x0402:
            if (r2 != 0) goto L_0x0405
            goto L_0x0427
        L_0x0405:
            boolean r4 = r1.alwaysShowFab
            if (r4 == 0) goto L_0x040c
            com.moovit.app.taxi.providers.TaxiVisibility r4 = com.moovit.app.taxi.providers.TaxiVisibility.ALWAYS
            goto L_0x040e
        L_0x040c:
            com.moovit.app.taxi.providers.TaxiVisibility r4 = com.moovit.app.taxi.providers.TaxiVisibility.NOT_INSTALLED
        L_0x040e:
            boolean r5 = r1.shouldRequestEta
            boolean r6 = r1.mo32127i()
            if (r6 == 0) goto L_0x041f
            com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation r1 = r1.secondary
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r1 = r1.icon
            com.moovit.image.model.Image r1 = com.moovit.image.C16028g.m40829g(r1)
            goto L_0x0420
        L_0x041f:
            r1 = 0
        L_0x0420:
            com.moovit.app.taxi.providers.TaxiFabConfig r6 = new com.moovit.app.taxi.providers.TaxiFabConfig
            r6.<init>(r2, r4, r5, r1)
            r1 = r6
            goto L_0x0428
        L_0x0427:
            r1 = 0
        L_0x0428:
            r20 = r1
            boolean r1 = r3.mo32155G()
            if (r1 == 0) goto L_0x0463
            com.tranzmate.moovit.protocol.taxi.MVTaxiPopupConfig r1 = r3.popup
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r1.icon
            com.moovit.image.model.Image r26 = com.moovit.image.C16028g.m40829g(r2)
            java.lang.String r2 = r1.title
            java.lang.String r4 = r1.subtitle
            com.moovit.app.taxi.providers.TaxiButtonSpec r5 = new com.moovit.app.taxi.providers.TaxiButtonSpec
            java.lang.String r6 = r1.cta
            int r7 = r3.ctaTextColor
            com.moovit.commons.utils.Color r7 = c70.C13749c.m34327m(r7)
            int r15 = r3.ctaBackgroundColor
            com.moovit.commons.utils.Color r15 = c70.C13749c.m34327m(r15)
            r5.<init>(r6, r7, r15)
            java.lang.String r1 = r1.promoCode
            com.moovit.app.taxi.providers.TaxiPopupConfig r6 = new com.moovit.app.taxi.providers.TaxiPopupConfig
            r25 = r6
            r27 = r2
            r28 = r4
            r29 = r5
            r30 = r1
            r25.<init>(r26, r27, r28, r29, r30)
            r21 = r6
            goto L_0x0466
        L_0x0463:
            r1 = 0
            r21 = r1
        L_0x0466:
            boolean r1 = r3.mo32174h()
            if (r1 == 0) goto L_0x0490
            com.tranzmate.moovit.protocol.taxi.MVTaxiAnimationsConfig r1 = r3.animations
            java.lang.String r2 = r1.baseUrl
            boolean r4 = r1.mo32083f()
            if (r4 == 0) goto L_0x0484
            java.util.List<com.tranzmate.moovit.protocol.taxi.MVTaxiAnimation> r1 = r1.animations
            tt.a r4 = new tt.a
            r5 = 5
            r4.<init>(r5)
            r5 = 0
            java.util.ArrayList r1 = c00.C13720d.m34273c(r1, r5, r4)
            goto L_0x0488
        L_0x0484:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x0488:
            com.moovit.app.taxi.providers.TaxiAnimationConfig r4 = new com.moovit.app.taxi.providers.TaxiAnimationConfig
            r4.<init>(r2, r1)
            r22 = r4
            goto L_0x0493
        L_0x0490:
            r1 = 0
            r22 = r1
        L_0x0493:
            boolean r1 = r3.mo32151A()
            if (r1 == 0) goto L_0x04b3
            com.tranzmate.moovit.protocol.taxi.MVTaxiOrderConfig r1 = r3.order
            java.util.List<com.tranzmate.moovit.protocol.taxi.MVTaxiOrderProfile> r2 = r1.additionalPassengersProfiles
            vs.e r4 = new vs.e
            r5 = 8
            r4.<init>(r5)
            r5 = 0
            java.util.ArrayList r2 = c00.C13720d.m34273c(r2, r5, r4)
            int r1 = r1.maxNumberOfPassengers
            com.moovit.app.taxi.providers.TaxiOrderConfig r4 = new com.moovit.app.taxi.providers.TaxiOrderConfig
            r4.<init>(r2, r1)
            r23 = r4
            goto L_0x04b6
        L_0x04b3:
            r1 = 0
            r23 = r1
        L_0x04b6:
            boolean r1 = r3.mo32154F()
            if (r1 == 0) goto L_0x04e9
            com.tranzmate.moovit.protocol.taxi.MVTaxiPolygonsVisibiltyAffect r1 = r3.polygonsVisibilityAffect
            int[] r2 = com.moovit.app.taxi.providers.C15445a.C15446a.f39995b
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L_0x04e6
            r3 = 2
            if (r2 != r3) goto L_0x04cf
            com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect r1 = com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect.VISIBLE_INSIDE
            goto L_0x04eb
        L_0x04cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Illegal polygons visibility affect - "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x04e6:
            com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect r1 = com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect.NONE
            goto L_0x04eb
        L_0x04e9:
            com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect r1 = com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect.NONE
        L_0x04eb:
            com.moovit.app.taxi.providers.TaxiProvider r2 = new com.moovit.app.taxi.providers.TaxiProvider
            r7 = r2
            r15 = r24
            r17 = r32
            r18 = r0
            r24 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r2
        L_0x04fa:
            r0 = r32
            gw.b r0 = (p525gw.C17247b) r0
            gw.a r0 = r0.f44574a
            java.lang.String r0 = r0.f44573a
            return r0
        L_0x0503:
            r0 = r32
            com.tranzmate.moovit.protocol.ridesharing.MVRSSuperEvent r0 = (com.tranzmate.moovit.protocol.ridesharing.MVRSSuperEvent) r0
            com.moovit.ridesharing.model.Event r0 = d70.C16536a.m42029a(r0)
            return r0
        L_0x050c:
            r0 = r32
            com.moovit.app.mot.model.MotActivation r0 = (com.moovit.app.mot.model.MotActivation) r0
            java.lang.String r0 = r0.f38992i
            return r0
        L_0x0513:
            r0 = r32
            com.moovit.itinerary.model.leg.Leg r0 = (com.moovit.itinerary.model.leg.Leg) r0
            xt.g r1 = p924xt.C20604l.f52116a
            com.moovit.itinerary.model.leg.CarpoolLeg r0 = (com.moovit.itinerary.model.leg.CarpoolLeg) r0
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolDriverInfo r0 = r0.f41976l
            com.moovit.image.model.Image r0 = r0.f41986c
            return r0
        L_0x0520:
            r0 = r32
            com.moovit.transit.LocationDescriptor r0 = (com.moovit.transit.LocationDescriptor) r0
            pt.h r0 = p735pt.C18991h.m46101b(r0)
            return r0
        L_0x0529:
            r0 = r32
            android.net.wifi.ScanResult r0 = (android.net.wifi.ScanResult) r0
            r1 = 17
            boolean r1 = p977zz.C20943i.m49051d(r1)
            if (r1 == 0) goto L_0x0545
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r3
            long r3 = r0.timestamp
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            long r7 = r3 + r1
        L_0x0545:
            com.tranzmate.moovit.protocol.crowd.MVWifi r1 = new com.tranzmate.moovit.protocol.crowd.MVWifi
            java.lang.String r2 = r0.BSSID
            java.lang.String r3 = r0.SSID
            int r4 = r0.level
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.<init>()
            r1.bssid = r2
            r1.ssid = r3
            r1.level = r4
            r1.timestamp = r7
            r1.mo26945u()
            java.lang.String r2 = r0.capabilities
            r1.capabilites = r2
            int r0 = r0.frequency
            r1.frequency = r0
            r1.mo26942s()
            return r1
        L_0x056b:
            r0 = r32
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            com.moovit.analytics.AnalyticsAttributeKey r1 = (com.moovit.analytics.AnalyticsAttributeKey) r1
            java.util.EnumMap r2 = p543hq.C17477d.f45003d
            java.lang.Object r2 = r2.get(r1)
            com.tranzmate.moovit.protocol.kinesis.MVAnalyticsAttributeKey r2 = (com.tranzmate.moovit.protocol.kinesis.MVAnalyticsAttributeKey) r2
            if (r2 == 0) goto L_0x058f
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            com.tranzmate.moovit.protocol.kinesis.MVAnalyticsAttribute r1 = new com.tranzmate.moovit.protocol.kinesis.MVAnalyticsAttribute
            r1.<init>()
            r1.key = r2
            r1.value = r0
            return r1
        L_0x058f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unknown attribute key "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x05a6:
            r0 = r32
            com.tranzmate.moovit.protocol.linearrivals.MVStopCongestionStatus r0 = (com.tranzmate.moovit.protocol.linearrivals.MVStopCongestionStatus) r0
            com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel r1 = r0.type
            com.moovit.util.time.CongestionLevel r8 = com.moovit.util.time.C7923a.m18003c(r1)
            com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource r1 = r0.source
            com.moovit.util.time.CongestionSource r9 = com.moovit.util.time.C7923a.m18004d(r1)
            long r10 = r0.reportTimeUtc
            boolean r1 = r0.mo28084f()
            if (r1 == 0) goto L_0x05c0
            java.lang.String r6 = r0.platformName
        L_0x05c0:
            r12 = r6
            com.moovit.util.time.StopRealTimeCongestion r0 = new com.moovit.util.time.StopRealTimeCongestion
            r7 = r0
            r7.<init>(r8, r9, r10, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p066e0.C4454r0.convert(java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    public void mo19991e(Object obj, C20482k.C20483a aVar) {
        ((C20475d) obj).mo52669a();
    }

    /* renamed from: f */
    public Object mo245f(JsonReader jsonReader) {
        C19895d dVar = C18028a.f46139a;
        C17803n.C17804a aVar = new C17803n.C17804a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f45711c = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null name");
                    }
                case 1:
                    aVar.f45710b = Long.valueOf(jsonReader.nextLong());
                    break;
                case 2:
                    aVar.f45712d = new String(Base64.decode(jsonReader.nextString(), 2), C17746a0.f45593a);
                    break;
                case 3:
                    aVar.f45709a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo50361a();
    }

    /* renamed from: i */
    public void mo246i(boolean z) {
        File[] fileArr;
        switch (this.f15515b) {
            case 1:
                if (z) {
                    C0115o.f343m = true;
                    return;
                } else {
                    C0115o oVar = C0115o.f331a;
                    return;
                }
            default:
                if (z) {
                    synchronized (C6486a.f20227b) {
                        C0115o oVar2 = C0115o.f331a;
                        if (C0098d0.m169b()) {
                            C6486a.C6487a.m15372a();
                        }
                        if (C6486a.f20228c == null) {
                            C6486a aVar = new C6486a(Thread.getDefaultUncaughtExceptionHandler());
                            C6486a.f20228c = aVar;
                            Thread.setDefaultUncaughtExceptionHandler(aVar);
                        }
                    }
                    FeatureManager featureManager = FeatureManager.f8588a;
                    if (FeatureManager.m6257c(FeatureManager.Feature.CrashShield)) {
                        C21100e.f52945f = true;
                        if (C0098d0.m169b() && !C2397f0.m6331y()) {
                            File V = C17885a.m44425V();
                            if (V == null) {
                                fileArr = new File[0];
                            } else {
                                fileArr = V.listFiles(new C5494m(2));
                                if (fileArr == null) {
                                    fileArr = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            int length = fileArr.length;
                            int i = 0;
                            while (i < length) {
                                File file = fileArr[i];
                                i++;
                                C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
                                InstrumentData instrumentData = new InstrumentData(file);
                                if (instrumentData.mo12558b()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", instrumentData.toString());
                                        String str = GraphRequest.f8425j;
                                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C0115o.m211b()}, 1));
                                        C24362h.m61210e(format, "java.lang.String.format(format, *args)");
                                        arrayList.add(GraphRequest.C2281c.m6138h((AccessToken) null, format, jSONObject, new C6212a(instrumentData, 0)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                C0121t tVar = new C0121t((List) arrayList);
                                String str2 = GraphRequest.f8425j;
                                C2400g0.m6340e(tVar);
                                new C0120s(tVar).executeOnExecutor(C0115o.m212c(), new Void[0]);
                            }
                        }
                        C6606a.f20452b = true;
                    }
                    FeatureManager featureManager2 = FeatureManager.f8588a;
                    if (FeatureManager.m6257c(FeatureManager.Feature.ThreadCheck)) {
                        int i2 = C6873a.f21228a;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public boolean invoke(Object obj) {
        switch (this.f15515b) {
            case 12:
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) obj;
                int i = C16328a.f42681h;
                PaymentGatewayInstructions c = paymentGatewayFragment.f42664p.mo52452c();
                CreditCardInstructions creditCardInstructions = null;
                if (c != null) {
                    creditCardInstructions = c.f42679d;
                }
                CreditCardInstructions creditCardInstructions2 = creditCardInstructions;
                if (creditCardInstructions2 == null) {
                    return false;
                }
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_method_add_clicked");
                paymentGatewayFragment.mo46797j2(aVar.mo49933a());
                paymentGatewayFragment.f42663o.mo772a(PaymentCreditCardActivity.m64074y2(paymentGatewayFragment.requireContext(), creditCardInstructions2, CreditCardRequest.Action.ADD, true, C25754i.payment_my_account_add_title, C25754i.payment_my_account_add_subtitle));
                return false;
            default:
                int i2 = C19242g.f48870h;
                ((C19234e) obj).getParentFragmentManager().mo3936Q();
                return true;
        }
    }

    public Task then(Object obj) {
        List<WondoOffer> list;
        C13324c.C13325a aVar;
        List<Ticket> list2 = null;
        switch (this.f15515b) {
            case 11:
                C19381a aVar2 = (C19381a) obj;
                C19385e eVar = C19385e.f49315c;
                if (aVar2 != null) {
                    list = aVar2.f49304b;
                } else {
                    list = Collections.emptyList();
                }
                return Tasks.forResult(list);
            case 14:
                C12738c cVar = (C12738c) obj;
                if (cVar != null) {
                    aVar = new C13324c.C13325a(cVar.f31465m, cVar.f31466n);
                } else {
                    aVar = new C13324c.C13325a((List<LocationDescriptor>) null, (Map<LocationDescriptor, Integer>) null);
                }
                return Tasks.forResult(aVar);
            default:
                C13076d dVar = (C13076d) obj;
                int i = C7753a.f23530v;
                if (dVar != null) {
                    list2 = dVar.mo39944b(C13076d.f32344g, C13076d.f32345h);
                }
                return Tasks.forResult(list2);
        }
    }
}
