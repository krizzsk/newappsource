package kotlinx.coroutines.sync;

import bf0.C21050d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.MutexImpl;
import lf0.C24236l;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "it", "Lbf0/d;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class MutexImpl$LockCont$tryResumeLockWaiter$1 extends Lambda implements C24236l<Throwable, C21050d> {
    public final /* synthetic */ MutexImpl this$0;
    public final /* synthetic */ MutexImpl.LockCont this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutexImpl$LockCont$tryResumeLockWaiter$1(MutexImpl mutexImpl, MutexImpl.LockCont lockCont) {
        super(1);
        this.this$0 = mutexImpl;
        this.this$1 = lockCont;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.this$0.mo60396b(this.this$1.f61523e);
        return C21050d.f52856a;
    }
}
