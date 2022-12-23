package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p127j.C5344a;
import p141k1.C5450a;
import p229r1.C6232b;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6379o;
import p242s1.C6382p0;
import p242s1.C6391t;
import p242s1.C6396v0;
import p255t1.C6531g;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13406g;
import p355ac.C13410k;
import p355ac.C13411l;
import p380bc.C13577a;
import p811tc.C19648g;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C0749b {

    /* renamed from: u */
    public static final int f34127u = C13410k.Widget_Design_AppBarLayout;

    /* renamed from: b */
    public int f34128b;

    /* renamed from: c */
    public int f34129c;

    /* renamed from: d */
    public int f34130d;

    /* renamed from: e */
    public int f34131e;

    /* renamed from: f */
    public boolean f34132f;

    /* renamed from: g */
    public int f34133g;

    /* renamed from: h */
    public C6396v0 f34134h;

    /* renamed from: i */
    public ArrayList f34135i;

    /* renamed from: j */
    public boolean f34136j;

    /* renamed from: k */
    public boolean f34137k;

    /* renamed from: l */
    public boolean f34138l;

    /* renamed from: m */
    public boolean f34139m;

    /* renamed from: n */
    public int f34140n;

    /* renamed from: o */
    public WeakReference<View> f34141o;

    /* renamed from: p */
    public ValueAnimator f34142p;

    /* renamed from: q */
    public final ArrayList f34143q;

    /* renamed from: r */
    public int[] f34144r;

    /* renamed from: s */
    public Drawable f34145s;

    /* renamed from: t */
    public Behavior f34146t;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: j */
        public int f34147j;

        /* renamed from: k */
        public int f34148k;

        /* renamed from: l */
        public ValueAnimator f34149l;

        /* renamed from: m */
        public SavedState f34150m;

        /* renamed from: n */
        public WeakReference<View> f34151n;

        /* renamed from: o */
        public boolean f34152o;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public class C13876a extends C6315a {
            public C13876a() {
            }

            public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
                super.onInitializeAccessibilityNodeInfo(view, gVar);
                gVar.mo22648m(BaseBehavior.this.f34152o);
                gVar.mo22644i(ScrollView.class.getName());
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: k */
        public static View m34603k(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C6379o) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m34604p(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000a:
                r4 = 0
                if (r3 >= r1) goto L_0x0021
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L_0x001e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L_0x001e
                goto L_0x0022
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0021:
                r5 = r4
            L_0x0022:
                r0 = 1
                if (r5 == 0) goto L_0x005e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
                int r1 = r1.f34159a
                r3 = r1 & 1
                if (r3 == 0) goto L_0x005e
                java.util.WeakHashMap<android.view.View, s1.p0> r3 = p242s1.C6333d0.f19990a
                int r3 = p242s1.C6333d0.C6337d.m15044d(r5)
                if (r10 <= 0) goto L_0x004b
                r10 = r1 & 12
                if (r10 == 0) goto L_0x004b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005e
                goto L_0x005c
            L_0x004b:
                r10 = r1 & 2
                if (r10 == 0) goto L_0x005e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005e
            L_0x005c:
                r9 = 1
                goto L_0x005f
            L_0x005e:
                r9 = 0
            L_0x005f:
                boolean r10 = r8.f34139m
                if (r10 == 0) goto L_0x006b
                android.view.View r9 = m34603k(r7)
                boolean r9 = r8.mo40832g(r9)
            L_0x006b:
                boolean r10 = r8.f34136j
                r10 = r10 ^ r0
                boolean r9 = r8.mo40831f(r9, r10)
                if (r11 != 0) goto L_0x00b6
                if (r9 == 0) goto L_0x00b9
                c1.a r9 = r7.f3247c
                java.lang.Object r9 = r9.f6159c
                s0.h r9 = (p241s0.C6313h) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r10 = r7.f3249e
                r10.clear()
                if (r9 == 0) goto L_0x008e
                java.util.ArrayList r10 = r7.f3249e
                r10.addAll(r9)
            L_0x008e:
                java.util.ArrayList r7 = r7.f3249e
                int r9 = r7.size()
                r10 = 0
            L_0x0095:
                if (r10 >= r9) goto L_0x00b4
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$e r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0752e) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r11 = r11.f3269a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L_0x00b1
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f34212f
                if (r7 == 0) goto L_0x00b4
                r2 = 1
                goto L_0x00b4
            L_0x00b1:
                int r10 = r10 + 1
                goto L_0x0095
            L_0x00b4:
                if (r2 == 0) goto L_0x00b9
            L_0x00b6:
                r8.jumpDrawablesToCurrentState()
            L_0x00b9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m34604p(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: c */
        public final boolean mo40864c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f34151n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final int mo40865d(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        /* renamed from: e */
        public final int mo40866e(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* renamed from: f */
        public final int mo40867f() {
            return mo40972a() + this.f34147j;
        }

        /* renamed from: g */
        public final void mo40868g(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            mo40873n(coordinatorLayout, appBarLayout);
            if (appBarLayout.f34139m) {
                appBarLayout.mo40831f(appBarLayout.mo40832g(m34603k(coordinatorLayout)), !appBarLayout.f34136j);
            }
        }

        /* renamed from: h */
        public final int mo40869h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            boolean z;
            int i5;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            int i6 = i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int f = mo40867f();
            int i7 = 0;
            if (i6 == 0 || f < i6 || f > i3) {
                this.f34147j = 0;
            } else {
                int z2 = C21100e.m49377z(i, i2, i3);
                if (f != z2) {
                    if (appBarLayout.f34132f) {
                        int abs = Math.abs(z2);
                        int childCount = appBarLayout.getChildCount();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i8);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.f34161c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i8++;
                            } else if (interpolator != null) {
                                int i9 = layoutParams.f34159a;
                                if ((i9 & 1) != 0) {
                                    i5 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
                                    if ((i9 & 2) != 0) {
                                        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                                        i5 -= C6333d0.C6337d.m15044d(childAt);
                                    }
                                } else {
                                    i5 = 0;
                                }
                                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                                if (C6333d0.C6337d.m15042b(childAt)) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f2 = (float) i5;
                                    int round = Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f2) * f2);
                                    i4 = (childAt.getTop() + round) * Integer.signum(z2);
                                }
                            }
                        }
                    }
                    i4 = z2;
                    C13894i iVar = this.f34220a;
                    if (iVar != null) {
                        z = iVar.mo40977b(i4);
                    } else {
                        this.f34221b = i4;
                        z = false;
                    }
                    int i11 = f - z2;
                    this.f34147j = z2 - i4;
                    int i12 = 1;
                    if (z) {
                        for (int i13 = 0; i13 < appBarLayout.getChildCount(); i13++) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i13).getLayoutParams();
                            C13879c cVar = layoutParams2.f34160b;
                            if (!(cVar == null || (layoutParams2.f34159a & 1) == 0)) {
                                View childAt2 = appBarLayout.getChildAt(i13);
                                C13880d dVar = (C13880d) cVar;
                                Rect rect = dVar.f34163a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = ((float) dVar.f34163a.top) - Math.abs((float) mo40972a());
                                float f3 = BitmapDescriptorFactory.HUE_RED;
                                if (abs2 <= BitmapDescriptorFactory.HUE_RED) {
                                    float abs3 = Math.abs(abs2 / ((float) dVar.f34163a.height()));
                                    if (abs3 >= BitmapDescriptorFactory.HUE_RED) {
                                        if (abs3 > 1.0f) {
                                            f3 = 1.0f;
                                        } else {
                                            f3 = abs3;
                                        }
                                    }
                                    float f4 = 1.0f - f3;
                                    float height = (-abs2) - ((((float) dVar.f34163a.height()) * 0.3f) * (1.0f - (f4 * f4)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(dVar.f34164b);
                                    dVar.f34164b.offset(0, (int) (-height));
                                    Rect rect2 = dVar.f34164b;
                                    WeakHashMap<View, C6382p0> weakHashMap3 = C6333d0.f19990a;
                                    C6333d0.C6339f.m15073c(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, C6382p0> weakHashMap4 = C6333d0.f19990a;
                                    C6333d0.C6339f.m15073c(childAt2, (Rect) null);
                                    childAt2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                                }
                            }
                        }
                    }
                    if (!z && appBarLayout.f34132f) {
                        coordinatorLayout2.mo3268g(appBarLayout);
                    }
                    appBarLayout.mo40827d(mo40972a());
                    if (z2 < f) {
                        i12 = -1;
                    }
                    m34604p(coordinatorLayout2, appBarLayout, z2, i12, false);
                    i7 = i11;
                }
            }
            mo40874o(coordinatorLayout2, appBarLayout);
            return i7;
        }

        /* renamed from: j */
        public final void mo40870j(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int i2;
            int abs = Math.abs(mo40867f() - i);
            float abs2 = Math.abs(BitmapDescriptorFactory.HUE_RED);
            if (abs2 > BitmapDescriptorFactory.HUE_RED) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int f = mo40867f();
            if (f == i) {
                ValueAnimator valueAnimator = this.f34149l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f34149l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f34149l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f34149l = valueAnimator3;
                valueAnimator3.setInterpolator(C13577a.f33541e);
                this.f34149l.addUpdateListener(new C13887b(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f34149l.setDuration((long) Math.min(i2, 600));
            this.f34149l.setIntValues(new int[]{f, i});
            this.f34149l.start();
        }

        /* renamed from: l */
        public final void mo40871l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.getTotalScrollRange();
                    i3 = i4;
                    i2 = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    i2 = 0;
                }
                if (i3 != i2) {
                    iArr[1] = mo40869h(coordinatorLayout, appBarLayout, mo40867f() - i, i3, i2);
                }
            }
            if (appBarLayout.f34139m) {
                appBarLayout.mo40831f(appBarLayout.mo40832g(view), !appBarLayout.f34136j);
            }
        }

        /* renamed from: m */
        public final SavedState mo40872m(Parcelable parcelable, T t) {
            boolean z;
            boolean z2;
            int a = mo40972a();
            int childCount = t.getChildCount();
            boolean z3 = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + a;
                if (childAt.getTop() + a > 0 || bottom < 0) {
                    i++;
                } else {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (a == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    savedState.f34154c = z;
                    if (z || (-a) < t.getTotalScrollRange()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    savedState.f34153b = z2;
                    savedState.f34155d = i;
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    if (bottom == t.getTopInset() + C6333d0.C6337d.m15044d(childAt)) {
                        z3 = true;
                    }
                    savedState.f34157f = z3;
                    savedState.f34156e = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return null;
        }

        /* renamed from: n */
        public final void mo40873n(CoordinatorLayout coordinatorLayout, T t) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int f = mo40867f() - paddingTop;
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                z = true;
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.f34159a & 32) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i2 = -f;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i3 = layoutParams2.f34159a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                        if (C6333d0.C6337d.m15042b(t) && C6333d0.C6337d.m15042b(childAt2)) {
                            i4 -= t.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                        i5 += C6333d0.C6337d.m15044d(childAt2);
                    } else {
                        if ((i3 & 5) == 5) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            WeakHashMap<View, C6382p0> weakHashMap3 = C6333d0.f19990a;
                            int d = C6333d0.C6337d.m15044d(childAt2) + i5;
                            if (f < d) {
                                i4 = d;
                            } else {
                                i5 = d;
                            }
                        }
                    }
                    if ((i3 & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i4 += layoutParams2.topMargin;
                        i5 -= layoutParams2.bottomMargin;
                    }
                    if (f < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    mo40870j(coordinatorLayout, t, C21100e.m49377z(i4 + paddingTop, -t.getTotalScrollRange(), 0));
                }
            }
        }

        /* renamed from: o */
        public final void mo40874o(CoordinatorLayout coordinatorLayout, T t) {
            View view;
            boolean z;
            boolean z2;
            boolean z3;
            C6333d0.m15026n(C6531g.C6532a.f20340h.mo22651a(), coordinatorLayout);
            boolean z4 = false;
            C6333d0.m15021i(0, coordinatorLayout);
            C6333d0.m15026n(C6531g.C6532a.f20341i.mo22651a(), coordinatorLayout);
            C6333d0.m15021i(0, coordinatorLayout);
            if (t.getTotalScrollRange() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                int i = 0;
                while (true) {
                    view = null;
                    if (i >= childCount) {
                        break;
                    }
                    view = coordinatorLayout.getChildAt(i);
                    if (((CoordinatorLayout.C0752e) view.getLayoutParams()).f3269a instanceof ScrollingViewBehavior) {
                        break;
                    }
                    i++;
                }
                View view2 = view;
                if (view2 != null) {
                    int childCount2 = t.getChildCount();
                    int i2 = 0;
                    while (true) {
                        z = true;
                        if (i2 >= childCount2) {
                            z2 = false;
                            break;
                        } else if (((LayoutParams) t.getChildAt(i2).getLayoutParams()).f34159a != 0) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (z2) {
                        if (C6333d0.m15017e(coordinatorLayout) != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            C6333d0.m15029q(coordinatorLayout, new C13876a());
                        }
                        if (mo40867f() != (-t.getTotalScrollRange())) {
                            C6333d0.m15027o(coordinatorLayout, C6531g.C6532a.f20340h, new C13889d(t, false));
                            z4 = true;
                        }
                        if (mo40867f() != 0) {
                            if (view2.canScrollVertically(-1)) {
                                int i3 = -t.getDownNestedPreScrollRange();
                                if (i3 != 0) {
                                    C6333d0.m15027o(coordinatorLayout, C6531g.C6532a.f20341i, new C13888c(this, coordinatorLayout, t, view2, i3));
                                }
                            } else {
                                C6333d0.m15027o(coordinatorLayout, C6531g.C6532a.f20341i, new C13889d(t, true));
                            }
                            this.f34152o = z;
                        }
                        z = z4;
                        this.f34152o = z;
                    }
                }
            }
        }

        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            boolean z;
            int i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f34150m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    if ((pendingAction & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((pendingAction & 2) != 0) {
                        int i3 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            mo40870j(coordinatorLayout, appBarLayout, i3);
                        } else {
                            mo40959i(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            mo40870j(coordinatorLayout, appBarLayout, 0);
                        } else {
                            mo40959i(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f34153b) {
                mo40959i(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f34154c) {
                mo40959i(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f34155d);
                int i4 = -childAt.getBottom();
                if (this.f34150m.f34157f) {
                    i2 = appBarLayout.getTopInset() + C6333d0.C6337d.m15044d(childAt) + i4;
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f34150m.f34156e) + i4;
                }
                mo40959i(coordinatorLayout, appBarLayout, i2);
            }
            appBarLayout.f34133g = 0;
            this.f34150m = null;
            int z2 = C21100e.m49377z(mo40972a(), -appBarLayout.getTotalScrollRange(), 0);
            C13894i iVar = this.f34220a;
            if (iVar != null) {
                iVar.mo40977b(z2);
            } else {
                this.f34221b = z2;
            }
            m34604p(coordinatorLayout, appBarLayout, mo40972a(), 0, true);
            appBarLayout.mo40827d(mo40972a());
            mo40874o(coordinatorLayout, appBarLayout);
            return true;
        }

        public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.C0752e) appBarLayout.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.mo3310x(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            mo40871l(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                AppBarLayout appBarLayout2 = appBarLayout;
                iArr[1] = mo40869h(coordinatorLayout2, appBarLayout2, mo40867f() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                mo40874o(coordinatorLayout, appBarLayout);
            }
        }

        public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                SavedState savedState2 = this.f34150m;
                this.f34150m = savedState;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, savedState.getSuperState());
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
            this.f34150m = null;
        }

        public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            SavedState m = mo40872m(onSaveInstanceState, appBarLayout);
            if (m == null) {
                return onSaveInstanceState;
            }
            return m;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (r2 != false) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 0
                r0 = 1
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.f34139m
                if (r5 != 0) goto L_0x002b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = 1
                goto L_0x0015
            L_0x0014:
                r5 = 0
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = 1
                goto L_0x0029
            L_0x0028:
                r2 = 0
            L_0x0029:
                if (r2 == 0) goto L_0x002c
            L_0x002b:
                r6 = 1
            L_0x002c:
                if (r6 == 0) goto L_0x0035
                android.animation.ValueAnimator r2 = r1.f34149l
                if (r2 == 0) goto L_0x0035
                r2.cancel()
            L_0x0035:
                r2 = 0
                r1.f34151n = r2
                r1.f34148k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f34148k == 0 || i == 1) {
                mo40873n(coordinatorLayout, appBarLayout);
                if (appBarLayout.f34139m) {
                    appBarLayout.mo40831f(appBarLayout.mo40832g(view2), !appBarLayout.f34136j);
                }
            }
            this.f34151n = new WeakReference<>(view2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C13875a();

            /* renamed from: b */
            public boolean f34153b;

            /* renamed from: c */
            public boolean f34154c;

            /* renamed from: d */
            public int f34155d;

            /* renamed from: e */
            public float f34156e;

            /* renamed from: f */
            public boolean f34157f;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            public class C13875a implements Parcelable.ClassLoaderCreator<SavedState> {
                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                public final Object[] newArray(int i) {
                    return new SavedState[i];
                }

                public final Object createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, (ClassLoader) null);
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.f34153b = parcel.readByte() != 0;
                this.f34154c = parcel.readByte() != 0;
                this.f34155d = parcel.readInt();
                this.f34156e = parcel.readFloat();
                this.f34157f = parcel.readByte() == 0 ? false : z;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f34153b ? (byte) 1 : 0);
                parcel.writeByte(this.f34154c ? (byte) 1 : 0);
                parcel.writeInt(this.f34155d);
                parcel.writeFloat(this.f34156e);
                parcel.writeByte(this.f34157f ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* renamed from: c */
        public final AppBarLayout mo40878c(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final float mo40879d(View view) {
            int i;
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C0752e) appBarLayout.getLayoutParams()).f3269a;
                if (behavior instanceof BaseBehavior) {
                    i = ((BaseBehavior) behavior).mo40867f();
                } else {
                    i = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) i) / ((float) i2)) + 1.0f;
                }
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        /* renamed from: e */
        public final int mo40880e(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }

        public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i;
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C0752e) view2.getLayoutParams()).f3269a;
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f34147j + this.f34211e;
                if (this.f34212f == 0) {
                    i = 0;
                } else {
                    float d = mo40879d(view2);
                    int i2 = this.f34212f;
                    i = C21100e.m49377z((int) (d * ((float) i2)), 0, i2);
                }
                C6333d0.m15023k(bottom - i, view);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f34139m) {
                    appBarLayout.mo40831f(appBarLayout.mo40832g(view), !appBarLayout.f34136j);
                }
            }
            return false;
        }

        public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C6333d0.m15026n(C6531g.C6532a.f20340h.mo22651a(), coordinatorLayout);
                C6333d0.m15021i(0, coordinatorLayout);
                C6333d0.m15026n(C6531g.C6532a.f20341i.mo22651a(), coordinatorLayout);
                C6333d0.m15021i(0, coordinatorLayout);
                C6333d0.m15029q(coordinatorLayout, (C6315a) null);
            }
        }

        public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList q = coordinatorLayout.mo3296q(view);
            int size = q.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) q.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f34209c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayout.mo40830e(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.ScrollingViewBehavior_Layout);
            this.f34212f = obtainStyledAttributes.getDimensionPixelSize(C13411l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public class C13877a implements C6391t {
        public C13877a() {
        }

        public final C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
            C6396v0 v0Var2;
            boolean z;
            AppBarLayout appBarLayout = AppBarLayout.this;
            appBarLayout.getClass();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6337d.m15042b(appBarLayout)) {
                v0Var2 = v0Var;
            } else {
                v0Var2 = null;
            }
            if (!C6232b.m14816a(appBarLayout.f34134h, v0Var2)) {
                appBarLayout.f34134h = v0Var2;
                if (appBarLayout.f34145s == null || appBarLayout.getTopInset() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                appBarLayout.setWillNotDraw(!z);
                appBarLayout.requestLayout();
            }
            return v0Var;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public interface C13878b<T extends AppBarLayout> {
        /* renamed from: a */
        void mo40881a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static abstract class C13879c {
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C13880d extends C13879c {

        /* renamed from: a */
        public final Rect f34163a = new Rect();

        /* renamed from: b */
        public final Rect f34164b = new Rect();
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public interface C13881e {
        /* renamed from: a */
        void mo40882a();
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$f */
    public interface C13882f extends C13878b<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.appBarLayoutStyle);
    }

    /* renamed from: b */
    public static LayoutParams m34595b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo40824a(C13882f fVar) {
        if (this.f34135i == null) {
            this.f34135i = new ArrayList();
        }
        if (fVar != null && !this.f34135i.contains(fVar)) {
            this.f34135i.add(fVar);
        }
    }

    /* renamed from: c */
    public final void mo40825c() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.f34146t;
        if (behavior == null || this.f34129c == -1 || this.f34133g != 0) {
            savedState = null;
        } else {
            savedState = behavior.mo40872m(AbsSavedState.EMPTY_STATE, this);
        }
        this.f34129c = -1;
        this.f34130d = -1;
        this.f34131e = -1;
        if (savedState != null) {
            Behavior behavior2 = this.f34146t;
            if (behavior2.f34150m == null) {
                behavior2.f34150m = savedState;
            }
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void mo40827d(int i) {
        this.f34128b = i;
        if (!willNotDraw()) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
        ArrayList arrayList = this.f34135i;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13878b bVar = (C13878b) this.f34135i.get(i2);
                if (bVar != null) {
                    bVar.mo40881a(this, i);
                }
            }
        }
    }

    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        if (this.f34145s == null || getTopInset() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int save = canvas.save();
            canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) (-this.f34128b));
            this.f34145s.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f34145s;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public final void mo40830e(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f34133g = i4 | i3;
        requestLayout();
    }

    /* renamed from: f */
    public final boolean mo40831f(boolean z, boolean z2) {
        float f;
        if (!z2 || this.f34138l == z) {
            return false;
        }
        this.f34138l = z;
        refreshDrawableState();
        if (this.f34139m && (getBackground() instanceof C19648g)) {
            C19648g gVar = (C19648g) getBackground();
            float dimension = getResources().getDimension(C13403d.design_appbar_elevation);
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = dimension;
            }
            if (!z) {
                dimension = BitmapDescriptorFactory.HUE_RED;
            }
            ValueAnimator valueAnimator = this.f34142p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
            this.f34142p = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(C13406g.app_bar_elevation_anim_duration));
            this.f34142p.setInterpolator(C13577a.f33537a);
            this.f34142p.addUpdateListener(new C13886a(this, gVar));
            this.f34142p.start();
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo40832g(View view) {
        int i;
        View view2;
        View view3 = null;
        if (this.f34141o == null && (i = this.f34140n) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f34140n);
            }
            if (view2 != null) {
                this.f34141o = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f34141o;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f34146t = behavior;
        return behavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f34130d
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = 0
        L_0x000e:
            if (r0 < 0) goto L_0x0060
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f34159a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x005a
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x0036
            java.util.WeakHashMap<android.view.View, s1.p0> r4 = p242s1.C6333d0.f19990a
            int r4 = p242s1.C6333d0.C6337d.m15044d(r3)
        L_0x0034:
            int r4 = r4 + r7
            goto L_0x0045
        L_0x0036:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x0043
            java.util.WeakHashMap<android.view.View, s1.p0> r4 = p242s1.C6333d0.f19990a
            int r4 = p242s1.C6333d0.C6337d.m15044d(r3)
            int r4 = r5 - r4
            goto L_0x0034
        L_0x0043:
            int r4 = r7 + r5
        L_0x0045:
            if (r0 != 0) goto L_0x0058
            java.util.WeakHashMap<android.view.View, s1.p0> r6 = p242s1.C6333d0.f19990a
            boolean r3 = p242s1.C6333d0.C6337d.m15042b(r3)
            if (r3 == 0) goto L_0x0058
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L_0x0058:
            int r2 = r2 + r4
            goto L_0x005d
        L_0x005a:
            if (r2 <= 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0060:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f34130d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.f34131e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = layoutParams.topMargin + layoutParams.bottomMargin + childAt.getMeasuredHeight();
            int i4 = layoutParams.f34159a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                i3 -= C6333d0.C6337d.m15044d(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f34131e = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f34140n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int d = C6333d0.C6337d.m15044d(this);
        if (d == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d = C6333d0.C6337d.m15044d(getChildAt(childCount - 1));
            } else {
                d = 0;
            }
            if (d == 0) {
                return getHeight() / 3;
            }
        }
        return (d * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f34133g;
    }

    public Drawable getStatusBarForeground() {
        return this.f34145s;
    }

    @Deprecated
    public float getTargetElevation() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final int getTopInset() {
        C6396v0 v0Var = this.f34134h;
        if (v0Var != null) {
            return v0Var.mo22506e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f34129c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f34159a;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin + i3;
            if (i2 == 0) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6337d.m15042b(childAt)) {
                    i5 -= getTopInset();
                }
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                i3 -= C6333d0.C6337d.m15044d(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f34129c = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    public final boolean mo40846h() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (!C6333d0.C6337d.m15042b(childAt)) {
            return true;
        }
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21100e.m49297A0(this);
    }

    public final int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f34144r == null) {
            this.f34144r = new int[4];
        }
        int[] iArr = this.f34144r;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f34137k;
        int i4 = C13401b.state_liftable;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (!z || !this.f34138l) {
            i2 = -C13401b.state_lifted;
        } else {
            i2 = C13401b.state_lifted;
        }
        iArr[1] = i2;
        int i5 = C13401b.state_collapsible;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (!z || !this.f34138l) {
            i3 = -C13401b.state_collapsed;
        } else {
            i3 = C13401b.state_collapsed;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f34141o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f34141o = null;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        boolean z4 = true;
        if (C6333d0.C6337d.m15042b(this) && mo40846h()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C6333d0.m15023k(topInset, getChildAt(childCount));
            }
        }
        mo40825c();
        this.f34132f = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).f34161c != null) {
                this.f34132f = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f34145s;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f34136j) {
            if (!this.f34139m) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount3) {
                        z2 = false;
                        break;
                    }
                    int i7 = ((LayoutParams) getChildAt(i6).getLayoutParams()).f34159a;
                    if ((i7 & 1) != 1 || (i7 & 10) == 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        z2 = true;
                        break;
                    }
                    i6++;
                }
                if (!z2) {
                    z4 = false;
                }
            }
            if (this.f34137k != z4) {
                this.f34137k = z4;
                refreshDrawableState();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6337d.m15042b(this) && mo40846h()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C21100e.m49377z(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        mo40825c();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C21100e.m49378z0(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        mo40830e(z, C6333d0.C6340g.m15076c(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f34139m = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f34140n = i;
        WeakReference<View> weakReference = this.f34141o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f34141o = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f34136j = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f34145s;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f34145s = drawable3;
            boolean z2 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f34145s.setState(getDrawableState());
                }
                Drawable drawable4 = this.f34145s;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C5450a.m13600c(drawable4, C6333d0.C6338e.m15063d(this));
                Drawable drawable5 = this.f34145s;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.f34145s.setCallback(this);
            }
            if (this.f34145s != null && getTopInset() > 0) {
                z2 = true;
            }
            setWillNotDraw(!z2);
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C5344a.m13397a(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C13895j.m34670a(this, f);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f34145s;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f34145s;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r6 = f34127u
            android.content.Context r12 = p883wc.C20289a.m47861a(r12, r13, r14, r6)
            r11.<init>(r12, r13, r14)
            r12 = -1
            r11.f34129c = r12
            r11.f34130d = r12
            r11.f34131e = r12
            r7 = 0
            r11.f34133g = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f34143q = r0
            android.content.Context r8 = r11.getContext()
            r0 = 1
            r11.setOrientation(r0)
            int r9 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r11.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x0031
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r11.setOutlineProvider(r0)
        L_0x0031:
            android.content.Context r10 = r11.getContext()
            int[] r2 = com.google.android.material.appbar.C13895j.f34239a
            int[] r5 = new int[r7]
            r0 = r10
            r1 = r13
            r3 = r14
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0.hasValue(r7)     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0052
            int r1 = r0.getResourceId(r7, r7)     // Catch:{ all -> 0x00f6 }
            android.animation.StateListAnimator r1 = android.animation.AnimatorInflater.loadStateListAnimator(r10, r1)     // Catch:{ all -> 0x00f6 }
            r11.setStateListAnimator(r1)     // Catch:{ all -> 0x00f6 }
        L_0x0052:
            r0.recycle()
            int[] r2 = p355ac.C13411l.AppBarLayout
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r13
            r3 = r14
            r4 = r6
            android.content.res.TypedArray r13 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r14 = p355ac.C13411l.AppBarLayout_android_background
            android.graphics.drawable.Drawable r14 = r13.getDrawable(r14)
            java.util.WeakHashMap<android.view.View, s1.p0> r0 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15057q(r11, r14)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x0090
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            tc.g r0 = new tc.g
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.mo52005n(r14)
            r0.mo52001k(r8)
            p242s1.C6333d0.C6337d.m15057q(r11, r0)
        L_0x0090:
            int r14 = p355ac.C13411l.AppBarLayout_expanded
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x009f
            boolean r14 = r13.getBoolean(r14, r7)
            r11.mo40830e(r14, r7, r7)
        L_0x009f:
            int r14 = p355ac.C13411l.AppBarLayout_elevation
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x00af
            int r14 = r13.getDimensionPixelSize(r14, r7)
            float r14 = (float) r14
            com.google.android.material.appbar.C13895j.m34670a(r11, r14)
        L_0x00af:
            r14 = 26
            if (r9 < r14) goto L_0x00d1
            int r14 = p355ac.C13411l.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x00c2
            boolean r14 = r13.getBoolean(r14, r7)
            r11.setKeyboardNavigationCluster(r14)
        L_0x00c2:
            int r14 = p355ac.C13411l.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x00d1
            boolean r14 = r13.getBoolean(r14, r7)
            r11.setTouchscreenBlocksFocus(r14)
        L_0x00d1:
            int r14 = p355ac.C13411l.AppBarLayout_liftOnScroll
            boolean r14 = r13.getBoolean(r14, r7)
            r11.f34139m = r14
            int r14 = p355ac.C13411l.AppBarLayout_liftOnScrollTargetViewId
            int r12 = r13.getResourceId(r14, r12)
            r11.f34140n = r12
            int r12 = p355ac.C13411l.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r12 = r13.getDrawable(r12)
            r11.setStatusBarForeground(r12)
            r13.recycle()
            com.google.android.material.appbar.AppBarLayout$a r12 = new com.google.android.material.appbar.AppBarLayout$a
            r12.<init>()
            p242s1.C6333d0.C6342i.m15104u(r11, r12)
            return
        L_0x00f6:
            r12 = move-exception
            r0.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m65752generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m65753generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f34159a = 1;

        /* renamed from: b */
        public C13879c f34160b;

        /* renamed from: c */
        public Interpolator f34161c;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C13880d dVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.AppBarLayout_Layout);
            this.f34159a = obtainStyledAttributes.getInt(C13411l.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.getInt(C13411l.AppBarLayout_Layout_layout_scrollEffect, 0) != 1) {
                dVar = null;
            } else {
                dVar = new C13880d();
            }
            this.f34160b = dVar;
            int i = C13411l.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f34161c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
