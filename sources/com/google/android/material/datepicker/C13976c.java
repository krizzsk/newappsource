package com.google.android.material.datepicker;

import android.content.Context;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.util.Date;
import p001a0.C0017h;
import p355ac.C13409j;

/* renamed from: com.google.android.material.datepicker.c */
public final class C13976c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f34684b;

    /* renamed from: c */
    public final /* synthetic */ C13980e f34685c;

    public C13976c(C13980e eVar, String str) {
        this.f34685c = eVar;
        this.f34684b = str;
    }

    public final void run() {
        C13980e eVar = this.f34685c;
        TextInputLayout textInputLayout = eVar.f34692b;
        DateFormat dateFormat = eVar.f34693c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(C0017h.m56M(context.getString(C13409j.mtrl_picker_invalid_format), "\n", String.format(context.getString(C13409j.mtrl_picker_invalid_format_use), new Object[]{this.f34684b}), "\n", String.format(context.getString(C13409j.mtrl_picker_invalid_format_example), new Object[]{dateFormat.format(new Date(C13979d0.m34898h().getTimeInMillis()))})));
        this.f34685c.mo41552a();
    }
}
