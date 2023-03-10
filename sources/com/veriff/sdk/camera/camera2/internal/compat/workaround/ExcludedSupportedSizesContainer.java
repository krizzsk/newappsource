package com.veriff.sdk.camera.camera2.internal.compat.workaround;

import android.util.Size;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.DeviceQuirks;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import java.util.ArrayList;
import java.util.List;

public class ExcludedSupportedSizesContainer {
    private final String mCameraId;

    public ExcludedSupportedSizesContainer(String str) {
        this.mCameraId = str;
    }

    public List<Size> get(int i) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) DeviceQuirks.get(ExcludedSupportedSizesQuirk.class);
        if (excludedSupportedSizesQuirk == null) {
            return new ArrayList();
        }
        return excludedSupportedSizesQuirk.getExcludedSizes(this.mCameraId, i);
    }
}
