package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p054d0.C4289j0;
import p054d0.C4292l;
import p066e0.C4445n;

public final class CameraValidator {

    public static class CameraIdListIncorrectException extends Exception {
        public CameraIdListIncorrectException(IllegalArgumentException illegalArgumentException) {
            super("Expected camera missing from device.", illegalArgumentException);
        }
    }

    /* renamed from: a */
    public static void m1583a(Context context, C4445n nVar, C4292l lVar) throws CameraIdListIncorrectException {
        Integer num;
        if (lVar != null) {
            try {
                num = lVar.mo19816c();
                if (num == null) {
                    C4289j0.m11435b("CameraValidator");
                    return;
                }
            } catch (IllegalStateException unused) {
                C4289j0.m11435b("CameraValidator");
                return;
            }
        } else {
            num = null;
        }
        String str = Build.DEVICE;
        C4289j0.m11435b("CameraValidator");
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (lVar == null || num.intValue() == 1)) {
                C4292l.f15214c.mo19817d(nVar.mo19983a());
            }
            if (!packageManager.hasSystemFeature("android.hardware.camera.front")) {
                return;
            }
            if (lVar == null || num.intValue() == 0) {
                C4292l.f15213b.mo19817d(nVar.mo19983a());
            }
        } catch (IllegalArgumentException e) {
            nVar.mo19983a().toString();
            C4289j0.m11435b("CameraValidator");
            throw new CameraIdListIncorrectException(e);
        }
    }
}
