package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0259p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.play.core.assetpacks.C14256d1;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6396v0;
import p355ac.C13401b;
import p355ac.C13405f;
import p355ac.C13407h;
import p457ec.C16804d;
import p457ec.C16805e;
import p457ec.C16806f;
import p811tc.C19648g;

/* renamed from: com.google.android.material.bottomsheet.b */
public final class C13924b extends C0259p {

    /* renamed from: p */
    public static final /* synthetic */ int f34418p = 0;

    /* renamed from: f */
    public BottomSheetBehavior<FrameLayout> f34419f;

    /* renamed from: g */
    public FrameLayout f34420g;

    /* renamed from: h */
    public CoordinatorLayout f34421h;

    /* renamed from: i */
    public FrameLayout f34422i;

    /* renamed from: j */
    public boolean f34423j;

    /* renamed from: k */
    public boolean f34424k;

    /* renamed from: l */
    public boolean f34425l;

    /* renamed from: m */
    public BottomSheetBehavior.C13920c f34426m;

    /* renamed from: n */
    public boolean f34427n;

    /* renamed from: o */
    public C13925a f34428o;

    /* renamed from: com.google.android.material.bottomsheet.b$a */
    public class C13925a extends BottomSheetBehavior.C13920c {
        public C13925a() {
        }

        public final void onSlide(View view, float f) {
        }

        public final void onStateChanged(View view, int i) {
            if (i == 5) {
                C13924b.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.b$b */
    public static class C13926b extends BottomSheetBehavior.C13920c {

        /* renamed from: b */
        public final boolean f34430b;

        /* renamed from: c */
        public final boolean f34431c;

        /* renamed from: d */
        public final C6396v0 f34432d;

        public C13926b(FrameLayout frameLayout, C6396v0 v0Var) {
            boolean z;
            ColorStateList colorStateList;
            this.f34432d = v0Var;
            if (Build.VERSION.SDK_INT < 23 || (frameLayout.getSystemUiVisibility() & 8192) == 0) {
                z = false;
            } else {
                z = true;
            }
            this.f34431c = z;
            C19648g gVar = BottomSheetBehavior.m34710e(frameLayout).f34384h;
            if (gVar != null) {
                colorStateList = gVar.f49837b.f49863c;
            } else {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                colorStateList = C6333d0.C6342i.m15090g(frameLayout);
            }
            if (colorStateList != null) {
                this.f34430b = C14256d1.m35489g(colorStateList.getDefaultColor());
            } else if (frameLayout.getBackground() instanceof ColorDrawable) {
                this.f34430b = C14256d1.m35489g(((ColorDrawable) frameLayout.getBackground()).getColor());
            } else {
                this.f34430b = z;
            }
        }

        /* renamed from: a */
        public final void mo41081a(View view) {
            int i;
            int i2;
            if (view.getTop() < this.f34432d.mo22506e()) {
                boolean z = this.f34430b;
                int i3 = C13924b.f34418p;
                if (Build.VERSION.SDK_INT >= 23) {
                    int systemUiVisibility = view.getSystemUiVisibility();
                    if (z) {
                        i2 = systemUiVisibility | 8192;
                    } else {
                        i2 = systemUiVisibility & -8193;
                    }
                    view.setSystemUiVisibility(i2);
                }
                view.setPadding(view.getPaddingLeft(), this.f34432d.mo22506e() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                boolean z2 = this.f34431c;
                int i4 = C13924b.f34418p;
                if (Build.VERSION.SDK_INT >= 23) {
                    int systemUiVisibility2 = view.getSystemUiVisibility();
                    if (z2) {
                        i = systemUiVisibility2 | 8192;
                    } else {
                        i = systemUiVisibility2 & -8193;
                    }
                    view.setSystemUiVisibility(i);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void onLayout(View view) {
            mo41081a(view);
        }

        public final void onSlide(View view, float f) {
            mo41081a(view);
        }

        public final void onStateChanged(View view, int i) {
            mo41081a(view);
        }
    }

    public C13924b(Context context) {
        this(context, 0);
        this.f34427n = getContext().getTheme().obtainStyledAttributes(new int[]{C13401b.enableEdgeToEdge}).getBoolean(0, false);
    }

    public final void cancel() {
        if (this.f34419f == null) {
            mo41076e();
        }
        super.cancel();
    }

    /* renamed from: e */
    public final void mo41076e() {
        if (this.f34420g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C13407h.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f34420g = frameLayout;
            this.f34421h = (CoordinatorLayout) frameLayout.findViewById(C13405f.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f34420g.findViewById(C13405f.design_bottom_sheet);
            this.f34422i = frameLayout2;
            BottomSheetBehavior<FrameLayout> e = BottomSheetBehavior.m34710e(frameLayout2);
            this.f34419f = e;
            e.mo41052a(this.f34428o);
            this.f34419f.setHideable(this.f34423j);
        }
    }

    /* renamed from: f */
    public final FrameLayout mo41077f(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo41076e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f34420g.findViewById(C13405f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.f34427n) {
            FrameLayout frameLayout = this.f34422i;
            C13923a aVar = new C13923a(this);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15104u(frameLayout, aVar);
        }
        this.f34422i.removeAllViews();
        if (layoutParams == null) {
            this.f34422i.addView(view);
        } else {
            this.f34422i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C13405f.touch_outside).setOnClickListener(new C16804d(this));
        C6333d0.m15029q(this.f34422i, new C16805e(this));
        this.f34422i.setOnTouchListener(new C16806f());
        return this.f34420g;
    }

    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (!this.f34427n || Color.alpha(window.getNavigationBarColor()) >= 255) {
                z = false;
            } else {
                z = true;
            }
            FrameLayout frameLayout = this.f34420g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f34421h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f34419f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f34359J == 5) {
            bottomSheetBehavior.setState(4);
        }
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f34423j != z) {
            this.f34423j = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f34419f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f34423j) {
            this.f34423j = true;
        }
        this.f34424k = z;
        this.f34425l = true;
    }

    public final void setContentView(int i) {
        super.setContentView((View) mo41077f((View) null, i, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view) {
        super.setContentView((View) mo41077f(view, 0, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView((View) mo41077f(view, 0, layoutParams));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13924b(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x0019
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = p355ac.C13401b.bottomSheetDialogTheme
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0017
            int r5 = r5.resourceId
            goto L_0x0019
        L_0x0017:
            int r5 = p355ac.C13410k.Theme_Design_Light_BottomSheetDialog
        L_0x0019:
            r3.<init>(r4, r5)
            r3.f34423j = r0
            r3.f34424k = r0
            com.google.android.material.bottomsheet.b$a r4 = new com.google.android.material.bottomsheet.b$a
            r4.<init>()
            r3.f34428o = r4
            androidx.appcompat.app.j r4 = r3.mo959c()
            r4.mo887v(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            int r0 = p355ac.C13401b.enableEdgeToEdge
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.f34427n = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.C13924b.<init>(android.content.Context, int):void");
    }
}
