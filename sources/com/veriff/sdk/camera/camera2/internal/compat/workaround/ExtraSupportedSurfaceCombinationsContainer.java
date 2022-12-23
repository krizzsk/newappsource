package com.veriff.sdk.camera.camera2.internal.compat.workaround;

import com.veriff.sdk.camera.camera2.internal.compat.quirk.DeviceQuirks;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import com.veriff.sdk.camera.core.impl.SurfaceCombination;
import java.util.ArrayList;
import java.util.List;

public class ExtraSupportedSurfaceCombinationsContainer {
    private final String mCameraId;

    public ExtraSupportedSurfaceCombinationsContainer(String str) {
        this.mCameraId = str;
    }

    public List<SurfaceCombination> get() {
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = (ExtraSupportedSurfaceCombinationsQuirk) DeviceQuirks.get(ExtraSupportedSurfaceCombinationsQuirk.class);
        if (extraSupportedSurfaceCombinationsQuirk == null) {
            return new ArrayList();
        }
        return extraSupportedSurfaceCombinationsQuirk.getExtraSupportedSurfaceCombinations(this.mCameraId);
    }
}
