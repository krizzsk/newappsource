package p030bo.app;

/* renamed from: bo.app.r0 */
public final class C1678r0 {
    public C1678r0(C1619k2 k2Var) {
        if (k2Var == null) {
            throw new IllegalArgumentException("Session created events cannot be created without a session available.");
        } else if (k2Var.mo6191y()) {
            throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.");
        }
    }
}
