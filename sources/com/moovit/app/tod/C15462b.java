package com.moovit.app.tod;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c00.C13717b;
import c00.C13723g;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.taxi.C15413a;
import com.moovit.app.taxi.providers.TaxiDashboardConfig;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.app.tod.view.TodRideView;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.location.C16202a;
import com.moovit.payment.account.model.PaymentAccount;
import com.tranzmate.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p039c7.C1800c;
import p297w5.C6994a;
import p484ff.C16984m;
import p502fx.C17122g;
import p527gy.C17261e;
import p543hq.C17474b;
import p583jk.C17884p;
import p756qt.C19176e;
import p783rw.C19370b;
import p829tu.C19774e;
import p858uz.C20061g;
import p910xf.C20481j;
import p924xt.C20601i;
import p927xw.C20641i;
import p927xw.C20648o;
import p927xw.C20649p;
import p927xw.C20652s;
import q00.C19047a;
import q00.C19053d;
import w40.C25761d;
import z20.C20806a;

/* renamed from: com.moovit.app.tod.b */
public class C15462b extends C15682c<MoovitAppActivity> implements TodRidesProvider.C15458d {

    /* renamed from: w */
    public static final long f40052w = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: x */
    public static final /* synthetic */ int f40053x = 0;

    /* renamed from: n */
    public final C15463a f40054n = new C15463a();

    /* renamed from: o */
    public final C15464b f40055o = new C15464b();

    /* renamed from: p */
    public final C15465c f40056p = new C15465c();

    /* renamed from: q */
    public final ArrayList f40057q = new ArrayList();

    /* renamed from: r */
    public ListItemView f40058r;

    /* renamed from: s */
    public TextView f40059s;

    /* renamed from: t */
    public TodRideView f40060t;

    /* renamed from: u */
    public ListItemView f40061u;

    /* renamed from: v */
    public ViewGroup f40062v;

