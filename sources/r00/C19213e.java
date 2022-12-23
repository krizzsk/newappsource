package r00;

import java.util.ArrayList;
import java.util.List;
import mf0.C24361g;
import p977zz.C20964s0;

/* renamed from: r00.e */
public abstract class C19213e<T> extends C19215g<List<T>> {
    public C19213e(String str, List<T> list) {
        super(str, list);
    }

    /* renamed from: b */
    public final Object mo49672b(String str) throws Exception {
        String[] A = C20964s0.m49080A(str, ',');
        if (!C24361g.m61154X(A)) {
            ArrayList arrayList = new ArrayList(A.length);
            for (String c : A) {
                Object c2 = mo51507c(c);
                if (c2 != null) {
                    arrayList.add(c2);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException(C25541a.m63881k("Wrong CSV configuration value: ", str));
    }

    /* renamed from: c */
    public abstract T mo51507c(String str) throws Exception;
}
