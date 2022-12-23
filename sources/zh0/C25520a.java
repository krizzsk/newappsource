package zh0;

import ai0.C21003g;
import bf0.C21050d;
import ff0.C23349c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.internal.C24212a;
import wh0.C25235z;
import yh0.C25319k;
import yh0.C25321m;

/* renamed from: zh0.a */
public final class C25520a<T> extends C24212a<T> {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63780g = AtomicIntegerFieldUpdater.newUpdater(C25520a.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: e */
    public final C25321m<T> f63781e;

    /* renamed from: f */
    public final boolean f63782f;

    public C25520a() {
        throw null;
    }

    public C25520a(C25321m mVar) {
        super(EmptyCoroutineContext.f60190b, -3, BufferOverflow.SUSPEND);
        this.f63781e = mVar;
        this.f63782f = false;
        this.consumed = 0;
    }

    /* renamed from: a */
    public final String mo60363a() {
        StringBuilder k = C13555b.m33972k("channel=");
        k.append(this.f63781e);
        return k.toString();
    }

    /* renamed from: b */
    public final Object mo60358b(C25319k<? super T> kVar, C23349c<? super C21050d> cVar) {
        Object a = FlowKt__ChannelsKt.m60670a(new C21003g(kVar), this.f63781e, this.f63782f, cVar);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return C21050d.f52856a;
    }

    /* renamed from: c */
    public final C25321m<T> mo60364c(C25235z zVar) {
        mo62760d();
        if (this.f61485c == -3) {
            return this.f63781e;
        }
        return super.mo60364c(zVar);
    }

    public final Object collect(C25523d<? super T> dVar, C23349c<? super C21050d> cVar) {
        if (this.f61485c == -3) {
            mo62760d();
            Object a = FlowKt__ChannelsKt.m60670a(dVar, this.f63781e, this.f63782f, cVar);
            if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a;
            }
            return C21050d.f52856a;
        }
        Object collect = super.collect(dVar, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C21050d.f52856a;
    }

    /* renamed from: d */
    public final void mo62760d() {
        if (this.f63782f) {
            boolean z = true;
            if (f63780g.getAndSet(this, 1) != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
}
