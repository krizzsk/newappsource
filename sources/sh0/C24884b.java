package sh0;

/* renamed from: sh0.b */
public final class C24884b<V> {

    /* renamed from: f */
    public static final C24884b<Object> f62922f = new C24884b<>();

    /* renamed from: a */
    public final long f62923a;

    /* renamed from: b */
    public final V f62924b;

    /* renamed from: c */
    public final C24884b<V> f62925c;

    /* renamed from: d */
    public final C24884b<V> f62926d;

    /* renamed from: e */
    public final int f62927e;

    public C24884b() {
        this.f62927e = 0;
        this.f62923a = 0;
        this.f62924b = null;
        this.f62925c = null;
        this.f62926d = null;
    }

    /* renamed from: a */
    public final V mo61358a(long j) {
        if (this.f62927e == 0) {
            return null;
        }
        long j2 = this.f62923a;
        if (j < j2) {
            return this.f62925c.mo61358a(j - j2);
        }
        if (j > j2) {
            return this.f62926d.mo61358a(j - j2);
        }
        return this.f62924b;
    }

    /* renamed from: b */
    public final C24884b mo61359b(long j, C24882a aVar) {
        if (this.f62927e == 0) {
            return new C24884b(j, aVar, this, this);
        }
        long j2 = this.f62923a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return mo61360c(this.f62925c.mo61359b(j - j2, aVar), this.f62926d);
        }
        if (i > 0) {
            return mo61360c(this.f62925c, this.f62926d.mo61359b(j - j2, aVar));
        }
        if (aVar == this.f62924b) {
            return this;
        }
        return new C24884b(j, aVar, this.f62925c, this.f62926d);
    }

    /* renamed from: c */
    public final C24884b<V> mo61360c(C24884b<V> bVar, C24884b<V> bVar2) {
        C24884b<V> bVar3 = bVar;
        C24884b<V> bVar4 = bVar2;
        if (bVar3 == this.f62925c && bVar4 == this.f62926d) {
            return this;
        }
        long j = this.f62923a;
        V v = this.f62924b;
        int i = bVar3.f62927e;
        int i2 = bVar4.f62927e;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                C24884b<V> bVar5 = bVar3.f62925c;
                C24884b<V> bVar6 = bVar3.f62926d;
                if (bVar6.f62927e < bVar5.f62927e * 2) {
                    long j2 = bVar3.f62923a;
                    return new C24884b(j2 + j, bVar3.f62924b, bVar5, new C24884b(-j2, v, bVar6.mo61361d(bVar6.f62923a + j2), bVar2));
                }
                C24884b<V> bVar7 = bVar6.f62925c;
                C24884b<V> bVar8 = bVar6.f62926d;
                long j3 = bVar6.f62923a;
                long j4 = bVar3.f62923a + j3 + j;
                V v2 = bVar6.f62924b;
                C24884b bVar9 = new C24884b(-j3, bVar3.f62924b, bVar5, bVar7.mo61361d(bVar7.f62923a + j3));
                long j5 = bVar3.f62923a;
                long j6 = bVar6.f62923a;
                return new C24884b<>(j4, v2, bVar9, new C24884b((-j5) - j6, v, bVar8.mo61361d(bVar8.f62923a + j6 + j5), bVar2));
            } else if (i2 >= i * 5) {
                C24884b<V> bVar10 = bVar4.f62925c;
                C24884b<V> bVar11 = bVar4.f62926d;
                if (bVar10.f62927e < bVar11.f62927e * 2) {
                    long j7 = bVar4.f62923a;
                    C24884b<V> bVar12 = bVar;
                    return new C24884b<>(j7 + j, bVar4.f62924b, new C24884b(-j7, v, bVar12, bVar10.mo61361d(bVar10.f62923a + j7)), bVar11);
                }
                C24884b<V> bVar13 = bVar10.f62925c;
                C24884b<V> bVar14 = bVar10.f62926d;
                long j8 = bVar10.f62923a;
                long j9 = bVar4.f62923a;
                long j10 = j8 + j9 + j;
                V v3 = bVar10.f62924b;
                C24884b bVar15 = new C24884b((-j9) - j8, v, bVar, bVar13.mo61361d(bVar13.f62923a + j8 + j9));
                long j11 = bVar10.f62923a;
                return new C24884b<>(j10, v3, bVar15, new C24884b(-j11, bVar4.f62924b, bVar14.mo61361d(bVar14.f62923a + j11), bVar11));
            }
        }
        return new C24884b(j, v, bVar, bVar2);
    }

    /* renamed from: d */
    public final C24884b<V> mo61361d(long j) {
        if (this.f62927e == 0 || j == this.f62923a) {
            return this;
        }
        return new C24884b(j, this.f62924b, this.f62925c, this.f62926d);
    }

    public C24884b(long j, V v, C24884b<V> bVar, C24884b<V> bVar2) {
        this.f62923a = j;
        this.f62924b = v;
        this.f62925c = bVar;
        this.f62926d = bVar2;
        this.f62927e = bVar.f62927e + 1 + bVar2.f62927e;
    }
}
