package com.moovit.app.itinerary;

import a00.C13382a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomappbar.C13910b;
import com.google.android.material.card.MaterialCardView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.actions.QuickAction;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItineraryMetadata;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.MinutesSpanFormatter;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import g20.C17161i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n00.C18491a;
import n00.C18492b;
import p001a0.C0016g;
import p001a0.C0017h;
import p073e7.C4584b;
import p297w5.C6996c;
import p373au.C13521a;
import p435de.C16596f;
import p453dw.C16738n;
import p471eq.C16850a;
import p543hq.C17474b;
import p613kq.C18118d;
import p638lr.C18267n;
import p824tp.C19728f;
import p858uz.C20061g;
import p977zz.C20944i0;
import p977zz.C20958p0;
import p977zz.C20964s0;
import q00.C19047a;

public abstract class ItineraryStepsBaseActivity extends MoovitAppActivity implements SingleLegCard.C15073a, C13521a.C13525b {

    /* renamed from: x0 */
    public static final /* synthetic */ int f38497x0 = 0;

    /* renamed from: U */
    public final C15027a f38498U = new C15027a();

    /* renamed from: X */
    public Itinerary f38499X;

    /* renamed from: Y */
    public final SparseIntArray f38500Y = new SparseIntArray();

    /* renamed from: Z */
    public final SparseIntArray f38501Z = new SparseIntArray();

    /* renamed from: l0 */
    public ViewPager f38502l0;

    /* renamed from: m0 */
    public C15043f f38503m0;

    /* renamed from: n0 */
    public C17161i<C16181a.C16184c, TransitLine> f38504n0;

    /* renamed from: o0 */
    public C15054j f38505o0;

    /* renamed from: p0 */
    public C18492b f38506p0;

    /* renamed from: q0 */
    public int f38507q0 = -1;

    /* renamed from: r0 */
    public C20944i0<Integer, Integer> f38508r0;

    /* renamed from: s0 */
    public View f38509s0;

    /* renamed from: t0 */
    public C18118d f38510t0;

    /* renamed from: u0 */
    public TextView f38511u0;

    /* renamed from: v0 */
    public final C15028b f38512v0 = new C15028b();

    /* renamed from: w0 */
    public C16738n f38513w0;

    /* renamed from: com.moovit.app.itinerary.ItineraryStepsBaseActivity$a */
    public class C15027a extends ViewPager.SimpleOnPageChangeListener {

        /* renamed from: b */
        public boolean f38514b = false;

        public C15027a() {
        }

