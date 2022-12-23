package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import wh0.C25232y0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, mo59060d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class TimeoutCancellationException extends CancellationException {

    /* renamed from: b */
    public final transient C25232y0 f61417b;

    public TimeoutCancellationException(String str, C25232y0 y0Var) {
        super(str);
        this.f61417b = y0Var;
    }
}
