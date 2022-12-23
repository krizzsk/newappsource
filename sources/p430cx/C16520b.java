package p430cx;

import java.util.Comparator;
import lf0.C24240p;

/* renamed from: cx.b */
public final /* synthetic */ class C16520b implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ C24240p f43132b;

    public /* synthetic */ C16520b(C24240p pVar) {
        this.f43132b = pVar;
    }

    public final int compare(Object obj, Object obj2) {
        return ((Number) this.f43132b.invoke(obj, obj2)).intValue();
    }
}
