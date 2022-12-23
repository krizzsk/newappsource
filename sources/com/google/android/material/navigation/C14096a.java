package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.C0302k;
import androidx.appcompat.widget.C0432l1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.badge.C13897a;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p141k1.C5450a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6411x;
import p255t1.C6531g;
import p355ac.C13403d;
import p355ac.C13404e;
import p355ac.C13405f;
import p355ac.C13409j;
import p380bc.C13577a;

/* renamed from: com.google.android.material.navigation.a */
public abstract class C14096a extends FrameLayout implements C0302k.C0303a {

    /* renamed from: D */
    public static final int[] f35149D = {16842912};

    /* renamed from: E */
    public static final C14099c f35150E = new C14099c();

    /* renamed from: F */
    public static final C14100d f35151F = new C14100d();

    /* renamed from: A */
    public boolean f35152A = false;

    /* renamed from: B */
    public int f35153B = 0;

    /* renamed from: C */
    public C13897a f35154C;

    /* renamed from: b */
    public boolean f35155b = false;

    /* renamed from: c */
    public int f35156c;

    /* renamed from: d */
    public int f35157d;

    /* renamed from: e */
    public float f35158e;

    /* renamed from: f */
    public float f35159f;

    /* renamed from: g */
    public float f35160g;

    /* renamed from: h */
    public int f35161h;

    /* renamed from: i */
    public boolean f35162i;

    /* renamed from: j */
    public final FrameLayout f35163j;

    /* renamed from: k */
    public final View f35164k;

    /* renamed from: l */
    public final ImageView f35165l;

    /* renamed from: m */
    public final ViewGroup f35166m;

    /* renamed from: n */
    public final TextView f35167n;

    /* renamed from: o */
    public final TextView f35168o;

    /* renamed from: p */
    public int f35169p = -1;

    /* renamed from: q */
    public C0295h f35170q;

    /* renamed from: r */
    public ColorStateList f35171r;

    /* renamed from: s */
    public Drawable f35172s;

    /* renamed from: t */
    public Drawable f35173t;

    /* renamed from: u */
    public ValueAnimator f35174u;

    /* renamed from: v */
    public C14099c f35175v = f35150E;

    /* renamed from: w */
    public float f35176w = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: x */
    public boolean f35177x = false;

    /* renamed from: y */
    public int f35178y = 0;

    /* renamed from: z */
    public int f35179z = 0;

