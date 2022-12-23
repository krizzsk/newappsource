package xg0;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.C23899b;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import zf0.C25432c;
import zf0.C25442g;
import zf0.C25446h0;
import zf0.C25491z;

/* renamed from: xg0.e */
public final class C25262e implements Comparator<C25442g> {

    /* renamed from: b */
    public static final C25262e f63538b = new C25262e();

    /* renamed from: a */
    public static int m63410a(C25442g gVar) {
        if (C25260c.m63396m(gVar)) {
            return 8;
        }
        if (gVar instanceof C23899b) {
            return 7;
        }
        if (gVar instanceof C25491z) {
            if (((C25491z) gVar).mo53423R() == null) {
                return 6;
            }
            return 5;
        } else if (gVar instanceof C23900c) {
            if (((C23900c) gVar).mo53423R() == null) {
                return 4;
            }
            return 3;
        } else if (gVar instanceof C25432c) {
            return 2;
        } else {
            if (gVar instanceof C25446h0) {
                return 1;
            }
            return 0;
        }
    }

    public final int compare(Object obj, Object obj2) {
        Integer num;
        C25442g gVar = (C25442g) obj;
        C25442g gVar2 = (C25442g) obj2;
        int a = m63410a(gVar2) - m63410a(gVar);
        if (a != 0) {
            num = Integer.valueOf(a);
        } else if (!C25260c.m63396m(gVar) || !C25260c.m63396m(gVar2)) {
            int compareTo = gVar.getName().f63263b.compareTo(gVar2.getName().f63263b);
            if (compareTo != 0) {
                num = Integer.valueOf(compareTo);
            } else {
                num = null;
            }
        } else {
            num = 0;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
