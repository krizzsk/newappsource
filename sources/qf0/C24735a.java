package qf0;

import java.util.Random;
import mf0.C24362h;
import p988j$.util.concurrent.ThreadLocalRandom;
import pf0.C24690a;

/* renamed from: qf0.a */
public final class C24735a extends C24690a {
    /* renamed from: d */
    public final int mo59291d(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    /* renamed from: e */
    public final Random mo61175e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C24362h.m61210e(current, "current()");
        return current;
    }
}
