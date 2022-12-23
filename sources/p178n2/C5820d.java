package p178n2;

import bf0.C21050d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.C23825c;
import lf0.C24225a;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: n2.d */
public final class C5820d<T> {

    /* renamed from: a */
    public final C24236l<T, C21050d> f18780a;

    /* renamed from: b */
    public final C24225a<Boolean> f18781b;

    /* renamed from: c */
    public final ReentrantLock f18782c = new ReentrantLock();

    /* renamed from: d */
    public final ArrayList f18783d = new ArrayList();

    /* renamed from: e */
    public boolean f18784e;

    public C5820d(C24225a aVar, C24236l lVar) {
        C24362h.m61211f(lVar, "callbackInvoker");
        this.f18780a = lVar;
        this.f18781b = aVar;
    }

    /* renamed from: a */
    public final void mo21690a() {
        if (!this.f18784e) {
            ReentrantLock reentrantLock = this.f18782c;
            reentrantLock.lock();
            try {
                if (!this.f18784e) {
                    this.f18784e = true;
                    List<Object> K0 = C23825c.m58499K0(this.f18783d);
                    this.f18783d.clear();
                    C21050d dVar = C21050d.f52856a;
                    reentrantLock.unlock();
                    if (K0 != null) {
                        C24236l<T, C21050d> lVar = this.f18780a;
                        for (Object invoke : K0) {
                            lVar.invoke(invoke);
                        }
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: b */
    public final void mo21691b(T t) {
        boolean z;
        C24225a<Boolean> aVar = this.f18781b;
        boolean z2 = false;
        if (aVar != null && aVar.invoke().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo21690a();
        }
        if (this.f18784e) {
            this.f18780a.invoke(t);
            return;
        }
        ReentrantLock reentrantLock = this.f18782c;
        reentrantLock.lock();
        try {
            if (this.f18784e) {
                C21050d dVar = C21050d.f52856a;
                z2 = true;
            } else {
                this.f18783d.add(t);
            }
            if (z2) {
                this.f18780a.invoke(t);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
