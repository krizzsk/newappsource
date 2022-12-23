package kh0;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import mf0.C24362h;

/* renamed from: kh0.b */
public class C23786b implements C23791g {

    /* renamed from: b */
    public final Lock f60087b;

    public /* synthetic */ C23786b(int i) {
        this((Lock) new ReentrantLock());
    }

    public void lock() {
        this.f60087b.lock();
    }

    public final void unlock() {
        this.f60087b.unlock();
    }

    public C23786b(Lock lock) {
        C24362h.m61211f(lock, "lock");
        this.f60087b = lock;
    }
}
