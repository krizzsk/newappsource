package p677nj;

import ce0.C21100e;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.platform.storage.FileStorageException;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p413co.C13859g;
import p441dk.C16672a;
import p677nj.C18554a;
import p677nj.C18556b;
import p677nj.C18558c;

/* renamed from: nj.l */
public final class C18569l {

    /* renamed from: a */
    public final C13859g f47257a;

    /* renamed from: b */
    public final C18568k f47258b;

    /* renamed from: c */
    public final C18558c.C18559a f47259c;

    /* renamed from: d */
    public final C18554a.C18555a f47260d;

    /* renamed from: e */
    public final C18556b.C18557a f47261e;

    /* renamed from: f */
    public C18558c f47262f;

    /* renamed from: g */
    public C18558c f47263g;

    /* renamed from: h */
    public C18554a f47264h;

    /* renamed from: i */
    public C18556b f47265i;

    public C18569l(C13859g gVar, C18568k kVar, C18558c.C18559a aVar, C18554a.C18555a aVar2, C18556b.C18557a aVar3) {
        this.f47257a = gVar;
        this.f47258b = kVar;
        this.f47259c = aVar;
        this.f47260d = aVar2;
        this.f47261e = aVar3;
    }

    /* renamed from: a */
    public final C18554a mo50964a() throws CryptoException {
        if (this.f47264h == null) {
            try {
                SecretKey a = this.f47258b.mo50963a();
                this.f47260d.getClass();
                this.f47264h = new C18554a(a);
            } catch (CryptoException e) {
                throw new CryptoException(String.format("Failed getting data (%d)", new Object[]{C16672a.f43381C}), e);
            }
        }
        return this.f47264h;
    }

    /* renamed from: b */
    public final C18556b mo50965b() throws CryptoException {
        if (this.f47265i == null) {
            try {
                SecretKey a = this.f47258b.mo50963a();
                this.f47261e.getClass();
                this.f47265i = new C18556b(a);
            } catch (CryptoException e) {
                throw new CryptoException(String.format("Failed getting data (%d)", new Object[]{C16672a.f43382D}), e);
            }
        }
        return this.f47265i;
    }

    /* renamed from: c */
    public final C18558c mo50966c() throws CryptoException {
        if (this.f47262f == null) {
            this.f47259c.getClass();
            this.f47262f = new C18558c(256);
        }
        return this.f47262f;
    }

    /* renamed from: d */
    public final byte[] mo50967d(C18554a aVar, byte[] bArr) throws CryptoException {
        if (this.f47263g == null) {
            this.f47259c.getClass();
            this.f47263g = C18558c.C18559a.m45474a();
        }
        int i = this.f47263g.f47242b / 8;
        return aVar.mo50959a(Arrays.copyOfRange(bArr, i, bArr.length), Arrays.copyOf(bArr, i));
    }

    /* renamed from: e */
    public final synchronized SecretKey mo50968e(String str) throws CryptoException {
        SecretKey secretKey;
        try {
            byte[] c = this.f47257a.mo40804c(C21100e.m49337e0(), str);
            if (c == null) {
                try {
                    C18556b b = mo50965b();
                    secretKey = mo50966c().mo50961a();
                    if (this.f47263g == null) {
                        this.f47259c.getClass();
                        this.f47263g = C18558c.C18559a.m45474a();
                    }
                    byte[] encoded = this.f47263g.mo50961a().getEncoded();
                    this.f47257a.mo40806e(C21100e.m49337e0(), str, C21100e.m49302D(encoded, b.mo50960a(secretKey.getEncoded(), encoded)));
                } catch (CryptoException e) {
                    e = e;
                    throw new CryptoException(String.format("Failed providing a key for folder %s", new Object[]{str}), e);
                } catch (FileStorageException e2) {
                    e = e2;
                    throw new CryptoException(String.format("Failed providing a key for folder %s", new Object[]{str}), e);
                }
            } else {
                secretKey = new SecretKeySpec(mo50967d(mo50964a(), c), KeyProvider18.KEY_ALGORITHM_AES);
            }
        } catch (FileStorageException e3) {
            throw new CryptoException(String.format("Failed providing SecretKey for folder %s", new Object[]{str}), e3);
        } catch (Throwable th) {
            throw th;
        }
        return secretKey;
    }
}
