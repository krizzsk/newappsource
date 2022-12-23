package androidx.camera.core.impl;

import androidx.camera.core.UseCase;
import java.util.Collection;
import p054d0.C4279f;
import p054d0.C4288j;
import p066e0.C4421d0;
import p304x.C7090q;
import p304x.C7124z;

public interface CameraInternal extends C4279f, UseCase.C0540c {

    public enum State {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        
        private final boolean mHoldsCameraSlot;

        private State(boolean z) {
            this.mHoldsCameraSlot = z;
        }

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    void attachUseCases(Collection<UseCase> collection);

    /* renamed from: c */
    void mo2238c(boolean z);

    void detachUseCases(Collection<UseCase> collection);

    /* renamed from: g */
    void mo2243g(C0574c cVar);

    C7090q getCameraControlInternal();

    C4288j getCameraInfo();

    C7124z getCameraInfoInternal();

    C4421d0 getCameraState();
}
