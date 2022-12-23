package com.moovit.app.carpool.ridedetails;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.commons.view.FormatTextView;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import p102h0.C5021e;
import p543hq.C17474b;
import p567iq.C17635b;

/* renamed from: com.moovit.app.carpool.ridedetails.d */
public class C14838d extends C15676b<CarpoolRideDetailsActivity> {

    /* renamed from: i */
    public static String f37890i = C14838d.class.getName();

    /* renamed from: h */
    public FutureCarpoolRide f37891h;

    /* renamed from: com.moovit.app.carpool.ridedetails.d$a */
    public interface C14839a {
        /* renamed from: R */
        void mo44905R();

        /* renamed from: b */
        void mo44906b();

        /* renamed from: p */
        void mo44910p();
    }

    public C14838d() {
        super(CarpoolRideDetailsActivity.class);
        setStyle(0, 2131952793);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        mo46753L1(C14839a.class, new C5021e(this, 9));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37891h = (FutureCarpoolRide) mo46752K1().getParcelable("futureRide");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.carpool_ride_time_updated_fragment, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        mo22564R1(new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP).mo49933a());
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22847b(activity, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_ride_update");
        aVar.mo49937e(AnalyticsAttributeKey.SELECTED_ID, this.f37891h.f40937b.f40910b);
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((FormatTextView) view.findViewById(R.id.message)).setArguments(this.f37891h.f40937b.f40911c.f40876c, C7925b.m18024l(getContext(), this.f37891h.f40937b.f40912d));
        view.findViewById(R.id.approve).setOnClickListener(new C4051q(this, 5));
        view.findViewById(R.id.decline).setOnClickListener(new C4052r(this, 4));
    }
}
