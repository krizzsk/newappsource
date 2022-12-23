package p923xs;

import a00.C13382a;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C1044w;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c70.C13751d;
import c90.C7579b;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.help.helpcenter.HelpCenterActivity;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.order.TodOrderActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.LineStyle;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Calendar;
import p304x.C7070l;
import p312x8.C7178a;
import p376ax.C13542d;
import p376ax.C13546h;
import p923xs.C20573g;
import p946ys.C20761b;
import p950yw.C20776c;
import p950yw.C20777d;
import p950yw.C20779f;
import p977zz.C20961r;
import p977zz.C20964s0;

/* renamed from: xs.h */
public final /* synthetic */ class C20576h implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f52049a;

    /* renamed from: b */
    public final /* synthetic */ Object f52050b;

    public /* synthetic */ C20576h(Object obj, int i) {
        this.f52049a = i;
        this.f52050b = obj;
    }

    public final void onChanged(Object obj) {
        T t;
        int i;
        long j;
        String str;
        PaymentGatewayToken paymentGatewayToken;
        boolean z = true;
        int i2 = 0;
        switch (this.f52049a) {
            case 0:
                C20577i iVar = (C20577i) this.f52050b;
                C20961r rVar = (C20961r) obj;
                int i3 = C20577i.f52051t;
                iVar.getClass();
                if (!rVar.f52711a || (t = rVar.f52712b) == null) {
                    iVar.f52057s.mo4627l0(iVar.f52052n);
                    return;
                }
                C20761b bVar = (C20761b) t;
                String str2 = bVar.f52383b;
                iVar.f52056r = str2;
                ((HelpCenterActivity) iVar.f40822c).setTitle(str2);
                ArrayList arrayList = new ArrayList(2);
                if (!C13717b.m34258e(bVar.f52385d)) {
                    if (C20964s0.m49090h(bVar.f52384c)) {
                        i = 10;
                    } else {
                        i = 11;
                    }
                    arrayList.add(new C20573g.C20574a(i, bVar.f52384c, bVar.f52385d));
                }
                if (!C13717b.m34258e(bVar.f52386e)) {
                    arrayList.add(new C20573g.C20574a(12, (String) null, bVar.f52386e));
                }
                iVar.f52053o.mo51055y(arrayList);
                RecyclerView.Adapter adapter = iVar.f52057s.getAdapter();
                C20573g gVar = iVar.f52053o;
                if (adapter != gVar) {
                    iVar.f52057s.mo4627l0(gVar);
                    return;
                }
                return;
            case 1:
                TodBookingOrderViewModel todBookingOrderViewModel = (TodBookingOrderViewModel) this.f52050b;
                todBookingOrderViewModel.mo46214c((C20961r) obj, todBookingOrderViewModel.f40073e.getValue(), todBookingOrderViewModel.f40078j.getValue());
                return;
            case 2:
                C13542d dVar = (C13542d) this.f52050b;
                TodOrderActivity.TodOrderInfo todOrderInfo = (TodOrderActivity.TodOrderInfo) obj;
                int i4 = C13542d.f33471r;
                if (todOrderInfo == null) {
                    dVar.getClass();
                    return;
                }
                C20779f o2 = dVar.mo40435o2();
                o2.f52430b.mo48610F2();
                o2.f52430b.mo48612H2();
                o2.f52434f.clear();
                LocationDescriptor locationDescriptor = todOrderInfo.f40353b;
                MarkerZoomStyle b = o2.mo52909b(R.drawable.img_tod_map_trip_start_24, locationDescriptor);
                LocationDescriptor locationDescriptor2 = todOrderInfo.f40354c;
                MarkerZoomStyle b2 = o2.mo52909b(R.drawable.img_tod_map_trip_end_24, locationDescriptor2);
                LatLonE6 d = locationDescriptor.mo24310d();
                LatLonE6 d2 = locationDescriptor2.mo24310d();
                LineStyle lineStyle = o2.f52432d;
                o2.f52430b.mo48613I2();
                Tasks.call(MoovitExecutors.COMPUTATION, new C20776c(d, d2, 0)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C20777d(0, o2, lineStyle));
                o2.mo52908a(new C7178a(o2, d, d2, b, b2, 1));
                Context context = dVar.f33472o.getContext();
                String f = todOrderInfo.f40353b.mo24313f();
                dVar.f33472o.setText(f);
                C13382a.m33674j(dVar.f33472o, context.getString(R.string.tod_passenger_journey_pickup_label), f);
                String f2 = todOrderInfo.f40354c.mo24313f();
                dVar.f33473p.setText(f2);
                C13382a.m33674j(dVar.f33473p, context.getString(R.string.tod_passenger_journey_dropoff_label), f2);
                TripPlannerTime tripPlannerTime = todOrderInfo.f40355d;
                if (tripPlannerTime != null) {
                    j = tripPlannerTime.mo24487b();
                } else {
                    j = -1;
                }
                TextView textView = dVar.f33474q;
                Context context2 = textView.getContext();
                if (j != -1) {
                    z = false;
                }
                if (z) {
                    str = context2.getString(R.string.time_picker_leave_now);
                } else {
                    str = C7925b.m18018f(context2, j, false);
                }
                textView.setText(str);
                return;
            case 3:
                C13546h hVar = (C13546h) this.f52050b;
                hVar.f33486t.setEnabled(false);
                ProgressBar progressBar = hVar.f33487u;
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    i2 = 8;
                }
                progressBar.setVisibility(i2);
                return;
            case 4:
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) this.f52050b;
                PaymentGateway.Tokenizer.Result result = (PaymentGateway.Tokenizer.Result) obj;
                int i5 = PaymentGatewayFragment.f42661y;
                paymentGatewayFragment.getClass();
                int i6 = result.f42653b;
                if (i6 == 1 && (paymentGatewayToken = result.f42654c) != null) {
                    paymentGatewayFragment.mo46786U1(PaymentGatewayFragment.C16322a.class, new C7070l(paymentGatewayToken, 19));
                    return;
                } else if (i6 == 2) {
                    paymentGatewayFragment.mo46795h2(C13751d.m34341b(paymentGatewayFragment.requireContext(), (String) null, result.f42655d));
                    return;
                } else if (i6 == 3) {
                    paymentGatewayFragment.f42664p.f51440n.setValue(null);
                    return;
                } else {
                    return;
                }
            default:
                ((C7579b) this.f52050b).mo23841a((Calendar) obj, false);
                return;
        }
    }
}
