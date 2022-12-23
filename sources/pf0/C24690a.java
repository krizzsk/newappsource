package pf0;

import kotlin.random.Random;

/* renamed from: pf0.a */
public abstract class C24690a extends Random {
    /* renamed from: a */
    public final int mo59288a(int i) {
        return ((-i) >> 31) & (mo61175e().nextInt() >>> (32 - i));
    }

    /* renamed from: b */
    public final int mo59289b() {
        return mo61175e().nextInt();
    }

    /* renamed from: c */
    public final int mo59290c(int i) {
        return mo61175e().nextInt(i);
    }

    /* renamed from: e */
    public abstract java.util.Random mo61175e();
}
