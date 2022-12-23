package com.veriff.sdk.camera.camera2.internal.compat.quirk;

import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.core.impl.Quirks;
import java.util.ArrayList;

public class CameraQuirks {
    public static Quirks get(String str, CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        ArrayList arrayList = new ArrayList();
        if (AeFpsRangeLegacyQuirk.load(cameraCharacteristicsCompat)) {
            arrayList.add(new AeFpsRangeLegacyQuirk(cameraCharacteristicsCompat));
        }
        if (AspectRatioLegacyApi21Quirk.load(cameraCharacteristicsCompat)) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (JpegHalCorruptImageQuirk.load(cameraCharacteristicsCompat)) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (CamcorderProfileResolutionQuirk.load(cameraCharacteristicsCompat)) {
            arrayList.add(new CamcorderProfileResolutionQuirk(cameraCharacteristicsCompat));
        }
        return new Quirks(arrayList);
    }
}
