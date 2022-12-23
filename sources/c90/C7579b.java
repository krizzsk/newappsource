package c90;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import c00.C13717b;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.ticketing.purchase.history.Transaction;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import p054d0.C4267a0;
import p244s3.C6442q;
import p693nz.C18659h;
import p923xs.C20576h;
import p977zz.C20944i0;
import p977zz.C20961r;
import p977zz.C20963s;
import q80.C13039z;
import w40.C25761d;

/* renamed from: c90.b */
public final class C7579b extends C0989a {

    /* renamed from: c */
    public final C1001d0 f23077c;

    /* renamed from: d */
    public final Calendar f23078d;

    /* renamed from: e */
    public final C1043v<Calendar> f23079e;

    /* renamed from: f */
    public final C1040t<C20961r<C20944i0<Calendar, List<Transaction>>>> f23080f;

    /* renamed from: g */
    public final C18659h<String, List<Transaction>> f23081g = new C18659h<>(5);

    public C7579b(Application application, C1001d0 d0Var) {
        super(application);
        Calendar instance = Calendar.getInstance();
        this.f23078d = instance;
        C21100e.m49373x(d0Var, "savedState");
        this.f23077c = d0Var;
        C1043v<Calendar> d = d0Var.mo4294d(true, "month", instance);
        this.f23079e = d;
        C1040t<C20961r<C20944i0<Calendar, List<Transaction>>>> tVar = new C1040t<>();
        this.f23080f = tVar;
        tVar.addSource(d, new C20576h(this, 5));
    }

    /* renamed from: a */
    public final void mo23841a(Calendar calendar, boolean z) {
        List list;
        if (!C25761d.m64299a().mo83590e()) {
            this.f23080f.postValue(new C20961r(new C20944i0(calendar, Collections.emptyList())));
            return;
        }
        int i = calendar.get(2);
        int i2 = calendar.get(1);
        String str = i + "_" + i2;
        if (z) {
            list = this.f23081g.get(str);
        } else {
            list = null;
        }
        if (!C13717b.m34258e(list)) {
            this.f23080f.postValue(new C20961r(new C20944i0(calendar, list)));
            return;
        }
        Tasks.call(MoovitExecutors.f37327IO, new C13039z(((MoovitApplication) this.f3907b).mo44560l(), i + 1, i2)).onSuccessTask(MoovitExecutors.COMPUTATION, new C4267a0(calendar, 17)).addOnSuccessListener(new C6442q(5, this, str)).addOnCompleteListener(new C20963s(this.f23080f));
    }
}
