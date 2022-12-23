package com.moovit.app.carpool.ridedetails;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import b00.C13556a;
import c00.C13717b;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.CarpoolRideDetourView;
import com.moovit.app.carpool.CarpoolRideJourneyView;
import com.moovit.app.carpool.CarpoolRidePriceView;
import com.moovit.app.carpool.driver.CarpoolDriverView;
import com.moovit.app.carpool.ridedetails.C14838d;
import com.moovit.carpool.CarpoolDriver;
import com.moovit.carpool.CarpoolLocationDescriptor;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.CarpoolRideDetour;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.HasCarpoolRide;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.design.view.list.TripleListItemView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16783l;
import java.util.List;
import java.util.WeakHashMap;
import p011aa.C0141e;
import p241s0.C6302b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p543hq.C17474b;
import p584jl.C17885a;
import p638lr.C18260g;
import p638lr.C18261h;
import p754qr.C19161a;
import p754qr.C19163c;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20964s0;
import w00.C20261b;
import w00.C20266g;

public class CarpoolRideDetailsFragment extends C15682c<CarpoolRideDetailsActivity> implements C14838d.C14839a {

    /* renamed from: J */
    public static final C6302b<FutureCarpoolRide.InvitationState, RideActionViewConfiguration> f37856J;

    /* renamed from: A */
    public ViewGroup f37857A;

    /* renamed from: B */
    public TextView f37858B;

    /* renamed from: C */
    public TextView f37859C;

    /* renamed from: D */
    public CarpoolRideDetourView f37860D;

    /* renamed from: E */
    public C14834f f37861E;

    /* renamed from: F */
    public HasCarpoolRide f37862F = null;

    /* renamed from: G */
    public Itinerary f37863G = null;

    /* renamed from: H */
    public TripPlannerLocations f37864H = null;

    /* renamed from: I */
    public C13556a f37865I = null;

    /* renamed from: n */
    public final C14829a f37866n = new C14829a();

    /* renamed from: o */
    public final C14830b f37867o = new C14830b();

    /* renamed from: p */
    public final C14831c f37868p = new C14831c();

    /* renamed from: q */
    public NestedScrollView f37869q;

    /* renamed from: r */
    public TextView f37870r;

    /* renamed from: s */
    public TextView f37871s;

    /* renamed from: t */
    public CarpoolRidePriceView f37872t;

    /* renamed from: u */
    public CarpoolRideJourneyView f37873u;

    /* renamed from: v */
    public CarpoolDriverView f37874v;

    /* renamed from: w */
    public Button f37875w;

    /* renamed from: x */
    public TextView f37876x;

    /* renamed from: y */
    public Button f37877y;

    /* renamed from: z */
    public View f37878z;

    public enum RideActionViewConfiguration {
        BOOK(R.string.carpool_book_ride_button, 0),
        CANCEL_PENDING(R.string.carpool_cancel_pending_booking_button, 2131952774),
        CANCEL(R.string.carpool_cancel_booking_button, 2131952774),
        NO_SHOW(R.string.carpool_driver_noshow_button, 0);
        
        /* access modifiers changed from: private */
        public final int actionText;
        /* access modifiers changed from: private */
        public final int actionThemeOverlay;

        private RideActionViewConfiguration(int i, int i2) {
            this.actionText = i;
            this.actionThemeOverlay = i2;
        }
    }

    public enum RideAlertType {
        CANCELED(R.string.carpool_canceled_ride, R.attr.colorCritical),
        REJECTED_BY_DRIVER(R.string.carpool_rejected_ride, R.attr.colorCritical),
        REMINDER(R.string.carpool_alert_reminder, R.attr.colorGood),
        APPROVED(R.string.carpool_alert_approved, R.attr.colorGood),
        PENDING(R.string.carpool_alert_pending, R.attr.colorInfo),
        ACTIVE(R.string.carpool_alert_active, R.attr.colorGood),
        HISTORY(R.string.carpool_alert_history, R.attr.colorSecondary);
        
        /* access modifiers changed from: private */
        public final int backgroundColor;
        /* access modifiers changed from: private */
        public final int messageId;

