package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.m */
public final class C13991m implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C14004v f34716b;

    /* renamed from: c */
    public final /* synthetic */ MaterialCalendar f34717c;

    public C13991m(MaterialCalendar materialCalendar, C14004v vVar) {
        this.f34717c = materialCalendar;
        this.f34716b = vVar;
    }

    public final void onClick(View view) {
        int findFirstVisibleItemPosition = ((LinearLayoutManager) this.f34717c.f34647j.getLayoutManager()).findFirstVisibleItemPosition() + 1;
        if (findFirstVisibleItemPosition < this.f34717c.f34647j.getAdapter().getItemCount()) {
            MaterialCalendar materialCalendar = this.f34717c;
            Calendar d = C13979d0.m34894d(this.f34716b.f34762g.f34621b.f34655b);
            d.add(2, findFirstVisibleItemPosition);
            materialCalendar.mo41520I1(new Month(d));
        }
    }
}
