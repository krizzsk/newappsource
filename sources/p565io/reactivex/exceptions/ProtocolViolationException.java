package p565io.reactivex.exceptions;

/* renamed from: io.reactivex.exceptions.ProtocolViolationException */
public final class ProtocolViolationException extends IllegalStateException {
    private static final long serialVersionUID = 1644750035281290266L;

    public ProtocolViolationException() {
        super("Disposable already set!");
    }
}
