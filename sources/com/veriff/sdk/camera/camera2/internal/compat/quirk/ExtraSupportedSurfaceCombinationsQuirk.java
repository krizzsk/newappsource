package com.veriff.sdk.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.usebutton.sdk.internal.util.DiskLruCache;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.Quirk;
import com.veriff.sdk.camera.core.impl.SurfaceCombination;
import com.veriff.sdk.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtraSupportedSurfaceCombinationsQuirk implements Quirk {
    private List<SurfaceCombination> getSamsungS7ExtraCombinations(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(DiskLruCache.VERSION_1)) {
            SurfaceCombination surfaceCombination = new SurfaceCombination();
            SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
            surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, SurfaceConfig.ConfigSize.ANALYSIS));
            surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
            surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, SurfaceConfig.ConfigSize.MAXIMUM));
            arrayList.add(surfaceCombination);
        }
        return arrayList;
    }

    private static boolean isSamsungS7() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND)) {
            String str = Build.DEVICE;
            if ("heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean load() {
        return isSamsungS7();
    }

    public List<SurfaceCombination> getExtraSupportedSurfaceCombinations(String str) {
        if (isSamsungS7()) {
            return getSamsungS7ExtraCombinations(str);
        }
        Logger.m32245w("ExtraSupportedSurfaceCombinationsQuirk", "Cannot retrieve list of extra supported surface combinations on this device.");
        return Collections.emptyList();
    }
}
