package kotlin.random;

import hf0.C23458b;
import java.io.Serializable;
import kotlin.Metadata;
import mf0.C24362h;

public abstract class Random {

    /* renamed from: b */
    public static final Default f60192b = new Default(0);

    /* renamed from: c */
    public static final Random f60193c = C23458b.f59232a.mo58575b();

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo59060d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "defaultRandom", "Lkotlin/random/Random;", "<init>", "()V", "Serialized", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
    public static final class Default extends Random implements Serializable {

        @Metadata(mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo59060d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1}, mo59064xi = 48)
        public static final class Serialized implements Serializable {

            /* renamed from: b */
            public static final Serialized f60194b = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.f60192b;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(int i) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.f60194b;
        }

        /* renamed from: a */
        public final int mo59288a(int i) {
            return Random.f60193c.mo59288a(i);
        }

        /* renamed from: b */
        public final int mo59289b() {
            return Random.f60193c.mo59289b();
        }

        /* renamed from: c */
        public final int mo59290c(int i) {
            return Random.f60193c.mo59290c(i);
        }

        /* renamed from: d */
        public final int mo59291d(int i, int i2) {
            return Random.f60193c.mo59291d(i, i2);
        }
    }

    /* renamed from: a */
    public abstract int mo59288a(int i);

    /* renamed from: b */
    public abstract int mo59289b();

    /* renamed from: c */
    public abstract int mo59290c(int i);

    /* renamed from: d */
    public int mo59291d(int i, int i2) {
        boolean z;
        int i3;
        int b;
        int i4;
        int b2;
        boolean z2;
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i5 = i2 - i;
            if (i5 > 0 || i5 == Integer.MIN_VALUE) {
                if (((-i5) & i5) == i5) {
                    i3 = mo59288a(31 - Integer.numberOfLeadingZeros(i5));
                } else {
                    do {
                        b = mo59289b() >>> 1;
                        i4 = b % i5;
                    } while ((i5 - 1) + (b - i4) < 0);
                    i3 = i4;
                }
                return i + i3;
            }
            do {
                b2 = mo59289b();
                if (i > b2 || b2 >= i2) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
            } while (!z2);
            return b2;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        C24362h.m61211f(valueOf, "from");
        C24362h.m61211f(valueOf2, "until");
        throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
    }
}