    /* renamed from: com.moovit.app.tod.b$a */
    public class C15463a extends BroadcastReceiver {
        public C15463a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C15462b bVar = C15462b.this;
            int i = C15462b.f40053x;
            bVar.mo46208s2();
        }
    }

    /* renamed from: com.moovit.app.tod.b$b */
    public class C15464b extends BroadcastReceiver {
        public C15464b() {
        }

        public final void onReceive(Context context, Intent intent) {
            String str;
            if (intent == null) {
                str = null;
            } else {
                str = intent.getAction();
            }
            if ("com.moovit.useraccount.manager.user_profile_update_success".equals(str)) {
                C15462b bVar = C15462b.this;
                int i = C15462b.f40053x;
                bVar.mo46208s2();
            }
        }
    }

    /* renamed from: com.moovit.app.tod.b$c */
    public class C15465c extends C20641i {
        public C15465c() {
        }

        /* renamed from: f */
        public final void mo46189f(C17122g gVar) {
            C15462b bVar = C15462b.this;
            int i = C15462b.f40053x;
            TodRide todRide = (TodRide) bVar.f40061u.getTag();
            if (todRide != null && todRide.f40264b.equals(gVar.f44313a)) {
                if (!todRide.f40266d.equals(gVar.f44314b)) {
                    TodRidesProvider.m39562d(bVar.requireContext(), "com.moovit.tod_rides_provider.action.ride_status_change");
                }
                if (!TodRideStatus.ACTIVE.equals(gVar.f44314b)) {
                    C15465c cVar = bVar.f40056p;
                    cVar.f52204e = null;
                    cVar.f52205f = null;
                    cVar.f52206g = null;
                    cVar.mo23803d();
                    return;
                }
                ListItemView listItemView = bVar.f40061u;
                listItemView.setTitle(C20652s.m48551f(listItemView.getContext(), gVar));
                ListItemView listItemView2 = bVar.f40061u;
                listItemView2.getContext();
                listItemView2.setSubtitle((CharSequence) C20652s.m48550e(todRide, gVar));
            }
        }

        /* renamed from: g */
        public final void mo46190g(String str) {
            C15462b bVar = C15462b.this;
            int i = C15462b.f40053x;
            bVar.mo46208s2();
        }
    }

    /* renamed from: com.moovit.app.tod.b$d */
    public static /* synthetic */ class C15466d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40066a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.app.tod.model.TodRideStatus[] r0 = com.moovit.app.tod.model.TodRideStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40066a = r0
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40066a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.FUTURE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40066a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.PASSENGER_NOT_SHOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40066a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.DECLINED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.C15462b.C15466d.<clinit>():void");
        }
    }

    public C15462b() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: m2 */
    public static void m39579m2(C15462b bVar, View view) {
        bVar.getClass();
        TodRide todRide = (TodRide) view.getTag();
        if (todRide != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_ride_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.ID, todRide.f40264b);
            aVar.mo49936d(AnalyticsAttributeKey.TIME, todRide.f40265c);
            bVar.mo46797j2(aVar.mo49933a());
            bVar.startActivity(TodRideActivity.m39513z2(view.getContext(), todRide.f40264b));
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireContext()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(3);
        hashSet.add("CONFIGURATION");
        hashSet.add("USER_ACCOUNT");
        hashSet.add("TAXI_PROVIDERS_MANAGER");
        return hashSet;
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        if (((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48449A)).booleanValue()) {
            C17261e.m43265f(requireContext(), this.f40055o, Collections.singletonList("com.moovit.useraccount.manager.user_profile_update_success"));
            TodRidesProvider.m39561c().f40036e.add(this);
        }
        if (this.f40824e) {
            mo46208s2();
        }
    }

    /* renamed from: a0 */
    public final void mo46186a0() {
        mo46208s2();
    }

    /* renamed from: n2 */
    public final TodRide mo46203n2(List list, EnumSet enumSet) {
        this.f40057q.clear();
        C13723g.m34283d(list, this.f40057q, new C20601i(enumSet, 2));
        if (this.f40057q.isEmpty()) {
            return null;
        }
        return (TodRide) Collections.min(this.f40057q, new C19774e(System.currentTimeMillis(), 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r0 != false) goto L_0x0059;
     */
    /* renamed from: o2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46204o2() {
        /*
            r9 = this;
            com.moovit.app.tod.TodRidesProvider r0 = com.moovit.app.tod.TodRidesProvider.m39561c()
            boolean r1 = r0.mo46197f()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            com.moovit.app.tod.TodRidesProvider$b r0 = r0.f40034c
            java.util.List<com.moovit.app.tod.model.TodRide> r0 = r0.f40039a
            if (r0 != 0) goto L_0x0016
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x001a
        L_0x0016:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L_0x001a:
            com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.ACTIVE
            java.util.EnumSet r1 = java.util.EnumSet.of(r1)
            com.moovit.app.tod.model.TodRide r1 = r9.mo46203n2(r0, r1)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x002a
            goto L_0x0059
        L_0x002a:
            com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.FUTURE
            java.util.EnumSet r1 = java.util.EnumSet.of(r1)
            com.moovit.app.tod.model.TodRide r1 = r9.mo46203n2(r0, r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0059
        L_0x0037:
            com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.PASSENGER_NOT_SHOWN
            com.moovit.app.tod.model.TodRideStatus r5 = com.moovit.app.tod.model.TodRideStatus.CANCELLED
            java.util.EnumSet r1 = java.util.EnumSet.of(r1, r5)
            com.moovit.app.tod.model.TodRide r1 = r9.mo46203n2(r0, r1)
            if (r1 == 0) goto L_0x0058
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r1.f40265c
            long r5 = r5 - r7
            long r7 = f40052w
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r0 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r1 = r2
        L_0x0059:
            if (r1 == 0) goto L_0x018a
            int[] r0 = com.moovit.app.tod.C15462b.C15466d.f40066a
            com.moovit.app.tod.model.TodRideStatus r5 = r1.f40266d
            int r5 = r5.ordinal()
            r0 = r0[r5]
            if (r0 == r4) goto L_0x0101
            r2 = 2
            r4 = 2131889207(0x7f120c37, float:1.9413071E38)
            if (r0 == r2) goto L_0x00d1
            r2 = 3
            if (r0 == r2) goto L_0x00a3
            r2 = 4
            if (r0 == r2) goto L_0x0075
            goto L_0x018a
        L_0x0075:
            com.moovit.design.view.list.ListItemView r0 = r9.f40058r
            r0.setTitle((int) r4)
            com.moovit.design.view.list.ListItemView r0 = r9.f40058r
            r0.setVisibility(r3)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r2 = 2131231164(0x7f0801bc, float:1.8078401E38)
            r0.setIcon((int) r2)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r2 = 2131889201(0x7f120c31, float:1.9413059E38)
            r0.setTitle((int) r2)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r2 = 2131889200(0x7f120c30, float:1.9413057E38)
            r0.setSubtitle((int) r2)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r0.setTag(r1)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r0.setVisibility(r3)
            goto L_0x018a
        L_0x00a3:
            com.moovit.design.view.list.ListItemView r0 = r9.f40058r
            r0.setTitle((int) r4)
            com.moovit.design.view.list.ListItemView r0 = r9.f40058r
            r0.setVisibility(r3)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r2 = 2131231179(0x7f0801cb, float:1.8078432E38)
            r0.setIcon((int) r2)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r2 = 2131889206(0x7f120c36, float:1.941307E38)
            r0.setTitle((int) r2)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r2 = 2131889205(0x7f120c35, float:1.9413067E38)
            r0.setSubtitle((int) r2)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r0.setTag(r1)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r0.setVisibility(r3)
            goto L_0x018a
        L_0x00d1:
            com.moovit.design.view.list.ListItemView r0 = r9.f40058r
            r0.setTitle((int) r4)
            com.moovit.design.view.list.ListItemView r0 = r9.f40058r
            r0.setVisibility(r3)
            com.moovit.app.tod.view.TodRideView r0 = r9.f40060t
            r0.setTodRide(r1)
            com.moovit.app.tod.view.TodRideView r0 = r9.f40060t
            r0.setTag(r1)
            com.moovit.app.tod.view.TodRideView r0 = r9.f40060t
            r0.setVisibility(r3)
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "tod_future_ride_impression"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r9.mo46797j2(r0)
            goto L_0x018a
        L_0x0101:
            com.moovit.design.view.list.ListItemView r0 = r9.f40058r
            r4 = 2131889133(0x7f120bed, float:1.941292E38)
            r0.setTitle((int) r4)
            com.moovit.design.view.list.ListItemView r0 = r9.f40058r
            r0.setVisibility(r3)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            android.widget.ImageView r0 = r0.getIconView()
            r10.e r4 = p583jk.C17884p.m44354Y(r0)
            com.moovit.image.model.Image r5 = r1.f40274l
            r10.d r4 = r4.mo51642v(r5)
            com.moovit.image.model.Image r5 = r1.f40274l
            r10.d r4 = r4.mo51628o0(r5)
            r4.mo10850T(r0)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            android.content.Context r4 = r0.getContext()
            java.lang.CharSequence r4 = p927xw.C20652s.m48551f(r4, r2)
            r0.setTitle((java.lang.CharSequence) r4)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r0.getContext()
            java.lang.String r4 = p927xw.C20652s.m48550e(r1, r2)
            r0.setSubtitle((java.lang.CharSequence) r4)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r0.setTag(r1)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            r0.setVisibility(r3)
            com.moovit.design.view.list.ListItemView r0 = r9.f40061u
            java.lang.Object r0 = r0.getTag()
            com.moovit.app.tod.model.TodRide r0 = (com.moovit.app.tod.model.TodRide) r0
            if (r0 == 0) goto L_0x0157
            java.lang.String r1 = r0.f40264b
            goto L_0x0158
        L_0x0157:
            r1 = r2
        L_0x0158:
            com.moovit.app.tod.b$c r3 = r9.f40056p
            java.lang.String r3 = r3.f52205f
            boolean r0 = p977zz.C20975x0.m49118e(r0, r3)
            if (r0 == 0) goto L_0x0163
            goto L_0x0175
        L_0x0163:
            com.moovit.app.tod.b$c r0 = r9.f40056p
            android.content.Context r3 = r9.getContext()
            r0.mo23803d()
            r0.f52204e = r3
            r0.f52205f = r1
            r0.f52206g = r2
            r0.mo23804e()
        L_0x0175:
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "tod_active_ride_impression"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r9.mo46797j2(r0)
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.C15462b.mo46204o2():void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.tod_section_fragment, viewGroup, false);
        ListItemView listItemView = (ListItemView) inflate.findViewById(R.id.header);
        this.f40058r = listItemView;
        listItemView.getAccessoryView().setOnClickListener(new C4052r(this, 24));
        this.f40059s = (TextView) inflate.findViewById(R.id.status_view);
        TodRideView todRideView = (TodRideView) inflate.findViewById(R.id.future_ride);
        this.f40060t = todRideView;
        todRideView.setOnClickListener(new C1800c(this, 25));
        ListItemView listItemView2 = (ListItemView) inflate.findViewById(R.id.real_time);
        this.f40061u = listItemView2;
        listItemView2.setOnClickListener(new C6994a(this, 24));
        this.f40062v = (ViewGroup) inflate.findViewById(R.id.list_view);
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (mo46775H1() && ((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48449A)).booleanValue()) {
            C17261e.m43267h(requireContext(), this.f40055o);
            TodRidesProvider.m39561c().f40036e.remove(this);
        }
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f40054n);
        mo46208s2();
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f40054n);
        C15465c cVar = this.f40056p;
        cVar.f52204e = null;
        cVar.f52205f = null;
        cVar.f52206g = null;
        cVar.mo23803d();
    }

    /* renamed from: p2 */
    public final void mo46205p2(PaymentAccount paymentAccount) {
        ArrayList<T> c = C13723g.m34282c(((TaxiProvidersManager) mo46776J1("TAXI_PROVIDERS_MANAGER")).f39985b, new C20649p(0, this.f40062v.getContext(), paymentAccount, LatLonE6.m40177j(mo46780O1())));
        int size = c.size();
        if (size > 0) {
            this.f40058r.setTitle((int) R.string.tod_directions_promo_banner_title);
            this.f40058r.setVisibility(0);
            this.f40062v.setVisibility(0);
        }
        UiUtils.m40250i(this.f40062v, R.layout.taxi_section_list_item, 0, size);
        for (int i = 0; i < size; i++) {
            TaxiProvider taxiProvider = (TaxiProvider) c.get(i);
            ListItemView listItemView = (ListItemView) this.f40062v.getChildAt(i);
            TaxiDashboardConfig taxiDashboardConfig = taxiProvider.f39978m;
            if (taxiDashboardConfig == null) {
                listItemView.setVisibility(8);
            } else {
                listItemView.setTag(taxiProvider);
                listItemView.setOnClickListener(new C19370b(this, 1));
                Image image = taxiProvider.f39971f;
                ImageView iconView = listItemView.getIconView();
                C17884p.m44354Y(iconView).mo51642v(image).mo51628o0(image).mo22738w(R.drawable.ic_taxi_box_24_on_surface_emphasis_low).mo22730m(R.drawable.ic_taxi_box_24_on_surface_emphasis_low).mo10850T(iconView);
                listItemView.setTitle((CharSequence) taxiDashboardConfig.f39933c);
                listItemView.setSubtitle((CharSequence) taxiDashboardConfig.f39934d);
                C15413a.m39456a((TextView) listItemView.getAccessoryView(), taxiDashboardConfig.f39936f);
                listItemView.setVisibility(0);
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_promo_impression");
            aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, taxiProvider.f39968c);
            mo46797j2(aVar.mo49933a());
            if (!C13717b.m34258e(taxiProvider.f39975j)) {
                C20806a.C20807a aVar2 = new C20806a.C20807a("tod_polygon_se");
                aVar2.mo52934b(taxiProvider.f39968c, "provider_id");
                aVar2.mo52935c();
            }
        }
    }

    /* renamed from: q1 */
    public final void mo46187q1(String str) {
        mo46208s2();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.moovit.payment.account.model.PaymentAccountProfile} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46206q2(com.moovit.payment.account.model.PaymentAccount r4) {
        /*
            r3 = this;
            java.lang.String r0 = "CONFIGURATION"
            java.lang.Object r0 = r3.mo46776J1(r0)
            q00.a r0 = (q00.C19047a) r0
            vr.a$j r1 = p874vr.C20199a.f51258T0
            java.lang.Object r0 = r0.mo51505b(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 8
            if (r0 != 0) goto L_0x001e
            android.widget.TextView r4 = r3.f40059s
            r4.setVisibility(r1)
            return
        L_0x001e:
            sz.r r0 = w40.C25765g.f64279a
            r0 = 0
            if (r4 != 0) goto L_0x0024
            goto L_0x0039
        L_0x0024:
            java.util.List<com.moovit.payment.account.model.PaymentAccountProfile> r4 = r4.f64017f
            boolean r2 = c00.C13717b.m34258e(r4)
            if (r2 != 0) goto L_0x0039
            rb.j r0 = new rb.j
            r2 = 4
            r0.<init>(r2)
            java.lang.Object r4 = java.util.Collections.max(r4, r0)
            r0 = r4
            com.moovit.payment.account.model.PaymentAccountProfile r0 = (com.moovit.payment.account.model.PaymentAccountProfile) r0
        L_0x0039:
            if (r0 == 0) goto L_0x007f
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r4 = r0.f64035d
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r2 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.PENDING
            boolean r4 = r4.isAtLeast(r2)
            if (r4 != 0) goto L_0x0046
            goto L_0x007f
        L_0x0046:
            android.widget.TextView r4 = r3.f40059s
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r1 = r0.f64035d
            w40.C25765g.m64315c(r4, r1)
            android.widget.TextView r4 = r3.f40059s
            fr.a r1 = new fr.a
            r2 = 7
            r1.<init>(r2, r3, r0)
            r4.setOnClickListener(r1)
            android.widget.TextView r4 = r3.f40059s
            r1 = 0
            r4.setVisibility(r1)
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r4 = r0.f64035d
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "tod_profile_issue_impression"
            r0.mo49939g(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.STATUS
            java.lang.String r4 = p379.C13555b.m33980t(r4)
            r0.mo49939g(r1, r4)
            hq.b r4 = r0.mo49933a()
            r3.mo46797j2(r4)
            return
        L_0x007f:
            android.widget.TextView r4 = r3.f40059s
            r4.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.C15462b.mo46206q2(com.moovit.payment.account.model.PaymentAccount):void");
    }

    /* renamed from: r */
    public final void mo46188r(IOException iOException) {
        if (getView() != null) {
            mo46207r2();
        }
    }

    /* renamed from: r2 */
    public final void mo46207r2() {
        UiUtils.m40238F(8, this.f40058r, this.f40060t, this.f40061u, this.f40062v);
        this.f40060t.setTag((Object) null);
        this.f40061u.setTag((Object) null);
    }

    /* renamed from: s2 */
    public final void mo46208s2() {
        if (getView() != null && this.f40824e && mo46775H1()) {
            mo46207r2();
            if (((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48449A)).booleanValue()) {
                C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C19176e(this, 1)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C20648o(this, 0));
                if (C25761d.m64299a().mo83590e()) {
                    C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C16984m(this, 6)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C20481j(this, 2));
                    mo46204o2();
                } else if (((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46575f().mo49805e().f44615n.f40613b) {
                    mo46204o2();
                }
            }
        }
    }
}
