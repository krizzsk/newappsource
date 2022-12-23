package p108h6;

import java.util.ArrayDeque;
import p311x6.C7176l;

/* renamed from: h6.m */
public final class C5102m<A, B> {

    /* renamed from: a */
    public final C5101l f17099a = new C5101l();

    /* renamed from: h6.m$a */
    public static final class C5103a<A> {

        /* renamed from: d */
        public static final ArrayDeque f17100d = new ArrayDeque(0);

        /* renamed from: a */
        public int f17101a;

        /* renamed from: b */
        public int f17102b;

        /* renamed from: c */
        public A f17103c;

        static {
            char[] cArr = C7176l.f22265a;
        }

        /* renamed from: a */
        public static C5103a m12980a(Object obj) {
            C5103a aVar;
            ArrayDeque arrayDeque = f17100d;
            synchronized (arrayDeque) {
                aVar = (C5103a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new C5103a();
            }
            aVar.f17103c = obj;
            aVar.f17102b = 0;
            aVar.f17101a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C5103a)) {
                return false;
            }
            C5103a aVar = (C5103a) obj;
            if (this.f17102b == aVar.f17102b && this.f17101a == aVar.f17101a && this.f17103c.equals(aVar.f17103c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f17103c.hashCode() + (((this.f17101a * 31) + this.f17102b) * 31);
        }
    }
}
