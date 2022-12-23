package p717oz;

import com.moovit.commons.utils.ApplicationBugException;
import java.util.ArrayList;

/* renamed from: oz.a */
public abstract class C18861a<D, L> implements C18862b<D, L> {

    /* renamed from: b */
    public final ArrayList f48032b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f48033c = new ArrayList();

    /* renamed from: d */
    public boolean f48034d = false;

    /* renamed from: e */
    public D f48035e = null;

    /* renamed from: a */
    public final void mo50903a(L l) {
        this.f48032b.add(l);
        if (this.f48032b.size() == 1) {
            mo50011d();
            this.f48034d = true;
        }
    }

    /* renamed from: b */
    public void mo50904b(L l) {
        if (this.f48033c.remove(l)) {
            return;
        }
        if (!this.f48032b.remove(l)) {
            throw new ApplicationBugException();
        } else if (this.f48032b.isEmpty()) {
            mo50012e();
            this.f48034d = false;
        }
    }

    /* renamed from: c */
    public abstract void mo51337c(L l, D d);

    /* renamed from: d */
    public abstract void mo50011d();

    /* renamed from: e */
    public abstract void mo50012e();

    /* renamed from: f */
    public final void mo51338f(D d) {
        mo51339g(d);
        int size = this.f48032b.size();
        for (int i = 0; i < size; i++) {
            mo51337c(this.f48032b.get(i), d);
        }
        int size2 = this.f48033c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mo51337c(this.f48033c.get(i2), d);
        }
    }

    /* renamed from: g */
    public void mo51339g(D d) {
        this.f48035e = d;
    }
}
