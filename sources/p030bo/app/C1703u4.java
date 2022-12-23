package p030bo.app;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: bo.app.u4 */
public class C1703u4 {

    /* renamed from: a */
    public static final int f6028a;

    /* renamed from: b */
    public static final int f6029b;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f6028a = availableProcessors;
        f6029b = Math.max(2, availableProcessors - 1);
    }

    /* renamed from: a */
    public static int m4800a() {
        return 2;
    }

    /* renamed from: b */
    public static int m4801b() {
        return f6028a;
    }

    /* renamed from: c */
    public static long m4802c() {
        return 1;
    }

    /* renamed from: d */
    public static int m4803d() {
        return f6029b;
    }

    /* renamed from: e */
    public static BlockingQueue<Runnable> m4804e() {
        return new LinkedBlockingQueue(64);
    }
}
