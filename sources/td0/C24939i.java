package td0;

import com.vungle.warren.persistence.C23192a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: td0.i */
public final class C24939i implements Callable<Collection<String>> {

    /* renamed from: b */
    public final /* synthetic */ C23192a f63032b;

    public C24939i(C23192a aVar) {
        this.f63032b = aVar;
    }

    public final Object call() throws Exception {
        ArrayList c;
        synchronized (this.f63032b) {
            c = C23192a.m57221c(this.f63032b);
        }
        return c;
    }
}