        public final void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 1) {
                this.f38514b = true;
            }
            if (i == 0) {
                this.f38514b = false;
            }
        }

        public final void onPageSelected(int i) {
            String str;
            int b = ItineraryStepsBaseActivity.this.f38502l0.mo47353b(i);
            ItineraryStepsBaseActivity.this.mo45285K2(b);
            if (this.f38514b) {
                ItineraryStepsBaseActivity itineraryStepsBaseActivity = ItineraryStepsBaseActivity.this;
                int Q2 = itineraryStepsBaseActivity.mo45291Q2(b);
                if (!itineraryStepsBaseActivity.mo45288N2() || b != 0) {
                    str = C0016g.m20c(itineraryStepsBaseActivity.f38499X.mo48295u0().get(Q2).getType());
                } else {
                    str = "start_step";
                }
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
                aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_STEP_TYPE, str);
                aVar.mo49935c(AnalyticsAttributeKey.ITINERARY_STEP_INDEX, b);
                itineraryStepsBaseActivity.mo44545v2(aVar.mo49933a());
            }
        }
    }

    /* renamed from: com.moovit.app.itinerary.ItineraryStepsBaseActivity$b */
    public class C15028b implements Runnable {
        public C15028b() {
        }

        public final void run() {
            ItineraryStepsBaseActivity.this.f38511u0.setVisibility(0);
        }
    }

    /* renamed from: com.moovit.app.itinerary.ItineraryStepsBaseActivity$c */
    public static /* synthetic */ class C15029c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38517a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.micromobility.MicroMobilityIntegrationFlow[] r0 = com.moovit.micromobility.MicroMobilityIntegrationFlow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38517a = r0
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.DEEP_LINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38517a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.RESERVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38517a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.UNLOCK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.itinerary.ItineraryStepsBaseActivity.C15029c.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.itinerary.ItineraryStepsBaseActivity$d */
    public class C15030d extends C18491a<SingleLegCard> {

        /* renamed from: b */
        public int f38518b;

        /* renamed from: c */
        public int f38519c = 0;

        public C15030d(int i) {
            this.f38518b = i;
        }

        /* renamed from: b */
        public final View mo45295b(ViewGroup viewGroup, int i) {
            return (SingleLegCard) C13715c.m34239e(viewGroup, R.layout.single_card_leg, viewGroup, false);
        }

        /* renamed from: c */
        public final void mo23842a(SingleLegCard singleLegCard, int i) {
            boolean z;
            boolean z2;
            int count = getCount();
            if (ItineraryStepsBaseActivity.this.mo45281G2() && count > 1) {
                singleLegCard.findViewById(R.id.floating_button).setVisibility(8);
            }
            int i2 = 0;
            if (!ItineraryStepsBaseActivity.this.mo45288N2() || i != 0) {
                z = false;
            } else {
                z = true;
            }
            int Q2 = ItineraryStepsBaseActivity.this.mo45291Q2(i);
            List<Leg> u0 = ItineraryStepsBaseActivity.this.f38499X.mo48295u0();
            Leg u = C16783l.m42489u(Q2, u0);
            singleLegCard.setLiveLegType(ItineraryStepsBaseActivity.this.mo45281G2());
            ItineraryStepsBaseActivity itineraryStepsBaseActivity = ItineraryStepsBaseActivity.this;
            C17161i<C16181a.C16184c, TransitLine> iVar = itineraryStepsBaseActivity.f38504n0;
            C16738n nVar = itineraryStepsBaseActivity.f38513w0;
            singleLegCard.mo45350H(u0.get(Q2), u, z, iVar, nVar);
            singleLegCard.setLegActionsListener(ItineraryStepsBaseActivity.this);
            if (ItineraryStepsBaseActivity.this.mo45276B2()) {
                singleLegCard.setFabStyle(ItineraryStepsBaseActivity.this.mo45281G2());
                singleLegCard.setFabClickListener(new C16850a(this, 14));
            } else {
                singleLegCard.f38683S.mo41671h((C13910b) null, true);
            }
            if (z || Q2 != ItineraryStepsBaseActivity.this.f38499X.mo48295u0().size() - 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            singleLegCard.setIsLastLeg(z2);
            singleLegCard.setCardTopMargin(this.f38518b);
            if (count > 1) {
                i2 = this.f38519c;
            }
            singleLegCard.setCardBottomExtraMargin(i2);
        }

        public final int getCount() {
            return ItineraryStepsBaseActivity.this.f38501Z.size();
        }

        public final void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            int count = getCount();
            for (int i = 0; i < count; i++) {
                SingleLegCard singleLegCard = (SingleLegCard) ((View) this.f47096a.get(i));
                if (singleLegCard != null) {
                    mo23842a(singleLegCard, i);
                }
            }
        }
    }

    /* renamed from: A2 */
    public void mo45275A2() {
        this.f38511u0 = (TextView) findViewById(R.id.floating_hint);
        this.f38502l0 = (com.moovit.commons.view.pager.ViewPager) findViewById(R.id.pager);
        View findViewById = findViewById(R.id.pager_indicator_container);
        this.f38509s0 = findViewById;
        findViewById.findViewById(R.id.prev_button).setOnClickListener(new C6996c(this, 17));
        this.f38509s0.findViewById(R.id.next_button).setOnClickListener(new C4584b(this, 17));
        this.f38502l0.addOnLayoutChangeListener(new C15051g(this));
    }

    /* renamed from: B2 */
    public abstract boolean mo45276B2();

    /* renamed from: C2 */
    public abstract void mo45277C2();

    /* renamed from: D2 */
    public abstract AdSource mo45278D2();

    /* renamed from: E2 */
    public abstract int mo45279E2();

    /* renamed from: F2 */
    public abstract C19047a.C19049b<List<QuickAction>> mo45280F2();

    /* renamed from: G2 */
    public abstract boolean mo45281G2();

    /* renamed from: H2 */
    public final int mo45282H2(int i) {
        return this.f38500Y.get(i, -1);
    }

    /* renamed from: I2 */
    public void mo45283I2(int i) {
        int i2;
        int i3;
        Itinerary itinerary = this.f38499X;
        this.f38500Y.clear();
        this.f38501Z.clear();
        List<Leg> u0 = itinerary.mo48295u0();
        int size = u0.size();
        if (mo45288N2()) {
            this.f38501Z.append(0, 0);
            i3 = 0;
            i2 = 1;
        } else {
            i3 = 0;
            i2 = 0;
        }
        while (i3 < size) {
            if (u0.get(i3).getType() != 8) {
                this.f38500Y.append(i3, i2);
                this.f38501Z.append(i2, i3);
                i2++;
            }
            i3++;
        }
        this.f38503m0.mo45313d(this.f38499X, (C16769e.C16772c) null);
        this.f38507q0 = mo45282H2(i);
        if (this.f38499X != null) {
            C18492b bVar = new C18492b((PagerAdapter) new C15030d(this.f38502l0.getHeight() - getResources().getDimensionPixelSize(R.dimen.card_peek_size)), (Context) this);
            this.f38506p0 = bVar;
            this.f38502l0.setAdapter(bVar);
            this.f38502l0.addOnPageChangeListener(this.f38498U);
            this.f38502l0.setOffscreenPageLimit(Math.max(this.f38506p0.getCount() - 1, 1));
            int i4 = this.f38507q0;
            if (i4 != -1) {
                this.f38502l0.setCurrentLogicalItem(i4);
            } else if (this.f38502l0.getCurrentLogicalItem() == 0) {
                mo45285K2(0);
            }
        }
        if (mo45289O2()) {
            if (this.f38505o0 == null) {
                this.f38505o0 = new C15054j(this, this);
            }
            ItineraryMetadata itineraryMetadata = this.f38499X.f41895c;
            ItineraryMetadata itineraryMetadata2 = new ItineraryMetadata(itineraryMetadata.f41900b, itineraryMetadata.f41901c, itineraryMetadata.f41902d, itineraryMetadata.f41903e, itineraryMetadata.f41904f, itineraryMetadata.f41905g, itineraryMetadata.f41906h, false, itineraryMetadata.f41908j, itineraryMetadata.f41909k, itineraryMetadata.f41910l);
            Itinerary itinerary2 = this.f38499X;
            this.f38505o0.mo49466h(new Itinerary(itinerary2.f41894b, itineraryMetadata2, itinerary2.mo48295u0()));
            this.f38505o0.mo23804e();
        }
        C19047a.C19049b<List<QuickAction>> F2 = mo45280F2();
        if (F2 == null) {
            C18118d dVar = this.f38510t0;
            if (!(dVar == null || dVar.f46327c == null)) {
                C0909a b = C18118d.m44800b(dVar.f46325a);
                if (b != null) {
                    b.mo4046l();
                }
                dVar.f46327c.setVisibility(8);
            }
            this.f38510t0 = null;
        } else {
            C18118d dVar2 = this.f38510t0;
            if (dVar2 == null) {
                C18118d dVar3 = new C18118d(this, F2);
                this.f38510t0 = dVar3;
                dVar3.mo50564a();
            } else if (dVar2.f46326b.equals(F2)) {
                this.f38510t0.mo50564a();
            }
        }
        C14741h hVar = new C14741h();
        hVar.mo44745a(1, mo44542u1());
        hVar.mo44745a(2, this.f38499X.mo48290c().mo48334e2().mo24310d());
        ((MoovitAnchoredBannerAdFragment) ((FragmentContainerView) findViewById(R.id.banner_ad_fragment)).getFragment()).mo44739o2(mo45278D2(), hVar);
    }

    /* renamed from: J2 */
    public final void mo45284J2(int i, int i2, List<Leg> list, Schedule schedule) {
        Leg leg;
        if (i > 0) {
            int i3 = i2 - 1;
            int c = this.f38502l0.mo47354c(i3);
            int Q2 = mo45291Q2(i3);
            if (Q2 == -1) {
                leg = null;
            } else {
                leg = list.get(Q2);
            }
            if (leg != null && leg.getType() == 1 && ((SingleLegCard) this.f38502l0.mo47352a(c)).isSelected()) {
                mo45287M2(schedule);
            }
        }
    }

    /* renamed from: K2 */
    public void mo45285K2(int i) {
        mo45292y2(i);
        com.moovit.commons.view.pager.ViewPager viewPager = this.f38502l0;
        SingleLegCard singleLegCard = (SingleLegCard) viewPager.mo47352a(viewPager.mo47354c(i));
        if (singleLegCard != null) {
            MaterialCardView materialCardView = singleLegCard.f38678N;
            C13382a.C13383a aVar = C13382a.f33219a;
            if (materialCardView != null) {
                materialCardView.requestFocus();
                materialCardView.sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.HashMap] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45286L2(java.lang.String r3, p241s0.C6302b r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x0007
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x0007:
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r0.mo49939g(r1, r3)
            java.util.EnumMap r3 = r0.f44998b
            r3.putAll(r4)
            hq.b r3 = r0.mo49933a()
            r2.mo44545v2(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.itinerary.ItineraryStepsBaseActivity.mo45286L2(java.lang.String, s0.b):void");
    }

    /* renamed from: M2 */
    public final void mo45287M2(Schedule schedule) {
        List list;
        int i;
        if (schedule == null) {
            list = Collections.emptyList();
        } else {
            list = C13717b.m34260g(3, C13717b.m34265l(schedule.mo24327n(), new C15053i(0)));
        }
        if (list.isEmpty()) {
            this.f38511u0.removeCallbacks(this.f38512v0);
            this.f38511u0.setVisibility(8);
            return;
        }
        ArrayList c = C13720d.m34273c(list, (C13722f) null, new C18267n(4));
        MinutesSpanFormatter minutesSpanFormatter = C7925b.f23936c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(C20964s0.m49085c(this.f38511u0.getContext(), R.drawable.ic_real_time_12_live));
        long currentTimeMillis = System.currentTimeMillis();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(minutesSpanFormatter.mo24608h(this, currentTimeMillis, c, 2147483647L, Collections.emptySet()));
        spannableStringBuilder.setSpan(C20964s0.m49084b(this.f38511u0.getContext(), R.attr.textAppearanceBodySmallStrong, R.attr.colorLive), length, spannableStringBuilder.length(), 33);
        SpannableString j = minutesSpanFormatter.mo24610j(this, C7925b.m18026n(currentTimeMillis, ((Long) c.get(0)).longValue()), Collections.emptyList());
        TextView textView = this.f38511u0;
        Resources resources = getResources();
        if (j == null) {
            i = R.string.live_notification_walk_rt_now_leaves;
        } else {
            i = R.string.live_notification_walk_rt;
        }
        textView.setText(C20958p0.m49077a(resources.getString(i), spannableStringBuilder));
        if (this.f38502l0.getVisibility() == 0 && this.f38502l0.getTranslationY() == BitmapDescriptorFactory.HUE_RED) {
            this.f38511u0.setVisibility(0);
        } else {
            this.f38511u0.postDelayed(this.f38512v0, 3000);
        }
        TextView textView2 = this.f38511u0;
        textView2.setContentDescription(textView2.getText());
    }

    /* renamed from: N2 */
    public abstract boolean mo45288N2();

    /* renamed from: O2 */
    public abstract boolean mo45289O2();

    /* renamed from: P2 */
    public final void mo45290P2(MultiTransitLinesLeg multiTransitLinesLeg, int i) {
        int H2 = mo45282H2(i);
        if (H2 == -1) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("leg index not found in views"));
            return;
        }
        SingleLegCard singleLegCard = (SingleLegCard) this.f38502l0.mo47352a(this.f38502l0.mo47354c(H2));
        if (singleLegCard == null) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("card leg not found in view pager"));
            return;
        }
        singleLegCard.mo45350H(multiTransitLinesLeg, C16783l.m42489u(i, this.f38499X.mo48295u0()), false, this.f38504n0, this.f38513w0);
        this.f38503m0.mo45313d(this.f38499X, this.f38505o0.f43661l);
    }

    /* renamed from: Q2 */
    public final int mo45291Q2(int i) {
        return this.f38501Z.get(i, -1);
    }

    /* renamed from: c2 */
    public void mo24880c2() {
        super.mo24880c2();
        C15054j jVar = this.f38505o0;
        if (jVar != null) {
            jVar.mo23803d();
        }
    }

    /* renamed from: e2 */
    public void mo19425e2(Bundle bundle) {
        Itinerary itinerary;
        int i;
        super.mo19425e2(bundle);
        setContentView(mo45279E2());
        MapFragment mapFragment = (MapFragment) mo44529n1(R.id.map_fragment);
        mapFragment.mo48656t2(new C15052h(mapFragment, 0));
        Rect rect = new Rect();
        rect.set(mapFragment.f42369n0);
        rect.bottom = getResources().getDimensionPixelSize(R.dimen.card_peek_size) + rect.bottom;
        mapFragment.mo48647o3(rect);
        int i2 = rect.bottom;
        mapFragment.f42391y0 = 1.0f;
        mapFragment.f42393z0 = 1.0f;
        mapFragment.f42335A0 = 0;
        mapFragment.f42337B0 = i2;
        if (mapFragment.mo48624U2()) {
            mapFragment.f42368n.mo48790g(0, 1.0f, 1.0f, i2);
        }
        this.f38503m0 = new C15043f(this, mapFragment);
        mo45275A2();
        this.f38513w0 = C16738n.m42285w2(getSupportFragmentManager());
        HashSet hashSet = C19728f.f50164e;
        this.f38504n0 = ((C19728f) getSystemService("metro_context")).mo52082b(LinePresentationType.ITINERARY);
        if (bundle == null || !bundle.containsKey("scheduled_itinerary_key")) {
            itinerary = (Itinerary) getIntent().getParcelableExtra("scheduled_itinerary_key");
        } else {
            itinerary = (Itinerary) bundle.getParcelable("scheduled_itinerary_key");
        }
        this.f38499X = itinerary;
        if (bundle == null || !bundle.containsKey("scheduled_itinerary_leg_index_key")) {
            i = getIntent().getIntExtra("scheduled_itinerary_leg_index_key", -1);
        } else {
            i = bundle.getInt("scheduled_itinerary_leg_index_key", -1);
        }
        if (this.f38499X != null) {
            mo45283I2(i);
        }
    }

    /* renamed from: f2 */
    public void mo24881f2() {
        super.mo24881f2();
        C15054j jVar = this.f38505o0;
        if (jVar != null) {
            jVar.mo23804e();
        }
    }

    /* renamed from: g2 */
    public void mo23894g2(Bundle bundle) {
        Itinerary itinerary = this.f38499X;
        if (itinerary != null) {
            bundle.putParcelable("scheduled_itinerary_key", itinerary);
            bundle.putInt("scheduled_itinerary_leg_index_key", mo45291Q2(this.f38502l0.getCurrentLogicalItem()));
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: m */
    public void mo40416m(MultiTransitLinesLeg multiTransitLinesLeg, int i) {
        Itinerary itinerary = this.f38499X;
        if (itinerary != null) {
            int g = C16783l.m42475g(itinerary.mo48295u0(), multiTransitLinesLeg);
            C20944i0<Integer, Integer> i0Var = new C20944i0<>(Integer.valueOf(g), Integer.valueOf(multiTransitLinesLeg.f42087c));
            boolean D = C16783l.m42467D(itinerary, multiTransitLinesLeg, i);
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.WAS_LINE_CHANGED);
            aVar.mo49941i(AnalyticsAttributeKey.LINE_CHANGED, D);
            mo44545v2(aVar.mo49933a());
            if (D) {
                this.f38508r0 = i0Var;
                mo45290P2(multiTransitLinesLeg, g);
            }
        }
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        boolean z;
        Itinerary itinerary = (Itinerary) getIntent().getParcelableExtra("scheduled_itinerary_key");
        if (itinerary == null || !itinerary.f41895c.f41908j) {
            z = false;
        } else {
            z = true;
        }
        String I = C0017h.m52I(itinerary);
        int e = C16783l.m42473e(itinerary);
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49941i(AnalyticsAttributeKey.WHEELCHAIR_ACCESSIBLE, z);
        m1.mo49939g(AnalyticsAttributeKey.ROUTE_TYPE, I);
        m1.mo49935c(AnalyticsAttributeKey.NUM_OF_WAIT_ON_VEHICLE_LEGS, e);
        m1.mo49941i(AnalyticsAttributeKey.WALKING_ROUTE, "walk_route_shown".equals(I));
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("TAXI_PROVIDERS_MANAGER");
        hashSet.add("TWITTER_SERVICE_ALERTS_FEEDS");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45292y2(int i) {
        int Q2 = mo45291Q2(i);
        if (Q2 < 0) {
            this.f38503m0.mo45311b(this.f38499X);
        } else {
            mo45293z2(this.f38499X.mo48295u0().get(Q2));
        }
    }

    /* renamed from: z2 */
    public void mo45293z2(Leg leg) {
        this.f38503m0.mo45312c(leg, false);
    }
}
