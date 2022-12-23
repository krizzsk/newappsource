package p066e0;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.utils.ExifData;

/* renamed from: e0.g */
public interface C4428g {
    /* renamed from: a */
    void mo19949a(ExifData.C0599b bVar);

    /* renamed from: b */
    CaptureResult mo19950b();

    CameraCaptureMetaData$FlashState getFlashState();

    C4450p0 getTagBundle();

    long getTimestamp();
}
