package com.moovit.app.home.dashboard;

import a00.C13382a;
import a00.C13385b;
import a80.C7513a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.C0965s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.AdsFrequencyCappingExperiment;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.suggestedroutes.SuggestedRoutesDelegationSearchLocationCallback;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.TextAnimationView;
import com.moovit.genies.Genie;
import com.moovit.search.SearchLocationActivity;
import com.tranzmate.R;
import j00.C17682a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import m10.C18316a;
import p025b6.C1489d;
import p060d6.C4385f;
import p169m6.C5710d;
import p259t5.C6592b;
import p297w5.C6994a;
import p450dt.C16703d;
import p471eq.C16850a;
import p543hq.C17474b;
import p567iq.C17637d;
import p583jk.C17884p;
import p716oy.C18860a;
import p824tp.C19728f;
import p874vr.C20199a;
import p977zz.C20936e0;
import p977zz.C20941h;
import p977zz.C20943i;
import p977zz.C20964s0;
import q00.C19047a;
import r10.C19218b;
import r10.C19220d;
import r10.C19221e;
import u10.C19860b;

/* renamed from: com.moovit.app.home.dashboard.e */
public class C14936e extends C16703d {

    /* renamed from: p */
    public static final /* synthetic */ int f38205p = 0;

    /* renamed from: o */
    public TextView f38206o;

    /* renamed from: com.moovit.app.home.dashboard.e$a */
    public static class C14937a implements AppBarLayout.C13882f {

        /* renamed from: a */
        public final CollapsingToolbarLayout f38207a;

        /* renamed from: b */
        public final View f38208b;

        /* renamed from: c */
        public final TextView f38209c;

        /* renamed from: d */
        public final View f38210d;

        /* renamed from: e */
        public final View f38211e;

        /* renamed from: f */
        public final AnimatorSet f38212f;

        /* renamed from: g */
        public final AnimatorSet f38213g;

        /* renamed from: com.moovit.app.home.dashboard.e$a$a */
        public class C14938a extends C17682a {

            /* renamed from: a */
            public final /* synthetic */ Collection f38214a;

            /* renamed from: b */
            public final /* synthetic */ Collection f38215b;

            public C14938a(Collection collection, Collection collection2) {
                this.f38214a = collection;
                this.f38215b = collection2;
            }

            public final void onAnimationStart(Animator animator) {
                UiUtils.m40237E(0, this.f38214a);
                UiUtils.m40237E(8, this.f38215b);
            }
        }

        /* renamed from: com.moovit.app.home.dashboard.e$a$b */
        public class C14939b extends C17682a {

            /* renamed from: a */
            public final /* synthetic */ Collection f38216a;

            /* renamed from: b */
            public final /* synthetic */ Collection f38217b;

            public C14939b(Collection collection, Collection collection2) {
                this.f38216a = collection;
                this.f38217b = collection2;
            }

            public final void onAnimationEnd(Animator animator) {
                UiUtils.m40237E(8, this.f38216a);
                UiUtils.m40237E(0, this.f38217b);
            }
        }

