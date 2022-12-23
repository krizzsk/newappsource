package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import java.io.IOException;
import java.io.OutputStream;
import vg0.C25091a;

public final class CodedOutputStream {

    /* renamed from: a */
    public final byte[] f61046a;

    /* renamed from: b */
    public final int f61047b;

    /* renamed from: c */
    public int f61048c = 0;

    /* renamed from: d */
    public final OutputStream f61049d;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f61049d = outputStream;
        this.f61046a = bArr;
        this.f61047b = bArr.length;
    }

    /* renamed from: a */
    public static int m60025a(int i, int i2) {
        return m60027c(i2) + m60032h(i);
    }

    /* renamed from: b */
    public static int m60026b(int i, int i2) {
        return m60027c(i2) + m60032h(i);
    }

    /* renamed from: c */
    public static int m60027c(int i) {
        if (i >= 0) {
            return m60030f(i);
        }
        return 10;
    }

    /* renamed from: d */
    public static int m60028d(int i, C24090h hVar) {
        int h = m60032h(i);
        int serializedSize = hVar.getSerializedSize();
        return m60030f(serializedSize) + serializedSize + h;
    }

    /* renamed from: e */
    public static int m60029e(C24090h hVar) {
        int serializedSize = hVar.getSerializedSize();
        return m60030f(serializedSize) + serializedSize;
    }

    /* renamed from: f */
    public static int m60030f(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m60031g(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: h */
    public static int m60032h(int i) {
        return m60030f((i << 3) | 0);
    }

    /* renamed from: j */
    public static CodedOutputStream m60033j(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    /* renamed from: i */
    public final void mo59973i() throws IOException {
        if (this.f61049d != null) {
            mo59974k();
        }
    }

    /* renamed from: k */
    public final void mo59974k() throws IOException {
        OutputStream outputStream = this.f61049d;
        if (outputStream != null) {
            outputStream.write(this.f61046a, 0, this.f61048c);
            this.f61048c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    /* renamed from: l */
    public final void mo59975l(int i, int i2) throws IOException {
        mo59987x(i, 0);
        mo59977n(i2);
    }

    /* renamed from: m */
    public final void mo59976m(int i, int i2) throws IOException {
        mo59987x(i, 0);
        mo59977n(i2);
    }

    /* renamed from: n */
    public final void mo59977n(int i) throws IOException {
        if (i >= 0) {
            mo59985v(i);
        } else {
            mo59986w((long) i);
        }
    }

    /* renamed from: o */
    public final void mo59978o(int i, C24090h hVar) throws IOException {
        mo59987x(i, 2);
        mo59979p(hVar);
    }

    /* renamed from: p */
    public final void mo59979p(C24090h hVar) throws IOException {
        mo59985v(hVar.getSerializedSize());
        hVar.mo59605a(this);
    }

    /* renamed from: q */
    public final void mo59980q(int i) throws IOException {
        byte b = (byte) i;
        if (this.f61048c == this.f61047b) {
            mo59974k();
        }
        byte[] bArr = this.f61046a;
        int i2 = this.f61048c;
        this.f61048c = i2 + 1;
        bArr[i2] = b;
    }

    /* renamed from: r */
    public final void mo59981r(C25091a aVar) throws IOException {
        int size = aVar.size();
        int i = this.f61047b;
        int i2 = this.f61048c;
        int i3 = i - i2;
        if (i3 >= size) {
            aVar.mo61618d(0, i2, size, this.f61046a);
            this.f61048c += size;
            return;
        }
        aVar.mo61618d(0, i2, i3, this.f61046a);
        int i4 = i3 + 0;
        int i5 = size - i3;
        this.f61048c = this.f61047b;
        mo59974k();
        if (i5 <= this.f61047b) {
            aVar.mo61618d(i4, 0, i5, this.f61046a);
            this.f61048c = i5;
            return;
        }
        OutputStream outputStream = this.f61049d;
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(C13715c.m34241g(30, "Source offset < 0: ", i4));
        } else if (i5 >= 0) {
            int i6 = i4 + i5;
            if (i6 > aVar.size()) {
                throw new IndexOutOfBoundsException(C13715c.m34241g(39, "Source end offset exceeded: ", i6));
            } else if (i5 > 0) {
                aVar.mo61616C(outputStream, i4, i5);
            }
        } else {
            throw new IndexOutOfBoundsException(C13715c.m34241g(23, "Length < 0: ", i5));
        }
    }

    /* renamed from: s */
    public final void mo59982s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.f61047b;
        int i2 = this.f61048c;
        int i3 = i - i2;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, this.f61046a, i2, length);
            this.f61048c += length;
            return;
        }
        System.arraycopy(bArr, 0, this.f61046a, i2, i3);
        int i4 = i3 + 0;
        int i5 = length - i3;
        this.f61048c = this.f61047b;
        mo59974k();
        if (i5 <= this.f61047b) {
            System.arraycopy(bArr, i4, this.f61046a, 0, i5);
            this.f61048c = i5;
            return;
        }
        this.f61049d.write(bArr, i4, i5);
    }

    /* renamed from: t */
    public final void mo59983t(int i) throws IOException {
        mo59980q(i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo59980q((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo59980q((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo59980q((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: u */
    public final void mo59984u(long j) throws IOException {
        mo59980q(((int) j) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo59980q(((int) (j >> 8)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo59980q(((int) (j >> 16)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo59980q(((int) (j >> 24)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo59980q(((int) (j >> 32)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo59980q(((int) (j >> 40)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo59980q(((int) (j >> 48)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo59980q(((int) (j >> 56)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: v */
    public final void mo59985v(int i) throws IOException {
        while ((i & -128) != 0) {
            mo59980q((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            i >>>= 7;
        }
        mo59980q(i);
    }

    /* renamed from: w */
    public final void mo59986w(long j) throws IOException {
        while ((-128 & j) != 0) {
            mo59980q((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            j >>>= 7;
        }
        mo59980q((int) j);
    }

    /* renamed from: x */
    public final void mo59987x(int i, int i2) throws IOException {
        mo59985v((i << 3) | i2);
    }
}
