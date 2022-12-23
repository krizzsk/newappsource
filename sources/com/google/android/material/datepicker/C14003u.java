package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.u */
public final class C14003u implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ MaterialCalendarGridView f34760b;

    /* renamed from: c */
    public final /* synthetic */ C14004v f34761c;

    public C14003u(C14004v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f34761c = vVar;
        this.f34760b = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean z;
        C14002t a = this.f34760b.getAdapter();
        if (i < a.mo41576a() || i > a.mo41578c()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            MaterialCalendar.C13966d dVar = this.f34761c.f34764i;
            long longValue = this.f34760b.getAdapter().getItem(i).longValue();
            MaterialCalendar.C13965c cVar = (MaterialCalendar.C13965c) dVar;
            if (MaterialCalendar.this.f34642e.f34623d.mo41488v0(longValue)) {
                MaterialCalendar.this.f34641d.mo41503Y1(longValue);
                Iterator<C14006w<S>> it = MaterialCalendar.this.f34768b.iterator();
                while (it.hasNext()) {
                    it.next().mo41573b(MaterialCalendar.this.f34641d.mo41501S1());
                }
                MaterialCalendar.this.f34647j.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = MaterialCalendar.this.f34646i;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
