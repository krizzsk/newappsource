package p376ax;

import android.content.Context;
import android.widget.TextView;
import androidx.camera.camera2.internal.C0509c;
import androidx.lifecycle.C1044w;
import androidx.recyclerview.widget.ConcatAdapter;
import c00.C13717b;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.bookingflow.model.FailureReason;
import com.moovit.app.tod.bookingflow.model.TodBookingDropOffLocationState;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.LineStyle;
import com.moovit.payment.account.deposit.C25643a;
import com.moovit.payment.account.deposit.DepositActivity;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.confirmation.summary.PaymentSummaryFragment;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.ticketing.purchase.cart.CartInfo;
import com.moovit.ticketing.purchase.cart.CartItem;
import com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import java.util.List;
import m80.C12869e;
import p453dw.C16740o;
import p543hq.C17474b;
import p739px.C19037a;
import p950yw.C20776c;
import p950yw.C20777d;
import p950yw.C20779f;
import w50.C20283g;

/* renamed from: ax.e */
public final /* synthetic */ class C13543e implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f33475a;

    /* renamed from: b */
    public final /* synthetic */ Object f33476b;

    public /* synthetic */ C13543e(Object obj, int i) {
        this.f33475a = i;
        this.f33476b = obj;
    }

    public final void onChanged(Object obj) {
        String str;
        boolean z = true;
        switch (this.f33475a) {
            case 0:
                C13544f fVar = (C13544f) this.f33476b;
                TodBookingDropOffLocationState todBookingDropOffLocationState = (TodBookingDropOffLocationState) obj;
                int i = C13544f.f33477u;
                if (fVar.mo40436p2().f40078j.getValue() == null) {
                    z = false;
                }
                if (!z) {
                    fVar.mo40434n2().mo52905a(R.string.tod_order_map_selection_destination_hint);
                }
                if (todBookingDropOffLocationState != null) {
                    C20779f o2 = fVar.mo40435o2();
                    o2.f52430b.mo48610F2();
                    o2.f52430b.mo48613I2();
                    LocationDescriptor locationDescriptor = todBookingDropOffLocationState.f40091b;
                    o2.mo52909b(R.drawable.img_tod_map_trip_start_24, locationDescriptor);
                    LocationDescriptor locationDescriptor2 = todBookingDropOffLocationState.f40092c;
                    if (locationDescriptor2 != null) {
                        if (!FailureReason.OUT_OF_AREA.equals(todBookingDropOffLocationState.f40093d)) {
                            o2.mo52909b(R.drawable.img_tod_map_trip_end_24, locationDescriptor2);
                            LatLonE6 d = locationDescriptor.mo24310d();
                            LatLonE6 d2 = locationDescriptor2.mo24310d();
                            LineStyle lineStyle = o2.f52431c;
                            o2.f52430b.mo48613I2();
                            Tasks.call(MoovitExecutors.COMPUTATION, new C20776c(d, d2, 0)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C20777d(0, o2, lineStyle));
                        }
                        o2.mo52908a(new C0509c(13, o2, locationDescriptor2));
                    }
                    Context context = fVar.f33478r.getContext();
                    LocationDescriptor locationDescriptor3 = todBookingDropOffLocationState.f40092c;
                    TextView textView = fVar.f33478r;
                    if (locationDescriptor3 != null) {
                        str = locationDescriptor3.mo24313f();
                    } else {
                        str = context.getString(R.string.tod_order_map_selection_destination_placeholder);
                    }
                    textView.setText(str);
                    FailureReason failureReason = todBookingDropOffLocationState.f40093d;
                    fVar.f33479s.setEnabled(FailureReason.NONE.equals(failureReason));
                    if (locationDescriptor3 != null) {
                        fVar.mo40424A2(failureReason);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                DepositActivity depositActivity = (DepositActivity) this.f33476b;
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                if (paymentMethod == null) {
                    depositActivity.f63950Y.setVisibility(8);
                    depositActivity.f63952l0.setOnClickListener(new C19037a(depositActivity, 9));
                    depositActivity.f63952l0.setTag((Object) null);
                    return;
                }
                int i2 = DepositActivity.f63947m0;
                depositActivity.getClass();
                paymentMethod.mo83416b(depositActivity, null);
                depositActivity.f63950Y.setVisibility(0);
                depositActivity.f63952l0.setOnClickListener(new C16740o(depositActivity, 12));
                depositActivity.f63952l0.setTag(paymentMethod);
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_method");
                aVar.mo49938f(AnalyticsAttributeKey.ID, paymentMethod.f64052b);
                depositActivity.mo44545v2(aVar.mo49933a());
                return;
            case 2:
                C25643a aVar2 = (C25643a) this.f33476b;
                aVar2.mo83450c(aVar2.f63966f.getValue(), (PaymentMethod) obj);
                return;
            case 3:
                C20283g gVar = (C20283g) this.f33476b;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = Boolean.TRUE;
                if (bool2.equals(gVar.f51431e.getValue()) || !bool2.equals(bool)) {
                    z = false;
                }
                gVar.f51433g.postValue(Boolean.valueOf(z));
                return;
            case 4:
                PaymentSummaryFragment paymentSummaryFragment = (PaymentSummaryFragment) this.f33476b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (paymentSummaryFragment.f42625q.getVisibility() == 8) {
                    paymentSummaryFragment.f42626r.mo3435a();
                    return;
                } else if (booleanValue) {
                    paymentSummaryFragment.f42626r.mo3435a();
                    return;
                } else {
                    paymentSummaryFragment.f42626r.mo3436b();
                    return;
                }
            case 5:
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) this.f33476b;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                paymentGatewayFragment.f42669u.setEnabled(booleanValue2);
                paymentGatewayFragment.f42670v.setEnabled(booleanValue2);
                return;
            default:
                PurchaseCartConfirmationActivity purchaseCartConfirmationActivity = (PurchaseCartConfirmationActivity) this.f33476b;
                CartInfo cartInfo = (CartInfo) obj;
                int i3 = PurchaseCartConfirmationActivity.f23266o0;
                purchaseCartConfirmationActivity.getClass();
                List<CartItem> list = cartInfo.f23255d;
                C20283g gVar2 = purchaseCartConfirmationActivity.f23272n0;
                gVar2.f51436j.postValue(cartInfo.f23256e);
                PaymentGatewayFragment paymentGatewayFragment2 = (PaymentGatewayFragment) purchaseCartConfirmationActivity.getSupportFragmentManager().mo3983z(C12869e.payment_method_view);
                if (paymentGatewayFragment2 != null) {
                    paymentGatewayFragment2.mo48928p2();
                }
                if (C13717b.m34258e(list)) {
                    purchaseCartConfirmationActivity.f23270l0.setAdapter(purchaseCartConfirmationActivity.f23267X);
                    return;
                }
                purchaseCartConfirmationActivity.f23270l0.setAdapter(new ConcatAdapter(new PurchaseCartConfirmationActivity.C7653c(list), purchaseCartConfirmationActivity.f23268Y));
                return;
        }
    }
}
