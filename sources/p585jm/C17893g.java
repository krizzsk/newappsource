package p585jm;

import java.util.ArrayList;
import java.util.Map;
import p705on.C18798f;
import p705on.C18805l;
import p752qn.C19148f;
import p843uk.C19918a0;
import p843uk.C19945o;

/* renamed from: jm.g */
public final class C17893g {

    /* renamed from: a */
    public final C18805l.C18806a f45912a;

    public C17893g(C18805l.C18806a aVar) {
        this.f45912a = aVar;
    }

    /* renamed from: a */
    public final ArrayList mo50441a(C19945o oVar) {
        Map<Integer, C19918a0> map = oVar.f50668c;
        ArrayList arrayList = new ArrayList(oVar.f50670e.size());
        for (Map.Entry next : oVar.f50670e.entrySet()) {
            Integer num = (Integer) next.getValue();
            C19918a0 a0Var = map.get((Integer) next.getKey());
            arrayList.add(new C18798f(this.f45912a.mo51296b(a0Var), num, new C19148f(a0Var.f50578j.f48694a, Integer.valueOf(num.intValue() * a0Var.f50578j.f48695b.intValue()))));
        }
        return arrayList;
    }
}
