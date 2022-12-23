package com.google.android.material.datepicker;

import com.google.android.material.datepicker.C14000s;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* renamed from: com.google.android.material.datepicker.y */
public final class C14008y extends C13980e {

    /* renamed from: h */
    public final /* synthetic */ TextInputLayout f34769h;

    /* renamed from: i */
    public final /* synthetic */ TextInputLayout f34770i;

    /* renamed from: j */
    public final /* synthetic */ C14006w f34771j;

    /* renamed from: k */
    public final /* synthetic */ RangeDateSelector f34772k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14008y(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C14000s.C14001a aVar) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f34772k = rangeDateSelector;
        this.f34769h = textInputLayout2;
        this.f34770i = textInputLayout3;
        this.f34771j = aVar;
    }

    /* renamed from: a */
    public final void mo41552a() {
        RangeDateSelector rangeDateSelector = this.f34772k;
        rangeDateSelector.f34665e = null;
        RangeDateSelector.m34869b(rangeDateSelector, this.f34769h, this.f34770i, this.f34771j);
    }

    /* renamed from: b */
    public final void mo41553b(Long l) {
        RangeDateSelector rangeDateSelector = this.f34772k;
        rangeDateSelector.f34665e = l;
        RangeDateSelector.m34869b(rangeDateSelector, this.f34769h, this.f34770i, this.f34771j);
    }
}
