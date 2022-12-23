package p413co;

import ce0.C21100e;
import java.nio.charset.StandardCharsets;
import p441dk.C16672a;
import p725pj.C18926a;

/* renamed from: co.a */
public final class C13852a implements C13867m {

    /* renamed from: a */
    public final C13868n f34072a;

    public C13852a(C13868n nVar) {
        this.f34072a = nVar;
    }

    /* renamed from: a */
    public final C13872r<String> mo40781a(String str) {
        if (str.isEmpty()) {
            return new C13872r<>(null, new C16672a(C16672a.f43416s, "Cannot save value for empty key"));
        }
        C13872r<byte[]> d = this.f34072a.mo40787d(C21100e.m49333b0(), str);
        if (d.mo40817a()) {
            return new C13872r<>(null, new C16672a(d.f34120b, C16672a.f43418u, "Failed getting file contents"));
        }
        byte[] bArr = (byte[]) d.f34119a;
        if (bArr == null) {
            return new C13872r<>(null, (C18926a) null);
        }
        return new C13872r<>(new String(bArr, StandardCharsets.UTF_8), (C18926a) null);
    }

    /* renamed from: b */
    public final C13872r<Void> mo40782b(String str, String str2) {
        if (C21100e.m49352m0(str)) {
            return new C13872r<>(null, new C16672a(Integer.valueOf(C16672a.f43415r.intValue()), "Cannot save value for empty key"));
        }
        return this.f34072a.mo40786c(C21100e.m49333b0(), str, str2.getBytes(StandardCharsets.UTF_8));
    }

    public final C13872r<Void> deleteKey(String str) {
        if (C21100e.m49352m0(str)) {
            return new C13872r<>(null, new C16672a(Integer.valueOf(C16672a.f43417t.intValue()), "Cannot save value for empty key"));
        }
        return this.f34072a.mo40784a(C21100e.m49333b0(), str);
    }
}
