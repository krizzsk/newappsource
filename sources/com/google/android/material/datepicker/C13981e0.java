package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: com.google.android.material.datepicker.e0 */
public final class C13981e0 implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f34698b;

    /* renamed from: c */
    public final /* synthetic */ C13983f0 f34699c;

    public C13981e0(C13983f0 f0Var, int i) {
        this.f34699c = f0Var;
        this.f34698b = i;
    }

    public final void onClick(View view) {
        Month b = Month.m34864b(this.f34698b, this.f34699c.f34700g.f34643f.f34656c);
        CalendarConstraints calendarConstraints = this.f34699c.f34700g.f34642e;
        if (b.f34655b.compareTo(calendarConstraints.f34621b.f34655b) < 0) {
            b = calendarConstraints.f34621b;
        } else {
            if (b.f34655b.compareTo(calendarConstraints.f34622c.f34655b) > 0) {
                b = calendarConstraints.f34622c;
            }
        }
        this.f34699c.f34700g.mo41520I1(b);
        this.f34699c.f34700g.mo41521J1(MaterialCalendar.CalendarSelector.DAY);
    }
}
