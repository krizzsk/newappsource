package p275u9;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p011aa.C0140d;
import p028ba.C1515i;
import p028ba.C1517k;
import p075ea.C4614a;
import p237r9.C6269b;
import p250s9.C6488a;
import p275u9.C6738j;
import p304x.C7082o;

/* renamed from: u9.w */
public final class C6756w implements C6755v {

    /* renamed from: e */
    public static volatile C6740k f20888e;

    /* renamed from: a */
    public final C4614a f20889a;

    /* renamed from: b */
    public final C4614a f20890b;

    /* renamed from: c */
    public final C0140d f20891c;

    /* renamed from: d */
    public final C1515i f20892d;

    public C6756w(C4614a aVar, C4614a aVar2, C0140d dVar, C1515i iVar, C1517k kVar) {
        this.f20889a = aVar;
        this.f20890b = aVar2;
        this.f20891c = dVar;
        this.f20892d = iVar;
        kVar.f5460a.execute(new C7082o(kVar, 6));
    }

    /* renamed from: a */
    public static C6756w m15896a() {
        C6740k kVar = f20888e;
        if (kVar != null) {
            return kVar.f20873f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: b */
    public static void m15897b(Context context) {
        if (f20888e == null) {
            synchronized (C6756w.class) {
                if (f20888e == null) {
                    context.getClass();
                    Class<Context> cls = Context.class;
                    f20888e = new C6740k(context);
                }
            }
        }
    }

    /* renamed from: c */
    public final C6753t mo22929c(C6488a aVar) {
        Set<T> set;
        if (aVar instanceof C6741l) {
            aVar.getClass();
            set = Collections.unmodifiableSet(C6488a.f20231d);
        } else {
            set = Collections.singleton(new C6269b("proto"));
        }
        C6738j.C6739a a = C6751s.m15889a();
        aVar.getClass();
        a.mo22916b("cct");
        a.f20867b = aVar.mo22592b();
        return new C6753t(set, a.mo22915a(), this);
    }
}