    /* renamed from: com.google.android.material.navigation.a$a */
    public class C14097a implements View.OnLayoutChangeListener {
        public C14097a() {
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z;
            if (C14096a.this.f35165l.getVisibility() == 0) {
                C14096a aVar = C14096a.this;
                ImageView imageView = aVar.f35165l;
                C13897a aVar2 = aVar.f35154C;
                if (aVar2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar2.setBounds(rect);
                    aVar2.mo40989g(imageView, (FrameLayout) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.a$b */
    public class C14098b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f35181b;

        public C14098b(int i) {
            this.f35181b = i;
        }

        public final void run() {
            C14096a.this.mo41998g(this.f35181b);
        }
    }

    /* renamed from: com.google.android.material.navigation.a$c */
    public static class C14099c {
        /* renamed from: a */
        public float mo42036a(float f, float f2) {
            return 1.0f;
        }
    }

    /* renamed from: com.google.android.material.navigation.a$d */
    public static class C14100d extends C14099c {
        /* renamed from: a */
        public final float mo42036a(float f, float f2) {
            LinearInterpolator linearInterpolator = C13577a.f33537a;
            return (f * 0.6f) + 0.4f;
        }
    }

    public C14096a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.f35163j = (FrameLayout) findViewById(C13405f.navigation_bar_item_icon_container);
        this.f35164k = findViewById(C13405f.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(C13405f.navigation_bar_item_icon_view);
        this.f35165l = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C13405f.navigation_bar_item_labels_group);
        this.f35166m = viewGroup;
        TextView textView = (TextView) findViewById(C13405f.navigation_bar_item_small_label_view);
        this.f35167n = textView;
        TextView textView2 = (TextView) findViewById(C13405f.navigation_bar_item_large_label_view);
        this.f35168o = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f35156c = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f35157d = viewGroup.getPaddingBottom();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15059s(textView, 2);
        C6333d0.C6337d.m15059s(textView2, 2);
        setFocusable(true);
        mo41996a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C14097a());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m35091d(android.widget.TextView r4, int r5) {
        /*
            androidx.core.widget.C0801k.m2424f(r4, r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto L_0x000c
        L_0x000a:
            r5 = 0
            goto L_0x005b
        L_0x000c:
            int[] r2 = p355ac.C13411l.TextAppearance
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            int r3 = p355ac.C13411l.TextAppearance_android_textSize
            boolean r3 = r5.getValue(r3, r2)
            r5.recycle()
            if (r3 != 0) goto L_0x0023
            goto L_0x000a
        L_0x0023:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r5 < r3) goto L_0x002e
            int r5 = r2.getComplexUnit()
            goto L_0x0033
        L_0x002e:
            int r5 = r2.data
            int r5 = r5 >> r1
            r5 = r5 & 15
        L_0x0033:
            r3 = 2
            if (r5 != r3) goto L_0x004d
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L_0x005b
        L_0x004d:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L_0x005b:
            if (r5 == 0) goto L_0x0061
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.C14096a.m35091d(android.widget.TextView, int):void");
    }

    /* renamed from: e */
    public static void m35092e(float f, float f2, int i, TextView textView) {
        textView.setScaleX(f);
        textView.setScaleY(f2);
        textView.setVisibility(i);
    }

    /* renamed from: f */
    public static void m35093f(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f35163j;
        return frameLayout != null ? frameLayout : this.f35165l;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C14096a) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        int i;
        C13897a aVar = this.f35154C;
        if (aVar != null) {
            i = aVar.getMinimumHeight() / 2;
        } else {
            i = 0;
        }
        return this.f35165l.getMeasuredWidth() + Math.max(i, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + i;
    }

    private int getSuggestedIconWidth() {
        int i;
        C13897a aVar = this.f35154C;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.getMinimumWidth() - this.f35154C.f34269f.f34241b.f34257n.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int max = Math.max(i, layoutParams.leftMargin);
        return Math.max(i, layoutParams.rightMargin) + this.f35165l.getMeasuredWidth() + max;
    }

    /* renamed from: h */
    public static void m35094h(int i, ViewGroup viewGroup) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i);
    }

    /* renamed from: a */
    public final void mo41996a(float f, float f2) {
        this.f35158e = f - f2;
        this.f35159f = (f2 * 1.0f) / f;
        this.f35160g = (f * 1.0f) / f2;
    }

    /* renamed from: b */
    public final void mo41997b(float f, float f2) {
        float f3;
        float f4;
        View view = this.f35164k;
        if (view != null) {
            C14099c cVar = this.f35175v;
            cVar.getClass();
            LinearInterpolator linearInterpolator = C13577a.f33537a;
            view.setScaleX((0.6f * f) + 0.4f);
            view.setScaleY(cVar.mo42036a(f, f2));
            int i = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if (i == 0) {
                f3 = 0.8f;
            } else {
                f3 = BitmapDescriptorFactory.HUE_RED;
            }
            if (i == 0) {
                f4 = 1.0f;
            } else {
                f4 = 0.2f;
            }
            view.setAlpha(C13577a.m33993a(BitmapDescriptorFactory.HUE_RED, 1.0f, f3, f4, f));
        }
        this.f35176w = f;
    }

    /* renamed from: c */
    public final void mo1009c(C0295h hVar) {
        CharSequence charSequence;
        int i;
        this.f35170q = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.f956e);
        setId(hVar.f952a);
        if (!TextUtils.isEmpty(hVar.f968q)) {
            setContentDescription(hVar.f968q);
        }
        if (!TextUtils.isEmpty(hVar.f969r)) {
            charSequence = hVar.f969r;
        } else {
            charSequence = hVar.f956e;
        }
        if (Build.VERSION.SDK_INT > 23) {
            C0432l1.m1181a(this, charSequence);
        }
        if (hVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        this.f35155b = true;
    }

    /* renamed from: g */
    public final void mo41998g(int i) {
        boolean z;
        int i2;
        if (this.f35164k != null) {
            int min = Math.min(this.f35178y, i - (this.f35153B * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35164k.getLayoutParams();
            if (!this.f35152A || this.f35161h != 2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i2 = min;
            } else {
                i2 = this.f35179z;
            }
            layoutParams.height = i2;
            layoutParams.width = min;
            this.f35164k.setLayoutParams(layoutParams);
        }
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f35164k;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C13897a getBadge() {
        return this.f35154C;
    }

    public int getItemBackgroundResId() {
        return C13404e.mtrl_navigation_bar_item_background;
    }

    public C0295h getItemData() {
        return this.f35170q;
    }

    public int getItemDefaultMarginResId() {
        return C13403d.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f35169p;
    }

    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35166m.getLayoutParams();
        return this.f35166m.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35166m.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.f35166m.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0295h hVar = this.f35170q;
        if (hVar != null && hVar.isCheckable() && this.f35170q.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f35149D);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C13897a aVar = this.f35154C;
        if (aVar != null && aVar.isVisible()) {
            C0295h hVar = this.f35170q;
            CharSequence charSequence = hVar.f956e;
            if (!TextUtils.isEmpty(hVar.f968q)) {
                charSequence = this.f35170q.f968q;
            }
            accessibilityNodeInfo.setContentDescription(charSequence + ", " + this.f35154C.mo40984c());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C6531g.C6534c.m15467a(0, 1, getItemVisiblePosition(), 1, isSelected()).f20353a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C6531g.C6532a.f20339g.f20348a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(C13409j.item_view_role_description));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C14098b(i));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f35164k;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        this.f35177x = z;
        View view = this.f35164k;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f35179z = i;
        mo41998g(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f35153B = i;
        mo41998g(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f35152A = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f35178y = i;
        mo41998g(getWidth());
    }

    public void setBadge(C13897a aVar) {
        boolean z;
        ImageView imageView;
        boolean z2;
        C13897a aVar2 = this.f35154C;
        if (aVar2 != aVar) {
            boolean z3 = true;
            if (aVar2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (imageView = this.f35165l) != null) {
                if (aVar2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    setClipChildren(true);
                    setClipToPadding(true);
                    C13897a aVar3 = this.f35154C;
                    if (aVar3 != null) {
                        if (aVar3.mo40985d() != null) {
                            aVar3.mo40985d().setForeground((Drawable) null);
                        } else {
                            imageView.getOverlay().remove(aVar3);
                        }
                    }
                    this.f35154C = null;
                }
            }
            this.f35154C = aVar;
            ImageView imageView2 = this.f35165l;
            if (imageView2 != null) {
                if (aVar == null) {
                    z3 = false;
                }
                if (z3) {
                    setClipChildren(false);
                    setClipToPadding(false);
                    C13897a aVar4 = this.f35154C;
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    aVar4.setBounds(rect);
                    aVar4.mo40989g(imageView2, (FrameLayout) null);
                    if (aVar4.mo40985d() != null) {
                        aVar4.mo40985d().setForeground(aVar4);
                    } else {
                        imageView2.getOverlay().add(aVar4);
                    }
                }
            }
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.f35168o
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f35168o
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.f35167n
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f35167n
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x0032
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            boolean r3 = r9.f35177x
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x00a1
            boolean r3 = r9.f35155b
            if (r3 == 0) goto L_0x00a1
            java.util.WeakHashMap<android.view.View, s1.p0> r3 = p242s1.C6333d0.f19990a
            boolean r3 = p242s1.C6333d0.C6340g.m15075b(r9)
            if (r3 != 0) goto L_0x0046
            goto L_0x00a1
        L_0x0046:
            android.animation.ValueAnimator r3 = r9.f35174u
            if (r3 == 0) goto L_0x0050
            r3.cancel()
            r3 = 0
            r9.f35174u = r3
        L_0x0050:
            float[] r3 = new float[r2]
            float r6 = r9.f35176w
            r3[r5] = r6
            r3[r4] = r1
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            r9.f35174u = r3
            com.google.android.material.navigation.b r6 = new com.google.android.material.navigation.b
            r6.<init>(r9, r1)
            r3.addUpdateListener(r6)
            android.animation.ValueAnimator r1 = r9.f35174u
            android.content.Context r3 = r9.getContext()
            int r6 = p355ac.C13401b.motionEasingStandard
            e2.b r7 = p380bc.C13577a.f33538b
            android.animation.TimeInterpolator r3 = p670nc.C18537a.m45455c(r3, r6, r7)
            r1.setInterpolator(r3)
            android.animation.ValueAnimator r1 = r9.f35174u
            android.content.Context r3 = r9.getContext()
            int r6 = p355ac.C13401b.motionDurationLong1
            android.content.res.Resources r7 = r9.getResources()
            int r8 = p355ac.C13406g.material_motion_duration_long_1
            int r7 = r7.getInteger(r8)
            android.util.TypedValue r3 = p742qc.C19098b.m46245a(r6, r3)
            if (r3 == 0) goto L_0x0097
            int r6 = r3.type
            r8 = 16
            if (r6 != r8) goto L_0x0097
            int r7 = r3.data
        L_0x0097:
            long r6 = (long) r7
            r1.setDuration(r6)
            android.animation.ValueAnimator r1 = r9.f35174u
            r1.start()
            goto L_0x00a4
        L_0x00a1:
            r9.mo41997b(r1, r1)
        L_0x00a4:
            int r1 = r9.f35161h
            r3 = -1
            r6 = 17
            r7 = 49
            r8 = 4
            if (r1 == r3) goto L_0x013a
            if (r1 == 0) goto L_0x0109
            if (r1 == r4) goto L_0x00cd
            if (r1 == r2) goto L_0x00b6
            goto L_0x01a8
        L_0x00b6:
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f35156c
            m35093f(r0, r1, r6)
            android.widget.TextView r0 = r9.f35168o
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.f35167n
            r0.setVisibility(r1)
            goto L_0x01a8
        L_0x00cd:
            android.view.ViewGroup r1 = r9.f35166m
            int r2 = r9.f35157d
            m35094h(r2, r1)
            if (r10 == 0) goto L_0x00f2
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f35156c
            float r2 = (float) r2
            float r3 = r9.f35158e
            float r2 = r2 + r3
            int r2 = (int) r2
            m35093f(r1, r2, r7)
            android.widget.TextView r1 = r9.f35168o
            m35092e(r0, r0, r5, r1)
            android.widget.TextView r0 = r9.f35167n
            float r1 = r9.f35159f
            m35092e(r1, r1, r8, r0)
            goto L_0x01a8
        L_0x00f2:
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f35156c
            m35093f(r1, r2, r7)
            android.widget.TextView r1 = r9.f35168o
            float r2 = r9.f35160g
            m35092e(r2, r2, r8, r1)
            android.widget.TextView r1 = r9.f35167n
            m35092e(r0, r0, r5, r1)
            goto L_0x01a8
        L_0x0109:
            if (r10 == 0) goto L_0x0121
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f35156c
            m35093f(r0, r1, r7)
            android.view.ViewGroup r0 = r9.f35166m
            int r1 = r9.f35157d
            m35094h(r1, r0)
            android.widget.TextView r0 = r9.f35168o
            r0.setVisibility(r5)
            goto L_0x0134
        L_0x0121:
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f35156c
            m35093f(r0, r1, r6)
            android.view.ViewGroup r0 = r9.f35166m
            m35094h(r5, r0)
            android.widget.TextView r0 = r9.f35168o
            r0.setVisibility(r8)
        L_0x0134:
            android.widget.TextView r0 = r9.f35167n
            r0.setVisibility(r8)
            goto L_0x01a8
        L_0x013a:
            boolean r1 = r9.f35162i
            if (r1 == 0) goto L_0x016f
            if (r10 == 0) goto L_0x0156
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f35156c
            m35093f(r0, r1, r7)
            android.view.ViewGroup r0 = r9.f35166m
            int r1 = r9.f35157d
            m35094h(r1, r0)
            android.widget.TextView r0 = r9.f35168o
            r0.setVisibility(r5)
            goto L_0x0169
        L_0x0156:
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f35156c
            m35093f(r0, r1, r6)
            android.view.ViewGroup r0 = r9.f35166m
            m35094h(r5, r0)
            android.widget.TextView r0 = r9.f35168o
            r0.setVisibility(r8)
        L_0x0169:
            android.widget.TextView r0 = r9.f35167n
            r0.setVisibility(r8)
            goto L_0x01a8
        L_0x016f:
            android.view.ViewGroup r1 = r9.f35166m
            int r2 = r9.f35157d
            m35094h(r2, r1)
            if (r10 == 0) goto L_0x0193
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f35156c
            float r2 = (float) r2
            float r3 = r9.f35158e
            float r2 = r2 + r3
            int r2 = (int) r2
            m35093f(r1, r2, r7)
            android.widget.TextView r1 = r9.f35168o
            m35092e(r0, r0, r5, r1)
            android.widget.TextView r0 = r9.f35167n
            float r1 = r9.f35159f
            m35092e(r1, r1, r8, r0)
            goto L_0x01a8
        L_0x0193:
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f35156c
            m35093f(r1, r2, r7)
            android.widget.TextView r1 = r9.f35168o
            float r2 = r9.f35160g
            m35092e(r2, r2, r8, r1)
            android.widget.TextView r1 = r9.f35167n
            m35092e(r0, r0, r5, r1)
        L_0x01a8:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.C14096a.setChecked(boolean):void");
    }

    public void setEnabled(boolean z) {
        C6411x xVar;
        super.setEnabled(z);
        this.f35167n.setEnabled(z);
        this.f35168o.setEnabled(z);
        this.f35165l.setEnabled(z);
        if (z) {
            Context context = getContext();
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                xVar = new C6411x(C6411x.C6412a.m15316b(context, 1002));
            } else {
                xVar = new C6411x((PointerIcon) null);
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (i >= 24) {
                C6333d0.C6345k.m15117d(this, xVar.f20078a);
                return;
            }
            return;
        }
        WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
        if (Build.VERSION.SDK_INT >= 24) {
            C6333d0.C6345k.m15117d(this, (PointerIcon) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.f35172s) {
            this.f35172s = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C5450a.m13604g(drawable).mutate();
                this.f35173t = drawable;
                ColorStateList colorStateList = this.f35171r;
                if (colorStateList != null) {
                    C5450a.C5452b.m13617h(drawable, colorStateList);
                }
            }
            this.f35165l.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35165l.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f35165l.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f35171r = colorStateList;
        if (this.f35170q != null && (drawable = this.f35173t) != null) {
            C5450a.C5452b.m13617h(drawable, colorStateList);
            this.f35173t.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C4732a.getDrawable(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f35157d != i) {
            this.f35157d = i;
            C0295h hVar = this.f35170q;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f35156c != i) {
            this.f35156c = i;
            C0295h hVar = this.f35170q;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.f35169p = i;
    }

    public void setLabelVisibilityMode(int i) {
        boolean z;
        if (this.f35161h != i) {
            this.f35161h = i;
            if (!this.f35152A || i != 2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f35175v = f35151F;
            } else {
                this.f35175v = f35150E;
            }
            mo41998g(getWidth());
            C0295h hVar = this.f35170q;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f35162i != z) {
            this.f35162i = z;
            C0295h hVar = this.f35170q;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        m35091d(this.f35168o, i);
        mo41996a(this.f35167n.getTextSize(), this.f35168o.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        m35091d(this.f35167n, i);
        mo41996a(this.f35167n.getTextSize(), this.f35168o.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f35167n.setTextColor(colorStateList);
            this.f35168o.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f35167n.setText(charSequence);
        this.f35168o.setText(charSequence);
        C0295h hVar = this.f35170q;
        if (hVar == null || TextUtils.isEmpty(hVar.f968q)) {
            setContentDescription(charSequence);
        }
        C0295h hVar2 = this.f35170q;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.f969r)) {
            charSequence = this.f35170q.f969r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            C0432l1.m1181a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15057q(this, drawable);
    }
}
