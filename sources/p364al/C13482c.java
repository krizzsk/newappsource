package p364al;

import com.google.android.material.internal.C14080o;
import java.util.concurrent.CountDownLatch;
import p725pj.C18927b;

/* renamed from: al.c */
public abstract class C13482c<S> implements C13483d<S> {
    /* renamed from: C */
    public final C13487h<S> mo40394C() {
        C14080o oVar = new C14080o(3);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            mo40395a(new C13481b(oVar, countDownLatch));
            countDownLatch.await();
            return (C13487h) oVar.f35108a;
        } catch (InterruptedException e) {
            Class<?> cls = getClass();
            StringBuilder k = C13555b.m33972k("execute call interrupted: ");
            k.append(e.getMessage());
            return new C13487h<>(null, new C18927b(cls, k.toString()));
        }
    }

    /* renamed from: a */
    public abstract void mo40395a(C13481b bVar);
}
