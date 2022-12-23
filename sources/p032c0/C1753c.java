package p032c0;

import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import p291w.C6956a;
import p304x.C7073m;
import p304x.C7090q;

/* renamed from: c0.c */
public final class C1753c {

    /* renamed from: a */
    public boolean f6145a = false;

    /* renamed from: b */
    public boolean f6146b = false;

    /* renamed from: c */
    public final C7090q f6147c;

    /* renamed from: d */
    public final Executor f6148d;

    /* renamed from: e */
    public final Object f6149e = new Object();

    /* renamed from: f */
    public C6956a.C6957a f6150f = new C6956a.C6957a();

    /* renamed from: g */
    public CallbackToFutureAdapter.C0673a<Void> f6151g;

    /* renamed from: h */
    public final C1752b f6152h = new C1752b(this);

    public C1753c(C7090q qVar, SequentialExecutor sequentialExecutor) {
        this.f6147c = qVar;
        this.f6148d = sequentialExecutor;
    }

    /* renamed from: a */
    public final C6956a mo6512a() {
        C6956a aVar;
        synchronized (this.f6149e) {
            CallbackToFutureAdapter.C0673a<Void> aVar2 = this.f6151g;
            if (aVar2 != null) {
                this.f6150f.f21715a.mo2503w(C6956a.f21711D, Integer.valueOf(aVar2.hashCode()));
            }
            C6956a.C6957a aVar3 = this.f6150f;
            aVar3.getClass();
            aVar = new C6956a(C0590n.m1678s(aVar3.f21715a));
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo6513b(CallbackToFutureAdapter.C0673a<Void> aVar) {
        this.f6146b = true;
        CallbackToFutureAdapter.C0673a<Void> aVar2 = this.f6151g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f6151g = aVar;
        if (this.f6145a) {
            C7090q qVar = this.f6147c;
            qVar.f22036c.execute(new C7073m(qVar, 0));
            this.f6146b = false;
        }
        if (aVar2 != null) {
            aVar2.mo2698c(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }
}
