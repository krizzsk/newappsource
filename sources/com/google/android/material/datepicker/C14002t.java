package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.t */
public final class C14002t extends BaseAdapter {

    /* renamed from: g */
    public static final int f34754g = C13979d0.m34899i((Calendar) null).getMaximum(4);

    /* renamed from: b */
    public final Month f34755b;

    /* renamed from: c */
    public final DateSelector<?> f34756c;

    /* renamed from: d */
    public Collection<Long> f34757d;

    /* renamed from: e */
    public C13973b f34758e;

    /* renamed from: f */
    public final CalendarConstraints f34759f;

    public C14002t(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f34755b = month;
        this.f34756c = dateSelector;
        this.f34759f = calendarConstraints;
        this.f34757d = dateSelector.mo41500N1();
    }

    /* renamed from: a */
    public final int mo41576a() {
        return this.f34755b.mo41536f();
    }

    /* renamed from: b */
    public final Long getItem(int i) {
        if (i < this.f34755b.mo41536f() || i > mo41578c()) {
            return null;
        }
        Month month = this.f34755b;
        return Long.valueOf(month.mo41537g((i - month.mo41536f()) + 1));
    }

    /* renamed from: c */
    public final int mo41578c() {
        return (this.f34755b.mo41536f() + this.f34755b.f34659f) - 1;
    }

    /* renamed from: d */
    public final void mo41579d(TextView textView, long j) {
        C13971a aVar;
        if (textView != null) {
            boolean z = false;
            if (this.f34759f.f34623d.mo41488v0(j)) {
                textView.setEnabled(true);
                Iterator it = this.f34756c.mo41500N1().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C13979d0.m34891a(j) == C13979d0.m34891a(((Long) it.next()).longValue())) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    aVar = this.f34758e.f34677b;
                } else if (C13979d0.m34898h().getTimeInMillis() == j) {
                    aVar = this.f34758e.f34678c;
                } else {
                    aVar = this.f34758e.f34676a;
                }
            } else {
                textView.setEnabled(false);
                aVar = this.f34758e.f34682g;
            }
            aVar.mo41551b(textView);
        }
    }

    /* renamed from: f */
    public final void mo41580f(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m34865c(j).equals(this.f34755b)) {
            Calendar d = C13979d0.m34894d(this.f34755b.f34655b);
            d.setTimeInMillis(j);
            int i = d.get(5);
            mo41579d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().mo41576a() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public final int getCount() {
        return mo41576a() + this.f34755b.f34659f;
    }

    public final long getItemId(int i) {
        return (long) (i / this.f34755b.f34658e);
    }

    /* JADX WARNING: type inference failed for: r8v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            android.content.Context r0 = r9.getContext()
            com.google.android.material.datepicker.b r1 = r6.f34758e
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.b r1 = new com.google.android.material.datepicker.b
            r1.<init>(r0)
            r6.f34758e = r1
        L_0x000f:
            r0 = r8
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r8 != 0) goto L_0x0026
            android.content.Context r8 = r9.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r0 = p355ac.C13407h.mtrl_calendar_day
            android.view.View r8 = r8.inflate(r0, r9, r1)
            r0 = r8
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0026:
            int r8 = r6.mo41576a()
            int r8 = r7 - r8
            if (r8 < 0) goto L_0x0082
            com.google.android.material.datepicker.Month r9 = r6.f34755b
            int r2 = r9.f34659f
            if (r8 < r2) goto L_0x0035
            goto L_0x0082
        L_0x0035:
            r2 = 1
            int r8 = r8 + r2
            r0.setTag(r9)
            android.content.res.Resources r9 = r0.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            java.util.Locale r9 = r9.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r9 = java.lang.String.format(r9, r4, r3)
            r0.setText(r9)
            com.google.android.material.datepicker.Month r9 = r6.f34755b
            long r8 = r9.mo41537g(r8)
            com.google.android.material.datepicker.Month r3 = r6.f34755b
            int r3 = r3.f34657d
            com.google.android.material.datepicker.Month r4 = new com.google.android.material.datepicker.Month
            java.util.Calendar r5 = com.google.android.material.datepicker.C13979d0.m34898h()
            r4.<init>(r5)
            int r4 = r4.f34657d
            if (r3 != r4) goto L_0x0074
            java.lang.String r8 = com.google.android.material.datepicker.C13982f.m34904c(r8)
            r0.setContentDescription(r8)
            goto L_0x007b
        L_0x0074:
            java.lang.String r8 = com.google.android.material.datepicker.C13982f.m34906e(r8)
            r0.setContentDescription(r8)
        L_0x007b:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x008a
        L_0x0082:
            r8 = 8
            r0.setVisibility(r8)
            r0.setEnabled(r1)
        L_0x008a:
            java.lang.Long r7 = r6.getItem(r7)
            if (r7 != 0) goto L_0x0091
            goto L_0x0098
        L_0x0091:
            long r7 = r7.longValue()
            r6.mo41579d(r0, r7)
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C14002t.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
