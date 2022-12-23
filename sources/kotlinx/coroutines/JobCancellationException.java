package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import mf0.C24362h;
import wh0.C25232y0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, mo59060d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class JobCancellationException extends CancellationException {

    /* renamed from: b */
    public final transient C25232y0 f61416b;

    public JobCancellationException(String str, Throwable th, C25232y0 y0Var) {
        super(str);
        this.f61416b = y0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!C24362h.m61206a(jobCancellationException.getMessage(), getMessage()) || !C24362h.m61206a(jobCancellationException.f61416b, this.f61416b) || !C24362h.m61206a(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        C24362h.m61208c(message);
        int hashCode = (this.f61416b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f61416b;
    }
}
