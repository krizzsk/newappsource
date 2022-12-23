package ya0;

/* renamed from: ya0.h */
public class C13283h<V> {

    /* renamed from: a */
    public transient C13284a<V>[] f32957a;

    /* renamed from: b */
    public transient int f32958b;

    /* renamed from: c */
    public int f32959c;

    /* renamed from: d */
    public float f32960d;

    /* renamed from: ya0.h$a */
    public static class C13284a<V> {

        /* renamed from: a */
        public long f32961a;

        /* renamed from: b */
        public V f32962b;

        /* renamed from: c */
        public C13284a<V> f32963c;

        public C13284a(long j, V v, C13284a<V> aVar) {
            this.f32961a = j;
            this.f32962b = v;
            this.f32963c = aVar;
        }
    }

    public C13283h() {
        this(20);
    }

    /* renamed from: b */
    public static int m33414b(long j) {
        return ((int) (j & 2147483647L)) ^ ((int) ((j >> 32) & 2147483647L));
    }

    /* renamed from: a */
    public final V mo40149a(long j) {
        C13284a<V>[] aVarArr = this.f32957a;
        for (C13284a<V> aVar = aVarArr[m33414b(j) % aVarArr.length]; aVar != null; aVar = aVar.f32963c) {
            if (aVar.f32961a == j) {
                return aVar.f32962b;
            }
        }
        return null;
    }

    /* renamed from: c */
    public V mo39771c(long j, V v) {
        C13284a<V>[] aVarArr = this.f32957a;
        int b = m33414b(j) % aVarArr.length;
        for (C13284a<V> aVar = aVarArr[b]; aVar != null; aVar = aVar.f32963c) {
            if (aVar.f32961a == j) {
                V v2 = aVar.f32962b;
                aVar.f32962b = v;
                return v2;
            }
        }
        if (this.f32958b >= this.f32959c) {
            C13284a<V>[] aVarArr2 = this.f32957a;
            int length = aVarArr2.length;
            int i = (length * 2) + 1;
            C13284a<V>[] aVarArr3 = new C13284a[i];
            this.f32959c = (int) (((float) i) * this.f32960d);
            this.f32957a = aVarArr3;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    break;
                }
                C13284a<V> aVar2 = aVarArr2[i2];
                while (aVar2 != null) {
                    C13284a<V> aVar3 = aVar2.f32963c;
                    int b2 = m33414b(aVar2.f32961a) % i;
                    aVar2.f32963c = aVarArr3[b2];
                    aVarArr3[b2] = aVar2;
                    aVar2 = aVar3;
                }
                length = i2;
            }
            aVarArr = this.f32957a;
            b = m33414b(j) % aVarArr.length;
        }
        aVarArr[b] = new C13284a<>(j, v, aVarArr[b]);
        this.f32958b++;
        return null;
    }

    /* renamed from: d */
    public final V mo40150d(long j) {
        C13284a<V>[] aVarArr = this.f32957a;
        int b = m33414b(j) % aVarArr.length;
        C13284a<V> aVar = null;
        for (C13284a<V> aVar2 = aVarArr[b]; aVar2 != null; aVar2 = aVar2.f32963c) {
            if (aVar2.f32961a == j) {
                if (aVar != null) {
                    aVar.f32963c = aVar2.f32963c;
                } else {
                    aVarArr[b] = aVar2.f32963c;
                }
                this.f32958b--;
                V v = aVar2.f32962b;
                aVar2.f32962b = null;
                return v;
            }
            aVar = aVar2;
        }
        return null;
    }

    public C13283h(int i) {
        if (i >= 0) {
            i = i == 0 ? 1 : i;
            this.f32960d = 0.75f;
            this.f32957a = new C13284a[i];
            this.f32959c = (int) (((float) i) * 0.75f);
            return;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Illegal Capacity: ", i));
    }
}
