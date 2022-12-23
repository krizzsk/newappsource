package p925xu;

import android.content.Context;
import ce0.C21100e;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.NavigationLeg;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import h40.C5051b;
import java.util.concurrent.TimeUnit;
import p175n.C5768c;
import p977zz.C20941h;

/* renamed from: xu.a */
public final class C20619a implements C5051b {

    /* renamed from: b */
    public final C5768c f52124b;

    /* renamed from: c */
    public NavigationLeg f52125c;

    /* renamed from: d */
    public NavigationProgressEvent f52126d;

    /* renamed from: e */
    public Navigable f52127e;

    /* renamed from: f */
    public C4231d f52128f;

    public C20619a(Context context, NavigationLeg navigationLeg, Navigable navigable, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f52124b = new C5768c(context, (int) R.style.MoovitTheme);
        this.f52125c = navigationLeg;
        this.f52126d = navigationProgressEvent;
        this.f52127e = navigable;
        this.f52128f = dVar;
    }

    /* renamed from: b */
    public final Integer mo20773b() {
        return null;
    }

    /* renamed from: c */
    public final void mo20774c() {
    }

    /* renamed from: d */
    public final Integer mo20775d() {
        boolean z;
        C4231d dVar = this.f52128f;
        boolean z2 = true;
        if (dVar == null || this.f52126d == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Integer.valueOf(C20941h.m49043f(R.attr.colorGood, this.f52124b));
        }
        if (dVar != null || this.f52126d == null) {
            z2 = false;
        }
        if (z2) {
            return Integer.valueOf(C20941h.m49043f(R.attr.colorOnSurfaceEmphasisHigh, this.f52124b));
        }
        return null;
    }

    /* renamed from: e */
    public final int mo20776e() {
        if ((this.f52128f == null || this.f52126d == null) ? false : true) {
            return R.drawable.ic_real_time_12_live;
        }
        return 0;
    }

    /* renamed from: f */
    public final CharSequence mo20777f() {
        NavigationProgressEvent navigationProgressEvent = this.f52126d;
        if (navigationProgressEvent == null) {
            return null;
        }
        return C7925b.f23936c.mo24602b(this.f52124b, (long) ((int) TimeUnit.SECONDS.toMinutes((long) navigationProgressEvent.f15120k))).toString();
    }

    /* renamed from: g */
    public final String mo20781g() {
        boolean z;
        if (this.f52128f != null || this.f52126d == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return this.f52124b.getString(R.string.tripplan_itinerary_notification_battery);
        }
        return null;
    }

    public final int getIcon() {
        return this.f52126d != null ? R.drawable.notification_center_ride : R.drawable.notification_center_ride_disable;
    }

    public final CharSequence getTitle() {
        return this.f52124b.getResources().getString(R.string.tripplan_itinerary_ride) + " " + ((TransitStop) this.f52127e.mo19637P1().get(this.f52125c.f15056d)).f23731c;
    }

    /* renamed from: h */
    public final int mo20782h() {
        if (this.f52128f == null && this.f52126d != null) {
            return R.drawable.ic_battery_16_green;
        }
        return 0;
    }

    /* renamed from: i */
    public final CharSequence mo20780i() {
        NavigationProgressEvent navigationProgressEvent = this.f52126d;
        if (navigationProgressEvent == null) {
            return this.f52124b.getText(R.string.ride_mode_notification_live_navigation).toString();
        }
        int i = navigationProgressEvent.f15119j;
        if (i == 1) {
            return this.f52124b.getResources().getString(R.string.tripplan_itinerary_disembark_stop);
        }
        return this.f52124b.getResources().getString(R.string.tripplan_itinerary_disembark_stops, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: j */
    public final void mo20783j() {
    }
}
