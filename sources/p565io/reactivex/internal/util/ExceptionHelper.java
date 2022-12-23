package p565io.reactivex.internal.util;

/* renamed from: io.reactivex.internal.util.ExceptionHelper */
public final class ExceptionHelper {

    /* renamed from: io.reactivex.internal.util.ExceptionHelper$Termination */
    public static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Termination() {
            super("No further exceptions");
        }

        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    static {
        new Termination();
    }

    /* renamed from: a */
    public static RuntimeException m58212a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }
}
