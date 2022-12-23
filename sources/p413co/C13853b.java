package p413co;

import ce0.C21100e;
import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.platform.storage.FileStorageException;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import javax.crypto.SecretKey;
import p441dk.C16672a;
import p583jk.C17873f;
import p677nj.C18554a;
import p677nj.C18556b;
import p677nj.C18558c;
import p677nj.C18569l;
import p725pj.C18926a;

/* renamed from: co.b */
public final class C13853b implements C13868n {

    /* renamed from: a */
    public final C13859g f34073a;

    /* renamed from: b */
    public final C18558c.C18559a f34074b;

    /* renamed from: c */
    public final C18554a.C18555a f34075c;

    /* renamed from: d */
    public final C18556b.C18557a f34076d;

    /* renamed from: e */
    public final C18569l f34077e;

    /* renamed from: f */
    public final C17873f f34078f;

    /* renamed from: g */
    public final HashMap f34079g = new HashMap();

    /* renamed from: h */
    public final HashMap f34080h = new HashMap();

    /* renamed from: i */
    public C18558c f34081i;

    public C13853b(C13859g gVar, C18558c.C18559a aVar, C18554a.C18555a aVar2, C18556b.C18557a aVar3, C18569l lVar, C17873f fVar) {
        this.f34073a = gVar;
        this.f34074b = aVar;
        this.f34075c = aVar2;
        this.f34076d = aVar3;
        this.f34077e = lVar;
        this.f34078f = fVar;
    }

    /* renamed from: a */
    public final C13872r<Void> mo40784a(String str, String str2) {
        if (C21100e.m49352m0(str)) {
            return new C13872r<>(null, new C16672a(C16672a.f43410m, "Empty folder name"));
        }
        if (C21100e.m49352m0(str2)) {
            return new C13872r<>(null, new C16672a(C16672a.f43414q, "Empty file name"));
        }
        try {
            C13859g gVar = this.f34073a;
            String b = gVar.mo40803b(str);
            C13866l lVar = gVar.f34093a;
            lVar.f34116a.mo40820a(lVar.mo40816a(b, str2));
            return new C13872r<>(null, (C18926a) null);
        } catch (FileStorageException e) {
            Integer num = C16672a.f43384F;
            String format = String.format("Failed delete for file %s in folder %s", new Object[]{str2, str});
            this.f34078f.getClass();
            return new C13872r<>(null, new C16672a(C17873f.m44275b(e), num, format));
        }
    }

    /* renamed from: b */
    public final C13872r<Date> mo40785b(String str, String str2) {
        if (C21100e.m49352m0(str)) {
            return new C13872r<>(null, new C16672a(C16672a.f43423z, "Empty folder name"));
        }
        if (C21100e.m49352m0(str2)) {
            return new C13872r<>(null, new C16672a(C16672a.f43379A, "Empty file name"));
        }
        try {
            return new C13872r<>(this.f34073a.mo40805d(str, str2), (C18926a) null);
        } catch (FileStorageException e) {
            Integer num = C16672a.f43402e;
            String format = String.format("Failed get last modified date for %s , %s", new Object[]{str, str2});
            this.f34078f.getClass();
            return new C13872r<>(null, new C16672a(C17873f.m44275b(e), num, format));
        }
    }

    /* renamed from: c */
    public final C13872r<Void> mo40786c(String str, String str2, byte[] bArr) {
        if (C21100e.m49352m0(str)) {
            return new C13872r<>(null, new C16672a(C16672a.f43408k, "Empty folder name"));
        }
        if (C21100e.m49352m0(str2)) {
            return new C13872r<>(null, new C16672a(C16672a.f43412o, "Empty file name"));
        }
        try {
            if (this.f34081i == null) {
                this.f34074b.getClass();
                this.f34081i = C18558c.C18559a.m45474a();
            }
            byte[] encoded = this.f34081i.mo50961a().getEncoded();
            this.f34073a.mo40806e(str, str2, C21100e.m49302D(encoded, mo40791h(str).mo50960a(bArr, encoded)));
            return new C13872r<>(null, (C18926a) null);
        } catch (CryptoException e) {
            e = e;
            Integer num = C16672a.f43389K;
            String format = String.format("Failed writing for file %s in folder %s", new Object[]{str2, str});
            this.f34078f.getClass();
            return new C13872r<>(null, new C16672a(C17873f.m44275b(e), num, format));
        } catch (FileStorageException e2) {
            e = e2;
            Integer num2 = C16672a.f43389K;
            String format2 = String.format("Failed writing for file %s in folder %s", new Object[]{str2, str});
            this.f34078f.getClass();
            return new C13872r<>(null, new C16672a(C17873f.m44275b(e), num2, format2));
        }
    }

