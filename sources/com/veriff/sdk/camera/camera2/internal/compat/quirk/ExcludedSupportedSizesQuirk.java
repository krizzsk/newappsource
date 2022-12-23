package com.veriff.sdk.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.Quirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcludedSupportedSizesQuirk implements Quirk {
    private List<Size> getOnePlus6ExcludedSizes(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
        }
        return arrayList;
    }

    private List<Size> getOnePlus6TExcludedSizes(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
        }
        return arrayList;
    }

    private static boolean isOnePlus6() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isOnePlus6T() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean load() {
        return isOnePlus6() || isOnePlus6T();
    }

    public List<Size> getExcludedSizes(String str, int i) {
        if (isOnePlus6()) {
            return getOnePlus6ExcludedSizes(str, i);
        }
        if (isOnePlus6T()) {
            return getOnePlus6TExcludedSizes(str, i);
        }
        Logger.m32245w("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}
