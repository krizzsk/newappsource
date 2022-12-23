package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.app.C0265t;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.C0300j;
import androidx.appcompat.view.menu.C0302k;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import p242s1.C6377n;

public class ActionMenuView extends LinearLayoutCompat implements C0291f.C0293b, C0302k {

    /* renamed from: A */
    public int f1096A;

    /* renamed from: B */
    public C0324d f1097B;

    /* renamed from: q */
    public C0291f f1098q;

    /* renamed from: r */
    public Context f1099r;

    /* renamed from: s */
    public int f1100s;

    /* renamed from: t */
    public boolean f1101t;

    /* renamed from: u */
    public ActionMenuPresenter f1102u;

    /* renamed from: v */
    public C0300j.C0301a f1103v;

    /* renamed from: w */
    public C0291f.C0292a f1104w;

    /* renamed from: x */
    public boolean f1105x;

    /* renamed from: y */
    public int f1106y;

    /* renamed from: z */
    public int f1107z;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1108a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1109b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1110c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1111d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1112e;

        /* renamed from: f */
        public boolean f1113f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1108a = layoutParams.f1108a;
        }

        public LayoutParams() {
            super(-2, -2);
            this.f1108a = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0321a {
        /* renamed from: a */
        boolean mo1007a();

        /* renamed from: b */
        boolean mo1008b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0322b implements C0300j.C0301a {
        /* renamed from: b */
        public final void mo903b(C0291f fVar, boolean z) {
        }

        /* renamed from: c */
        public final boolean mo904c(C0291f fVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public class C0323c implements C0291f.C0292a {
        public C0323c() {
        }

        /* renamed from: a */
        public final boolean mo865a(C0291f fVar, MenuItem menuItem) {
            boolean z;
            boolean z2;
            C0324d dVar = ActionMenuView.this.f1097B;
            if (dVar != null) {
                Toolbar.C0374a aVar = (Toolbar.C0374a) dVar;
                Iterator<C6377n> it = Toolbar.this.f1380H.f20025b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().mo3990c(menuItem)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    z2 = true;
                } else {
                    Toolbar.C0378e eVar = Toolbar.this.f1382J;
                    if (eVar != null) {
                        z2 = C0265t.this.f771b.onMenuItemSelected(0, menuItem);
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final void mo866b(C0291f fVar) {
            C0291f.C0292a aVar = ActionMenuView.this.f1104w;
            if (aVar != null) {
                aVar.mo866b(fVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public interface C0324d {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1107z = (int) (56.0f * f);
        this.f1096A = (int) (f * 4.0f);
        this.f1099r = context;
        this.f1100s = 0;
    }

    /* renamed from: j */
    public static LayoutParams m786j(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (layoutParams2.gravity <= 0) {
                layoutParams2.gravity = 16;
            }
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams();
        layoutParams3.gravity = 16;
        return layoutParams3;
    }

    /* renamed from: a */
    public final void mo1030a(C0291f fVar) {
        this.f1098q = fVar;
    }

    /* renamed from: b */
    public final boolean mo1031b(C0295h hVar) {
        return this.f1098q.mo1125q(hVar, (C0300j) null, 0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: f */
    public final LinearLayoutCompat.LayoutParams mo1336f() {
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* renamed from: g */
    public final LinearLayoutCompat.LayoutParams mo1337g(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m786j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1098q == null) {
            Context context = getContext();
            C0291f fVar = new C0291f(context);
            this.f1098q = fVar;
            fVar.f926e = new C0323c();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1102u = actionMenuPresenter;
            actionMenuPresenter.f1074n = true;
            actionMenuPresenter.f1075o = true;
            C0300j.C0301a aVar = this.f1103v;
            if (aVar == null) {
                aVar = new C0322b();
            }
            actionMenuPresenter.f864f = aVar;
            this.f1098q.mo1101b(actionMenuPresenter, this.f1099r);
            ActionMenuPresenter actionMenuPresenter2 = this.f1102u;
            actionMenuPresenter2.f867i = this;
            this.f1098q = actionMenuPresenter2.f862d;
        }
        return this.f1098q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f1102u;
        ActionMenuPresenter.C0317d dVar = actionMenuPresenter.f1071k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (actionMenuPresenter.f1073m) {
            return actionMenuPresenter.f1072l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1100s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams mo1345h(ViewGroup.LayoutParams layoutParams) {
        return m786j(layoutParams);
    }

    /* renamed from: k */
    public final boolean mo1346k(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0321a)) {
            z = false | ((C0321a) childAt).mo1007a();
        }
        if (i <= 0 || !(childAt2 instanceof C0321a)) {
            return z;
        }
        return z | ((C0321a) childAt2).mo1008b();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1102u;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1054i(false);
            if (this.f1102u.mo1323m()) {
                this.f1102u.mo1322l();
                this.f1102u.mo1325o();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1102u;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1322l();
            ActionMenuPresenter.C0314a aVar = actionMenuPresenter.f1082v;
            if (aVar != null && aVar.mo1208b()) {
                aVar.f988j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (!this.f1105x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0453r1.m1265a(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1108a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1346k(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i6 = getPaddingLeft() + layoutParams.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i14 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i14, i7, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    mo1346k(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i9 / 2) - (measuredWidth2 / 2);
            int i16 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i5 = paddingRight / i17;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f1108a) {
                    int i19 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i21, i19, measuredHeight3 + i21);
                    width = i19 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f1108a) {
                int i23 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft = C16530d.m42011d(measuredWidth4, layoutParams3.rightMargin, max, i23);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        int i11;
        ActionMenuItemView actionMenuItemView;
        boolean z6;
        int i12;
        boolean z7;
        C0291f fVar;
        boolean z8 = this.f1105x;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f1105x = z;
        if (z8 != z) {
            this.f1106y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1105x || (fVar = this.f1098q) == null || size == this.f1106y)) {
            this.f1106y = size;
            fVar.mo1122p(true);
        }
        int childCount = getChildCount();
        if (!this.f1105x || childCount <= 0) {
            int i13 = i2;
            for (int i14 = 0; i14 < childCount; i14++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i14).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i15 = size2 - paddingRight;
        int i16 = this.f1107z;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z9 = false;
        long j = 0;
        int i25 = 0;
        while (i24 < childCount2) {
            View childAt = getChildAt(i24);
            int i26 = size3;
            if (childAt.getVisibility() == 8) {
                i6 = mode;
                i7 = i15;
                i8 = paddingBottom;
            } else {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i27 = i22 + 1;
                if (z11) {
                    int i28 = this.f1096A;
                    i9 = i27;
                    z4 = false;
                    childAt.setPadding(i28, 0, i28, 0);
                } else {
                    i9 = i27;
                    z4 = false;
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f1113f = z4;
                layoutParams2.f1110c = z4 ? 1 : 0;
                layoutParams2.f1109b = z4;
                layoutParams2.f1111d = z4;
                layoutParams2.leftMargin = z4;
                layoutParams2.rightMargin = z4;
                if (!z11 || !((ActionMenuItemView) childAt).mo1010d()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                layoutParams2.f1112e = z5;
                if (layoutParams2.f1108a) {
                    i11 = 1;
                } else {
                    i11 = i17;
                }
                i7 = i15;
                LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
                i6 = mode;
                i8 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                if (z11) {
                    actionMenuItemView = (ActionMenuItemView) childAt;
                } else {
                    actionMenuItemView = null;
                }
                if (actionMenuItemView == null || !actionMenuItemView.mo1010d()) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (i11 <= 0 || (z6 && i11 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i12++;
                    }
                    if (z6 && i12 < 2) {
                        i12 = 2;
                    }
                }
                if (layoutParams3.f1108a || !z6) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                layoutParams3.f1111d = z7;
                layoutParams3.f1109b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19 * i12, 1073741824), makeMeasureSpec);
                i23 = Math.max(i23, i12);
                if (layoutParams2.f1111d) {
                    i25++;
                }
                if (layoutParams2.f1108a) {
                    z9 = true;
                }
                i17 -= i12;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j |= (long) (1 << i24);
                }
                i22 = i9;
            }
            i24++;
            size3 = i26;
            paddingBottom = i8;
            i15 = i7;
            mode = i6;
        }
        int i29 = mode;
        int i31 = i15;
        int i32 = size3;
        if (!z9 || i22 != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z12 = false;
        while (i25 > 0 && i17 > 0) {
            int i33 = Integer.MAX_VALUE;
            int i34 = 0;
            long j2 = 0;
            for (int i35 = 0; i35 < childCount2; i35++) {
                LayoutParams layoutParams4 = (LayoutParams) getChildAt(i35).getLayoutParams();
                if (layoutParams4.f1111d) {
                    int i36 = layoutParams4.f1109b;
                    if (i36 < i33) {
                        j2 = 1 << i35;
                        i33 = i36;
                        i34 = 1;
                    } else if (i36 == i33) {
                        i34++;
                        j2 |= 1 << i35;
                    }
                }
            }
            j |= j2;
            if (i34 > i17) {
                break;
            }
            int i37 = i33 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
                int i39 = childMeasureSpec;
                int i41 = childCount2;
                long j3 = (long) (1 << i38);
                if ((j2 & j3) != 0) {
                    if (z2 && layoutParams5.f1112e && i17 == 1) {
                        int i42 = this.f1096A;
                        childAt2.setPadding(i42 + i19, 0, i42, 0);
                    }
                    layoutParams5.f1109b++;
                    layoutParams5.f1113f = true;
                    i17--;
                } else if (layoutParams5.f1109b == i37) {
                    j |= j3;
                }
                i38++;
                childMeasureSpec = i39;
                childCount2 = i41;
            }
            z12 = true;
        }
        int i43 = childMeasureSpec;
        int i44 = childCount2;
        if (z9 || i22 != 1) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i17 <= 0 || j == 0 || (i17 >= i22 - 1 && !z3 && i23 <= 1)) {
            i3 = i44;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z3) {
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f1112e) {
                    bitCount -= 0.5f;
                }
                int i45 = i44 - 1;
                if ((j & ((long) (1 << i45))) != 0 && !((LayoutParams) getChildAt(i45).getLayoutParams()).f1112e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > BitmapDescriptorFactory.HUE_RED) {
                i5 = (int) (((float) (i17 * i19)) / bitCount);
            } else {
                i5 = 0;
            }
            boolean z13 = z12;
            i3 = i44;
            for (int i46 = 0; i46 < i3; i46++) {
                if ((j & ((long) (1 << i46))) != 0) {
                    View childAt3 = getChildAt(i46);
                    LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams6.f1110c = i5;
                        layoutParams6.f1113f = true;
                        if (i46 == 0 && !layoutParams6.f1112e) {
                            layoutParams6.leftMargin = (-i5) / 2;
                        }
                    } else if (layoutParams6.f1108a) {
                        layoutParams6.f1110c = i5;
                        layoutParams6.f1113f = true;
                        layoutParams6.rightMargin = (-i5) / 2;
                    } else {
                        if (i46 != 0) {
                            layoutParams6.leftMargin = i5 / 2;
                        }
                        if (i46 != i3 - 1) {
                            layoutParams6.rightMargin = i5 / 2;
                        }
                    }
                    z13 = true;
                }
            }
            z12 = z13;
        }
        if (z12) {
            for (int i47 = 0; i47 < i3; i47++) {
                View childAt4 = getChildAt(i47);
                LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams7.f1113f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams7.f1109b * i19) + layoutParams7.f1110c, 1073741824), i43);
                }
            }
        }
        if (i29 != 1073741824) {
            i4 = i21;
        } else {
            i4 = i32;
        }
        setMeasuredDimension(i31, i4);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1102u.f1079s = z;
    }

    public void setOnMenuItemClickListener(C0324d dVar) {
        this.f1097B = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f1102u;
        ActionMenuPresenter.C0317d dVar = actionMenuPresenter.f1071k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.f1073m = true;
        actionMenuPresenter.f1072l = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.f1101t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1100s != i) {
            this.f1100s = i;
            if (i == 0) {
                this.f1099r = getContext();
            } else {
                this.f1099r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1102u = actionMenuPresenter;
        actionMenuPresenter.f867i = this;
        this.f1098q = actionMenuPresenter.f862d;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
