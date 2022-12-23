package sj0;

import java.security.NoSuchAlgorithmException;
import org.tukaani.p981xz.UnsupportedOptionsException;

/* renamed from: sj0.c */
public abstract class C24924c {

    /* renamed from: a */
    public int f63004a;

    /* renamed from: b */
    public String f63005b;

    /* renamed from: b */
    public static C24924c m62604b(int i) throws UnsupportedOptionsException {
        if (i == 0) {
            return new C24925d();
        }
        if (i == 1) {
            return new C24922a();
        }
        if (i == 4) {
            return new C24923b();
        }
        if (i == 10) {
            try {
                return new C24926e();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unsupported Check ID ");
        stringBuffer.append(i);
        throw new UnsupportedOptionsException(stringBuffer.toString());
    }

    /* renamed from: a */
    public abstract byte[] mo61479a();

    /* renamed from: c */
    public abstract void mo61480c(int i, int i2, byte[] bArr);
}
