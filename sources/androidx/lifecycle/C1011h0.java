package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.h0 */
public final class C1011h0 {

    /* renamed from: a */
    public final C1035q f3939a;

    /* renamed from: b */
    public final Handler f3940b = new Handler();

    /* renamed from: c */
    public C1012a f3941c;

    /* renamed from: androidx.lifecycle.h0$a */
    public static class C1012a implements Runnable {

        /* renamed from: b */
        public final C1035q f3942b;

        /* renamed from: c */
        public final Lifecycle.Event f3943c;

        /* renamed from: d */
        public boolean f3944d = false;

        public C1012a(C1035q qVar, Lifecycle.Event event) {
            this.f3942b = qVar;
            this.f3943c = event;
        }

        public final void run() {
            if (!this.f3944d) {
                this.f3942b.mo4319f(this.f3943c);
                this.f3944d = true;
            }
        }
    }

    public C1011h0(C1033p pVar) {
        this.f3939a = new C1035q(pVar);
    }

    /* renamed from: a */
    public final void mo4303a(Lifecycle.Event event) {
        C1012a aVar = this.f3941c;
        if (aVar != null) {
            aVar.run();
        }
        C1012a aVar2 = new C1012a(this.f3939a, event);
        this.f3941c = aVar2;
        this.f3940b.postAtFrontOfQueue(aVar2);
    }
}
