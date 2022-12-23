package com.moovit.app.tod.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.app.tod.bottomsheet.stateviews.TodActiveRideRemoteScreenView;
import com.moovit.app.tod.bottomsheet.stateviews.TodActiveRideView;
import com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideHeadingDropOffView;
import com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideHeadingToPickupView;
import com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView;
import com.moovit.app.tod.bottomsheet.stateviews.TodCancelledRideView;
import com.moovit.app.tod.bottomsheet.stateviews.TodCompletedRideView;
import com.moovit.app.tod.bottomsheet.stateviews.TodFutureRideView;
import com.moovit.app.tod.model.TodJourneyStatus;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.app.tod.model.TodRideVehicle;
import com.moovit.commons.utils.UiUtils;
import com.moovit.map.MapFragment;
import com.tranzmate.R;
import p400bx.C13705a;
import p400bx.C13706b;
import p502fx.C17122g;
import p805su.C19541c;
import p811tc.C19648g;
import p811tc.C19654k;
import p977zz.C20941h;

public class TodRideBottomSheet extends NestedScrollView {

    /* renamed from: N */
    public static final /* synthetic */ int f40104N = 0;

    /* renamed from: F */
    public final C15474a f40105F;

    /* renamed from: G */
    public BottomSheetBehavior<TodRideBottomSheet> f40106G;

    /* renamed from: H */
    public float f40107H;

    /* renamed from: I */
    public int f40108I;

    /* renamed from: J */
    public C15476c f40109J;

    /* renamed from: K */
    public C15476c f40110K;

    /* renamed from: L */
    public MapFragment f40111L;

    /* renamed from: M */
    public C13705a f40112M;

    /* renamed from: com.moovit.app.tod.bottomsheet.TodRideBottomSheet$a */
    public class C15474a extends BottomSheetBehavior.C13920c {
        public C15474a() {
        }

        public final void onSlide(View view, float f) {
            int i;
            TodRideBottomSheet todRideBottomSheet = TodRideBottomSheet.this;
            if (!todRideBottomSheet.f40106G.f34356G) {
                if (f > todRideBottomSheet.f40107H) {
                    i = 3;
                } else {
                    i = 4;
                }
                todRideBottomSheet.f40108I = i;
            }
            C15476c cVar = todRideBottomSheet.f40109J;
            if (cVar != null) {
                cVar.f40117b.setSlideOffset(f);
            }
            todRideBottomSheet.f40107H = f;
        }

        public final void onStateChanged(View view, int i) {
            TodRideBottomSheet.m39603y(TodRideBottomSheet.this, i);
        }
    }

