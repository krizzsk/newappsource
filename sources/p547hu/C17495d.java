package p547hu;

import c00.C13722f;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import java.util.Calendar;
import java.util.HashSet;
import p977zz.C20944i0;

/* renamed from: hu.d */
public final class C17495d implements C13722f<C17493b> {

    /* renamed from: b */
    public final Calendar f45037b;

    /* renamed from: c */
    public final Calendar f45038c = Calendar.getInstance();

    /* renamed from: d */
    public final HashSet f45039d = new HashSet();

    public C17495d(Time time) {
        Calendar instance = Calendar.getInstance();
        this.f45037b = instance;
        instance.setTimeInMillis(time.mo24631g());
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        boolean z;
        C17493b bVar = (C17493b) obj;
        this.f45038c.setTimeInMillis(bVar.f45033e.mo24631g());
        if (C7925b.m18028p(this.f45037b, this.f45038c)) {
            C20944i0 i0Var = new C20944i0(bVar.f45033e, bVar.f45034f);
            if (this.f45039d.contains(i0Var)) {
                z = true;
            } else {
                this.f45039d.add(i0Var);
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }
}
