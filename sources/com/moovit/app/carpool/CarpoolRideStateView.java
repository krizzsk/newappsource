package com.moovit.app.carpool;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.appboy.support.ValidationUtils;
import com.google.android.material.textview.MaterialTextView;
import com.moovit.carpool.ActiveCarpoolRide;
import com.moovit.carpool.CameraDescriptor;
import com.moovit.carpool.CarpoolCar;
import com.moovit.carpool.CarpoolCompany;
import com.moovit.carpool.CarpoolConfirmationRate;
import com.moovit.carpool.CarpoolDriver;
import com.moovit.carpool.CarpoolLocationDescriptor;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.CarpoolRideRequest;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.HasCarpoolRide;
import com.moovit.carpool.HistoricalCarpoolRide;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.network.model.ServerId;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import java.math.BigDecimal;
import java.util.Set;
import k00.C17988b;
import p472er.C16865g;
import p977zz.C20941h;

public class CarpoolRideStateView extends MaterialTextView {

    public enum State {
        EMPTY(0, 0, 0),
        PENDING(R.string.carpool_ride_status_pending, R.attr.colorInfo, ValidationUtils.APPBOY_STRING_MAX_LENGTH),
        BOOKED(R.string.carpool_ride_status_booked, R.attr.colorGood, ValidationUtils.APPBOY_STRING_MAX_LENGTH),
        UPDATED(R.string.carpool_ride_status_updated, R.attr.colorInfo, ValidationUtils.APPBOY_STRING_MAX_LENGTH),
        ACTIVE(R.string.carpool_ride_status_active, R.attr.colorGood, ValidationUtils.APPBOY_STRING_MAX_LENGTH),
        REJECTED(R.string.carpool_ride_status_rejected, R.attr.colorCritical, ValidationUtils.APPBOY_STRING_MAX_LENGTH),
        CANCELED(R.string.carpool_ride_status_cancelled, R.attr.colorCritical, ValidationUtils.APPBOY_STRING_MAX_LENGTH),
        RIDE_REQUEST_SEARCHING(R.string.carpool_passenger_searching_status, R.attr.colorInfo, ValidationUtils.APPBOY_STRING_MAX_LENGTH),
        RIDE_REQUEST_NO_RESULTS(R.string.carpool_passenger_no_results_status, R.attr.colorOnSurfaceEmphasisLow, ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        
        /* access modifiers changed from: private */
        public final int baseColorAttrId;
        /* access modifiers changed from: private */
        public final int bgAlpha;
        /* access modifiers changed from: private */
        public final int textResId;

        private State(int i, int i2, int i3) {
            this.textResId = i;
            this.baseColorAttrId = i2;
            this.bgAlpha = i3;
        }
    }

