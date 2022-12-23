package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C14083r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p141k1.C5450a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6396v0;
import p355ac.C13400a;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13410k;
import p380bc.C13585i;
import p811tc.C19648g;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0749b {

    /* renamed from: C0 */
    public static final int f34297C0 = C13410k.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: A0 */
    public C13904a f34298A0;

    /* renamed from: B0 */
    public C13905b f34299B0;

    /* renamed from: S */
    public Integer f34300S;

    /* renamed from: T */
    public final int f34301T;

    /* renamed from: U */
    public final C19648g f34302U;

    /* renamed from: l0 */
    public Animator f34303l0;

    /* renamed from: m0 */
    public Animator f34304m0;

    /* renamed from: n0 */
    public int f34305n0;

    /* renamed from: o0 */
    public int f34306o0;

    /* renamed from: p0 */
    public boolean f34307p0;

    /* renamed from: q0 */
    public final boolean f34308q0;

    /* renamed from: r0 */
    public final boolean f34309r0;

    /* renamed from: s0 */
    public final boolean f34310s0;

    /* renamed from: t0 */
    public int f34311t0;

    /* renamed from: u0 */
    public boolean f34312u0;

    /* renamed from: v0 */
    public boolean f34313v0;

    /* renamed from: w0 */
    public Behavior f34314w0;

    /* renamed from: x0 */
    public int f34315x0;

    /* renamed from: y0 */
    public int f34316y0;

    /* renamed from: z0 */
    public int f34317z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C13903a();

        /* renamed from: b */
        public int f34323b;

        /* renamed from: c */
        public boolean f34324c;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        public class C13903a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Toolbar.SavedState savedState) {
            super((Parcelable) savedState);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f34323b);
            parcel.writeInt(this.f34324c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f34323b = parcel.readInt();
            this.f34324c = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C13904a extends AnimatorListenerAdapter {
        public C13904a() {
        }

        public final void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (!bottomAppBar.f34312u0) {
                bottomAppBar.mo41003B(bottomAppBar.f34305n0, bottomAppBar.f34313v0);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C13905b implements C13585i<FloatingActionButton> {
        public C13905b() {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    public class C13906c implements C14083r.C14085b {
        public C13906c() {
        }

        /* renamed from: a */
        public final C6396v0 mo41034a(View view, C6396v0 v0Var, C14083r.C14086c cVar) {
            boolean z;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f34308q0) {
                bottomAppBar.f34315x0 = v0Var.mo22503b();
            }
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            boolean z2 = true;
            boolean z3 = false;
            if (bottomAppBar2.f34309r0) {
                if (bottomAppBar2.f34317z0 != v0Var.mo22504c()) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar.this.f34317z0 = v0Var.mo22504c();
            } else {
                z = false;
            }
            BottomAppBar bottomAppBar3 = BottomAppBar.this;
            if (bottomAppBar3.f34310s0) {
                if (bottomAppBar3.f34316y0 == v0Var.mo22505d()) {
                    z2 = false;
                }
                BottomAppBar.this.f34316y0 = v0Var.mo22505d();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar bottomAppBar4 = BottomAppBar.this;
                Animator animator = bottomAppBar4.f34304m0;
                if (animator != null) {
                    animator.cancel();
                }
                Animator animator2 = bottomAppBar4.f34303l0;
                if (animator2 != null) {
                    animator2.cancel();
                }
                BottomAppBar.this.mo41005D();
                BottomAppBar.this.mo41004C();
            }
            return v0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    public class C13907d extends AnimatorListenerAdapter {
        public C13907d() {
        }

        public final void onAnimationEnd(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            int i = BottomAppBar.f34297C0;
            bottomAppBar.getClass();
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            bottomAppBar2.f34312u0 = false;
            bottomAppBar2.f34304m0 = null;
        }

        public final void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            int i = BottomAppBar.f34297C0;
            bottomAppBar.getClass();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    public class C13908e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f34329b;

        /* renamed from: c */
        public final /* synthetic */ int f34330c;

        /* renamed from: d */
        public final /* synthetic */ boolean f34331d;

        public C13908e(ActionMenuView actionMenuView, int i, boolean z) {
            this.f34329b = actionMenuView;
            this.f34330c = i;
            this.f34331d = z;
        }

        public final void run() {
            ActionMenuView actionMenuView = this.f34329b;
            actionMenuView.setTranslationX((float) BottomAppBar.this.mo41028z(actionMenuView, this.f34330c, this.f34331d));
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.bottomAppBarStyle);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f34315x0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return mo41002A(this.f34305n0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f34346e;
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f34317z0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f34316y0;
    }

    /* access modifiers changed from: private */
    public C13914e getTopEdgeTreatment() {
        return (C13914e) this.f34302U.f49837b.f49861a.f49895i;
    }

    /* renamed from: A */
    public final float mo41002A(int i) {
        int i2;
        boolean d = C14083r.m35068d(this);
        int i3 = 1;
        if (i != 1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (d) {
            i2 = this.f34317z0;
        } else {
            i2 = this.f34316y0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f34301T + i2);
        if (d) {
            i3 = -1;
        }
        return (float) (measuredWidth * i3);
    }

    /* renamed from: B */
    public final void mo41003B(int i, boolean z) {
        boolean z2;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (!C6333d0.C6340g.m15076c(this)) {
            this.f34312u0 = false;
            int i2 = this.f34311t0;
            if (i2 != 0) {
                this.f34311t0 = 0;
                getMenu().clear();
                mo1953k(i2);
                return;
            }
            return;
        }
        Animator animator = this.f34304m0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        FloatingActionButton x = mo41026x();
        if (x == null || !x.mo41673j()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            i = 0;
            z = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo41028z(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C13912c(this, actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                arrayList.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.f34304m0 = animatorSet2;
        animatorSet2.addListener(new C13907d());
        this.f34304m0.start();
    }

    /* renamed from: C */
    public final void mo41004C() {
        boolean z;
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f34304m0 == null) {
            actionMenuView.setAlpha(1.0f);
            FloatingActionButton x = mo41026x();
            if (x == null || !x.mo41673j()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                mo41007F(actionMenuView, 0, false, false);
            } else {
                mo41007F(actionMenuView, this.f34305n0, this.f34313v0, false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41005D() {
        /*
            r3 = this;
            com.google.android.material.bottomappbar.e r0 = r3.getTopEdgeTreatment()
            float r1 = r3.getFabTranslationX()
            r0.f34347f = r1
            android.view.View r0 = r3.mo41027y()
            tc.g r1 = r3.f34302U
            boolean r2 = r3.f34313v0
            if (r2 == 0) goto L_0x0028
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r3.mo41026x()
            if (r2 == 0) goto L_0x0022
            boolean r2 = r2.mo41673j()
            if (r2 == 0) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x0028
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            r1.mo52006o(r2)
            if (r0 == 0) goto L_0x003c
            float r1 = r3.getFabTranslationY()
            r0.setTranslationY(r1)
            float r1 = r3.getFabTranslationX()
            r0.setTranslationX(r1)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.mo41005D():void");
    }

    /* renamed from: E */
    public final void mo41006E(int i) {
        float f = (float) i;
        if (f != getTopEdgeTreatment().f34345d) {
            getTopEdgeTreatment().f34345d = f;
            this.f34302U.invalidateSelf();
        }
    }

    /* renamed from: F */
    public final void mo41007F(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        C13908e eVar = new C13908e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f34302U.f49837b.f49866f;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f34346e;
    }

    public int getFabAlignmentMode() {
        return this.f34305n0;
    }

    public int getFabAnimationMode() {
        return this.f34306o0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f34344c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f34343b;
    }

    public boolean getHideOnScroll() {
        return this.f34307p0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21100e.m49299B0(this, this.f34302U);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.f34304m0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f34303l0;
            if (animator2 != null) {
                animator2.cancel();
            }
            mo41005D();
        }
        mo41004C();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f34305n0 = savedState.f34323b;
        this.f34313v0 = savedState.f34324c;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState((Toolbar.SavedState) super.onSaveInstanceState());
        savedState.f34323b = this.f34305n0;
        savedState.f34324c = this.f34313v0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C5450a.C5452b.m13617h(this.f34302U, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            C13914e topEdgeTreatment = getTopEdgeTreatment();
            if (f >= BitmapDescriptorFactory.HUE_RED) {
                topEdgeTreatment.f34346e = f;
                this.f34302U.invalidateSelf();
                mo41005D();
                return;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    public void setElevation(float f) {
        this.f34302U.mo52003m(f);
        C19648g gVar = this.f34302U;
        int i = gVar.f49837b.f49877q - gVar.mo51998i();
        Behavior behavior = getBehavior();
        behavior.f34280c = i;
        if (behavior.f34279b == 1) {
            setTranslationY((float) (behavior.f34278a + i));
        }
    }

    public void setFabAlignmentMode(int i) {
        this.f34311t0 = 0;
        this.f34312u0 = true;
        mo41003B(i, this.f34313v0);
        if (this.f34305n0 != i) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15076c(this)) {
                Animator animator = this.f34303l0;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f34306o0 == 1) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo41026x(), "translationX", new float[]{mo41002A(i)});
                    ofFloat.setDuration(300);
                    arrayList.add(ofFloat);
                } else {
                    FloatingActionButton x = mo41026x();
                    if (x != null && !x.mo41672i()) {
                        x.mo41671h(new C13910b(this, i), true);
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.f34303l0 = animatorSet;
                animatorSet.addListener(new C13909a(this));
                this.f34303l0.start();
            }
        }
        this.f34305n0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f34306o0 = i;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().f34348g) {
            getTopEdgeTreatment().f34348g = f;
            this.f34302U.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().f34344c = f;
            this.f34302U.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f34343b = f;
            this.f34302U.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f34307p0 = z;
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f34300S == null)) {
            drawable = C5450a.m13604g(drawable.mutate());
            C5450a.C5452b.m13616g(drawable, this.f34300S.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f34300S = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: x */
    public final FloatingActionButton mo41026x() {
        View y = mo41027y();
        if (y instanceof FloatingActionButton) {
            return (FloatingActionButton) y;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo41027y() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            c1.a r2 = r0.f3247c
            java.lang.Object r2 = r2.f6159c
            s0.h r2 = (p241s0.C6313h) r2
            java.lang.Object r2 = r2.getOrDefault(r4, r1)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = r0.f3249e
            r3.clear()
            if (r2 == 0) goto L_0x0028
            java.util.ArrayList r3 = r0.f3249e
            r3.addAll(r2)
        L_0x0028:
            java.util.ArrayList r0 = r0.f3249e
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x0042
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x002e
        L_0x0042:
            return r2
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.mo41027y():android.view.View");
    }

    /* renamed from: z */
    public final int mo41028z(ActionMenuView actionMenuView, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        if (i != 1 || !z) {
            return 0;
        }
        boolean d = C14083r.m35068d(this);
        if (d) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt.getLayoutParams() instanceof Toolbar.LayoutParams) || (((Toolbar.LayoutParams) childAt.getLayoutParams()).f556a & 8388615) != 8388611) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (d) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (d) {
            i3 = actionMenuView.getRight();
        } else {
            i3 = actionMenuView.getLeft();
        }
        if (d) {
            i4 = this.f34316y0;
        } else {
            i4 = -this.f34317z0;
        }
        return i2 - (i3 + i4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f34297C0
            android.content.Context r11 = p883wc.C20289a.m47861a(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            tc.g r11 = new tc.g
            r11.<init>()
            r10.f34302U = r11
            r7 = 0
            r10.f34311t0 = r7
            r10.f34312u0 = r7
            r0 = 1
            r10.f34313v0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r10.f34298A0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r10.f34299B0 = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = p355ac.C13411l.BottomAppBar
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r1 = p355ac.C13411l.BottomAppBar_backgroundTint
            android.content.res.ColorStateList r1 = p742qc.C19099c.m46247a(r8, r0, r1)
            int r2 = p355ac.C13411l.BottomAppBar_navigationIconTint
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x004c
            r3 = -1
            int r2 = r0.getColor(r2, r3)
            r10.setNavigationIconTint(r2)
        L_0x004c:
            int r2 = p355ac.C13411l.BottomAppBar_elevation
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = p355ac.C13411l.BottomAppBar_fabCradleMargin
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = p355ac.C13411l.BottomAppBar_fabCradleRoundedCornerRadius
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = p355ac.C13411l.BottomAppBar_fabCradleVerticalOffset
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = p355ac.C13411l.BottomAppBar_fabAlignmentMode
            int r9 = r0.getInt(r9, r7)
            r10.f34305n0 = r9
            int r9 = p355ac.C13411l.BottomAppBar_fabAnimationMode
            int r9 = r0.getInt(r9, r7)
            r10.f34306o0 = r9
            int r9 = p355ac.C13411l.BottomAppBar_hideOnScroll
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f34307p0 = r9
            int r9 = p355ac.C13411l.BottomAppBar_paddingBottomSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f34308q0 = r9
            int r9 = p355ac.C13411l.BottomAppBar_paddingLeftSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f34309r0 = r9
            int r9 = p355ac.C13411l.BottomAppBar_paddingRightSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f34310s0 = r9
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r9 = p355ac.C13403d.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r9)
            r10.f34301T = r0
            com.google.android.material.bottomappbar.e r0 = new com.google.android.material.bottomappbar.e
            r0.<init>(r3, r4, r5)
            tc.k$a r3 = new tc.k$a
            r3.<init>()
            r3.f49907i = r0
            tc.k r0 = new tc.k
            r0.<init>(r3)
            r11.setShapeAppearanceModel(r0)
            r11.mo52010r()
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.mo52008p(r0)
            r11.mo52001k(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            p141k1.C5450a.C5452b.m13617h(r11, r1)
            java.util.WeakHashMap<android.view.View, s1.p0> r0 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15057q(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$c r11 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r11.<init>()
            android.content.Context r0 = r10.getContext()
            int[] r1 = p355ac.C13411l.Insets
            android.content.res.TypedArray r12 = r0.obtainStyledAttributes(r12, r1, r13, r6)
            int r13 = p355ac.C13411l.Insets_paddingBottomSystemWindowInsets
            boolean r13 = r12.getBoolean(r13, r7)
            int r0 = p355ac.C13411l.Insets_paddingLeftSystemWindowInsets
            boolean r0 = r12.getBoolean(r0, r7)
            int r1 = p355ac.C13411l.Insets_paddingRightSystemWindowInsets
            boolean r1 = r12.getBoolean(r1, r7)
            r12.recycle()
            com.google.android.material.internal.q r12 = new com.google.android.material.internal.q
            r12.<init>(r13, r0, r1, r11)
            com.google.android.material.internal.C14083r.m35065a(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public Behavior getBehavior() {
        if (this.f34314w0 == null) {
            this.f34314w0 = new Behavior();
        }
        return this.f34314w0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        public final Rect f34318e = new Rect();

        /* renamed from: f */
        public WeakReference<BottomAppBar> f34319f;

        /* renamed from: g */
        public int f34320g;

        /* renamed from: h */
        public final C13902a f34321h = new C13902a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class C13902a implements View.OnLayoutChangeListener {
            public C13902a() {
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.f34319f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Rect rect = Behavior.this.f34318e;
                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                floatingActionButton.mo41675k(rect);
                int height = Behavior.this.f34318e.height();
                bottomAppBar.mo41006E(height);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f49891e.mo51983a(new RectF(Behavior.this.f34318e)));
                CoordinatorLayout.C0752e eVar = (CoordinatorLayout.C0752e) view.getLayoutParams();
                if (Behavior.this.f34320g == 0) {
                    eVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C13403d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    eVar.leftMargin = bottomAppBar.getLeftInset();
                    eVar.rightMargin = bottomAppBar.getRightInset();
                    if (C14083r.m35068d(floatingActionButton)) {
                        eVar.leftMargin += bottomAppBar.f34301T;
                    } else {
                        eVar.rightMargin += bottomAppBar.f34301T;
                    }
                }
            }
        }

        public Behavior() {
        }

        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f34319f = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f34297C0;
            View y = bottomAppBar.mo41027y();
            if (y != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (!C6333d0.C6340g.m15076c(y)) {
                    CoordinatorLayout.C0752e eVar = (CoordinatorLayout.C0752e) y.getLayoutParams();
                    eVar.f3272d = 49;
                    this.f34320g = eVar.bottomMargin;
                    if (y instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) y;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(C13400a.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(C13400a.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f34321h);
                        floatingActionButton.mo41646d(bottomAppBar.f34298A0);
                        floatingActionButton.mo41648e(new C13913d(bottomAppBar));
                        floatingActionButton.mo41649f(bottomAppBar.f34299B0);
                    }
                    bottomAppBar.mo41005D();
                }
            }
            coordinatorLayout.mo3309w(i, bottomAppBar);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (!bottomAppBar.getHideOnScroll() || !super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view2, view3, i, i2)) {
                return false;
            }
            return true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
