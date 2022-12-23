package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: com.google.android.material.datepicker.l */
public final class C13990l implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MaterialCalendar f34715b;

    public C13990l(MaterialCalendar materialCalendar) {
        this.f34715b = materialCalendar;
    }

    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f34715b;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.f34644g;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            materialCalendar.mo41521J1(MaterialCalendar.CalendarSelector.DAY);
        } else if (calendarSelector == MaterialCalendar.CalendarSelector.DAY) {
            materialCalendar.mo41521J1(calendarSelector2);
        }
    }
}
