package p988j$.util.concurrent;

import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p988j$.util.stream.C26031B3;
import p988j$.util.stream.C26042E;
import p988j$.util.stream.C26189l0;
import p988j$.util.stream.IntStream;

/* renamed from: j$.util.concurrent.ThreadLocalRandom */
public class ThreadLocalRandom extends Random {

    /* renamed from: d */
    private static final AtomicInteger f64538d = new AtomicInteger();

    /* renamed from: e */
    private static final AtomicLong f64539e;

    /* renamed from: f */
    private static final ThreadLocal f64540f = new ThreadLocal();

    /* renamed from: g */
    private static final ThreadLocal f64541g = new C25910y();

    /* renamed from: a */
    long f64542a;

    /* renamed from: b */
    int f64543b;

    /* renamed from: c */
    boolean f64544c = true;

    static {
        long j;
        if (((Boolean) AccessController.doPrivileged(new C25909x())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            j = ((long) seed[0]) & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (((long) seed[i]) & 255);
            }
        } else {
            j = m64731h(System.nanoTime()) ^ m64731h(System.currentTimeMillis());
        }
        f64539e = new AtomicLong(j);
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    ThreadLocalRandom() {
    }

    /* renamed from: a */
    static final int m64727a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f64541g.get()).f64543b = i4;
        return i4;
    }

    /* renamed from: b */
    static final int m64728b() {
        return ((ThreadLocalRandom) f64541g.get()).f64543b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f64541g.get();
        if (threadLocalRandom.f64543b == 0) {
            m64729f();
        }
        return threadLocalRandom;
    }

    /* renamed from: f */
    static final void m64729f() {
        int addAndGet = f64538d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h = m64731h(f64539e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f64541g.get();
        threadLocalRandom.f64542a = h;
        threadLocalRandom.f64543b = addAndGet;
    }

    /* renamed from: g */
    private static int m64730g(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        return (int) (((j2 ^ (j2 >>> 33)) * -4265267296055464877L) >>> 32);
    }

    /* renamed from: h */
    private static long m64731h(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final double mo83917c(double d, double d2) {
        double nextLong = ((double) (nextLong() >>> 11)) * 1.1102230246251565E-16d;
        if (d >= d2) {
            return nextLong;
        }
        double d3 = ((d2 - d) * nextLong) + d;
        return d3 >= d2 ? Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1) : d3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo83918d(int i, int i2) {
        int i3;
        int g = m64730g(mo83924i());
        if (i >= i2) {
            return g;
        }
        int i4 = i2 - i;
        int i5 = i4 - 1;
        if ((i4 & i5) == 0) {
            i3 = g & i5;
        } else if (i4 > 0) {
            int i6 = g >>> 1;
            while (true) {
                int i7 = i6 + i5;
                i3 = i6 % i4;
                if (i7 - i3 >= 0) {
                    break;
                }
                i6 = m64730g(mo83924i()) >>> 1;
            }
        } else {
            while (true) {
                if (g >= i && g < i2) {
                    return g;
                }
                g = m64730g(mo83924i());
            }
        }
        return i3 + i;
    }

    public final DoubleStream doubles() {
        return C26042E.m64974w(C26031B3.m64916a(new C25911z(0, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    public final DoubleStream doubles(double d, double d2) {
        if (d < d2) {
            return C26042E.m64974w(C26031B3.m64916a(new C25911z(0, Long.MAX_VALUE, d, d2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final DoubleStream doubles(long j) {
        if (j >= 0) {
            return C26042E.m64974w(C26031B3.m64916a(new C25911z(0, j, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    public final DoubleStream doubles(long j, double d, double d2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (d < d2) {
            return C26042E.m64974w(C26031B3.m64916a(new C25911z(0, j, d, d2)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo83923e(long j, long j2) {
        long h = m64731h(mo83924i());
        if (j >= j2) {
            return h;
        }
        long j3 = j2 - j;
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return (h & j4) + j;
        }
        if (j3 > 0) {
            while (true) {
                long j5 = h >>> 1;
                long j6 = j5 + j4;
                long j7 = j5 % j3;
                if (j6 - j7 >= 0) {
                    return j7 + j;
                }
                h = m64731h(mo83924i());
            }
        } else {
            while (true) {
                if (h >= j && h < j2) {
                    return h;
                }
                h = m64731h(mo83924i());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final long mo83924i() {
        long j = this.f64542a - 7046029254386353131L;
        this.f64542a = j;
        return j;
    }

    public final IntStream ints() {
        return IntStream.Wrapper.convert(C26031B3.m64917b(new C25884A(0, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    public final java.util.stream.IntStream ints(int i, int i2) {
        if (i < i2) {
            return IntStream.Wrapper.convert(C26031B3.m64917b(new C25884A(0, Long.MAX_VALUE, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final java.util.stream.IntStream ints(long j) {
        if (j >= 0) {
            return IntStream.Wrapper.convert(C26031B3.m64917b(new C25884A(0, j, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    public final java.util.stream.IntStream ints(long j, int i, int i2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (i < i2) {
            return IntStream.Wrapper.convert(C26031B3.m64917b(new C25884A(0, j, i, i2)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    public final LongStream longs() {
        return C26189l0.m65514w(C26031B3.m64918c(new C25885B(0, Long.MAX_VALUE, Long.MAX_VALUE, 0)));
    }

    public final LongStream longs(long j) {
        if (j >= 0) {
            return C26189l0.m65514w(C26031B3.m64918c(new C25885B(0, j, Long.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    public final LongStream longs(long j, long j2) {
        if (j < j2) {
            return C26189l0.m65514w(C26031B3.m64918c(new C25885B(0, Long.MAX_VALUE, j, j2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final LongStream longs(long j, long j2, long j3) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (j2 < j3) {
            return C26189l0.m65514w(C26031B3.m64918c(new C25885B(0, j, j2, j3)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    /* access modifiers changed from: protected */
    public final int next(int i) {
        return (int) (m64731h(mo83924i()) >>> (64 - i));
    }

    public final boolean nextBoolean() {
        return m64730g(mo83924i()) < 0;
    }

    public final double nextDouble() {
        return ((double) (m64731h(mo83924i()) >>> 11)) * 1.1102230246251565E-16d;
    }

    public final float nextFloat() {
        return ((float) (m64730g(mo83924i()) >>> 8)) * 5.9604645E-8f;
    }

    public final double nextGaussian() {
        ThreadLocal threadLocal = f64540f;
        Double d = (Double) threadLocal.get();
        if (d != null) {
            threadLocal.set((Object) null);
            return d.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d2 < 1.0d && d2 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d2) * -2.0d) / d2);
                f64540f.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    public int nextInt() {
        return m64730g(mo83924i());
    }

    public final int nextInt(int i) {
        if (i > 0) {
            int g = m64730g(mo83924i());
            int i2 = i - 1;
            if ((i & i2) == 0) {
                return g & i2;
            }
            while (true) {
                int i3 = g >>> 1;
                int i4 = i3 + i2;
                int i5 = i3 % i;
                if (i4 - i5 >= 0) {
                    return i5;
                }
                g = m64730g(mo83924i());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    public int nextInt(int i, int i2) {
        if (i < i2) {
            return mo83918d(i, i2);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final long nextLong() {
        return m64731h(mo83924i());
    }

    public final void setSeed(long j) {
        if (this.f64544c) {
            throw new UnsupportedOperationException();
        }
    }
}
