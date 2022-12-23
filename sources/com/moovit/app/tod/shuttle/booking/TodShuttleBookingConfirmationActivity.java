package com.moovit.app.tod.shuttle.booking;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.C1026n0;
import b00.C13556a;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.TodRideActivity;
import com.moovit.app.tod.order.TodPaymentInfo;
import com.moovit.app.tod.shuttle.C15536a;
import com.moovit.app.tod.shuttle.model.TodShuttlePattern;
import com.moovit.app.tod.shuttle.model.TodShuttleSchedule;
import com.moovit.app.tod.shuttle.model.TodShuttleStop;
import com.moovit.app.tod.shuttle.model.TodShuttleTrip;
import com.moovit.app.tod.shuttle.model.TodSubscriptionEnroll;
import com.moovit.app.tod.shuttle.model.TodTripOrder;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.confirmation.summary.PaymentSummaryFragment;
import com.moovit.payment.gateway.AbstractPaymentGatewayActivity;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.util.List;
import java.util.Map;
import p039c7.C1800c;
import p543hq.C17474b;
import p715ox.C18851a;
import p715ox.C18852b;
import p715ox.C18853c;
import p715ox.C18854d;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p927xw.C20632a;
import w50.C20283g;
import y50.C20703a;
import z20.C20806a;

public class TodShuttleBookingConfirmationActivity extends AbstractPaymentGatewayActivity implements PaymentGatewayFragment.C16322a {

    /* renamed from: u0 */
    public static final /* synthetic */ int f40379u0 = 0;

    /* renamed from: X */
    public final C15537a f40380X = new C15537a();

    /* renamed from: Y */
    public final C15538b f40381Y = new C15538b();

    /* renamed from: Z */
    public TodTripOrder f40382Z;

    /* renamed from: l0 */
    public TodPaymentInfo f40383l0;

    /* renamed from: m0 */
    public TodShuttleBookingInfo f40384m0;

    /* renamed from: n0 */
    public ListItemView f40385n0;

    /* renamed from: o0 */
    public FormatTextView f40386o0;

    /* renamed from: p0 */
    public int f40387p0 = 1;

    /* renamed from: q0 */
    public TodSubscriptionEnroll f40388q0;

    /* renamed from: r0 */
    public C13556a f40389r0 = null;

    /* renamed from: s0 */
    public C13556a f40390s0 = null;

    /* renamed from: t0 */
    public C20283g f40391t0;

