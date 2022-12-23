package com.veriff.sdk.camera.camera2.internal.compat.workaround;

import com.veriff.sdk.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.DeviceQuirks;

public class AutoFlashAEModeDisabler {
    public int getCorrectedAeMode(int i) {
        if (((CrashWhenTakingPhotoWithAutoFlashAEModeQuirk) DeviceQuirks.get(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class)) == null || i != 2) {
            return i;
        }
        return 1;
    }
}
