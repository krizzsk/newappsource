package vi0;

import java.util.BitSet;
import org.apache.thrift.TException;
import wi0.C25237a;
import wi0.C25240d;

/* renamed from: vi0.j */
public final class C25124j extends C25112b {
    /* renamed from: T */
    public final BitSet mo61737T(int i) throws TException {
        int ceil = (int) Math.ceil(((double) i) / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i2 = 0; i2 < ceil; i2++) {
            bArr[i2] = mo61691d();
        }
        BitSet bitSet = new BitSet();
        for (int i3 = 0; i3 < ceil * 8; i3++) {
            if ((bArr[(ceil - (i3 / 8)) - 1] & (1 << (i3 % 8))) > 0) {
                bitSet.set(i3);
            }
        }
        return bitSet;
    }

    /* renamed from: U */
    public final void mo61738U(BitSet bitSet, int i) throws TException {
        int ceil = (int) Math.ceil(((double) i) / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i2 = 0; i2 < bitSet.length(); i2++) {
            if (bitSet.get(i2)) {
                int i3 = (ceil - (i2 / 8)) - 1;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        for (int i4 = 0; i4 < ceil; i4++) {
            mo61716P(bArr[i4]);
        }
    }

    /* renamed from: a */
    public final Class<? extends C25237a> mo61736a() {
        return C25240d.class;
    }
}
