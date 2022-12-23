package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C14077m;
import com.google.android.material.internal.C14083r;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C14132i;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.assetpacks.C14256d1;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p141k1.C5450a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13407h;
import p355ac.C13411l;
import p380bc.C13577a;
import p742qc.C19099c;
import p835uc.C19878a;
import p835uc.C19880c;
import p835uc.C19881d;
import p835uc.C19882e;
import p835uc.C19884g;
import p883wc.C20289a;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: o */
    public static final Handler f35306o = new Handler(Looper.getMainLooper(), new C14116a());

    /* renamed from: p */
    public static final int[] f35307p = {C13401b.snackbarStyle};

    /* renamed from: a */
    public final ViewGroup f35308a;

    /* renamed from: b */
    public final Context f35309b;

    /* renamed from: c */
    public final C14121f f35310c;

    /* renamed from: d */
    public final C19884g f35311d;

    /* renamed from: e */
    public int f35312e;

    /* renamed from: f */
    public final C14117b f35313f = new C14117b();

    /* renamed from: g */
    public int f35314g;

    /* renamed from: h */
    public int f35315h;

    /* renamed from: i */
    public int f35316i;

    /* renamed from: j */
    public int f35317j;

    /* renamed from: k */
    public boolean f35318k;

    /* renamed from: l */
    public ArrayList f35319l;

    /* renamed from: m */
    public final AccessibilityManager f35320m;

    /* renamed from: n */
    public C14118c f35321n = new C14118c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i */
        public final C14120e f35322i = new C14120e(this);

        /* renamed from: a */
        public final boolean mo41000a(View view) {
            this.f35322i.getClass();
            return view instanceof C14121f;
        }

        public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C14120e eVar = this.f35322i;
            eVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C14132i b = C14132i.m35170b();
                    C14118c cVar = eVar.f35325a;
                    synchronized (b.f35354a) {
                        if (b.mo42276c(cVar)) {
                            C14132i.C14135c cVar2 = b.f35356c;
                            if (cVar2.f35361c) {
                                cVar2.f35361c = false;
                                b.mo42277d(cVar2);
                            }
                        }
                    }
                }
            } else if (coordinatorLayout.mo3306u(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C14132i b2 = C14132i.m35170b();
                C14118c cVar3 = eVar.f35325a;
                synchronized (b2.f35354a) {
                    if (b2.mo42276c(cVar3)) {
                        C14132i.C14135c cVar4 = b2.f35356c;
                        if (!cVar4.f35361c) {
                            cVar4.f35361c = true;
                            b2.f35355b.removeCallbacksAndMessages(cVar4);
                        }
                    }
                }
            }
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public class C14116a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            boolean z;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i = message.what;
            if (i == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                if (baseTransientBottomBar.f35310c.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f35310c.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0752e) {
                        CoordinatorLayout.C0752e eVar = (CoordinatorLayout.C0752e) layoutParams;
                        Behavior behavior = new Behavior();
                        C14120e eVar2 = behavior.f35322i;
                        eVar2.getClass();
                        eVar2.f35325a = baseTransientBottomBar.f35321n;
                        behavior.f34283b = new C14129f(baseTransientBottomBar);
                        eVar.mo3351b(behavior);
                        eVar.f3275g = 80;
                    }
                    C14121f fVar = baseTransientBottomBar.f35310c;
                    ViewGroup viewGroup = baseTransientBottomBar.f35308a;
                    fVar.f35336k = true;
                    viewGroup.addView(fVar);
                    fVar.f35336k = false;
                    baseTransientBottomBar.mo42232i();
                    baseTransientBottomBar.f35310c.setVisibility(4);
                }
                C14121f fVar2 = baseTransientBottomBar.f35310c;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6340g.m15076c(fVar2)) {
                    baseTransientBottomBar.mo42231h();
                } else {
                    baseTransientBottomBar.f35318k = true;
                }
                return true;
            } else if (i != 1) {
                return false;
            } else {
                BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                int i2 = message.arg1;
                AccessibilityManager accessibilityManager = baseTransientBottomBar2.f35320m;
                if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z || baseTransientBottomBar2.f35310c.getVisibility() != 0) {
                    baseTransientBottomBar2.mo42229f(i2);
                } else if (baseTransientBottomBar2.f35310c.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
                    ofFloat.setInterpolator(C13577a.f33537a);
                    ofFloat.addUpdateListener(new C14124a(baseTransientBottomBar2));
                    ofFloat.setDuration(75);
                    ofFloat.addListener(new C19878a(baseTransientBottomBar2, i2));
                    ofFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int[] iArr = new int[2];
                    iArr[0] = 0;
                    int height = baseTransientBottomBar2.f35310c.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = baseTransientBottomBar2.f35310c.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    iArr[1] = height;
                    valueAnimator.setIntValues(iArr);
                    valueAnimator.setInterpolator(C13577a.f33538b);
                    valueAnimator.setDuration(250);
                    valueAnimator.addListener(new C19880c(baseTransientBottomBar2, i2));
                    valueAnimator.addUpdateListener(new C14127d(baseTransientBottomBar2));
                    valueAnimator.start();
                }
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public class C14117b implements Runnable {
        public C14117b() {
        }

        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f35310c != null && (context = baseTransientBottomBar.f35309b) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i = displayMetrics.heightPixels;
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                int[] iArr = new int[2];
                baseTransientBottomBar2.f35310c.getLocationOnScreen(iArr);
                int height = (i - (baseTransientBottomBar2.f35310c.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.f35310c.getTranslationY());
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                if (height < baseTransientBottomBar3.f35317j) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.f35310c.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Handler handler = BaseTransientBottomBar.f35306o;
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i2 = marginLayoutParams.bottomMargin;
                    BaseTransientBottomBar baseTransientBottomBar4 = BaseTransientBottomBar.this;
                    marginLayoutParams.bottomMargin = (baseTransientBottomBar4.f35317j - height) + i2;
                    baseTransientBottomBar4.f35310c.requestLayout();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C14118c implements C14132i.C14134b {
        public C14118c() {
        }

        /* renamed from: a */
        public final void mo42235a(int i) {
            Handler handler = BaseTransientBottomBar.f35306o;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        public final void show() {
            Handler handler = BaseTransientBottomBar.f35306o;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public static abstract class C14119d<B> {
        /* renamed from: a */
        public void mo39496a(int i, Object obj) {
        }

        /* renamed from: b */
        public void mo42237b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    public static class C14120e {

        /* renamed from: a */
        public C14118c f35325a;

        public C14120e(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f34287f = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 0.1f), 1.0f);
            swipeDismissBehavior.f34288g = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 0.6f), 1.0f);
            swipeDismissBehavior.f34285d = 0;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    public static class C14121f extends FrameLayout {

        /* renamed from: l */
        public static final C14122a f35326l = new C14122a();

        /* renamed from: b */
        public BaseTransientBottomBar<?> f35327b;

        /* renamed from: c */
        public int f35328c;

        /* renamed from: d */
        public final float f35329d;

        /* renamed from: e */
        public final float f35330e;

        /* renamed from: f */
        public final int f35331f;

        /* renamed from: g */
        public final int f35332g;

        /* renamed from: h */
        public ColorStateList f35333h;

        /* renamed from: i */
        public PorterDuff.Mode f35334i;

        /* renamed from: j */
        public Rect f35335j;

        /* renamed from: k */
        public boolean f35336k;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f$a */
        public class C14122a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public C14121f(Context context, AttributeSet attributeSet) {
            super(C20289a.m47861a(context, attributeSet, 0, 0), attributeSet);
            Drawable drawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C13411l.SnackbarLayout);
            int i = C13411l.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i)) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6342i.m15102s(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f35328c = obtainStyledAttributes.getInt(C13411l.SnackbarLayout_animationMode, 0);
            this.f35329d = obtainStyledAttributes.getFloat(C13411l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(C19099c.m46247a(context2, obtainStyledAttributes, C13411l.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C14083r.m35069e(obtainStyledAttributes.getInt(C13411l.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f35330e = obtainStyledAttributes.getFloat(C13411l.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f35331f = obtainStyledAttributes.getDimensionPixelSize(C13411l.SnackbarLayout_android_maxWidth, -1);
            this.f35332g = obtainStyledAttributes.getDimensionPixelSize(C13411l.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f35326l);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(C13403d.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(C14256d1.m35491i(getBackgroundOverlayColorAlpha(), C14256d1.m35485c(C13401b.colorSurface, this), C14256d1.m35485c(C13401b.colorOnSurface, this)));
                if (this.f35333h != null) {
                    drawable = C5450a.m13604g(gradientDrawable);
                    C5450a.C5452b.m13617h(drawable, this.f35333h);
                } else {
                    drawable = C5450a.m13604g(gradientDrawable);
                }
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                C6333d0.C6337d.m15057q(this, drawable);
            }
        }

        /* access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f35327b = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f35330e;
        }

        public int getAnimationMode() {
            return this.f35328c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f35329d;
        }

        public int getMaxInlineActionWidth() {
            return this.f35332g;
        }

        public int getMaxWidth() {
            return this.f35331f;
        }

        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f35327b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.mo42228e();
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6341h.m15083c(this);
        }

        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f35327b;
            if (baseTransientBottomBar != null && baseTransientBottomBar.mo42227d()) {
                BaseTransientBottomBar.f35306o.post(new C14128e(baseTransientBottomBar));
            }
        }

        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f35327b;
            if (baseTransientBottomBar != null && baseTransientBottomBar.f35318k) {
                baseTransientBottomBar.mo42231h();
                baseTransientBottomBar.f35318k = false;
            }
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (this.f35331f > 0 && getMeasuredWidth() > (i3 = this.f35331f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setAnimationMode(int i) {
            this.f35328c = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f35333h == null)) {
                drawable = C5450a.m13604g(drawable.mutate());
                C5450a.C5452b.m13617h(drawable, this.f35333h);
                C5450a.C5452b.m13618i(drawable, this.f35334i);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f35333h = colorStateList;
            if (getBackground() != null) {
                Drawable g = C5450a.m13604g(getBackground().mutate());
                C5450a.C5452b.m13617h(g, colorStateList);
                C5450a.C5452b.m13618i(g, this.f35334i);
                if (g != getBackground()) {
                    super.setBackgroundDrawable(g);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f35334i = mode;
            if (getBackground() != null) {
                Drawable g = C5450a.m13604g(getBackground().mutate());
                C5450a.C5452b.m13618i(g, mode);
                if (g != getBackground()) {
                    super.setBackgroundDrawable(g);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f35336k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f35335j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f35327b;
                if (baseTransientBottomBar != null) {
                    Handler handler = BaseTransientBottomBar.f35306o;
                    baseTransientBottomBar.mo42232i();
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            C14122a aVar;
            if (onClickListener != null) {
                aVar = null;
            } else {
                aVar = f35326l;
            }
            setOnTouchListener(aVar);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        boolean z;
        int i;
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (snackbarContentLayout2 != null) {
            this.f35308a = viewGroup;
            this.f35311d = snackbarContentLayout2;
            this.f35309b = context;
            C14077m.m35059c(context, C14077m.f35105a, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f35307p);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = C13407h.mtrl_layout_snackbar;
            } else {
                i = C13407h.design_layout_snackbar;
            }
            C14121f fVar = (C14121f) from.inflate(i, viewGroup, false);
            this.f35310c = fVar;
            fVar.setBaseTransientBottomBar(this);
            float actionTextColorAlpha = fVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f35342c.setTextColor(C14256d1.m35491i(actionTextColorAlpha, C14256d1.m35485c(C13401b.colorSurface, snackbarContentLayout), snackbarContentLayout.f35342c.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(fVar.getMaxInlineActionWidth());
            fVar.addView(snackbarContentLayout);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6340g.m15079f(fVar, 1);
            C6333d0.C6337d.m15059s(fVar, 1);
            fVar.setFitsSystemWindows(true);
            C6333d0.C6342i.m15104u(fVar, new C19881d(this));
            C6333d0.m15029q(fVar, new C19882e(this));
            this.f35320m = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: a */
    public final void mo42224a(Snackbar.C14123a aVar) {
        if (aVar != null) {
            if (this.f35319l == null) {
                this.f35319l = new ArrayList();
            }
            this.f35319l.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo42225b() {
        mo42226c(3);
    }

    /* renamed from: c */
    public final void mo42226c(int i) {
        boolean z;
        C14132i b = C14132i.m35170b();
        C14118c cVar = this.f35321n;
        synchronized (b.f35354a) {
            if (b.mo42276c(cVar)) {
                b.mo42275a(b.f35356c, i);
            } else {
                C14132i.C14135c cVar2 = b.f35357d;
                boolean z2 = false;
                if (cVar2 != null) {
                    if (cVar == null || cVar2.f35359a.get() != cVar) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    b.mo42275a(b.f35357d, i);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r0 == false) goto L_0x002a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42227d() {
        /*
            r6 = this;
            com.google.android.material.snackbar.i r0 = com.google.android.material.snackbar.C14132i.m35170b()
            com.google.android.material.snackbar.BaseTransientBottomBar$c r1 = r6.f35321n
            java.lang.Object r2 = r0.f35354a
            monitor-enter(r2)
            boolean r3 = r0.mo42276c(r1)     // Catch:{ all -> 0x002e }
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0029
            com.google.android.material.snackbar.i$c r0 = r0.f35357d     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0026
            if (r1 == 0) goto L_0x0021
            java.lang.ref.WeakReference<com.google.android.material.snackbar.i$b> r0 = r0.f35359a     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x002e }
            if (r0 != r1) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r4 = 1
        L_0x002a:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            return r4
        L_0x002c:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x002e:
            r0 = move-exception
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.mo42227d():boolean");
    }

    /* renamed from: e */
    public final void mo42228e() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f35310c.getRootWindowInsets()) != null) {
            this.f35317j = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            mo42232i();
        }
    }

    /* renamed from: f */
    public final void mo42229f(int i) {
        C14132i b = C14132i.m35170b();
        C14118c cVar = this.f35321n;
        synchronized (b.f35354a) {
            try {
                if (b.mo42276c(cVar)) {
                    b.f35356c = null;
                    C14132i.C14135c cVar2 = b.f35357d;
                    if (!(cVar2 == null || cVar2 == null)) {
                        b.f35356c = cVar2;
                        b.f35357d = null;
                        C14132i.C14134b bVar = cVar2.f35359a.get();
                        if (bVar != null) {
                            bVar.show();
                        } else {
                            b.f35356c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ArrayList arrayList = this.f35319l;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C14119d) this.f35319l.get(size)).mo39496a(i, this);
            }
        }
        ViewParent parent = this.f35310c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f35310c);
        }
    }

    /* renamed from: g */
    public final void mo42230g() {
        C14132i b = C14132i.m35170b();
        C14118c cVar = this.f35321n;
        synchronized (b.f35354a) {
            if (b.mo42276c(cVar)) {
                b.mo42277d(b.f35356c);
            }
        }
        ArrayList arrayList = this.f35319l;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C14119d) this.f35319l.get(size)).mo42237b(this);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo42231h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f35320m;
        boolean z = true;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        if (z) {
            this.f35310c.post(new C14130g(this));
            return;
        }
        if (this.f35310c.getParent() != null) {
            this.f35310c.setVisibility(0);
        }
        mo42230g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r0 != false) goto L_0x005f;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42232i() {
        /*
            r5 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$f r0 = r5.f35310c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x006f
            com.google.android.material.snackbar.BaseTransientBottomBar$f r1 = r5.f35310c
            android.graphics.Rect r2 = r1.f35335j
            if (r2 != 0) goto L_0x0011
            goto L_0x006f
        L_0x0011:
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L_0x0018
            return
        L_0x0018:
            int r1 = r5.f35314g
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            com.google.android.material.snackbar.BaseTransientBottomBar$f r2 = r5.f35310c
            android.graphics.Rect r3 = r2.f35335j
            int r4 = r3.bottom
            int r4 = r4 + r1
            r0.bottomMargin = r4
            int r1 = r3.left
            int r4 = r5.f35315h
            int r1 = r1 + r4
            r0.leftMargin = r1
            int r1 = r3.right
            int r4 = r5.f35316i
            int r1 = r1 + r4
            r0.rightMargin = r1
            int r1 = r3.top
            r0.topMargin = r1
            r2.requestLayout()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x006f
            int r0 = r5.f35317j
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x005e
            com.google.android.material.snackbar.BaseTransientBottomBar$f r0 = r5.f35310c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r3 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0752e
            if (r3 == 0) goto L_0x005a
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0752e) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.f3269a
            boolean r0 = r0 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r0 == 0) goto L_0x005a
            r0 = 1
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r0 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x006f
            com.google.android.material.snackbar.BaseTransientBottomBar$f r0 = r5.f35310c
            com.google.android.material.snackbar.BaseTransientBottomBar$b r1 = r5.f35313f
            r0.removeCallbacks(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$f r0 = r5.f35310c
            com.google.android.material.snackbar.BaseTransientBottomBar$b r1 = r5.f35313f
            r0.post(r1)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.mo42232i():void");
    }
}
