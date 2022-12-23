package com.moovit.commons.view.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HeightAwareLinearLayoutManager extends LinearLayoutManager {
    public final void onMeasure(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (getItemCount() > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            View d = sVar.mo4919d(0);
            super.measureChildWithMargins(d, 0, 0);
            if (d != null) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) d.getLayoutParams();
                d.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, getDecoratedRight(d) + getDecoratedLeft(d) + getPaddingRight() + getPaddingLeft(), layoutParams.width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, getDecoratedBottom(d) + getPaddingBottom() + getPaddingBottom() + getPaddingTop(), layoutParams.height));
                getDecoratedMeasuredWidth(d);
                throw null;
            } else if (getOrientation() == 0) {
                throw null;
            } else {
                throw null;
            }
        } else if (size2 <= 0 || size <= 0) {
            super.onMeasure(sVar, xVar, i, i2);
        } else {
            if (mode != 1073741824) {
                size = 0;
            }
            if (mode2 != 1073741824) {
                size2 = 0;
            }
            setMeasuredDimension(size, size2);
        }
    }
}
