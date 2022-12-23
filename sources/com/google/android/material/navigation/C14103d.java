package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.C0302k;
import androidx.transition.AutoTransition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.badge.C13897a;
import com.google.android.material.internal.C14074k;
import java.util.HashSet;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p114i.C5215a;
import p229r1.C6236f;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p355ac.C13401b;
import p355ac.C13406g;
import p380bc.C13577a;
import p670nc.C18537a;
import p742qc.C19098b;
import p811tc.C19648g;
import p811tc.C19654k;

/* renamed from: com.google.android.material.navigation.d */
public abstract class C14103d extends ViewGroup implements C0302k {

    /* renamed from: D */
    public static final int[] f35187D = {16842912};

    /* renamed from: E */
    public static final int[] f35188E = {-16842910};

    /* renamed from: A */
    public ColorStateList f35189A;

    /* renamed from: B */
    public NavigationBarPresenter f35190B;

    /* renamed from: C */
    public C0291f f35191C;

    /* renamed from: b */
    public final AutoTransition f35192b;

    /* renamed from: c */
    public final C14104a f35193c;

    /* renamed from: d */
    public final C6236f f35194d = new C6236f(5);

    /* renamed from: e */
    public final SparseArray<View.OnTouchListener> f35195e = new SparseArray<>(5);

    /* renamed from: f */
    public int f35196f;

    /* renamed from: g */
    public C14096a[] f35197g;

    /* renamed from: h */
    public int f35198h = 0;

    /* renamed from: i */
    public int f35199i = 0;

    /* renamed from: j */
    public ColorStateList f35200j;

    /* renamed from: k */
    public int f35201k;

    /* renamed from: l */
    public ColorStateList f35202l;

    /* renamed from: m */
    public final ColorStateList f35203m = mo42039c();

    /* renamed from: n */
    public int f35204n;

    /* renamed from: o */
    public int f35205o;

    /* renamed from: p */
    public Drawable f35206p;

    /* renamed from: q */
    public int f35207q;

    /* renamed from: r */
    public final SparseArray<C13897a> f35208r = new SparseArray<>(5);

    /* renamed from: s */
    public int f35209s = -1;

    /* renamed from: t */
    public int f35210t = -1;

    /* renamed from: u */
    public boolean f35211u;

    /* renamed from: v */
    public int f35212v;

    /* renamed from: w */
    public int f35213w;

    /* renamed from: x */
    public int f35214x;

    /* renamed from: y */
    public C19654k f35215y;

    /* renamed from: z */
    public boolean f35216z = false;

    /* renamed from: com.google.android.material.navigation.d$a */
    public class C14104a implements View.OnClickListener {
        public C14104a() {
        }

