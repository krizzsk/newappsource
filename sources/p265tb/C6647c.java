package p265tb;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p112ha.C5196m0;

/* renamed from: tb.c */
public interface C6647c {

    /* renamed from: tb.c$a */
    public interface C6648a {

        /* renamed from: tb.c$a$a */
        public static final class C6649a {

            /* renamed from: a */
            public final CopyOnWriteArrayList<C6650a> f20651a = new CopyOnWriteArrayList<>();

            /* renamed from: tb.c$a$a$a */
            public static final class C6650a {

                /* renamed from: a */
                public final Handler f20652a;

                /* renamed from: b */
                public final C6648a f20653b;

                /* renamed from: c */
                public boolean f20654c;

                public C6650a(Handler handler, C6648a aVar) {
                    this.f20652a = handler;
                    this.f20653b = aVar;
                }
            }

            /* renamed from: a */
            public final void mo22820a(C6648a aVar) {
                Iterator<C6650a> it = this.f20651a.iterator();
                while (it.hasNext()) {
                    C6650a next = it.next();
                    if (next.f20653b == aVar) {
                        next.f20654c = true;
                        this.f20651a.remove(next);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    void mo22817a(C5196m0 m0Var);

    /* renamed from: c */
    void mo22818c(Handler handler, C6648a aVar);

    /* renamed from: d */
    C6660l mo22819d();
}
