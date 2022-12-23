package p173ma;

import java.util.Arrays;
import p001a0.C0016g;
import p001a0.C0017h;
import p173ma.C5750t;
import p277ub.C6774a0;

/* renamed from: ma.c */
public final class C5730c implements C5750t {

    /* renamed from: a */
    public final int f18576a;

    /* renamed from: b */
    public final int[] f18577b;

    /* renamed from: c */
    public final long[] f18578c;

    /* renamed from: d */
    public final long[] f18579d;

    /* renamed from: e */
    public final long[] f18580e;

    /* renamed from: f */
    public final long f18581f;

    public C5730c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18577b = iArr;
        this.f18578c = jArr;
        this.f18579d = jArr2;
        this.f18580e = jArr3;
        int length = iArr.length;
        this.f18576a = length;
        if (length > 0) {
            this.f18581f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f18581f = 0;
        }
    }

    /* renamed from: c */
    public final C5750t.C5751a mo21569c(long j) {
        int e = C6774a0.m15945e(this.f18580e, j, true);
        long[] jArr = this.f18580e;
        long j2 = jArr[e];
        long[] jArr2 = this.f18578c;
        C5753u uVar = new C5753u(j2, jArr2[e]);
        if (j2 >= j || e == this.f18576a - 1) {
            return new C5750t.C5751a(uVar, uVar);
        }
        int i = e + 1;
        return new C5750t.C5751a(uVar, new C5753u(jArr[i], jArr2[i]));
    }

    /* renamed from: e */
    public final boolean mo21570e() {
        return true;
    }

    /* renamed from: i */
    public final long mo21571i() {
        return this.f18581f;
    }

    public final String toString() {
        int i = this.f18576a;
        String arrays = Arrays.toString(this.f18577b);
        String arrays2 = Arrays.toString(this.f18578c);
        String arrays3 = Arrays.toString(this.f18580e);
        String arrays4 = Arrays.toString(this.f18579d);
        StringBuilder sb = new StringBuilder(C0016g.m25h(arrays4, C0016g.m25h(arrays3, C0016g.m25h(arrays2, C0016g.m25h(arrays, 71)))));
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        C0017h.m61R(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return C13715c.m34245k(sb, ", durationsUs=", arrays4, ")");
    }
}
