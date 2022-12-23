package com.moovit.app.reports.service;

import android.text.Editable;
import android.view.LayoutInflater;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.tranzmate.R;
import p618kv.C18152i;

/* renamed from: com.moovit.app.reports.service.g */
public final class C15226g extends C15220c {

    /* renamed from: h */
    public boolean f39254h = false;

    /* renamed from: i */
    public float f39255i;

    public C15226g(MoovitActivity moovitActivity, C15222d.C15223a aVar) {
        super(moovitActivity, R.string.line_driver_rank_title, R.string.line_driver_rank_hint, aVar);
        LayoutInflater.from(moovitActivity).inflate(R.layout.rank_selection_report_layout, this.f39246e, true);
        ((RatingBar) this.f39246e.findViewById(R.id.rank)).setOnRatingBarChangeListener(new C15225f(this));
    }

    /* renamed from: a */
    public final void mo45719a(Editable editable) {
        mo45724b();
    }

    /* renamed from: b */
    public final void mo45724b() {
        boolean z = false;
        if (this.f39255i <= BitmapDescriptorFactory.HUE_RED) {
            this.f39245d.setEnabled(false);
        } else if (this.f39254h) {
            TextView textView = this.f39245d;
            if (this.f39244c.length() > 0) {
                z = true;
            }
            textView.setEnabled(z);
        } else {
            this.f39245d.setEnabled(true);
        }
    }

    public C18152i getResult() {
        return new C18152i((int) this.f39255i, this.f39244c.getText().toString());
    }
}
