package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p114i.C5224j;

public final class ViewStubCompat extends View {

    /* renamed from: b */
    public int f1425b;

    /* renamed from: c */
    public int f1426c;

    /* renamed from: d */
    public WeakReference<View> f1427d;

    /* renamed from: e */
    public LayoutInflater f1428e;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0379a {
        /* renamed from: a */
        void mo2017a();
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final View mo2005a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1425b != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1428e;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1425b, viewGroup, false);
            int i = this.f1426c;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1427d = new WeakReference<>(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1426c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1428e;
    }

    public int getLayoutResource() {
        return this.f1425b;
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1426c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1428e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1425b = i;
    }

    public void setOnInflateListener(C0379a aVar) {
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1427d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo2005a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1425b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5224j.ViewStubCompat, i, 0);
        this.f1426c = obtainStyledAttributes.getResourceId(C5224j.ViewStubCompat_android_inflatedId, -1);
        this.f1425b = obtainStyledAttributes.getResourceId(C5224j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C5224j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
