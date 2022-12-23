package com.google.android.exoplayer2.p052ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.activity.C0194b;
import androidx.activity.C0199g;
import com.google.android.exoplayer2.p052ui.StyledPlayerControlView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import p054d0.C4268a1;
import p054d0.C4278e0;
import p259t5.C6592b;
import p259t5.C6593c;
import p304x.C7073m;

/* renamed from: com.google.android.exoplayer2.ui.z */
public final class C4060z {

    /* renamed from: A */
    public boolean f14517A;

    /* renamed from: B */
    public boolean f14518B;

    /* renamed from: C */
    public boolean f14519C = true;

    /* renamed from: a */
    public final StyledPlayerControlView f14520a;

    /* renamed from: b */
    public final View f14521b;

    /* renamed from: c */
    public final ViewGroup f14522c;

    /* renamed from: d */
    public final ViewGroup f14523d;

    /* renamed from: e */
    public final ViewGroup f14524e;

    /* renamed from: f */
    public final ViewGroup f14525f;

    /* renamed from: g */
    public final ViewGroup f14526g;

    /* renamed from: h */
    public final ViewGroup f14527h;

    /* renamed from: i */
    public final ViewGroup f14528i;

    /* renamed from: j */
    public final View f14529j;

    /* renamed from: k */
    public final View f14530k;

    /* renamed from: l */
    public final AnimatorSet f14531l;

    /* renamed from: m */
    public final AnimatorSet f14532m;

    /* renamed from: n */
    public final AnimatorSet f14533n;

    /* renamed from: o */
    public final AnimatorSet f14534o;

    /* renamed from: p */
    public final AnimatorSet f14535p;

    /* renamed from: q */
    public final ValueAnimator f14536q;

    /* renamed from: r */
    public final ValueAnimator f14537r;

    /* renamed from: s */
    public final C4278e0 f14538s = new C4278e0(this, 7);

    /* renamed from: t */
    public final C0194b f14539t = new C0194b(this, 6);

    /* renamed from: u */
    public final C4268a1 f14540u = new C4268a1(this, 9);

    /* renamed from: v */
    public final C7073m f14541v = new C7073m(this, 5);

    /* renamed from: w */
    public final C0199g f14542w = new C0199g(this, 8);

    /* renamed from: x */
    public final C4057w f14543x = new C4057w(this, 0);

    /* renamed from: y */
    public final ArrayList f14544y = new ArrayList();

    /* renamed from: z */
    public int f14545z = 0;

    /* renamed from: com.google.android.exoplayer2.ui.z$a */
    public class C4061a extends AnimatorListenerAdapter {
        public C4061a() {
        }

