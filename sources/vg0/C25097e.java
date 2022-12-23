package vg0;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import p001a0.C0016g;
import p583jk.C17884p;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;
import vg0.C25091a;

/* renamed from: vg0.e */
public class C25097e extends C25091a {

    /* renamed from: c */
    public final byte[] f63309c;

    /* renamed from: d */
    public int f63310d = 0;

    /* renamed from: vg0.e$a */
    public class C25098a implements C25091a.C25092a, Iterator {

        /* renamed from: b */
        public int f63311b = 0;

        /* renamed from: c */
        public final int f63312c;

        public C25098a() {
            this.f63312c = C25097e.this.f63309c.length;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f63311b < this.f63312c;
        }

        public final Object next() {
            return Byte.valueOf(nextByte());
        }

        public final byte nextByte() {
            try {
                byte[] bArr = C25097e.this.f63309c;
                int i = this.f63311b;
                this.f63311b = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C25097e(byte[] bArr) {
        this.f63309c = bArr;
    }

    /* renamed from: B */
    public final String mo61615B() throws UnsupportedEncodingException {
        byte[] bArr = this.f63309c;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    /* renamed from: C */
    public final void mo61616C(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f63309c, mo61649E() + i, i2);
    }

    /* renamed from: D */
    public final boolean mo61648D(C25097e eVar, int i, int i2) {
        if (i2 > eVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= eVar.size()) {
            byte[] bArr = this.f63309c;
            byte[] bArr2 = eVar.f63309c;
            int E = mo61649E() + i2;
            int E2 = mo61649E();
            int E3 = eVar.mo61649E() + i;
            while (E2 < E) {
                if (bArr[E2] != bArr2[E3]) {
                    return false;
                }
                E2++;
                E3++;
            }
            return true;
        } else {
            int size2 = eVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: E */
    public int mo61649E() {
        return 0;
    }

    /* renamed from: e */
    public void mo61619e(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.f63309c, i, bArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25091a) || size() != ((C25091a) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C25097e) {
            return mo61648D((C25097e) obj, 0, size());
        }
        if (obj instanceof C25101h) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(C0016g.m31o(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public final int hashCode() {
        int i = this.f63310d;
        if (i == 0) {
            int size = size();
            i = mo61627u(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f63310d = i;
        }
        return i;
    }

    /* renamed from: i */
    public final int mo61620i() {
        return 0;
    }

    /* renamed from: m */
    public final boolean mo61622m() {
        return true;
    }

    /* renamed from: n */
    public final boolean mo61623n() {
        byte[] bArr = this.f63309c;
        if (C17884p.m44344O(0, bArr.length + 0, bArr) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public C25091a.C25092a iterator() {
        return new C25098a();
    }

    public int size() {
        return this.f63309c.length;
    }

    /* renamed from: u */
    public final int mo61627u(int i, int i2, int i3) {
        byte[] bArr = this.f63309c;
        int E = mo61649E() + i2;
        for (int i4 = E; i4 < E + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (r1[r11] > -65) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0098, code lost:
        if (r1[r11] > -65) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r1[r11] > -65) goto L_0x009a;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo61628x(int r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = 0
            int r11 = r11 + r0
            byte[] r1 = r9.f63309c
            int r12 = r12 + r11
            r2 = -1
            if (r10 == 0) goto L_0x009c
            if (r11 < r12) goto L_0x000c
            goto L_0x00a0
        L_0x000c:
            byte r3 = (byte) r10
            r4 = -32
            r5 = -65
            if (r3 >= r4) goto L_0x0022
            r10 = -62
            if (r3 < r10) goto L_0x009a
            int r10 = r11 + 1
            byte r11 = r1[r11]
            if (r11 <= r5) goto L_0x001f
            goto L_0x009a
        L_0x001f:
            r11 = r10
            goto L_0x009c
        L_0x0022:
            r6 = -16
            r7 = -12
            if (r3 >= r6) goto L_0x0057
            int r10 = r10 >> 8
            int r10 = ~r10
            byte r10 = (byte) r10
            if (r10 != 0) goto L_0x0042
            int r10 = r11 + 1
            byte r11 = r1[r11]
            if (r10 < r12) goto L_0x003f
            if (r3 > r7) goto L_0x009a
            if (r11 <= r5) goto L_0x003a
            goto L_0x009a
        L_0x003a:
            int r10 = r11 << 8
        L_0x003c:
            r10 = r10 ^ r3
            goto L_0x00a0
        L_0x003f:
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0042:
            if (r10 > r5) goto L_0x009a
            r0 = -96
            if (r3 != r4) goto L_0x004a
            if (r10 < r0) goto L_0x009a
        L_0x004a:
            r4 = -19
            if (r3 != r4) goto L_0x0050
            if (r10 >= r0) goto L_0x009a
        L_0x0050:
            int r10 = r11 + 1
            byte r11 = r1[r11]
            if (r11 <= r5) goto L_0x001f
            goto L_0x009a
        L_0x0057:
            int r4 = r10 >> 8
            int r4 = ~r4
            byte r4 = (byte) r4
            if (r4 != 0) goto L_0x006d
            int r10 = r11 + 1
            byte r4 = r1[r11]
            if (r10 < r12) goto L_0x006b
            if (r3 > r7) goto L_0x009a
            if (r4 <= r5) goto L_0x0068
            goto L_0x009a
        L_0x0068:
            int r10 = r4 << 8
            goto L_0x003c
        L_0x006b:
            r11 = r10
            goto L_0x0070
        L_0x006d:
            int r10 = r10 >> 16
            byte r0 = (byte) r10
        L_0x0070:
            if (r0 != 0) goto L_0x0087
            int r10 = r11 + 1
            byte r0 = r1[r11]
            if (r10 < r12) goto L_0x0086
            if (r3 > r7) goto L_0x009a
            if (r4 > r5) goto L_0x009a
            if (r0 <= r5) goto L_0x007f
            goto L_0x009a
        L_0x007f:
            int r10 = r4 << 8
            r10 = r10 ^ r3
            int r11 = r0 << 16
            r10 = r10 ^ r11
            goto L_0x00a0
        L_0x0086:
            r11 = r10
        L_0x0087:
            if (r4 > r5) goto L_0x009a
            int r10 = r3 << 28
            int r4 = r4 + 112
            int r4 = r4 + r10
            int r10 = r4 >> 30
            if (r10 != 0) goto L_0x009a
            if (r0 > r5) goto L_0x009a
            int r10 = r11 + 1
            byte r11 = r1[r11]
            if (r11 <= r5) goto L_0x001f
        L_0x009a:
            r10 = -1
            goto L_0x00a0
        L_0x009c:
            int r10 = p583jk.C17884p.m44344O(r11, r12, r1)
        L_0x00a0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vg0.C25097e.mo61628x(int, int, int):int");
    }

    /* renamed from: z */
    public final int mo61629z() {
        return this.f63310d;
    }
}
