package sj0;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: sj0.e */
public final class C24926e extends C24924c {

    /* renamed from: c */
    public final MessageDigest f63006c = MessageDigest.getInstance("SHA-256");

    public C24926e() throws NoSuchAlgorithmException {
        this.f63004a = 32;
        this.f63005b = "SHA-256";
    }

    /* renamed from: a */
    public final byte[] mo61479a() {
        byte[] digest = this.f63006c.digest();
        this.f63006c.reset();
        return digest;
    }

    /* renamed from: c */
    public final void mo61480c(int i, int i2, byte[] bArr) {
        this.f63006c.update(bArr, i, i2);
    }
}
