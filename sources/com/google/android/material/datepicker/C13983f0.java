package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Locale;
import p355ac.C13407h;
import p355ac.C13409j;

/* renamed from: com.google.android.material.datepicker.f0 */
public final class C13983f0 extends RecyclerView.Adapter<C13984a> {

    /* renamed from: g */
    public final MaterialCalendar<?> f34700g;

    /* renamed from: com.google.android.material.datepicker.f0$a */
    public static class C13984a extends RecyclerView.C1119a0 {

        /* renamed from: d */
        public final TextView f34701d;

        public C13984a(TextView textView) {
            super(textView);
            this.f34701d = textView;
        }
    }

    public C13983f0(MaterialCalendar<?> materialCalendar) {
        this.f34700g = materialCalendar;
    }

    public final int getItemCount() {
        return this.f34700g.f34642e.f34625f;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C13971a aVar;
        C13984a aVar2 = (C13984a) a0Var;
        int i2 = this.f34700g.f34642e.f34621b.f34657d + i;
        String string = aVar2.f34701d.getContext().getString(C13409j.mtrl_picker_navigate_to_year_description);
        aVar2.f34701d.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        aVar2.f34701d.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i2)}));
        C13973b bVar = this.f34700g.f34645h;
        Calendar h = C13979d0.m34898h();
        if (h.get(1) == i2) {
            aVar = bVar.f34681f;
        } else {
            aVar = bVar.f34679d;
        }
        for (Long longValue : this.f34700g.f34641d.mo41500N1()) {
            h.setTimeInMillis(longValue.longValue());
            if (h.get(1) == i2) {
                aVar = bVar.f34680e;
            }
        }
        aVar.mo41551b(aVar2.f34701d);
        aVar2.f34701d.setOnClickListener(new C13981e0(this, i2));
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C13984a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C13407h.mtrl_calendar_year, viewGroup, false));
    }
}
