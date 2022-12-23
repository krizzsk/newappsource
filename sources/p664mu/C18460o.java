package p664mu;

import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.MoovitActivity;
import com.moovit.transit.TransitType;

/* renamed from: mu.o */
public final /* synthetic */ class C18460o implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ MoovitActivity f47052b;

    /* renamed from: c */
    public final /* synthetic */ TransitType.VehicleType f47053c;

    public /* synthetic */ C18460o(MoovitActivity moovitActivity, TransitType.VehicleType vehicleType) {
        this.f47052b = moovitActivity;
        this.f47053c = vehicleType;
    }

    public final void onFailure(Exception exc) {
        C18462q.m45322b(this.f47052b, this.f47053c);
    }
}
