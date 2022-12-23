package p958zg;

import p043ch.C13830a;

/* renamed from: zg.d */
public final class C20845d extends C20847f {

    /* renamed from: c */
    public final short f52569c;

    /* renamed from: d */
    public final short f52570d;

    public C20845d(C20847f fVar, int i, int i2) {
        super(fVar);
        this.f52569c = (short) i;
        this.f52570d = (short) i2;
    }

    /* renamed from: a */
    public final void mo52965a(C13830a aVar, byte[] bArr) {
        aVar.mo40756b(this.f52569c, this.f52570d);
    }

    public final String toString() {
        short s = this.f52569c;
        short s2 = this.f52570d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(s3 | (1 << this.f52570d)).substring(1) + '>';
    }
}
