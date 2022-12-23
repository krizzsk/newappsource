package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0302k;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.util.WeakHashMap;
import p114i.C5215a;
import p114i.C5220f;
import p114i.C5221g;
import p114i.C5224j;
import p127j.C5344a;
import p175n.C5765a;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class ActionBarContextView extends C0380a {

    /* renamed from: j */
    public CharSequence f1027j;

    /* renamed from: k */
    public CharSequence f1028k;

    /* renamed from: l */
    public View f1029l;

    /* renamed from: m */
    public View f1030m;

    /* renamed from: n */
    public View f1031n;

    /* renamed from: o */
    public LinearLayout f1032o;

    /* renamed from: p */
    public TextView f1033p;

    /* renamed from: q */
    public TextView f1034q;

    /* renamed from: r */
    public int f1035r;

    /* renamed from: s */
    public int f1036s;

    /* renamed from: t */
    public boolean f1037t;

    /* renamed from: u */
    public int f1038u;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class C0308a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C5765a f1039b;

        public C0308a(C5765a aVar) {
            this.f1039b = aVar;
        }

        public final void onClick(View view) {
            this.f1039b.mo993c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.actionModeStyle);
    }

    /* renamed from: f */
    public final void mo1243f(C5765a aVar) {
        View view = this.f1029l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1038u, this, false);
            this.f1029l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1029l);
        }
        View findViewById = this.f1029l.findViewById(C5220f.action_mode_close_button);
        this.f1030m = findViewById;
        findViewById.setOnClickListener(new C0308a(aVar));
        C0291f e = aVar.mo995e();
        ActionMenuPresenter actionMenuPresenter = this.f1432e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1322l();
            ActionMenuPresenter.C0314a aVar2 = actionMenuPresenter.f1082v;
            if (aVar2 != null && aVar2.mo1208b()) {
                aVar2.f988j.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1432e = actionMenuPresenter2;
        actionMenuPresenter2.f1074n = true;
        actionMenuPresenter2.f1075o = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e.mo1101b(this.f1432e, this.f1430c);
        ActionMenuPresenter actionMenuPresenter3 = this.f1432e;
        C0302k kVar = actionMenuPresenter3.f867i;
        if (kVar == null) {
            C0302k kVar2 = (C0302k) actionMenuPresenter3.f863e.inflate(actionMenuPresenter3.f865g, this, false);
            actionMenuPresenter3.f867i = kVar2;
            kVar2.mo1030a(actionMenuPresenter3.f862d);
            actionMenuPresenter3.mo1054i(true);
        }
        C0302k kVar3 = actionMenuPresenter3.f867i;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.f1431d = actionMenuView;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15057q(actionMenuView, (Drawable) null);
        addView(this.f1431d, layoutParams);
    }

    /* renamed from: g */
    public final void mo1244g() {
        int i;
        if (this.f1032o == null) {
            LayoutInflater.from(getContext()).inflate(C5221g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1032o = linearLayout;
            this.f1033p = (TextView) linearLayout.findViewById(C5220f.action_bar_title);
            this.f1034q = (TextView) this.f1032o.findViewById(C5220f.action_bar_subtitle);
            if (this.f1035r != 0) {
                this.f1033p.setTextAppearance(getContext(), this.f1035r);
            }
            if (this.f1036s != 0) {
                this.f1034q.setTextAppearance(getContext(), this.f1036s);
            }
        }
        this.f1033p.setText(this.f1027j);
        this.f1034q.setText(this.f1028k);
        boolean z = !TextUtils.isEmpty(this.f1027j);
        boolean z2 = !TextUtils.isEmpty(this.f1028k);
        TextView textView = this.f1034q;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.f1032o;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f1032o.getParent() == null) {
            addView(this.f1032o);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1028k;
    }

    public CharSequence getTitle() {
        return this.f1027j;
    }

    /* renamed from: h */
    public final void mo1251h() {
        removeAllViews();
        this.f1031n = null;
        this.f1431d = null;
        this.f1432e = null;
        View view = this.f1030m;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1432e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1322l();
            ActionMenuPresenter.C0314a aVar = this.f1432e.f1082v;
            if (aVar != null && aVar.mo1208b()) {
                aVar.f988j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        boolean a = C0453r1.m1265a(this);
        if (a) {
            i5 = (i3 - i) - getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1029l;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1029l.getLayoutParams();
            if (a) {
                i7 = marginLayoutParams.rightMargin;
            } else {
                i7 = marginLayoutParams.leftMargin;
            }
            if (a) {
                i8 = marginLayoutParams.leftMargin;
            } else {
                i8 = marginLayoutParams.rightMargin;
            }
            if (a) {
                i9 = i5 - i7;
            } else {
                i9 = i5 + i7;
            }
            int d = C0380a.m928d(this.f1029l, a, i9, paddingTop, paddingTop2) + i9;
            if (a) {
                i11 = d - i8;
            } else {
                i11 = d + i8;
            }
            i5 = i11;
        }
        LinearLayout linearLayout = this.f1032o;
        if (!(linearLayout == null || this.f1031n != null || linearLayout.getVisibility() == 8)) {
            i5 += C0380a.m928d(this.f1032o, a, i5, paddingTop, paddingTop2);
        }
        View view2 = this.f1031n;
        if (view2 != null) {
            C0380a.m928d(view2, a, i5, paddingTop, paddingTop2);
        }
        if (a) {
            i6 = getPaddingLeft();
        } else {
            i6 = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f1431d;
        if (actionMenuView != null) {
            C0380a.m928d(actionMenuView, !a, i6, paddingTop, paddingTop2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i6 = this.f1433f;
            if (i6 <= 0) {
                i6 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i7 = i6 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            View view = this.f1029l;
            if (view != null) {
                int c = C0380a.m927c(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1029l.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1431d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = C0380a.m927c(this.f1431d, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f1032o;
            if (linearLayout != null && this.f1031n == null) {
                if (this.f1037t) {
                    this.f1032o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1032o.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f1032o;
                    if (z) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    linearLayout2.setVisibility(i4);
                } else {
                    paddingLeft = C0380a.m927c(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f1031n;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i8 = layoutParams.width;
                if (i8 != -2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    paddingLeft = Math.min(i8, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i5 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i7 = Math.min(i9, i7);
                }
                this.f1031n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
            }
            if (this.f1433f <= 0) {
                int childCount = getChildCount();
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i11) {
                        i11 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i11);
                return;
            }
            setMeasuredDimension(size, i6);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f1433f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1031n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1031n = view;
        if (!(view == null || (linearLayout = this.f1032o) == null)) {
            removeView(linearLayout);
            this.f1032o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1028k = charSequence;
        mo1244g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1027j = charSequence;
        mo1244g();
        C6333d0.m15031s(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1037t) {
            requestLayout();
        }
        this.f1037t = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5224j.ActionMode, i, 0);
        int i2 = C5224j.ActionMode_background;
        if (!obtainStyledAttributes.hasValue(i2) || (resourceId = obtainStyledAttributes.getResourceId(i2, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i2);
        } else {
            drawable = C5344a.m13397a(context, resourceId);
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15057q(this, drawable);
        this.f1035r = obtainStyledAttributes.getResourceId(C5224j.ActionMode_titleTextStyle, 0);
        this.f1036s = obtainStyledAttributes.getResourceId(C5224j.ActionMode_subtitleTextStyle, 0);
        this.f1433f = obtainStyledAttributes.getLayoutDimension(C5224j.ActionMode_height, 0);
        this.f1038u = obtainStyledAttributes.getResourceId(C5224j.ActionMode_closeItemLayout, C5221g.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
}
