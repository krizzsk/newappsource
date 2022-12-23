package com.moovit.app.reports.service;

import android.view.LayoutInflater;
import android.widget.TextView;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.tranzmate.R;
import p618kv.C18152i;

/* renamed from: com.moovit.app.reports.service.e */
public final class C15224e extends C15220c {
    public C15224e(MoovitActivity moovitActivity, C15222d.C15223a aVar) {
        super(moovitActivity, R.string.line_didnt_stop_title, R.string.line_didnt_stop_hint, aVar);
        LayoutInflater.from(moovitActivity).inflate(R.layout.free_text_report_layout, this.f39246e, true);
        ((TextView) this.f39246e.findViewById(R.id.free_text_report_label)).setText(R.string.line_didnt_stop_label);
    }

    public C18152i getResult() {
        return new C18152i(this.f39244c.getText().toString());
    }
}
