package com.veriff.sdk.camera.camera2.internal.compat.workaround;

import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.CameraQuirks;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.DeviceQuirks;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.SamsungPreviewTargetAspectRatioQuirk;
import com.veriff.sdk.camera.core.impl.ImageOutputConfig;

public class TargetAspectRatio {
    public int get(ImageOutputConfig imageOutputConfig, String str, CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        SamsungPreviewTargetAspectRatioQuirk samsungPreviewTargetAspectRatioQuirk = (SamsungPreviewTargetAspectRatioQuirk) DeviceQuirks.get(SamsungPreviewTargetAspectRatioQuirk.class);
        if (samsungPreviewTargetAspectRatioQuirk != null && samsungPreviewTargetAspectRatioQuirk.require16_9(imageOutputConfig)) {
            return 1;
        }
        Nexus4AndroidLTargetAspectRatioQuirk nexus4AndroidLTargetAspectRatioQuirk = (Nexus4AndroidLTargetAspectRatioQuirk) DeviceQuirks.get(Nexus4AndroidLTargetAspectRatioQuirk.class);
        if (nexus4AndroidLTargetAspectRatioQuirk != null) {
            return nexus4AndroidLTargetAspectRatioQuirk.getCorrectedAspectRatio();
        }
        AspectRatioLegacyApi21Quirk aspectRatioLegacyApi21Quirk = (AspectRatioLegacyApi21Quirk) CameraQuirks.get(str, cameraCharacteristicsCompat).get(AspectRatioLegacyApi21Quirk.class);
        if (aspectRatioLegacyApi21Quirk != null) {
            return aspectRatioLegacyApi21Quirk.getCorrectedAspectRatio();
        }
        return 3;
    }
}
