package kotlinx.coroutines.flow.internal;

import bf0.C21050d;
import bi0.C21077o;
import ff0.C23349c;
import java.util.ArrayList;
import kotlin.collections.C23825c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import lf0.C24236l;
import p001a0.C0017h;
import p389bl.C13637c;
import p584jl.C17885a;
import wh0.C25235z;
import yh0.C25318j;
import yh0.C25319k;
import yh0.C25321m;
import zh0.C25522c;
import zh0.C25523d;

/* renamed from: kotlinx.coroutines.flow.internal.a */
public abstract class C24212a<T> implements C25522c {

    /* renamed from: b */
    public final CoroutineContext f61484b;

    /* renamed from: c */
    public final int f61485c;

    /* renamed from: d */
    public final BufferOverflow f61486d;

    public C24212a(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        this.f61484b = coroutineContext;
        this.f61485c = i;
        this.f61486d = bufferOverflow;
    }

    /* renamed from: a */
    public String mo60363a() {
        return null;
    }

    /* renamed from: b */
    public abstract Object mo60358b(C25319k<? super T> kVar, C23349c<? super C21050d> cVar);

    /* renamed from: c */
    public C25321m<T> mo60364c(C25235z zVar) {
        CoroutineContext coroutineContext = this.f61484b;
        int i = this.f61485c;
        if (i == -3) {
            i = -2;
        }
        BufferOverflow bufferOverflow = this.f61486d;
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, (C23349c<? super ChannelFlow$collectToFun$1>) null);
        C25318j jVar = new C25318j(CoroutineContextKt.m60588c(zVar, coroutineContext), C17885a.m44433d(i, bufferOverflow, 4));
        coroutineStart.invoke(channelFlow$collectToFun$1, jVar, jVar);
        return jVar;
    }

    public Object collect(C25523d<? super T> dVar, C23349c<? super C21050d> cVar) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2((C23349c) null, dVar, this);
        C21077o oVar = new C21077o(cVar, cVar.getContext());
        Object G = C13637c.m34052G(oVar, oVar, channelFlow$collect$2);
        if (G == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return G;
        }
        return C21050d.f52856a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String a = mo60363a();
        if (a != null) {
            arrayList.add(a);
        }
        if (this.f61484b != EmptyCoroutineContext.f60190b) {
            StringBuilder k = C13555b.m33972k("context=");
            k.append(this.f61484b);
            arrayList.add(k.toString());
        }
        if (this.f61485c != -3) {
            StringBuilder k2 = C13555b.m33972k("capacity=");
            k2.append(this.f61485c);
            arrayList.add(k2.toString());
        }
        if (this.f61486d != BufferOverflow.SUSPEND) {
            StringBuilder k3 = C13555b.m33972k("onBufferOverflow=");
            k3.append(this.f61486d);
            arrayList.add(k3.toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return C0017h.m57N(sb, C23825c.m58520q0(arrayList, ", ", (String) null, (String) null, (C24236l) null, 62), ']');
    }
}