    /* renamed from: com.moovit.app.carpool.CarpoolRideStateView$a */
    public static /* synthetic */ class C14789a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37658a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f37659b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                com.moovit.carpool.RideRequestStatus[] r0 = com.moovit.carpool.RideRequestStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37659b = r0
                r1 = 1
                com.moovit.carpool.RideRequestStatus r2 = com.moovit.carpool.RideRequestStatus.WAITING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f37659b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.carpool.RideRequestStatus r3 = com.moovit.carpool.RideRequestStatus.CANCELED_BY_PASSENGER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f37659b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.carpool.RideRequestStatus r4 = com.moovit.carpool.RideRequestStatus.FULFILLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f37659b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.carpool.RideRequestStatus r5 = com.moovit.carpool.RideRequestStatus.NOT_FULFILLED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.moovit.carpool.FutureCarpoolRide$InvitationState[] r4 = com.moovit.carpool.FutureCarpoolRide.InvitationState.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f37658a = r4
                com.moovit.carpool.FutureCarpoolRide$InvitationState r5 = com.moovit.carpool.FutureCarpoolRide.InvitationState.INVITED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f37658a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r4 = com.moovit.carpool.FutureCarpoolRide.InvitationState.NOT_INTERESTED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f37658a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r1 = com.moovit.carpool.FutureCarpoolRide.InvitationState.CANCELED_BY_PASSENGER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f37658a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r1 = com.moovit.carpool.FutureCarpoolRide.InvitationState.INTERESTED     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f37658a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r1 = com.moovit.carpool.FutureCarpoolRide.InvitationState.APPROVED_BY_DRIVER     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f37658a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r1 = com.moovit.carpool.FutureCarpoolRide.InvitationState.APPROVED_WITH_TIME_CHANGE_BY_DRIVER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f37658a     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r1 = com.moovit.carpool.FutureCarpoolRide.InvitationState.REJECTED_BY_DRIVER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.carpool.CarpoolRideStateView.C14789a.<clinit>():void");
        }
    }

    public CarpoolRideStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    public final void mo44829e(CarpoolRideRequest carpoolRideRequest) {
        int i = C14789a.f37659b[carpoolRideRequest.f40935i.ordinal()];
        if (i == 1) {
            mo44832h(State.RIDE_REQUEST_SEARCHING);
        } else if (i == 4) {
            mo44832h(State.RIDE_REQUEST_NO_RESULTS);
        }
    }

    /* renamed from: f */
    public final void mo44830f(FutureCarpoolRide futureCarpoolRide) {
        State state;
        if (!futureCarpoolRide.f40939d) {
            switch (C14789a.f37658a[futureCarpoolRide.f40938c.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    state = State.EMPTY;
                    break;
                case 4:
                    state = State.PENDING;
                    break;
                case 5:
                    state = State.BOOKED;
                    break;
                case 6:
                    state = State.UPDATED;
                    break;
                case 7:
                    state = State.REJECTED;
                    break;
                default:
                    state = State.EMPTY;
                    break;
            }
        } else {
            state = State.CANCELED;
        }
        mo44832h(state);
    }

    /* renamed from: g */
    public final void mo44831g(HasCarpoolRide hasCarpoolRide) {
        if (hasCarpoolRide instanceof FutureCarpoolRide) {
            mo44830f((FutureCarpoolRide) hasCarpoolRide);
        } else if (hasCarpoolRide instanceof ActiveCarpoolRide) {
            ActiveCarpoolRide activeCarpoolRide = (ActiveCarpoolRide) hasCarpoolRide;
            mo44832h(State.ACTIVE);
        } else if (hasCarpoolRide instanceof HistoricalCarpoolRide) {
            HistoricalCarpoolRide historicalCarpoolRide = (HistoricalCarpoolRide) hasCarpoolRide;
            mo44832h(State.EMPTY);
        }
    }

    /* renamed from: h */
    public final void mo44832h(State state) {
        if (state.equals(State.EMPTY)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        setText(state.textResId);
        Drawable background = getBackground();
        background.setTint(C20941h.m49043f(state.baseColorAttrId, getContext()));
        background.setAlpha(state.bgAlpha);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarpoolRideStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(C17988b.m44611b(R.drawable.bg_rounded_corners, context));
        int h = UiUtils.m40249h(getResources(), 4.0f);
        int h2 = UiUtils.m40249h(getResources(), 8.0f);
        setPadding(h2, h, h2, h);
        if (isInEditMode()) {
            Set<CarpoolLeg.CarpoolProvider> set = C16865g.f43870a;
            CarpoolCar carpoolCar = r3;
            CarpoolCar carpoolCar2 = new CarpoolCar("7438744", "Rolls Royce", "Swamp Green");
            CarpoolDriver carpoolDriver = new CarpoolDriver("1234", "Freddie", "Mercury", (String) null, carpoolCar, 3.6f, (Uri) null, 5, "I'm a fast and crazy driver. I listen to classical Rock and Roll, and occasionally like to sing myself. The show must go on!", 28, 100, System.currentTimeMillis(), 105, (String) null, (CarpoolCompany) null, false, (CarpoolConfirmationRate) null);
            LatLonE6 latLonE6 = new LatLonE6(324, 324);
            LatLonE6 latLonE62 = latLonE6;
            CarpoolLocationDescriptor carpoolLocationDescriptor = new CarpoolLocationDescriptor("Arlozorov 134", "Arlozorov 134, Tel Aviv", latLonE62, BoxE6.m40167g(new LatLonE6(324, 324)), (CameraDescriptor) null);
            LatLonE6 latLonE63 = new LatLonE6(324, 324);
            LatLonE6 latLonE64 = latLonE63;
            CarpoolDriver carpoolDriver2 = carpoolDriver;
            mo44830f(new FutureCarpoolRide(new CarpoolRide(new ServerId(1), carpoolDriver2, System.currentTimeMillis(), carpoolLocationDescriptor, "Behind the drugstore", new CarpoolLocationDescriptor("Ilan Ramon 2", "Ilan Ramon 2, Nes Ziona", latLonE64, BoxE6.m40167g(new LatLonE6(324, 324)), (CameraDescriptor) null), (String) null, new CurrencyAmount("ILS", new BigDecimal("9.95")), new CurrencyAmount("ILS", new BigDecimal("10.50"))), FutureCarpoolRide.InvitationState.APPROVED_WITH_TIME_CHANGE_BY_DRIVER, false, PassengerRideStops.m40150b()));
        }
    }
}
