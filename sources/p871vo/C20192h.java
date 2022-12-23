package p871vo;

import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketScreenConfiguration;
import mf0.C24362h;
import p091g2.C4749c;
import p330z2.C7428f;

/* renamed from: vo.h */
public final class C20192h implements C1026n0.C1028b {

    /* renamed from: a */
    public final UniversalTicketScreenConfiguration f51226a;

    /* renamed from: b */
    public final C7428f f51227b;

    /* renamed from: c */
    public final String f51228c;

    public C20192h(UniversalTicketScreenConfiguration universalTicketScreenConfiguration, C7428f fVar, String str) {
        C24362h.m61211f(universalTicketScreenConfiguration, "ticketScreenConfiguration");
        C24362h.m61211f(fVar, "notificationService");
        C24362h.m61211f(str, "pathToJustrideDirectory");
        this.f51226a = universalTicketScreenConfiguration;
        this.f51227b = fVar;
        this.f51228c = str;
    }

    /* renamed from: a */
    public final <T extends C1019k0> T mo4064a(Class<T> cls) {
        return new C20193i(this.f51226a, this.f51227b, this.f51228c);
    }

    /* renamed from: b */
    public final C1019k0 mo4065b(Class cls, C4749c cVar) {
        return mo4064a(cls);
    }
}
