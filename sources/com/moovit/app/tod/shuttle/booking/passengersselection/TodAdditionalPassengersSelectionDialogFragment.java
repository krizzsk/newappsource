package com.moovit.app.tod.shuttle.booking.passengersselection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.C1021l0;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.C15676b;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity;
import com.moovit.design.view.NumericStepperView;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import h60.C17327j1;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mf0.C24362h;
import mf0.C24365j;
import p522gt.C17226a;
import p609km.C18097c;
import p620kx.C18155a;
import p620kx.C18156b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/app/tod/shuttle/booking/passengersselection/TodAdditionalPassengersSelectionDialogFragment;", "Lcom/moovit/b;", "Lcom/moovit/app/tod/shuttle/booking/TodShuttleBookingConfirmationActivity;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodAdditionalPassengersSelectionDialogFragment extends C15676b<TodShuttleBookingConfirmationActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f40405i = 0;

    /* renamed from: h */
    public final C1021l0 f40406h;

    public TodAdditionalPassengersSelectionDialogFragment() {
        super(TodShuttleBookingConfirmationActivity.class);
        C21049c a = C23812a.m58431a(LazyThreadSafetyMode.NONE, new C15543xc1150603(new C15542xc1150602(this)));
        this.f40406h = C18097c.m44768b(this, C24365j.m61219a(C18156b.class), new C15544xc1150604(a), new C15545xc1150605(a), new C15546xc1150606(this, a));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.tod_additional_passengers_selection_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        View accessoryView = ((ListItemView) view.findViewById(R.id.passenger_count)).getAccessoryView();
        C24362h.m61209d(accessoryView, "null cannot be cast to non-null type com.moovit.design.view.NumericStepperView");
        NumericStepperView numericStepperView = (NumericStepperView) accessoryView;
        numericStepperView.mo47718a(0, 3, true);
        numericStepperView.setListener(new C17327j1(this, 17));
        int i = requireArguments().getInt("passengersCount");
        ((C18156b) this.f40406h.getValue()).f46392b.setValue(Integer.valueOf(i));
        ((C18156b) this.f40406h.getValue()).f46392b.observe(this, new C17226a(new TodAdditionalPassengersSelectionDialogFragment$onViewCreated$2(numericStepperView), 1));
        ((Button) view.findViewById(R.id.save_button)).setOnClickListener(new C18155a(this, i, 0));
    }
}
