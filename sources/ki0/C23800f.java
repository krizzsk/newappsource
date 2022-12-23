package ki0;

import androidx.lifecycle.C1042u;
import hi0.C23518a;
import hi0.C23539f0;
import hi0.C23566v;
import ii0.C23607a;
import ii0.C23609c;
import ii0.C23610d;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import ki0.C23803h;
import p304x.C7073m;
import pi0.C24721f;
import ri0.C24832d;

/* renamed from: ki0.f */
public final class C23800f {

    /* renamed from: g */
    public static final ThreadPoolExecutor f60132g;

    /* renamed from: a */
    public final int f60133a = 5;

    /* renamed from: b */
    public final long f60134b;

    /* renamed from: c */
    public final C7073m f60135c = new C7073m(this, 15);

    /* renamed from: d */
    public final ArrayDeque f60136d = new ArrayDeque();

    /* renamed from: e */
    public final C1042u f60137e = new C1042u(11);

    /* renamed from: f */
    public boolean f60138f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = C23610d.f59684a;
        f60132g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new C23609c("OkHttp ConnectionPool", true));
    }

    public C23800f(TimeUnit timeUnit) {
        this.f60134b = timeUnit.toNanos(5);
    }

    /* renamed from: a */
    public final void mo59046a(C23539f0 f0Var, IOException iOException) {
        if (f0Var.f59462b.type() != Proxy.Type.DIRECT) {
            C23518a aVar = f0Var.f59461a;
            aVar.f59375g.connectFailed(aVar.f59369a.mo58704r(), f0Var.f59462b.address(), iOException);
        }
        C1042u uVar = this.f60137e;
        synchronized (uVar) {
            ((Set) uVar.f3985a).add(f0Var);
        }
    }

    /* renamed from: b */
    public final int mo59047b(C23799e eVar, long j) {
        ArrayList arrayList = eVar.f60130p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder k = C13555b.m33972k("A connection to ");
                k.append(eVar.f60117c.f59461a.f59369a);
                k.append(" was leaked. Did you forget to close a response body?");
                C24721f.f62584a.mo61203n(((C23803h.C23805b) reference).f60164a, k.toString());
                arrayList.remove(i);
                eVar.f60125k = true;
                if (arrayList.isEmpty()) {
                    eVar.f60131q = j - this.f60134b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* renamed from: c */
    public final boolean mo59048c(C23518a aVar, C23803h hVar, ArrayList arrayList, boolean z) {
        boolean z2;
        boolean z3;
        Iterator it = this.f60136d.iterator();
        while (true) {
            boolean z4 = false;
            if (!it.hasNext()) {
                return false;
            }
            C23799e eVar = (C23799e) it.next();
            if (z) {
                if (eVar.f60122h != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    continue;
                }
            }
            if (eVar.f60130p.size() < eVar.f60129o && !eVar.f60125k) {
                C23566v.C23567a aVar2 = C23607a.f59680a;
                C23518a aVar3 = eVar.f60117c.f59461a;
                aVar2.getClass();
                if (aVar3.mo58625a(aVar)) {
                    if (!aVar.f59369a.f59537d.equals(eVar.f60117c.f59461a.f59369a.f59537d)) {
                        if (!(eVar.f60122h == null || arrayList == null)) {
                            int size = arrayList.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    z2 = false;
                                    break;
                                }
                                C23539f0 f0Var = (C23539f0) arrayList.get(i);
                                if (f0Var.f59462b.type() == Proxy.Type.DIRECT && eVar.f60117c.f59462b.type() == Proxy.Type.DIRECT && eVar.f60117c.f59463c.equals(f0Var.f59463c)) {
                                    z2 = true;
                                    break;
                                }
                                i++;
                            }
                            if (z2 && aVar.f59378j == C24832d.f62775a && eVar.mo59044j(aVar.f59369a)) {
                                try {
                                    aVar.f59379k.mo58655a(aVar.f59369a.f59537d, eVar.f60120f.f59529c);
                                } catch (SSLPeerUnverifiedException unused) {
                                }
                            }
                        }
                    }
                    z4 = true;
                }
            }
            if (z4) {
                if (hVar.f60156i == null) {
                    hVar.f60156i = eVar;
                    eVar.f60130p.add(new C23803h.C23805b(hVar, hVar.f60153f));
                    return true;
                }
                throw new IllegalStateException();
            }
        }
    }
}
