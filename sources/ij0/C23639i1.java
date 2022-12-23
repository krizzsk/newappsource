package ij0;

import androidx.appcompat.app.C0262r;
import ij0.C23669s0;
import java.lang.reflect.Array;
import kj0.C23808c;
import kj0.C23810e;
import lj0.C24331h;
import org.simpleframework.xml.core.C24655m;
import org.simpleframework.xml.core.C24664u;
import org.simpleframework.xml.core.ElementException;
import p446dp.C16694c;

/* renamed from: ij0.i1 */
public final class C23639i1 implements C23662q {

    /* renamed from: a */
    public Object f59775a;

    /* renamed from: b */
    public Object f59776b;

    /* renamed from: c */
    public Object f59777c;

    /* renamed from: d */
    public Object f59778d;

    /* renamed from: e */
    public Object f59779e;

    public /* synthetic */ C23639i1(C23808c cVar, C24664u uVar, C23654n1 n1Var) {
        C23664q1 q1Var = new C23664q1(this, uVar);
        this.f59779e = q1Var;
        this.f59775a = new C16694c(q1Var);
        this.f59776b = cVar;
        this.f59777c = uVar;
        this.f59778d = n1Var;
    }

    /* renamed from: a */
    public final Object mo58815a(C24331h hVar, Object obj) throws Exception {
        int length = Array.getLength(obj);
        int i = 0;
        while (true) {
            C0262r position = hVar.getPosition();
            C24331h b = hVar.mo60485b();
            if (b == null) {
                return obj;
            }
            if (i < length) {
                Array.set(obj, i, ((C24655m) this.f59776b).mo58816b(b));
                i++;
            } else {
                throw new ElementException("Array length missing or incorrect for %s at %s", (C23810e) this.f59779e, position);
            }
        }
    }

    /* renamed from: b */
    public final Object mo58816b(C24331h hVar) throws Exception {
        C23666r0 e = ((C23617c) this.f59775a).mo58750e(hVar);
        Object instance = e.getInstance();
        if (!e.mo58773a()) {
            mo58815a(hVar, instance);
        }
        return instance;
    }

    /* renamed from: c */
    public final C23669s0.C23670a mo58817c(Class cls) {
        C23669s0 s0Var = ((C24664u) this.f59777c).f62441a;
        s0Var.getClass();
        return new C23669s0.C23670a(cls);
    }
}
