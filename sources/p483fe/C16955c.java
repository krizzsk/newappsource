package p483fe;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p066e0.C4436j0;

/* renamed from: fe.c */
public final class C16955c implements C16954b, C16953a {

    /* renamed from: b */
    public final C4436j0 f43993b;

    /* renamed from: c */
    public final TimeUnit f43994c;

    /* renamed from: d */
    public final Object f43995d = new Object();

    /* renamed from: e */
    public CountDownLatch f43996e;

    public C16955c(C4436j0 j0Var, TimeUnit timeUnit) {
        this.f43993b = j0Var;
        this.f43994c = timeUnit;
    }

    /* renamed from: a */
    public final void mo49580a(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.f43996e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* renamed from: n */
    public final void mo5859n(Bundle bundle) {
        synchronized (this.f43995d) {
            Objects.toString(bundle);
            this.f43996e = new CountDownLatch(1);
            this.f43993b.mo5859n(bundle);
            try {
                this.f43996e.await((long) 500, this.f43994c);
            } catch (InterruptedException unused) {
            }
            this.f43996e = null;
        }
    }
}
