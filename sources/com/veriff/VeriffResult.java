package com.veriff;

public final class VeriffResult {

    /* renamed from: a */
    public final Status f30934a;

    /* renamed from: b */
    public final Error f30935b;

    public enum Error {
        UNABLE_TO_ACCESS_CAMERA,
        UNABLE_TO_RECORD_AUDIO,
        UNABLE_TO_START_CAMERA,
        MIC_UNAVAILABLE,
        UNSUPPORTED_SDK_VERSION,
        DEVICE_HAS_NO_NFC,
        NFC_DISABLED,
        SESSION_ERROR,
        NETWORK_ERROR,
        SETUP_ERROR,
        UNKNOWN_ERROR
    }

    public enum Status {
        CANCELED,
        ERROR,
        DONE
    }

    public VeriffResult(Status status, Error error) {
        this.f30934a = status;
        this.f30935b = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VeriffResult.class != obj.getClass()) {
            return false;
        }
        VeriffResult veriffResult = (VeriffResult) obj;
        if (this.f30934a == veriffResult.f30934a && this.f30935b == veriffResult.f30935b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f30934a.hashCode() * 31;
        Error error = this.f30935b;
        if (error != null) {
            i = error.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("VeriffResult{status=");
        k.append(this.f30934a);
        k.append(", error=");
        k.append(this.f30935b);
        k.append('}');
        return k.toString();
    }
}
