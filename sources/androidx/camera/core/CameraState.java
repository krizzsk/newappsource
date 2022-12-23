package androidx.camera.core;

public abstract class CameraState {

    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* renamed from: androidx.camera.core.CameraState$a */
    public static abstract class C0530a {
        /* renamed from: a */
        public abstract Throwable mo2356a();

        /* renamed from: b */
        public abstract int mo2357b();
    }

    /* renamed from: a */
    public abstract C0530a mo2354a();

    /* renamed from: b */
    public abstract Type mo2355b();
}
