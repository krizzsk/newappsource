package p264ta;

import com.moovit.database.sqlite.SQLiteDatabase;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: ta.o */
public final class C6644o {

    /* renamed from: a */
    public final C6641l f20637a;

    /* renamed from: b */
    public final int f20638b;

    /* renamed from: c */
    public final long[] f20639c;

    /* renamed from: d */
    public final int[] f20640d;

    /* renamed from: e */
    public final int f20641e;

    /* renamed from: f */
    public final long[] f20642f;

    /* renamed from: g */
    public final int[] f20643g;

    /* renamed from: h */
    public final long f20644h;

    public C6644o(C6641l lVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17875h.m44301k(z2);
        C17875h.m44301k(iArr2.length == jArr2.length ? true : z3);
        this.f20637a = lVar;
        this.f20639c = jArr;
        this.f20640d = iArr;
        this.f20641e = i;
        this.f20642f = jArr2;
        this.f20643g = iArr2;
        this.f20644h = j;
        this.f20638b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: a */
    public final int mo22815a(long j) {
        for (int b = C6774a0.m15942b(this.f20642f, j, true); b < this.f20642f.length; b++) {
            if ((this.f20643g[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
