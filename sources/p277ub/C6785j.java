package p277ub;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p277ub.C6786k;

/* renamed from: ub.j */
public final /* synthetic */ class C6785j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CopyOnWriteArraySet f20987b;

    /* renamed from: c */
    public final /* synthetic */ int f20988c;

    /* renamed from: d */
    public final /* synthetic */ C6786k.C6787a f20989d;

    public /* synthetic */ C6785j(CopyOnWriteArraySet copyOnWriteArraySet, int i, C6786k.C6787a aVar) {
        this.f20987b = copyOnWriteArraySet;
        this.f20988c = i;
        this.f20989d = aVar;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f20987b;
        int i = this.f20988c;
        C6786k.C6787a aVar = this.f20989d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C6786k.C6789c cVar = (C6786k.C6789c) it.next();
            if (!cVar.f21000d) {
                if (i != -1) {
                    cVar.f20998b.mo22953a(i);
                }
                cVar.f20999c = true;
                aVar.invoke(cVar.f20997a);
            }
        }
    }
}
