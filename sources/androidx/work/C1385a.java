package androidx.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p081f3.C4647a;
import p081f3.C4655g;
import p081f3.C4672p;
import p081f3.C4673q;
import p092g3.C4752a;

/* renamed from: androidx.work.a */
public final class C1385a {

    /* renamed from: a */
    public final ExecutorService f5143a = m3713a(false);

    /* renamed from: b */
    public final ExecutorService f5144b = m3713a(true);

    /* renamed from: c */
    public final C4672p f5145c;

    /* renamed from: d */
    public final C4655g f5146d;

    /* renamed from: e */
    public final C4752a f5147e;

    /* renamed from: f */
    public final int f5148f;

    /* renamed from: g */
    public final int f5149g;

    /* renamed from: h */
    public final int f5150h;

    /* renamed from: androidx.work.a$a */
    public static final class C1386a {
    }

    /* renamed from: androidx.work.a$b */
    public interface C1387b {
        /* renamed from: a */
        C1385a mo5690a();
    }

    public C1385a(C1386a aVar) {
        int i = C4673q.f15911a;
        this.f5145c = new C4672p();
        this.f5146d = new C4655g();
        this.f5147e = new C4752a(0, 0);
        this.f5148f = 4;
        this.f5149g = Integer.MAX_VALUE;
        this.f5150h = 20;
    }

    /* renamed from: a */
    public static ExecutorService m3713a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new C4647a(z));
    }
}
