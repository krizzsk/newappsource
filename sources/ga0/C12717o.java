package ga0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C13924b;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.map.C16280h;
import j00.C17691i;
import n60.C18531b;
import p068e2.C4525b;
import p451du.C16709f;
import p622kz.C18159a;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19747y;

/* renamed from: ga0.o */
public abstract class C12717o<A extends MoovitActivity> extends C15676b<A> {

    /* renamed from: r */
    public static final /* synthetic */ int f31400r = 0;

    /* renamed from: h */
    public final C12718a f31401h;

    /* renamed from: i */
    public final C12719b f31402i;

    /* renamed from: j */
    public final Rect f31403j = new Rect();

    /* renamed from: k */
    public BottomSheetBehavior<?> f31404k;

    /* renamed from: l */
    public AppBarLayout f31405l;

    /* renamed from: m */
    public Toolbar f31406m;

    /* renamed from: n */
    public View f31407n;

    /* renamed from: o */
    public NestedScrollView f31408o;

    /* renamed from: p */
    public AnimatorSet f31409p;

    /* renamed from: q */
    public AnimatorSet f31410q;

    /* renamed from: ga0.o$a */
    public class C12718a implements NestedScrollView.C0781c {

        /* renamed from: a */
        public final /* synthetic */ C12717o f31411a;

        public C12718a(C16280h hVar) {
            this.f31411a = hVar;
        }

        /* renamed from: a */
        public final void mo940a(NestedScrollView nestedScrollView, int i) {
            boolean z;
            AppBarLayout appBarLayout = this.f31411a.f31405l;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            appBarLayout.mo40831f(z, true);
            int i2 = C19740r.view_tag_param1;
            Integer num = (Integer) nestedScrollView.getTag(i2);
            int i3 = C19740r.view_tag_param2;
            Integer num2 = (Integer) nestedScrollView.getTag(i3);
            if (this.f31411a.f31404k != null && num != null && num2 != null && num2.intValue() == i) {
                nestedScrollView.setTag(i2, (Object) null);
                nestedScrollView.setTag(i3, (Object) null);
                this.f31411a.f31404k.setState(num.intValue());
            }
        }
    }

    /* renamed from: ga0.o$b */
    public class C12719b extends BottomSheetBehavior.C13920c {

        /* renamed from: b */
        public float f31412b = -2.14748365E9f;

        /* renamed from: c */
        public final /* synthetic */ C12717o f31413c;

        public C12719b(C16280h hVar) {
            this.f31413c = hVar;
        }

        public final void onSlide(View view, float f) {
            boolean z;
            float f2 = this.f31412b;
            if (f2 != -2.14748365E9f) {
                if (f2 == 2.14748365E9f) {
                    this.f31412b = f;
                    return;
                }
                if (f2 < BitmapDescriptorFactory.HUE_RED || f <= f2) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C12717o.m32479T1(this.f31413c);
                } else {
                    C12717o.m32480U1(this.f31413c);
                }
            }
        }

