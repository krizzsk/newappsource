package com.fyber.inneractive.sdk.external;

public class InneractiveInfrastructureError extends InneractiveError {

    /* renamed from: a */
    public final InneractiveErrorCode f9514a;

    /* renamed from: b */
    public Throwable f9515b;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode) {
        this.f9514a = inneractiveErrorCode;
    }

    public String description() {
        StringBuilder sb = new StringBuilder();
        InneractiveErrorCode inneractiveErrorCode = this.f9514a;
        if (inneractiveErrorCode != null) {
            sb.append(inneractiveErrorCode);
        }
        if (this.f9515b != null) {
            sb.append(": ");
            sb.append(this.f9515b);
        }
        return sb.toString();
    }

    public Throwable getCause() {
        return this.f9515b;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f9514a;
    }

    public void setCause(Throwable th) {
        this.f9515b = th;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, Throwable th) {
        this(inneractiveErrorCode);
        this.f9515b = th;
    }
}
