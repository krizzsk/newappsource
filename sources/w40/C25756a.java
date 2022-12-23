package w40;

import ce0.C21100e;
import com.moovit.MoovitApplication;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: w40.a */
public final class C25756a implements Callable<Void> {

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f64252b;

    /* renamed from: c */
    public final AtomicReference<?> f64253c;

    public C25756a(MoovitApplication<?, ?, ?> moovitApplication, AtomicReference<?> atomicReference) {
        C21100e.m49373x(moovitApplication, "application");
        this.f64252b = moovitApplication;
        C21100e.m49373x(atomicReference, "reference");
        this.f64253c = atomicReference;
    }

    public final Object call() throws Exception {
        this.f64252b.deleteFile("payment_account.dat");
        this.f64253c.set((Object) null);
        return null;
    }
}
