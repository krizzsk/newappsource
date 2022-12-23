package p009a8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.JsonReader;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13721e;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.mediacodec.C3941c;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.C14415o;
import com.google.zxing.BarcodeFormat;
import com.moovit.app.mot.purchase.C15161a;
import com.moovit.image.model.QrCodeImage;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.account.paymentmethod.C25692a;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.veriff.sdk.internal.C22703xt;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import p025b6.C1489d;
import p041ca.C1835u;
import p171m8.C5717a;
import p173ma.C5735h;
import p173ma.C5739k;
import p236r8.C6265b;
import p236r8.C6267d;
import p237r9.C6269b;
import p262t8.C6606a;
import p289va.C6892c0;
import p583jk.C17884p;
import p601ke.C18028a;
import p684nq.C18584e;
import p838uf.C19904f;
import p924xt.C20586b;
import p977zz.C20949l;
import s60.C19433a;
import zendesk.support.SimpleArticle;
import zendesk.support.SuggestedArticleResponse;

/* renamed from: a8.l */
public final /* synthetic */ class C0112l implements FeatureManager.C2369a, C1835u.C1836a, C5739k, MediaCodecUtil.C3934e, C14415o.C14416a.C14417a, C19904f.C19905a, C18028a.C18029a, SuccessContinuation, RecyclerView.C1126h, C20949l, C22703xt, C13721e, C1489d.C1491b {

    /* renamed from: b */
    public final /* synthetic */ int f327b;

    public /* synthetic */ C0112l(int i) {
        this.f327b = i;
    }

    /* renamed from: a */
    public void mo250a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f327b) {
            case 0:
                messageDigest.update(bArr);
                messageDigest.update((byte[]) obj);
                return;
            default:
                C1489d<BarcodeFormat> dVar = QrCodeImage.f41816f;
                messageDigest.update(bArr);
                C17884p.m44381u(messageDigest, ((BarcodeFormat) obj).name());
                return;
        }
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        C6269b bVar = C1835u.f6351g;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: b */
    public C5735h[] mo252b(Uri uri, Map map) {
        return mo254d();
    }

    /* renamed from: c */
    public String mo253c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v5, types: [com.moovit.image.model.Image] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r9v11, types: [com.moovit.micromobility.MicroMobilityConfirmationInfo] */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object convert(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f327b
            r2 = 0
            r3 = 0
            switch(r1) {
                case 0: goto L_0x0211;
                case 1: goto L_0x01fb;
                case 2: goto L_0x01f0;
                case 3: goto L_0x01e5;
                case 4: goto L_0x01de;
                case 5: goto L_0x01c0;
                case 6: goto L_0x01b2;
                case 7: goto L_0x0122;
                case 8: goto L_0x0119;
                case 9: goto L_0x0110;
                case 10: goto L_0x0102;
                case 11: goto L_0x00f9;
                case 12: goto L_0x00eb;
                case 13: goto L_0x00b7;
                case 14: goto L_0x009c;
                case 15: goto L_0x0095;
                case 16: goto L_0x0081;
                case 17: goto L_0x0071;
                case 18: goto L_0x0059;
                case 19: goto L_0x0050;
                case 20: goto L_0x0019;
                case 21: goto L_0x0012;
                case 22: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x021f
        L_0x000b:
            r1 = r21
            com.moovit.ticketing.ticket.Ticket r1 = (com.moovit.ticketing.ticket.Ticket) r1
            com.moovit.ticketing.ticket.Ticket$Status r1 = r1.f23475d
            return r1
        L_0x0012:
            r1 = r21
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatusInfo r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatusInfo) r1
            java.lang.String r1 = r1.ticketId
            return r1
        L_0x0019:
            r1 = r21
            com.moovit.ticketing.ticket.TicketRef r1 = (com.moovit.ticketing.ticket.TicketRef) r1
            com.moovit.util.ParcelableMemRef<com.moovit.ticketing.ticket.Ticket> r4 = r1.f23517c
            if (r4 == 0) goto L_0x0027
            java.lang.Object r3 = r4.mo24562b()
            com.moovit.ticketing.ticket.Ticket r3 = (com.moovit.ticketing.ticket.Ticket) r3
        L_0x0027:
            if (r3 == 0) goto L_0x002e
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.forResult(r3)
            goto L_0x004f
        L_0x002e:
            m80.v r3 = m80.C12887v.m32668b()
            com.moovit.ticketing.ticket.TicketId r1 = r1.f23516b
            com.google.android.gms.tasks.Task r2 = r3.mo39736g(r2)
            java.util.concurrent.ExecutorService r4 = com.moovit.MoovitExecutors.COMPUTATION
            d0.v r5 = new d0.v
            r6 = 18
            r5.<init>(r1, r6)
            com.google.android.gms.tasks.Task r2 = r2.onSuccessTask(r4, r5)
            br.m r5 = new br.m
            r6 = 2
            r5.<init>(r6, r3, r1)
            com.google.android.gms.tasks.Task r1 = r2.continueWithTask(r4, r5)
        L_0x004f:
            return r1
        L_0x0050:
            r1 = r21
            com.tranzmate.moovit.protocol.serviceAlerts.MVAffectedLine r1 = (com.tranzmate.moovit.protocol.serviceAlerts.MVAffectedLine) r1
            com.moovit.servicealerts.ServiceAlertAffectedLine r1 = j80.C12776e.m32579c(r1)
            return r1
        L_0x0059:
            r1 = r21
            com.tranzmate.moovit.protocol.search.MVSearchResponseItem r1 = (com.tranzmate.moovit.protocol.search.MVSearchResponseItem) r1
            com.moovit.transit.LocationDescriptor r1 = z70.C13335l.m33606b(r1)
            com.moovit.image.model.Image r3 = r1.f23655j
            if (r3 != 0) goto L_0x0070
            com.moovit.image.model.ResourceImage r3 = new com.moovit.image.model.ResourceImage
            int r4 = p824tp.C19739q.ic_poi_location_24_on_surface_emphasis_high
            java.lang.String[] r2 = new java.lang.String[r2]
            r3.<init>(r4, r2)
            r1.f23655j = r3
        L_0x0070:
            return r1
        L_0x0071:
            r1 = r21
            com.tranzmate.moovit.protocol.payments.MVTOSLink r1 = (com.tranzmate.moovit.protocol.payments.MVTOSLink) r1
            sz.r r2 = h60.C17353s0.f44739a
            java.lang.String r2 = r1.text
            java.lang.String r1 = r1.action
            zz.i0 r3 = new zz.i0
            r3.<init>(r2, r1)
            return r3
        L_0x0081:
            r1 = r21
            com.tranzmate.moovit.protocol.payments.MVPaymentAccountContext r1 = (com.tranzmate.moovit.protocol.payments.MVPaymentAccountContext) r1
            sz.r r2 = h60.C17353s0.f44739a
            java.lang.String r2 = r1.paymentContext
            com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus r1 = r1.status
            com.moovit.payment.account.model.PaymentAccountContextStatus r1 = h60.C17353s0.m43395i(r1)
            com.moovit.payment.account.model.PaymentAccountContext r3 = new com.moovit.payment.account.model.PaymentAccountContext
            r3.<init>(r2, r1)
            return r3
        L_0x0095:
            r1 = r21
            com.moovit.payment.confirmation.summary.discounts.Discount r1 = (com.moovit.payment.confirmation.summary.discounts.Discount) r1
            java.lang.String r1 = r1.f42643c
            return r1
        L_0x009c:
            r1 = r21
            com.tranzmate.moovit.protocol.payments.MVClearanceBank r1 = (com.tranzmate.moovit.protocol.payments.MVClearanceBank) r1
            com.moovit.payment.clearance.model.Bank r2 = new com.moovit.payment.clearance.model.Bank
            java.lang.String r3 = r1.clearanceBankType
            int r4 = r1.bankId
            com.moovit.network.model.ServerId r5 = new com.moovit.network.model.ServerId
            r5.<init>(r4)
            java.lang.String r4 = r1.bankName
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r1 = r1.image
            com.moovit.image.model.Image r1 = com.moovit.image.C16028g.m40829g(r1)
            r2.<init>(r1, r5, r3, r4)
            return r2
        L_0x00b7:
            r1 = r21
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOption r1 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOption) r1
            java.lang.String r5 = r1.optionId
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r1.icon
            com.moovit.image.model.Image r6 = com.moovit.image.C16028g.m40829g(r2)
            java.lang.String r7 = r1.title
            java.lang.String r8 = r1.subtitle
            boolean r2 = r1.mo28867f()
            if (r2 == 0) goto L_0x00e3
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityConfirmation r1 = r1.confirmation
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r1.image
            com.moovit.image.model.Image r10 = com.moovit.image.C16028g.m40829g(r2)
            java.lang.String r11 = r1.title
            java.lang.String r12 = r1.text
            java.lang.String r13 = r1.positiveText
            java.lang.String r14 = r1.negetiveText
            com.moovit.micromobility.MicroMobilityConfirmationInfo r3 = new com.moovit.micromobility.MicroMobilityConfirmationInfo
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x00e3:
            r9 = r3
            com.moovit.micromobility.purchase.step.filter.MicroMobilityPurchaseFilter r1 = new com.moovit.micromobility.purchase.step.filter.MicroMobilityPurchaseFilter
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            return r1
        L_0x00eb:
            r1 = r21
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x00f9:
            r1 = r21
            android.location.Address r1 = (android.location.Address) r1
            com.moovit.transit.LocationDescriptor r1 = aa0.C7530f.m17274g(r1)
            return r1
        L_0x0102:
            r1 = r21
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x0110:
            r1 = r21
            com.moovit.itinerary.model.TurnInstruction r1 = (com.moovit.itinerary.model.TurnInstruction) r1
            com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction r1 = com.moovit.itinerary.C16080a.m40945a(r1)
            return r1
        L_0x0119:
            r1 = r21
            a20.a r1 = (a20.C13387a) r1
            com.moovit.image.model.Image r1 = r1.getImage()
            return r1
        L_0x0122:
            r1 = r21
            com.tranzmate.moovit.protocol.wondo.MVWondoOffer r1 = (com.tranzmate.moovit.protocol.wondo.MVWondoOffer) r1
            java.lang.String r5 = r1.providerName
            int r4 = r1.f30728id
            com.moovit.network.model.ServerId r6 = new com.moovit.network.model.ServerId
            r6.<init>(r4)
            java.lang.String r7 = r1.name
            com.tranzmate.moovit.protocol.wondo.MVWondoOfferDisplayInfo r4 = r1.displayInfo
            java.lang.String r8 = r4.iconUrl
            java.lang.String[] r9 = new java.lang.String[r2]
            com.moovit.image.model.UriImage r11 = com.moovit.image.model.UriImage.m40912c(r8, r9)
            java.lang.String r8 = r4.iconProviderUrl
            java.lang.String[] r2 = new java.lang.String[r2]
            com.moovit.image.model.UriImage r12 = com.moovit.image.model.UriImage.m40912c(r8, r2)
            java.lang.String r13 = r4.title
            java.lang.String r14 = r4.shortDescription
            java.lang.String r15 = r4.longDescription
            java.lang.String r2 = r4.availabilityDescription
            java.lang.String r8 = r4.legalUrl
            android.net.Uri r17 = android.net.Uri.parse(r8)
            boolean r8 = r4.isHighlight
            boolean r9 = r4.mo35690i()
            if (r9 != 0) goto L_0x015a
            goto L_0x0175
        L_0x015a:
            com.tranzmate.moovit.protocol.wondo.MVWondoOfferInstructions r4 = r4.instructions
            boolean r9 = r4.mo35703g()
            if (r9 == 0) goto L_0x0165
            java.lang.String r9 = r4.title
            goto L_0x0166
        L_0x0165:
            r9 = r3
        L_0x0166:
            boolean r10 = r4.mo35702f()
            if (r10 == 0) goto L_0x016f
            java.lang.String r4 = r4.subtitle
            goto L_0x0170
        L_0x016f:
            r4 = r3
        L_0x0170:
            if (r9 != 0) goto L_0x0178
            if (r4 == 0) goto L_0x0175
            goto L_0x0178
        L_0x0175:
            r19 = r3
            goto L_0x017f
        L_0x0178:
            zz.i0 r10 = new zz.i0
            r10.<init>(r9, r4)
            r19 = r10
        L_0x017f:
            com.moovit.app.wondo.tickets.model.WondoOfferDisplayInfo r9 = new com.moovit.app.wondo.tickets.model.WondoOfferDisplayInfo
            r10 = r9
            r16 = r2
            r18 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.List<com.tranzmate.moovit.protocol.wondo.MVWondoOfferPurchaseItem> r2 = r1.purchaseInfo
            lr.n r4 = new lr.n
            r8 = 9
            r4.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = r2.size()
            r8.<init>(r10)
            c00.C13720d.m34276f(r2, r3, r4, r8)
            com.moovit.app.wondo.tickets.model.WondoOfferPrice r2 = new com.moovit.app.wondo.tickets.model.WondoOfferPrice
            r2.<init>((java.util.ArrayList) r8)
            com.tranzmate.moovit.protocol.common.MVExternalAppData r1 = r1.externalAppData
            com.moovit.commons.utils.AppDeepLink r10 = c70.C13749c.m34315a(r1)
            com.moovit.app.wondo.tickets.model.WondoOffer r1 = new com.moovit.app.wondo.tickets.model.WondoOffer
            r4 = r1
            r8 = r9
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r1
        L_0x01b2:
            r1 = r21
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x01c0:
            r1 = r21
            com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerListItemSpec r1 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerListItemSpec) r1
            java.lang.String r2 = r1.text
            com.tranzmate.moovit.protocol.common.MVClientColorScheme r4 = r1.textColor
            com.moovit.util.ColorScheme r4 = c70.C13749c.m34316b(r4)
            boolean r5 = r1.mo33588f()
            if (r5 == 0) goto L_0x01d8
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r1 = r1.icon
            com.moovit.image.model.Image r3 = com.moovit.image.C16028g.m40829g(r1)
        L_0x01d8:
            fx.f r1 = new fx.f
            r1.<init>(r2, r4, r3)
            return r1
        L_0x01de:
            r1 = r21
            com.moovit.transit.TransitStop r1 = (com.moovit.transit.TransitStop) r1
            com.moovit.commons.geo.LatLonE6 r1 = r1.f23732d
            return r1
        L_0x01e5:
            r1 = r21
            com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegion r1 = (com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegion) r1
            int r1 = r1.regionId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x01f0:
            r1 = r21
            xt.d r1 = (p924xt.C20589d) r1
            int r1 = r1.f52075a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x01fb:
            r1 = r21
            zendesk.support.HelpItem r1 = (zendesk.support.HelpItem) r1
            com.moovit.app.help.helpcenter.model.HelpCenterSimpleSection r2 = new com.moovit.app.help.helpcenter.model.HelpCenterSimpleSection
            java.lang.Long r3 = r1.getId()
            long r3 = r3.longValue()
            java.lang.String r1 = r1.getName()
            r2.<init>(r3, r1)
            return r2
        L_0x0211:
            r1 = r21
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x021f:
            r1 = r21
            com.tranzmate.moovit.protocol.gtfs.MVBicycleProvider r1 = (com.tranzmate.moovit.protocol.gtfs.MVBicycleProvider) r1
            c00.c r2 = com.moovit.transit.C7841a.f23766a
            int r2 = r1.providerId
            com.moovit.network.model.ServerId r5 = new com.moovit.network.model.ServerId
            r5.<init>(r2)
            java.lang.String r6 = r1.name
            int r2 = r1.primaryColor
            zz.m0<java.lang.Integer> r4 = c70.C13749c.f33838a
            com.moovit.commons.utils.Color r7 = new com.moovit.commons.utils.Color
            r7.<init>(r2)
            int r2 = r1.secondaryColor
            com.moovit.commons.utils.Color r8 = new com.moovit.commons.utils.Color
            r8.<init>(r2)
            boolean r9 = r1.isRealTimeDataSupported
            boolean r2 = r1.mo27317j()
            if (r2 == 0) goto L_0x0250
            int r1 = r1.providerImage
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.moovit.image.model.Image r3 = com.moovit.image.C16028g.m40823a(r1)
        L_0x0250:
            r10 = r3
            com.moovit.transit.BicycleProvider r1 = new com.moovit.transit.BicycleProvider
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0112l.convert(java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    public C5735h[] mo254d() {
        return new C5735h[]{new C6892c0()};
    }

    /* renamed from: f */
    public Object mo245f(JsonReader jsonReader) {
        return C18028a.m44701a(jsonReader);
    }

    /* renamed from: g */
    public int mo255g(int i, int i2) {
        int i3 = C20586b.f52072c;
        return (i - i2) - 1;
    }

    /* renamed from: h */
    public int mo256h(Object obj) {
        Pattern pattern = MediaCodecUtil.f13830a;
        return ((C3941c) obj).f13853a.startsWith("OMX.google") ? 1 : 0;
    }

    /* renamed from: i */
    public void mo246i(boolean z) {
        Class<C6265b> cls;
        switch (this.f327b) {
            case 0:
                if (z) {
                    C0115o.f345o = true;
                    return;
                } else {
                    C0115o oVar = C0115o.f331a;
                    return;
                }
            case 1:
                if (z) {
                    C5717a aVar = C5717a.f18537a;
                    Class<C5717a> cls2 = C5717a.class;
                    if (!C6606a.m15601b(cls2)) {
                        try {
                            C5717a.f18538b = true;
                            C5717a.f18537a.mo21556b();
                            return;
                        } catch (Throwable th) {
                            C6606a.m15600a(cls2, th);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (z) {
                    AtomicBoolean atomicBoolean = C6267d.f19738a;
                    Class<C6267d> cls3 = C6267d.class;
                    synchronized (cls3) {
                        if (!C6606a.m15601b(cls3)) {
                            try {
                                if (!C6267d.f19738a.getAndSet(true)) {
                                    C0115o oVar2 = C0115o.f331a;
                                    if (C0098d0.m169b()) {
                                        C6267d.m14854a();
                                    }
                                    int i = C6265b.f19733a;
                                    cls = C6265b.class;
                                    if (!C6606a.m15601b(cls)) {
                                        C6265b.f19734b.scheduleAtFixedRate(C6265b.f19736d, 0, (long) 500, TimeUnit.MILLISECONDS);
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Throwable th2) {
                                C6606a.m15600a(cls3, th2);
                                break;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
        }
        return;
    }

    public boolean invoke(Object obj) {
        switch (this.f327b) {
            case 14:
                int i = C15161a.f39052i;
                ((C15161a.C15162a) obj).mo45597j0();
                return true;
            case 15:
                int i2 = C25692a.f64059i;
                ((C25692a.C25693a) obj).mo83441s0();
                return false;
            case 16:
                int i3 = PaymentGatewayFragment.f42661y;
                ((PaymentGatewayFragment.C16322a) obj).mo23107M();
                return true;
            default:
                String str = C19433a.f49434n;
                ((C19433a.C19434a) obj).mo51843R0();
                return true;
        }
    }

    public Task then(Object obj) {
        List<SimpleArticle> list;
        switch (this.f327b) {
            case 11:
                int i = C18584e.f47313w;
                return Tasks.forResult(Boolean.valueOf(!PaymentAccount.m64175c((PaymentAccount) obj, "IsraelMot", PaymentAccountContextStatus.BLACKLIST)));
            default:
                SuggestedArticleResponse suggestedArticleResponse = (SuggestedArticleResponse) obj;
                if (suggestedArticleResponse != null) {
                    list = suggestedArticleResponse.getResults();
                } else {
                    list = null;
                }
                return Tasks.forResult(list);
        }
    }
}
