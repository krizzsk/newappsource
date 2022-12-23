package p703ol;

import com.masabi.justride.sdk.jobs.authentication.DeviceAccountFilenames;
import p364al.C13487h;
import p413co.C13867m;
import p413co.C13872r;
import p441dk.C16672a;
import p725pj.C18926a;

/* renamed from: ol.a */
public final class C18781a {

    /* renamed from: a */
    public final C13867m f47807a;

    public C18781a(C13867m mVar) {
        this.f47807a = mVar;
    }

    /* renamed from: a */
    public final C13487h<String> mo51264a() {
        C13872r<String> a = this.f47807a.mo40781a(DeviceAccountFilenames.APP_ID.fileName);
        if (!a.mo40817a()) {
            return new C13487h<>(a.f34119a, (C18926a) null);
        }
        return new C13487h<>(null, new C16672a(a.f34120b, C16672a.f43420w, "Failed getting the App ID"));
    }
}
