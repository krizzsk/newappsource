package androidx.camera.core;

import p695od.C18728c;

public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }
    }

    C18728c<Void> enableTorch(boolean z);
}
