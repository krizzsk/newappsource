package p430cx;

import java.util.Comparator;
import lf0.C24240p;

/* renamed from: cx.c */
public final /* synthetic */ class C16521c implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ C24240p f43133b;

    public /* synthetic */ C16521c(C24240p pVar) {
        this.f43133b = pVar;
    }

    public final int compare(Object obj, Object obj2) {
        return ((Number) this.f43133b.invoke(obj, obj2)).intValue();
    }
}
