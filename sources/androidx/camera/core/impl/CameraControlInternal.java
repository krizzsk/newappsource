package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.SessionConfig;
import java.util.ArrayList;
import java.util.Collections;
import p102h0.C5023g;
import p695od.C18728c;

public interface CameraControlInternal extends CameraControl {

    /* renamed from: a */
    public static final C0562a f1919a = new C0562a();

    public static final class CameraControlException extends Exception {
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraControlInternal$a */
    public class C0562a implements CameraControlInternal {
        /* renamed from: a */
        public final void mo2443a(Size size, SessionConfig.C0566b bVar) {
        }

        /* renamed from: b */
        public final C18728c mo2444b(int i, int i2, ArrayList arrayList) {
            return C5023g.m12857e(Collections.emptyList());
        }

        public final C18728c<Void> enableTorch(boolean z) {
            return C5023g.m12857e((Object) null);
        }

        public final void setFlashMode(int i) {
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraControlInternal$b */
    public interface C0563b {
    }

    /* renamed from: a */
    void mo2443a(Size size, SessionConfig.C0566b bVar);

    /* renamed from: b */
    C18728c mo2444b(int i, int i2, ArrayList arrayList);

    void setFlashMode(int i);
}
