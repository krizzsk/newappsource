package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0302k;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0432l1;
import androidx.appcompat.widget.C0438n0;
import p114i.C5224j;
import p188o.C5901f;

public class ActionMenuItemView extends AppCompatTextView implements C0302k.C0303a, View.OnClickListener, ActionMenuView.C0321a {

    /* renamed from: h */
    public C0295h f829h;

    /* renamed from: i */
    public CharSequence f830i;

    /* renamed from: j */
    public Drawable f831j;

    /* renamed from: k */
    public C0291f.C0293b f832k;

    /* renamed from: l */
    public C0279a f833l;

    /* renamed from: m */
    public C0280b f834m;

    /* renamed from: n */
    public boolean f835n;

    /* renamed from: o */
    public boolean f836o;

    /* renamed from: p */
    public int f837p;

    /* renamed from: q */
    public int f838q;

    /* renamed from: r */
    public int f839r;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0279a extends C0438n0 {
        public C0279a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public final C5901f mo1028b() {
            ActionMenuPresenter.C0314a aVar;
            C0280b bVar = ActionMenuItemView.this.f834m;
            if (bVar == null || (aVar = ActionMenuPresenter.this.f1082v) == null) {
                return null;
            }
            return aVar.mo1207a();
        }

        /* renamed from: c */
        public final boolean mo1029c() {
            C5901f b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0291f.C0293b bVar = actionMenuItemView.f832k;
            if (bVar == null || !bVar.mo1031b(actionMenuItemView.f829h) || (b = mo1028b()) == null || !b.mo1048a()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0280b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final boolean mo1007a() {
        return mo1010d();
    }

    /* renamed from: b */
    public final boolean mo1008b() {
        return mo1010d() && this.f829h.getIcon() == null;
    }

    /* renamed from: c */
    public final void mo1009c(C0295h hVar) {
        int i;
        this.f829h = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f952a);
        if (hVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f833l == null) {
            this.f833l = new C0279a();
        }
    }

    /* renamed from: d */
    public final boolean mo1010d() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: e */
    public final boolean mo1011e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480 || ((i >= 640 && i2 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo1012f() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f830i);
        if (this.f831j != null) {
            if ((this.f829h.f976y & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (!this.f835n && !this.f836o)) {
                z2 = false;
            }
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence3 = null;
        if (z4) {
            charSequence = this.f830i;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f829h.f968q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z4) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f829h.f956e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f829h.f969r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z4) {
                charSequence3 = this.f829h.f956e;
            }
            C0432l1.m1181a(this, charSequence3);
            return;
        }
        C0432l1.m1181a(this, charSequence5);
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C0295h getItemData() {
        return this.f829h;
    }

    public final void onClick(View view) {
        C0291f.C0293b bVar = this.f832k;
        if (bVar != null) {
            bVar.mo1031b(this.f829h);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f835n = mo1011e();
        mo1012f();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean d = mo1010d();
        if (d && (i4 = this.f838q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f837p);
        } else {
            i3 = this.f837p;
        }
        if (mode != 1073741824 && this.f837p > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!d && this.f831j != null) {
            super.setPadding((getMeasuredWidth() - this.f831j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0279a aVar;
        if (!this.f829h.hasSubMenu() || (aVar = this.f833l) == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f836o != z) {
            this.f836o = z;
            C0295h hVar = this.f829h;
            if (hVar != null) {
                C0291f fVar = hVar.f965n;
                fVar.f932k = true;
                fVar.mo1122p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f831j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f839r;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        mo1012f();
    }

    public void setItemInvoker(C0291f.C0293b bVar) {
        this.f832k = bVar;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f838q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0280b bVar) {
        this.f834m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f830i = charSequence;
        mo1012f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f835n = mo1011e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5224j.ActionMenuItemView, i, 0);
        this.f837p = obtainStyledAttributes.getDimensionPixelSize(C5224j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f839r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f838q = -1;
        setSaveEnabled(false);
    }
}
