package androidx.lifecycle;

import bi0.C21073k;
import ci0.C21207b;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import mf0.C24362h;
import p304x.C7097r;
import wh0.C25179g1;
import wh0.C25184i0;

/* renamed from: androidx.lifecycle.y */
public final class C1046y extends CoroutineDispatcher {

    /* renamed from: d */
    public final C1000d f3986d = new C1000d();

    /* renamed from: k */
    public final void mo4335k(CoroutineContext coroutineContext, Runnable runnable) {
        boolean z;
        C24362h.m61211f(coroutineContext, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(runnable, "block");
        C1000d dVar = this.f3986d;
        dVar.getClass();
        C21207b bVar = C25184i0.f63459a;
        C25179g1 z2 = C21073k.f52890a.mo60300z();
        if (!z2.mo4336x(coroutineContext)) {
            if (dVar.f3920b || !dVar.f3919a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (dVar.f3922d.offer(runnable)) {
                    dVar.mo4291a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            }
        }
        z2.mo4335k(coroutineContext, new C7097r(6, dVar, runnable));
    }

    /* renamed from: x */
    public final boolean mo4336x(CoroutineContext coroutineContext) {
        boolean z;
        C24362h.m61211f(coroutineContext, AppActionRequest.KEY_CONTEXT);
        C21207b bVar = C25184i0.f63459a;
        if (C21073k.f52890a.mo60300z().mo4336x(coroutineContext)) {
            return true;
        }
        C1000d dVar = this.f3986d;
        if (dVar.f3920b || !dVar.f3919a) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
