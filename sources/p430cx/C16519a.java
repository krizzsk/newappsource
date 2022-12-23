package p430cx;

import java.util.Comparator;
import lf0.C24240p;

/* renamed from: cx.a */
public final /* synthetic */ class C16519a implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ C24240p f43131b;

    public /* synthetic */ C16519a(C24240p pVar) {
        this.f43131b = pVar;
    }

    public final int compare(Object obj, Object obj2) {
        return ((Number) this.f43131b.invoke(obj, obj2)).intValue();
    }
}
