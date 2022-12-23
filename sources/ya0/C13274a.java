package ya0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ya0.a */
public final class C13274a {

    /* renamed from: a */
    public int f32930a = 0;

    /* renamed from: b */
    public int f32931b = 0;

    /* renamed from: c */
    public byte[] f32932c = null;

    /* renamed from: d */
    public ByteBuffer f32933d = null;

    /* renamed from: a */
    public final void mo40138a(byte b, byte b2, byte b3, byte b4) {
        int i = this.f32930a;
        int i2 = i + 4;
        int i3 = this.f32931b;
        if (i2 > i3) {
            int max = Math.max(6144, Math.max(i + 4, (i3 * 3) / 2));
            byte[] bArr = new byte[max];
            byte[] bArr2 = this.f32932c;
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, bArr, 0, this.f32930a);
            }
            this.f32932c = bArr;
            this.f32931b = max;
        }
        byte[] bArr3 = this.f32932c;
        int i4 = this.f32930a;
        int i5 = i4 + 1;
        bArr3[i4] = b;
        int i6 = i5 + 1;
        bArr3[i5] = b2;
        int i7 = i6 + 1;
        bArr3[i6] = b3;
        this.f32930a = i7 + 1;
        bArr3[i7] = b4;
    }

    /* renamed from: b */
    public final ByteBuffer mo40139b(int i, int i2) {
        int i3 = i + i2;
        int i4 = this.f32930a;
        if (i3 > i4) {
            i2 = i4 - i;
        }
        ByteBuffer byteBuffer = this.f32933d;
        if (byteBuffer == null || byteBuffer.capacity() < i2) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
            this.f32933d = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f32933d.position(0);
        byte[] bArr = this.f32932c;
        if (bArr != null) {
            this.f32933d.put(bArr, i, i2);
            this.f32933d.position(0);
        }
        return this.f32933d;
    }
}
