package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import p229r1.C6233c;

/* renamed from: com.google.android.material.datepicker.i */
public final class C13987i extends RecyclerView.C1133l {

    /* renamed from: b */
    public final Calendar f34708b = C13979d0.m34899i((Calendar) null);

    /* renamed from: c */
    public final Calendar f34709c = C13979d0.m34899i((Calendar) null);

    /* renamed from: d */
    public final /* synthetic */ MaterialCalendar f34710d;

    public C13987i(MaterialCalendar materialCalendar) {
        this.f34710d = materialCalendar;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int i;
        int i2;
        if ((recyclerView.getAdapter() instanceof C13983f0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C13983f0 f0Var = (C13983f0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (C6233c cVar : this.f34710d.f34641d.mo41504a1()) {
                F f = cVar.f19679a;
                if (!(f == null || cVar.f19680b == null)) {
                    this.f34708b.setTimeInMillis(((Long) f).longValue());
                    this.f34709c.setTimeInMillis(((Long) cVar.f19680b).longValue());
                    int i3 = this.f34708b.get(1) - f0Var.f34700g.f34642e.f34621b.f34657d;
                    int i4 = this.f34709c.get(1) - f0Var.f34700g.f34642e.f34621b.f34657d;
                    View findViewByPosition = gridLayoutManager.findViewByPosition(i3);
                    View findViewByPosition2 = gridLayoutManager.findViewByPosition(i4);
                    int spanCount = i3 / gridLayoutManager.getSpanCount();
                    int spanCount2 = i4 / gridLayoutManager.getSpanCount();
                    for (int i5 = spanCount; i5 <= spanCount2; i5++) {
                        View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i5);
                        if (findViewByPosition3 != null) {
                            int top = findViewByPosition3.getTop() + this.f34710d.f34645h.f34679d.f34668a.top;
                            int bottom = findViewByPosition3.getBottom() - this.f34710d.f34645h.f34679d.f34668a.bottom;
                            if (i5 == spanCount) {
                                i = (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft();
                            } else {
                                i = 0;
                            }
                            if (i5 == spanCount2) {
                                i2 = (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft();
                            } else {
                                i2 = recyclerView.getWidth();
                            }
                            canvas.drawRect((float) i, (float) top, (float) i2, (float) bottom, this.f34710d.f34645h.f34683h);
                        }
                    }
                }
            }
        }
    }
}
