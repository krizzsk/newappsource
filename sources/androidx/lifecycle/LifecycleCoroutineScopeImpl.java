package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bi0.C21073k;
import ci0.C21207b;
import ff0.C23349c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mf0.C24361g;
import mf0.C24362h;
import wh0.C25177g;
import wh0.C25184i0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo59060d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/n;", "lifecycle-runtime-ktx_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class LifecycleCoroutineScopeImpl extends C1020l implements C1025n {

    /* renamed from: b */
    public final Lifecycle f3881b;

    /* renamed from: c */
    public final CoroutineContext f3882c;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        C24362h.m61211f(coroutineContext, "coroutineContext");
        this.f3881b = lifecycle;
        this.f3882c = coroutineContext;
        if (lifecycle.mo4225b() == Lifecycle.State.DESTROYED) {
            C24361g.m61172l(coroutineContext, (CancellationException) null);
        }
    }

    /* renamed from: K */
    public final CoroutineContext mo4232K() {
        return this.f3882c;
    }

    /* renamed from: a */
    public final Lifecycle mo4233a() {
        return this.f3881b;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        if (this.f3881b.mo4225b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            this.f3881b.mo4226c(this);
            C24361g.m61172l(this.f3882c, (CancellationException) null);
        }
    }

    /* renamed from: g */
    public final void mo4234g() {
        C21207b bVar = C25184i0.f63459a;
        C25177g.m63218b(this, C21073k.f52890a.mo60300z(), new LifecycleCoroutineScopeImpl$register$1(this, (C23349c<? super LifecycleCoroutineScopeImpl$register$1>) null), 2);
    }
}
