package p043ch.qos.logback.core.spi;

/* renamed from: ch.qos.logback.core.spi.ScanException */
public class ScanException extends Exception {
    private static final long serialVersionUID = -3132040414328475658L;
    public Throwable cause;

    public ScanException(IllegalArgumentException illegalArgumentException) {
        super("Failed to initialize Parser");
        this.cause = illegalArgumentException;
    }

    public ScanException(String str) {
        super(str);
    }

    public final Throwable getCause() {
        return this.cause;
    }
}
