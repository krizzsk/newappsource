package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.widget.C0413h1;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.C14053f;
import com.google.android.material.internal.C14054g;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p114i.C5215a;
import p175n.C5773f;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6396v0;
import p355ac.C13401b;
import p355ac.C13410k;
import p355ac.C13411l;
import p811tc.C19648g;
import p811tc.C19654k;
import p811tc.C19656l;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: s */
    public static final int[] f35132s = {16842912};

    /* renamed from: t */
    public static final int[] f35133t = {-16842910};

    /* renamed from: u */
    public static final int f35134u = C13410k.Widget_Design_NavigationView;

    /* renamed from: g */
    public final C14053f f35135g;

    /* renamed from: h */
    public final C14054g f35136h;

    /* renamed from: i */
    public final int f35137i;

    /* renamed from: j */
    public final int[] f35138j;

    /* renamed from: k */
    public C5773f f35139k;

    /* renamed from: l */
    public C14105e f35140l;

    /* renamed from: m */
    public boolean f35141m;

    /* renamed from: n */
    public boolean f35142n;

    /* renamed from: o */
    public int f35143o;

    /* renamed from: p */
    public int f35144p;

    /* renamed from: q */
    public Path f35145q;

    /* renamed from: r */
    public final RectF f35146r;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    public class C14094a implements C0291f.C0292a {
        public C14094a() {
        }

        /* renamed from: a */
        public final boolean mo865a(C0291f fVar, MenuItem menuItem) {
            NavigationView.this.getClass();
            return false;
        }

        /* renamed from: b */
        public final void mo866b(C0291f fVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    public interface C14095b {
        /* renamed from: a */
        boolean mo41995a();
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.navigationViewStyle);
    }

    private MenuInflater getMenuInflater() {
        if (this.f35139k == null) {
            this.f35139k = new C5773f(getContext());
        }
        return this.f35139k;
    }

    /* renamed from: a */
    public final void mo41843a(C6396v0 v0Var) {
        int i;
        C14054g gVar = this.f35136h;
        gVar.getClass();
        int e = v0Var.mo22506e();
        if (gVar.f35081y != e) {
            gVar.f35081y = e;
            if (gVar.f35059c.getChildCount() != 0 || !gVar.f35079w) {
                i = 0;
            } else {
                i = gVar.f35081y;
            }
            NavigationMenuView navigationMenuView = gVar.f35058b;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = gVar.f35058b;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, v0Var.mo22503b());
        C6333d0.m15014b(gVar.f35059c, v0Var);
    }

    /* renamed from: b */
    public final ColorStateList mo41947b(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = C4732a.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C5215a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f35133t;
        return new ColorStateList(new int[][]{iArr, f35132s, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: c */
    public final InsetDrawable mo41948c(C0413h1 h1Var, ColorStateList colorStateList) {
        C19648g gVar = new C19648g(new C19654k(C19654k.m47122a(getContext(), h1Var.mo2095i(C13411l.NavigationView_itemShapeAppearance, 0), h1Var.mo2095i(C13411l.NavigationView_itemShapeAppearanceOverlay, 0))));
        gVar.mo52005n(colorStateList);
        return new InsetDrawable(gVar, h1Var.mo2090d(C13411l.NavigationView_itemShapeInsetStart, 0), h1Var.mo2090d(C13411l.NavigationView_itemShapeInsetTop, 0), h1Var.mo2090d(C13411l.NavigationView_itemShapeInsetEnd, 0), h1Var.mo2090d(C13411l.NavigationView_itemShapeInsetBottom, 0));
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.f35145q == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f35145q);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.f35136h.f35062f.f35085h;
    }

    public int getDividerInsetEnd() {
        return this.f35136h.f35076t;
    }

    public int getDividerInsetStart() {
        return this.f35136h.f35075s;
    }

    public int getHeaderCount() {
        return this.f35136h.f35059c.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f35136h.f35069m;
    }

    public int getItemHorizontalPadding() {
        return this.f35136h.f35071o;
    }

    public int getItemIconPadding() {
        return this.f35136h.f35073q;
    }

    public ColorStateList getItemIconTintList() {
        return this.f35136h.f35068l;
    }

    public int getItemMaxLines() {
        return this.f35136h.f35080x;
    }

    public ColorStateList getItemTextColor() {
        return this.f35136h.f35067k;
    }

    public int getItemVerticalPadding() {
        return this.f35136h.f35072p;
    }

    public Menu getMenu() {
        return this.f35135g;
    }

    public int getSubheaderInsetEnd() {
        this.f35136h.getClass();
        return 0;
    }

    public int getSubheaderInsetStart() {
        return this.f35136h.f35077u;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21100e.m49297A0(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f35140l);
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f35137i), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f35137i, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f35135g.mo1136t(savedState.f35147b);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f35147b = bundle;
        this.f35135g.mo1138v(bundle);
        return savedState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(getParent() instanceof DrawerLayout) || this.f35144p <= 0 || !(getBackground() instanceof C19648g)) {
            this.f35145q = null;
            this.f35146r.setEmpty();
            return;
        }
        C19648g gVar = (C19648g) getBackground();
        C19654k kVar = gVar.f49837b.f49861a;
        kVar.getClass();
        C19654k.C19655a aVar = new C19654k.C19655a(kVar);
        int i5 = this.f35143o;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (Gravity.getAbsoluteGravity(i5, C6333d0.C6338e.m15063d(this)) == 3) {
            aVar.mo52027g((float) this.f35144p);
            aVar.mo52025e((float) this.f35144p);
        } else {
            aVar.mo52026f((float) this.f35144p);
            aVar.mo52024d((float) this.f35144p);
        }
        gVar.setShapeAppearanceModel(new C19654k(aVar));
        if (this.f35145q == null) {
            this.f35145q = new Path();
        }
        this.f35145q.reset();
        this.f35146r.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
        C19656l lVar = C19656l.C19657a.f49923a;
        C19648g.C19650b bVar = gVar.f49837b;
        lVar.mo52028a(bVar.f49861a, bVar.f49870j, this.f35146r, (C19648g.C19649a) null, this.f35145q);
        invalidate();
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f35142n = z;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f35135g.findItem(i);
        if (findItem != null) {
            this.f35136h.f35062f.mo41879k((C0295h) findItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35076t = i;
        gVar.mo1054i(false);
    }

    public void setDividerInsetStart(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35075s = i;
        gVar.mo1054i(false);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C21100e.m49378z0(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        C14054g gVar = this.f35136h;
        gVar.f35069m = drawable;
        gVar.mo1054i(false);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C4732a.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35071o = i;
        gVar.mo1054i(false);
    }

    public void setItemHorizontalPaddingResource(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35071o = getResources().getDimensionPixelSize(i);
        gVar.mo1054i(false);
    }

    public void setItemIconPadding(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35073q = i;
        gVar.mo1054i(false);
    }

    public void setItemIconPaddingResource(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35073q = getResources().getDimensionPixelSize(i);
        gVar.mo1054i(false);
    }

    public void setItemIconSize(int i) {
        C14054g gVar = this.f35136h;
        if (gVar.f35074r != i) {
            gVar.f35074r = i;
            gVar.f35078v = true;
            gVar.mo1054i(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        C14054g gVar = this.f35136h;
        gVar.f35068l = colorStateList;
        gVar.mo1054i(false);
    }

    public void setItemMaxLines(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35080x = i;
        gVar.mo1054i(false);
    }

    public void setItemTextAppearance(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35066j = i;
        gVar.mo1054i(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        C14054g gVar = this.f35136h;
        gVar.f35067k = colorStateList;
        gVar.mo1054i(false);
    }

    public void setItemVerticalPadding(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35072p = i;
        gVar.mo1054i(false);
    }

    public void setItemVerticalPaddingResource(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35072p = getResources().getDimensionPixelSize(i);
        gVar.mo1054i(false);
    }

    public void setNavigationItemSelectedListener(C14095b bVar) {
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C14054g gVar = this.f35136h;
        if (gVar != null) {
            gVar.f35056A = i;
            NavigationMenuView navigationMenuView = gVar.f35058b;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setSubheaderInsetEnd(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35077u = i;
        gVar.mo1054i(false);
    }

    public void setSubheaderInsetStart(int i) {
        C14054g gVar = this.f35136h;
        gVar.f35077u = i;
        gVar.mo1054i(false);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f35141m = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C14093a();

        /* renamed from: b */
        public Bundle f35147b;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        public class C14093a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f35147b = parcel.readBundle(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f35147b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f35134u
            r1 = r17
            android.content.Context r1 = p883wc.C20289a.m47861a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.internal.g r10 = new com.google.android.material.internal.g
            r10.<init>()
            r0.f35136h = r10
            r1 = 2
            int[] r1 = new int[r1]
            r0.f35138j = r1
            r11 = 1
            r0.f35141m = r11
            r0.f35142n = r11
            r12 = 0
            r0.f35143o = r12
            r0.f35144p = r12
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f35146r = r1
            android.content.Context r13 = r16.getContext()
            com.google.android.material.internal.f r14 = new com.google.android.material.internal.f
            r14.<init>(r13)
            r0.f35135g = r14
            int[] r3 = p355ac.C13411l.NavigationView
            int[] r6 = new int[r12]
            r1 = r13
            r2 = r18
            r4 = r19
            r5 = r9
            androidx.appcompat.widget.h1 r1 = com.google.android.material.internal.C14077m.m35061e(r1, r2, r3, r4, r5, r6)
            int r2 = p355ac.C13411l.NavigationView_android_background
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x0058
            android.graphics.drawable.Drawable r2 = r1.mo2091e(r2)
            java.util.WeakHashMap<android.view.View, s1.p0> r3 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15057q(r0, r2)
        L_0x0058:
            int r2 = p355ac.C13411l.NavigationView_drawerLayoutCornerSize
            int r2 = r1.mo2090d(r2, r12)
            r0.f35144p = r2
            int r2 = p355ac.C13411l.NavigationView_android_layout_gravity
            int r2 = r1.mo2094h(r2, r12)
            r0.f35143o = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            if (r2 == 0) goto L_0x0076
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x00a1
        L_0x0076:
            tc.k$a r2 = p811tc.C19654k.m47124c(r13, r7, r8, r9)
            tc.k r3 = new tc.k
            r3.<init>(r2)
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            tc.g r4 = new tc.g
            r4.<init>((p811tc.C19654k) r3)
            boolean r3 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r3 == 0) goto L_0x0099
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r4.mo52005n(r2)
        L_0x0099:
            r4.mo52001k(r13)
            java.util.WeakHashMap<android.view.View, s1.p0> r2 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15057q(r0, r4)
        L_0x00a1:
            int r2 = p355ac.C13411l.NavigationView_elevation
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x00b1
            int r2 = r1.mo2090d(r2, r12)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x00b1:
            int r2 = p355ac.C13411l.NavigationView_android_fitsSystemWindows
            boolean r2 = r1.mo2087a(r2, r12)
            r0.setFitsSystemWindows(r2)
            int r2 = p355ac.C13411l.NavigationView_android_maxWidth
            int r2 = r1.mo2090d(r2, r12)
            r0.f35137i = r2
            int r2 = p355ac.C13411l.NavigationView_subheaderColor
            boolean r3 = r1.mo2098l(r2)
            r4 = 0
            if (r3 == 0) goto L_0x00d0
            android.content.res.ColorStateList r2 = r1.mo2088b(r2)
            goto L_0x00d1
        L_0x00d0:
            r2 = r4
        L_0x00d1:
            int r3 = p355ac.C13411l.NavigationView_subheaderTextAppearance
            boolean r5 = r1.mo2098l(r3)
            if (r5 == 0) goto L_0x00de
            int r3 = r1.mo2095i(r3, r12)
            goto L_0x00df
        L_0x00de:
            r3 = 0
        L_0x00df:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto L_0x00ea
            if (r2 != 0) goto L_0x00ea
            android.content.res.ColorStateList r2 = r0.mo41947b(r5)
        L_0x00ea:
            int r6 = p355ac.C13411l.NavigationView_itemIconTint
            boolean r7 = r1.mo2098l(r6)
            if (r7 == 0) goto L_0x00f7
            android.content.res.ColorStateList r5 = r1.mo2088b(r6)
            goto L_0x00fb
        L_0x00f7:
            android.content.res.ColorStateList r5 = r0.mo41947b(r5)
        L_0x00fb:
            int r6 = p355ac.C13411l.NavigationView_itemTextAppearance
            boolean r7 = r1.mo2098l(r6)
            if (r7 == 0) goto L_0x0108
            int r6 = r1.mo2095i(r6, r12)
            goto L_0x0109
        L_0x0108:
            r6 = 0
        L_0x0109:
            int r7 = p355ac.C13411l.NavigationView_itemIconSize
            boolean r8 = r1.mo2098l(r7)
            if (r8 == 0) goto L_0x0118
            int r7 = r1.mo2090d(r7, r12)
            r0.setItemIconSize(r7)
        L_0x0118:
            int r7 = p355ac.C13411l.NavigationView_itemTextColor
            boolean r8 = r1.mo2098l(r7)
            if (r8 == 0) goto L_0x0125
            android.content.res.ColorStateList r7 = r1.mo2088b(r7)
            goto L_0x0126
        L_0x0125:
            r7 = r4
        L_0x0126:
            if (r6 != 0) goto L_0x0131
            if (r7 != 0) goto L_0x0131
            r7 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r7 = r0.mo41947b(r7)
        L_0x0131:
            int r8 = p355ac.C13411l.NavigationView_itemBackground
            android.graphics.drawable.Drawable r8 = r1.mo2091e(r8)
            if (r8 != 0) goto L_0x0177
            int r9 = p355ac.C13411l.NavigationView_itemShapeAppearance
            boolean r9 = r1.mo2098l(r9)
            if (r9 != 0) goto L_0x014c
            int r9 = p355ac.C13411l.NavigationView_itemShapeAppearanceOverlay
            boolean r9 = r1.mo2098l(r9)
            if (r9 == 0) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r9 = 0
            goto L_0x014d
        L_0x014c:
            r9 = 1
        L_0x014d:
            if (r9 == 0) goto L_0x0177
            android.content.Context r8 = r16.getContext()
            int r9 = p355ac.C13411l.NavigationView_itemShapeFillColor
            android.content.res.ColorStateList r8 = p742qc.C19099c.m46248b(r8, r1, r9)
            android.graphics.drawable.InsetDrawable r8 = r0.mo41948c(r1, r8)
            int r9 = p355ac.C13411l.NavigationView_itemRippleColor
            android.content.res.ColorStateList r9 = p742qc.C19099c.m46248b(r13, r1, r9)
            if (r9 == 0) goto L_0x0177
            android.graphics.drawable.InsetDrawable r15 = r0.mo41948c(r1, r4)
            android.graphics.drawable.RippleDrawable r11 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r9 = p763rc.C19252b.m46506c(r9)
            r11.<init>(r9, r4, r15)
            r10.f35070n = r11
            r10.mo1054i(r12)
        L_0x0177:
            int r4 = p355ac.C13411l.NavigationView_itemHorizontalPadding
            boolean r9 = r1.mo2098l(r4)
            if (r9 == 0) goto L_0x0186
            int r4 = r1.mo2090d(r4, r12)
            r0.setItemHorizontalPadding(r4)
        L_0x0186:
            int r4 = p355ac.C13411l.NavigationView_itemVerticalPadding
            boolean r9 = r1.mo2098l(r4)
            if (r9 == 0) goto L_0x0195
            int r4 = r1.mo2090d(r4, r12)
            r0.setItemVerticalPadding(r4)
        L_0x0195:
            int r4 = p355ac.C13411l.NavigationView_dividerInsetStart
            int r4 = r1.mo2090d(r4, r12)
            r0.setDividerInsetStart(r4)
            int r4 = p355ac.C13411l.NavigationView_dividerInsetEnd
            int r4 = r1.mo2090d(r4, r12)
            r0.setDividerInsetEnd(r4)
            int r4 = p355ac.C13411l.NavigationView_subheaderInsetStart
            int r4 = r1.mo2090d(r4, r12)
            r0.setSubheaderInsetStart(r4)
            int r4 = p355ac.C13411l.NavigationView_subheaderInsetEnd
            int r4 = r1.mo2090d(r4, r12)
            r0.setSubheaderInsetEnd(r4)
            int r4 = p355ac.C13411l.NavigationView_topInsetScrimEnabled
            boolean r9 = r0.f35141m
            boolean r4 = r1.mo2087a(r4, r9)
            r0.setTopInsetScrimEnabled(r4)
            int r4 = p355ac.C13411l.NavigationView_bottomInsetScrimEnabled
            boolean r9 = r0.f35142n
            boolean r4 = r1.mo2087a(r4, r9)
            r0.setBottomInsetScrimEnabled(r4)
            int r4 = p355ac.C13411l.NavigationView_itemIconPadding
            int r4 = r1.mo2090d(r4, r12)
            int r9 = p355ac.C13411l.NavigationView_itemMaxLines
            r11 = 1
            int r9 = r1.mo2094h(r9, r11)
            r0.setItemMaxLines(r9)
            com.google.android.material.navigation.NavigationView$a r9 = new com.google.android.material.navigation.NavigationView$a
            r9.<init>()
            r14.f926e = r9
            r10.f35061e = r11
            r10.mo1075k(r13, r14)
            if (r3 == 0) goto L_0x01f2
            r10.f35064h = r3
            r10.mo1054i(r12)
        L_0x01f2:
            r10.f35065i = r2
            r10.mo1054i(r12)
            r10.f35068l = r5
            r10.mo1054i(r12)
            int r2 = r16.getOverScrollMode()
            r10.f35056A = r2
            com.google.android.material.internal.NavigationMenuView r3 = r10.f35058b
            if (r3 == 0) goto L_0x0209
            r3.setOverScrollMode(r2)
        L_0x0209:
            if (r6 == 0) goto L_0x0210
            r10.f35066j = r6
            r10.mo1054i(r12)
        L_0x0210:
            r10.f35067k = r7
            r10.mo1054i(r12)
            r10.f35069m = r8
            r10.mo1054i(r12)
            r10.f35073q = r4
            r10.mo1054i(r12)
            android.content.Context r2 = r14.f922a
            r14.mo1101b(r10, r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f35058b
            if (r2 != 0) goto L_0x0268
            android.view.LayoutInflater r2 = r10.f35063g
            int r3 = p355ac.C13407h.design_navigation_menu
            android.view.View r2 = r2.inflate(r3, r0, r12)
            com.google.android.material.internal.NavigationMenuView r2 = (com.google.android.material.internal.NavigationMenuView) r2
            r10.f35058b = r2
            com.google.android.material.internal.g$h r3 = new com.google.android.material.internal.g$h
            com.google.android.material.internal.NavigationMenuView r4 = r10.f35058b
            r3.<init>(r4)
            r2.setAccessibilityDelegateCompat(r3)
            com.google.android.material.internal.g$c r2 = r10.f35062f
            if (r2 != 0) goto L_0x0249
            com.google.android.material.internal.g$c r2 = new com.google.android.material.internal.g$c
            r2.<init>()
            r10.f35062f = r2
        L_0x0249:
            int r2 = r10.f35056A
            r3 = -1
            if (r2 == r3) goto L_0x0253
            com.google.android.material.internal.NavigationMenuView r3 = r10.f35058b
            r3.setOverScrollMode(r2)
        L_0x0253:
            android.view.LayoutInflater r2 = r10.f35063g
            int r3 = p355ac.C13407h.design_navigation_item_header
            com.google.android.material.internal.NavigationMenuView r4 = r10.f35058b
            android.view.View r2 = r2.inflate(r3, r4, r12)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r10.f35059c = r2
            com.google.android.material.internal.NavigationMenuView r2 = r10.f35058b
            com.google.android.material.internal.g$c r3 = r10.f35062f
            r2.setAdapter(r3)
        L_0x0268:
            com.google.android.material.internal.NavigationMenuView r2 = r10.f35058b
            r0.addView(r2)
            int r2 = p355ac.C13411l.NavigationView_menu
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x0290
            int r2 = r1.mo2095i(r2, r12)
            com.google.android.material.internal.g$c r3 = r10.f35062f
            if (r3 == 0) goto L_0x0280
            r4 = 1
            r3.f35086i = r4
        L_0x0280:
            android.view.MenuInflater r3 = r16.getMenuInflater()
            r3.inflate(r2, r14)
            com.google.android.material.internal.g$c r2 = r10.f35062f
            if (r2 == 0) goto L_0x028d
            r2.f35086i = r12
        L_0x028d:
            r10.mo1054i(r12)
        L_0x0290:
            int r2 = p355ac.C13411l.NavigationView_headerLayout
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x02b2
            int r2 = r1.mo2095i(r2, r12)
            android.view.LayoutInflater r3 = r10.f35063g
            android.widget.LinearLayout r4 = r10.f35059c
            android.view.View r2 = r3.inflate(r2, r4, r12)
            android.widget.LinearLayout r3 = r10.f35059c
            r3.addView(r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f35058b
            int r3 = r2.getPaddingBottom()
            r2.setPadding(r12, r12, r12, r3)
        L_0x02b2:
            r1.mo2099n()
            com.google.android.material.navigation.e r1 = new com.google.android.material.navigation.e
            r1.<init>(r0)
            r0.f35140l = r1
            android.view.ViewTreeObserver r1 = r16.getViewTreeObserver()
            com.google.android.material.navigation.e r2 = r0.f35140l
            r1.addOnGlobalLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f35135g.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f35136h.f35062f.mo41879k((C0295h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