        public C14937a(View view, boolean z, boolean z2) {
            Collection collection;
            Collection collection2;
            this.f38207a = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_toolbar);
            View findViewById = view.findViewById(R.id.logo);
            this.f38208b = findViewById;
            TextView textView = (TextView) view.findViewById(R.id.metro);
            this.f38209c = textView;
            View findViewById2 = view.findViewById(R.id.search);
            this.f38210d = findViewById2;
            View findViewById3 = view.findViewById(R.id.search_button_container);
            this.f38211e = findViewById3;
            if (z2) {
                collection = Arrays.asList(new View[]{findViewById, findViewById2});
            } else {
                collection = Collections.singleton(findViewById);
            }
            if (z && z2) {
                collection2 = Arrays.asList(new View[]{textView, findViewById3});
            } else if (z) {
                collection2 = Collections.singleton(textView);
            } else if (z2) {
                collection2 = Collections.singleton(findViewById3);
            } else {
                collection2 = Collections.emptyList();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(findViewById, View.ALPHA, new float[]{1.0f}), ObjectAnimator.ofFloat(findViewById2, View.ALPHA, new float[]{1.0f})});
            this.f38212f = animatorSet;
            animatorSet.setStartDelay(100);
            animatorSet.setDuration(1000);
            animatorSet.addListener(new C14938a(collection, collection2));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(findViewById, View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(findViewById2, View.ALPHA, new float[]{0.0f})});
            this.f38213g = animatorSet2;
            animatorSet2.setDuration(500);
            animatorSet2.addListener(new C14939b(collection, collection2));
        }

        /* renamed from: a */
        public final void mo40881a(AppBarLayout appBarLayout, int i) {
            boolean z;
            int i2 = C20936e0.f52684d;
            float max = 1.0f - Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, (((float) Math.abs(i)) / ((float) appBarLayout.getTotalScrollRange())) * 1.5f));
            boolean z2 = true;
            if (max > BitmapDescriptorFactory.HUE_RED) {
                z = true;
            } else {
                z = false;
            }
            this.f38211e.setAlpha(max);
            this.f38209c.setAlpha(max);
            this.f38209c.setClickable(z);
            if ((this.f38207a.getHeight() / 2) + i < 0) {
                if (this.f38208b.getAlpha() == 1.0f || this.f38212f.isStarted()) {
                    z2 = false;
                }
                if (z2) {
                    this.f38213g.cancel();
                    this.f38212f.start();
                    return;
                }
                return;
            }
            if (this.f38208b.getAlpha() == BitmapDescriptorFactory.HUE_RED || this.f38213g.isStarted()) {
                z2 = false;
            }
            if (z2) {
                this.f38212f.cancel();
                this.f38213g.start();
            }
        }
    }

    /* renamed from: p2 */
    public static void m37727p2(C14936e eVar, View view) {
        eVar.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "location_search_clicked");
        eVar.mo46797j2(aVar.mo49933a());
        eVar.startActivity(SearchLocationActivity.m17347y2(view.getContext(), new SuggestedRoutesDelegationSearchLocationCallback(), "dashboard", (String) null));
        if (AdsFrequencyCappingExperiment.shouldShowAdOnWDYWTGClick()) {
            MobileAdsManager.m37073h().mo44716q(eVar.f40822c, AdSource.TRANSITION_INTERSTITIAL);
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(4);
        hashSet.add("CONFIGURATION");
        hashSet.add("METRO_CONTEXT");
        hashSet.add("UI_CONFIGURATION");
        hashSet.add("METRO_POPULAR_LOCATIONS_CONFIGURATION");
        return hashSet;
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        int i;
        float f;
        C17637d dVar = (C17637d) mo46776J1("UI_CONFIGURATION");
        C19728f fVar = (C19728f) mo46776J1("METRO_CONTEXT");
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        boolean z = false;
        imageView.setColorFilter(Color.argb(153, 0, 0, 0), PorterDuff.Mode.SRC_OVER);
        Context context = view.getContext();
        C19221e X = C17884p.m44353X(context);
        Object[] objArr = {"moovit_2751703405", Integer.valueOf(fVar.f50165a.f16126a.f15142b)};
        String str = C20964s0.f52718a;
        C19220d<Drawable> w = X.mo10880p(String.format((Locale) null, "https://static.moovitapp.com/dash-imgs/%s/%d.jpg", objArr));
        w.getClass();
        C1489d<byte[]> dVar2 = C19218b.f48817a;
        w.mo22712B(C19860b.f50478a, Boolean.TRUE).mo22726i(C4385f.f15421b).mo51636w0().mo22739x(new ColorDrawable(C20941h.m49043f(R.attr.colorSurfaceDark, context))).mo10866g0(C5710d.m14021g()).mo10850T(imageView);
        String str2 = fVar.f50165a.f16129d;
        TextView textView = (TextView) view.findViewById(R.id.metro);
        textView.setText(str2);
        textView.setVisibility(0);
        textView.setEnabled(((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51266b0)).booleanValue());
        if (C18860a.m45884a().f48015c) {
            i = 0;
        } else {
            i = 4;
        }
        textView.setVisibility(i);
        C13382a.C13383a aVar = C13382a.f33219a;
        textView.setAccessibilityDelegate(new C13385b());
        C13382a.m33674j(textView, getString(R.string.voice_over_current_metro, str2), getString(R.string.voice_over_select_metro));
        boolean z2 = C18860a.m45884a().f48015c;
        if (dVar.f45349f != 0) {
            z = true;
        }
        ((AppBarLayout) view.findViewById(R.id.app_bar)).mo40824a(new C14937a(view, z2, z));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.collapsing_toolbar).getLayoutParams();
        if (dVar.f45345b.contains(DashboardSection.SUGGESTIONS)) {
            f = 0.22f;
        } else {
            f = 0.4f;
        }
        layoutParams.height = Math.round(((float) displayMetrics.heightPixels) * f);
        mo45143q2();
    }

    /* renamed from: n2 */
    public final Toolbar mo45130n2() {
        return (Toolbar) mo46799l2(R.id.tool_bar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dashboard_home_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.metro);
        this.f38206o = textView;
        textView.setOnClickListener(new C6994a(this, 9));
        inflate.findViewById(R.id.search).setOnClickListener(new C16850a(this, 7));
        View findViewById = inflate.findViewById(R.id.search_proxy);
        findViewById.setOnClickListener(new C6592b(this, 11));
        C13382a.m33674j(findViewById, getString(R.string.dashboard_search_box_hint), getString(R.string.voice_over_search_locations_hint));
        return inflate;
    }

    public final void onPause() {
        C18316a.C18317a aVar;
        super.onPause();
        if (C20943i.m49051d(23) && (aVar = C18316a.f46708c.f46709a) != null) {
            aVar.mo50769a();
        }
    }

    public final void onResume() {
        super.onResume();
        if (C20943i.m49051d(23)) {
            C18316a.f46708c.mo50767a(Genie.DASHBOARD_METRO_NAME, this.f38206o, this.f40822c);
        }
    }

    public final void onStart() {
        super.onStart();
        mo45143q2();
    }

    /* renamed from: q2 */
    public final void mo45143q2() {
        boolean z;
        View view = getView();
        if (view != null && this.f40824e && mo46775H1()) {
            List<String> list = ((C7513a) mo46776J1("METRO_POPULAR_LOCATIONS_CONFIGURATION")).f22981b;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.search_button_container);
            TextView textView = (TextView) viewGroup.findViewById(R.id.title);
            TextAnimationView textAnimationView = (TextAnimationView) viewGroup.findViewById(R.id.text);
            if (list.isEmpty()) {
                textAnimationView.setTextHint(textAnimationView.getResources().getString(R.string.dashboard_search_box_hint));
                textView.setVisibility(4);
            } else {
                textAnimationView.setAnimatedTextHints(list);
                textView.setVisibility(0);
            }
            C17637d dVar = (C17637d) mo46776J1("UI_CONFIGURATION");
            C13717b.m34269p(dVar.f45345b);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Iterator<DashboardSection> it = dVar.f45345b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (childFragmentManager.mo3923A(it.next().name()) == null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                C0909a aVar = null;
                for (DashboardSection name : DashboardSection.values()) {
                    Fragment A = childFragmentManager.mo3923A(name.name());
                    if (A != null) {
                        if (aVar == null) {
                            aVar = new C0909a(childFragmentManager);
                        }
                        aVar.mo4050p(A);
                    }
                }
                Context context = view.getContext();
                List<DashboardSection> list2 = dVar.f45345b;
                C0965s G = childFragmentManager.mo3929G();
                for (DashboardSection next : list2) {
                    Fragment instantiate = next.instantiate(context, G);
                    if (instantiate != null) {
                        if (aVar == null) {
                            aVar = new C0909a(childFragmentManager);
                        }
                        aVar.mo4041e(R.id.dashboard_sections, instantiate, next.name(), 1);
                    }
                }
                if (aVar != null) {
                    aVar.mo4040d();
                }
            }
        }
    }
}
