package com.moovit.commons.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment;
import com.moovit.carpool.CarpoolRideDetour;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.HasCarpoolRide;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import k00.C17988b;
import p241s0.C6302b;
import p622kz.C18159a;
import p622kz.C18165g;
import p754qr.C19163c;

public class CheckedView extends FrameLayout implements Checkable {

    /* renamed from: e */
    public static final int[] f41051e = {16842912};

    /* renamed from: f */
    public static final C15785a f41052f = new C15785a();

    /* renamed from: b */
    public boolean f41053b;

    /* renamed from: c */
    public Drawable f41054c;

    /* renamed from: d */
    public C15786b f41055d;

    /* renamed from: com.moovit.commons.view.CheckedView$a */
    public class C15785a implements View.OnClickListener {
        public final void onClick(View view) {
            ((CheckedView) view).toggle();
        }
    }

    /* renamed from: com.moovit.commons.view.CheckedView$b */
    public interface C15786b {
    }

    public CheckedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18159a.checkedViewStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f41054c;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    public final boolean isChecked() {
        return this.f41053b;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f41053b) {
            View.mergeDrawableStates(onCreateDrawableState, f41051e);
        }
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Drawable drawable = this.f41054c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f41054c.getIntrinsicHeight();
            int height = (getHeight() - intrinsicHeight) / 2;
            if (!C15780a.m40268a(getContext())) {
                i = (getWidth() - intrinsicWidth) - getPaddingRight();
            } else {
                i = getPaddingLeft();
            }
            this.f41054c.setBounds(i, height, intrinsicWidth + i, intrinsicHeight + height);
            this.f41054c.draw(canvas);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable = this.f41054c;
        if (drawable == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        boolean a = C15780a.m40268a(getContext());
        if (a) {
            i += intrinsicWidth;
        } else {
            i3 -= intrinsicWidth;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (a) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                childAt.setLeft(childAt.getLeft() + intrinsicWidth);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        Drawable drawable = this.f41054c;
        if (drawable == null) {
            super.onMeasure(i, i2);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            size = Math.max(0, size - intrinsicWidth);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), i2);
        setMeasuredDimension(getMeasuredWidth() + intrinsicWidth, getMeasuredHeight());
    }

    public void setAutoToggle(boolean z) {
        setOnClickListener(z ? f41052f : null);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C17988b.m44611b(i, getContext()));
    }

    public void setChecked(boolean z) {
        CarpoolRideDetour carpoolRideDetour;
        this.f41053b = z;
        refreshDrawableState();
        C15786b bVar = this.f41055d;
        if (bVar != null) {
            CarpoolRideDetailsFragment carpoolRideDetailsFragment = ((C19163c) bVar).f48743a;
            C6302b<FutureCarpoolRide.InvitationState, CarpoolRideDetailsFragment.RideActionViewConfiguration> bVar2 = CarpoolRideDetailsFragment.f37856J;
            carpoolRideDetailsFragment.mo44914s2();
            if (z) {
                carpoolRideDetour = carpoolRideDetailsFragment.f37860D.getRideDetour();
            } else {
                carpoolRideDetour = null;
            }
            HasCarpoolRide hasCarpoolRide = carpoolRideDetailsFragment.f37862F;
            if (hasCarpoolRide instanceof FutureCarpoolRide) {
                carpoolRideDetailsFragment.f37872t.mo44828d((FutureCarpoolRide) hasCarpoolRide, carpoolRideDetour);
            }
        }
    }

    public void setOnCheckedChangeListener(C15786b bVar) {
        this.f41055d = bVar;
    }

    public final void toggle() {
        setChecked(!this.f41053b);
    }

    /* JADX INFO: finally extract failed */
    public CheckedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41053b = false;
        this.f41054c = null;
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.CheckedView, i);
        try {
            setCheckMarkDrawable(o.getDrawable(C18165g.CheckedView_checkMark));
            setChecked(o.getBoolean(C18165g.CheckedView_checked, false));
            setAutoToggle(o.getBoolean(C18165g.CheckedView_autoToggle, false));
            o.recycle();
            setWillNotDraw(false);
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        Drawable drawable2 = this.f41054c;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f41054c);
        }
        this.f41054c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
        }
        requestLayout();
        invalidate();
    }
}
