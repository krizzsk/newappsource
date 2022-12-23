package wh0;

import ff0.C23349c;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletionHandlerException;
import mf0.C24368m;
import p389bl.C13637c;
import wh0.C25232y0;

/* renamed from: wh0.a */
public abstract class C25153a<T> extends C25163c1 implements C23349c<T>, C25235z {

    /* renamed from: c */
    public final CoroutineContext f63430c;

    public C25153a(CoroutineContext coroutineContext, boolean z) {
        super(z);
        mo61781g0((C25232y0) coroutineContext.mo53081c(C25232y0.C25234b.f63506b));
        this.f63430c = coroutineContext.mo53082y(this);
    }

    /* renamed from: K */
    public final CoroutineContext mo4232K() {
        return this.f63430c;
    }

    /* renamed from: P */
    public final String mo61746P() {
        return getClass().getSimpleName() + " was cancelled";
    }

    /* renamed from: f0 */
    public final void mo61747f0(CompletionHandlerException completionHandlerException) {
        C13637c.m34080w(this.f63430c, completionHandlerException);
    }

    public final CoroutineContext getContext() {
        return this.f63430c;
    }

    public boolean isActive() {
        return super.isActive();
    }

    /* renamed from: j0 */
    public String mo61749j0() {
        return super.mo61749j0();
    }

    /* renamed from: m0 */
    public final void mo61750m0(Object obj) {
        if (obj instanceof C25219u) {
            C25219u uVar = (C25219u) obj;
            mo61751u0(uVar.f63493a, uVar.mo61860a());
            return;
        }
        mo61752v0(obj);
    }

    public final void resumeWith(Object obj) {
        Throwable a = Result.m58423a(obj);
        if (a != null) {
            obj = new C25219u(a, false);
        }
        Object i0 = mo61783i0(obj);
        if (i0 != C24368m.f61697i) {
            mo53229t0(i0);
        }
    }

    /* renamed from: t0 */
    public void mo53229t0(Object obj) {
        mo53227G(obj);
    }

    /* renamed from: u0 */
    public void mo61751u0(Throwable th, boolean z) {
    }

    /* renamed from: v0 */
    public void mo61752v0(T t) {
    }
}
