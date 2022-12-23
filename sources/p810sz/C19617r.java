package p810sz;

import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p977zz.C20944i0;

/* renamed from: sz.r */
public final class C19617r<T> implements C19584i<T> {

    /* renamed from: u */
    public final Map<Class<? extends T>, C20944i0<Integer, C19600l<? extends T>>> f49797u;

    /* renamed from: v */
    public final Map<Integer, C19589j<? extends T>> f49798v;

    /* renamed from: sz.r$a */
    public static class C19618a<T> {

        /* renamed from: a */
        public final HashMap f49799a = new HashMap();

        /* renamed from: b */
        public final HashMap f49800b = new HashMap();

        /* renamed from: a */
        public final void mo51969a(int i, Class cls, C19600l lVar, C19589j jVar) {
            C21100e.m49373x(lVar, "writer");
            C21100e.m49373x(jVar, "reader");
            this.f49799a.put(cls, new C20944i0(Integer.valueOf(i), lVar));
            this.f49800b.put(Integer.valueOf(i), jVar);
        }

        /* renamed from: b */
        public final C19617r<T> mo51970b() {
            return new C19617r<>(this.f49799a, this.f49800b);
        }
    }

    public C19617r(HashMap hashMap, HashMap hashMap2) {
        C21100e.m49373x(hashMap, "targetMap");
        this.f49797u = hashMap;
        C21100e.m49373x(hashMap2, "sourceMap");
        this.f49798v = hashMap2;
    }

    public final T read(C19615p pVar) throws IOException {
        int l = pVar.mo51924l();
        C19589j jVar = this.f49798v.get(Integer.valueOf(l));
        if (jVar != null) {
            return jVar.read(pVar);
        }
        throw new IOException(C16759e.m42349e("Attempting to read an object of an unknown type: ", l));
    }

    public final void write(T t, C19616q qVar) throws IOException {
        C20944i0 i0Var = this.f49797u.get(t.getClass());
        if (i0Var != null) {
            qVar.mo51939l(((Integer) i0Var.f52692a).intValue());
            ((C19600l) i0Var.f52693b).write(t, qVar);
            return;
        }
        StringBuilder k = C13555b.m33972k("Attempting to write an object of an unknown type: ");
        k.append(t.getClass());
        throw new ApplicationBugException(k.toString());
    }
}
