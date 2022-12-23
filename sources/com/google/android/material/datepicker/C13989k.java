package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.k */
public final class C13989k extends RecyclerView.C1142q {

    /* renamed from: a */
    public final /* synthetic */ C14004v f34712a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f34713b;

    /* renamed from: c */
    public final /* synthetic */ MaterialCalendar f34714c;

    public C13989k(MaterialCalendar materialCalendar, C14004v vVar, MaterialButton materialButton) {
        this.f34714c = materialCalendar;
        this.f34712a = vVar;
        this.f34713b = materialButton;
    }

    /* renamed from: a */
    public final void mo4913a(int i, RecyclerView recyclerView) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f34713b.getText());
        }
    }

    /* renamed from: b */
    public final void mo4914b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (i < 0) {
            i3 = ((LinearLayoutManager) this.f34714c.f34647j.getLayoutManager()).findFirstVisibleItemPosition();
        } else {
            i3 = ((LinearLayoutManager) this.f34714c.f34647j.getLayoutManager()).findLastVisibleItemPosition();
        }
        MaterialCalendar materialCalendar = this.f34714c;
        Calendar d = C13979d0.m34894d(this.f34712a.f34762g.f34621b.f34655b);
        d.add(2, i3);
        materialCalendar.f34643f = new Month(d);
        MaterialButton materialButton = this.f34713b;
        Calendar d2 = C13979d0.m34894d(this.f34712a.f34762g.f34621b.f34655b);
        d2.add(2, i3);
        materialButton.setText(new Month(d2).mo41539j());
    }
}
