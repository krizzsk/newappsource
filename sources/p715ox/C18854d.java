package p715ox;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.app.tod.model.TodDaysOfWeek;
import com.moovit.app.tod.order.TodPaymentInfo;
import com.moovit.app.tod.shuttle.model.TodTripOrder;
import com.moovit.app.tod.shuttle.model.TodTripOrderProposals;
import com.moovit.app.tod.shuttle.model.TodWeeklySubscriptionProposal;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPaymentInfo;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetTripOrderResponse;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodSubscriptionProposal;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrder;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrderProposals;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodWeeklySubscriptionProposal;
import java.io.IOException;
import mf0.C24362h;
import org.apache.thrift.TBase;
import p543hq.C17478e;

/* renamed from: ox.d */
public final class C18854d extends C13780t<C18853c, C18854d, MVTodGetTripOrderResponse> {

    /* renamed from: m */
    public TodTripOrder f48004m = null;

    /* renamed from: n */
    public TodPaymentInfo f48005n = null;

    public C18854d() {
        super(MVTodGetTripOrderResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        CurrencyAmount currencyAmount;
        TodWeeklySubscriptionProposal todWeeklySubscriptionProposal;
        boolean z;
        C18853c cVar = (C18853c) aVar;
        MVTodGetTripOrderResponse mVTodGetTripOrderResponse = (MVTodGetTripOrderResponse) tBase;
        MVTodTripOrder mVTodTripOrder = mVTodGetTripOrderResponse.order;
        String str = mVTodTripOrder.rideId;
        String str2 = null;
        if (mVTodTripOrder.mo34049f()) {
            currencyAmount = C13749c.m34318d(mVTodTripOrder.price);
        } else {
            currencyAmount = null;
        }
        MVTodTripOrderProposals mVTodTripOrderProposals = mVTodTripOrder.proposals;
        C24362h.m61211f(mVTodTripOrderProposals, "mvTripOrderProposals");
        if (mVTodTripOrderProposals.mo34058f()) {
            MVTodSubscriptionProposal mVTodSubscriptionProposal = mVTodTripOrderProposals.subscriptionProposal;
            C24362h.m61210e(mVTodSubscriptionProposal, "mvTripOrderProposals.subscriptionProposal");
            F f = mVTodSubscriptionProposal.setField_;
            F f2 = MVTodSubscriptionProposal._Fields.WEEKLY_SUBSCRIPTION;
            if (f == f2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new BadResponseException("Unsupported tod subscription proposals result");
            } else if (f == f2) {
                MVTodWeeklySubscriptionProposal mVTodWeeklySubscriptionProposal = (MVTodWeeklySubscriptionProposal) mVTodSubscriptionProposal.value_;
                C24362h.m61210e(mVTodWeeklySubscriptionProposal, "mvSubscriptionProposal.weeklySubscription");
                String str3 = mVTodWeeklySubscriptionProposal.f29783id;
                C24362h.m61210e(str3, "mvWeeklySubscriptionProposal.id");
                todWeeklySubscriptionProposal = new TodWeeklySubscriptionProposal(str3, new TodDaysOfWeek(C13720d.m34277g(mVTodWeeklySubscriptionProposal.availableDays.includedDays, (C13722f) null, new C17478e(4))));
            } else {
                MVTodSubscriptionProposal.m29821k((MVTodSubscriptionProposal._Fields) mVTodSubscriptionProposal.setField_);
                throw new RuntimeException("Cannot get field 'weeklySubscription' because union is currently set to weeklySubscription");
            }
        } else {
            todWeeklySubscriptionProposal = null;
        }
        this.f48004m = new TodTripOrder(str, currencyAmount, new TodTripOrderProposals(todWeeklySubscriptionProposal));
        MVTodPaymentInfo mVTodPaymentInfo = mVTodGetTripOrderResponse.paymentInfo;
        if (mVTodPaymentInfo.mo33636f()) {
            str2 = mVTodPaymentInfo.discountContextId;
        }
        this.f48005n = new TodPaymentInfo(mVTodPaymentInfo.paymentContext, mVTodPaymentInfo.paymentDescription, str2);
    }
}
