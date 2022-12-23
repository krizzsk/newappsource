package p003a2;

import java.nio.ByteBuffer;
import wh0.C25154a0;

/* renamed from: a2.c */
public class C0048c {

    /* renamed from: a */
    public int f50a;

    /* renamed from: b */
    public ByteBuffer f51b;

    /* renamed from: c */
    public int f52c;

    /* renamed from: d */
    public int f53d;

    public C0048c() {
        if (C25154a0.f63431a == null) {
            C25154a0.f63431a = new C25154a0();
        }
    }

    /* renamed from: a */
    public final int mo24a(int i) {
        if (i < this.f53d) {
            return this.f51b.getShort(this.f52c + i);
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo25b(int i, ByteBuffer byteBuffer) {
        this.f51b = byteBuffer;
        if (byteBuffer != null) {
            this.f50a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f52c = i2;
            this.f53d = this.f51b.getShort(i2);
            return;
        }
        this.f50a = 0;
        this.f52c = 0;
        this.f53d = 0;
    }
}
