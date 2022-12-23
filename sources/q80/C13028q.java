package q80;

import android.content.Context;
import android.util.SparseArray;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.cash.CashGatewayToken;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken;
import com.moovit.payment.gateway.googlepay.GooglePayGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.ticketing.ticket.C7755c;
import com.moovit.ticketing.ticket.Ticket;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.ticketingV2.MVFilter;
import com.tranzmate.moovit.protocol.ticketingV2.MVProviderData;
import com.tranzmate.moovit.protocol.ticketingV2.MVProviderSpecificData;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicket;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingExternalPurchaseReport;
import h60.C17353s0;
import java.util.ArrayList;
import java.util.List;
import org.apache.thrift.TBase;
import p401bz.C13712f;
import p810sz.C19617r;
import p875vs.C20228e;
import p977zz.C20964s0;
import v80.C13184b;
import z80.C13342c;

/* renamed from: q80.q */
public final class C13028q extends C13712f implements PaymentGatewayToken.C16326a<MVPurchaseTicket, Void> {

    /* renamed from: c */
    public final ServerId f32235c;

    /* renamed from: d */
    public final C13184b f32236d;

    /* renamed from: e */
    public final List<Ticket> f32237e;

    /* renamed from: f */
    public final String f32238f;

    /* renamed from: g */
    public final long f32239g = System.currentTimeMillis();

    public C13028q(Context context, ServerId serverId, C13184b bVar, List<Ticket> list, String str) {
        super(context);
        C21100e.m49373x(serverId, "metroId");
        this.f32235c = serverId;
        C21100e.m49373x(bVar, "purchaseInfo");
        this.f32236d = bVar;
        this.f32237e = list;
        this.f32238f = str;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        boolean z;
        C13184b bVar = this.f32236d;
        TicketFare ticketFare = bVar.f32730b;
        int i = bVar.f32731c;
        if (((C13342c) bVar.f32734f.mo5765b(2)) != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.f32235c.f15142b;
        long j = this.f32239g;
        int i3 = ticketFare.f23327c.f15142b;
        String str = ticketFare.f23326b;
        String str2 = ticketFare.f23328d;
        MVCurrencyAmount p = C13749c.m34330p(ticketFare.f23330f);
        String str3 = ticketFare.f23333i.f23495b;
        MVPurchaseTicket mVPurchaseTicket = new MVPurchaseTicket();
        mVPurchaseTicket.metroId = i2;
        mVPurchaseTicket.mo32837y();
        mVPurchaseTicket.time = j;
        mVPurchaseTicket.mo32815E();
        mVPurchaseTicket.providerId = i3;
        mVPurchaseTicket.mo32813A();
        mVPurchaseTicket.fareId = str;
        mVPurchaseTicket.fareName = str2;
        mVPurchaseTicket.farePrice = p;
        mVPurchaseTicket.quantity = i;
        mVPurchaseTicket.mo32814D();
        mVPurchaseTicket.agencyKey = str3;
        mVPurchaseTicket.isSplitPayment = z;
        mVPurchaseTicket.mo32836w();
        PaymentGatewayToken paymentGatewayToken = (PaymentGatewayToken) this.f32236d.f32734f.mo5765b(1);
        if (paymentGatewayToken != null) {
            paymentGatewayToken.mo48944S(this, mVPurchaseTicket);
        }
        if (!C20964s0.m49090h(ticketFare.f23329e)) {
            mVPurchaseTicket.fareDescription = ticketFare.f23329e;
        }
        if (!C13717b.m34258e(this.f32237e)) {
            mVPurchaseTicket.ticketIds = C13720d.m34273c(this.f32237e, (C13722f) null, new C20228e(23));
            C7755c cVar = ((Ticket) C13717b.m34256c(this.f32237e)).f23487p;
            if (cVar != null) {
                mVPurchaseTicket.passbookId = cVar.f23533a;
            }
        }
        PurchaseFilters purchaseFilters = this.f32236d.f32733e;
        if (purchaseFilters != null) {
            C19617r rVar = C13036y.f32248a;
            int size = purchaseFilters.f23361b.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                MVFilter mVFilter = new MVFilter();
                mVFilter.title = purchaseFilters.f23361b.get(i4);
                mVFilter.value = purchaseFilters.f23362c.get(i4);
                arrayList.add(mVFilter);
            }
            mVPurchaseTicket.appliedFilters = arrayList;
        }
        SparseArray<String> sparseArray = ticketFare.f23337m;
        if (sparseArray != null) {
            int size2 = sparseArray.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i5 = 0; i5 < size2; i5++) {
                int keyAt = sparseArray.keyAt(i5);
                MVProviderData mVProviderData = new MVProviderData();
                mVProviderData.f28757id = (short) keyAt;
                mVProviderData.mo32459h(true);
                mVProviderData.data = sparseArray.valueAt(i5);
                arrayList2.add(mVProviderData);
            }
            MVProviderSpecificData mVProviderSpecificData = new MVProviderSpecificData();
            mVProviderSpecificData.data = arrayList2;
            mVPurchaseTicket.data = mVProviderSpecificData;
        }
        String str4 = this.f32238f;
        if (str4 != null) {
            mVPurchaseTicket.paymentData = str4;
        }
        MVTicketingExternalPurchaseReport mVTicketingExternalPurchaseReport = new MVTicketingExternalPurchaseReport();
        mVTicketingExternalPurchaseReport.setField_ = MVTicketingExternalPurchaseReport._Fields.TICKET;
        mVTicketingExternalPurchaseReport.value_ = mVPurchaseTicket;
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.TICKETING_EXTERNAL_PURCHASE_REPORT;
        mVServerMessage.value_ = mVTicketingExternalPurchaseReport;
        return mVServerMessage;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo22679c(CashGatewayToken cashGatewayToken, Object obj) {
        MVPurchaseTicket mVPurchaseTicket = (MVPurchaseTicket) obj;
        return null;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, Object obj) {
        MVPurchaseTicket mVPurchaseTicket = (MVPurchaseTicket) obj;
        return null;
    }

    /* renamed from: f */
    public final Object mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, Object obj) {
        ((MVPurchaseTicket) obj).paymentMethodId = C17353s0.m43405s(paymentMethodGatewayToken.f42706b);
        return null;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo22683j(GooglePayGatewayToken googlePayGatewayToken, Object obj) {
        MVPurchaseTicket mVPurchaseTicket = (MVPurchaseTicket) obj;
        return null;
    }
}
