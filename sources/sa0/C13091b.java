package sa0;

import java.util.Comparator;
import oa0.C12958a;
import ua0.C13142a;

/* renamed from: sa0.b */
public final class C13091b implements Comparator<C12958a> {
    public final int compare(Object obj, Object obj2) {
        int i;
        C12958a aVar = (C12958a) obj;
        C12958a aVar2 = (C12958a) obj2;
        C13142a aVar3 = (C13142a) aVar.mo39840c().f32128b;
        C13142a aVar4 = (C13142a) aVar2.mo39840c().f32128b;
        int i2 = 0;
        if (aVar4 == null || !aVar4.f32644d) {
            i = 0;
        } else {
            i = 1;
        }
        if (aVar3 != null && aVar3.f32644d) {
            i2 = 1;
        }
        int i3 = i - i2;
        if (i3 != 0) {
            return i3;
        }
        return (aVar2.mo39840c().f32100f ? 1 : 0) - (aVar.mo39840c().f32100f ? 1 : 0);
    }
}
