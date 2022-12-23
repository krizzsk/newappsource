package b00;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: b00.c */
public final class C13558c implements C13556a {

    /* renamed from: b */
    public final HashSet f33501b;

    public C13558c(C13556a... aVarArr) {
        HashSet hashSet = new HashSet();
        this.f33501b = hashSet;
        hashSet.addAll(Arrays.asList(aVarArr));
    }

    public final boolean cancel(boolean z) {
        Iterator it = this.f33501b.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            z2 &= ((C13556a) it.next()).cancel(z);
        }
        this.f33501b.clear();
        return z2;
    }
}
