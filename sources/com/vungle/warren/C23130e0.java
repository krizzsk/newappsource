package com.vungle.warren;

import com.vungle.warren.C23097c;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.vungle.warren.e0 */
public final class C23130e0 {

    /* renamed from: a */
    public final PriorityQueue<C23132b> f58723a = new PriorityQueue<>(11, new C23131a());

    /* renamed from: com.vungle.warren.e0$a */
    public class C23131a implements Comparator<C23132b> {
        public final int compare(Object obj, Object obj2) {
            C23132b bVar = (C23132b) obj;
            C23132b bVar2 = (C23132b) obj2;
            int compareTo = Integer.valueOf(bVar.f58726b.f58653k).compareTo(Integer.valueOf(bVar2.f58726b.f58653k));
            if (compareTo == 0) {
                return Integer.valueOf(bVar.f58725a).compareTo(Integer.valueOf(bVar2.f58725a));
            }
            return compareTo;
        }
    }

    /* renamed from: com.vungle.warren.e0$b */
    public static class C23132b {

        /* renamed from: c */
        public static final AtomicInteger f58724c = new AtomicInteger();

        /* renamed from: a */
        public final int f58725a = f58724c.incrementAndGet();

        /* renamed from: b */
        public C23097c.C23105g f58726b;

        public C23132b(C23097c.C23105g gVar) {
            this.f58726b = gVar;
        }
    }
}
