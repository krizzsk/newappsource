package p703ol;

import com.masabi.justride.sdk.jobs.authentication.DeviceAccountFilenames;
import p364al.C13483d;
import p364al.C13487h;
import p413co.C13867m;
import p413co.C13872r;
import p441dk.C16672a;
import p725pj.C18926a;

/* renamed from: ol.b */
public final class C18782b implements C13483d<String> {

    /* renamed from: a */
    public final C13867m f47808a;

    public C18782b(C13867m mVar) {
        this.f47808a = mVar;
    }

    /* renamed from: C */
    public final C13487h<String> mo40394C() {
        C13872r<String> a = this.f47808a.mo40781a(DeviceAccountFilenames.APP_PASSWORD.fileName);
        if (!a.mo40817a()) {
            return new C13487h<>(a.f34119a, (C18926a) null);
        }
        return new C13487h<>(null, new C16672a(a.f34120b, C16672a.f43419v, "Failed getting the App Password"));
    }
}
