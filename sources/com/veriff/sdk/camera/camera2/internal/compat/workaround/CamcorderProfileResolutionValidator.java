package com.veriff.sdk.camera.camera2.internal.compat.workaround;

import com.veriff.sdk.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import java.util.Collections;
import java.util.HashSet;

public class CamcorderProfileResolutionValidator {
    public CamcorderProfileResolutionValidator(CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk) {
        if (camcorderProfileResolutionQuirk != null) {
            new HashSet(camcorderProfileResolutionQuirk.getSupportedResolutions());
        } else {
            Collections.emptySet();
        }
    }
}
