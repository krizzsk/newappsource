package p277ub;

import java.util.Arrays;
import p583jk.C17875h;

/* renamed from: ub.x */
public final class C6811x {

    /* renamed from: a */
    public int f21065a;

    /* renamed from: b */
    public int f21066b;

    /* renamed from: c */
    public Object f21067c;

    /* renamed from: d */
    public Object f21068d;

    public C6811x() {
        this.f21067c = new long[10];
        this.f21068d = new Object[10];
    }

    /* renamed from: a */
    public final synchronized void mo23024a(long j, Object obj) {
        int i = this.f21066b;
        if (i > 0) {
            if (j <= ((long[]) this.f21067c)[((this.f21065a + i) - 1) % ((Object[]) this.f21068d).length]) {
                mo23025b();
            }
        }
        mo23026c();
        int i2 = this.f21065a;
        int i3 = this.f21066b;
        Object obj2 = this.f21068d;
        int length = (i2 + i3) % ((Object[]) obj2).length;
        ((long[]) this.f21067c)[length] = j;
        ((Object[]) obj2)[length] = obj;
        this.f21066b = i3 + 1;
    }

    /* renamed from: b */
    public final synchronized void mo23025b() {
        this.f21065a = 0;
        this.f21066b = 0;
        Arrays.fill((Object[]) this.f21068d, (Object) null);
    }

    /* renamed from: c */
    public final void mo23026c() {
        int length = ((Object[]) this.f21068d).length;
        if (this.f21066b >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            Object[] objArr = new Object[i];
            int i2 = this.f21065a;
            int i3 = length - i2;
            System.arraycopy((long[]) this.f21067c, i2, jArr, 0, i3);
            System.arraycopy((Object[]) this.f21068d, this.f21065a, objArr, 0, i3);
            int i4 = this.f21065a;
            if (i4 > 0) {
                System.arraycopy((long[]) this.f21067c, 0, jArr, i3, i4);
                System.arraycopy((Object[]) this.f21068d, 0, objArr, i3, this.f21065a);
            }
            this.f21067c = jArr;
            this.f21068d = objArr;
            this.f21065a = 0;
        }
    }

    /* renamed from: d */
    public final boolean mo23027d(int i, int i2) {
        return ((byte[]) this.f21068d)[(i2 * this.f21066b) + i] >= 0;
    }

    /* renamed from: e */
    public final void mo23028e(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f21065a;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f21066b;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        int i7 = 1;
        if ((((CharSequence) this.f21067c).charAt(i3) & (1 << (8 - i4))) == 0) {
            i7 = 0;
        }
        ((byte[]) this.f21068d)[(i * this.f21066b) + i2] = (byte) i7;
    }

    /* renamed from: f */
    public final Object mo23029f(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (this.f21066b > 0) {
            long j3 = j - ((long[]) this.f21067c)[this.f21065a];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = mo23030g();
            j2 = j3;
        }
        return obj;
    }

    /* renamed from: g */
    public final Object mo23030g() {
        boolean z;
        if (this.f21066b > 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        Object obj = this.f21068d;
        int i = this.f21065a;
        Object obj2 = ((Object[]) obj)[i];
        ((Object[]) obj)[i] = null;
        this.f21065a = (i + 1) % ((Object[]) obj).length;
        this.f21066b--;
        return obj2;
    }

    /* renamed from: h */
    public final void mo23031h(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        mo23028e(i4, i5, i3, 1);
        int i6 = i2 - 1;
        mo23028e(i4, i6, i3, 2);
        int i7 = i - 1;
        mo23028e(i7, i5, i3, 3);
        mo23028e(i7, i6, i3, 4);
        mo23028e(i7, i2, i3, 5);
        mo23028e(i, i5, i3, 6);
        mo23028e(i, i6, i3, 7);
        mo23028e(i, i2, i3, 8);
    }

    public /* synthetic */ C6811x(String str, int i, int i2) {
        this.f21067c = str;
        this.f21066b = i;
        this.f21065a = i2;
        byte[] bArr = new byte[(i * i2)];
        this.f21068d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }
}
