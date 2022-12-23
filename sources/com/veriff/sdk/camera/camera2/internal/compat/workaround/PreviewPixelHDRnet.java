package com.veriff.sdk.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.DeviceQuirks;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import com.veriff.sdk.camera.core.impl.SessionConfig;

public class PreviewPixelHDRnet {
    public static void setHDRnet(SessionConfig.Builder builder) {
        if (((PreviewPixelHDRnetQuirk) DeviceQuirks.get(PreviewPixelHDRnetQuirk.class)) != null) {
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.TONEMAP_MODE, 2);
            builder.addImplementationOptions(builder2.build());
        }
    }
}
