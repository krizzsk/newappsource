package qj0;

import java.util.ArrayList;
import mf0.C24368m;
import p043ch.qos.logback.core.joran.spi.JoranException;
import p058d4.C4341a;
import p058d4.C4342b;
import p070e4.C4548c;
import p257t3.C6557a;
import p296w4.C6993i;

/* renamed from: qj0.a */
public final class C24790a {

    /* renamed from: d */
    public static C24790a f62710d;

    /* renamed from: e */
    public static Object f62711e = new Object();

    /* renamed from: a */
    public boolean f62712a = false;

    /* renamed from: b */
    public C6557a f62713b;

    /* renamed from: c */
    public final C4342b f62714c;

    static {
        ArrayList arrayList;
        C24790a aVar = new C24790a();
        f62710d = aVar;
        try {
            new C4341a(aVar.f62713b).mo19847a();
        } catch (JoranException e) {
            try {
                C24368m.m61233g("Failed to auto configure default logger context", e);
            } catch (Exception e2) {
                StringBuilder k = C13555b.m33972k("Failed to instantiate [");
                k.append(C6557a.class.getName());
                k.append("]");
                C24368m.m61233g(k.toString(), e2);
                return;
            }
        }
        C4548c cVar = aVar.f62713b.f15676d;
        boolean z = false;
        if (cVar != null) {
            synchronized (cVar.f15673f) {
                arrayList = new ArrayList(cVar.f15672e);
            }
            if (arrayList.size() != 0) {
                z = true;
            }
        }
        if (!z) {
            C6993i.m16477b(aVar.f62713b);
        }
        aVar.f62714c.mo19849a(aVar.f62713b, f62711e);
        aVar.f62712a = true;
    }

    public C24790a() {
        C6557a aVar = new C6557a();
        this.f62713b = aVar;
        this.f62714c = C4342b.f15307c;
        aVar.mo20063h("default");
    }
}
