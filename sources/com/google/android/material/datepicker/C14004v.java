package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import p242s1.C6333d0;
import p355ac.C13403d;
import p355ac.C13405f;
import p355ac.C13407h;

/* renamed from: com.google.android.material.datepicker.v */
public final class C14004v extends RecyclerView.Adapter<C14005a> {

    /* renamed from: g */
    public final CalendarConstraints f34762g;

    /* renamed from: h */
    public final DateSelector<?> f34763h;

    /* renamed from: i */
    public final MaterialCalendar.C13966d f34764i;

    /* renamed from: j */
    public final int f34765j;

    /* renamed from: com.google.android.material.datepicker.v$a */
    public static class C14005a extends RecyclerView.C1119a0 {

        /* renamed from: d */
        public final TextView f34766d;

        /* renamed from: e */
        public final MaterialCalendarGridView f34767e;

        public C14005a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C13405f.month_title);
            this.f34766d = textView;
            C6333d0.m15030r(textView, true);
            this.f34767e = (MaterialCalendarGridView) linearLayout.findViewById(C13405f.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public C14004v(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, MaterialCalendar.C13965c cVar) {
        int i;
        Month month = calendarConstraints.f34621b;
        Month month2 = calendarConstraints.f34622c;
        Month month3 = calendarConstraints.f34624e;
        if (month.f34655b.compareTo(month3.f34655b) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (month3.f34655b.compareTo(month2.f34655b) <= 0) {
            int i2 = C14002t.f34754g;
            int i3 = MaterialCalendar.f34639m;
            Resources resources = contextThemeWrapper.getResources();
            int i4 = C13403d.mtrl_calendar_day_height;
            int dimensionPixelSize = resources.getDimensionPixelSize(i4) * i2;
            if (C13993o.m34910J1(contextThemeWrapper)) {
                i = contextThemeWrapper.getResources().getDimensionPixelSize(i4);
            } else {
                i = 0;
            }
            this.f34765j = dimensionPixelSize + i;
            this.f34762g = calendarConstraints;
            this.f34763h = dateSelector;
            this.f34764i = cVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int getItemCount() {
        return this.f34762g.f34626g;
    }

    public final long getItemId(int i) {
        Calendar d = C13979d0.m34894d(this.f34762g.f34621b.f34655b);
        d.add(2, i);
        return new Month(d).f34655b.getTimeInMillis();
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C14005a aVar = (C14005a) a0Var;
        Calendar d = C13979d0.m34894d(this.f34762g.f34621b.f34655b);
        d.add(2, i);
        Month month = new Month(d);
        aVar.f34766d.setText(month.mo41539j());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f34767e.findViewById(C13405f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !month.equals(materialCalendarGridView.getAdapter().f34755b)) {
            C14002t tVar = new C14002t(month, this.f34763h, this.f34762g);
            materialCalendarGridView.setNumColumns(month.f34658e);
            materialCalendarGridView.setAdapter((ListAdapter) tVar);
        } else {
            materialCalendarGridView.invalidate();
            C14002t a = materialCalendarGridView.getAdapter();
            for (Long longValue : a.f34757d) {
                a.mo41580f(materialCalendarGridView, longValue.longValue());
            }
            DateSelector<?> dateSelector = a.f34756c;
            if (dateSelector != null) {
                for (Long longValue2 : dateSelector.mo41500N1()) {
                    a.mo41580f(materialCalendarGridView, longValue2.longValue());
                }
                a.f34757d = a.f34756c.mo41500N1();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C14003u(this, materialCalendarGridView));
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C13407h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C13993o.m34910J1(viewGroup.getContext())) {
            return new C14005a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f34765j));
        return new C14005a(linearLayout, true);
    }
}