    /* renamed from: d */
    public final C13872r<byte[]> mo40787d(String str, String str2) {
        if (C21100e.m49352m0(str)) {
            return new C13872r<>(null, new C16672a(C16672a.f43409l, "Empty folder name"));
        }
        if (C21100e.m49352m0(str2)) {
            return new C13872r<>(null, new C16672a(C16672a.f43413p, "Empty file name"));
        }
        try {
            byte[] c = this.f34073a.mo40804c(str, str2);
            if (c == null) {
                return new C13872r<>(null, (C18926a) null);
            }
            try {
                C18554a g = mo40790g(str);
                if (this.f34081i == null) {
                    this.f34074b.getClass();
                    this.f34081i = C18558c.C18559a.m45474a();
                }
                int i = this.f34081i.f47242b / 8;
                return new C13872r<>(g.mo50959a(Arrays.copyOfRange(c, i, c.length), Arrays.copyOf(c, i)), (C18926a) null);
            } catch (CryptoException e) {
                Integer num = C16672a.f43422y;
                String format = String.format("Failed getting file contents for file %s in folder %s", new Object[]{str2, str});
                this.f34078f.getClass();
                return new C13872r<>(null, new C16672a(C17873f.m44275b(e), num, format));
            }
        } catch (FileStorageException e2) {
            Integer num2 = C16672a.f43386H;
            String format2 = String.format("Failed reading for file %s in folder %s", new Object[]{str2, str});
            this.f34078f.getClass();
            return new C13872r<>(null, new C16672a(C17873f.m44275b(e2), num2, format2));
        }
    }

    /* renamed from: e */
    public final C13872r<Boolean> mo40788e(String str, String str2) {
        try {
            C13859g gVar = this.f34073a;
            String b = gVar.mo40803b(str);
            C13866l lVar = gVar.f34093a;
            String a = lVar.mo40816a(b, str2);
            lVar.f34116a.f34122b.mo40807a();
            return new C13872r<>(Boolean.valueOf(new File(a).exists()), (C18926a) null);
        } catch (FileStorageException e) {
            Integer num = C16672a.f43398T;
            String format = String.format("Failed contains query for %s , %s", new Object[]{str, str2});
            this.f34078f.getClass();
            return new C13872r<>(null, new C16672a(C17873f.m44275b(e), num, format));
        }
    }

    /* renamed from: f */
    public final C13872r<Void> mo40789f(String str) {
        if (C21100e.m49352m0(str)) {
            return new C13872r<>(null, new C16672a(C16672a.f43411n, "Empty folder name"));
        }
        try {
            this.f34073a.mo40802a(str);
            return new C13872r<>(null, (C18926a) null);
        } catch (FileStorageException e) {
            Integer num = C16672a.f43385G;
            String format = String.format("Failed delete for folder %s", new Object[]{str});
            this.f34078f.getClass();
            return new C13872r<>(null, new C16672a(C17873f.m44275b(e), num, format));
        }
    }

    /* renamed from: g */
    public final C18554a mo40790g(String str) throws CryptoException {
        C18554a aVar = (C18554a) this.f34079g.get(str);
        if (aVar != null) {
            return aVar;
        }
        try {
            SecretKey e = this.f34077e.mo50968e(str);
            this.f34075c.getClass();
            C18554a aVar2 = new C18554a(e);
            this.f34079g.put(str, aVar2);
            return aVar2;
        } catch (CryptoException e2) {
            throw new CryptoException(String.format("Failed to get decryptor for folder %s", new Object[]{str}), e2);
        }
    }

    /* renamed from: h */
    public final C18556b mo40791h(String str) throws CryptoException {
        C18556b bVar = (C18556b) this.f34080h.get(str);
        if (bVar != null) {
            return bVar;
        }
        try {
            SecretKey e = this.f34077e.mo50968e(str);
            this.f34076d.getClass();
            C18556b bVar2 = new C18556b(e);
            this.f34080h.put(str, bVar2);
            return bVar2;
        } catch (CryptoException e2) {
            throw new CryptoException(String.format("Failed to get encryptor for folder %s (%d)", new Object[]{str, C16672a.f43380B}), e2);
        }
    }
}
