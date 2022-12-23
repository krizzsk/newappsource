package androidx.recyclerview.widget;

import p241s0.C6305e;

/* renamed from: androidx.recyclerview.widget.i0 */
public interface C1190i0 {

    /* renamed from: androidx.recyclerview.widget.i0$a */
    public static class C1191a implements C1190i0 {

        /* renamed from: a */
        public long f4511a = 0;

        /* renamed from: androidx.recyclerview.widget.i0$a$a */
        public class C1192a implements C1197d {

            /* renamed from: a */
            public final C6305e<Long> f4512a = new C6305e<>();

            public C1192a() {
            }

            /* renamed from: a */
            public final long mo5078a(long j) {
                Long l = (Long) this.f4512a.mo22329i(j, (Long) null);
                if (l == null) {
                    C1191a aVar = C1191a.this;
                    long j2 = aVar.f4511a;
                    aVar.f4511a = 1 + j2;
                    l = Long.valueOf(j2);
                    this.f4512a.mo22331k(j, l);
                }
                return l.longValue();
            }
        }

        /* renamed from: a */
        public final C1197d mo5077a() {
            return new C1192a();
        }
    }

    /* renamed from: androidx.recyclerview.widget.i0$b */
    public static class C1193b implements C1190i0 {

        /* renamed from: a */
        public final C1194a f4514a = new C1194a();

        /* renamed from: androidx.recyclerview.widget.i0$b$a */
        public class C1194a implements C1197d {
            /* renamed from: a */
            public final long mo5078a(long j) {
                return -1;
            }
        }

        /* renamed from: a */
        public final C1197d mo5077a() {
            return this.f4514a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i0$c */
    public static class C1195c implements C1190i0 {

        /* renamed from: a */
        public final C1196a f4515a = new C1196a();

        /* renamed from: androidx.recyclerview.widget.i0$c$a */
        public class C1196a implements C1197d {
            /* renamed from: a */
            public final long mo5078a(long j) {
                return j;
            }
        }

        /* renamed from: a */
        public final C1197d mo5077a() {
            return this.f4515a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i0$d */
    public interface C1197d {
        /* renamed from: a */
        long mo5078a(long j);
    }

    /* renamed from: a */
    C1197d mo5077a();
}
