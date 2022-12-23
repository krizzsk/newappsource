package com.google.android.material.datepicker;

import com.google.android.material.datepicker.C14000s;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* renamed from: com.google.android.material.datepicker.a0 */
public final class C13972a0 extends C13980e {

    /* renamed from: h */
    public final /* synthetic */ C14006w f34674h;

    /* renamed from: i */
    public final /* synthetic */ SingleDateSelector f34675i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13972a0(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, C14000s.C14001a aVar) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f34675i = singleDateSelector;
        this.f34674h = aVar;
    }

    /* renamed from: a */
    public final void mo41552a() {
        this.f34674h.mo41572a();
    }

    /* renamed from: b */
    public final void mo41553b(Long l) {
        if (l == null) {
            this.f34675i.f34667b = null;
        } else {
            this.f34675i.mo41503Y1(l.longValue());
        }
        this.f34674h.mo41573b(this.f34675i.f34667b);
    }
}
