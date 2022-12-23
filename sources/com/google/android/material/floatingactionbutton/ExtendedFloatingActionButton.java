package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C14050d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p092g3.C4752a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13400a;
import p355ac.C13401b;
import p355ac.C13410k;
import p355ac.C13411l;
import p380bc.C13583g;
import p647mc.C18353a;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0749b {

    /* renamed from: E */
    public static final int f34792E = C13410k.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: F */
    public static final C14012c f34793F = new C14012c();

    /* renamed from: G */
    public static final C14013d f34794G = new C14013d();

    /* renamed from: H */
    public static final C14014e f34795H = new C14014e();

    /* renamed from: I */
    public static final C14015f f34796I = new C14015f();

    /* renamed from: A */
    public boolean f34797A;

    /* renamed from: B */
    public boolean f34798B;

    /* renamed from: C */
    public boolean f34799C;

    /* renamed from: D */
    public ColorStateList f34800D;

    /* renamed from: r */
    public int f34801r;

    /* renamed from: s */
    public final C14016g f34802s;

    /* renamed from: t */
    public final C14016g f34803t;

    /* renamed from: u */
    public final C14018i f34804u;

    /* renamed from: v */
    public final C14017h f34805v;

    /* renamed from: w */
    public final int f34806w;

    /* renamed from: x */
    public int f34807x;

    /* renamed from: y */
    public int f34808y;

    /* renamed from: z */
    public final ExtendedFloatingActionButtonBehavior f34809z;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C14010a implements C14019j {
        public C14010a() {
        }

        public final int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public final ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        public final int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f34808y;
        }

        public final int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f34807x;
        }

        public final int getWidth() {
            int measuredWidth = ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return measuredWidth + extendedFloatingActionButton.f34807x + extendedFloatingActionButton.f34808y;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C14011b implements C14019j {
        public C14011b() {
        }

        public final int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public final ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        public final int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public final int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public final int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public class C14012c extends Property<View, Float> {
        public C14012c() {
            super(Float.class, "width");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public class C14013d extends Property<View, Float> {
        public C14013d() {
            super(Float.class, "height");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    public class C14014e extends Property<View, Float> {
        public C14014e() {
            super(Float.class, "paddingStart");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return Float.valueOf((float) C6333d0.C6338e.m15065f((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6338e.m15070k(view, intValue, paddingTop, C6333d0.C6338e.m15064e(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    public class C14015f extends Property<View, Float> {
        public C14015f() {
            super(Float.class, "paddingEnd");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return Float.valueOf((float) C6333d0.C6338e.m15064e((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6338e.m15070k(view, C6333d0.C6338e.m15065f(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    public class C14016g extends C18353a {

        /* renamed from: g */
        public final C14019j f34815g;

        /* renamed from: h */
        public final boolean f34816h;

        public C14016g(C4752a aVar, C14019j jVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f34815g = jVar;
            this.f34816h = z;
        }

        /* renamed from: a */
        public final void mo41637a() {
            this.f46787d.f16037a = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f34798B = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f34815g.getLayoutParams().width;
                layoutParams.height = this.f34815g.getLayoutParams().height;
            }
        }

        /* renamed from: b */
        public final void mo41638b() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f34797A = this.f34816h;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f34815g.getLayoutParams().width;
                layoutParams.height = this.f34815g.getLayoutParams().height;
                ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
                int paddingStart = this.f34815g.getPaddingStart();
                int paddingTop = ExtendedFloatingActionButton.this.getPaddingTop();
                int paddingEnd = this.f34815g.getPaddingEnd();
                int paddingBottom = ExtendedFloatingActionButton.this.getPaddingBottom();
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6338e.m15070k(extendedFloatingActionButton2, paddingStart, paddingTop, paddingEnd, paddingBottom);
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: c */
        public final void mo41639c() {
        }

        /* renamed from: d */
        public final boolean mo41640d() {
            boolean z = this.f34816h;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (z == extendedFloatingActionButton.f34797A || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText())) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final int mo41641f() {
            if (this.f34816h) {
                return C13400a.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return C13400a.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        /* renamed from: g */
        public final AnimatorSet mo41642g() {
            float f;
            C13583g gVar = this.f46789f;
            if (gVar == null) {
                if (this.f46788e == null) {
                    this.f46788e = C13583g.m33997b(mo41641f(), this.f46784a);
                }
                gVar = this.f46788e;
                gVar.getClass();
            }
            if (gVar.mo40468g("width")) {
                PropertyValuesHolder[] e = gVar.mo40465e("width");
                e[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f34815g.getWidth()});
                gVar.mo40469h("width", e);
            }
            if (gVar.mo40468g("height")) {
                PropertyValuesHolder[] e2 = gVar.mo40465e("height");
                e2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f34815g.getHeight()});
                gVar.mo40469h("height", e2);
            }
            if (gVar.mo40468g("paddingStart")) {
                PropertyValuesHolder[] e3 = gVar.mo40465e("paddingStart");
                PropertyValuesHolder propertyValuesHolder = e3[0];
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                propertyValuesHolder.setFloatValues(new float[]{(float) C6333d0.C6338e.m15065f(extendedFloatingActionButton), (float) this.f34815g.getPaddingStart()});
                gVar.mo40469h("paddingStart", e3);
            }
            if (gVar.mo40468g("paddingEnd")) {
                PropertyValuesHolder[] e4 = gVar.mo40465e("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = e4[0];
                ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                propertyValuesHolder2.setFloatValues(new float[]{(float) C6333d0.C6338e.m15064e(extendedFloatingActionButton2), (float) this.f34815g.getPaddingEnd()});
                gVar.mo40469h("paddingEnd", e4);
            }
            if (gVar.mo40468g("labelOpacity")) {
                PropertyValuesHolder[] e5 = gVar.mo40465e("labelOpacity");
                boolean z = this.f34816h;
                float f2 = 1.0f;
                if (z) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = 1.0f;
                }
                if (!z) {
                    f2 = BitmapDescriptorFactory.HUE_RED;
                }
                e5[0].setFloatValues(new float[]{f, f2});
                gVar.mo40469h("labelOpacity", e5);
            }
            return mo50804h(gVar);
        }

        public final void onAnimationStart(Animator animator) {
            C4752a aVar = this.f46787d;
            Animator animator2 = (Animator) aVar.f16037a;
            if (animator2 != null) {
                animator2.cancel();
            }
            aVar.f16037a = animator;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f34797A = this.f34816h;
            extendedFloatingActionButton.f34798B = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    public class C14017h extends C18353a {

        /* renamed from: g */
        public boolean f34818g;

        public C14017h(C4752a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public final void mo41637a() {
            this.f46787d.f16037a = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f34801r = 0;
            if (!this.f34818g) {
                extendedFloatingActionButton.setVisibility(8);
            }
        }

        /* renamed from: b */
        public final void mo41638b() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: c */
        public final void mo41639c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0016 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo41640d() {
            /*
                r4 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this
                int r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f34792E
                int r1 = r0.getVisibility()
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0011
                int r0 = r0.f34801r
                if (r0 != r3) goto L_0x0017
                goto L_0x0016
            L_0x0011:
                int r0 = r0.f34801r
                r1 = 2
                if (r0 == r1) goto L_0x0017
            L_0x0016:
                r2 = 1
            L_0x0017:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.C14017h.mo41640d():boolean");
        }

        /* renamed from: e */
        public final void mo41644e() {
            super.mo41644e();
            this.f34818g = true;
        }

        /* renamed from: f */
        public final int mo41641f() {
            return C13400a.mtrl_extended_fab_hide_motion_spec;
        }

        public final void onAnimationStart(Animator animator) {
            C4752a aVar = this.f46787d;
            Animator animator2 = (Animator) aVar.f16037a;
            if (animator2 != null) {
                animator2.cancel();
            }
            aVar.f16037a = animator;
            this.f34818g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f34801r = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    public class C14018i extends C18353a {
        public C14018i(C4752a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public final void mo41637a() {
            this.f46787d.f16037a = null;
            ExtendedFloatingActionButton.this.f34801r = 0;
        }

        /* renamed from: b */
        public final void mo41638b() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: c */
        public final void mo41639c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:4:0x0011 A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo41640d() {
            /*
                r4 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this
                int r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f34792E
                int r1 = r0.getVisibility()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0013
                int r0 = r0.f34801r
                r1 = 2
                if (r0 != r1) goto L_0x0018
            L_0x0011:
                r2 = 1
                goto L_0x0018
            L_0x0013:
                int r0 = r0.f34801r
                if (r0 == r3) goto L_0x0018
                goto L_0x0011
            L_0x0018:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.C14018i.mo41640d():boolean");
        }

        /* renamed from: f */
        public final int mo41641f() {
            return C13400a.mtrl_extended_fab_show_motion_spec;
        }

        public final void onAnimationStart(Animator animator) {
            C4752a aVar = this.f46787d;
            Animator animator2 = (Animator) aVar.f16037a;
            if (animator2 != null) {
                animator2.cancel();
            }
            aVar.f16037a = animator;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f34801r = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    public interface C14019j {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.extendedFloatingActionButtonStyle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r4.f34799C != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r4.isInEditMode() == false) goto L_0x0036;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m34933e(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4, p647mc.C18353a r5) {
        /*
            r4.getClass()
            boolean r0 = r5.mo41640d()
            if (r0 == 0) goto L_0x000a
            goto L_0x0067
        L_0x000a:
            java.util.WeakHashMap<android.view.View, s1.p0> r0 = p242s1.C6333d0.f19990a
            boolean r0 = p242s1.C6333d0.C6340g.m15076c(r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x002e
            int r0 = r4.getVisibility()
            if (r0 == 0) goto L_0x0023
            int r0 = r4.f34801r
            r3 = 2
            if (r0 != r3) goto L_0x0021
        L_0x001f:
            r0 = 1
            goto L_0x0028
        L_0x0021:
            r0 = 0
            goto L_0x0028
        L_0x0023:
            int r0 = r4.f34801r
            if (r0 == r2) goto L_0x0021
            goto L_0x001f
        L_0x0028:
            if (r0 != 0) goto L_0x0035
            boolean r0 = r4.f34799C
            if (r0 == 0) goto L_0x0035
        L_0x002e:
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            if (r2 != 0) goto L_0x003f
            r5.mo41638b()
            r5.mo41639c()
            goto L_0x0067
        L_0x003f:
            r4.measure(r1, r1)
            android.animation.AnimatorSet r4 = r5.mo41642g()
            mc.c r0 = new mc.c
            r0.<init>(r5)
            r4.addListener(r0)
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r5 = r5.f46786c
            java.util.Iterator r5 = r5.iterator()
        L_0x0054:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r5.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r4.addListener(r0)
            goto L_0x0054
        L_0x0064:
            r4.start()
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m34933e(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton, mc.a):void");
    }

    /* renamed from: f */
    public final void mo41601f(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f34809z;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.f34806w;
        if (i >= 0) {
            return i;
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        return (Math.min(C6333d0.C6338e.m15065f(this), C6333d0.C6338e.m15064e(this)) * 2) + getIconSize();
    }

    public C13583g getExtendMotionSpec() {
        return this.f34803t.f46789f;
    }

    public C13583g getHideMotionSpec() {
        return this.f34805v.f46789f;
    }

    public C13583g getShowMotionSpec() {
        return this.f34804u.f46789f;
    }

    public C13583g getShrinkMotionSpec() {
        return this.f34802s.f46789f;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34797A && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f34797A = false;
            this.f34802s.mo41638b();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f34799C = z;
    }

    public void setExtendMotionSpec(C13583g gVar) {
        this.f34803t.f46789f = gVar;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C13583g.m33997b(i, getContext()));
    }

    public void setExtended(boolean z) {
        C14016g gVar;
        if (this.f34797A != z) {
            if (z) {
                gVar = this.f34803t;
            } else {
                gVar = this.f34802s;
            }
            if (!gVar.mo41640d()) {
                gVar.mo41638b();
            }
        }
    }

    public void setHideMotionSpec(C13583g gVar) {
        this.f34805v.f46789f = gVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C13583g.m33997b(i, getContext()));
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f34797A && !this.f34798B) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            this.f34807x = C6333d0.C6338e.m15065f(this);
            this.f34808y = C6333d0.C6338e.m15064e(this);
        }
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f34797A && !this.f34798B) {
            this.f34807x = i;
            this.f34808y = i3;
        }
    }

    public void setShowMotionSpec(C13583g gVar) {
        this.f34804u.f46789f = gVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C13583g.m33997b(i, getContext()));
    }

    public void setShrinkMotionSpec(C13583g gVar) {
        this.f34802s.f46789f = gVar;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C13583g.m33997b(i, getContext()));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        this.f34800D = getTextColors();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f34792E
            r1 = r17
            android.content.Context r1 = p883wc.C20289a.m47861a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f34801r = r10
            g3.a r1 = new g3.a
            r11 = 2
            r1.<init>(r11, r10)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.f34804u = r12
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            r13.<init>(r1)
            r0.f34805v = r13
            r14 = 1
            r0.f34797A = r14
            r0.f34798B = r10
            r0.f34799C = r10
            android.content.Context r15 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r15, r7)
            r0.f34809z = r1
            int[] r3 = p355ac.C13411l.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r15
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.C14077m.m35060d(r1, r2, r3, r4, r5, r6)
            int r2 = p355ac.C13411l.ExtendedFloatingActionButton_showMotionSpec
            bc.g r2 = p380bc.C13583g.m33996a(r15, r1, r2)
            int r3 = p355ac.C13411l.ExtendedFloatingActionButton_hideMotionSpec
            bc.g r3 = p380bc.C13583g.m33996a(r15, r1, r3)
            int r4 = p355ac.C13411l.ExtendedFloatingActionButton_extendMotionSpec
            bc.g r4 = p380bc.C13583g.m33996a(r15, r1, r4)
            int r5 = p355ac.C13411l.ExtendedFloatingActionButton_shrinkMotionSpec
            bc.g r5 = p380bc.C13583g.m33996a(r15, r1, r5)
            int r6 = p355ac.C13411l.ExtendedFloatingActionButton_collapsedSize
            r14 = -1
            int r6 = r1.getDimensionPixelSize(r6, r14)
            r0.f34806w = r6
            java.util.WeakHashMap<android.view.View, s1.p0> r6 = p242s1.C6333d0.f19990a
            int r6 = p242s1.C6333d0.C6338e.m15065f(r16)
            r0.f34807x = r6
            int r6 = p242s1.C6333d0.C6338e.m15064e(r16)
            r0.f34808y = r6
            g3.a r6 = new g3.a
            r6.<init>(r11, r10)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r14 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r14.<init>()
            r10 = 1
            r11.<init>(r6, r14, r10)
            r0.f34803t = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r14 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r14.<init>()
            r7 = 0
            r10.<init>(r6, r14, r7)
            r0.f34802s = r10
            r12.f46789f = r2
            r13.f46789f = r3
            r11.f46789f = r4
            r10.f46789f = r5
            r1.recycle()
            tc.i r1 = p811tc.C19654k.f49886m
            r2 = r18
            tc.k$a r1 = p811tc.C19654k.m47125d(r15, r2, r8, r9, r1)
            tc.k r2 = new tc.k
            r2.<init>(r1)
            r0.setShapeAppearanceModel(r2)
            android.content.res.ColorStateList r1 = r16.getTextColors()
            r0.f34800D = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f34810a;

        /* renamed from: b */
        public boolean f34811b;

        /* renamed from: c */
        public boolean f34812c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f34811b = false;
            this.f34812c = true;
        }

        /* renamed from: a */
        public final boolean mo41622a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z;
            C18353a aVar;
            C18353a aVar2;
            CoordinatorLayout.C0752e eVar = (CoordinatorLayout.C0752e) extendedFloatingActionButton.getLayoutParams();
            if ((this.f34811b || this.f34812c) && eVar.f3274f == appBarLayout.getId()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.f34810a == null) {
                this.f34810a = new Rect();
            }
            Rect rect = this.f34810a;
            C14050d.m35033a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.f34812c) {
                    aVar2 = extendedFloatingActionButton.f34802s;
                } else {
                    aVar2 = extendedFloatingActionButton.f34805v;
                }
                ExtendedFloatingActionButton.m34933e(extendedFloatingActionButton, aVar2);
            } else {
                if (this.f34812c) {
                    aVar = extendedFloatingActionButton.f34803t;
                } else {
                    aVar = extendedFloatingActionButton.f34804u;
                }
                ExtendedFloatingActionButton.m34933e(extendedFloatingActionButton, aVar);
            }
            return true;
        }

        /* renamed from: b */
        public final boolean mo41623b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z;
            C18353a aVar;
            C18353a aVar2;
            CoordinatorLayout.C0752e eVar = (CoordinatorLayout.C0752e) extendedFloatingActionButton.getLayoutParams();
            if ((this.f34811b || this.f34812c) && eVar.f3274f == view.getId()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0752e) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                if (this.f34812c) {
                    aVar2 = extendedFloatingActionButton.f34802s;
                } else {
                    aVar2 = extendedFloatingActionButton.f34805v;
                }
                ExtendedFloatingActionButton.m34933e(extendedFloatingActionButton, aVar2);
            } else {
                if (this.f34812c) {
                    aVar = extendedFloatingActionButton.f34803t;
                } else {
                    aVar = extendedFloatingActionButton.f34804u;
                }
                ExtendedFloatingActionButton.m34933e(extendedFloatingActionButton, aVar);
            }
            return true;
        }

        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        public final void onAttachedToLayoutParams(CoordinatorLayout.C0752e eVar) {
            if (eVar.f3276h == 0) {
                eVar.f3276h = 80;
            }
        }

        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                mo41622a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0752e) {
                    z = ((CoordinatorLayout.C0752e) layoutParams).f3269a instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    mo41623b(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            boolean z;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList q = coordinatorLayout.mo3296q(extendedFloatingActionButton);
            int size = q.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) q.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0752e) {
                        z = ((CoordinatorLayout.C0752e) layoutParams).f3269a instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z && mo41623b(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (mo41622a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3309w(i, extendedFloatingActionButton);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f34811b = obtainStyledAttributes.getBoolean(C13411l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f34812c = obtainStyledAttributes.getBoolean(C13411l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f34800D = getTextColors();
    }
}
