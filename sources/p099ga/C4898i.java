package p099ga;

/* renamed from: ga.i */
public final class C4898i implements C4899i0 {

    /* renamed from: a */
    public final long f16512a;

    /* renamed from: b */
    public final long f16513b;

    /* renamed from: c */
    public final float f16514c;

    /* renamed from: d */
    public long f16515d = -9223372036854775807L;

    /* renamed from: e */
    public long f16516e = -9223372036854775807L;

    /* renamed from: f */
    public long f16517f = -9223372036854775807L;

    /* renamed from: g */
    public long f16518g = -9223372036854775807L;

    /* renamed from: h */
    public long f16519h = -9223372036854775807L;

    /* renamed from: i */
    public long f16520i = -9223372036854775807L;

    /* renamed from: j */
    public float f16521j = 1.03f;

    /* renamed from: k */
    public float f16522k = 0.97f;

    /* renamed from: l */
    public float f16523l = 1.0f;

    /* renamed from: m */
    public long f16524m = -9223372036854775807L;

    /* renamed from: n */
    public long f16525n = -9223372036854775807L;

    /* renamed from: o */
    public long f16526o = -9223372036854775807L;

    public C4898i(long j, long j2, float f) {
        this.f16512a = j;
        this.f16513b = j2;
        this.f16514c = f;
    }

    /* renamed from: a */
    public final void mo20537a() {
        long j = this.f16515d;
        if (j != -9223372036854775807L) {
            long j2 = this.f16516e;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f16518g;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f16519h;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f16517f != j) {
            this.f16517f = j;
            this.f16520i = j;
            this.f16525n = -9223372036854775807L;
            this.f16526o = -9223372036854775807L;
            this.f16524m = -9223372036854775807L;
        }
    }
}
