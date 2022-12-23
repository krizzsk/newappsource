package p950yw;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.bookingflow.model.FailureReason;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState;
import com.moovit.transit.LocationDescriptor;

/* renamed from: yw.i */
public final /* synthetic */ class C20782i implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ TodBookingOrderViewModel f52440b;

    /* renamed from: c */
    public final /* synthetic */ LocationDescriptor f52441c;

    public /* synthetic */ C20782i(TodBookingOrderViewModel todBookingOrderViewModel, LocationDescriptor locationDescriptor) {
        this.f52440b = todBookingOrderViewModel;
        this.f52441c = locationDescriptor;
    }

    public final void onComplete(Task task) {
        FailureReason failureReason;
        TodBookingOrderViewModel todBookingOrderViewModel = this.f52440b;
        LocationDescriptor locationDescriptor = this.f52441c;
        todBookingOrderViewModel.getClass();
        if (task.isSuccessful()) {
            failureReason = (FailureReason) task.getResult();
        } else {
            failureReason = FailureReason.NONE;
        }
        TodBookingPickupLocationState todBookingPickupLocationState = new TodBookingPickupLocationState(locationDescriptor, failureReason);
        todBookingOrderViewModel.f40075g.postValue(Boolean.FALSE);
        todBookingOrderViewModel.f40074f.postValue(todBookingPickupLocationState);
    }
}
