package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.C12514d;
import com.veriff.sdk.camera.core.CameraFilter;
import com.veriff.sdk.camera.core.CameraInfo;
import java.util.ArrayList;
import java.util.List;
import mf0.C24361g;

public class LensFacingCameraFilter implements CameraFilter {
    private int mLensFacing;

    public LensFacingCameraFilter(int i) {
        this.mLensFacing = i;
    }

    public List<CameraInfo> filter(List<CameraInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (CameraInfo next : list) {
            C24361g.m61177o(next instanceof CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            Integer lensFacing = ((CameraInfoInternal) next).getLensFacing();
            if (lensFacing != null && lensFacing.intValue() == this.mLensFacing) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final /* synthetic */ Identifier getIdentifier() {
        return C12514d.m32267a(this);
    }

    public int getLensFacing() {
        return this.mLensFacing;
    }
}
