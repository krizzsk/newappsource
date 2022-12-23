package p627lg;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: lg.o */
public final class C18216o extends PhantomReference {

    /* renamed from: a */
    public final Set f46481a;

    /* renamed from: b */
    public final Runnable f46482b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18216o(C18202a aVar, ReferenceQueue referenceQueue, Set set) {
        super(aVar, referenceQueue);
        C18215n nVar = C18215n.f46480b;
        this.f46481a = set;
        this.f46482b = nVar;
    }
}
