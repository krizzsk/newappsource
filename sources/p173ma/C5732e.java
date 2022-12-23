package p173ma;

import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p265tb.C6652e;
import p265tb.C6654g;
import p277ub.C6774a0;

/* renamed from: ma.e */
public final class C5732e implements C5736i {

    /* renamed from: a */
    public final byte[] f18588a = new byte[4096];

    /* renamed from: b */
    public final C6652e f18589b;

    /* renamed from: c */
    public final long f18590c;

    /* renamed from: d */
    public long f18591d;

    /* renamed from: e */
    public byte[] f18592e = new byte[SQLiteDatabase.OPEN_FULLMUTEX];

    /* renamed from: f */
    public int f18593f;

    /* renamed from: g */
    public int f18594g;

    public C5732e(C6654g gVar, long j, long j2) {
        this.f18589b = gVar;
        this.f18591d = j;
        this.f18590c = j2;
    }

    /* renamed from: a */
    public final void mo21575a(int i, int i2, byte[] bArr) throws IOException {
        mo21583j(i, i2, bArr, false);
    }

    /* renamed from: c */
    public final void mo21576c() {
        this.f18593f = 0;
    }

    /* renamed from: f */
    public final long mo21577f() {
        return this.f18591d + ((long) this.f18593f);
    }

    /* renamed from: g */
    public final void mo21578g(int i) throws IOException {
        mo21584k(i, false);
    }

    public final long getLength() {
        return this.f18590c;
    }

    public final long getPosition() {
        return this.f18591d;
    }

    /* renamed from: h */
    public final boolean mo21581h(int i, int i2, byte[] bArr, boolean z) throws IOException {
        int i3;
        int i4 = this.f18594g;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.f18592e, 0, bArr, i, i3);
            mo21589p(i3);
        }
        int i5 = i3;
        while (i5 < i2 && i5 != -1) {
            i5 = mo21587n(bArr, i, i2, i5, z);
        }
        if (i5 != -1) {
            this.f18591d += (long) i5;
        }
        if (i5 != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo21582i(int i) throws IOException {
        int min = Math.min(this.f18594g, i);
        mo21589p(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = mo21587n(this.f18588a, -i2, Math.min(i, this.f18588a.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.f18591d += (long) i2;
        }
    }

    /* renamed from: j */
    public final boolean mo21583j(int i, int i2, byte[] bArr, boolean z) throws IOException {
        if (!mo21584k(i2, z)) {
            return false;
        }
        System.arraycopy(this.f18592e, this.f18593f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: k */
    public final boolean mo21584k(int i, boolean z) throws IOException {
        mo21585l(i);
        int i2 = this.f18594g - this.f18593f;
        while (i2 < i) {
            i2 = mo21587n(this.f18592e, this.f18593f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f18594g = this.f18593f + i2;
        }
        this.f18593f += i;
        return true;
    }

    /* renamed from: l */
    public final void mo21585l(int i) {
        int i2 = this.f18593f + i;
        byte[] bArr = this.f18592e;
        if (i2 > bArr.length) {
            this.f18592e = Arrays.copyOf(this.f18592e, C6774a0.m15947g(bArr.length * 2, SQLiteDatabase.OPEN_FULLMUTEX + i2, i2 + 524288));
        }
    }

    /* renamed from: m */
    public final int mo21586m(int i, int i2, byte[] bArr) throws IOException {
        int i3;
        mo21585l(i2);
        int i4 = this.f18594g;
        int i5 = this.f18593f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = mo21587n(this.f18592e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f18594g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f18592e, this.f18593f, bArr, i, i3);
        this.f18593f += i3;
        return i3;
    }

    /* renamed from: n */
    public final int mo21587n(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.f18589b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: o */
    public final int mo21588o() throws IOException {
        int min = Math.min(this.f18594g, 1);
        mo21589p(min);
        if (min == 0) {
            byte[] bArr = this.f18588a;
            min = mo21587n(bArr, 0, Math.min(1, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f18591d += (long) min;
        }
        return min;
    }

    /* renamed from: p */
    public final void mo21589p(int i) {
        byte[] bArr;
        int i2 = this.f18594g - i;
        this.f18594g = i2;
        this.f18593f = 0;
        byte[] bArr2 = this.f18592e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[(SQLiteDatabase.OPEN_FULLMUTEX + i2)];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.f18592e = bArr;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f18594g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f18592e, 0, bArr, i, min);
            mo21589p(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = mo21587n(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.f18591d += (long) i4;
        }
        return i4;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        mo21581h(i, i2, bArr, false);
    }
}
