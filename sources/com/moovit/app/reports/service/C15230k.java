package com.moovit.app.reports.service;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.tranzmate.R;
import p054d0.C4273c0;
import p618kv.C18152i;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.moovit.app.reports.service.k */
public final class C15230k extends C15220c {

    /* renamed from: h */
    public int f39260h;

    /* renamed from: i */
    public final boolean f39261i = false;

    public C15230k(MoovitActivity moovitActivity, int i, int i2, int i3, int i4, C15222d.C15223a aVar) {
        super(moovitActivity, i, i4, aVar);
        LayoutInflater.from(moovitActivity).inflate(R.layout.slide_bar_layout, this.f39246e, true);
        String[] stringArray = getResources().getStringArray(i2);
        ReportBarView reportBarView = (ReportBarView) this.f39246e.findViewById(R.id.report_bar);
        reportBarView.setContentDescription(moovitActivity.getString(i));
        reportBarView.setOptionsArray(i3);
        reportBarView.setReportOptionChangeListener(new C4273c0(3, this, stringArray));
        this.f39243b.setSubtitle((CharSequence) stringArray[0]);
        this.f39245d.setEnabled(true);
    }

    /* renamed from: a */
    public final void mo45719a(Editable editable) {
        boolean z = true;
        if (this.f39261i) {
            TextView textView = this.f39245d;
            if (this.f39244c.length() <= 0) {
                z = false;
            }
            textView.setEnabled(z);
            return;
        }
        this.f39245d.setEnabled(true);
    }

    public C18152i getResult() {
        return new C18152i(this.f39260h, this.f39244c.getText().toString());
    }
}
