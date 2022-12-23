package p713ov;

import android.os.Bundle;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.app.ridesharing.booking.EventBookingActivity;
import com.moovit.app.ridesharing.booking.EventBookingCart;
import com.moovit.app.ridesharing.booking.EventBookingParams;
import p054d0.C4319x0;

/* renamed from: ov.a */
public abstract class C18831a extends C15682c<EventBookingActivity> {

    /* renamed from: n */
    public EventBookingCart f47945n;

    /* renamed from: ov.a$a */
    public interface C18832a {
        /* renamed from: P0 */
        void mo45757P0(EventBookingCart eventBookingCart, String str);
    }

    public C18831a() {
        super(EventBookingActivity.class);
    }

    /* renamed from: m2 */
    public static Bundle m45829m2(EventBookingCart eventBookingCart) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("bookingCart", eventBookingCart);
        return bundle;
    }

    /* renamed from: n2 */
    public abstract int mo51314n2();

    /* renamed from: o2 */
    public final EventBookingCart mo51315o2() {
        EventBookingCart eventBookingCart = this.f47945n;
        C21100e.m49373x(eventBookingCart, "bookingCart");
        return eventBookingCart;
    }

    public void onCreate(Bundle bundle) {
        EventBookingCart eventBookingCart;
        super.onCreate(bundle);
        if (bundle != null) {
            eventBookingCart = (EventBookingCart) bundle.getParcelable("bookingCart");
        } else {
            eventBookingCart = (EventBookingCart) mo46782Q1().getParcelable("bookingCart");
        }
        this.f47945n = eventBookingCart;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("bookingCart", this.f47945n);
    }

    /* renamed from: p2 */
    public final EventBookingParams mo51316p2() {
        EventBookingActivity eventBookingActivity = (EventBookingActivity) this.f40822c;
        if (eventBookingActivity.f39340X == null) {
            eventBookingActivity.mo45755B2();
        }
        EventBookingParams eventBookingParams = eventBookingActivity.f39340X;
        C21100e.m49373x(eventBookingParams, "bookingParams");
        return eventBookingParams;
    }

    /* renamed from: q2 */
    public final void mo51317q2() {
        String tag = getTag();
        C21100e.m49373x(tag, "fragmentTag");
        mo46786U1(C18832a.class, new C4319x0(5, this, tag));
    }
}
