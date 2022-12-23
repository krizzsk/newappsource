package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.C14083r;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p306x1.C7148c;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13409j;
import p355ac.C13410k;
import p355ac.C13411l;
import p457ec.C16801a;
import p457ec.C16802b;
import p457ec.C16803c;
import p742qc.C19099c;
import p811tc.C19648g;
import p811tc.C19654k;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: b0 */
    public static final int f34349b0 = C13410k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    public int f34350A;

    /* renamed from: B */
    public int f34351B;

    /* renamed from: C */
    public int f34352C;

    /* renamed from: D */
    public float f34353D = 0.5f;

    /* renamed from: E */
    public int f34354E;

    /* renamed from: F */
    public float f34355F = -1.0f;

    /* renamed from: G */
    public boolean f34356G;

    /* renamed from: H */
    public boolean f34357H;

    /* renamed from: I */
    public boolean f34358I = true;

    /* renamed from: J */
    public int f34359J = 4;

    /* renamed from: K */
    public C7148c f34360K;

    /* renamed from: L */
    public boolean f34361L;

    /* renamed from: M */
    public int f34362M;

    /* renamed from: N */
    public boolean f34363N;

    /* renamed from: O */
    public int f34364O;

    /* renamed from: P */
    public int f34365P;

    /* renamed from: Q */
    public int f34366Q;

    /* renamed from: R */
    public WeakReference<V> f34367R;

    /* renamed from: S */
    public WeakReference<View> f34368S;

    /* renamed from: T */
    public final ArrayList<C13920c> f34369T = new ArrayList<>();

    /* renamed from: U */
    public VelocityTracker f34370U;

    /* renamed from: V */
    public int f34371V;

    /* renamed from: W */
    public int f34372W;

    /* renamed from: X */
    public boolean f34373X;

    /* renamed from: Y */
    public HashMap f34374Y;

    /* renamed from: Z */
    public int f34375Z = -1;

    /* renamed from: a */
    public int f34376a = 0;

    /* renamed from: a0 */
    public final C13919b f34377a0 = new C13919b();

    /* renamed from: b */
    public boolean f34378b = true;

    /* renamed from: c */
    public float f34379c;

    /* renamed from: d */
    public int f34380d;

    /* renamed from: e */
    public boolean f34381e;

    /* renamed from: f */
    public int f34382f;

    /* renamed from: g */
    public int f34383g;

    /* renamed from: h */
    public C19648g f34384h;

    /* renamed from: i */
    public ColorStateList f34385i;

    /* renamed from: j */
    public int f34386j = -1;

    /* renamed from: k */
    public int f34387k = -1;

    /* renamed from: l */
    public int f34388l;

    /* renamed from: m */
    public boolean f34389m;

    /* renamed from: n */
    public boolean f34390n;

    /* renamed from: o */
    public boolean f34391o;

    /* renamed from: p */
    public boolean f34392p;

    /* renamed from: q */
    public boolean f34393q;

    /* renamed from: r */
    public boolean f34394r;

    /* renamed from: s */
    public boolean f34395s;

    /* renamed from: t */
    public boolean f34396t;

    /* renamed from: u */
    public int f34397u;

    /* renamed from: v */
    public int f34398v;

    /* renamed from: w */
    public C19654k f34399w;

    /* renamed from: x */
    public boolean f34400x;

    /* renamed from: y */
    public final BottomSheetBehavior<V>.C16530d f34401y = new C13921d();

    /* renamed from: z */
    public ValueAnimator f34402z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class C13918a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f34408b;

        /* renamed from: c */
        public final /* synthetic */ int f34409c;

        public C13918a(View view, int i) {
            this.f34408b = view;
            this.f34409c = i;
        }

        public final void run() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            View view = this.f34408b;
            int i = this.f34409c;
            int i2 = BottomSheetBehavior.f34349b0;
            bottomSheetBehavior.mo41059j(view, i, false);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C13919b extends C7148c.C7151c {
        public C13919b() {
        }

        /* renamed from: a */
        public final int mo3593a(View view, int i) {
            return view.getLeft();
        }

        /* renamed from: b */
        public final int mo3594b(View view, int i) {
            int i2;
            int g = BottomSheetBehavior.this.mo41056g();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f34356G) {
                i2 = bottomSheetBehavior.f34366Q;
            } else {
                i2 = bottomSheetBehavior.f34354E;
            }
            return C21100e.m49377z(i, g, i2);
        }

        /* renamed from: d */
        public final int mo23436d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f34356G) {
                return bottomSheetBehavior.f34366Q;
            }
            return bottomSheetBehavior.f34354E;
        }

        /* renamed from: h */
        public final void mo3599h(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f34358I) {
                    bottomSheetBehavior.setStateInternal(1);
                }
            }
        }

        /* renamed from: i */
        public final void mo3600i(View view, int i, int i2) {
            BottomSheetBehavior.this.dispatchOnSlide(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
            if (java.lang.Math.abs(r5.getTop() - r4.f34411a.mo41056g()) < java.lang.Math.abs(r5.getTop() - r4.f34411a.f34352C)) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
            if (java.lang.Math.abs(r6 - r7.f34351B) < java.lang.Math.abs(r6 - r4.f34411a.f34354E)) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
            if (r6 > r4.f34411a.f34352C) goto L_0x0101;
         */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3601j(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x0022
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f34378b
                if (r6 == 0) goto L_0x000e
                goto L_0x00e3
            L_0x000e:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r7.getClass()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.f34352C
                if (r6 <= r7) goto L_0x00e3
                goto L_0x0101
            L_0x0022:
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r3 = r2.f34356G
                if (r3 == 0) goto L_0x0080
                boolean r2 = r2.mo41058i(r5, r7)
                if (r2 == 0) goto L_0x0080
                float r6 = java.lang.Math.abs(r6)
                float r1 = java.lang.Math.abs(r7)
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L_0x0040
                r6 = 1140457472(0x43fa0000, float:500.0)
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L_0x0056
            L_0x0040:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r7.f34366Q
                int r7 = r7.mo41056g()
                int r7 = r7 + r1
                int r7 = r7 / 2
                if (r6 <= r7) goto L_0x0053
                r6 = 1
                goto L_0x0054
            L_0x0053:
                r6 = 0
            L_0x0054:
                if (r6 == 0) goto L_0x0059
            L_0x0056:
                r6 = 5
                goto L_0x0104
            L_0x0059:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f34378b
                if (r6 == 0) goto L_0x0061
                goto L_0x00e3
            L_0x0061:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.mo41056g()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.f34352C
                int r7 = r7 - r1
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x0101
                goto L_0x00e3
            L_0x0080:
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x00b7
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x0091
                goto L_0x00b7
            L_0x0091:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f34378b
                if (r6 == 0) goto L_0x0098
                goto L_0x0103
            L_0x0098:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.f34352C
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.f34354E
                int r6 = r6 - r1
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x0103
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.getClass()
                goto L_0x0101
            L_0x00b7:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r1 = r7.f34378b
                if (r1 == 0) goto L_0x00d5
                int r7 = r7.f34351B
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.f34354E
                int r6 = r6 - r1
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x0103
                goto L_0x00e3
            L_0x00d5:
                int r1 = r7.f34352C
                if (r6 >= r1) goto L_0x00eb
                int r7 = r7.f34354E
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00e5
            L_0x00e3:
                r6 = 3
                goto L_0x0104
            L_0x00e5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.getClass()
                goto L_0x0101
            L_0x00eb:
                int r7 = r6 - r1
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.f34354E
                int r6 = r6 - r1
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x0103
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.getClass()
            L_0x0101:
                r6 = 6
                goto L_0x0104
            L_0x0103:
                r6 = 4
            L_0x0104:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r7.getClass()
                r7.mo41059j(r5, r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C13919b.mo3601j(android.view.View, float, float):void");
        }

        /* renamed from: k */
        public final boolean mo3602k(int i, View view) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f34359J;
            if (i2 == 1 || bottomSheetBehavior.f34373X) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f34371V == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f34368S;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f34367R;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public static abstract class C13920c {
        public void onLayout(View view) {
        }

        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public class C13921d {

        /* renamed from: a */
        public int f34412a;

        /* renamed from: b */
        public boolean f34413b;

        /* renamed from: c */
        public final C13922a f34414c = new C13922a();

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d$a */
        public class C13922a implements Runnable {
            public C13922a() {
            }

            public final void run() {
                C13921d dVar = C13921d.this;
                dVar.f34413b = false;
                C7148c cVar = BottomSheetBehavior.this.f34360K;
                if (cVar == null || !cVar.mo23421h(true)) {
                    C13921d dVar2 = C13921d.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f34359J == 2) {
                        bottomSheetBehavior.setStateInternal(dVar2.f34412a);
                        return;
                    }
                    return;
                }
                C13921d dVar3 = C13921d.this;
                dVar3.mo41073a(dVar3.f34412a);
            }
        }

        public C13921d() {
        }

        /* renamed from: a */
        public final void mo41073a(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f34367R;
            if (weakReference != null && weakReference.get() != null) {
                this.f34412a = i;
                if (!this.f34413b) {
                    C13922a aVar = this.f34414c;
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15053m((View) BottomSheetBehavior.this.f34367R.get(), aVar);
                    this.f34413b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: d */
    public static View m34709d(View view) {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6342i.m15099p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View d = m34709d(viewGroup.getChildAt(i));
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static <V extends View> BottomSheetBehavior<V> m34710e(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0752e) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C0752e) layoutParams).f3269a;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: f */
    public static int m34711f(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo41052a(C13920c cVar) {
        if (!this.f34369T.contains(cVar)) {
            this.f34369T.add(cVar);
        }
    }

    /* renamed from: b */
    public final void mo41053b() {
        int c = mo41054c();
        if (this.f34378b) {
            this.f34354E = Math.max(this.f34366Q - c, this.f34351B);
        } else {
            this.f34354E = this.f34366Q - c;
        }
    }

    /* renamed from: c */
    public final int mo41054c() {
        int i;
        if (this.f34381e) {
            return Math.min(Math.max(this.f34382f, this.f34366Q - ((this.f34365P * 9) / 16)), this.f34364O) + this.f34397u;
        }
        if (this.f34389m || this.f34390n || (i = this.f34388l) <= 0) {
            return this.f34380d + this.f34397u;
        }
        return Math.max(this.f34380d, i + this.f34383g);
    }

    public final void dispatchOnSlide(int i) {
        float f;
        float f2;
        View view = (View) this.f34367R.get();
        if (view != null && !this.f34369T.isEmpty()) {
            int i2 = this.f34354E;
            if (i > i2 || i2 == mo41056g()) {
                int i3 = this.f34354E;
                f = (float) (i3 - i);
                f2 = (float) (this.f34366Q - i3);
            } else {
                int i4 = this.f34354E;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo41056g());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f34369T.size(); i5++) {
                this.f34369T.get(i5).onSlide(view, f3);
            }
        }
    }

    /* renamed from: g */
    public final int mo41056g() {
        int i;
        if (this.f34378b) {
            return this.f34351B;
        }
        int i2 = this.f34350A;
        if (this.f34393q) {
            i = 0;
        } else {
            i = this.f34398v;
        }
        return Math.max(i2, i);
    }

    /* renamed from: h */
    public final int mo41057h(int i) {
        if (i == 3) {
            return mo41056g();
        }
        if (i == 4) {
            return this.f34354E;
        }
        if (i == 5) {
            return this.f34366Q;
        }
        if (i == 6) {
            return this.f34352C;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Invalid state to get top offset: ", i));
    }

    /* renamed from: i */
    public final boolean mo41058i(View view, float f) {
        if (this.f34357H) {
            return true;
        }
        if (view.getTop() < this.f34354E) {
            return false;
        }
        if (Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f34354E)) / ((float) mo41054c()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo41059j(View view, int i, boolean z) {
        boolean z2;
        int h = mo41057h(i);
        C7148c cVar = this.f34360K;
        if (cVar == null || (!z ? !cVar.mo23432u(view, view.getLeft(), h) : !cVar.mo23430s(view.getLeft(), h))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            setStateInternal(2);
            mo41061l(i);
            this.f34401y.mo41073a(i);
            return;
        }
        setStateInternal(i);
    }

    /* renamed from: k */
    public final void mo41060k() {
        View view;
        int i;
        boolean z;
        WeakReference<V> weakReference = this.f34367R;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C6333d0.m15026n(524288, view);
            C6333d0.m15021i(0, view);
            C6333d0.m15026n(SQLiteDatabase.OPEN_PRIVATECACHE, view);
            C6333d0.m15021i(0, view);
            C6333d0.m15026n(1048576, view);
            C6333d0.m15021i(0, view);
            int i2 = this.f34375Z;
            if (i2 != -1) {
                C6333d0.m15026n(i2, view);
                C6333d0.m15021i(0, view);
            }
            int i3 = 6;
            if (!this.f34378b && this.f34359J != 6) {
                String string = view.getResources().getString(C13409j.bottomsheet_action_expand_halfway);
                C16803c cVar = new C16803c(this, 6);
                ArrayList f = C6333d0.m15018f(view);
                int i4 = 0;
                while (true) {
                    if (i4 >= f.size()) {
                        int i5 = -1;
                        int i6 = 0;
                        while (true) {
                            int[] iArr = C6333d0.f19994e;
                            if (i6 >= iArr.length || i5 != -1) {
                                i = i5;
                            } else {
                                int i7 = iArr[i6];
                                boolean z2 = true;
                                for (int i8 = 0; i8 < f.size(); i8++) {
                                    if (((C6531g.C6532a) f.get(i8)).mo22651a() != i7) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    z2 &= z;
                                }
                                if (z2) {
                                    i5 = i7;
                                }
                                i6++;
                            }
                        }
                        i = i5;
                    } else if (TextUtils.equals(string, ((C6531g.C6532a) f.get(i4)).mo22652b())) {
                        i = ((C6531g.C6532a) f.get(i4)).mo22651a();
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i != -1) {
                    C6531g.C6532a aVar = new C6531g.C6532a((Object) null, i, string, cVar, (Class) null);
                    C6333d0.m15016d(view);
                    C6333d0.m15026n(aVar.mo22651a(), view);
                    C6333d0.m15018f(view).add(aVar);
                    C6333d0.m15021i(0, view);
                }
                this.f34375Z = i;
            }
            if (this.f34356G && this.f34359J != 5) {
                C6333d0.m15027o(view, C6531g.C6532a.f20344l, new C16803c(this, 5));
            }
            int i9 = this.f34359J;
            if (i9 == 3) {
                if (this.f34378b) {
                    i3 = 4;
                }
                C6333d0.m15027o(view, C6531g.C6532a.f20343k, new C16803c(this, i3));
            } else if (i9 == 4) {
                if (this.f34378b) {
                    i3 = 3;
                }
                C6333d0.m15027o(view, C6531g.C6532a.f20342j, new C16803c(this, i3));
            } else if (i9 == 6) {
                C6333d0.m15027o(view, C6531g.C6532a.f20343k, new C16803c(this, 4));
                C6333d0.m15027o(view, C6531g.C6532a.f20342j, new C16803c(this, 3));
            }
        }
    }

    /* renamed from: l */
    public final void mo41061l(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i != 2) {
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (this.f34400x != z) {
                this.f34400x = z;
                if (this.f34384h != null && (valueAnimator = this.f34402z) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f34402z.reverse();
                        return;
                    }
                    if (z) {
                        f = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f = 1.0f;
                    }
                    this.f34402z.setFloatValues(new float[]{1.0f - f, f});
                    this.f34402z.start();
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo41062m(boolean z) {
        WeakReference<V> weakReference = this.f34367R;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f34374Y == null) {
                        this.f34374Y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    V childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f34367R.get() && z) {
                        this.f34374Y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.f34374Y = null;
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo41063n() {
        View view;
        if (this.f34367R != null) {
            mo41053b();
            if (this.f34359J == 4 && (view = (View) this.f34367R.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void onAttachedToLayoutParams(CoordinatorLayout.C0752e eVar) {
        super.onAttachedToLayoutParams(eVar);
        this.f34367R = null;
        this.f34360K = null;
    }

    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f34367R = null;
        this.f34360K = null;
    }

    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C7148c cVar;
        boolean z;
        View view;
        if (!v.isShown() || !this.f34358I) {
            this.f34361L = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.f34371V = -1;
            VelocityTracker velocityTracker = this.f34370U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f34370U = null;
            }
        }
        if (this.f34370U == null) {
            this.f34370U = VelocityTracker.obtain();
        }
        this.f34370U.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f34372W = (int) motionEvent.getY();
            if (this.f34359J != 2) {
                WeakReference<View> weakReference = this.f34368S;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                if (view != null && coordinatorLayout.mo3306u(view, x, this.f34372W)) {
                    this.f34371V = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f34373X = true;
                }
            }
            if (this.f34371V != -1 || coordinatorLayout.mo3306u(v, x, this.f34372W)) {
                z = false;
            } else {
                z = true;
            }
            this.f34361L = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f34373X = false;
            this.f34371V = -1;
            if (this.f34361L) {
                this.f34361L = false;
                return false;
            }
        }
        if (!this.f34361L && (cVar = this.f34360K) != null && cVar.mo23431t(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f34368S;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.f34361L || this.f34359J == 1 || coordinatorLayout.mo3306u(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f34360K == null || Math.abs(((float) this.f34372W) - motionEvent.getY()) <= ((float) this.f34360K.f22199b)) {
            return false;
        }
        return true;
    }

    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean z;
        boolean z2;
        float f;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6337d.m15042b(coordinatorLayout) && !C6333d0.C6337d.m15042b(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f34367R == null) {
            this.f34382f = coordinatorLayout.getResources().getDimensionPixelSize(C13403d.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT < 29 || this.f34389m || this.f34381e) {
                z = false;
            } else {
                z = true;
            }
            if (this.f34390n || this.f34391o || this.f34392p || this.f34394r || this.f34395s || this.f34396t || z) {
                C14083r.m35065a(v, new C16802b(this, z));
            }
            this.f34367R = new WeakReference<>(v);
            C19648g gVar = this.f34384h;
            if (gVar != null) {
                C6333d0.C6337d.m15057q(v, gVar);
                C19648g gVar2 = this.f34384h;
                float f2 = this.f34355F;
                if (f2 == -1.0f) {
                    f2 = C6333d0.C6342i.m15092i(v);
                }
                gVar2.mo52003m(f2);
                if (this.f34359J == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f34400x = z2;
                C19648g gVar3 = this.f34384h;
                if (z2) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = 1.0f;
                }
                gVar3.mo52006o(f);
            } else {
                ColorStateList colorStateList = this.f34385i;
                if (colorStateList != null) {
                    C6333d0.m15032t(v, colorStateList);
                }
            }
            mo41060k();
            if (C6333d0.C6337d.m15043c(v) == 0) {
                C6333d0.C6337d.m15059s(v, 1);
            }
        }
        if (this.f34360K == null) {
            this.f34360K = new C7148c(coordinatorLayout.getContext(), coordinatorLayout, this.f34377a0);
        }
        int top = v.getTop();
        coordinatorLayout.mo3309w(i, v);
        this.f34365P = coordinatorLayout.getWidth();
        this.f34366Q = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f34364O = height;
        int i2 = this.f34366Q;
        int i3 = i2 - height;
        int i4 = this.f34398v;
        if (i3 < i4) {
            if (this.f34393q) {
                this.f34364O = i2;
            } else {
                this.f34364O = i2 - i4;
            }
        }
        this.f34351B = Math.max(0, i2 - this.f34364O);
        this.f34352C = (int) ((1.0f - this.f34353D) * ((float) this.f34366Q));
        mo41053b();
        int i5 = this.f34359J;
        if (i5 == 3) {
            C6333d0.m15023k(mo41056g(), v);
        } else if (i5 == 6) {
            C6333d0.m15023k(this.f34352C, v);
        } else if (this.f34356G && i5 == 5) {
            C6333d0.m15023k(this.f34366Q, v);
        } else if (i5 == 4) {
            C6333d0.m15023k(this.f34354E, v);
        } else if (i5 == 1 || i5 == 2) {
            C6333d0.m15023k(top - v.getTop(), v);
        }
        this.f34368S = new WeakReference<>(m34709d(v));
        for (int i6 = 0; i6 < this.f34369T.size(); i6++) {
            this.f34369T.get(i6).onLayout(v);
        }
        return true;
    }

    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m34711f(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f34386j, marginLayoutParams.width), m34711f(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f34387k, marginLayoutParams.height));
        return true;
    }

    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f34368S;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.f34359J != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f34368S;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view == view2) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo41056g()) {
                        int g = top - mo41056g();
                        iArr[1] = g;
                        C6333d0.m15023k(-g, v);
                        setStateInternal(3);
                    } else if (this.f34358I) {
                        iArr[1] = i2;
                        C6333d0.m15023k(-i2, v);
                        setStateInternal(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f34354E;
                    if (i4 > i5 && !this.f34356G) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        C6333d0.m15023k(-i6, v);
                        setStateInternal(4);
                    } else if (this.f34358I) {
                        iArr[1] = i2;
                        C6333d0.m15023k(-i2, v);
                        setStateInternal(1);
                    } else {
                        return;
                    }
                }
                dispatchOnSlide(v.getTop());
                this.f34362M = i2;
                this.f34363N = true;
            }
        }
    }

    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        int i = this.f34376a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f34380d = savedState.f34404c;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f34378b = savedState.f34405d;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f34356G = savedState.f34406e;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f34357H = savedState.f34407f;
            }
        }
        int i2 = savedState.f34403b;
        if (i2 == 1 || i2 == 2) {
            this.f34359J = 4;
        } else {
            this.f34359J = i2;
        }
    }

    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f34362M = 0;
        this.f34363N = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5.getTop() <= r3.f34352C) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (java.lang.Math.abs(r4 - r3.f34351B) < java.lang.Math.abs(r4 - r3.f34354E)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r4 < java.lang.Math.abs(r4 - r3.f34354E)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.f34354E)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if (java.lang.Math.abs(r4 - r3.f34352C) < java.lang.Math.abs(r4 - r3.f34354E)) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.mo41056g()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.setStateInternal(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f34368S
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x00b5
            boolean r4 = r3.f34363N
            if (r4 != 0) goto L_0x001f
            goto L_0x00b5
        L_0x001f:
            int r4 = r3.f34362M
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L_0x0035
            boolean r4 = r3.f34378b
            if (r4 == 0) goto L_0x002b
            goto L_0x00af
        L_0x002b:
            int r4 = r5.getTop()
            int r6 = r3.f34352C
            if (r4 <= r6) goto L_0x00af
            goto L_0x00ae
        L_0x0035:
            boolean r4 = r3.f34356G
            if (r4 == 0) goto L_0x0056
            android.view.VelocityTracker r4 = r3.f34370U
            if (r4 != 0) goto L_0x003f
            r4 = 0
            goto L_0x004e
        L_0x003f:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f34379c
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.f34370U
            int r1 = r3.f34371V
            float r4 = r4.getYVelocity(r1)
        L_0x004e:
            boolean r4 = r3.mo41058i(r5, r4)
            if (r4 == 0) goto L_0x0056
            r0 = 5
            goto L_0x00af
        L_0x0056:
            int r4 = r3.f34362M
            if (r4 != 0) goto L_0x0093
            int r4 = r5.getTop()
            boolean r1 = r3.f34378b
            if (r1 == 0) goto L_0x0074
            int r7 = r3.f34351B
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.f34354E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto L_0x0097
            goto L_0x00af
        L_0x0074:
            int r1 = r3.f34352C
            if (r4 >= r1) goto L_0x0083
            int r6 = r3.f34354E
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto L_0x00ae
            goto L_0x00af
        L_0x0083:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f34354E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x0097
            goto L_0x00ae
        L_0x0093:
            boolean r4 = r3.f34378b
            if (r4 == 0) goto L_0x0099
        L_0x0097:
            r0 = 4
            goto L_0x00af
        L_0x0099:
            int r4 = r5.getTop()
            int r0 = r3.f34352C
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f34354E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x0097
        L_0x00ae:
            r0 = 6
        L_0x00af:
            r4 = 0
            r3.mo41059j(r5, r0, r4)
            r3.f34363N = r4
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f34359J;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C7148c cVar = this.f34360K;
        if (cVar == null || (!this.f34358I && i != 1)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            cVar.mo23424m(motionEvent);
        }
        if (actionMasked == 0) {
            this.f34371V = -1;
            VelocityTracker velocityTracker = this.f34370U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f34370U = null;
            }
        }
        if (this.f34370U == null) {
            this.f34370U = VelocityTracker.obtain();
        }
        this.f34370U.addMovement(motionEvent);
        if (this.f34360K != null && (this.f34358I || this.f34359J == 1)) {
            z2 = true;
        }
        if (z2 && actionMasked == 2 && !this.f34361L) {
            float abs = Math.abs(((float) this.f34372W) - motionEvent.getY());
            C7148c cVar2 = this.f34360K;
            if (abs > ((float) cVar2.f22199b)) {
                cVar2.mo23416c(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.f34361L;
    }

    public final void setHideable(boolean z) {
        if (this.f34356G != z) {
            this.f34356G = z;
            if (!z && this.f34359J == 5) {
                setState(4);
            }
            mo41060k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setPeekHeight(int r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f34381e
            if (r4 != 0) goto L_0x001d
            r3.f34381e = r1
            goto L_0x001c
        L_0x000c:
            boolean r2 = r3.f34381e
            if (r2 != 0) goto L_0x0014
            int r2 = r3.f34380d
            if (r2 == r4) goto L_0x001d
        L_0x0014:
            r3.f34381e = r0
            int r4 = java.lang.Math.max(r0, r4)
            r3.f34380d = r4
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r3.mo41063n()
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setPeekHeight(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (p242s1.C6333d0.C6340g.m15075b(r4) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setState(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L_0x005d
            r1 = 2
            if (r4 != r1) goto L_0x0007
            goto L_0x005d
        L_0x0007:
            boolean r1 = r3.f34356G
            if (r1 != 0) goto L_0x000f
            r1 = 5
            if (r4 != r1) goto L_0x000f
            return
        L_0x000f:
            r1 = 6
            if (r4 != r1) goto L_0x0020
            boolean r1 = r3.f34378b
            if (r1 == 0) goto L_0x0020
            int r1 = r3.mo41057h(r4)
            int r2 = r3.f34351B
            if (r1 > r2) goto L_0x0020
            r1 = 3
            goto L_0x0021
        L_0x0020:
            r1 = r4
        L_0x0021:
            java.lang.ref.WeakReference<V> r2 = r3.f34367R
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x002c
            goto L_0x0059
        L_0x002c:
            java.lang.ref.WeakReference<V> r4 = r3.f34367R
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r4, r1)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L_0x004e
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L_0x004e
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            boolean r1 = p242s1.C6333d0.C6340g.m15075b(r4)
            if (r1 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 == 0) goto L_0x0055
            r4.post(r2)
            goto L_0x005c
        L_0x0055:
            r2.run()
            goto L_0x005c
        L_0x0059:
            r3.setStateInternal(r4)
        L_0x005c:
            return
        L_0x005d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            if (r4 != r0) goto L_0x006a
            java.lang.String r4 = "DRAGGING"
            goto L_0x006c
        L_0x006a:
            java.lang.String r4 = "SETTLING"
        L_0x006c:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = p001a0.C0016g.m31o(r2, r4, r0)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setState(int):void");
    }

    public final void setStateInternal(int i) {
        View view;
        if (this.f34359J != i) {
            this.f34359J = i;
            WeakReference<V> weakReference = this.f34367R;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    mo41062m(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    mo41062m(false);
                }
                mo41061l(i);
                for (int i2 = 0; i2 < this.f34369T.size(); i2++) {
                    this.f34369T.get(i2).onStateChanged(view, i);
                }
                mo41060k();
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C13917a();

        /* renamed from: b */
        public final int f34403b;

        /* renamed from: c */
        public int f34404c;

        /* renamed from: d */
        public boolean f34405d;

        /* renamed from: e */
        public boolean f34406e;

        /* renamed from: f */
        public boolean f34407f;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        public class C13917a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f34403b = parcel.readInt();
            this.f34404c = parcel.readInt();
            boolean z = false;
            this.f34405d = parcel.readInt() == 1;
            this.f34406e = parcel.readInt() == 1;
            this.f34407f = parcel.readInt() == 1 ? true : z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f34403b);
            parcel.writeInt(this.f34404c);
            parcel.writeInt(this.f34405d ? 1 : 0);
            parcel.writeInt(this.f34406e ? 1 : 0);
            parcel.writeInt(this.f34407f ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f34403b = bottomSheetBehavior.f34359J;
            this.f34404c = bottomSheetBehavior.f34380d;
            this.f34405d = bottomSheetBehavior.f34378b;
            this.f34406e = bottomSheetBehavior.f34356G;
            this.f34407f = bottomSheetBehavior.f34357H;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f34383g = context.getResources().getDimensionPixelSize(C13403d.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.BottomSheetBehavior_Layout);
        int i2 = C13411l.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f34385i = C19099c.m46247a(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(C13411l.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f34399w = new C19654k(C19654k.m47124c(context, attributeSet, C13401b.bottomSheetStyle, f34349b0));
        }
        if (this.f34399w != null) {
            C19648g gVar = new C19648g(this.f34399w);
            this.f34384h = gVar;
            gVar.mo52001k(context);
            ColorStateList colorStateList = this.f34385i;
            if (colorStateList != null) {
                this.f34384h.mo52005n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f34384h.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        this.f34402z = ofFloat;
        ofFloat.setDuration(500);
        this.f34402z.addUpdateListener(new C16801a(this));
        this.f34355F = obtainStyledAttributes.getDimension(C13411l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = C13411l.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.f34386j = obtainStyledAttributes.getDimensionPixelSize(i3, -1);
        }
        int i4 = C13411l.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.f34387k = obtainStyledAttributes.getDimensionPixelSize(i4, -1);
        }
        int i5 = C13411l.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue == null || (i = peekValue.data) != -1) {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        } else {
            setPeekHeight(i);
        }
        setHideable(obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.f34389m = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f34378b != z) {
            this.f34378b = z;
            if (this.f34367R != null) {
                mo41053b();
            }
            setStateInternal((!this.f34378b || this.f34359J != 6) ? this.f34359J : 3);
            mo41060k();
        }
        this.f34357H = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f34358I = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f34376a = obtainStyledAttributes.getInt(C13411l.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = obtainStyledAttributes.getFloat(C13411l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f34353D = f;
        if (this.f34367R != null) {
            this.f34352C = (int) ((1.0f - f) * ((float) this.f34366Q));
        }
        int i6 = C13411l.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i6, 0);
            if (dimensionPixelOffset >= 0) {
                this.f34350A = dimensionPixelOffset;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i7 = peekValue2.data;
            if (i7 >= 0) {
                this.f34350A = i7;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f34390n = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f34391o = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f34392p = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f34393q = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f34394r = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f34395s = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f34396t = obtainStyledAttributes.getBoolean(C13411l.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        this.f34379c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
