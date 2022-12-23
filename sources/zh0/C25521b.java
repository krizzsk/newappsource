package zh0;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C24212a;
import lf0.C24240p;
import yh0.C25319k;

/* renamed from: zh0.b */
public class C25521b<T> extends C24212a<T> {

    /* renamed from: e */
    public final C24240p<C25319k<? super T>, C23349c<? super C21050d>, Object> f63783e;

    public C25521b(C24240p<? super C25319k<? super T>, ? super C23349c<? super C21050d>, ? extends Object> pVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f63783e = pVar;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("block[");
        k.append(this.f63783e);
        k.append("] -> ");
        k.append(super.toString());
        return k.toString();
    }
}
