package p988j$.util.stream;

import p988j$.time.C25783b;
import p988j$.util.C25856D;
import p988j$.util.C25861I;
import p988j$.util.Spliterator;
import p988j$.util.function.C25941N;
import p988j$.util.function.C25966e0;
import p988j$.util.function.C25978k0;
import p988j$.util.function.C25981m;
import p988j$.util.function.C25993s;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;

/* renamed from: j$.util.stream.v0 */
public abstract /* synthetic */ class C26239v0 implements C26046E3 {

    /* renamed from: a */
    private static final C26122X0 f65035a = new C26122X0();

    /* renamed from: b */
    private static final C26028B0 f65036b = new C26114V0();

    /* renamed from: c */
    private static final C26033C0 f65037c = new C26118W0();

    /* renamed from: d */
    private static final C26023A0 f65038d = new C26110U0();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int[] f65039e = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final long[] f65040f = new long[0];
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final double[] f65041g = new double[0];

    public /* synthetic */ C26239v0() {
    }

    public /* synthetic */ C26239v0(int i) {
    }

    /* renamed from: A0 */
    public static void m65640A0(C26033C0 c0, Consumer consumer) {
        if (consumer instanceof C25966e0) {
            c0.mo84201h((C25966e0) consumer);
        } else if (!C26061H3.f64754a) {
            ((C25861I) c0.spliterator()).forEachRemaining(consumer);
        } else {
            C26061H3.m65025a(c0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: B0 */
    public static C26023A0 m65641B0(C26023A0 a0, long j, long j2) {
        if (j == 0 && j2 == a0.count()) {
            return a0;
        }
        long j3 = j2 - j;
        C25856D d = (C25856D) a0.spliterator();
        C26244w0 Q0 = m65654Q0(j3);
        Q0.mo84147d(j3);
        for (int i = 0; ((long) i) < j && d.mo83820h(new C26187k3(1)); i++) {
        }
        for (int i2 = 0; ((long) i2) < j3 && d.mo83820h(Q0); i2++) {
        }
        Q0.end();
        return Q0.build();
    }

    /* renamed from: C0 */
    public static C26028B0 m65642C0(C26028B0 b0, long j, long j2) {
        if (j == 0 && j2 == b0.count()) {
            return b0;
        }
        long j3 = j2 - j;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) b0.spliterator();
        C26249x0 Y0 = m65660Y0(j3);
        Y0.mo84147d(j3);
        for (int i = 0; ((long) i) < j && ofInt.tryAdvance((IntConsumer) new C26197m3(1)); i++) {
        }
        for (int i2 = 0; ((long) i2) < j3 && ofInt.tryAdvance((IntConsumer) Y0); i2++) {
        }
        Y0.end();
        return Y0.build();
    }

    /* renamed from: D0 */
    public static C26033C0 m65643D0(C26033C0 c0, long j, long j2) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        long j3 = j2 - j;
        C25861I i = (C25861I) c0.spliterator();
        C26254y0 Z0 = m65661Z0(j3);
        Z0.mo84147d(j3);
        for (int i2 = 0; ((long) i2) < j && i.mo83849c(new C26207o3(1)); i2++) {
        }
        for (int i3 = 0; ((long) i3) < j3 && i.mo83849c(Z0); i3++) {
        }
        Z0.end();
        return Z0.build();
    }

    /* renamed from: E0 */
    public static C26043E0 m65644E0(C26043E0 e0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == e0.count()) {
            return e0;
        }
        Spliterator spliterator = e0.spliterator();
        long j3 = j2 - j;
        C26259z0 I0 = m65648I0(j3, intFunction);
        I0.mo84147d(j3);
        for (int i = 0; ((long) i) < j && spliterator.tryAdvance(new C26052G(13)); i++) {
        }
        for (int i2 = 0; ((long) i2) < j3 && spliterator.tryAdvance(I0); i2++) {
        }
        I0.end();
        return I0.build();
    }

    /* renamed from: I0 */
    static C26259z0 m65648I0(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C26220r1() : new C26130Z0(j, intFunction);
    }

    /* renamed from: J0 */
    public static C26043E0 m65649J0(C26239v0 v0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long S0 = v0Var.mo84462S0(spliterator);
        if (S0 < 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            C26043E0 e0 = (C26043E0) new C26071K0(spliterator, intFunction, v0Var).invoke();
            return z ? m65656T0(e0, intFunction) : e0;
        } else if (S0 < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) S0);
            new C26210p1(spliterator, v0Var, objArr).invoke();
            return new C26058H0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: K0 */
    public static C26023A0 m65650K0(C26239v0 v0Var, Spliterator spliterator, boolean z) {
        long S0 = v0Var.mo84462S0(spliterator);
        if (S0 < 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            C26023A0 a0 = (C26023A0) new C26071K0(0, spliterator, v0Var).invoke();
            return z ? m65657U0(a0) : a0;
        } else if (S0 < 2147483639) {
            double[] dArr = new double[((int) S0)];
            new C26195m1(spliterator, v0Var, dArr).invoke();
            return new C26098R0(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: L0 */
    public static C26028B0 m65651L0(C26239v0 v0Var, Spliterator spliterator, boolean z) {
        long S0 = v0Var.mo84462S0(spliterator);
        if (S0 < 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            C26028B0 b0 = (C26028B0) new C26071K0(1, spliterator, v0Var).invoke();
            return z ? m65658V0(b0) : b0;
        } else if (S0 < 2147483639) {
            int[] iArr = new int[((int) S0)];
            new C26200n1(spliterator, v0Var, iArr).invoke();
            return new C26135a1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: M0 */
    public static C26033C0 m65652M0(C26239v0 v0Var, Spliterator spliterator, boolean z) {
        long S0 = v0Var.mo84462S0(spliterator);
        if (S0 < 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            C26033C0 c0 = (C26033C0) new C26071K0(2, spliterator, v0Var).invoke();
            return z ? m65659W0(c0) : c0;
        } else if (S0 < 2147483639) {
            long[] jArr = new long[((int) S0)];
            new C26205o1(spliterator, v0Var, jArr).invoke();
            return new C26180j1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: N0 */
    static C26053G0 m65653N0(int i, C26043E0 e0, C26043E0 e02) {
        int[] iArr = C26048F0.f64727a;
        if (i != 0) {
            int i2 = iArr[i - 1];
            if (i2 == 1) {
                return new C26095Q0(e0, e02);
            }
            if (i2 == 2) {
                return new C26083N0((C26028B0) e0, (C26028B0) e02);
            }
            if (i2 == 3) {
                return new C26087O0((C26033C0) e0, (C26033C0) e02);
            }
            if (i2 == 4) {
                return new C26079M0((C26023A0) e0, (C26023A0) e02);
            }
            StringBuilder a = C25783b.m64414a("Unknown shape ");
            a.append(C25783b.m64415b(i));
            throw new IllegalStateException(a.toString());
        }
        throw null;
    }

    /* renamed from: Q0 */
    static C26244w0 m65654Q0(long j) {
        return (j < 0 || j >= 2147483639) ? new C26106T0() : new C26102S0(j);
    }

    /* renamed from: R0 */
    static C26126Y0 m65655R0(int i) {
        Object obj;
        int[] iArr = C26048F0.f64727a;
        if (i != 0) {
            int i2 = iArr[i - 1];
            if (i2 == 1) {
                return f65035a;
            }
            if (i2 == 2) {
                obj = f65036b;
            } else if (i2 == 3) {
                obj = f65037c;
            } else if (i2 == 4) {
                obj = f65038d;
            } else {
                StringBuilder a = C25783b.m64414a("Unknown shape ");
                a.append(C25783b.m64415b(i));
                throw new IllegalStateException(a.toString());
            }
            return (C26126Y0) obj;
        }
        throw null;
    }

    /* renamed from: T0 */
    public static C26043E0 m65656T0(C26043E0 e0, IntFunction intFunction) {
        if (e0.mo84244n() <= 0) {
            return e0;
        }
        long count = e0.count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            new C26235u1(e0, objArr).invoke();
            return new C26058H0(objArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: U0 */
    public static C26023A0 m65657U0(C26023A0 a0) {
        if (a0.mo84244n() <= 0) {
            return a0;
        }
        long count = a0.count();
        if (count < 2147483639) {
            double[] dArr = new double[((int) count)];
            new C26225s1(a0, dArr).invoke();
            return new C26098R0(dArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: V0 */
    public static C26028B0 m65658V0(C26028B0 b0) {
        if (b0.mo84244n() <= 0) {
            return b0;
        }
        long count = b0.count();
        if (count < 2147483639) {
            int[] iArr = new int[((int) count)];
            new C26230t1(b0, iArr).invoke();
            return new C26135a1(iArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: W0 */
    public static C26033C0 m65659W0(C26033C0 c0) {
        if (c0.mo84244n() <= 0) {
            return c0;
        }
        long count = c0.count();
        if (count < 2147483639) {
            long[] jArr = new long[((int) count)];
            new C26225s1(c0, jArr).invoke();
            return new C26180j1(jArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: Y0 */
    static C26249x0 m65660Y0(long j) {
        return (j < 0 || j >= 2147483639) ? new C26145c1() : new C26140b1(j);
    }

    /* renamed from: Z0 */
    static C26254y0 m65661Z0(long j) {
        return (j < 0 || j >= 2147483639) ? new C26190l1() : new C26185k1(j);
    }

    /* renamed from: a1 */
    public static C26229t0 m65662a1(C25993s sVar, C26224s0 s0Var) {
        sVar.getClass();
        s0Var.getClass();
        return new C26229t0(4, s0Var, new C26198n(3, s0Var, sVar));
    }

    /* renamed from: b1 */
    public static C26229t0 m65663b1(C25941N n, C26224s0 s0Var) {
        n.getClass();
        s0Var.getClass();
        return new C26229t0(2, s0Var, new C26198n(1, s0Var, n));
    }

    /* renamed from: c1 */
    public static C26229t0 m65664c1(C25978k0 k0Var, C26224s0 s0Var) {
        k0Var.getClass();
        s0Var.getClass();
        return new C26229t0(3, s0Var, new C26198n(4, s0Var, k0Var));
    }

    /* renamed from: e1 */
    public static C26229t0 m65665e1(Predicate predicate, C26224s0 s0Var) {
        predicate.getClass();
        s0Var.getClass();
        return new C26229t0(1, s0Var, new C26198n(2, s0Var, predicate));
    }

    /* renamed from: l0 */
    public static void m65666l0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: m0 */
    public static void m65667m0(C26151d2 d2Var, Double d) {
        if (!C26061H3.f64754a) {
            d2Var.accept(d.doubleValue());
        } else {
            C26061H3.m65025a(d2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    /* renamed from: o0 */
    public static void m65669o0(C26156e2 e2Var, Integer num) {
        if (!C26061H3.f64754a) {
            e2Var.accept(num.intValue());
        } else {
            C26061H3.m65025a(e2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    /* renamed from: q0 */
    public static void m65671q0(C26161f2 f2Var, Long l) {
        if (!C26061H3.f64754a) {
            f2Var.accept(l.longValue());
        } else {
            C26061H3.m65025a(f2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    /* renamed from: s0 */
    public static void m65673s0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: t0 */
    public static void m65674t0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: u0 */
    public static Object[] m65675u0(C26038D0 d0, IntFunction intFunction) {
        if (C26061H3.f64754a) {
            C26061H3.m65025a(d0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (d0.count() < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) d0.count());
            d0.mo84243j(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: v0 */
    public static void m65676v0(C26023A0 a0, Double[] dArr, int i) {
        if (!C26061H3.f64754a) {
            double[] dArr2 = (double[]) a0.mo84199b();
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr[i + i2] = Double.valueOf(dArr2[i2]);
            }
            return;
        }
        C26061H3.m65025a(a0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
        throw null;
    }

    /* renamed from: w0 */
    public static void m65677w0(C26028B0 b0, Integer[] numArr, int i) {
        if (!C26061H3.f64754a) {
            int[] iArr = (int[]) b0.mo84199b();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                numArr[i + i2] = Integer.valueOf(iArr[i2]);
            }
            return;
        }
        C26061H3.m65025a(b0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
        throw null;
    }

    /* renamed from: x0 */
    public static void m65678x0(C26033C0 c0, Long[] lArr, int i) {
        if (!C26061H3.f64754a) {
            long[] jArr = (long[]) c0.mo84199b();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                lArr[i + i2] = Long.valueOf(jArr[i2]);
            }
            return;
        }
        C26061H3.m65025a(c0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
        throw null;
    }

    /* renamed from: y0 */
    public static void m65679y0(C26023A0 a0, Consumer consumer) {
        if (consumer instanceof C25981m) {
            a0.mo84201h((C25981m) consumer);
        } else if (!C26061H3.f64754a) {
            ((C25856D) a0.spliterator()).forEachRemaining(consumer);
        } else {
            C26061H3.m65025a(a0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: z0 */
    public static void m65680z0(C26028B0 b0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            b0.mo84201h((IntConsumer) consumer);
        } else if (!C26061H3.f64754a) {
            ((Spliterator.OfInt) b0.spliterator()).forEachRemaining(consumer);
        } else {
            C26061H3.m65025a(b0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: L */
    public /* synthetic */ int mo84247L() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public abstract void mo84460O0(Spliterator spliterator, C26166g2 g2Var);

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public abstract void mo84461P0(Spliterator spliterator, C26166g2 g2Var);

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public abstract long mo84462S0(Spliterator spliterator);

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public abstract int mo84463X0();

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public abstract C26259z0 mo84162d1(long j, IntFunction intFunction);

    /* renamed from: f1 */
    public abstract C26092P1 mo84140f1();

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public abstract C26166g2 mo84464g1(Spliterator spliterator, C26166g2 g2Var);

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public abstract C26166g2 mo84465h1(C26166g2 g2Var);

    /* renamed from: j0 */
    public Object mo84248j0(C26239v0 v0Var, Spliterator spliterator) {
        C26092P1 f1 = mo84140f1();
        v0Var.mo84464g1(spliterator, f1);
        return f1.get();
    }

    /* renamed from: w */
    public Object mo84249w(C26239v0 v0Var, Spliterator spliterator) {
        return ((C26092P1) new C26099R1(this, v0Var, spliterator).invoke()).get();
    }
}
