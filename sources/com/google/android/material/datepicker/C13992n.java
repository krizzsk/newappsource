package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.n */
public final class C13992n implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C14004v f34718b;

    /* renamed from: c */
    public final /* synthetic */ MaterialCalendar f34719c;

    public C13992n(MaterialCalendar materialCalendar, C14004v vVar) {
        this.f34719c = materialCalendar;
        this.f34718b = vVar;
    }

    public final void onClick(View view) {
        int findLastVisibleItemPosition = ((LinearLayoutManager) this.f34719c.f34647j.getLayoutManager()).findLastVisibleItemPosition() - 1;
        if (findLastVisibleItemPosition >= 0) {
            MaterialCalendar materialCalendar = this.f34719c;
            Calendar d = C13979d0.m34894d(this.f34718b.f34762g.f34621b.f34655b);
            d.add(2, findLastVisibleItemPosition);
            materialCalendar.mo41520I1(new Month(d));
        }
    }
}
