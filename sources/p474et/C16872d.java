package p474et;

import androidx.fragment.app.Fragment;
import java.util.UUID;
import mf0.C24362h;

/* renamed from: et.d */
public abstract class C16872d {

    /* renamed from: a */
    public final String f43883a;

    /* renamed from: b */
    public final UUID f43884b;

    public C16872d(String str) {
        this.f43883a = str;
        UUID randomUUID = UUID.randomUUID();
        C24362h.m61210e(randomUUID, "randomUUID()");
        this.f43884b = randomUUID;
    }

    /* renamed from: a */
    public abstract Fragment mo49530a(int i);
}
