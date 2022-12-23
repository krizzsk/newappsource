package p190o1;

import android.os.Handler;
import java.util.concurrent.Callable;
import p229r1.C6231a;

/* renamed from: o1.o */
public final class C5923o<T> implements Runnable {

    /* renamed from: b */
    public Callable<T> f19017b;

    /* renamed from: c */
    public C6231a<T> f19018c;

    /* renamed from: d */
    public Handler f19019d;

    /* renamed from: o1.o$a */
    public class C5924a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C6231a f19020b;

        /* renamed from: c */
        public final /* synthetic */ Object f19021c;

        public C5924a(C6231a aVar, Object obj) {
            this.f19020b = aVar;
            this.f19021c = obj;
        }

        public final void run() {
            this.f19020b.accept(this.f19021c);
        }
    }

    public C5923o(Handler handler, C5915i iVar, C5916j jVar) {
        this.f19017b = iVar;
        this.f19018c = jVar;
        this.f19019d = handler;
    }

    public final void run() {
        T t;
        try {
            t = this.f19017b.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f19019d.post(new C5924a(this.f19018c, t));
    }
}
