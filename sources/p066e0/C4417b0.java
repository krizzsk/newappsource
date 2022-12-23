package p066e0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mf0.C24361g;
import p054d0.C4286i;
import p054d0.C4288j;

/* renamed from: e0.b0 */
public final class C4417b0 implements C4286i {

    /* renamed from: b */
    public int f15479b;

    public C4417b0(int i) {
        this.f15479b = i;
    }

    public final ArrayList filter(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4288j jVar = (C4288j) it.next();
            C24361g.m61177o(jVar instanceof C4443m, "The camera info doesn't contain internal implementation.");
            Integer lensFacing = ((C4443m) jVar).getLensFacing();
            if (lensFacing != null && lensFacing.intValue() == this.f15479b) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public final C4416b getIdentifier() {
        return C4286i.f15209a;
    }
}
