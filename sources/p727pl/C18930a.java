package p727pl;

import com.masabi.justride.sdk.jobs.authentication.DeviceAccountFilenames;
import p364al.C13483d;
import p364al.C13487h;
import p413co.C13867m;
import p413co.C13872r;
import p441dk.C16672a;
import p725pj.C18926a;

/* renamed from: pl.a */
public final class C18930a implements C13483d<Void> {

    /* renamed from: a */
    public final C13867m f48210a;

    /* renamed from: b */
    public final String f48211b;

    /* renamed from: c */
    public final String f48212c;

    /* renamed from: pl.a$a */
    public static class C18931a {

        /* renamed from: a */
        public final C13867m f48213a;

        public C18931a(C13867m mVar) {
            this.f48213a = mVar;
        }
    }

    public C18930a(C13867m mVar, String str, String str2) {
        this.f48210a = mVar;
        this.f48211b = str;
        this.f48212c = str2;
    }

    /* renamed from: C */
    public final C13487h<Void> mo40394C() {
        C13872r<Void> b = this.f48210a.mo40782b(DeviceAccountFilenames.APP_ID.fileName, this.f48211b);
        if (b.mo40817a()) {
            return new C13487h<>(null, new C16672a(b.f34120b, C16672a.f43406i, "Failed saving the App ID"));
        }
        C13872r<Void> b2 = this.f48210a.mo40782b(DeviceAccountFilenames.APP_PASSWORD.fileName, this.f48212c);
        if (!b2.mo40817a()) {
            return new C13487h<>(null, (C18926a) null);
        }
        return new C13487h<>(null, new C16672a(b2.f34120b, C16672a.f43407j, "Failed saving the App Password"));
    }
}
