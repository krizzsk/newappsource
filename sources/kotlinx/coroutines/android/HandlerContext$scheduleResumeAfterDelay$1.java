package kotlinx.coroutines.android;

import bf0.C21050d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import xh0.C25273c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "it", "Lbf0/d;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class HandlerContext$scheduleResumeAfterDelay$1 extends Lambda implements C24236l<Throwable, C21050d> {
    public final /* synthetic */ Runnable $block;
    public final /* synthetic */ C24183a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerContext$scheduleResumeAfterDelay$1(C24183a aVar, C25273c cVar) {
        super(1);
        this.this$0 = aVar;
        this.$block = cVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.this$0.f61419d.removeCallbacks(this.$block);
        return C21050d.f52856a;
    }
}
