package sj0;

import java.util.zip.CRC32;

/* renamed from: sj0.a */
public final class C24922a extends C24924c {

    /* renamed from: c */
    public final CRC32 f63001c = new CRC32();

    public C24922a() {
        this.f63004a = 4;
        this.f63005b = "CRC32";
    }

    /* renamed from: a */
    public final byte[] mo61479a() {
        long value = this.f63001c.getValue();
        byte[] bArr = {(byte) ((int) value), (byte) ((int) (value >>> 8)), (byte) ((int) (value >>> 16)), (byte) ((int) (value >>> 24))};
        this.f63001c.reset();
        return bArr;
    }

    /* renamed from: c */
    public final void mo61480c(int i, int i2, byte[] bArr) {
        this.f63001c.update(bArr, i, i2);
    }
}
