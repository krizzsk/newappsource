package p413co;

import com.masabi.justride.sdk.platform.storage.FileStorageException;
import java.io.File;
import java.io.IOException;
import mf0.C24362h;
import p441dk.C16672a;
import p583jk.C17873f;
import p725pj.C18926a;

/* renamed from: co.d */
public final class C13856d implements C13870p {

    /* renamed from: a */
    public final C13873s f34089a;

    /* renamed from: b */
    public final C17873f f34090b;

    public C13856d(C13873s sVar, C17873f fVar) {
        C24362h.m61211f(sVar, "fileStorage");
        C24362h.m61211f(fVar, "exceptionToErrorConverter");
        this.f34089a = sVar;
        this.f34090b = fVar;
    }

    /* renamed from: a */
    public final C13872r<byte[]> mo40799a(String str) {
        C24362h.m61211f(str, "absolutePathToFile");
        try {
            C13873s sVar = this.f34089a;
            sVar.f34122b.mo40807a();
            try {
                byte[] b = sVar.f34121a.mo40812a(new File(str)).mo40810b();
                if (b != null) {
                    return new C13872r<>(b, (C18926a) null);
                }
                return new C13872r<>(null, new C16672a((Integer) 185, "Failed reading " + str));
            } catch (IOException e) {
                e = e;
                throw new FileStorageException("Failed reading file", e);
            } catch (SecurityException e2) {
                e = e2;
                throw new FileStorageException("Failed reading file", e);
            }
        } catch (FileStorageException e3) {
            this.f34090b.getClass();
            return new C13872r<>(null, new C16672a((Integer) 144, C17873f.m44275b(e3)));
        }
    }

    /* renamed from: b */
    public final C13872r<Boolean> mo40800b(String str) {
        C24362h.m61211f(str, "absolutePathToFile");
        try {
            this.f34089a.f34122b.mo40807a();
            return new C13872r<>(Boolean.valueOf(new File(str).exists()), (C18926a) null);
        } catch (FileStorageException e) {
            Integer num = C16672a.f43392N;
            this.f34090b.getClass();
            return new C13872r<>(null, new C16672a(num, C17873f.m44275b(e)));
        }
    }
}
