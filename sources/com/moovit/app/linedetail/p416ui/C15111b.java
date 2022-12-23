package com.moovit.app.linedetail.p416ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.app.linedetail.p416ui.LineTripPatternActivity;

/* renamed from: com.moovit.app.linedetail.ui.b */
public final class C15111b extends BottomSheetBehavior.C13920c {

    /* renamed from: b */
    public final /* synthetic */ LineTripPatternActivity f38858b;

    public C15111b(LineTripPatternActivity lineTripPatternActivity) {
        this.f38858b = lineTripPatternActivity;
    }

    public final void onSlide(View view, float f) {
    }

    public final void onStateChanged(View view, int i) {
        RecyclerView.Adapter adapter = this.f38858b.f38771l0.getAdapter();
        if (adapter instanceof LineTripPatternActivity.C15099e) {
            adapter.notifyItemChanged(0);
        }
    }
}
