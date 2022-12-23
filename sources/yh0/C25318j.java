package yh0;

import bf0.C21050d;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.AbstractChannel;
import p389bl.C13637c;

/* renamed from: yh0.j */
public final class C25318j<E> extends C25310d<E> implements C25319k<E> {
    public C25318j(CoroutineContext coroutineContext, AbstractChannel abstractChannel) {
        super(coroutineContext, abstractChannel);
    }

    public final boolean isActive() {
        return super.isActive();
    }

    /* renamed from: q */
    public final C25318j mo61909q() {
        return this;
    }

    /* renamed from: u0 */
    public final void mo61751u0(Throwable th, boolean z) {
        if (!this.f63621d.mo60342E(th) && !z) {
            C13637c.m34080w(this.f63430c, th);
        }
    }

    /* renamed from: v0 */
    public final void mo61752v0(Object obj) {
        C21050d dVar = (C21050d) obj;
        this.f63621d.mo60342E((Throwable) null);
    }
}