        public final void onStateChanged(View view, int i) {
            this.f31412b = -2.14748365E9f;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            Dialog dialog = this.f31413c.getDialog();
                            if (dialog != null) {
                                dialog.cancel();
                                return;
                            }
                            return;
                        } else if (i != 6) {
                            return;
                        }
                    }
                    if (C12717o.m32478S1(this.f31413c)) {
                        C12717o.m32480U1(this.f31413c);
                    }
                } else if (C12717o.m32478S1(this.f31413c)) {
                    C12717o.m32479T1(this.f31413c);
                }
            } else if (C12717o.m32478S1(this.f31413c)) {
                this.f31412b = 2.14748365E9f;
            }
        }
    }

    public C12717o() {
        super(MoovitActivity.class);
        C16280h hVar = (C16280h) this;
        this.f31401h = new C12718a(hVar);
        this.f31402i = new C12719b(hVar);
        setStyle(0, C19747y.ThemeOverlay_Moovit_BottomSheetDialog_NoDim);
    }

    /* renamed from: S1 */
    public static boolean m32478S1(C12717o oVar) {
        if (oVar.f31408o.canScrollVertically(1) || oVar.f31408o.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    /* renamed from: T1 */
    public static void m32479T1(C12717o oVar) {
        oVar.mo39515X1();
        if (!oVar.f31409p.isRunning() && oVar.f31406m.getVisibility() != 0) {
            oVar.f31410q.cancel();
            oVar.f31409p.start();
        }
    }

    /* renamed from: U1 */
    public static void m32480U1(C12717o oVar) {
        oVar.mo39515X1();
        if (!oVar.f31410q.isRunning() && oVar.f31407n.getVisibility() != 0) {
            oVar.f31409p.cancel();
            oVar.f31410q.start();
        }
    }

    /* renamed from: V1 */
    public abstract void mo22565V1(View view, BottomSheetBehavior<?> bottomSheetBehavior);

    /* renamed from: W1 */
    public void mo39514W1(Toolbar toolbar, BottomSheetBehavior<?> bottomSheetBehavior) {
        int i;
        boolean z = bottomSheetBehavior.f34357H;
        if (z) {
            i = C19739q.ic_close_24_control_normal;
        } else {
            i = C19739q.ic_arrow_down_24_control_normal;
        }
        toolbar.setNavigationIcon(i);
        toolbar.setNavigationOnClickListener(new C12716n(this, z, bottomSheetBehavior));
    }

    /* renamed from: X1 */
    public final void mo39515X1() {
        if (this.f31409p == null) {
            AppBarLayout appBarLayout = this.f31405l;
            Toolbar toolbar = this.f31406m;
            View view = this.f31407n;
            int height = appBarLayout.getHeight();
            TypedArray obtainStyledAttributes = appBarLayout.getContext().obtainStyledAttributes(new int[]{C18159a.actionBarSize});
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                if (dimensionPixelSize == -1) {
                    dimensionPixelSize = height * 2;
                }
                ObjectAnimator ofInt = ObjectAnimator.ofInt(appBarLayout, C17691i.f45444b, new int[]{height, dimensionPixelSize});
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(toolbar, View.ALPHA, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new C4525b());
                animatorSet.playTogether(new Animator[]{ofInt, ofFloat2, ofFloat});
                animatorSet.addListener(new C12720p(toolbar, view));
                this.f31409p = animatorSet;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (this.f31410q == null) {
            AppBarLayout appBarLayout2 = this.f31405l;
            Toolbar toolbar2 = this.f31406m;
            View view2 = this.f31407n;
            int height2 = appBarLayout2.getHeight();
            TypedArray obtainStyledAttributes2 = appBarLayout2.getContext().obtainStyledAttributes(new int[]{C18159a.actionBarSize});
            try {
                int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(0, -1);
                if (dimensionPixelSize2 == -1) {
                    dimensionPixelSize2 = height2 * 2;
                }
                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(appBarLayout2, C17691i.f45444b, new int[]{dimensionPixelSize2, height2});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(toolbar2, View.ALPHA, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setInterpolator(new C4525b());
                animatorSet2.playTogether(new Animator[]{ofInt2, ofFloat3, ofFloat4});
                animatorSet2.addListener(new C12721q(view2, toolbar2));
                this.f31410q = animatorSet2;
            } finally {
                obtainStyledAttributes2.recycle();
            }
        }
    }

    /* renamed from: Y1 */
    public abstract View mo22566Y1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            this.f31404k = BottomSheetBehavior.m34710e((View) view.getParent());
            this.f31408o.setOnScrollChangeListener(this.f31401h);
            mo22565V1(view, this.f31404k);
            mo39514W1(this.f31406m, this.f31404k);
            this.f31404k.setHideable(true);
            BottomSheetBehavior<?> bottomSheetBehavior = this.f31404k;
            C12719b bVar = this.f31402i;
            bottomSheetBehavior.f34369T.clear();
            if (bVar != null) {
                bottomSheetBehavior.f34369T.add(bVar);
            }
            this.f31407n.getViewTreeObserver().addOnGlobalLayoutListener(new C16709f(this, 2));
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new C13924b(requireContext(), getTheme());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C19742t.tool_bar_bottom_sheet_dialog, viewGroup, false);
        viewGroup2.setOnClickListener(new C18531b(this, 7));
        viewGroup2.setSoundEffectsEnabled(false);
        AppBarLayout appBarLayout = (AppBarLayout) viewGroup2.findViewById(C19740r.app_bar);
        this.f31405l = appBarLayout;
        appBarLayout.f34136j = true;
        if (!appBarLayout.f34137k) {
            appBarLayout.f34137k = true;
            appBarLayout.refreshDrawableState();
        }
        this.f31406m = (Toolbar) this.f31405l.findViewById(C19740r.tool_bar);
        this.f31407n = this.f31405l.findViewById(C19740r.handle);
        NestedScrollView nestedScrollView = (NestedScrollView) viewGroup2.findViewById(C19740r.content);
        this.f31408o = nestedScrollView;
        this.f31408o.addView(mo22566Y1(layoutInflater, nestedScrollView));
        return viewGroup2;
    }
}
