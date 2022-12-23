package p274u8;

import java.util.Comparator;
import mf0.C24362h;
import p138jb.C5422b;

/* renamed from: u8.b */
public final /* synthetic */ class C6725b implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f20823b;

    public /* synthetic */ C6725b(int i) {
        this.f20823b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f20823b) {
            case 0:
                C6724a aVar = (C6724a) obj;
                C6724a aVar2 = (C6724a) obj2;
                C24362h.m61210e(aVar2, "o2");
                aVar.getClass();
                Long l = aVar.f20822c;
                if (l != null) {
                    long longValue = l.longValue();
                    Long l2 = aVar2.f20822c;
                    if (l2 == null) {
                        return 1;
                    }
                    int i = (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
                    if (i >= 0) {
                        if (i == 0) {
                            return 0;
                        }
                        return 1;
                    }
                }
                return -1;
            default:
                return Integer.compare(((C5422b.C5423a) obj2).f17840b, ((C5422b.C5423a) obj).f17840b);
        }
    }
}
