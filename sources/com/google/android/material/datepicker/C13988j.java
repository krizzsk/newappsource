package com.google.android.material.datepicker;

import android.view.View;
import p242s1.C6315a;
import p255t1.C6531g;
import p355ac.C13409j;

/* renamed from: com.google.android.material.datepicker.j */
public final class C13988j extends C6315a {

    /* renamed from: a */
    public final /* synthetic */ MaterialCalendar f34711a;

    public C13988j(MaterialCalendar materialCalendar) {
        this.f34711a = materialCalendar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
        String str;
        super.onInitializeAccessibilityNodeInfo(view, gVar);
        if (this.f34711a.f34649l.getVisibility() == 0) {
            str = this.f34711a.getString(C13409j.mtrl_picker_toggle_to_year_selection);
        } else {
            str = this.f34711a.getString(C13409j.mtrl_picker_toggle_to_day_selection);
        }
        gVar.mo22647l(str);
    }
}