    /* renamed from: com.moovit.app.tod.bottomsheet.TodRideBottomSheet$b */
    public static /* synthetic */ class C15475b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40114a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40115b;

        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a5 */
        static {
            /*
                com.moovit.app.tod.bottomsheet.TodUiState[] r0 = com.moovit.app.tod.bottomsheet.TodUiState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40115b = r0
                r1 = 1
                com.moovit.app.tod.bottomsheet.TodUiState r2 = com.moovit.app.tod.bottomsheet.TodUiState.FUTURE_RIDE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f40115b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.tod.bottomsheet.TodUiState r3 = com.moovit.app.tod.bottomsheet.TodUiState.AUTONOMOUS_HEADING_PICKUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f40115b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.tod.bottomsheet.TodUiState r4 = com.moovit.app.tod.bottomsheet.TodUiState.AUTONOMOUS_WAITING_AT_PICKUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f40115b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.tod.bottomsheet.TodUiState r5 = com.moovit.app.tod.bottomsheet.TodUiState.AUTONOMOUS_HEADING_DROP_OFF     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f40115b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.app.tod.bottomsheet.TodUiState r6 = com.moovit.app.tod.bottomsheet.TodUiState.ACTIVE_RIDE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f40115b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.app.tod.bottomsheet.TodUiState r7 = com.moovit.app.tod.bottomsheet.TodUiState.REMOTE_SCREEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r6 = f40115b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.app.tod.bottomsheet.TodUiState r7 = com.moovit.app.tod.bottomsheet.TodUiState.RIDE_COMPLETED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r8 = 7
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r6 = f40115b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.moovit.app.tod.bottomsheet.TodUiState r7 = com.moovit.app.tod.bottomsheet.TodUiState.PASSENGER_NOT_SHOWN     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8 = 8
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r6 = f40115b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.moovit.app.tod.bottomsheet.TodUiState r7 = com.moovit.app.tod.bottomsheet.TodUiState.RIDE_CANCELLED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r8 = 9
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                com.moovit.app.tod.model.TodRideStatus[] r6 = com.moovit.app.tod.model.TodRideStatus.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f40114a = r6
                com.moovit.app.tod.model.TodRideStatus r7 = com.moovit.app.tod.model.TodRideStatus.ACTIVE     // Catch:{ NoSuchFieldError -> 0x007d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r1 = f40114a     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.moovit.app.tod.model.TodRideStatus r6 = com.moovit.app.tod.model.TodRideStatus.PASSENGER_NOT_SHOWN     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r1[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f40114a     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.FUTURE     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                int[] r0 = f40114a     // Catch:{ NoSuchFieldError -> 0x009b }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.CANCELLED     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                int[] r0 = f40114a     // Catch:{ NoSuchFieldError -> 0x00a5 }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.DECLINED     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r0 = f40114a     // Catch:{ NoSuchFieldError -> 0x00af }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.COMPLETED     // Catch:{ NoSuchFieldError -> 0x00af }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.bottomsheet.TodRideBottomSheet.C15475b.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.tod.bottomsheet.TodRideBottomSheet$c */
    public static class C15476c {

        /* renamed from: a */
        public TodUiState f40116a;

        /* renamed from: b */
        public C13706b f40117b;

        public C15476c(TodUiState todUiState, C13706b bVar) {
            this.f40116a = todUiState;
            this.f40117b = bVar;
        }
    }

    public TodRideBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setState(C15476c cVar) {
        C15476c cVar2 = this.f40109J;
        if (cVar2 != null) {
            removeView(cVar2.f40117b.mo40576h());
        }
        this.f40109J = cVar;
        this.f40110K = null;
        if (cVar != null) {
            addView(cVar.f40117b.mo40576h());
            C15476c cVar3 = this.f40109J;
            View h = cVar3.f40117b.mo40576h();
            UiUtils.m40259r(h, new C19541c(this, cVar3, h));
        }
    }

    /* renamed from: y */
    public static void m39603y(TodRideBottomSheet todRideBottomSheet, int i) {
        if (i == 3 || i == 4) {
            todRideBottomSheet.f40108I = i;
        } else if (i != 5) {
            todRideBottomSheet.getClass();
        } else {
            todRideBottomSheet.setState(todRideBottomSheet.f40110K);
        }
    }

    /* renamed from: a */
    public final void mo46267a(TodRide todRide, C17122g gVar) {
        TodRideStatus todRideStatus;
        TodUiState todUiState;
        C13706b bVar;
        boolean z;
        if (gVar != null) {
            todRideStatus = gVar.f44314b;
        } else {
            todRideStatus = todRide.f40266d;
        }
        boolean z2 = false;
        switch (C15475b.f40114a[todRideStatus.ordinal()]) {
            case 1:
                TodRideVehicle todRideVehicle = todRide.f40268f;
                if (todRideVehicle == null || !todRideVehicle.f40308h) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (gVar != null) {
                        if (gVar.f44323k == null) {
                            TodJourneyStatus todJourneyStatus = gVar.f44315c;
                            if (!todJourneyStatus.isPickedUp()) {
                                if (TodJourneyStatus.ARRIVED_PICKUP.equals(todJourneyStatus)) {
                                    todUiState = TodUiState.AUTONOMOUS_WAITING_AT_PICKUP;
                                    break;
                                } else {
                                    todUiState = TodUiState.AUTONOMOUS_HEADING_PICKUP;
                                    break;
                                }
                            } else {
                                todUiState = TodUiState.AUTONOMOUS_HEADING_DROP_OFF;
                                break;
                            }
                        } else {
                            todUiState = TodUiState.REMOTE_SCREEN;
                            break;
                        }
                    } else {
                        todUiState = null;
                        break;
                    }
                } else {
                    todUiState = TodUiState.ACTIVE_RIDE;
                    break;
                }
            case 2:
                todUiState = TodUiState.PASSENGER_NOT_SHOWN;
                break;
            case 3:
                todUiState = TodUiState.FUTURE_RIDE;
                break;
            case 4:
            case 5:
                todUiState = TodUiState.RIDE_CANCELLED;
                break;
            case 6:
                todUiState = TodUiState.RIDE_COMPLETED;
                break;
            default:
                throw new IllegalStateException("Unhandled ride status - " + todRideStatus);
        }
        if (todUiState != null) {
            C15476c cVar = this.f40109J;
            if (cVar != null && cVar.f40116a.equals(todUiState)) {
                z2 = true;
            }
            if (z2) {
                this.f40109J.f40117b.mo40574a(todRide, gVar);
                if (TodUiState.RIDE_COMPLETED.equals(this.f40109J.f40116a)) {
                    C15476c cVar2 = this.f40109J;
                    View h = cVar2.f40117b.mo40576h();
                    UiUtils.m40259r(h, new C19541c(this, cVar2, h));
                    return;
                }
                return;
            }
            Context context = getContext();
            switch (C15475b.f40115b[todUiState.ordinal()]) {
                case 1:
                    bVar = new TodFutureRideView(context, (AttributeSet) null);
                    break;
                case 2:
                    bVar = new TodAutonomousRideHeadingToPickupView(context, (AttributeSet) null);
                    break;
                case 3:
                    bVar = new TodAutonomousRideWaitingAtPickupView(context, (AttributeSet) null);
                    break;
                case 4:
                    bVar = new TodAutonomousRideHeadingDropOffView(context, (AttributeSet) null);
                    break;
                case 5:
                    bVar = new TodActiveRideView(context, (AttributeSet) null);
                    break;
                case 6:
                    bVar = new TodActiveRideRemoteScreenView(context, (AttributeSet) null);
                    break;
                case 7:
                    bVar = new TodCompletedRideView(context, (AttributeSet) null);
                    break;
                case 8:
                case 9:
                    bVar = new TodCancelledRideView(context, (AttributeSet) null);
                    break;
                default:
                    throw new IllegalStateException("Unknown tod state: " + todUiState);
            }
            bVar.mo40574a(todRide, gVar);
            C15476c cVar3 = new C15476c(todUiState, bVar);
            if (this.f40109J == null) {
                setState(cVar3);
                return;
            }
            this.f40110K = cVar3;
            this.f40106G.setHideable(true);
            this.f40106G.setState(5);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<TodRideBottomSheet> e = BottomSheetBehavior.m34710e(this);
        this.f40106G = e;
        e.mo41052a(this.f40105F);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<TodRideBottomSheet> bottomSheetBehavior = this.f40106G;
        bottomSheetBehavior.f34369T.remove(this.f40105F);
        this.f40106G = null;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        C13706b bVar;
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        int childCount = getChildCount();
        TodUiState todUiState = (TodUiState) bundle.getParcelable("currentTodUiState");
        int i = bundle.getInt("currentTodViewIndex", -1);
        if (childCount >= i) {
            bVar = (C13706b) getChildAt(i);
        } else {
            bVar = null;
        }
        if (!(todUiState == null || bVar == null)) {
            this.f40109J = new C15476c(todUiState, bVar);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            if (i2 != i) {
                removeViewAt(i2);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        C15476c cVar = this.f40109J;
        if (cVar != null) {
            bundle.putParcelable("currentTodUiState", cVar.f40116a);
            bundle.putInt("currentTodViewIndex", indexOfChild(this.f40109J.f40117b.mo40576h()));
        }
        return bundle;
    }

    public void setListener(C13705a aVar) {
        this.f40112M = aVar;
    }

    public void setMapFragment(MapFragment mapFragment) {
        this.f40111L = mapFragment;
    }

    public TodRideBottomSheet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40105F = new C15474a();
        this.f40107H = BitmapDescriptorFactory.HUE_RED;
        this.f40108I = 4;
        this.f40109J = null;
        this.f40110K = null;
        this.f40111L = null;
        this.f40112M = null;
        C19648g gVar = new C19648g(new C19654k(C19654k.m47122a(context, 2131952366, 2131952388)));
        gVar.setTint(C20941h.m49043f(R.attr.colorSurface, context));
        setBackground(gVar);
    }

    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -2);
    }
}
