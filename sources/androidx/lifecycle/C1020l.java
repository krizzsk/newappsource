package androidx.lifecycle;

import ff0.C23349c;
import kotlin.coroutines.CoroutineContext;
import lf0.C24240p;
import wh0.C25177g;
import wh0.C25235z;

/* renamed from: androidx.lifecycle.l */
public abstract class C1020l implements C25235z {
    /* renamed from: a */
    public abstract Lifecycle mo4233a();

    /* renamed from: c */
    public final void mo4310c(C24240p pVar) {
        C25177g.m63218b(this, (CoroutineContext) null, new LifecycleCoroutineScope$launchWhenCreated$1(this, pVar, (C23349c<? super LifecycleCoroutineScope$launchWhenCreated$1>) null), 3);
    }

    /* renamed from: d */
    public final void mo4311d(C24240p pVar) {
        C25177g.m63218b(this, (CoroutineContext) null, new LifecycleCoroutineScope$launchWhenResumed$1(this, pVar, (C23349c<? super LifecycleCoroutineScope$launchWhenResumed$1>) null), 3);
    }
}
