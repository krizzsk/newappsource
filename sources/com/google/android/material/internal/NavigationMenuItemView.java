package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.C0302k;
import androidx.appcompat.widget.C0432l1;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.C0801k;
import java.util.WeakHashMap;
import p114i.C5215a;
import p116i1.C5247f;
import p141k1.C5450a;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p355ac.C13403d;
import p355ac.C13404e;
import p355ac.C13405f;
import p355ac.C13407h;

public class NavigationMenuItemView extends ForegroundLinearLayout implements C0302k.C0303a {

    /* renamed from: G */
    public static final int[] f34942G = {16842912};

    /* renamed from: A */
    public FrameLayout f34943A;

    /* renamed from: B */
    public C0295h f34944B;

    /* renamed from: C */
    public ColorStateList f34945C;

    /* renamed from: D */
    public boolean f34946D;

    /* renamed from: E */
    public Drawable f34947E;

    /* renamed from: F */
    public final C14039a f34948F;

    /* renamed from: w */
    public int f34949w;

    /* renamed from: x */
    public boolean f34950x;

    /* renamed from: y */
    public boolean f34951y;

    /* renamed from: z */
    public final CheckedTextView f34952z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C14039a extends C6315a {
        public C14039a() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            gVar.f20334a.setCheckable(NavigationMenuItemView.this.f34951y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f34943A == null) {
                this.f34943A = (FrameLayout) ((ViewStub) findViewById(C13405f.design_menu_item_action_area_stub)).inflate();
            }
            this.f34943A.removeAllViews();
            this.f34943A.addView(view);
        }
    }

    /* renamed from: c */
    public final void mo1009c(C0295h hVar) {
        int i;
        StateListDrawable stateListDrawable;
        this.f34944B = hVar;
        int i2 = hVar.f952a;
        if (i2 > 0) {
            setId(i2);
        }
        if (hVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C5215a.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f34942G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15057q(this, stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f956e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f968q);
        C0432l1.m1181a(this, hVar.f969r);
        C0295h hVar2 = this.f34944B;
        if (!(hVar2.f956e == null && hVar2.getIcon() == null && this.f34944B.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.f34952z.setVisibility(8);
            FrameLayout frameLayout = this.f34943A;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.f34943A.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f34952z.setVisibility(0);
        FrameLayout frameLayout2 = this.f34943A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.f34943A.setLayoutParams(layoutParams2);
        }
    }

    public C0295h getItemData() {
        return this.f34944B;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0295h hVar = this.f34944B;
        if (hVar != null && hVar.isCheckable() && this.f34944B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f34942G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f34951y != z) {
            this.f34951y = z;
            this.f34948F.sendAccessibilityEvent(this.f34952z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f34952z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f34946D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C5450a.m13604g(drawable).mutate();
                C5450a.C5452b.m13617h(drawable, this.f34945C);
            }
            int i = this.f34949w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f34950x) {
            if (this.f34947E == null) {
                Resources resources = getResources();
                int i2 = C13404e.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
                Drawable a = C5247f.C5248a.m13264a(resources, i2, theme);
                this.f34947E = a;
                if (a != null) {
                    int i3 = this.f34949w;
                    a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f34947E;
        }
        C0801k.C0803b.m2434e(this.f34952z, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f34952z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f34949w = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f34945C = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f34946D = z;
        C0295h hVar = this.f34944B;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f34952z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f34950x = z;
    }

    public void setTextAppearance(int i) {
        C0801k.m2424f(this.f34952z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f34952z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f34952z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14039a aVar = new C14039a();
        this.f34948F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C13407h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C13403d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C13405f.design_menu_item_text);
        this.f34952z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C6333d0.m15029q(checkedTextView, aVar);
    }
}
