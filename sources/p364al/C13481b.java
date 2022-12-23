package p364al;

import com.google.android.material.internal.C14080o;
import java.util.concurrent.CountDownLatch;

/* renamed from: al.b */
public final /* synthetic */ class C13481b implements C13488i {

    /* renamed from: a */
    public final /* synthetic */ C14080o f33359a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f33360b;

    public /* synthetic */ C13481b(C14080o oVar, CountDownLatch countDownLatch) {
        this.f33359a = oVar;
        this.f33360b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo40393a(C13487h hVar) {
        C14080o oVar = this.f33359a;
        CountDownLatch countDownLatch = this.f33360b;
        oVar.f35108a = hVar;
        countDownLatch.countDown();
    }
}
