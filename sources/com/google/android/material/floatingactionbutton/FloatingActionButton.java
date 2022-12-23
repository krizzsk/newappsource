package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.C0407g;
import androidx.appcompat.widget.C0417j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomappbar.C13910b;
import com.google.android.material.bottomappbar.C13913d;
import com.google.android.material.bottomappbar.C13914e;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C14026d;
import com.google.android.material.internal.C14050d;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p141k1.C5450a;
import p241s0.C6313h;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p304x.C7031c;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13410k;
import p355ac.C13411l;
import p380bc.C13583g;
import p380bc.C13585i;
import p623lc.C18179a;
import p647mc.C18355b;
import p647mc.C18359e;
import p647mc.C18360f;
import p787sc.C19445b;
import p811tc.C19648g;
import p811tc.C19654k;
import p811tc.C19666o;

public class FloatingActionButton extends VisibilityAwareImageButton implements C18179a, C19666o, CoordinatorLayout.C0749b {

    /* renamed from: s */
    public static final int f34821s = C13410k.Widget_Design_FloatingActionButton;

    /* renamed from: c */
    public ColorStateList f34822c;

    /* renamed from: d */
    public PorterDuff.Mode f34823d;

    /* renamed from: e */
    public ColorStateList f34824e;

    /* renamed from: f */
    public PorterDuff.Mode f34825f;

    /* renamed from: g */
    public ColorStateList f34826g;

    /* renamed from: h */
    public int f34827h;

    /* renamed from: i */
    public int f34828i;

    /* renamed from: j */
    public int f34829j;

    /* renamed from: k */
    public int f34830k;

    /* renamed from: l */
    public int f34831l;

    /* renamed from: m */
    public boolean f34832m;

    /* renamed from: n */
    public final Rect f34833n;

    /* renamed from: o */
    public final Rect f34834o;

    /* renamed from: p */
    public final C0417j f34835p;

    /* renamed from: q */
    public final C7031c f34836q;

