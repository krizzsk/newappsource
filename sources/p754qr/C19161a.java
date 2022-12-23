package p754qr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15676b;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.moovit.carpool.CarpoolRide;
import com.moovit.commons.view.FormatTextView;
import com.tranzmate.R;
import p073e7.C4583a;

/* renamed from: qr.a */
public class C19161a extends C15676b<CarpoolRideDetailsActivity> {

    /* renamed from: h */
    public static String f48741h = C19161a.class.getName();

    public C19161a() {
        super(CarpoolRideDetailsActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2131952793);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.carpool_ride_cancelled_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FormatTextView formatTextView = (FormatTextView) view.findViewById(R.id.message);
        Object[] objArr = new Object[1];
        CarpoolRide carpoolRide = (CarpoolRide) getArguments().getParcelable("ride");
        if (carpoolRide != null) {
            objArr[0] = carpoolRide.f40911c.f40876c;
            formatTextView.setArguments(objArr);
            view.findViewById(R.id.ok).setOnClickListener(new C4583a(this, 6));
            return;
        }
        throw new IllegalStateException("Did you use CarpoolRideCancelledFragment.newInstance(...)?");
    }
}
