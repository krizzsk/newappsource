package com.moovit.commons.view.list;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ListView;
import i00.C17525d;

public class FakeWindowBgListView extends ListView {

    /* renamed from: b */
    public final C17525d f41187b;

    public FakeWindowBgListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41187b = C17525d.m43657c(context);
    }

    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        super.draw(canvas);
        C17525d dVar = this.f41187b;
        if (dVar.f45111a != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            dVar.mo49976b(canvas, this);
            int childCount = getChildCount() - 1;
            if (childCount >= 0) {
                i = getChildAt(childCount).getBottom();
            } else {
                i = getPaddingTop();
            }
            dVar.mo49975a(canvas, this, 0, i, getWidth(), getHeight() - getPaddingBottom());
        }
    }

    public FakeWindowBgListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41187b = C17525d.m43657c(context);
    }
}
