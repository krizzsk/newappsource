package k60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import b00.C13556a;
import c70.C13751d;
import h60.C17300a1;
import h60.C17374z0;
import i60.C17559a;
import java.util.Calendar;
import p242s1.C6333d0;
import p501fw.C17102a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p988j$.util.DesugarTimeZone;
import v40.C25750e;
import v40.C25751f;

/* renamed from: k60.b */
public class C18000b extends C17999a implements DatePicker.OnDateChangedListener {

    /* renamed from: r */
    public final C18001a f46090r = new C18001a();

    /* renamed from: s */
    public Button f46091s;

    /* renamed from: t */
    public Calendar f46092t;

    /* renamed from: u */
    public C13556a f46093u = null;

    /* renamed from: k60.b$a */
    public class C18001a extends C20438i<C17374z0, C17300a1> {
        public C18001a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17374z0 z0Var = (C17374z0) cVar;
            C18000b bVar = C18000b.this;
            bVar.f46093u = null;
            bVar.mo50501r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17374z0 z0Var = (C17374z0) cVar;
            C17300a1 a1Var = (C17300a1) gVar;
            C18000b.this.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17374z0 z0Var = (C17374z0) cVar;
            C18000b bVar = C18000b.this;
            bVar.mo46795h2(C13751d.m34341b(bVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_registration_step_birthdate_fragment, viewGroup, false);
        C6333d0.m15030r(inflate.findViewById(C25750e.title), true);
        Button button = (Button) inflate.findViewById(C25750e.button);
        this.f46091s = button;
        button.setOnClickListener(new C17102a(this, 21));
        mo50509y2(inflate);
        return inflate;
    }

    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        this.f46092t = instance;
        instance.set(i, i2, i3, 0, 0, 0);
        boolean z = false;
        this.f46092t.set(14, 0);
        if (this.f46092t != null) {
            z = true;
        }
        this.f46091s.setEnabled(z);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        Calendar calendar = mo50499o2().f42755m;
        if (calendar != null) {
            this.f46092t = calendar;
            mo50509y2(view);
            if (this.f46092t != null) {
                z = true;
            } else {
                z = false;
            }
            this.f46091s.setEnabled(z);
        }
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_birth_date";
    }

    /* renamed from: y2 */
    public final void mo50509y2(View view) {
        Calendar calendar = this.f46092t;
        if (calendar == null) {
            calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            calendar.add(1, -20);
        }
        DatePicker datePicker = (DatePicker) view.findViewById(C25750e.birthDate);
        datePicker.init(calendar.get(1), calendar.get(2), calendar.get(5), this);
        datePicker.setMaxDate(System.currentTimeMillis());
    }
}
