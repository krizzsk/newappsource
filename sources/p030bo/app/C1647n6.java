package p030bo.app;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import p244s3.C6446u;

/* renamed from: bo.app.n6 */
public class C1647n6 {

    /* renamed from: a */
    public final PriorityQueue<C1710v4> f5868a;

    public C1647n6(List<C1710v4> list) {
        PriorityQueue<C1710v4> priorityQueue = new PriorityQueue<>(16, m4530b());
        this.f5868a = priorityQueue;
        priorityQueue.addAll(list);
    }

    /* renamed from: b */
    public static Comparator<C1710v4> m4530b() {
        return new C6446u(0);
    }

    /* renamed from: a */
    public C1710v4 mo6255a() {
        return this.f5868a.poll();
    }

    /* renamed from: a */
    public static /* synthetic */ int m4529a(C1710v4 v4Var, C1710v4 v4Var2) {
        int u = v4Var.mo6417f().mo6341u();
        int u2 = v4Var2.mo6417f().mo6341u();
        if (u > u2) {
            return -1;
        }
        if (u < u2) {
            return 1;
        }
        return v4Var.getId().compareTo(v4Var2.getId());
    }
}
