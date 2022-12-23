package wh0;

import bi0.C21077o;
import ff0.C23349c;
import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: wh0.s1 */
public final class C25215s1<U, T extends U> extends C21077o<T> implements Runnable {

    /* renamed from: e */
    public final long f63485e;

    public C25215s1(long j, C23349c<? super U> cVar) {
        super(cVar, cVar.getContext());
        this.f63485e = j;
    }

    /* renamed from: j0 */
    public final String mo61749j0() {
        return super.mo61749j0() + "(timeMillis=" + this.f63485e + ')';
    }

    public final void run() {
        mo61766J(new TimeoutCancellationException(C16530d.m42012e("Timed out waiting for ", this.f63485e, " ms"), this));
    }
}
