package td0;

import com.vungle.warren.persistence.C23192a;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: td0.l */
public final class C24942l implements Callable<List<String>> {

    /* renamed from: b */
    public final /* synthetic */ String f63039b;

    /* renamed from: c */
    public final /* synthetic */ C23192a f63040c;

    public C24942l(C23192a aVar, String str) {
        this.f63040c = aVar;
        this.f63039b = str;
    }

    public final Object call() throws Exception {
        return C23192a.m57222d(this.f63040c, this.f63039b);
    }
}