        public final void onAnimationEnd(Animator animator) {
            View view = C4060z.this.f14521b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = C4060z.this.f14522c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = C4060z.this.f14524e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            C4060z zVar = C4060z.this;
            View view = zVar.f14529j;
            if ((view instanceof DefaultTimeBar) && !zVar.f14517A) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (defaultTimeBar.f14167F.isStarted()) {
                    defaultTimeBar.f14167F.cancel();
                }
                defaultTimeBar.f14167F.setFloatValues(new float[]{defaultTimeBar.f14168G, 0.0f});
                defaultTimeBar.f14167F.setDuration(250);
                defaultTimeBar.f14167F.start();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.z$b */
    public class C4062b extends AnimatorListenerAdapter {
        public C4062b() {
        }

        public final void onAnimationStart(Animator animator) {
            int i;
            View view = C4060z.this.f14521b;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = C4060z.this.f14522c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            C4060z zVar = C4060z.this;
            ViewGroup viewGroup2 = zVar.f14524e;
            if (viewGroup2 != null) {
                if (zVar.f14517A) {
                    i = 0;
                } else {
                    i = 4;
                }
                viewGroup2.setVisibility(i);
            }
            C4060z zVar2 = C4060z.this;
            View view2 = zVar2.f14529j;
            if ((view2 instanceof DefaultTimeBar) && !zVar2.f14517A) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                if (defaultTimeBar.f14167F.isStarted()) {
                    defaultTimeBar.f14167F.cancel();
                }
                defaultTimeBar.f14169H = false;
                defaultTimeBar.f14167F.setFloatValues(new float[]{defaultTimeBar.f14168G, 1.0f});
                defaultTimeBar.f14167F.setDuration(250);
                defaultTimeBar.f14167F.start();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.z$c */
    public class C4063c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f14548a;

        public C4063c(StyledPlayerControlView styledPlayerControlView) {
            this.f14548a = styledPlayerControlView;
        }

        public final void onAnimationEnd(Animator animator) {
            C4060z.this.mo16679i(1);
            C4060z zVar = C4060z.this;
            if (zVar.f14518B) {
                this.f14548a.post(zVar.f14538s);
                C4060z.this.f14518B = false;
            }
        }

        public final void onAnimationStart(Animator animator) {
            C4060z.this.mo16679i(3);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.z$d */
    public class C4064d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f14550a;

        public C4064d(StyledPlayerControlView styledPlayerControlView) {
            this.f14550a = styledPlayerControlView;
        }

        public final void onAnimationEnd(Animator animator) {
            C4060z.this.mo16679i(2);
            C4060z zVar = C4060z.this;
            if (zVar.f14518B) {
                this.f14550a.post(zVar.f14538s);
                C4060z.this.f14518B = false;
            }
        }

        public final void onAnimationStart(Animator animator) {
            C4060z.this.mo16679i(3);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.z$e */
    public class C4065e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f14552a;

        public C4065e(StyledPlayerControlView styledPlayerControlView) {
            this.f14552a = styledPlayerControlView;
        }

        public final void onAnimationEnd(Animator animator) {
            C4060z.this.mo16679i(2);
            C4060z zVar = C4060z.this;
            if (zVar.f14518B) {
                this.f14552a.post(zVar.f14538s);
                C4060z.this.f14518B = false;
            }
        }

        public final void onAnimationStart(Animator animator) {
            C4060z.this.mo16679i(3);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.z$f */
    public class C4066f extends AnimatorListenerAdapter {
        public C4066f() {
        }

        public final void onAnimationEnd(Animator animator) {
            C4060z.this.mo16679i(0);
        }

        public final void onAnimationStart(Animator animator) {
            C4060z.this.mo16679i(4);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.z$g */
    public class C4067g extends AnimatorListenerAdapter {
        public C4067g() {
        }

        public final void onAnimationEnd(Animator animator) {
            C4060z.this.mo16679i(0);
        }

        public final void onAnimationStart(Animator animator) {
            C4060z.this.mo16679i(4);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.z$h */
    public class C4068h extends AnimatorListenerAdapter {
        public C4068h() {
        }

        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = C4060z.this.f14525f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = C4060z.this.f14527h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = C4060z.this.f14527h;
                viewGroup2.setTranslationX((float) viewGroup2.getWidth());
                ViewGroup viewGroup3 = C4060z.this.f14527h;
                viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.z$i */
    public class C4069i extends AnimatorListenerAdapter {
        public C4069i() {
        }

        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = C4060z.this.f14527h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = C4060z.this.f14525f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    public C4060z(StyledPlayerControlView styledPlayerControlView) {
        this.f14520a = styledPlayerControlView;
        this.f14521b = styledPlayerControlView.findViewById(C4040i.exo_controls_background);
        this.f14522c = (ViewGroup) styledPlayerControlView.findViewById(C4040i.exo_center_controls);
        this.f14524e = (ViewGroup) styledPlayerControlView.findViewById(C4040i.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(C4040i.exo_bottom_bar);
        this.f14523d = viewGroup;
        this.f14528i = (ViewGroup) styledPlayerControlView.findViewById(C4040i.exo_time);
        View findViewById = styledPlayerControlView.findViewById(C4040i.exo_progress);
        this.f14529j = findViewById;
        this.f14525f = (ViewGroup) styledPlayerControlView.findViewById(C4040i.exo_basic_controls);
        this.f14526g = (ViewGroup) styledPlayerControlView.findViewById(C4040i.exo_extra_controls);
        this.f14527h = (ViewGroup) styledPlayerControlView.findViewById(C4040i.exo_extra_controls_scroll_view);
        View findViewById2 = styledPlayerControlView.findViewById(C4040i.exo_overflow_show);
        this.f14530k = findViewById2;
        View findViewById3 = styledPlayerControlView.findViewById(C4040i.exo_overflow_hide);
        if (!(findViewById2 == null || findViewById3 == null)) {
            findViewById2.setOnClickListener(new C6592b(this, 2));
            findViewById3.setOnClickListener(new C6593c(this, 3));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C4058x(this));
        ofFloat.addListener(new C4061a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new C4059y(this));
        ofFloat2.addListener(new C4062b());
        Resources resources = styledPlayerControlView.getResources();
        int i = C4037f.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i) - resources.getDimension(C4037f.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14531l = animatorSet;
        animatorSet.setDuration(250);
        animatorSet.addListener(new C4063c(styledPlayerControlView));
        animatorSet.play(ofFloat).with(m10922e(findViewById, BitmapDescriptorFactory.HUE_RED, dimension)).with(m10922e(viewGroup, BitmapDescriptorFactory.HUE_RED, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f14532m = animatorSet2;
        animatorSet2.setDuration(250);
        animatorSet2.addListener(new C4064d(styledPlayerControlView));
        animatorSet2.play(m10922e(findViewById, dimension, dimension2)).with(m10922e(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f14533n = animatorSet3;
        animatorSet3.setDuration(250);
        animatorSet3.addListener(new C4065e(styledPlayerControlView));
        animatorSet3.play(ofFloat).with(m10922e(findViewById, BitmapDescriptorFactory.HUE_RED, dimension2)).with(m10922e(viewGroup, BitmapDescriptorFactory.HUE_RED, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f14534o = animatorSet4;
        animatorSet4.setDuration(250);
        animatorSet4.addListener(new C4066f());
        animatorSet4.play(ofFloat2).with(m10922e(findViewById, dimension, BitmapDescriptorFactory.HUE_RED)).with(m10922e(viewGroup, dimension, BitmapDescriptorFactory.HUE_RED));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f14535p = animatorSet5;
        animatorSet5.setDuration(250);
        animatorSet5.addListener(new C4067g());
        animatorSet5.play(ofFloat2).with(m10922e(findViewById, dimension2, BitmapDescriptorFactory.HUE_RED)).with(m10922e(viewGroup, dimension2, BitmapDescriptorFactory.HUE_RED));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        this.f14536q = ofFloat3;
        ofFloat3.setDuration(250);
        ofFloat3.addUpdateListener(new C4055u(this));
        ofFloat3.addListener(new C4068h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
        this.f14537r = ofFloat4;
        ofFloat4.setDuration(250);
        ofFloat4.addUpdateListener(new C4056v(this, 0));
        ofFloat4.addListener(new C4069i());
    }

    /* renamed from: a */
    public static void m10920a(C4060z zVar, View view) {
        zVar.mo16677g();
        if (view.getId() == C4040i.exo_overflow_show) {
            zVar.f14536q.start();
        } else if (view.getId() == C4040i.exo_overflow_hide) {
            zVar.f14537r.start();
        }
    }

    /* renamed from: d */
    public static int m10921d(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* renamed from: e */
    public static ObjectAnimator m10922e(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, "translationY", new float[]{f, f2});
    }

    /* renamed from: j */
    public static boolean m10923j(View view) {
        int id = view.getId();
        if (id == C4040i.exo_bottom_bar || id == C4040i.exo_prev || id == C4040i.exo_next || id == C4040i.exo_rew || id == C4040i.exo_rew_with_amount || id == C4040i.exo_ffwd || id == C4040i.exo_ffwd_with_amount) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo16674b(float f) {
        ViewGroup viewGroup = this.f14527h;
        if (viewGroup != null) {
            this.f14527h.setTranslationX((float) ((int) ((1.0f - f) * ((float) viewGroup.getWidth()))));
        }
        ViewGroup viewGroup2 = this.f14528i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f14525f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    /* renamed from: c */
    public final boolean mo16675c(View view) {
        return view != null && this.f14544y.contains(view);
    }

    /* renamed from: f */
    public final void mo16676f() {
        this.f14520a.removeCallbacks(this.f14542w);
        this.f14520a.removeCallbacks(this.f14539t);
        this.f14520a.removeCallbacks(this.f14541v);
        this.f14520a.removeCallbacks(this.f14540u);
    }

    /* renamed from: g */
    public final void mo16677g() {
        if (this.f14545z != 3) {
            mo16676f();
            int showTimeoutMs = this.f14520a.getShowTimeoutMs();
            if (showTimeoutMs <= 0) {
                return;
            }
            if (!this.f14519C) {
                C0199g gVar = this.f14542w;
                long j = (long) showTimeoutMs;
                if (j >= 0) {
                    this.f14520a.postDelayed(gVar, j);
                }
            } else if (this.f14545z == 1) {
                this.f14520a.postDelayed(this.f14540u, 2000);
            } else {
                C7073m mVar = this.f14541v;
                long j2 = (long) showTimeoutMs;
                if (j2 >= 0) {
                    this.f14520a.postDelayed(mVar, j2);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo16678h(View view, boolean z) {
        if (view != null) {
            if (!z) {
                view.setVisibility(8);
                this.f14544y.remove(view);
                return;
            }
            if (!this.f14517A || !m10923j(view)) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
            this.f14544y.add(view);
        }
    }

    /* renamed from: i */
    public final void mo16679i(int i) {
        int i2 = this.f14545z;
        this.f14545z = i;
        if (i == 2) {
            this.f14520a.setVisibility(8);
        } else if (i2 == 2) {
            this.f14520a.setVisibility(0);
        }
        if (i2 != i) {
            StyledPlayerControlView styledPlayerControlView = this.f14520a;
            Iterator<StyledPlayerControlView.C4020l> it = styledPlayerControlView.f14324c.iterator();
            while (it.hasNext()) {
                styledPlayerControlView.getVisibility();
                it.next().mo16575a();
            }
        }
    }

    /* renamed from: k */
    public final void mo16680k() {
        if (!this.f14519C) {
            mo16679i(0);
            mo16677g();
            return;
        }
        int i = this.f14545z;
        if (i == 1) {
            this.f14534o.start();
        } else if (i == 2) {
            this.f14535p.start();
        } else if (i == 3) {
            this.f14518B = true;
        } else if (i == 4) {
            return;
        }
        mo16677g();
    }
}
