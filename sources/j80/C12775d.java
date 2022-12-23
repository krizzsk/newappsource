package j80;

import ce0.C21100e;
import com.moovit.servicealerts.ServiceStatus;
import f00.C16918f;

/* renamed from: j80.d */
public final class C12775d {

    /* renamed from: a */
    public final String f31579a;

    /* renamed from: b */
    public final ServiceStatus f31580b;

    /* renamed from: c */
    public final C16918f<Long> f31581c;

    public C12775d(String str, ServiceStatus serviceStatus, C16918f<Long> fVar) {
        C21100e.m49373x(str, "alertId");
        this.f31579a = str;
        C21100e.m49373x(serviceStatus, "serviceStatus");
        this.f31580b = serviceStatus;
        this.f31581c = fVar;
    }
}
