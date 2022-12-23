package com.facebook.appevents;

import a70.C13396b;
import a70.C13398c;
import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import b50.C25547d;
import c00.C13721e;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C2436x;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.C14535a;
import com.moovit.app.ads.C14764y;
import com.moovit.app.mot.purchase.C15161a;
import com.moovit.app.tod.model.TodOrderAssignment;
import com.moovit.app.tod.order.TodOrderActivity;
import com.moovit.app.tripplanner.C15584c;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.deposit.C25643a;
import com.moovit.transit.LocationDescriptor;
import f80.C12638d;
import hi0.C23549m;
import java.util.List;
import java.util.Map;
import mf0.C24362h;
import org.json.JSONException;
import p009a8.C0115o;
import p062d8.C4404a;
import p062d8.C4405b;
import p173ma.C5735h;
import p173ma.C5739k;
import p227r.C6227a;
import p269u2.C6685f;
import p289va.C6886a;
import p601ke.C18028a;
import p626lf.C18201b;
import p927xw.C20632a;
import p956ze.C20837a;
import p956ze.C20839b;
import p977zz.C20949l;
import v40.C25750e;
import z70.C13324c;

/* renamed from: com.facebook.appevents.l */
public final /* synthetic */ class C2342l implements FeatureManager.C2369a, C5739k, C20837a.C20838a, C18028a.C18029a, SuccessContinuation, C20949l, C23549m, C6227a, C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f8545b;

    public /* synthetic */ C2342l(int i) {
        this.f8545b = i;
    }

    /* renamed from: a */
    public C5735h[] mo12490a() {
        return new C5735h[]{new C6886a()};
    }

    public Object apply(Object obj) {
        switch (this.f8545b) {
            case 0:
                Void voidR = (Void) obj;
                return null;
            default:
                return Integer.valueOf(((C6685f) obj).executeUpdateDelete());
        }
    }

    /* renamed from: b */
    public C5735h[] mo252b(Uri uri, Map map) {
        return mo12490a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: x00.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: com.moovit.util.PriceInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object convert(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f8545b
            r2 = 1
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            switch(r1) {
                case 0: goto L_0x036f;
                case 1: goto L_0x0344;
                case 2: goto L_0x0335;
                case 3: goto L_0x02f7;
                case 4: goto L_0x02e6;
                case 5: goto L_0x02df;
                case 6: goto L_0x0207;
                case 7: goto L_0x01fe;
                case 8: goto L_0x01f5;
                case 9: goto L_0x01e6;
                case 10: goto L_0x01d0;
                case 11: goto L_0x01c7;
                case 12: goto L_0x01be;
                case 13: goto L_0x01b5;
                case 14: goto L_0x01a7;
                case 15: goto L_0x01a0;
                case 16: goto L_0x0180;
                case 17: goto L_0x0177;
                case 18: goto L_0x0148;
                case 19: goto L_0x00e2;
                case 20: goto L_0x00ce;
                case 21: goto L_0x005c;
                case 22: goto L_0x0053;
                case 23: goto L_0x004c;
                case 24: goto L_0x002e;
                case 25: goto L_0x0029;
                case 26: goto L_0x0022;
                case 27: goto L_0x0019;
                case 28: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0378
        L_0x000f:
            com.moovit.image.model.QrCodeImage r1 = new com.moovit.image.model.QrCodeImage
            r2 = r22
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r2)
            return r1
        L_0x0019:
            r1 = r22
            com.tranzmate.moovit.protocol.gtfs.MVPathway r1 = (com.tranzmate.moovit.protocol.gtfs.MVPathway) r1
            com.moovit.transit.TransitStopPathway r1 = com.moovit.transit.C7841a.m17868f(r1)
            return r1
        L_0x0022:
            r1 = r22
            com.moovit.ticketing.ticket.Ticket r1 = (com.moovit.ticketing.ticket.Ticket) r1
            com.moovit.ticketing.ticket.TicketId r1 = r1.f23473b
            return r1
        L_0x0029:
            r1 = r22
            com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo r1 = (com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo) r1
            return r1
        L_0x002e:
            r1 = r22
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseType r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseType) r1
            sz.r r2 = q80.C13036y.f32248a
            java.lang.String r2 = r1.typeId
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r3 = r1.image
            com.moovit.image.model.Image r3 = com.moovit.image.C16028g.m40829g(r3)
            java.lang.String r4 = r1.name
            boolean r5 = r1.mo32896h()
            if (r5 == 0) goto L_0x0046
            java.lang.String r7 = r1.subtitle
        L_0x0046:
            com.moovit.ticketing.purchase.type.PurchaseType r1 = new com.moovit.ticketing.purchase.type.PurchaseType
            r1.<init>(r2, r3, r4, r7)
            return r1
        L_0x004c:
            r1 = r22
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse) r1
            java.lang.String r1 = r1.ticketId
            return r1
        L_0x0053:
            r1 = r22
            com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDigest r1 = (com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDigest) r1
            j80.c r1 = j80.C12776e.m32581e(r1)
            return r1
        L_0x005c:
            r1 = r22
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1
            j70.a$a r3 = j70.C17712a.f45463j
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r5
            long r5 = r1.timestamp
            r8 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r8
            long r14 = r5 + r3
            java.lang.Class r3 = r1.getClass()     // Catch:{ Exception -> 0x008a }
            java.lang.String r4 = "autoJoinStatus"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ Exception -> 0x008a }
            r3.setAccessible(r2)     // Catch:{ Exception -> 0x008a }
            int r3 = r3.getInt(r1)     // Catch:{ Exception -> 0x008a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x008a }
            r16 = r3
            goto L_0x008c
        L_0x008a:
            r16 = r7
        L_0x008c:
            java.lang.Class r3 = r1.getClass()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r4 = "numConnection"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ Exception -> 0x00a4 }
            r3.setAccessible(r2)     // Catch:{ Exception -> 0x00a4 }
            int r3 = r3.getInt(r1)     // Catch:{ Exception -> 0x00a4 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00a4 }
            r17 = r3
            goto L_0x00a6
        L_0x00a4:
            r17 = r7
        L_0x00a6:
            java.lang.Class r3 = r1.getClass()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r4 = "distanceCm"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ Exception -> 0x00bb }
            r3.setAccessible(r2)     // Catch:{ Exception -> 0x00bb }
            int r2 = r3.getInt(r1)     // Catch:{ Exception -> 0x00bb }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00bb }
        L_0x00bb:
            r18 = r7
            j70.a r2 = new j70.a
            java.lang.String r9 = r1.BSSID
            java.lang.String r10 = r1.capabilities
            java.lang.String r11 = r1.SSID
            int r12 = r1.frequency
            int r13 = r1.level
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r17, r18)
            return r2
        L_0x00ce:
            r1 = r22
            com.tranzmate.moovit.protocol.payments.MVPaymentMethodId r1 = (com.tranzmate.moovit.protocol.payments.MVPaymentMethodId) r1
            sz.r r2 = h60.C17353s0.f44739a
            com.tranzmate.moovit.protocol.payments.MVClearanceProviderType r2 = r1.provider
            com.moovit.payment.clearance.ClearanceProviderType r2 = h60.C17353s0.m43388b(r2)
            java.lang.String r1 = r1.paymentMethodId
            com.moovit.payment.account.paymentmethod.PaymentMethodId r3 = new com.moovit.payment.account.paymentmethod.PaymentMethodId
            r3.<init>(r2, r1)
            return r3
        L_0x00e2:
            r1 = r22
            com.tranzmate.moovit.protocol.payments.MVPaymentAccountProduct r1 = (com.tranzmate.moovit.protocol.payments.MVPaymentAccountProduct) r1
            sz.r r3 = h60.C17353s0.f44739a
            com.tranzmate.moovit.protocol.payments.MVPaymentAccountProductType r3 = r1.paymentType
            int[] r4 = h60.C17353s0.C17354a.f44746g
            int r5 = r3.ordinal()
            r4 = r4[r5]
            if (r4 != r2) goto L_0x0131
            com.moovit.payment.account.model.PaymentAccountProductType r10 = com.moovit.payment.account.model.PaymentAccountProductType.SUBSCRIPTION
            boolean r2 = r1.mo30150k()
            if (r2 == 0) goto L_0x0100
            java.lang.String r2 = r1.title
            r11 = r2
            goto L_0x0101
        L_0x0100:
            r11 = r7
        L_0x0101:
            boolean r2 = r1.mo30149j()
            if (r2 == 0) goto L_0x010b
            java.lang.String r2 = r1.subtitle
            r12 = r2
            goto L_0x010c
        L_0x010b:
            r12 = r7
        L_0x010c:
            boolean r2 = r1.mo30148i()
            if (r2 == 0) goto L_0x011a
            com.tranzmate.moovit.protocol.common.MVPriceInfo r2 = r1.priceInfo
            com.moovit.util.PriceInfo r2 = c70.C13749c.m34326l(r2)
            r13 = r2
            goto L_0x011b
        L_0x011a:
            r13 = r7
        L_0x011b:
            boolean r2 = r1.mo30144f()
            if (r2 == 0) goto L_0x0127
            com.tranzmate.moovit.protocol.common.MVInfoBoxData r2 = r1.disclaimer
            com.moovit.util.InfoBoxData r7 = c70.C13749c.m34320f(r2)
        L_0x0127:
            r14 = r7
            d50.a r2 = new d50.a
            java.lang.String r9 = r1.identifier
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r2
        L_0x0131:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unknown product type: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0148:
            r1 = r22
            com.tranzmate.moovit.protocol.paymentaccount.MVPaymentAccountPaymentProduct r1 = (com.tranzmate.moovit.protocol.paymentaccount.MVPaymentAccountPaymentProduct) r1
            java.lang.String r2 = "it"
            mf0.C24362h.m61210e(r1, r2)
            boolean r2 = r1.mo29441h()
            if (r2 == 0) goto L_0x015a
            java.lang.String r2 = r1.title
            goto L_0x015b
        L_0x015a:
            r2 = r7
        L_0x015b:
            boolean r3 = r1.mo29440g()
            if (r3 == 0) goto L_0x0164
            java.lang.String r3 = r1.subtitle
            goto L_0x0165
        L_0x0164:
            r3 = r7
        L_0x0165:
            boolean r4 = r1.mo29439f()
            if (r4 == 0) goto L_0x0171
            com.tranzmate.moovit.protocol.common.MVPriceInfo r1 = r1.priceInfo
            com.moovit.util.PriceInfo r7 = c70.C13749c.m34326l(r1)
        L_0x0171:
            com.moovit.payment.account.actions.model.PaymentProduct r1 = new com.moovit.payment.account.actions.model.PaymentProduct
            r1.<init>(r2, r3, r7)
            return r1
        L_0x0177:
            r1 = r22
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            return r1
        L_0x0180:
            r1 = r22
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideMetric r1 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideMetric) r1
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r1.icon
            com.moovit.image.model.Image r2 = com.moovit.image.C16028g.m40829g(r2)
            java.lang.String r3 = r1.title
            java.lang.String r4 = r1.subtitle
            boolean r5 = r1.mo29008f()
            if (r5 == 0) goto L_0x019a
            com.tranzmate.moovit.protocol.common.MVTextOrImage r1 = r1.accessory
            x00.a r7 = c70.C13749c.m34319e(r1)
        L_0x019a:
            com.moovit.micromobility.ride.MicroMobilityRideMetric r1 = new com.moovit.micromobility.ride.MicroMobilityRideMetric
            r1.<init>(r2, r3, r4, r7)
            return r1
        L_0x01a0:
            r1 = r22
            com.moovit.gallery.EmbeddedGalleryImage r1 = (com.moovit.gallery.EmbeddedGalleryImage) r1
            java.lang.String r1 = r1.f41479b
            return r1
        L_0x01a7:
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x01b5:
            r1 = r22
            com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction r1 = (com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction) r1
            com.moovit.itinerary.model.TurnInstruction r1 = com.moovit.itinerary.C16080a.m40946b(r1)
            return r1
        L_0x01be:
            r1 = r22
            com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction r1 = (com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction) r1
            com.moovit.itinerary.model.TurnInstruction r1 = com.moovit.itinerary.C16080a.m40946b(r1)
            return r1
        L_0x01c7:
            r1 = r22
            com.tranzmate.moovit.protocol.common.MVTextOrImage r1 = (com.tranzmate.moovit.protocol.common.MVTextOrImage) r1
            x00.a r1 = c70.C13749c.m34319e(r1)
            return r1
        L_0x01d0:
            r1 = r22
            com.moovit.app.wondo.tickets.model.WondoOfferPrice$Item r1 = (com.moovit.app.wondo.tickets.model.WondoOfferPrice.Item) r1
            java.lang.String r2 = r1.f40733b
            com.moovit.util.CurrencyAmount r1 = r1.f40734c
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r1 = c70.C13749c.m34330p(r1)
            com.tranzmate.moovit.protocol.wondo.MVWondoOfferPurchaseItem r3 = new com.tranzmate.moovit.protocol.wondo.MVWondoOfferPurchaseItem
            r3.<init>()
            r3.purchaseDescription = r2
            r3.price = r1
            return r3
        L_0x01e6:
            r1 = r22
            fx.i r1 = (p502fx.C17124i) r1
            int r2 = p596jx.C17960i.f46028A
            com.moovit.network.model.ServerId r1 = r1.f44328c
            int r1 = r1.f15142b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x01f5:
            r1 = r22
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r1 = (com.tranzmate.moovit.protocol.common.MVLocationDescriptor) r1
            com.moovit.transit.LocationDescriptor r1 = c70.C13749c.m34324j(r1, r7)
            return r1
        L_0x01fe:
            r1 = r22
            com.android.billingclient.api.Purchase r1 = (com.android.billingclient.api.Purchase) r1
            com.moovit.app.subscription.model.PurchaseDetails r1 = p549hw.C17508f.m43616a(r1)
            return r1
        L_0x0207:
            r1 = r22
            com.tranzmate.moovit.protocol.search.MVSearchResponseItem r1 = (com.tranzmate.moovit.protocol.search.MVSearchResponseItem) r1
            int r8 = r1.f28218id
            com.moovit.network.model.ServerId r10 = new com.moovit.network.model.ServerId
            r10.<init>(r8)
            com.tranzmate.moovit.protocol.search.MVSearchResultType r8 = r1.type
            com.tranzmate.moovit.protocol.common.MVSiteSource r9 = r1.source
            if (r8 == 0) goto L_0x02d7
            int[] r11 = com.moovit.app.search.locations.C15300b.C15301a.f39537a
            int r12 = r8.ordinal()
            r11 = r11[r12]
            if (r11 == r2) goto L_0x0280
            if (r11 == r6) goto L_0x027d
            if (r11 == r5) goto L_0x027a
            java.lang.String r5 = ")"
            if (r11 == r4) goto L_0x0249
            if (r11 != r3) goto L_0x022f
            com.moovit.app.search.locations.SearchLocationItem$Type r2 = com.moovit.app.search.locations.SearchLocationItem.Type.GEOCODER
            goto L_0x0282
        L_0x022f:
            com.moovit.commons.request.BadResponseException r1 = new com.moovit.commons.request.BadResponseException
            java.lang.String r2 = "Unknown MVSearchResultType received ("
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r3 = r8.name()
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0249:
            if (r9 != 0) goto L_0x024e
            com.moovit.app.search.locations.SearchLocationItem$Type r2 = com.moovit.app.search.locations.SearchLocationItem.Type.SITE
            goto L_0x0282
        L_0x024e:
            int[] r3 = com.moovit.app.search.locations.C15300b.C15301a.f39538b
            int r4 = r9.ordinal()
            r3 = r3[r4]
            if (r3 == r2) goto L_0x0277
            if (r3 != r6) goto L_0x025d
            com.moovit.app.search.locations.SearchLocationItem$Type r2 = com.moovit.app.search.locations.SearchLocationItem.Type.EVENT
            goto L_0x0282
        L_0x025d:
            com.moovit.commons.request.BadResponseException r1 = new com.moovit.commons.request.BadResponseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown MVSiteSource received ("
            r2.append(r3)
            r2.append(r9)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0277:
            com.moovit.app.search.locations.SearchLocationItem$Type r2 = com.moovit.app.search.locations.SearchLocationItem.Type.SITE
            goto L_0x0282
        L_0x027a:
            com.moovit.app.search.locations.SearchLocationItem$Type r2 = com.moovit.app.search.locations.SearchLocationItem.Type.STREET
            goto L_0x0282
        L_0x027d:
            com.moovit.app.search.locations.SearchLocationItem$Type r2 = com.moovit.app.search.locations.SearchLocationItem.Type.CITY
            goto L_0x0282
        L_0x0280:
            com.moovit.app.search.locations.SearchLocationItem$Type r2 = com.moovit.app.search.locations.SearchLocationItem.Type.STOP
        L_0x0282:
            r11 = r2
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r1.image
            com.moovit.image.model.Image r12 = com.moovit.image.C16028g.m40829g(r2)
            java.lang.String r13 = r1.title
            java.util.List<com.tranzmate.moovit.protocol.common.MVTextOrImage> r2 = r1.subTitle
            lr.i r3 = new lr.i
            r4 = 7
            r3.<init>(r4)
            java.util.ArrayList r14 = c00.C13720d.m34273c(r2, r7, r3)
            com.tranzmate.moovit.protocol.common.MVLatLon r2 = r1.latLon
            com.moovit.commons.geo.LatLonE6 r15 = c70.C13749c.m34322h(r2)
            boolean r2 = r1.mo31526j()
            if (r2 == 0) goto L_0x02ab
            boolean r2 = r1.inaccurateLatLon
            if (r2 == 0) goto L_0x02ab
            r2 = 1
            r16 = 1
            goto L_0x02ae
        L_0x02ab:
            r2 = 0
            r16 = 0
        L_0x02ae:
            java.lang.String r2 = r1.uid
            boolean r3 = r1.mo31522g()
            if (r3 == 0) goto L_0x02bb
            int r3 = r1.geocoderId
            r18 = r3
            goto L_0x02be
        L_0x02bb:
            r3 = -1
            r18 = -1
        L_0x02be:
            boolean r3 = r1.mo31521f()
            if (r3 == 0) goto L_0x02c9
            int r1 = r1.airDistance
            r20 = r1
            goto L_0x02cc
        L_0x02c9:
            r1 = -1
            r20 = -1
        L_0x02cc:
            com.moovit.app.search.locations.SearchLocationItem r1 = new com.moovit.app.search.locations.SearchLocationItem
            com.moovit.app.search.locations.SearchLocationItem$Source r19 = com.moovit.app.search.locations.SearchLocationItem.Source.DEFAULT
            r9 = r1
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x02d7:
            com.moovit.commons.request.BadResponseException r1 = new com.moovit.commons.request.BadResponseException
            java.lang.String r2 = "MVSearchResultType may not be null!"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x02df:
            r1 = r22
            com.moovit.app.mot.model.MotActivation r1 = (com.moovit.app.mot.model.MotActivation) r1
            java.lang.String r1 = r1.f38992i
            return r1
        L_0x02e6:
            r1 = r22
            zz.i0 r1 = (p977zz.C20944i0) r1
            int r2 = com.moovit.app.itinerary.view.leg.C15087l.f38717E
            F r1 = r1.f52692a
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r1 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r1
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r1 = r1.f42135f
            com.moovit.network.model.ServerId r1 = r1.getServerId()
            return r1
        L_0x02f7:
            r1 = r22
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTransportOptionPref r1 = (com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTransportOptionPref) r1
            sz.r r7 = com.moovit.itinerary.C16080a.f41870a
            int[] r7 = com.moovit.itinerary.C16080a.C16081a.f41886p
            int r8 = r1.ordinal()
            r7 = r7[r8]
            if (r7 == r2) goto L_0x0332
            if (r7 == r6) goto L_0x032f
            if (r7 == r5) goto L_0x032c
            if (r7 == r4) goto L_0x0329
            if (r7 != r3) goto L_0x0312
            com.moovit.tripplanner.TripPlannerTransportType r1 = com.moovit.tripplanner.TripPlannerTransportType.PERSONAL_CAR
            goto L_0x0334
        L_0x0312:
            com.moovit.commons.request.BadResponseException r2 = new com.moovit.commons.request.BadResponseException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown transport type: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x0329:
            com.moovit.tripplanner.TripPlannerTransportType r1 = com.moovit.tripplanner.TripPlannerTransportType.CAR
            goto L_0x0334
        L_0x032c:
            com.moovit.tripplanner.TripPlannerTransportType r1 = com.moovit.tripplanner.TripPlannerTransportType.MOPED
            goto L_0x0334
        L_0x032f:
            com.moovit.tripplanner.TripPlannerTransportType r1 = com.moovit.tripplanner.TripPlannerTransportType.SCOOTER
            goto L_0x0334
        L_0x0332:
            com.moovit.tripplanner.TripPlannerTransportType r1 = com.moovit.tripplanner.TripPlannerTransportType.BICYCLE
        L_0x0334:
            return r1
        L_0x0335:
            r1 = r22
            com.moovit.app.itinerary.suggestion.TripPlanSuggestionView r1 = (com.moovit.app.itinerary.suggestion.TripPlanSuggestionView) r1
            int r2 = com.moovit.app.home.dashboard.C14940f.f38219G
            com.moovit.itinerary.model.Itinerary r1 = r1.getItinerary()
            if (r1 == 0) goto L_0x0343
            java.lang.String r7 = r1.f41894b
        L_0x0343:
            return r7
        L_0x0344:
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = p826tr.C19753c.f50230y
            int r3 = r1.intValue()
            if (r3 == 0) goto L_0x036c
            if (r3 != r2) goto L_0x0355
            com.tranzmate.moovit.protocol.tripplanner.MVPolyLineMode r1 = com.tranzmate.moovit.protocol.tripplanner.MVPolyLineMode.CAR
            goto L_0x036e
        L_0x0355:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No matching found for: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x036c:
            com.tranzmate.moovit.protocol.tripplanner.MVPolyLineMode r1 = com.tranzmate.moovit.protocol.tripplanner.MVPolyLineMode.WALK
        L_0x036e:
            return r1
        L_0x036f:
            r1 = r22
            com.moovit.transit.LocationDescriptor r1 = (com.moovit.transit.LocationDescriptor) r1
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r1 = c70.C13749c.m34335u(r1)
            return r1
        L_0x0378:
            r1 = r22
            com.moovit.util.time.Time r1 = (com.moovit.util.time.Time) r1
            long r1 = r1.mo24631g()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2342l.convert(java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    public void mo5856d(C20839b bVar) {
    }

    /* renamed from: f */
    public Object mo245f(JsonReader jsonReader) {
        return C18028a.m44704d(jsonReader);
    }

    /* renamed from: i */
    public void mo246i(boolean z) {
        if (z) {
            C4405b bVar = C4405b.f15466a;
            try {
                GraphRequest graphRequest = new GraphRequest((AccessToken) null, C24362h.m61216k("/cloudbridge_settings", C0115o.m211b()), (Bundle) null, HttpMethod.GET, new C4404a(), 32);
                C2436x.C2437a aVar = C2436x.f8729d;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String str = C4405b.f15467b;
                if (str != null) {
                    C2436x.C2437a.m6390b(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
                    graphRequest.mo11904d();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            } catch (JSONException e) {
                C2436x.C2437a aVar2 = C2436x.f8729d;
                LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
                String str2 = C4405b.f15467b;
                if (str2 != null) {
                    C2436x.C2437a.m6390b(loggingBehavior2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", C18201b.m44927y(e));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
    }

    public boolean invoke(Object obj) {
        boolean z;
        switch (this.f8545b) {
            case 9:
                int i = C14764y.f37582n;
                ((C14764y.C14765a) obj).mo44736x1();
                return true;
            case 10:
                int i2 = C15161a.f39052i;
                ((C15161a.C15162a) obj).mo45597j0();
                return true;
            case 11:
                TodOrderActivity todOrderActivity = (TodOrderActivity) obj;
                int i3 = C20632a.f52163h;
                if (todOrderActivity.f40334C0) {
                    todOrderActivity.finish();
                } else {
                    TodOrderAssignment todOrderAssignment = todOrderActivity.f40352z0;
                    if (todOrderAssignment != null) {
                        todOrderActivity.f40345s0.mo52816a(todOrderAssignment.f40250h.f40290h);
                    }
                }
                return true;
            case 12:
                int i4 = C15584c.f40541o;
                ((C15584c.C15585a) obj).mo45129h1();
                return true;
            default:
                C13396b bVar = (C13396b) obj;
                int i5 = C13398c.f33251n;
                C13398c cVar = (C13398c) bVar.getChildFragmentManager().mo3983z(C25750e.container);
                int i6 = 0;
                if (cVar == null || !cVar.mo40268m2()) {
                    z = false;
                } else {
                    z = true;
                }
                ListItemView listItemView = bVar.f33249p;
                if (listItemView != null) {
                    if (!z) {
                        i6 = 8;
                    }
                    listItemView.setVisibility(i6);
                }
                return true;
        }
    }

    public Task then(Object obj) {
        List<T> list;
        switch (this.f8545b) {
            case 8:
                C14535a.C14536a aVar = (C14535a.C14536a) obj;
                return Tasks.forResult(null);
            case 13:
                C25547d dVar = (C25547d) obj;
                return Tasks.forResult(new C25643a.C25646c((CreditCardPaymentMethod) null));
            default:
                C12638d dVar2 = (C12638d) obj;
                if (dVar2 != null) {
                    dVar2.mo51499b();
                    list = dVar2.f48438c.mo40647e();
                } else {
                    list = null;
                }
                return Tasks.forResult(new C13324c.C13325a((List<LocationDescriptor>) list, (Map<LocationDescriptor, Integer>) null));
        }
    }
}
