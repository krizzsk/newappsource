package z10;

import java.io.IOException;
import java.io.OutputStream;
import p072e6.C4564b;

/* renamed from: z10.i */
public final class C20805i extends OutputStream {

    /* renamed from: b */
    public byte[] f52515b;

    /* renamed from: c */
    public int f52516c;

    /* renamed from: d */
    public final C4564b f52517d;

    public C20805i(int i, C4564b bVar) {
        if (i >= 0) {
            this.f52517d = bVar;
            this.f52515b = (byte[]) bVar.mo20074c(i, byte[].class);
            return;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Negative initial size: ", i));
    }

    /* renamed from: a */
    public final void mo52926a(int i) {
        byte[] bArr = this.f52515b;
        if (i - bArr.length > 0) {
            int length = bArr.length;
            int i2 = length << 1;
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                } else if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            byte[] bArr2 = (byte[]) this.f52517d.mo20074c(i2, byte[].class);
            System.arraycopy(this.f52515b, 0, bArr2, 0, length);
            byte[] bArr3 = this.f52515b;
            if (bArr3 != null) {
                this.f52517d.put(bArr3);
                this.f52515b = null;
            }
            this.f52515b = bArr2;
        }
    }

    public final void close() throws IOException {
        super.close();
        byte[] bArr = this.f52515b;
        if (bArr != null) {
            this.f52517d.put(bArr);
            this.f52515b = null;
        }
    }

    public final synchronized void write(int i) {
        mo52926a(this.f52516c + 1);
        byte[] bArr = this.f52515b;
        int i2 = this.f52516c;
        bArr[i2] = (byte) i;
        this.f52516c = i2 + 1;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (i >= 0) {
            if (i <= bArr.length && i2 >= 0 && (i + i2) - bArr.length <= 0) {
                mo52926a(this.f52516c + i2);
                System.arraycopy(bArr, i, this.f52515b, this.f52516c, i2);
                this.f52516c += i2;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
