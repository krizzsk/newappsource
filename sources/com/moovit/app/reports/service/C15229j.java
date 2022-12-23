package com.moovit.app.reports.service;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.tranzmate.R;
import p618kv.C18152i;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.moovit.app.reports.service.j */
public final class C15229j extends C15220c {

    /* renamed from: h */
    public int f39258h = -1;

    /* renamed from: i */
    public boolean f39259i;

    public C15229j(MoovitActivity moovitActivity, int i, int i2, int i3, C15222d.C15223a aVar) {
        super(moovitActivity, i, i3, aVar);
        LayoutInflater.from(moovitActivity).inflate(R.layout.single_selection_report_layout, this.f39246e, true);
        String[] stringArray = getResources().getStringArray(i2);
        ListView listView = (ListView) this.f39246e.findViewById(R.id.options);
        listView.setAdapter(new ArrayAdapter(getContext(), R.layout.report_single_choise_list_item, stringArray));
        listView.setOnItemClickListener(new C15228i(this));
        this.f39259i = false;
    }

    /* renamed from: a */
    public final void mo45719a(Editable editable) {
        if (this.f39258h != -1) {
            boolean z = true;
            if (this.f39259i) {
                TextView textView = this.f39245d;
                if (this.f39244c.length() <= 0) {
                    z = false;
                }
                textView.setEnabled(z);
                return;
            }
            this.f39245d.setEnabled(true);
        }
    }

    public C18152i getResult() {
        return new C18152i(this.f39258h, this.f39244c.getText().toString());
    }
}
