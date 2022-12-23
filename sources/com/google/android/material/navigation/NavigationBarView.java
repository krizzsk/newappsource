package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0302k;
import androidx.appcompat.widget.C0413h1;
import androidx.customview.view.AbsSavedState;
import ce0.C21100e;
import com.google.android.material.internal.C14077m;
import java.util.WeakHashMap;
import p141k1.C5450a;
import p175n.C5773f;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13403d;
import p355ac.C13411l;
import p742qc.C19099c;
import p763rc.C19252b;
import p811tc.C19648g;
import p811tc.C19654k;
import p883wc.C20289a;

public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: b */
    public final C14102c f35125b;

    /* renamed from: c */
    public final C14103d f35126c;

    /* renamed from: d */
    public final NavigationBarPresenter f35127d;

    /* renamed from: e */
    public ColorStateList f35128e;

    /* renamed from: f */
    public C5773f f35129f;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C14089a();

        /* renamed from: b */
        public Bundle f35130b;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        public class C14089a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f35130b);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f35130b = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    public class C14090a implements C0291f.C0292a {
        public C14090a() {
        }

        /* renamed from: a */
        public final boolean mo865a(C0291f fVar, MenuItem menuItem) {
            NavigationBarView.this.getClass();
            NavigationBarView.this.getClass();
            return false;
        }

        /* renamed from: b */
        public final void mo866b(C0291f fVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    public interface C14091b {
        /* renamed from: a */
        void mo41945a();
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    public interface C14092c {
        /* renamed from: a */
        boolean mo41946a();
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C20289a.m47861a(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f35127d = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = C13411l.NavigationBarView;
        int i3 = C13411l.NavigationBarView_itemTextAppearanceInactive;
        int i4 = C13411l.NavigationBarView_itemTextAppearanceActive;
        C0413h1 e = C14077m.m35061e(context2, attributeSet, iArr, i, i2, i3, i4);
        C14102c cVar = new C14102c(context2, getClass(), getMaxItemCount());
        this.f35125b = cVar;
        C14103d a = mo41046a(context2);
        this.f35126c = a;
        navigationBarPresenter.f35120b = a;
        navigationBarPresenter.f35122d = 1;
        a.setPresenter(navigationBarPresenter);
        cVar.mo1101b(navigationBarPresenter, cVar.f922a);
        getContext();
        navigationBarPresenter.f35120b.f35191C = cVar;
        int i5 = C13411l.NavigationBarView_itemIconTint;
        if (e.mo2098l(i5)) {
            a.setIconTintList(e.mo2088b(i5));
        } else {
            a.setIconTintList(a.mo42039c());
        }
        setItemIconSize(e.mo2090d(C13411l.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(C13403d.mtrl_navigation_bar_item_default_icon_size)));
        if (e.mo2098l(i3)) {
            setItemTextAppearanceInactive(e.mo2095i(i3, 0));
        }
        if (e.mo2098l(i4)) {
            setItemTextAppearanceActive(e.mo2095i(i4, 0));
        }
        int i6 = C13411l.NavigationBarView_itemTextColor;
        if (e.mo2098l(i6)) {
            setItemTextColor(e.mo2088b(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C19648g gVar = new C19648g();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                gVar.mo52005n(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            gVar.mo52001k(context2);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15057q(this, gVar);
        }
        int i7 = C13411l.NavigationBarView_itemPaddingTop;
        if (e.mo2098l(i7)) {
            setItemPaddingTop(e.mo2090d(i7, 0));
        }
        int i8 = C13411l.NavigationBarView_itemPaddingBottom;
        if (e.mo2098l(i8)) {
            setItemPaddingBottom(e.mo2090d(i8, 0));
        }
        int i9 = C13411l.NavigationBarView_elevation;
        if (e.mo2098l(i9)) {
            setElevation((float) e.mo2090d(i9, 0));
        }
        C5450a.C5452b.m13617h(getBackground().mutate(), C19099c.m46248b(context2, e, C13411l.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(e.f1515b.getInteger(C13411l.NavigationBarView_labelVisibilityMode, -1));
        int i11 = e.mo2095i(C13411l.NavigationBarView_itemBackground, 0);
        if (i11 != 0) {
            a.setItemBackgroundRes(i11);
        } else {
            setItemRippleColor(C19099c.m46248b(context2, e, C13411l.NavigationBarView_itemRippleColor));
        }
        int i12 = e.mo2095i(C13411l.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (i12 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(i12, C13411l.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(C13411l.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(C13411l.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(C13411l.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(C19099c.m46247a(context2, obtainStyledAttributes, C13411l.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(new C19654k(C19654k.m47122a(context2, obtainStyledAttributes.getResourceId(C13411l.NavigationBarActiveIndicator_shapeAppearance, 0), 0)));
            obtainStyledAttributes.recycle();
        }
        int i13 = C13411l.NavigationBarView_menu;
        if (e.mo2098l(i13)) {
            int i14 = e.mo2095i(i13, 0);
            navigationBarPresenter.f35121c = true;
            getMenuInflater().inflate(i14, cVar);
            navigationBarPresenter.f35121c = false;
            navigationBarPresenter.mo1054i(true);
        }
        e.mo2099n();
        addView(a);
        cVar.f926e = new C14090a();
    }

    private MenuInflater getMenuInflater() {
        if (this.f35129f == null) {
            this.f35129f = new C5773f(getContext());
        }
        return this.f35129f;
    }

    /* renamed from: a */
    public abstract C14103d mo41046a(Context context);

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f35126c.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f35126c.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f35126c.getItemActiveIndicatorMarginHorizontal();
    }

    public C19654k getItemActiveIndicatorShapeAppearance() {
        return this.f35126c.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f35126c.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f35126c.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f35126c.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f35126c.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f35126c.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f35126c.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f35126c.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f35128e;
    }

    public int getItemTextAppearanceActive() {
        return this.f35126c.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f35126c.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f35126c.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f35126c.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f35125b;
    }

    public C0302k getMenuView() {
        return this.f35126c;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f35127d;
    }

    public int getSelectedItemId() {
        return this.f35126c.getSelectedItemId();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21100e.m49297A0(this);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f35125b.mo1136t(savedState.f35130b);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f35130b = bundle;
        this.f35125b.mo1138v(bundle);
        return savedState;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C21100e.m49378z0(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f35126c.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f35126c.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f35126c.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f35126c.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C19654k kVar) {
        this.f35126c.setItemActiveIndicatorShapeAppearance(kVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f35126c.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f35126c.setItemBackground(drawable);
        this.f35128e = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f35126c.setItemBackgroundRes(i);
        this.f35128e = null;
    }

    public void setItemIconSize(int i) {
        this.f35126c.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f35126c.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f35126c.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f35126c.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f35128e != colorStateList) {
            this.f35128e = colorStateList;
            if (colorStateList == null) {
                this.f35126c.setItemBackground((Drawable) null);
                return;
            }
            this.f35126c.setItemBackground(new RippleDrawable(C19252b.m46504a(colorStateList), (Drawable) null, (Drawable) null));
        } else if (colorStateList == null && this.f35126c.getItemBackground() != null) {
            this.f35126c.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f35126c.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f35126c.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f35126c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f35126c.getLabelVisibilityMode() != i) {
            this.f35126c.setLabelVisibilityMode(i);
            this.f35127d.mo1054i(false);
        }
    }

    public void setOnItemReselectedListener(C14091b bVar) {
    }

    public void setOnItemSelectedListener(C14092c cVar) {
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f35125b.findItem(i);
        if (findItem != null && !this.f35125b.mo1125q(findItem, this.f35127d, 0)) {
            findItem.setChecked(true);
        }
    }
}
