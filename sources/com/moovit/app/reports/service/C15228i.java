package com.moovit.app.reports.service;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

/* renamed from: com.moovit.app.reports.service.i */
public final class C15228i implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C15229j f39257b;

    public C15228i(C15229j jVar) {
        this.f39257b = jVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean z = true;
        ((ListView) adapterView).setItemChecked(i, true);
        C15229j jVar = this.f39257b;
        jVar.f39258h = i;
        if (jVar.f39259i) {
            TextView textView = jVar.f39245d;
            if (jVar.f39244c.length() <= 0) {
                z = false;
            }
            textView.setEnabled(z);
            return;
        }
        jVar.f39245d.setEnabled(true);
    }
}
