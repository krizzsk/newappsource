package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0745b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p002a1.C0042d;

public class ReactiveGuide extends View implements C0745b.C0746a {

    /* renamed from: b */
    public int f3102b = -1;

    /* renamed from: c */
    public boolean f3103c = false;

    /* renamed from: d */
    public int f3104d = 0;

    /* renamed from: e */
    public boolean f3105e = true;

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
        mo3221a(attributeSet);
    }

    /* renamed from: a */
    public final void mo3221a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f3102b = obtainStyledAttributes.getResourceId(index, this.f3102b);
                } else if (index == C0042d.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f3103c = obtainStyledAttributes.getBoolean(index, this.f3103c);
                } else if (index == C0042d.f39x2694048c) {
                    this.f3104d = obtainStyledAttributes.getResourceId(index, this.f3104d);
                } else if (index == C0042d.f38xfdeff96) {
                    this.f3105e = obtainStyledAttributes.getBoolean(index, this.f3105e);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f3102b != -1) {
            ConstraintLayout.getSharedValues().mo3261a(this.f3102b, this);
        }
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f3104d;
    }

    public int getAttributeId() {
        return this.f3102b;
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f3103c = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f3104d = i;
    }

    public void setAttributeId(int i) {
        HashSet hashSet;
        C0745b sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f3102b;
        if (!(i2 == -1 || (hashSet = sharedValues.f3240a.get(Integer.valueOf(i2))) == null)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0745b.C0746a aVar = (C0745b.C0746a) weakReference.get();
                if (aVar == null || aVar == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f3102b = i;
        if (i != -1) {
            sharedValues.mo3261a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f3031a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f3033b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f3035c = f;
        setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
        mo3221a(attributeSet);
    }
}