    /* renamed from: com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity$a */
    public class C15537a extends C20438i<C18853c, C18854d> {
        public C15537a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C18853c cVar2 = (C18853c) cVar;
            TodShuttleBookingConfirmationActivity.this.f40391t0.mo52456h(true);
            TodShuttleBookingConfirmationActivity.this.f40389r0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            int i;
            C18853c cVar2 = (C18853c) cVar;
            C18854d dVar = (C18854d) gVar;
            TodShuttleBookingConfirmationActivity todShuttleBookingConfirmationActivity = TodShuttleBookingConfirmationActivity.this;
            int i2 = TodShuttleBookingConfirmationActivity.f40379u0;
            todShuttleBookingConfirmationActivity.getClass();
            todShuttleBookingConfirmationActivity.f40382Z = dVar.f48004m;
            todShuttleBookingConfirmationActivity.f40383l0 = dVar.f48005n;
            PaymentSummaryFragment paymentSummaryFragment = (PaymentSummaryFragment) todShuttleBookingConfirmationActivity.mo44529n1(R.id.payment_summary);
            if (paymentSummaryFragment != null) {
                paymentSummaryFragment.f42622n.f51436j.postValue(todShuttleBookingConfirmationActivity.f40382Z.f40439c);
                paymentSummaryFragment.f42622n.f51435i.postValue(todShuttleBookingConfirmationActivity.f40383l0.f40365d);
            }
            PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) todShuttleBookingConfirmationActivity.mo44529n1(R.id.payment_method_view);
            if (paymentGatewayFragment != null) {
                paymentGatewayFragment.mo48928p2();
            }
            ListItemView listItemView = todShuttleBookingConfirmationActivity.f40385n0;
            if (todShuttleBookingConfirmationActivity.f40382Z.f40440d.f40441b != null) {
                i = 0;
            } else {
                i = 8;
            }
            listItemView.setVisibility(i);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C18853c cVar2 = (C18853c) cVar;
            TodShuttleBookingConfirmationActivity.m39726y2(TodShuttleBookingConfirmationActivity.this, exc);
            return true;
        }
    }

    /* renamed from: com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity$b */
    public class C15538b extends C20438i<C18851a, C18852b> {
        public C15538b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C18851a aVar = (C18851a) cVar;
            TodShuttleBookingConfirmationActivity todShuttleBookingConfirmationActivity = TodShuttleBookingConfirmationActivity.this;
            todShuttleBookingConfirmationActivity.f40390s0 = null;
            todShuttleBookingConfirmationActivity.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C18851a aVar = (C18851a) cVar;
            C18852b bVar = (C18852b) gVar;
            TodShuttleBookingConfirmationActivity todShuttleBookingConfirmationActivity = TodShuttleBookingConfirmationActivity.this;
            int i = TodShuttleBookingConfirmationActivity.f40379u0;
            todShuttleBookingConfirmationActivity.getClass();
            PaymentRegistrationInstructions paymentRegistrationInstructions = bVar.f47998n;
            if (paymentRegistrationInstructions != null) {
                todShuttleBookingConfirmationActivity.startActivity(PaymentRegistrationActivity.m41719z2(todShuttleBookingConfirmationActivity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions));
                return;
            }
            String str = bVar.f47997m;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BOOK_RESULT);
            aVar2.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
            aVar2.mo49939g(AnalyticsAttributeKey.ID, str);
            todShuttleBookingConfirmationActivity.mo44545v2(aVar2.mo49933a());
            TodShuttleBookingInfo todShuttleBookingInfo = todShuttleBookingConfirmationActivity.f40384m0;
            TodShuttleStop b = todShuttleBookingInfo.f40396d.f40432c.mo46434b(todShuttleBookingInfo.f40397e);
            TodShuttleBookingInfo todShuttleBookingInfo2 = todShuttleBookingConfirmationActivity.f40384m0;
            TodShuttleStop b2 = todShuttleBookingInfo2.f40396d.f40432c.mo46434b(todShuttleBookingInfo2.f40398f);
            C20806a.C20807a aVar3 = new C20806a.C20807a(ProductAction.ACTION_PURCHASE);
            aVar3.mo52934b("tod", "feature");
            aVar3.mo52934b(Integer.valueOf(todShuttleBookingConfirmationActivity.f40387p0), "number_of_items");
            aVar3.mo52934b(b.f40429d, "origin_address");
            aVar3.mo52934b(b2.f40429d, "destination_address");
            aVar3.mo52935c();
            Toast.makeText(todShuttleBookingConfirmationActivity, R.string.tod_shuttle_confirmation_booked, 1).show();
            todShuttleBookingConfirmationActivity.startActivity(TodRideActivity.m39513z2(todShuttleBookingConfirmationActivity, str));
            C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.STEP_COMPLETED);
            aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "tod_shuttle_confirmation_step");
            todShuttleBookingConfirmationActivity.mo44545v2(aVar4.mo49933a());
            todShuttleBookingConfirmationActivity.mo44545v2(new C17474b(AnalyticsEventKey.STEPS_COMPLETED));
            todShuttleBookingConfirmationActivity.setResult(-1);
            todShuttleBookingConfirmationActivity.finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C18851a aVar = (C18851a) cVar;
            TodShuttleBookingConfirmationActivity.m39726y2(TodShuttleBookingConfirmationActivity.this, exc);
            return true;
        }
    }

    /* renamed from: y2 */
    public static void m39726y2(TodShuttleBookingConfirmationActivity todShuttleBookingConfirmationActivity, Exception exc) {
        todShuttleBookingConfirmationActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BOOK_RESULT);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
        todShuttleBookingConfirmationActivity.mo44545v2(aVar.mo49933a());
        if (exc instanceof UserRequestError) {
            UserRequestError userRequestError = (UserRequestError) exc;
            C20632a.m48506S1(userRequestError.mo49162d(), 0, userRequestError.mo49161c(), false).show(todShuttleBookingConfirmationActivity.getSupportFragmentManager(), "TodErrorMessageDialogFragment");
            return;
        }
        new C20632a().show(todShuttleBookingConfirmationActivity.getSupportFragmentManager(), "TodErrorMessageDialogFragment");
    }

    /* renamed from: A1 */
    public final /* synthetic */ boolean mo23103A1() {
        return false;
    }

    /* renamed from: A2 */
    public final void mo46416A2(int i) {
        mo46417z2();
        C13556a aVar = this.f40390s0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f40390s0 = null;
        }
        C13752e x1 = mo44548x1();
        TodShuttleBookingInfo todShuttleBookingInfo = this.f40384m0;
        C18853c cVar = new C18853c(x1, todShuttleBookingInfo.f40394b, todShuttleBookingInfo.f40396d.f40431b, todShuttleBookingInfo.f40397e, todShuttleBookingInfo.f40398f, i);
        this.f40391t0.mo52456h(false);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C18853c.class, sb, "_");
        sb.append(cVar.f48000w);
        sb.append("_");
        sb.append(cVar.f48001x);
        sb.append("_");
        sb.append(cVar.f48002y);
        sb.append("_");
        sb.append(cVar.f48003z);
        sb.append("_");
        sb.append(cVar.f47999A);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f40389r0 = mo44527k2(sb2, cVar, requestOptions, this.f40380X);
    }

    /* renamed from: E */
    public final /* synthetic */ void mo23104E() {
    }

    /* renamed from: I */
    public final PaymentGatewayInfo mo23105I() {
        TodPaymentInfo todPaymentInfo = this.f40383l0;
        if (todPaymentInfo == null) {
            return null;
        }
        return new PaymentGatewayInfo(todPaymentInfo.f40363b, PurchaseVerificationType.NONE, todPaymentInfo.f40364c, (Map<String, String>) null);
    }

    /* renamed from: L */
    public final CharSequence mo23106L() {
        return getString(R.string.tod_shuttle_confirmation_button);
    }

    /* renamed from: M */
    public final void mo23107M() {
        mo46416A2(this.f40387p0);
    }

    /* renamed from: c0 */
    public final void mo23108c0(PaymentGatewayToken paymentGatewayToken) {
        C20703a e = this.f40391t0.mo52454e();
        if (e != null && this.f40382Z != null) {
            C13556a aVar = this.f40390s0;
            if (aVar != null) {
                aVar.cancel(true);
                this.f40390s0 = null;
            }
            mo46417z2();
            String str = this.f40382Z.f40438b;
            CurrencyAmount currencyAmount = e.f52282f;
            mo44543u2((CharSequence) null);
            C18851a aVar2 = new C18851a(mo44548x1(), str, currencyAmount, paymentGatewayToken, this.f40388q0);
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C18851a.class, sb, "_");
            sb.append(aVar2.f47993w);
            sb.append("_");
            sb.append(aVar2.f47994x);
            sb.append("_");
            sb.append(aVar2.f47995y);
            sb.append("_");
            sb.append(aVar2.f47996z);
            String sb2 = sb.toString();
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            this.f40390s0 = mo44527k2(sb2, aVar2, requestOptions, this.f40381Y);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        String str;
        String str2;
        boolean z;
        int i;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.tod_shuttle_booking_confirmation_activity);
        this.f40391t0 = (C20283g) new C1026n0(this).mo4313a(C20283g.class);
        this.f40384m0 = (TodShuttleBookingInfo) getIntent().getParcelableExtra("bookingInfo");
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo800v(R.string.tod_shuttle_confirmation_header);
        }
        if (bundle != null) {
            this.f40382Z = (TodTripOrder) bundle.getParcelable("order");
            this.f40383l0 = (TodPaymentInfo) bundle.getParcelable("paymentInfo");
            this.f40387p0 = bundle.getInt("passengersCount");
            this.f40388q0 = (TodSubscriptionEnroll) bundle.getParcelable("subscriptionEnroll");
        }
        ((TextView) findViewById(R.id.date)).setText(C7925b.m18015c(this, this.f40384m0.f40395c));
        TodShuttleTrip todShuttleTrip = this.f40384m0.f40396d;
        TodShuttlePattern todShuttlePattern = todShuttleTrip.f40432c;
        ((TextView) findViewById(R.id.pattern_name)).setText(todShuttlePattern.f40419c);
        ListItemView listItemView = (ListItemView) findViewById(R.id.pattern_org_dst);
        listItemView.setTitle((CharSequence) todShuttlePattern.f40420d.get(0).f40429d);
        List<TodShuttleStop> list = todShuttlePattern.f40420d;
        listItemView.setSubtitle((CharSequence) list.get(list.size() - 1).f40429d);
        TodShuttleStop b = todShuttlePattern.mo46434b(this.f40384m0.f40397e);
        TodShuttleSchedule todShuttleSchedule = todShuttleTrip.f40433d;
        int i2 = this.f40384m0.f40397e;
        long[] jArr = todShuttleSchedule.f40425b;
        C21100e.m49375y(0, jArr.length - 1, "index", i2);
        long j = jArr[i2];
        ListItemView listItemView2 = (ListItemView) findViewById(R.id.pickup);
        listItemView2.setSubtitle((CharSequence) b.f40429d);
        String str3 = null;
        if (!todShuttleTrip.f40435f) {
            str = C7925b.m18024l(this, j);
        } else {
            str = null;
        }
        listItemView2.setAccessoryText((CharSequence) str);
        TodShuttleStop b2 = todShuttlePattern.mo46434b(this.f40384m0.f40398f);
        TodShuttleSchedule todShuttleSchedule2 = todShuttleTrip.f40433d;
        int i3 = this.f40384m0.f40398f;
        long[] jArr2 = todShuttleSchedule2.f40425b;
        C21100e.m49375y(0, jArr2.length - 1, "index", i3);
        long j2 = jArr2[i3];
        ListItemView listItemView3 = (ListItemView) findViewById(R.id.drop_off);
        listItemView3.setSubtitle((CharSequence) b2.f40429d);
        if (!todShuttleTrip.f40435f) {
            str2 = C7925b.m18024l(this, j2);
        } else {
            str2 = null;
        }
        listItemView3.setAccessoryText((CharSequence) str2);
        ListItemView listItemView4 = (ListItemView) findViewById(R.id.subscription_enroll);
        this.f40385n0 = listItemView4;
        listItemView4.setSubtitle((CharSequence) C15536a.m39720c(this, this.f40388q0));
        ListItemView listItemView5 = this.f40385n0;
        List<Integer> a = C15536a.m39718a(this.f40388q0);
        if (a != null) {
            z = !a.isEmpty();
        } else {
            z = false;
        }
        if (z) {
            i = R.string.action_change;
        } else {
            i = R.string.action_set;
        }
        listItemView5.setAccessoryText(i);
        this.f40385n0.getAccessoryView().setOnClickListener(new C4052r(this, 27));
        long j3 = todShuttleTrip.f40434e;
        TextView textView = (TextView) findViewById(R.id.lock_time);
        if (todShuttleTrip.f40435f) {
            str3 = getString(R.string.tod_passenger_ride_status_future_time_message, new Object[]{C7925b.m18017e(this, j3), C7925b.m18024l(this, j3)});
        }
        UiUtils.m40234B(textView, str3);
        FormatTextView formatTextView = (FormatTextView) findViewById(R.id.passenger_count);
        this.f40386o0 = formatTextView;
        formatTextView.setArguments(Integer.valueOf(this.f40387p0));
        ((Button) findViewById(R.id.change_button)).setOnClickListener(new C1800c(this, 28));
        if (this.f40389r0 == null) {
            mo46416A2(this.f40387p0);
        }
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("order", this.f40382Z);
        bundle.putParcelable("paymentInfo", this.f40383l0);
        bundle.putInt("passengersCount", this.f40387p0);
        bundle.putParcelable("subscriptionEnroll", this.f40388q0);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_shuttle_confirmation_step");
        aVar.mo49939g(AnalyticsAttributeKey.ZONE_ID, this.f40384m0.f40394b.mo19751c());
        aVar.mo49939g(AnalyticsAttributeKey.TRIP_ID, this.f40384m0.f40396d.f40431b);
        TodShuttleBookingInfo todShuttleBookingInfo = this.f40384m0;
        int i = todShuttleBookingInfo.f40397e;
        TodShuttleStop b = todShuttleBookingInfo.f40396d.f40432c.mo46434b(i);
        aVar.mo49939g(AnalyticsAttributeKey.ORIGIN_INDEX, Integer.toString(i));
        aVar.mo49939g(AnalyticsAttributeKey.FROM_STOP, b.f40427b.mo19751c());
        TodShuttleBookingInfo todShuttleBookingInfo2 = this.f40384m0;
        int i2 = todShuttleBookingInfo2.f40398f;
        TodShuttleStop b2 = todShuttleBookingInfo2.f40396d.f40432c.mo46434b(i2);
        aVar.mo49939g(AnalyticsAttributeKey.DESTINATION_INDEX, Integer.toString(i2));
        aVar.mo49939g(AnalyticsAttributeKey.TO_STOP, b2.f40427b.mo19751c());
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        mo46417z2();
        C13556a aVar = this.f40390s0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f40390s0 = null;
        }
    }

    /* renamed from: n0 */
    public final C17474b.C17475a mo23109n0() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "purchase_button_clicked");
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, this.f40387p0);
        return aVar;
    }

    /* renamed from: z2 */
    public final void mo46417z2() {
        C13556a aVar = this.f40389r0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f40391t0.mo52456h(true);
            this.f40389r0 = null;
        }
    }
}
