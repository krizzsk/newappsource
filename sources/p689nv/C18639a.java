package p689nv;

import androidx.fragment.app.FragmentManager;
import com.moovit.app.ridesharing.booking.EventBookingActivity;
import com.tranzmate.R;
import p713ov.C18831a;

/* renamed from: nv.a */
public final /* synthetic */ class C18639a implements FragmentManager.C0897m {

    /* renamed from: a */
    public final /* synthetic */ EventBookingActivity f47500a;

    public /* synthetic */ C18639a(EventBookingActivity eventBookingActivity) {
        this.f47500a = eventBookingActivity;
    }

    public final void onBackStackChanged() {
        EventBookingActivity eventBookingActivity = this.f47500a;
        C18831a aVar = (C18831a) eventBookingActivity.getSupportFragmentManager().mo3983z(R.id.fragment_container);
        if (aVar != null) {
            eventBookingActivity.setTitle(aVar.mo51314n2());
        }
    }
}