        public final void onClick(View view) {
            C0295h itemData = ((C14096a) view).getItemData();
            C14103d dVar = C14103d.this;
            if (!dVar.f35191C.mo1125q(itemData, dVar.f35190B, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public C14103d(Context context) {
        super(context);
        if (isInEditMode()) {
            this.f35192b = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f35192b = autoTransition;
            autoTransition.mo5436M(0);
            Context context2 = getContext();
            int i = C13401b.motionDurationLong1;
            int integer = getResources().getInteger(C13406g.material_motion_duration_long_1);
            TypedValue a = C19098b.m46245a(i, context2);
            if (a != null && a.type == 16) {
                integer = a.data;
            }
            autoTransition.mo5403A((long) integer);
            autoTransition.mo5405D(C18537a.m45455c(getContext(), C13401b.motionEasingStandard, C13577a.f33538b));
            autoTransition.mo5433J(new C14074k());
        }
        this.f35193c = new C14104a();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15059s(this, 1);
    }

    /* renamed from: f */
    public static boolean m35102f(int i, int i2) {
        return i != -1 ? i == 0 : i2 > 3;
    }

    private C14096a getNewItem() {
        C14096a aVar = (C14096a) this.f35194d.mo22237b();
        if (aVar == null) {
            return mo42041e(getContext());
        }
        return aVar;
    }

    private void setBadgeIfNeeded(C14096a aVar) {
        boolean z;
        C13897a aVar2;
        int id = aVar.getId();
        if (id != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z && (aVar2 = this.f35208r.get(id)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    /* renamed from: a */
    public final void mo1030a(C0291f fVar) {
        this.f35191C = fVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: b */
    public final void mo42038b() {
        boolean z;
        removeAllViews();
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a aVar : aVarArr) {
                if (aVar != null) {
                    this.f35194d.mo22236a(aVar);
                    ImageView imageView = aVar.f35165l;
                    if (aVar.f35154C != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (imageView != null) {
                            aVar.setClipChildren(true);
                            aVar.setClipToPadding(true);
                            C13897a aVar2 = aVar.f35154C;
                            if (aVar2 != null) {
                                if (aVar2.mo40985d() != null) {
                                    aVar2.mo40985d().setForeground((Drawable) null);
                                } else {
                                    imageView.getOverlay().remove(aVar2);
                                }
                            }
                        }
                        aVar.f35154C = null;
                    }
                    aVar.f35170q = null;
                    aVar.f35176w = BitmapDescriptorFactory.HUE_RED;
                    aVar.f35155b = false;
                }
            }
        }
        if (this.f35191C.size() == 0) {
            this.f35198h = 0;
            this.f35199i = 0;
            this.f35197g = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f35191C.size(); i++) {
            hashSet.add(Integer.valueOf(this.f35191C.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f35208r.size(); i2++) {
            int keyAt = this.f35208r.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f35208r.delete(keyAt);
            }
        }
        this.f35197g = new C14096a[this.f35191C.size()];
        boolean f = m35102f(this.f35196f, this.f35191C.mo1118l().size());
        for (int i3 = 0; i3 < this.f35191C.size(); i3++) {
            this.f35190B.f35121c = true;
            this.f35191C.getItem(i3).setCheckable(true);
            this.f35190B.f35121c = false;
            C14096a newItem = getNewItem();
            this.f35197g[i3] = newItem;
            newItem.setIconTintList(this.f35200j);
            newItem.setIconSize(this.f35201k);
            newItem.setTextColor(this.f35203m);
            newItem.setTextAppearanceInactive(this.f35204n);
            newItem.setTextAppearanceActive(this.f35205o);
            newItem.setTextColor(this.f35202l);
            int i4 = this.f35209s;
            if (i4 != -1) {
                newItem.setItemPaddingTop(i4);
            }
            int i5 = this.f35210t;
            if (i5 != -1) {
                newItem.setItemPaddingBottom(i5);
            }
            newItem.setActiveIndicatorWidth(this.f35212v);
            newItem.setActiveIndicatorHeight(this.f35213w);
            newItem.setActiveIndicatorMarginHorizontal(this.f35214x);
            newItem.setActiveIndicatorDrawable(mo42040d());
            newItem.setActiveIndicatorResizeable(this.f35216z);
            newItem.setActiveIndicatorEnabled(this.f35211u);
            Drawable drawable = this.f35206p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f35207q);
            }
            newItem.setShifting(f);
            newItem.setLabelVisibilityMode(this.f35196f);
            C0295h hVar = (C0295h) this.f35191C.getItem(i3);
            newItem.mo1009c(hVar);
            newItem.setItemPosition(i3);
            int i6 = hVar.f952a;
            newItem.setOnTouchListener(this.f35195e.get(i6));
            newItem.setOnClickListener(this.f35193c);
            int i7 = this.f35198h;
            if (i7 != 0 && i6 == i7) {
                this.f35199i = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f35191C.size() - 1, this.f35199i);
        this.f35199i = min;
        this.f35191C.getItem(min).setChecked(true);
    }

    /* renamed from: c */
    public final ColorStateList mo42039c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = C4732a.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C5215a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f35188E;
        return new ColorStateList(new int[][]{iArr, f35187D, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    /* renamed from: d */
    public final C19648g mo42040d() {
        if (this.f35215y == null || this.f35189A == null) {
            return null;
        }
        C19648g gVar = new C19648g(this.f35215y);
        gVar.mo52005n(this.f35189A);
        return gVar;
    }

    /* renamed from: e */
    public abstract C14096a mo42041e(Context context);

    public SparseArray<C13897a> getBadgeDrawables() {
        return this.f35208r;
    }

    public ColorStateList getIconTintList() {
        return this.f35200j;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f35189A;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f35211u;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f35213w;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f35214x;
    }

    public C19654k getItemActiveIndicatorShapeAppearance() {
        return this.f35215y;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f35212v;
    }

    public Drawable getItemBackground() {
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr == null || aVarArr.length <= 0) {
            return this.f35206p;
        }
        return aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f35207q;
    }

    public int getItemIconSize() {
        return this.f35201k;
    }

    public int getItemPaddingBottom() {
        return this.f35210t;
    }

    public int getItemPaddingTop() {
        return this.f35209s;
    }

    public int getItemTextAppearanceActive() {
        return this.f35205o;
    }

    public int getItemTextAppearanceInactive() {
        return this.f35204n;
    }

    public ColorStateList getItemTextColor() {
        return this.f35202l;
    }

    public int getLabelVisibilityMode() {
        return this.f35196f;
    }

    public C0291f getMenu() {
        return this.f35191C;
    }

    public int getSelectedItemId() {
        return this.f35198h;
    }

    public int getSelectedItemPosition() {
        return this.f35199i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6531g.C6533b.m15466a(1, this.f35191C.mo1118l().size(), 1, false).f20352a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f35200j = colorStateList;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a iconTintList : aVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f35189A = colorStateList;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a activeIndicatorDrawable : aVarArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(mo42040d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f35211u = z;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a activeIndicatorEnabled : aVarArr) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f35213w = i;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a activeIndicatorHeight : aVarArr) {
                activeIndicatorHeight.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f35214x = i;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a activeIndicatorMarginHorizontal : aVarArr) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f35216z = z;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a activeIndicatorResizeable : aVarArr) {
                activeIndicatorResizeable.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C19654k kVar) {
        this.f35215y = kVar;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a activeIndicatorDrawable : aVarArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(mo42040d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f35212v = i;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a activeIndicatorWidth : aVarArr) {
                activeIndicatorWidth.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f35206p = drawable;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a itemBackground : aVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f35207q = i;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a itemBackground : aVarArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f35201k = i;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a iconSize : aVarArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f35210t = i;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a itemPaddingBottom : aVarArr) {
                itemPaddingBottom.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f35209s = i;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a itemPaddingTop : aVarArr) {
                itemPaddingTop.setItemPaddingTop(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f35205o = i;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f35202l;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f35204n = i;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f35202l;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f35202l = colorStateList;
        C14096a[] aVarArr = this.f35197g;
        if (aVarArr != null) {
            for (C14096a textColor : aVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f35196f = i;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f35190B = navigationBarPresenter;
    }
}
