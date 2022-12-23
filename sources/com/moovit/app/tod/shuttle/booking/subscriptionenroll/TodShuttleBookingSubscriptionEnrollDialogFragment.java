package com.moovit.app.tod.shuttle.booking.subscriptionenroll;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.C1021l0;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.appbar.MaterialToolbar;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity;
import com.moovit.design.view.DaysOfWeekPickerView;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mf0.C24362h;
import mf0.C24365j;
import p073e7.C4584b;
import p478ex.C16888a;
import p501fw.C17102a;
import p543hq.C17474b;
import p609km.C18097c;
import p667mx.C18476a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/app/tod/shuttle/booking/subscriptionenroll/TodShuttleBookingSubscriptionEnrollDialogFragment;", "Lcom/moovit/b;", "Lcom/moovit/app/tod/shuttle/booking/TodShuttleBookingConfirmationActivity;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodShuttleBookingSubscriptionEnrollDialogFragment extends C15676b<TodShuttleBookingConfirmationActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f40407n = 0;

    /* renamed from: h */
    public final C1021l0 f40408h;

    /* renamed from: i */
    public TextView f40409i;

    /* renamed from: j */
    public ListItemView f40410j;

    /* renamed from: k */
    public ListItemView f40411k;

    /* renamed from: l */
    public ListItemView f40412l;

    /* renamed from: m */
    public DaysOfWeekPickerView f40413m;

    public TodShuttleBookingSubscriptionEnrollDialogFragment() {
        super(TodShuttleBookingConfirmationActivity.class);
        C21049c a = C23812a.m58431a(LazyThreadSafetyMode.NONE, new C15548x3920784c(new C15547x3920784b(this)));
        this.f40408h = C18097c.m44768b(this, C24365j.m61219a(C18476a.class), new C15549x3920784d(a), new C15550x3920784e(a), new C15551x3920784f(this, a));
        setStyle(0, 2131952794);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C18476a) this.f40408h.getValue()).f47079b.setValue((TodShuttleBookingSubscriptionEnrollState) requireArguments().getParcelable("selectionState"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.tod_shuttle_booking_subscription_enroll_dialog_fragment, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_shuttle_recurring_set_dialog_impression");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ((MaterialToolbar) view.findViewById(R.id.toolbar)).setNavigationOnClickListener(new C17102a(this, 6));
        View findViewById = view.findViewById(R.id.pattern_name);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.pattern_name)");
        this.f40409i = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.pattern_org_dst);
        C24362h.m61210e(findViewById2, "view.findViewById(R.id.pattern_org_dst)");
        this.f40410j = (ListItemView) findViewById2;
        View findViewById3 = view.findViewById(R.id.pickup_time);
        C24362h.m61210e(findViewById3, "view.findViewById(R.id.pickup_time)");
        this.f40411k = (ListItemView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ride_fare);
        C24362h.m61210e(findViewById4, "view.findViewById(R.id.ride_fare)");
        this.f40412l = (ListItemView) findViewById4;
        View findViewById5 = view.findViewById(R.id.days_picker);
        C24362h.m61210e(findViewById5, "view.findViewById(R.id.days_picker)");
        this.f40413m = (DaysOfWeekPickerView) findViewById5;
        View findViewById6 = view.findViewById(R.id.done_button);
        C24362h.m61210e(findViewById6, "view.findViewById(R.id.done_button)");
        ((Button) findViewById6).setOnClickListener(new C4584b(this, 25));
        ((C18476a) this.f40408h.getValue()).f47079b.observe(getViewLifecycleOwner(), new C16888a(new C15552xc9dc51d3(this), 2));
    }
}
