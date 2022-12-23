package com.google.android.material.datepicker;

import com.google.android.material.datepicker.C14000s;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* renamed from: com.google.android.material.datepicker.z */
public final class C14009z extends C13980e {

    /* renamed from: h */
    public final /* synthetic */ TextInputLayout f34773h;

    /* renamed from: i */
    public final /* synthetic */ TextInputLayout f34774i;

    /* renamed from: j */
    public final /* synthetic */ C14006w f34775j;

    /* renamed from: k */
    public final /* synthetic */ RangeDateSelector f34776k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14009z(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C14000s.C14001a aVar) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f34776k = rangeDateSelector;
        this.f34773h = textInputLayout2;
        this.f34774i = textInputLayout3;
        this.f34775j = aVar;
    }

    /* renamed from: a */
    public final void mo41552a() {
        RangeDateSelector rangeDateSelector = this.f34776k;
        rangeDateSelector.f34666f = null;
        RangeDateSelector.m34869b(rangeDateSelector, this.f34773h, this.f34774i, this.f34775j);
    }

    /* renamed from: b */
    public final void mo41553b(Long l) {
        RangeDateSelector rangeDateSelector = this.f34776k;
        rangeDateSelector.f34666f = l;
        RangeDateSelector.m34869b(rangeDateSelector, this.f34773h, this.f34774i, this.f34775j);
    }
}
