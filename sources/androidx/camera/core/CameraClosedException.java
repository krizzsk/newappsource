package androidx.camera.core;

final class CameraClosedException extends RuntimeException {
    public CameraClosedException() {
        super("Camera is closed.");
    }
}