    /* renamed from: r */
    public C18360f f34837r;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return onDependentViewChanged(coordinatorLayout, (FloatingActionButton) view, view2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class C14020a {
        /* renamed from: a */
        public void mo41040a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo41041b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C14021b implements C19445b {
        public C14021b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C14022c<T extends FloatingActionButton> implements C14026d.C14032f {

        /* renamed from: a */
        public final C13585i<T> f34841a;

        public C14022c(BottomAppBar.C13905b bVar) {
            this.f34841a = bVar;
        }

        /* renamed from: a */
        public final void mo41725a() {
            C13585i<T> iVar = this.f34841a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.C13905b bVar = (BottomAppBar.C13905b) iVar;
            bVar.getClass();
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().f34347f != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().f34347f = translationX;
                BottomAppBar.this.f34302U.invalidateSelf();
            }
            float f = BitmapDescriptorFactory.HUE_RED;
            float max = Math.max(BitmapDescriptorFactory.HUE_RED, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().f34346e != max) {
                C13914e w = BottomAppBar.this.getTopEdgeTreatment();
                if (max >= BitmapDescriptorFactory.HUE_RED) {
                    w.f34346e = max;
                    BottomAppBar.this.f34302U.invalidateSelf();
                } else {
                    w.getClass();
                    throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
                }
            }
            C19648g gVar = BottomAppBar.this.f34302U;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            }
            gVar.mo52006o(f);
        }

        /* renamed from: b */
        public final void mo41726b() {
            float f;
            C13585i<T> iVar = this.f34841a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.C13905b bVar = (BottomAppBar.C13905b) iVar;
            bVar.getClass();
            C19648g gVar = BottomAppBar.this.f34302U;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            gVar.mo52006o(f);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C14022c) || !((C14022c) obj).f34841a.equals(this.f34841a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f34841a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.floatingActionButtonStyle);
    }

    private C14026d getImpl() {
        if (this.f34837r == null) {
            this.f34837r = new C18360f(this, new C14021b());
        }
        return this.f34837r;
    }

    /* renamed from: m */
    public static int m34955m(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final boolean mo41645a() {
        return this.f34836q.f21876a;
    }

    /* renamed from: d */
    public final void mo41646d(BottomAppBar.C13904a aVar) {
        C14026d impl = getImpl();
        if (impl.f34880t == null) {
            impl.f34880t = new ArrayList<>();
        }
        impl.f34880t.add(aVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo41742j(getDrawableState());
    }

    /* renamed from: e */
    public final void mo41648e(C13913d dVar) {
        C14026d impl = getImpl();
        if (impl.f34879s == null) {
            impl.f34879s = new ArrayList<>();
        }
        impl.f34879s.add(dVar);
    }

    /* renamed from: f */
    public final void mo41649f(BottomAppBar.C13905b bVar) {
        C14026d impl = getImpl();
        C14022c cVar = new C14022c(bVar);
        if (impl.f34881u == null) {
            impl.f34881u = new ArrayList<>();
        }
        impl.f34881u.add(cVar);
    }

    /* renamed from: g */
    public final int mo41650g(int i) {
        int i2 = this.f34829j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C13403d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C13403d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return mo41650g(1);
        } else {
            return mo41650g(0);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f34822c;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f34823d;
    }

    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo41737e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f34869i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f34870j;
    }

    public Drawable getContentBackground() {
        return getImpl().f34865e;
    }

    public int getCustomSize() {
        return this.f34829j;
    }

    public int getExpandedComponentIdHint() {
        return this.f34836q.f21877b;
    }

    public C13583g getHideMotionSpec() {
        return getImpl().f34874n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f34826g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f34826g;
    }

    public C19654k getShapeAppearanceModel() {
        C19654k kVar = getImpl().f34861a;
        kVar.getClass();
        return kVar;
    }

    public C13583g getShowMotionSpec() {
        return getImpl().f34873m;
    }

    public int getSize() {
        return this.f34828i;
    }

    public int getSizeDimension() {
        return mo41650g(this.f34828i);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f34824e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f34825f;
    }

    public boolean getUseCompatPadding() {
        return this.f34832m;
    }

    /* renamed from: h */
    public final void mo41671h(C13910b bVar, boolean z) {
        C14023a aVar;
        boolean z2;
        int i;
        AnimatorSet animatorSet;
        C14026d impl = getImpl();
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = new C14023a(this, bVar);
        }
        boolean z3 = false;
        if (impl.f34882v.getVisibility() != 0 ? impl.f34878r == 2 : impl.f34878r != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            Animator animator = impl.f34872l;
            if (animator != null) {
                animator.cancel();
            }
            FloatingActionButton floatingActionButton = impl.f34882v;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15076c(floatingActionButton) && !impl.f34882v.isInEditMode()) {
                z3 = true;
            }
            if (z3) {
                C13583g gVar = impl.f34874n;
                if (gVar != null) {
                    animatorSet = impl.mo41735b(gVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                } else {
                    animatorSet = impl.mo41736c(BitmapDescriptorFactory.HUE_RED, 0.4f, 0.4f);
                }
                animatorSet.addListener(new C14024b(impl, z, aVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f34880t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            FloatingActionButton floatingActionButton2 = impl.f34882v;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            floatingActionButton2.mo41851b(i, z);
            if (aVar != null) {
                aVar.f34843a.mo41040a(aVar.f34844b);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0012 A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41672i() {
        /*
            r4 = this;
            com.google.android.material.floatingactionbutton.d r0 = r4.getImpl()
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f34882v
            int r1 = r1.getVisibility()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0014
            int r0 = r0.f34878r
            if (r0 != r3) goto L_0x001a
        L_0x0012:
            r2 = 1
            goto L_0x001a
        L_0x0014:
            int r0 = r0.f34878r
            r1 = 2
            if (r0 == r1) goto L_0x001a
            goto L_0x0012
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.mo41672i():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0013 A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41673j() {
        /*
            r4 = this;
            com.google.android.material.floatingactionbutton.d r0 = r4.getImpl()
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f34882v
            int r1 = r1.getVisibility()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0015
            int r0 = r0.f34878r
            r1 = 2
            if (r0 != r1) goto L_0x001a
        L_0x0013:
            r2 = 1
            goto L_0x001a
        L_0x0015:
            int r0 = r0.f34878r
            if (r0 == r3) goto L_0x001a
            goto L_0x0013
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.mo41673j():boolean");
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo41740h();
    }

    /* renamed from: k */
    public final void mo41675k(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f34833n;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: l */
    public final void mo41676l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f34824e;
            if (colorStateList == null) {
                C5450a.m13598a(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f34825f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0407g.m1026c(colorForState, mode));
        }
    }

    /* renamed from: n */
    public final void mo41677n(C13910b.C13911a aVar, boolean z) {
        C14023a aVar2;
        boolean z2;
        boolean z3;
        AnimatorSet animatorSet;
        float f;
        float f2;
        C14026d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new C14023a(this, aVar);
        }
        boolean z4 = true;
        if (impl.f34882v.getVisibility() == 0 ? impl.f34878r == 1 : impl.f34878r != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            Animator animator = impl.f34872l;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.f34873m == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            FloatingActionButton floatingActionButton = impl.f34882v;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (!C6333d0.C6340g.m15076c(floatingActionButton) || impl.f34882v.isInEditMode()) {
                z4 = false;
            }
            if (z4) {
                if (impl.f34882v.getVisibility() != 0) {
                    FloatingActionButton floatingActionButton2 = impl.f34882v;
                    float f3 = BitmapDescriptorFactory.HUE_RED;
                    floatingActionButton2.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    FloatingActionButton floatingActionButton3 = impl.f34882v;
                    if (z3) {
                        f = 0.4f;
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    floatingActionButton3.setScaleY(f);
                    FloatingActionButton floatingActionButton4 = impl.f34882v;
                    if (z3) {
                        f2 = 0.4f;
                    } else {
                        f2 = BitmapDescriptorFactory.HUE_RED;
                    }
                    floatingActionButton4.setScaleX(f2);
                    if (z3) {
                        f3 = 0.4f;
                    }
                    impl.f34876p = f3;
                    Matrix matrix = impl.f34859A;
                    impl.mo41734a(f3, matrix);
                    impl.f34882v.setImageMatrix(matrix);
                }
                C13583g gVar = impl.f34873m;
                if (gVar != null) {
                    animatorSet = impl.mo41735b(gVar, 1.0f, 1.0f, 1.0f);
                } else {
                    animatorSet = impl.mo41736c(1.0f, 1.0f, 1.0f);
                }
                animatorSet.addListener(new C14025c(impl, z, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f34879s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            impl.f34882v.mo41851b(0, z);
            impl.f34882v.setAlpha(1.0f);
            impl.f34882v.setScaleY(1.0f);
            impl.f34882v.setScaleX(1.0f);
            impl.f34876p = 1.0f;
            Matrix matrix2 = impl.f34859A;
            impl.mo41734a(1.0f, matrix2);
            impl.f34882v.setImageMatrix(matrix2);
            if (aVar2 != null) {
                aVar2.f34843a.mo41041b();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14026d impl = getImpl();
        C19648g gVar = impl.f34862b;
        if (gVar != null) {
            C21100e.m49299B0(impl.f34882v, gVar);
        }
        if (!(impl instanceof C18360f)) {
            ViewTreeObserver viewTreeObserver = impl.f34882v.getViewTreeObserver();
            if (impl.f34860B == null) {
                impl.f34860B = new C18359e(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f34860B);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C14026d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f34882v.getViewTreeObserver();
        C18359e eVar = impl.f34860B;
        if (eVar != null) {
            viewTreeObserver.removeOnPreDrawListener(eVar);
            impl.f34860B = null;
        }
    }

    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f34830k = (sizeDimension - this.f34831l) / 2;
        getImpl().mo41749q();
        int min = Math.min(m34955m(sizeDimension, i), m34955m(sizeDimension, i2));
        Rect rect = this.f34833n;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        C7031c cVar = this.f34836q;
        Bundle orDefault = extendableSavedState.f35362b.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        Bundle bundle = orDefault;
        cVar.getClass();
        cVar.f21876a = bundle.getBoolean("expanded", false);
        cVar.f21877b = bundle.getInt("expandedComponentIdHint", 0);
        if (cVar.f21876a) {
            ViewParent parent = ((View) cVar.f21878c).getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).mo3268g((View) cVar.f21878c);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        C6313h<String, Bundle> hVar = extendableSavedState.f35362b;
        C7031c cVar = this.f34836q;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", cVar.f21876a);
        bundle.putInt("expandedComponentIdHint", cVar.f21877b);
        hVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f34834o;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15076c(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                mo41675k(rect);
                z = true;
            } else {
                z = false;
            }
            if (z && !this.f34834o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f34822c != colorStateList) {
            this.f34822c = colorStateList;
            C14026d impl = getImpl();
            C19648g gVar = impl.f34862b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            C18355b bVar = impl.f34864d;
            if (bVar != null) {
                if (colorStateList != null) {
                    bVar.f46803m = colorStateList.getColorForState(bVar.getState(), bVar.f46803m);
                }
                bVar.f46806p = colorStateList;
                bVar.f46804n = true;
                bVar.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f34823d != mode) {
            this.f34823d = mode;
            C19648g gVar = getImpl().f34862b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        C14026d impl = getImpl();
        if (impl.f34868h != f) {
            impl.f34868h = f;
            impl.mo41743k(f, impl.f34869i, impl.f34870j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C14026d impl = getImpl();
        if (impl.f34869i != f) {
            impl.f34869i = f;
            impl.mo41743k(impl.f34868h, f, impl.f34870j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C14026d impl = getImpl();
        if (impl.f34870j != f) {
            impl.f34870j = f;
            impl.mo41743k(impl.f34868h, impl.f34869i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f34829j) {
            this.f34829j = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C19648g gVar = getImpl().f34862b;
        if (gVar != null) {
            gVar.mo52003m(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f34866f) {
            getImpl().f34866f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f34836q.f21877b = i;
    }

    public void setHideMotionSpec(C13583g gVar) {
        getImpl().f34874n = gVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C13583g.m33997b(i, getContext()));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C14026d impl = getImpl();
            float f = impl.f34876p;
            impl.f34876p = f;
            Matrix matrix = impl.f34859A;
            impl.mo41734a(f, matrix);
            impl.f34882v.setImageMatrix(matrix);
            if (this.f34824e != null) {
                mo41676l();
            }
        }
    }

    public void setImageResource(int i) {
        this.f34835p.mo2139c(i);
        mo41676l();
    }

    public void setMaxImageSize(int i) {
        this.f34831l = i;
        C14026d impl = getImpl();
        if (impl.f34877q != i) {
            impl.f34877q = i;
            float f = impl.f34876p;
            impl.f34876p = f;
            Matrix matrix = impl.f34859A;
            impl.mo41734a(f, matrix);
            impl.f34882v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<C14026d.C14032f> arrayList = getImpl().f34881u;
        if (arrayList != null) {
            Iterator<C14026d.C14032f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo41726b();
            }
        }
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<C14026d.C14032f> arrayList = getImpl().f34881u;
        if (arrayList != null) {
            Iterator<C14026d.C14032f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo41726b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        C14026d impl = getImpl();
        impl.f34867g = z;
        impl.mo41749q();
    }

    public void setShapeAppearanceModel(C19654k kVar) {
        getImpl().mo41746n(kVar);
    }

    public void setShowMotionSpec(C13583g gVar) {
        getImpl().f34873m = gVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C13583g.m33997b(i, getContext()));
    }

    public void setSize(int i) {
        this.f34829j = 0;
        if (i != this.f34828i) {
            this.f34828i = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f34824e != colorStateList) {
            this.f34824e = colorStateList;
            mo41676l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f34825f != mode) {
            this.f34825f = mode;
            mo41676l();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo41744l();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo41744l();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo41744l();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f34832m != z) {
            this.f34832m = z;
            getImpl().mo41741i();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f34838a;

        /* renamed from: b */
        public boolean f34839b;

        public BaseBehavior() {
            this.f34839b = true;
        }

        /* renamed from: a */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            boolean z;
            if (view instanceof AppBarLayout) {
                mo41723c(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0752e) {
                    z = ((CoordinatorLayout.C0752e) layoutParams).f3269a instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    mo41724d(view, floatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo41722b(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0752e eVar = (CoordinatorLayout.C0752e) floatingActionButton.getLayoutParams();
            if (this.f34839b && eVar.f3274f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo41723c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!mo41722b(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f34838a == null) {
                this.f34838a = new Rect();
            }
            Rect rect = this.f34838a;
            C14050d.m35033a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo41671h((C13910b) null, false);
                return true;
            }
            floatingActionButton.mo41677n((C13910b.C13911a) null, false);
            return true;
        }

        /* renamed from: d */
        public final boolean mo41724d(View view, FloatingActionButton floatingActionButton) {
            if (!mo41722b(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0752e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo41671h((C13910b) null, false);
                return true;
            }
            floatingActionButton.mo41677n((C13910b.C13911a) null, false);
            return true;
        }

        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f34833n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void onAttachedToLayoutParams(CoordinatorLayout.C0752e eVar) {
            if (eVar.f3276h == 0) {
                eVar.f3276h = 80;
            }
        }

        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            boolean z;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList q = coordinatorLayout.mo3296q(floatingActionButton);
            int size = q.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) q.get(i4);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0752e) {
                        z = ((CoordinatorLayout.C0752e) layoutParams).f3269a instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z && mo41724d(view2, floatingActionButton)) {
                        break;
                    }
                } else if (mo41723c(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3309w(i, floatingActionButton);
            Rect rect = floatingActionButton.f34833n;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.C0752e eVar = (CoordinatorLayout.C0752e) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin) {
                i2 = rect.right;
            } else if (floatingActionButton.getLeft() <= eVar.leftMargin) {
                i2 = -rect.left;
            } else {
                i2 = 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                C6333d0.m15023k(i3, floatingActionButton);
            }
            if (i2 == 0) {
                return true;
            }
            C6333d0.m15022j(i2, floatingActionButton);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.FloatingActionButton_Behavior_Layout);
            this.f34839b = obtainStyledAttributes.getBoolean(C13411l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f34821s
            android.content.Context r11 = p883wc.C20289a.m47861a(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f34833n = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f34834o = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = p355ac.C13411l.FloatingActionButton
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r1 = p355ac.C13411l.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = p742qc.C19099c.m46247a(r11, r0, r1)
            r10.f34822c = r1
            int r1 = p355ac.C13411l.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C14083r.m35069e(r1, r3)
            r10.f34823d = r1
            int r1 = p355ac.C13411l.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = p742qc.C19099c.m46247a(r11, r0, r1)
            r10.f34826g = r1
            int r1 = p355ac.C13411l.FloatingActionButton_fabSize
            int r1 = r0.getInt(r1, r2)
            r10.f34828i = r1
            int r1 = p355ac.C13411l.FloatingActionButton_fabCustomSize
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f34829j = r1
            int r1 = p355ac.C13411l.FloatingActionButton_borderWidth
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f34827h = r1
            int r1 = p355ac.C13411l.FloatingActionButton_elevation
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = p355ac.C13411l.FloatingActionButton_hoveredFocusedTranslationZ
            float r3 = r0.getDimension(r3, r2)
            int r4 = p355ac.C13411l.FloatingActionButton_pressedTranslationZ
            float r2 = r0.getDimension(r4, r2)
            int r4 = p355ac.C13411l.FloatingActionButton_useCompatPadding
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f34832m = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = p355ac.C13403d.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = p355ac.C13411l.FloatingActionButton_maxImageSize
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.setMaxImageSize(r5)
            int r5 = p355ac.C13411l.FloatingActionButton_showMotionSpec
            bc.g r5 = p380bc.C13583g.m33996a(r11, r0, r5)
            int r8 = p355ac.C13411l.FloatingActionButton_hideMotionSpec
            bc.g r8 = p380bc.C13583g.m33996a(r11, r0, r8)
            tc.i r9 = p811tc.C19654k.f49886m
            tc.k$a r11 = p811tc.C19654k.m47125d(r11, r12, r13, r6, r9)
            tc.k r6 = new tc.k
            r6.<init>(r11)
            int r11 = p355ac.C13411l.FloatingActionButton_ensureMinTouchTargetSize
            boolean r11 = r0.getBoolean(r11, r7)
            int r7 = p355ac.C13411l.FloatingActionButton_android_enabled
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            androidx.appcompat.widget.j r0 = new androidx.appcompat.widget.j
            r0.<init>(r10)
            r10.f34835p = r0
            r0.mo2138b(r12, r13)
            x.c r12 = new x.c
            r12.<init>(r10)
            r10.f34836q = r12
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            r12.mo41746n(r6)
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            android.content.res.ColorStateList r13 = r10.f34822c
            android.graphics.PorterDuff$Mode r0 = r10.f34823d
            android.content.res.ColorStateList r6 = r10.f34826g
            int r7 = r10.f34827h
            r12.mo41739g(r13, r0, r6, r7)
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            r12.f34871k = r4
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            float r13 = r12.f34868h
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 == 0) goto L_0x00f6
            r12.f34868h = r1
            float r13 = r12.f34869i
            float r0 = r12.f34870j
            r12.mo41743k(r1, r13, r0)
        L_0x00f6:
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            float r13 = r12.f34869i
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 == 0) goto L_0x0109
            r12.f34869i = r3
            float r13 = r12.f34868h
            float r0 = r12.f34870j
            r12.mo41743k(r13, r3, r0)
        L_0x0109:
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            float r13 = r12.f34870j
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x011c
            r12.f34870j = r2
            float r13 = r12.f34868h
            float r0 = r12.f34869i
            r12.mo41743k(r13, r0, r2)
        L_0x011c:
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            r12.f34873m = r5
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            r12.f34874n = r8
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            r12.f34866f = r11
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f34826g != colorStateList) {
            this.f34826g = colorStateList;
            getImpl().mo41745m(this.f34826g);
        }
    }
}
