package p413co;

import ce0.C21100e;
import cf0.C21132f;
import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.crypto.KeyStorageAES;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.SecretKey;
import kotlin.Pair;
import mf0.C24362h;
import p441dk.C16672a;
import p583jk.C17873f;
import p677nj.C18554a;
import p677nj.C18556b;
import p677nj.C18558c;
import p725pj.C18926a;

/* renamed from: co.c */
public final class C13854c implements C13869o {

    /* renamed from: a */
    public C18558c f34082a;

    /* renamed from: b */
    public Pair<String, byte[]> f34083b;

    /* renamed from: c */
    public Pair<String, byte[]> f34084c;

    /* renamed from: d */
    public final KeyStorageAES f34085d;

    /* renamed from: e */
    public final C18558c.C18559a f34086e;

    /* renamed from: f */
    public final C18554a.C18555a f34087f;

    /* renamed from: g */
    public final C17873f f34088g;

    /* renamed from: co.c$a */
    public static final class C13855a {
        /* renamed from: a */
        public static String m34555a() {
            return C21100e.m49304E(new byte[]{115, 101, 99, 117, 114, 101, 84, 101, 120, 116, 70, 105, 101, 108, 100, 80, 97, 110, 75, 101, 121, 78, 97, 109, 101});
        }

        /* renamed from: b */
        public static String m34556b() {
            return C21100e.m49304E(new byte[]{115, 101, 99, 117, 114, 101, 84, 101, 120, 116, 70, 105, 101, 108, 100, 67, 118, 118, 75, 101, 121, 78, 97, 109, 101});
        }
    }

    public C13854c(KeyStorageAES keyStorageAES, C18558c.C18559a aVar, C18556b.C18557a aVar2, C18554a.C18555a aVar3, C17873f fVar) {
        C24362h.m61211f(keyStorageAES, "keyStorageAES");
        C24362h.m61211f(aVar, "aesKeyGeneratorFactory");
        C24362h.m61211f(aVar2, "aesBytesEncryptorFactory");
        C24362h.m61211f(aVar3, "aesBytesDecryptorFactory");
        C24362h.m61211f(fVar, "exceptionToErrorConverter");
        this.f34085d = keyStorageAES;
        this.f34086e = aVar;
        this.f34087f = aVar3;
        this.f34088g = fVar;
    }

    /* renamed from: a */
    public final void mo40792a() {
        this.f34084c = null;
    }

    /* renamed from: b */
    public final C13872r<String> mo40793b(String str) {
        String str2;
        C24362h.m61211f(str, "securePurchaseId");
        Pair<String, byte[]> pair = this.f34083b;
        if (pair != null) {
            str2 = pair.mo59068c();
        } else {
            str2 = null;
        }
        if (!C24362h.m61206a(str2, str)) {
            return new C13872r<>(null, (C18926a) null);
        }
        Pair<String, byte[]> pair2 = this.f34083b;
        C24362h.m61208c(pair2);
        C13872r<String> e = mo40796e(C13855a.m34555a(), pair2.mo59069d());
        if (!e.mo40817a()) {
            return e;
        }
        return new C13872r<>(null, new C16672a(e.f34120b, C16672a.f43396R, "Failed decryption in memory storage."));
    }

    /* renamed from: c */
    public final C13872r<String> mo40794c(String str) {
        String str2;
        C24362h.m61211f(str, "securePurchaseId");
        Pair<String, byte[]> pair = this.f34084c;
        if (pair != null) {
            str2 = pair.mo59068c();
        } else {
            str2 = null;
        }
        if (!C24362h.m61206a(str2, str)) {
            return new C13872r<>(null, (C18926a) null);
        }
        Pair<String, byte[]> pair2 = this.f34084c;
        C24362h.m61208c(pair2);
        C13872r<String> e = mo40796e(C13855a.m34556b(), pair2.mo59069d());
        if (!e.mo40817a()) {
            return e;
        }
        return new C13872r<>(null, new C16672a(e.f34120b, C16672a.f43397S, "Failed decryption in memory storage."));
    }

    /* renamed from: d */
    public final void mo40795d() {
        this.f34083b = null;
    }

    /* renamed from: e */
    public final C13872r mo40796e(String str, byte[] bArr) {
        C13872r<C18558c> f = mo40797f();
        if (f.mo40817a()) {
            return new C13872r(null, f.f34120b);
        }
        S s = f.f34119a;
        C24362h.m61208c(s);
        int i = ((C18558c) s).f47242b / 8;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        C24362h.m61210e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        byte[] O0 = C21132f.m49432O0(i, bArr.length, bArr);
        C13872r<SecretKey> g = mo40798g(str);
        if (g.mo40817a()) {
            return new C13872r(null, g.f34120b);
        }
        try {
            C18554a.C18555a aVar = this.f34087f;
            S s2 = g.f34119a;
            C24362h.m61208c(s2);
            aVar.getClass();
            byte[] a = new C18554a((SecretKey) s2).mo50959a(O0, copyOf);
            C24362h.m61210e(a, "aesBytesDecryptor.decryp…crypted, initVectorBytes)");
            Charset charset = StandardCharsets.UTF_8;
            C24362h.m61210e(charset, "StandardCharsets.UTF_8");
            return new C13872r(new String(a, charset), (C18926a) null);
        } catch (CryptoException e) {
            Integer num = C16672a.f43395Q;
            this.f34088g.getClass();
            return new C13872r(null, new C16672a(C17873f.m44275b(e), num, "Failed decryption in memory storage."));
        }
    }

    /* renamed from: f */
    public final C13872r<C18558c> mo40797f() {
        if (this.f34082a == null) {
            try {
                this.f34086e.getClass();
                this.f34082a = C18558c.C18559a.m45474a();
            } catch (CryptoException e) {
                Integer num = C16672a.f43383E;
                this.f34088g.getClass();
                return new C13872r<>(null, new C16672a(C17873f.m44275b(e), num, "Failed creating an init vector generator"));
            }
        }
        return new C13872r<>(this.f34082a, (C18926a) null);
    }

    /* renamed from: g */
    public final C13872r<SecretKey> mo40798g(String str) {
        try {
            SecretKey a = this.f34085d.mo44328a(str);
            if (a == null) {
                try {
                    new C18558c.C18559a();
                    a = new C18558c(256).mo50961a();
                    KeyStorageAES keyStorageAES = this.f34085d;
                    C24362h.m61210e(a, "secretKey");
                    keyStorageAES.mo44331d(a, str);
                } catch (CryptoException e) {
                    Integer num = C16672a.f43394P;
                    this.f34088g.getClass();
                    return new C13872r<>(null, new C16672a(C17873f.m44275b(e), num, "Cannot save key for memory storage."));
                }
            }
            return new C13872r<>(a, (C18926a) null);
        } catch (CryptoException e2) {
            Integer num2 = C16672a.f43393O;
            this.f34088g.getClass();
            return new C13872r<>(null, new C16672a(C17873f.m44275b(e2), num2, "Cannot read key for memory storage."));
        }
    }
}
