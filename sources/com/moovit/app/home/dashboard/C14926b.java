package com.moovit.app.home.dashboard;

import a00.C13382a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import c00.C13722f;
import ce0.C21100e;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.CarpoolRideStateView;
import com.moovit.app.carpool.CarpoolRidesProvider;
import com.moovit.app.carpool.center.CarpoolCenterActivity;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.moovit.carpool.ActiveCarpoolRide;
import com.moovit.carpool.CarpoolRideRequest;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.HasCarpoolRide;
import com.moovit.carpool.HasPassengerRideStops;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import p073e7.C4584b;
import p073e7.C4585c;
import p239rb.C6290f;
import p472er.C16865g;
import p527gy.C17261e;
import p543hq.C17474b;
import p977zz.C20975x0;
import q00.C19047a;
import q00.C19053d;

/* renamed from: com.moovit.app.home.dashboard.b */
public class C14926b extends C15682c<MoovitActivity> implements CarpoolRidesProvider.C14793d {

    /* renamed from: s */
    public static final C14927a f38185s = new C14927a();

    /* renamed from: t */
    public static final C14928b f38186t = new C14928b();

    /* renamed from: u */
    public static final C14929c f38187u = new C14929c();

    /* renamed from: v */
    public static final C6290f f38188v = new C6290f(1);

    /* renamed from: n */
    public final C14930d f38189n = new C14930d();

    /* renamed from: o */
    public ListItemView f38190o;

    /* renamed from: p */
    public ListItemView f38191p;

    /* renamed from: q */
    public Button f38192q;

    /* renamed from: r */
    public ListItemView f38193r;

