package p810sz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: sz.k */
public final class C19599k<T> implements C19584i<T> {

    /* renamed from: u */
    public final ArrayList<T> f49780u;

    /* renamed from: v */
    public final HashMap f49781v;

    @SafeVarargs
    public <A extends T> C19599k(A... aArr) {
        List asList = Arrays.asList(aArr);
        if (asList.size() <= 32767) {
            this.f49780u = new ArrayList<>(asList);
            int size = asList.size();
            HashMap hashMap = new HashMap(size);
            for (short s = 0; s < size; s = (short) (s + 1)) {
                hashMap.put(asList.get(s), Short.valueOf(s));
            }
            this.f49781v = hashMap;
            return;
        }
        throw new IllegalArgumentException("The list of objects may be at most 32767 long");
    }

    public final T read(C19615p pVar) throws IOException {
        return this.f49780u.get(pVar.mo51926r());
    }

    public final void write(T t, C19616q qVar) throws IOException {
        Short sh = (Short) this.f49781v.get(t);
        if (sh != null) {
            qVar.mo51941r(sh.shortValue());
            return;
        }
        throw new IllegalStateException("No key for " + t + " exists");
    }
}
