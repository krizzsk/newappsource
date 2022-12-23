package com.moovit.app.carpool.ridedetails;

import android.content.Context;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment;
import com.moovit.carpool.FutureCarpoolRide;
import p241s0.C6302b;
import p977zz.C20941h;

/* renamed from: com.moovit.app.carpool.ridedetails.b */
public final /* synthetic */ class C14836b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CarpoolRideDetailsFragment f37886b;

    /* renamed from: c */
    public final /* synthetic */ CarpoolRideDetailsFragment.RideAlertType f37887c;

    /* renamed from: d */
    public final /* synthetic */ Object[] f37888d;

    public /* synthetic */ C14836b(CarpoolRideDetailsFragment carpoolRideDetailsFragment, CarpoolRideDetailsFragment.RideAlertType rideAlertType, Object[] objArr) {
        this.f37886b = carpoolRideDetailsFragment;
        this.f37887c = rideAlertType;
        this.f37888d = objArr;
    }

    public final void run() {
        CarpoolRideDetailsFragment carpoolRideDetailsFragment = this.f37886b;
        CarpoolRideDetailsFragment.RideAlertType rideAlertType = this.f37887c;
        Object[] objArr = this.f37888d;
        C6302b<FutureCarpoolRide.InvitationState, CarpoolRideDetailsFragment.RideActionViewConfiguration> bVar = CarpoolRideDetailsFragment.f37856J;
        if (carpoolRideDetailsFragment.isResumed()) {
            Context context = carpoolRideDetailsFragment.f37859C.getContext();
            carpoolRideDetailsFragment.f37859C.setBackgroundColor(C20941h.m49043f(rideAlertType.backgroundColor, context));
            carpoolRideDetailsFragment.f37859C.setText(context.getString(rideAlertType.messageId, objArr));
            carpoolRideDetailsFragment.f37859C.setVisibility(0);
            carpoolRideDetailsFragment.mo44907m2();
        }
    }
}