    /* renamed from: com.moovit.app.home.dashboard.b$a */
    public class C14927a implements C13722f<FutureCarpoolRide> {
        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            FutureCarpoolRide futureCarpoolRide = (FutureCarpoolRide) obj;
            if (futureCarpoolRide.f40939d) {
                return true;
            }
            int i = C14931e.f38195a[futureCarpoolRide.f40938c.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.b$b */
    public class C14928b implements C13722f<CarpoolRideRequest> {
        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            if (C14931e.f38196b[((CarpoolRideRequest) obj).f40935i.ordinal()] != 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.b$c */
    public class C14929c implements Comparator<HasCarpoolRide> {
        public final int compare(Object obj, Object obj2) {
            return C20975x0.m49115b(((HasCarpoolRide) obj).mo46811a0().f40912d, ((HasCarpoolRide) obj2).mo46811a0().f40912d);
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.b$d */
    public class C14930d extends BroadcastReceiver {
        public C14930d() {
        }

        public final void onReceive(Context context, Intent intent) {
            String str;
            if (intent == null) {
                str = null;
            } else {
                str = intent.getAction();
            }
            if ("com.moovit.useraccount.manager.user_profile_update_success".equals(str)) {
                C14926b bVar = C14926b.this;
                C14927a aVar = C14926b.f38185s;
                bVar.mo45137o2();
            }
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.b$e */
    public static /* synthetic */ class C14931e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38195a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f38196b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        static {
            /*
                com.moovit.carpool.RideRequestStatus[] r0 = com.moovit.carpool.RideRequestStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38196b = r0
                r1 = 1
                com.moovit.carpool.RideRequestStatus r2 = com.moovit.carpool.RideRequestStatus.WAITING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f38196b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.carpool.RideRequestStatus r3 = com.moovit.carpool.RideRequestStatus.CANCELED_BY_PASSENGER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f38196b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.carpool.RideRequestStatus r4 = com.moovit.carpool.RideRequestStatus.FULFILLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f38196b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.carpool.RideRequestStatus r5 = com.moovit.carpool.RideRequestStatus.NOT_FULFILLED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.moovit.carpool.FutureCarpoolRide$InvitationState[] r4 = com.moovit.carpool.FutureCarpoolRide.InvitationState.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f38195a = r4
                com.moovit.carpool.FutureCarpoolRide$InvitationState r5 = com.moovit.carpool.FutureCarpoolRide.InvitationState.INTERESTED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f38195a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r4 = com.moovit.carpool.FutureCarpoolRide.InvitationState.APPROVED_BY_DRIVER     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f38195a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r1 = com.moovit.carpool.FutureCarpoolRide.InvitationState.APPROVED_WITH_TIME_CHANGE_BY_DRIVER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f38195a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.moovit.carpool.FutureCarpoolRide$InvitationState r1 = com.moovit.carpool.FutureCarpoolRide.InvitationState.REJECTED_BY_DRIVER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.C14926b.C14931e.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.b$f */
    public class C14932f<CR extends HasCarpoolRide & HasPassengerRideStops> implements View.OnClickListener {

        /* renamed from: b */
        public final CR f38197b;

        public C14932f(HasCarpoolRide hasCarpoolRide) {
            C21100e.m49373x(hasCarpoolRide, "ride");
            this.f38197b = hasCarpoolRide;
        }

        public final void onClick(View view) {
            C14926b bVar = C14926b.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_ride_clicked");
            bVar.mo46797j2(aVar.mo49933a());
            C14926b bVar2 = C14926b.this;
            Context context = view.getContext();
            CR cr = this.f38197b;
            int i = CarpoolRideDetailsActivity.f37829A0;
            bVar2.startActivity(CarpoolRideDetailsActivity.m37357A2(context, cr.mo46811a0().f40910b, ((HasPassengerRideStops) cr).mo46813q0(), (TripPlannerLocations) null, (Itinerary) null, false));
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.b$g */
    public class C14933g implements View.OnClickListener {
        public C14933g() {
        }

        public final void onClick(View view) {
            C14926b bVar = C14926b.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_view_all_rides_clicked");
            bVar.mo46797j2(aVar.mo49933a());
            C14926b.this.startActivity(CarpoolCenterActivity.m37255y2(view.getContext()));
        }
    }

    public C14926b() {
        super(MoovitActivity.class);
    }

    /* renamed from: F0 */
    public final void mo44841F0(int i) {
        if ((i & 19) != 0) {
            mo45137o2();
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "CONFIGURATION", "USER_ACCOUNT");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        if (((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48487z)).booleanValue()) {
            C17261e.m43265f(getContext(), this.f38189n, Collections.singletonList("com.moovit.useraccount.manager.user_profile_update_success"));
            CarpoolRidesProvider.f37661j.f37668g.put(this, 19);
        }
        if (this.f40824e) {
            mo45137o2();
        }
    }

    /* renamed from: d0 */
    public final void mo44842d0(GcmPayload gcmPayload) {
        mo45137o2();
    }

    /* renamed from: g1 */
    public final void mo44843g1(int i) {
        if ((i & 19) != 0 && getView() != null) {
            UiUtils.m40238F(8, this.f38190o, this.f38191p, this.f38192q, this.f38193r);
        }
    }

    /* renamed from: m2 */
    public final void mo45135m2(HasCarpoolRide hasCarpoolRide, CarpoolRideStateView carpoolRideStateView, C14932f fVar) {
        String str;
        ImageView iconView = this.f38191p.getIconView();
        int g = UiUtils.m40248g(requireContext(), 36.0f);
        iconView.setLayoutParams(new ViewGroup.LayoutParams(g, g));
        C16865g.m42681d(this.f38191p.getIconView(), hasCarpoolRide.mo46811a0().f40911c.f40881h);
        ListItemView listItemView = this.f38191p;
        Context context = listItemView.getContext();
        String str2 = hasCarpoolRide.mo46811a0().f40911c.f40876c;
        if (hasCarpoolRide instanceof ActiveCarpoolRide) {
            str = context.getString(R.string.dashboard_carpool_cell_active_ride_title, new Object[]{str2});
        } else {
            if (hasCarpoolRide instanceof FutureCarpoolRide) {
                FutureCarpoolRide futureCarpoolRide = (FutureCarpoolRide) hasCarpoolRide;
                if (futureCarpoolRide.f40939d) {
                    str = context.getString(R.string.dashboard_carpool_cell_canceled_ride_title, new Object[]{str2});
                } else {
                    int i = C14931e.f38195a[futureCarpoolRide.f40938c.ordinal()];
                    if (i == 1) {
                        str = context.getString(R.string.dashboard_carpool_cell_pending_ride_title, new Object[]{str2});
                    } else if (i == 2) {
                        str = context.getString(R.string.carpool_ride_with, new Object[]{str2});
                    } else if (i == 3) {
                        str = context.getString(R.string.dashboard_carpool_cell_changed_ride_title, new Object[]{str2});
                    } else if (i == 4) {
                        str = context.getString(R.string.dashboard_carpool_cell_reject_ride_title, new Object[]{str2});
                    }
                }
            }
            str = null;
        }
        listItemView.setTitle((CharSequence) str);
        ListItemView listItemView2 = this.f38191p;
        listItemView2.setSubtitle((CharSequence) C7925b.m18018f(listItemView2.getContext(), hasCarpoolRide.mo46811a0().f40912d, true));
        carpoolRideStateView.setVisibility(0);
        carpoolRideStateView.mo44831g(hasCarpoolRide);
        this.f38191p.setOnClickListener(fVar);
    }

    /* renamed from: n2 */
    public final void mo45136n2(CarpoolRideRequest carpoolRideRequest, CarpoolRideStateView carpoolRideStateView) {
        this.f38191p.setTitleThemeTextAppearance(R.attr.textAppearanceCaption);
        this.f38191p.setTitleThemeTextColor(R.attr.colorOnSurfaceEmphasisMedium);
        this.f38191p.setSubtitleThemeTextAppearance(R.attr.textAppearanceBody);
        this.f38191p.setSubtitleThemeTextColor(R.attr.colorOnSurface);
        this.f38191p.setTag(carpoolRideRequest);
        this.f38191p.getIconView().setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f38191p.setIcon((int) R.drawable.img_carpool_instant_home_cell);
        ListItemView listItemView = this.f38191p;
        listItemView.setTitle((CharSequence) listItemView.getContext().getString(R.string.carpool_passenger_searching_for_ride_title));
        ListItemView listItemView2 = this.f38191p;
        listItemView2.setSubtitle((CharSequence) listItemView2.getContext().getString(R.string.ride_destination, new Object[]{carpoolRideRequest.f40930d.f23651f}));
        carpoolRideStateView.mo44829e(carpoolRideRequest);
        this.f38191p.setOnClickListener(new C4584b(this, 10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: o2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45137o2() {
        /*
            r16 = this;
            r0 = r16
            boolean r1 = r16.mo46775H1()
            if (r1 == 0) goto L_0x01ad
            android.view.View r1 = r16.getView()
            if (r1 != 0) goto L_0x0010
            goto L_0x01ad
        L_0x0010:
            r1 = 4
            android.view.View[] r1 = new android.view.View[r1]
            com.moovit.design.view.list.ListItemView r2 = r0.f38190o
            r3 = 0
            r1[r3] = r2
            com.moovit.design.view.list.ListItemView r2 = r0.f38191p
            r4 = 1
            r1[r4] = r2
            android.widget.Button r2 = r0.f38192q
            r5 = 2
            r1[r5] = r2
            r2 = 3
            com.moovit.design.view.list.ListItemView r6 = r0.f38193r
            r1[r2] = r6
            r2 = 8
            com.moovit.commons.utils.UiUtils.m40238F(r2, r1)
            java.lang.String r1 = "CONFIGURATION"
            java.lang.Object r1 = r0.mo46776J1(r1)
            q00.a r1 = (q00.C19047a) r1
            r00.a r6 = q00.C19053d.f48487z
            java.lang.Object r6 = r1.mo51505b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0043
            return
        L_0x0043:
            java.lang.String r6 = "USER_ACCOUNT"
            java.lang.Object r6 = r0.mo46776J1(r6)
            com.moovit.app.useraccount.manager.UserAccountManager r6 = (com.moovit.app.useraccount.manager.UserAccountManager) r6
            gy.e r6 = r6.mo46575f()
            gy.d r6 = r6.mo49805e()
            com.moovit.app.useraccount.manager.profile.UserCarpoolData r6 = r6.f44613l
            boolean r6 = r6.f40608b
            if (r6 != 0) goto L_0x005a
            goto L_0x009a
        L_0x005a:
            com.moovit.app.carpool.CarpoolRidesProvider r6 = com.moovit.app.carpool.CarpoolRidesProvider.f37661j
            r7 = 19
            boolean r7 = r6.mo44834d(r7)
            if (r7 == 0) goto L_0x0066
            goto L_0x0177
        L_0x0066:
            com.moovit.app.carpool.CarpoolRidesProvider$b<com.moovit.carpool.ActiveCarpoolRide> r7 = r6.f37664c
            java.util.List<T> r7 = r7.f37671a
            com.moovit.app.carpool.CarpoolRidesProvider$b<com.moovit.carpool.FutureCarpoolRide> r8 = r6.f37663b
            java.util.List<T> r8 = r8.f37671a
            com.moovit.app.home.dashboard.b$a r9 = f38185s
            java.util.ArrayList r8 = c00.C13723g.m34282c(r8, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.moovit.app.carpool.CarpoolRidesProvider$b<com.moovit.carpool.CarpoolRideRequest> r6 = r6.f37667f
            java.util.List<T> r6 = r6.f37671a
            if (r6 == 0) goto L_0x0082
            r9.addAll(r6)
        L_0x0082:
            com.moovit.app.home.dashboard.b$b r6 = f38186t
            java.util.ArrayList r6 = c00.C13723g.m34282c(r9, r6)
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x009d
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x009d
            boolean r9 = r6.isEmpty()
            if (r9 == 0) goto L_0x009d
        L_0x009a:
            r6 = 0
            goto L_0x0178
        L_0x009d:
            android.view.View[] r9 = new android.view.View[r5]
            com.moovit.design.view.list.ListItemView r10 = r0.f38190o
            r9[r3] = r10
            com.moovit.design.view.list.ListItemView r10 = r0.f38191p
            r9[r4] = r10
            com.moovit.commons.utils.UiUtils.m40238F(r3, r9)
            com.moovit.design.view.list.ListItemView r9 = r0.f38191p
            android.view.View r9 = r9.getAccessoryView()
            r10 = 2131364227(0x7f0a0983, float:1.8348285E38)
            android.view.View r9 = r9.findViewById(r10)
            com.moovit.app.carpool.CarpoolRideStateView r9 = (com.moovit.app.carpool.CarpoolRideStateView) r9
            boolean r10 = r7.isEmpty()
            r11 = 0
            if (r10 != 0) goto L_0x00d1
            com.moovit.app.home.dashboard.b$c r10 = f38187u
            java.lang.Object r10 = java.util.Collections.min(r7, r10)
            com.moovit.carpool.ActiveCarpoolRide r10 = (com.moovit.carpool.ActiveCarpoolRide) r10
            com.moovit.app.home.dashboard.b$f r12 = new com.moovit.app.home.dashboard.b$f
            r12.<init>(r10)
            r0.mo45135m2(r10, r9, r12)
            goto L_0x011c
        L_0x00d1:
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L_0x00e0
            com.moovit.app.home.dashboard.b$c r10 = f38187u
            java.lang.Object r10 = java.util.Collections.min(r8, r10)
            com.moovit.carpool.FutureCarpoolRide r10 = (com.moovit.carpool.FutureCarpoolRide) r10
            goto L_0x00e1
        L_0x00e0:
            r10 = r11
        L_0x00e1:
            boolean r12 = r6.isEmpty()
            if (r12 != 0) goto L_0x00f0
            rb.f r12 = f38188v
            java.lang.Object r12 = java.util.Collections.min(r6, r12)
            com.moovit.carpool.CarpoolRideRequest r12 = (com.moovit.carpool.CarpoolRideRequest) r12
            goto L_0x00f1
        L_0x00f0:
            r12 = r11
        L_0x00f1:
            if (r10 == 0) goto L_0x010c
            if (r12 == 0) goto L_0x010c
            com.moovit.carpool.CarpoolRide r13 = r10.f40937b
            long r13 = r13.f40912d
            long r2 = r12.f40931e
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 >= 0) goto L_0x0108
            com.moovit.app.home.dashboard.b$f r2 = new com.moovit.app.home.dashboard.b$f
            r2.<init>(r10)
            r0.mo45135m2(r10, r9, r2)
            goto L_0x011c
        L_0x0108:
            r0.mo45136n2(r12, r9)
            goto L_0x011c
        L_0x010c:
            if (r10 == 0) goto L_0x0117
            com.moovit.app.home.dashboard.b$f r2 = new com.moovit.app.home.dashboard.b$f
            r2.<init>(r10)
            r0.mo45135m2(r10, r9, r2)
            goto L_0x011c
        L_0x0117:
            if (r12 == 0) goto L_0x011c
            r0.mo45136n2(r12, r9)
        L_0x011c:
            int r2 = r7.size()
            int r3 = r8.size()
            int r3 = r3 + r2
            int r2 = r6.size()
            int r2 = r2 + r3
            if (r2 <= r4) goto L_0x0151
            android.widget.Button r3 = r0.f38192q
            r6 = 0
            r3.setVisibility(r6)
            android.widget.Button r3 = r0.f38192q
            r7 = 2131886765(0x7f1202ad, float:1.9408118E38)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r9 = java.lang.String.valueOf(r2)
            r8[r6] = r9
            java.lang.String r6 = r0.getString(r7, r8)
            r3.setText(r6)
            android.widget.Button r3 = r0.f38192q
            com.moovit.app.home.dashboard.b$g r6 = new com.moovit.app.home.dashboard.b$g
            r6.<init>()
            r3.setOnClickListener(r6)
            goto L_0x015d
        L_0x0151:
            android.widget.Button r3 = r0.f38192q
            r6 = 8
            r3.setVisibility(r6)
            android.widget.Button r3 = r0.f38192q
            r3.setOnClickListener(r11)
        L_0x015d:
            hq.b$a r3 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r6 = com.moovit.analytics.AnalyticsEventKey.CARPOOL_SECTION_SHOWN
            r3.<init>(r6)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r7 = "carpool_rides_shown"
            r3.mo49939g(r6, r7)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.COUNT
            r3.mo49935c(r6, r2)
            hq.b r2 = r3.mo49933a()
            r0.mo46797j2(r2)
        L_0x0177:
            r6 = 1
        L_0x0178:
            if (r6 == 0) goto L_0x017b
            return
        L_0x017b:
            r00.a r2 = p874vr.C20199a.f51290n0
            java.lang.Object r1 = r1.mo51505b(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x018a
            goto L_0x01ad
        L_0x018a:
            android.view.View[] r1 = new android.view.View[r5]
            com.moovit.design.view.list.ListItemView r2 = r0.f38190o
            r3 = 0
            r1[r3] = r2
            com.moovit.design.view.list.ListItemView r2 = r0.f38193r
            r1[r4] = r2
            com.moovit.commons.utils.UiUtils.m40238F(r3, r1)
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.CARPOOL_SECTION_SHOWN
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "fast_booking_cell_shown"
            r1.mo49939g(r2, r3)
            hq.b r1 = r1.mo49933a()
            r0.mo46797j2(r1)
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.C14926b.mo45137o2():void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.carpool_section_fragment, viewGroup, false);
        ListItemView listItemView = (ListItemView) inflate.findViewById(R.id.header);
        this.f38190o = listItemView;
        listItemView.getAccessoryView().setOnClickListener(new C4585c(this, 9));
        this.f38191p = (ListItemView) inflate.findViewById(R.id.carpool_ride_preview);
        this.f38192q = (Button) inflate.findViewById(R.id.show_more);
        ListItemView listItemView2 = (ListItemView) inflate.findViewById(R.id.carpool_fast_booking_promo);
        this.f38193r = listItemView2;
        listItemView2.setOnClickListener(new C4051q(this, 12));
        Resources resources = getResources();
        C13382a.m33674j(this.f38193r, resources.getString(R.string.carpool_passenger_booking_feature_title), resources.getString(R.string.carpool_passenger_book_now_action_button));
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (mo46775H1() && ((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48487z)).booleanValue()) {
            C17261e.m43267h(getContext(), this.f38189n);
            CarpoolRidesProvider.f37661j.f37668g.remove(this);
        }
    }

    public final void onStart() {
        super.onStart();
        if (mo46775H1()) {
            mo45137o2();
        }
    }
}
