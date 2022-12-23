package com.veriff.sdk.camera.camera2.internal.compat.params;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import com.veriff.sdk.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import com.veriff.sdk.camera.core.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import mf0.C24361g;

class OutputConfigurationCompatBaseImpl implements OutputConfigurationCompat.OutputConfigurationCompatImpl {
    public final Object mObject;

    public static final class OutputConfigurationParamsApi21 {
        public final int mConfiguredFormat;
        public final int mConfiguredGenerationId;
        public final Size mConfiguredSize;
        public boolean mIsShared = false;
        public final List<Surface> mSurfaces;

        public OutputConfigurationParamsApi21(Surface surface) {
            C24361g.m61185s(surface, "Surface must not be null");
            this.mSurfaces = Collections.singletonList(surface);
            this.mConfiguredSize = getSurfaceSize(surface);
            this.mConfiguredFormat = getSurfaceFormat(surface);
            this.mConfiguredGenerationId = getSurfaceGenerationId(surface);
        }

        @SuppressLint({"BlockedPrivateApi"})
        private static int getSurfaceFormat(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", new Class[]{Surface.class});
                if (Build.VERSION.SDK_INT < 22) {
                    declaredMethod.setAccessible(true);
                }
                return ((Integer) declaredMethod.invoke((Object) null, new Object[]{surface})).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Logger.m32242e("OutputConfigCompat", "Unable to retrieve surface format.", e);
                return 0;
            }
        }

        @SuppressLint({"SoonBlockedPrivateApi"})
        private static int getSurfaceGenerationId(Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Logger.m32242e("OutputConfigCompat", "Unable to retrieve surface generation id.", e);
                return -1;
            }
        }

        @SuppressLint({"BlockedPrivateApi"})
        private static Size getSurfaceSize(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", new Class[]{Surface.class});
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke((Object) null, new Object[]{surface});
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Logger.m32242e("OutputConfigCompat", "Unable to retrieve surface size.", e);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi21)) {
                return false;
            }
            OutputConfigurationParamsApi21 outputConfigurationParamsApi21 = (OutputConfigurationParamsApi21) obj;
            if (this.mConfiguredSize.equals(outputConfigurationParamsApi21.mConfiguredSize) && this.mConfiguredFormat == outputConfigurationParamsApi21.mConfiguredFormat && this.mConfiguredGenerationId == outputConfigurationParamsApi21.mConfiguredGenerationId && this.mIsShared == outputConfigurationParamsApi21.mIsShared) {
                outputConfigurationParamsApi21.getClass();
                if (Objects.equals((Object) null, (Object) null)) {
                    int min = Math.min(this.mSurfaces.size(), outputConfigurationParamsApi21.mSurfaces.size());
                    for (int i = 0; i < min; i++) {
                        if (this.mSurfaces.get(i) != outputConfigurationParamsApi21.mSurfaces.get(i)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.mSurfaces.hashCode() ^ 31;
            int i = this.mConfiguredGenerationId ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.mConfiguredSize.hashCode() ^ ((i << 5) - i);
            int i2 = this.mConfiguredFormat ^ ((hashCode2 << 5) - hashCode2);
            boolean z = this.mIsShared ^ ((i2 << 5) - i2);
            return 0 ^ (((z ? 1 : 0) << true) - z);
        }
    }

    public OutputConfigurationCompatBaseImpl(Surface surface) {
        this.mObject = new OutputConfigurationParamsApi21(surface);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OutputConfigurationCompatBaseImpl)) {
            return false;
        }
        return Objects.equals(this.mObject, ((OutputConfigurationCompatBaseImpl) obj).mObject);
    }

    public Object getOutputConfiguration() {
        return null;
    }

    public String getPhysicalCameraId() {
        ((OutputConfigurationParamsApi21) this.mObject).getClass();
        return null;
    }

    public Surface getSurface() {
        List<Surface> list = ((OutputConfigurationParamsApi21) this.mObject).mSurfaces;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public int hashCode() {
        return this.mObject.hashCode();
    }

    public OutputConfigurationCompatBaseImpl(Object obj) {
        this.mObject = obj;
    }
}