        private RideAlertType(int i, int i2) {
            this.messageId = i;
            this.backgroundColor = i2;
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$a */
    public class C14829a extends C0141e {
        public C14829a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C18260g gVar = (C18260g) cVar;
            CarpoolRideDetailsFragment.this.f37865I = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            CarpoolRideDetour carpoolRideDetour;
            C18260g gVar2 = (C18260g) cVar;
            CarpoolRideDetour carpoolRideDetour2 = ((C18261h) gVar).f46585m;
            if (carpoolRideDetour2 != null) {
                CarpoolRideDetailsFragment carpoolRideDetailsFragment = CarpoolRideDetailsFragment.this;
                C6302b<FutureCarpoolRide.InvitationState, RideActionViewConfiguration> bVar = CarpoolRideDetailsFragment.f37856J;
                carpoolRideDetailsFragment.getClass();
                carpoolRideDetailsFragment.mo46797j2(new C17474b(AnalyticsEventKey.DETOUR_OFFERED));
                carpoolRideDetailsFragment.f37860D.setRideDetour(carpoolRideDetour2);
                boolean isChecked = carpoolRideDetailsFragment.f37860D.isChecked();
                carpoolRideDetailsFragment.mo44914s2();
                if (isChecked) {
                    carpoolRideDetour = carpoolRideDetailsFragment.f37860D.getRideDetour();
                } else {
                    carpoolRideDetour = null;
                }
                HasCarpoolRide hasCarpoolRide = carpoolRideDetailsFragment.f37862F;
                if (hasCarpoolRide instanceof FutureCarpoolRide) {
                    carpoolRideDetailsFragment.f37872t.mo44828d((FutureCarpoolRide) hasCarpoolRide, carpoolRideDetour);
                }
                carpoolRideDetailsFragment.mo44907m2();
            }
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$b */
    public class C14830b implements View.OnClickListener {
        public C14830b() {
        }

        public final void onClick(View view) {
            CarpoolRideDetailsFragment carpoolRideDetailsFragment = CarpoolRideDetailsFragment.this;
            C6302b<FutureCarpoolRide.InvitationState, RideActionViewConfiguration> bVar = CarpoolRideDetailsFragment.f37856J;
            carpoolRideDetailsFragment.getClass();
            RideActionViewConfiguration rideActionViewConfiguration = (RideActionViewConfiguration) view.getTag();
            int i = C14833e.f37884b[rideActionViewConfiguration.ordinal()];
            if (i == 1) {
                ((CarpoolRideDetailsActivity) carpoolRideDetailsFragment.f37861E).mo44903y2();
            } else if (i == 2 || i == 3) {
                CarpoolRideDetailsActivity carpoolRideDetailsActivity = (CarpoolRideDetailsActivity) carpoolRideDetailsFragment.f37861E;
                carpoolRideDetailsActivity.mo44547w2("carpool_cancel_ride_clicked");
                AlertDialogFragment.C15856a l = new AlertDialogFragment.C15856a((Context) carpoolRideDetailsActivity).mo47683l(R.string.carpool_cancellation_confirmation_title);
                CarpoolDriver carpoolDriver = carpoolRideDetailsActivity.f37836n0.f40911c;
                AlertDialogFragment.C15856a k = l.mo47679h(carpoolRideDetailsActivity.getString(R.string.carpool_cancellation_confirmation_message, new Object[]{C20964s0.m49102t(" ", carpoolDriver.f40876c, carpoolDriver.f40877d)})).mo47682k("ride_cancellation_tag");
                k.mo47674c(true);
                carpoolRideDetailsActivity.mo44530n2(k.mo47681j(R.string.yes).mo47680i(R.string.no).mo47673b());
            } else if (i == 4) {
                ((CarpoolRideDetailsActivity) carpoolRideDetailsFragment.f37861E).mo44893D2(false);
            } else {
                throw new ApplicationBugException("Unknown view tag: " + rideActionViewConfiguration);
            }
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$c */
    public class C14831c implements View.OnClickListener {
        public C14831c() {
        }

        public final void onClick(View view) {
            ((CarpoolRideDetailsActivity) CarpoolRideDetailsFragment.this.f37861E).mo44893D2(true);
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$d */
    public class C14832d implements ViewTreeObserver.OnGlobalLayoutListener {
        public C14832d() {
        }

        public final void onGlobalLayout() {
            NestedScrollView nestedScrollView = CarpoolRideDetailsFragment.this.f37869q;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            boolean z = true;
            int i = 0;
            if (!nestedScrollView.canScrollVertically(1) && !CarpoolRideDetailsFragment.this.f37869q.canScrollVertically(-1)) {
                z = false;
            }
            View view = CarpoolRideDetailsFragment.this.f37878z;
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$e */
    public static /* synthetic */ class C14833e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37883a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f37884b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$RideActionViewConfiguration[] r0 = com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment.RideActionViewConfiguration.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37884b = r0
                r1 = 1
                com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$RideActionViewConfiguration r2 = com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment.RideActionViewConfiguration.BOOK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f37884b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$RideActionViewConfiguration r3 = com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment.RideActionViewConfiguration.CANCEL_PENDING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f37884b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$RideActionViewConfiguration r4 = com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment.RideActionViewConfiguration.CANCEL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f37884b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$RideActionViewConfiguration r4 = com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment.RideActionViewConfiguration.NO_SHOW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.moovit.carpool.FutureCarpoolRide$InvitationState[] r3 = com.moovit.carpool.FutureCarpoolRide.InvitationState.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f37883a = r3
                com.moovit.carpool.FutureCarpoolRide$InvitationState r4 = com.moovit.carpool.FutureCarpoolRide.InvitationState.INTERESTED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f37883a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r3 = com.moovit.carpool.FutureCarpoolRide.InvitationState.REJECTED_BY_DRIVER     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f37883a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r1 = com.moovit.carpool.FutureCarpoolRide.InvitationState.APPROVED_BY_DRIVER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment.C14833e.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment$f */
    public interface C14834f extends CarpoolDriverView.C14803a {
    }

    static {
        C6302b<FutureCarpoolRide.InvitationState, RideActionViewConfiguration> bVar = new C6302b<>(FutureCarpoolRide.InvitationState.values().length);
        f37856J = bVar;
        bVar.put(FutureCarpoolRide.InvitationState.INVITED, RideActionViewConfiguration.BOOK);
        bVar.put(FutureCarpoolRide.InvitationState.INTERESTED, RideActionViewConfiguration.CANCEL_PENDING);
        bVar.put(FutureCarpoolRide.InvitationState.APPROVED_BY_DRIVER, RideActionViewConfiguration.CANCEL);
    }

    public CarpoolRideDetailsFragment() {
        super(CarpoolRideDetailsActivity.class);
    }

    /* renamed from: R */
    public final void mo44905R() {
        CarpoolRideDetailsActivity carpoolRideDetailsActivity = (CarpoolRideDetailsActivity) this.f37861E;
        FutureCarpoolRide futureCarpoolRide = carpoolRideDetailsActivity.f37837o0;
        carpoolRideDetailsActivity.mo44900L2(futureCarpoolRide, true, futureCarpoolRide.f40937b.f40918j);
    }

    /* renamed from: b */
    public final void mo44906b() {
        ((CarpoolRideDetailsActivity) this.f37861E).mo44904z2();
    }

    /* renamed from: m2 */
    public final void mo44907m2() {
        boolean z;
        if (this.f37857A.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            UiUtils.m40259r(this.f37869q, new C14832d());
        }
    }

    /* renamed from: n2 */
    public final void mo44908n2(String str) {
        Fragment A = getChildFragmentManager().mo3923A(str);
        if (A != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C0909a aVar = new C0909a(childFragmentManager);
            aVar.mo4050p(A);
            aVar.mo4040d();
        }
    }

    /* renamed from: o2 */
    public final boolean mo44909o2() {
        CarpoolRideDetour carpoolRideDetour;
        CarpoolRideDetourView carpoolRideDetourView = this.f37860D;
        if (carpoolRideDetourView != null && carpoolRideDetourView.isChecked()) {
            CarpoolRideDetourView carpoolRideDetourView2 = this.f37860D;
            if (carpoolRideDetourView2 != null) {
                carpoolRideDetour = carpoolRideDetourView2.getRideDetour();
            } else {
                carpoolRideDetour = null;
            }
            if (carpoolRideDetour != null) {
                return true;
            }
        }
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.carpool_ride_details_fragment, viewGroup, false);
        this.f37869q = (NestedScrollView) inflate.findViewById(R.id.scroller);
        this.f37870r = (TextView) inflate.findViewById(R.id.time);
        this.f37871s = (TextView) inflate.findViewById(R.id.date);
        this.f37872t = (CarpoolRidePriceView) inflate.findViewById(R.id.ride_price);
        this.f37873u = (CarpoolRideJourneyView) inflate.findViewById(R.id.ride_journey);
        this.f37874v = (CarpoolDriverView) inflate.findViewById(R.id.driver);
        this.f37858B = (TextView) inflate.findViewById(R.id.bookingSurvey);
        this.f37859C = (TextView) inflate.findViewById(R.id.alert);
        this.f37857A = (ViewGroup) inflate.findViewById(R.id.dock_container);
        this.f37878z = inflate.findViewById(R.id.dock_shadow);
        Button button = (Button) inflate.findViewById(R.id.ride_action);
        this.f37875w = button;
        button.setOnClickListener(this.f37867o);
        Button button2 = (Button) inflate.findViewById(R.id.picked_up_action);
        this.f37877y = button2;
        button2.setOnClickListener(this.f37868p);
        this.f37876x = (TextView) inflate.findViewById(R.id.picked_up_label);
        inflate.findViewById(R.id.view_ride_on_map).setOnClickListener(new C14837c(this));
        CarpoolRideDetourView carpoolRideDetourView = (CarpoolRideDetourView) inflate.findViewById(R.id.detour);
        this.f37860D = carpoolRideDetourView;
        carpoolRideDetourView.setOnCheckedChangeListener(new C19163c(this));
        return inflate;
    }

    /* renamed from: p */
    public final void mo44910p() {
        mo44908n2(C14838d.f37890i);
        ((CarpoolRideDetailsActivity) this.f40822c).finish();
    }

    /* renamed from: p2 */
    public final void mo44911p2(RideActionViewConfiguration rideActionViewConfiguration) {
        this.f37875w.setVisibility(0);
        this.f37857A.setVisibility(0);
        this.f37875w.setText(rideActionViewConfiguration.actionText);
        C17885a.m44441i(this.f37875w, rideActionViewConfiguration.actionThemeOverlay, C20261b.materialButtonStyle, C20266g.Widget_Moovit_Button);
        this.f37875w.setTag(rideActionViewConfiguration);
        if (rideActionViewConfiguration == RideActionViewConfiguration.NO_SHOW) {
            this.f37877y.setVisibility(0);
            this.f37876x.setVisibility(0);
        }
    }

    /* renamed from: q2 */
    public final void mo44912q2(CarpoolRide carpoolRide) {
        mo44908n2(C19161a.f48741h);
        mo44908n2(C14838d.f37890i);
        this.f37859C.setVisibility(8);
        this.f37858B.setVisibility(8);
        if (this.f37875w.getVisibility() == 8) {
            this.f37857A.setVisibility(8);
        }
        this.f37875w.setVisibility(8);
        if (this.f37858B.getVisibility() == 8) {
            this.f37857A.setVisibility(8);
        }
        this.f37877y.setVisibility(8);
        this.f37876x.setVisibility(8);
        this.f37860D.setRideDetour((CarpoolRideDetour) null);
        long j = carpoolRide.f40912d;
        this.f37870r.setText(C7925b.m18024l(getContext(), j));
        this.f37871s.setText(DateUtils.formatDateTime(getContext(), j, 26));
        mo44914s2();
        this.f37874v.mo44853a(carpoolRide.f40911c);
    }

    /* renamed from: r2 */
    public final void mo44913r2(RideAlertType rideAlertType, Object... objArr) {
        this.f37859C.setVisibility(8);
        this.f37859C.postDelayed(new C14836b(this, rideAlertType, objArr), 1000);
    }

    /* renamed from: s2 */
    public final void mo44914s2() {
        HasCarpoolRide hasCarpoolRide;
        CarpoolRideDetour carpoolRideDetour;
        LocationDescriptor locationDescriptor;
        if (this.f37873u != null && (hasCarpoolRide = this.f37862F) != null) {
            CarpoolRide a0 = hasCarpoolRide.mo46811a0();
            LocationDescriptor locationDescriptor2 = null;
            if (mo44909o2()) {
                carpoolRideDetour = this.f37860D.getRideDetour();
            } else {
                carpoolRideDetour = null;
            }
            Itinerary itinerary = this.f37863G;
            if (itinerary == null || !C16783l.m42469a(itinerary, 7) || !C16783l.m42469a(this.f37863G, 2)) {
                CarpoolRideJourneyView carpoolRideJourneyView = this.f37873u;
                TripPlannerLocations tripPlannerLocations = this.f37864H;
                carpoolRideJourneyView.removeAllViews();
                CarpoolLocationDescriptor carpoolLocationDescriptor = a0.f40913e;
                if (tripPlannerLocations != null) {
                    locationDescriptor = tripPlannerLocations.f23786b;
                } else {
                    locationDescriptor = null;
                }
                TripleListItemView b = CarpoolRideJourneyView.m37200b(carpoolRideJourneyView.getContext(), carpoolRideJourneyView, carpoolLocationDescriptor, locationDescriptor, carpoolRideDetour, R.drawable.img_pin_circ_24, R.string.carpool_ride_journey_from_title);
                CarpoolLocationDescriptor carpoolLocationDescriptor2 = a0.f40915g;
                if (tripPlannerLocations != null) {
                    locationDescriptor2 = tripPlannerLocations.f23787c;
                }
                TripleListItemView a = CarpoolRideJourneyView.m37199a(carpoolRideJourneyView.getContext(), carpoolRideJourneyView, carpoolLocationDescriptor2, locationDescriptor2, R.drawable.ic_flag_24_on_surface_emphasis_medium, R.string.carpool_ride_journey_to_title);
                carpoolRideJourneyView.addView(b);
                Context context = carpoolRideJourneyView.getContext();
                Space space = new Space(context);
                space.setLayoutParams(new LinearLayout.LayoutParams(-1, UiUtils.m40248g(context, 24.0f)));
                carpoolRideJourneyView.addView(space);
                carpoolRideJourneyView.addView(a);
                return;
            }
            CarpoolRideJourneyView carpoolRideJourneyView2 = this.f37873u;
            Itinerary itinerary2 = this.f37863G;
            TripPlannerLocations tripPlannerLocations2 = this.f37864H;
            carpoolRideJourneyView2.removeAllViews();
            CarpoolRideJourneyView.C14788b bVar = new CarpoolRideJourneyView.C14788b(carpoolRideJourneyView2, tripPlannerLocations2, itinerary2.mo48295u0(), carpoolRideDetour);
            int i = bVar.f37657g;
            if (i == -1) {
                i = bVar.f37654d.size() - 1;
            }
            for (int i2 = 0; i2 <= i; i2++) {
                List<View> list = (List) bVar.f37654d.get(i2).mo48338i0(bVar);
                if (!C13717b.m34258e(list)) {
                    for (View view : list) {
                        if (bVar.f37652b.getChildCount() > 0) {
                            ViewGroup viewGroup = bVar.f37652b;
                            int i3 = CarpoolRideJourneyView.f37648d;
                            Context context2 = viewGroup.getContext();
                            Space space2 = new Space(context2);
                            space2.setLayoutParams(new LinearLayout.LayoutParams(-1, UiUtils.m40248g(context2, 24.0f)));
                            viewGroup.addView(space2);
                        }
                        bVar.f37652b.addView(view);
                    }
                }
            }
        }
    }
}
