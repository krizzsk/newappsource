package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1240t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.b0 */
public class C13974b0 extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.b0$a */
    public class C13975a extends C1240t {
        public C13975a(Context context) {
            super(context);
        }

        /* renamed from: e */
        public final float mo5009e(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public C13974b0(Context context, int i) {
        super(context, i, false);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C1152x xVar, int i) {
        C13975a aVar = new C13975a(recyclerView.getContext());
        aVar.f4336a = i;
        startSmoothScroll(aVar);
    }
}
