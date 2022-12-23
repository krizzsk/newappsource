package td0;

import com.vungle.warren.persistence.C23192a;
import java.util.concurrent.Callable;

/* renamed from: td0.p */
public final class C24946p implements Callable<Object> {

    /* renamed from: b */
    public final /* synthetic */ String f63049b;

    /* renamed from: c */
    public final /* synthetic */ Class f63050c;

    /* renamed from: d */
    public final /* synthetic */ C23192a f63051d;

    public C24946p(C23192a aVar, Class cls, String str) {
        this.f63051d = aVar;
        this.f63049b = str;
        this.f63050c = cls;
    }

    public final Object call() {
        return C23192a.m57219a(this.f63051d, this.f63050c, this.f63049b);
    }
}
