package p397bu;

import android.view.View;
import com.moovit.app.itinerary.view.leg.C15082g;
import com.moovit.itinerary.model.leg.DocklessScooterLeg;
import com.moovit.itinerary.model.leg.Leg;

/* renamed from: bu.e */
public final /* synthetic */ class C13687e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C15082g f33737b;

    /* renamed from: c */
    public final /* synthetic */ DocklessScooterLeg f33738c;

    /* renamed from: d */
    public final /* synthetic */ Leg f33739d;

    public /* synthetic */ C13687e(C15082g gVar, DocklessScooterLeg docklessScooterLeg, Leg leg) {
        this.f33737b = gVar;
        this.f33738c = docklessScooterLeg;
        this.f33739d = leg;
    }

    public final void onClick(View view) {
        this.f33737b.mo45371D(view, this.f33738c, this.f33739d);
    }
}
