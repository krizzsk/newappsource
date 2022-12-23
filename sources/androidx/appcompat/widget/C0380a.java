package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0291f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p114i.C5215a;
import p114i.C5224j;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6386q0;

/* renamed from: androidx.appcompat.widget.a */
public abstract class C0380a extends ViewGroup {

    /* renamed from: b */
    public final C0381a f1429b;

    /* renamed from: c */
    public final Context f1430c;

    /* renamed from: d */
    public ActionMenuView f1431d;

    /* renamed from: e */
    public ActionMenuPresenter f1432e;

    /* renamed from: f */
    public int f1433f;

    /* renamed from: g */
    public C6382p0 f1434g;

    /* renamed from: h */
    public boolean f1435h;

    /* renamed from: i */
    public boolean f1436i;

    /* renamed from: androidx.appcompat.widget.a$a */
    public class C0381a implements C6386q0 {

        /* renamed from: b */
        public boolean f1437b = false;

        /* renamed from: c */
        public int f1438c;

        public C0381a() {
        }

        /* renamed from: a */
        public final void mo2022a(View view) {
            this.f1437b = true;
        }

        /* renamed from: b */
        public final void mo909b(View view) {
            if (!this.f1437b) {
                C0380a aVar = C0380a.this;
                aVar.f1434g = null;
                C0380a.super.setVisibility(this.f1438c);
            }
        }

        /* renamed from: d */
        public final void mo957d() {
            C0380a.super.setVisibility(0);
            this.f1437b = false;
        }
    }

    public C0380a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public static int m927c(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    /* renamed from: d */
    public static int m928d(View view, boolean z, int i, int i2, int i3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    /* renamed from: e */
    public final C6382p0 mo2018e(int i, long j) {
        C6382p0 p0Var = this.f1434g;
        if (p0Var != null) {
            p0Var.mo22492b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            C6382p0 a = C6333d0.m15013a(this);
            a.mo22491a(1.0f);
            a.mo22495e(j);
            C0381a aVar = this.f1429b;
            C0380a.this.f1434g = a;
            aVar.f1438c = i;
            a.mo22497g(aVar);
            return a;
        }
        C6382p0 a2 = C6333d0.m15013a(this);
        a2.mo22491a(BitmapDescriptorFactory.HUE_RED);
        a2.mo22495e(j);
        C0381a aVar2 = this.f1429b;
        C0380a.this.f1434g = a2;
        aVar2.f1438c = i;
        a2.mo22497g(aVar2);
        return a2;
    }

    public int getAnimatedVisibility() {
        if (this.f1434g != null) {
            return this.f1429b.f1438c;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1433f;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C5224j.ActionBar, C5215a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C5224j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1432e;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f861c.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else if (i2 >= 360) {
                i = 3;
            } else {
                i = 2;
            }
            actionMenuPresenter.f1078r = i;
            C0291f fVar = actionMenuPresenter.f862d;
            if (fVar != null) {
                fVar.mo1122p(true);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1436i = false;
        }
        if (!this.f1436i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1436i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1436i = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1435h = false;
        }
        if (!this.f1435h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1435h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1435h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1433f = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C6382p0 p0Var = this.f1434g;
            if (p0Var != null) {
                p0Var.mo22492b();
            }
            super.setVisibility(i);
        }
    }

    public C0380a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1429b = new C0381a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C5215a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1430c = context;
        } else {
            this.f1430c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
