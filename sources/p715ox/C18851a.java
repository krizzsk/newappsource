package p715ox;

import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.app.tod.shuttle.model.TodSubscriptionEnroll;
import com.moovit.app.tod.shuttle.model.TodWeeklySubscriptionEnroll;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.cash.CashGatewayToken;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken;
import com.moovit.payment.gateway.googlepay.GooglePayGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.payments.MVCashPaymentData;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData;
import com.tranzmate.moovit.protocol.payments.MVGooglePayPaymentData;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodDaysOfWeek;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodBookTripOrderRequest;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodSubscriptionEnroll;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodWeeklySubscriptionEnroll;
import h60.C17353s0;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import p054d0.C4303q;

/* renamed from: ox.a */
public final class C18851a extends C13778r<C18851a, C18852b, MVTodBookTripOrderRequest> implements PaymentGatewayToken.C16326a<MVTodBookTripOrderRequest, Void> {

    /* renamed from: w */
    public final String f47993w;

    /* renamed from: x */
    public final CurrencyAmount f47994x;

    /* renamed from: y */
    public final PaymentGatewayToken f47995y;

    /* renamed from: z */
    public final TodSubscriptionEnroll f47996z;

    public C18851a(C13752e eVar, String str, CurrencyAmount currencyAmount, PaymentGatewayToken paymentGatewayToken, TodSubscriptionEnroll todSubscriptionEnroll) {
        super(eVar, R.string.api_path_tod_shuttles_book_order_request, C18852b.class);
        C21100e.m49373x(str, "rideId");
        this.f47993w = str;
        this.f47994x = currencyAmount;
        this.f47995y = paymentGatewayToken;
        this.f47996z = todSubscriptionEnroll;
        RO mVTodBookTripOrderRequest = new MVTodBookTripOrderRequest();
        mVTodBookTripOrderRequest.rideId = str;
        if (currencyAmount != null) {
            mVTodBookTripOrderRequest.price = C13749c.m34330p(currencyAmount);
        }
        if (paymentGatewayToken != null) {
            paymentGatewayToken.mo48944S(this, mVTodBookTripOrderRequest);
        }
        if (todSubscriptionEnroll != null) {
            if (todSubscriptionEnroll instanceof TodWeeklySubscriptionEnroll) {
                String id = todSubscriptionEnroll.getId();
                HashSet<O> g = C13720d.m34277g(((TodWeeklySubscriptionEnroll) todSubscriptionEnroll).f40443d.f40238b, (C13722f) null, new C4303q(8));
                MVTodDaysOfWeek mVTodDaysOfWeek = new MVTodDaysOfWeek();
                mVTodDaysOfWeek.includedDays = g;
                MVTodWeeklySubscriptionEnroll mVTodWeeklySubscriptionEnroll = new MVTodWeeklySubscriptionEnroll();
                mVTodWeeklySubscriptionEnroll.weeklySubscriptionId = id;
                mVTodWeeklySubscriptionEnroll.selectedDays = mVTodDaysOfWeek;
                MVTodSubscriptionEnroll mVTodSubscriptionEnroll = new MVTodSubscriptionEnroll();
                mVTodSubscriptionEnroll.setField_ = MVTodSubscriptionEnroll._Fields.WEEKLY_ENROLL;
                mVTodSubscriptionEnroll.value_ = mVTodWeeklySubscriptionEnroll;
                mVTodBookTripOrderRequest.subscriptionEnroll = mVTodSubscriptionEnroll;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.f33922v = mVTodBookTripOrderRequest;
    }

    /* renamed from: c */
    public final Object mo22679c(CashGatewayToken cashGatewayToken, Object obj) {
        ((MVTodBookTripOrderRequest) obj).paymentProvider = MVPaymentProvider.m24870k(new MVCashPaymentData());
        return null;
    }

    /* renamed from: d */
    public final Object mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, Object obj) {
        ((MVTodBookTripOrderRequest) obj).paymentProvider = MVPaymentProvider.m24871l(new MVClearanceProviderPaymentData(C17353s0.m43403q(clearanceProviderGatewayToken.f42692b), clearanceProviderGatewayToken.f42693c));
        return null;
    }

    /* renamed from: f */
    public final Object mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, Object obj) {
        ((MVTodBookTripOrderRequest) obj).paymentProvider = MVPaymentProvider.m24873o(C17353s0.m43405s(paymentMethodGatewayToken.f42706b));
        return null;
    }

    /* renamed from: j */
    public final Object mo22683j(GooglePayGatewayToken googlePayGatewayToken, Object obj) {
        ((MVTodBookTripOrderRequest) obj).paymentProvider = MVPaymentProvider.m24872n(new MVGooglePayPaymentData(googlePayGatewayToken.f42698b));
        return null;
    }
}
