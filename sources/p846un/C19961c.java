package p846un;

import java.security.SecureRandom;

/* renamed from: un.c */
public final class C19961c implements C19959a {

    /* renamed from: a */
    public final SecureRandom f50753a = new SecureRandom();

    /* renamed from: a */
    public final byte[] mo52261a(int i) {
        byte[] bArr = new byte[i];
        this.f50753a.nextBytes(bArr);
        return bArr;
    }
}
