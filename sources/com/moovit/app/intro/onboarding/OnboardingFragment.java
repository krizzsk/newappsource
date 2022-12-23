package com.moovit.app.intro.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0199g;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.view.TextureVideoHelper;
import com.moovit.commons.view.pager.ViewPager;
import com.tranzmate.R;
import java.util.List;
import p471eq.C16850a;
import p543hq.C17474b;
import p716oy.C18860a;
import p828tt.C19763d;

public class OnboardingFragment extends C15682c<MoovitActivity> {

    /* renamed from: s */
    public static final /* synthetic */ int f38460s = 0;

    /* renamed from: n */
    public final C0199g f38461n = new C0199g(this, 13);

    /* renamed from: o */
    public final C15022a f38462o = new C15022a();

    /* renamed from: p */
    public final List<OnboardingPage> f38463p = C18860a.m45884a().f48027o;

    /* renamed from: q */
    public ViewPager f38464q;

    /* renamed from: r */
    public C19763d f38465r;

    /* renamed from: com.moovit.app.intro.onboarding.OnboardingFragment$a */
    public class C15022a extends ViewPager.C15827c {

        /* renamed from: d */
        public boolean f38466d = false;

        public C15022a() {
        }

        /* renamed from: a */
        public final void mo45259a(int i) {
            String str;
            TextureVideoHelper textureVideoHelper;
            View view = (View) OnboardingFragment.this.f38465r.f47096a.get(i);
            if (!(view == null || (textureVideoHelper = (TextureVideoHelper) view.findViewById(R.id.video).getTag()) == null)) {
                textureVideoHelper.mo47172a();
            }
            OnboardingFragment onboardingFragment = OnboardingFragment.this;
            boolean z = this.f38466d;
            onboardingFragment.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
            aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
            if (z) {
                str = "manual";
            } else {
                str = "auto";
            }
            aVar.mo49939g(analyticsAttributeKey, str);
            onboardingFragment.mo46797j2(aVar.mo49933a());
        }

        public final void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 1) {
                this.f38466d = true;
                OnboardingFragment onboardingFragment = OnboardingFragment.this;
                int i2 = OnboardingFragment.f38460s;
                ViewPager viewPager = onboardingFragment.f38464q;
                if (viewPager != null) {
                    viewPager.removeCallbacks(onboardingFragment.f38461n);
                }
            } else if (i == 0) {
                this.f38466d = false;
            }
        }
    }

    /* renamed from: com.moovit.app.intro.onboarding.OnboardingFragment$b */
    public interface C15023b {
        /* renamed from: D */
        void mo45258D();
    }

    public OnboardingFragment() {
        super(MoovitActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38465r = new C19763d(this.f38463p);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.onboarding_fragment, viewGroup, false);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.pager);
        this.f38464q = viewPager;
        viewPager.addOnPageChangeListener(this.f38462o);
        this.f38464q.setAdapter(this.f38465r);
        this.f38464q.setOffscreenPageLimit(this.f38465r.getCount() - 1);
        inflate.findViewById(R.id.action).setOnClickListener(new C16850a(this, 12));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        this.f38464q.addOnPageChangeListener(this.f38462o);
        ViewPager viewPager = this.f38464q;
        if (viewPager != null) {
            viewPager.postDelayed(this.f38461n, 5500);
        }
    }

    public final void onStop() {
        super.onStop();
        this.f38464q.removeOnPageChangeListener(this.f38462o);
        ViewPager viewPager = this.f38464q;
        if (viewPager != null) {
            viewPager.removeCallbacks(this.f38461n);
        }
    }
}
