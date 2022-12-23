package com.veriff.sdk.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import android.view.WindowManager;
import com.veriff.sdk.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.camera2.internal.compat.CameraManagerCompat;
import com.veriff.sdk.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer;
import com.veriff.sdk.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import com.veriff.sdk.camera.camera2.internal.compat.workaround.TargetAspectRatio;
import com.veriff.sdk.camera.core.CameraUnavailableException;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.ImageOutputConfig;
import com.veriff.sdk.camera.core.impl.SurfaceCombination;
import com.veriff.sdk.camera.core.impl.SurfaceConfig;
import com.veriff.sdk.camera.core.impl.SurfaceSizeDefinition;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;
import com.veriff.sdk.camera.core.impl.utils.CameraOrientationUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mf0.C24361g;

final class SupportedSurfaceCombination {
    private static final Rational ASPECT_RATIO_16_9 = new Rational(16, 9);
    private static final Rational ASPECT_RATIO_3_4 = new Rational(3, 4);
    private static final Rational ASPECT_RATIO_4_3 = new Rational(4, 3);
    private static final Rational ASPECT_RATIO_9_16 = new Rational(9, 16);
    private static final Size DEFAULT_SIZE = new Size(640, 480);
    private static final Size MAX_PREVIEW_SIZE = new Size(1920, 1080);
    private static final Size QUALITY_1080P_SIZE = new Size(1920, 1080);
    private static final Size QUALITY_480P_SIZE = new Size(720, 480);
    private static final Size ZERO_SIZE = new Size(0, 0);
    private final CamcorderProfileHelper mCamcorderProfileHelper;
    private final String mCameraId;
    private final CameraCharacteristicsCompat mCharacteristics;
    private final Map<Integer, List<Size>> mExcludedSizeListCache = new HashMap();
    private final ExcludedSupportedSizesContainer mExcludedSupportedSizesContainer;
    private final ExtraSupportedSurfaceCombinationsContainer mExtraSupportedSurfaceCombinationsContainer;
    private final int mHardwareLevel;
    private boolean mIsBurstCaptureSupported = false;
    private boolean mIsRawSupported = false;
    private final boolean mIsSensorLandscapeResolution;
    private final Map<Integer, Size> mMaxSizeCache = new HashMap();
    private Map<Integer, Size[]> mOutputSizesCache = new HashMap();
    private final List<SurfaceCombination> mSurfaceCombinations = new ArrayList();
    private SurfaceSizeDefinition mSurfaceSizeDefinition;

    public static final class CompareAspectRatiosByDistanceToTargetRatio implements Comparator<Rational> {
        private Rational mTargetRatio;

        public CompareAspectRatiosByDistanceToTargetRatio(Rational rational) {
            this.mTargetRatio = rational;
        }

        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.mTargetRatio.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.mTargetRatio.floatValue())).floatValue());
        }
    }

    public static final class CompareSizesByArea implements Comparator<Size> {
        private boolean mReverse;

        public CompareSizesByArea() {
            this.mReverse = false;
        }

        public int compare(Size size, Size size2) {
            int signum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            return this.mReverse ? signum * -1 : signum;
        }

        public CompareSizesByArea(boolean z) {
            this.mReverse = z;
        }
    }

    public SupportedSurfaceCombination(Context context, String str, CameraManagerCompat cameraManagerCompat, CamcorderProfileHelper camcorderProfileHelper) throws CameraUnavailableException {
        int i;
        str.getClass();
        this.mCameraId = str;
        camcorderProfileHelper.getClass();
        this.mCamcorderProfileHelper = camcorderProfileHelper;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.mExcludedSupportedSizesContainer = new ExcludedSupportedSizesContainer(str);
        this.mExtraSupportedSurfaceCombinationsContainer = new ExtraSupportedSurfaceCombinationsContainer(str);
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
            this.mCharacteristics = cameraCharacteristicsCompat;
            Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 2;
            }
            this.mHardwareLevel = i;
            this.mIsSensorLandscapeResolution = isSensorLandscapeResolution();
            generateSupportedCombinationList();
            generateSurfaceSizeDefinition(windowManager);
            checkCustomization();
        } catch (CameraAccessExceptionCompat e) {
            throw CameraUnavailableExceptionHelper.createFrom(e);
        }
    }

    private void checkCustomization() {
    }

    private Size[] doGetAllOutputSizesByFormat(int i) {
        Size[] sizeArr;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.mCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            if (Build.VERSION.SDK_INT >= 23 || i != 34) {
                sizeArr = streamConfigurationMap.getOutputSizes(i);
            } else {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            }
            if (sizeArr != null) {
                Size[] excludeProblematicSizes = excludeProblematicSizes(sizeArr, i);
                Arrays.sort(excludeProblematicSizes, new CompareSizesByArea(true));
                return excludeProblematicSizes;
            }
            throw new IllegalArgumentException(C16759e.m42349e("Can not get supported output size for the format: ", i));
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    private Size[] excludeProblematicSizes(Size[] sizeArr, int i) {
        List<Size> fetchExcludedSizes = fetchExcludedSizes(i);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(fetchExcludedSizes);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    private List<Size> fetchExcludedSizes(int i) {
        List<Size> list = this.mExcludedSizeListCache.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        List<Size> list2 = this.mExcludedSupportedSizesContainer.get(i);
        this.mExcludedSizeListCache.put(Integer.valueOf(i), list2);
        return list2;
    }

    private Size fetchMaxSize(int i) {
        Size size = this.mMaxSizeCache.get(Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(i);
        this.mMaxSizeCache.put(Integer.valueOf(i), maxOutputSizeByFormat);
        return maxOutputSizeByFormat;
    }

    private Size flipSizeByRotation(Size size, int i) {
        if (size == null || !isRotationNeeded(i)) {
            return size;
        }
        return new Size(size.getHeight(), size.getWidth());
    }

    private void generateSupportedCombinationList() {
        this.mSurfaceCombinations.addAll(getLegacySupportedCombinationList());
        int i = this.mHardwareLevel;
        if (i == 0 || i == 1 || i == 3) {
            this.mSurfaceCombinations.addAll(getLimitedSupportedCombinationList());
        }
        int i2 = this.mHardwareLevel;
        if (i2 == 1 || i2 == 3) {
            this.mSurfaceCombinations.addAll(getFullSupportedCombinationList());
        }
        int[] iArr = (int[]) this.mCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 == 3) {
                    this.mIsRawSupported = true;
                } else if (i3 == 6) {
                    this.mIsBurstCaptureSupported = true;
                }
            }
        }
        if (this.mIsRawSupported) {
            this.mSurfaceCombinations.addAll(getRAWSupportedCombinationList());
        }
        if (this.mIsBurstCaptureSupported && this.mHardwareLevel == 0) {
            this.mSurfaceCombinations.addAll(getBurstSupportedCombinationList());
        }
        if (this.mHardwareLevel == 3) {
            this.mSurfaceCombinations.addAll(getLevel3SupportedCombinationList());
        }
        this.mSurfaceCombinations.addAll(this.mExtraSupportedSurfaceCombinationsContainer.get());
    }

    private void generateSurfaceSizeDefinition(WindowManager windowManager) {
        this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(new Size(640, 480), getPreviewSize(windowManager), getRecordSize());
    }

    private Size[] getAllOutputSizesByFormat(int i) {
        Size[] sizeArr = this.mOutputSizesCache.get(Integer.valueOf(i));
        if (sizeArr != null) {
            return sizeArr;
        }
        Size[] doGetAllOutputSizesByFormat = doGetAllOutputSizesByFormat(i);
        this.mOutputSizesCache.put(Integer.valueOf(i), doGetAllOutputSizesByFormat);
        return doGetAllOutputSizesByFormat;
    }

    private List<List<Size>> getAllPossibleSizeArrangements(List<List<Size>> list) {
        int i = 1;
        for (List<Size> size : list) {
            i *= size.size();
        }
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new ArrayList());
            }
            int size2 = i / list.get(0).size();
            int i3 = i;
            for (int i4 = 0; i4 < list.size(); i4++) {
                List list2 = list.get(i4);
                for (int i5 = 0; i5 < i; i5++) {
                    ((List) arrayList.get(i5)).add((Size) list2.get((i5 % i3) / size2));
                }
                if (i4 < list.size() - 1) {
                    i3 = size2;
                    size2 /= list.get(i4 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    private static int getArea(Size size) {
        return size.getHeight() * size.getWidth();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.util.Size[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Size[] getCustomizedSupportSizesFromConfig(int r4, com.veriff.sdk.camera.core.impl.ImageOutputConfig r5) {
        /*
            r3 = this;
            r0 = 0
            java.util.List r5 = r5.getSupportedResolutions(r0)
            if (r5 == 0) goto L_0x0026
            java.util.Iterator r5 = r5.iterator()
        L_0x000b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r5.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x000b
            java.lang.Object r5 = r1.second
            r0 = r5
            android.util.Size[] r0 = (android.util.Size[]) r0
        L_0x0026:
            if (r0 == 0) goto L_0x0035
            android.util.Size[] r0 = r3.excludeProblematicSizes(r0, r4)
            com.veriff.sdk.camera.camera2.internal.SupportedSurfaceCombination$CompareSizesByArea r4 = new com.veriff.sdk.camera.camera2.internal.SupportedSurfaceCombination$CompareSizesByArea
            r5 = 1
            r4.<init>(r5)
            java.util.Arrays.sort(r0, r4)
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.internal.SupportedSurfaceCombination.getCustomizedSupportSizesFromConfig(int, com.veriff.sdk.camera.core.impl.ImageOutputConfig):android.util.Size[]");
    }

    public static Size getPreviewSize(WindowManager windowManager) {
        Size size;
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        return (Size) Collections.min(Arrays.asList(new Size[]{new Size(size.getWidth(), size.getHeight()), MAX_PREVIEW_SIZE}), new CompareSizesByArea());
    }

    private Size getRecordSize() {
        try {
            int parseInt = Integer.parseInt(this.mCameraId);
            CamcorderProfile camcorderProfile = null;
            if (this.mCamcorderProfileHelper.hasProfile(parseInt, 1)) {
                camcorderProfile = this.mCamcorderProfileHelper.get(parseInt, 1);
            }
            if (camcorderProfile != null) {
                return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            return getRecordSizeByHasProfile(parseInt);
        } catch (NumberFormatException unused) {
            return getRecordSizeFromStreamConfigurationMap();
        }
    }

    private Size getRecordSizeByHasProfile(int i) {
        CamcorderProfile camcorderProfile;
        Size size = QUALITY_480P_SIZE;
        if (this.mCamcorderProfileHelper.hasProfile(i, 10)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 10);
        } else if (this.mCamcorderProfileHelper.hasProfile(i, 8)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 8);
        } else if (this.mCamcorderProfileHelper.hasProfile(i, 12)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 12);
        } else if (this.mCamcorderProfileHelper.hasProfile(i, 6)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 6);
        } else if (this.mCamcorderProfileHelper.hasProfile(i, 5)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 5);
        } else if (this.mCamcorderProfileHelper.hasProfile(i, 4)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 4);
        } else {
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        return size;
    }

    private Size getRecordSizeFromStreamConfigurationMap() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.mCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                return QUALITY_480P_SIZE;
            }
            Arrays.sort(outputSizes, new CompareSizesByArea(true));
            for (Size size : outputSizes) {
                int width = size.getWidth();
                Size size2 = QUALITY_1080P_SIZE;
                if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                    return size;
                }
            }
            return QUALITY_480P_SIZE;
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    private Rational getTargetAspectRatio(ImageOutputConfig imageOutputConfig) {
        Rational rational;
        int i = new TargetAspectRatio().get(imageOutputConfig, this.mCameraId, this.mCharacteristics);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Size fetchMaxSize = fetchMaxSize(256);
                    return new Rational(fetchMaxSize.getWidth(), fetchMaxSize.getHeight());
                } else if (i != 3) {
                    return null;
                } else {
                    Size targetSize = getTargetSize(imageOutputConfig);
                    if (imageOutputConfig.hasTargetAspectRatio()) {
                        int targetAspectRatio = imageOutputConfig.getTargetAspectRatio();
                        if (targetAspectRatio != 0) {
                            if (targetAspectRatio != 1) {
                                Logger.m32241e("SupportedSurfaceCombination", "Undefined target aspect ratio: " + targetAspectRatio);
                                return null;
                            } else if (this.mIsSensorLandscapeResolution) {
                                rational = ASPECT_RATIO_16_9;
                            } else {
                                rational = ASPECT_RATIO_9_16;
                            }
                        } else if (this.mIsSensorLandscapeResolution) {
                            rational = ASPECT_RATIO_4_3;
                        } else {
                            rational = ASPECT_RATIO_3_4;
                        }
                    } else if (targetSize != null) {
                        return new Rational(targetSize.getWidth(), targetSize.getHeight());
                    } else {
                        return null;
                    }
                }
            } else if (this.mIsSensorLandscapeResolution) {
                rational = ASPECT_RATIO_16_9;
            } else {
                rational = ASPECT_RATIO_9_16;
            }
        } else if (this.mIsSensorLandscapeResolution) {
            rational = ASPECT_RATIO_4_3;
        } else {
            rational = ASPECT_RATIO_3_4;
        }
        return rational;
    }

    private Size getTargetSize(ImageOutputConfig imageOutputConfig) {
        return flipSizeByRotation(imageOutputConfig.getTargetResolution((Size) null), imageOutputConfig.getTargetRotation(0));
    }

    private List<Integer> getUseCasesPriorityOrder(List<UseCaseConfig<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UseCaseConfig<?> surfaceOccupancyPriority : list) {
            int surfaceOccupancyPriority2 = surfaceOccupancyPriority.getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(Integer.valueOf(surfaceOccupancyPriority2))) {
                arrayList2.add(Integer.valueOf(surfaceOccupancyPriority2));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            for (UseCaseConfig next : list) {
                if (intValue == next.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(next)));
                }
            }
        }
        return arrayList;
    }

    private Map<Rational, List<Size>> groupSizesByAspectRatio(List<Size> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(ASPECT_RATIO_4_3, new ArrayList());
        hashMap.put(ASPECT_RATIO_16_9, new ArrayList());
        for (Size next : list) {
            Rational rational = null;
            for (Rational rational2 : hashMap.keySet()) {
                if (hasMatchingAspectRatio(next, rational2)) {
                    List list2 = (List) hashMap.get(rational2);
                    if (!list2.contains(next)) {
                        list2.add(next);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                hashMap.put(new Rational(next.getWidth(), next.getHeight()), new ArrayList(Collections.singleton(next)));
            }
        }
        return hashMap;
    }

    public static boolean hasMatchingAspectRatio(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (getArea(size) >= getArea(DEFAULT_SIZE)) {
            return isPossibleMod16FromAspectRatio(size, rational);
        }
        return false;
    }

    private static boolean isPossibleMod16FromAspectRatio(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            if (ratioIntersectsMod16Segment(Math.max(0, height - 16), width, rational) || ratioIntersectsMod16Segment(Math.max(0, width - 16), height, rational2)) {
                return true;
            }
            return false;
        } else if (i == 0) {
            return ratioIntersectsMod16Segment(height, width, rational);
        } else {
            if (height % 16 == 0) {
                return ratioIntersectsMod16Segment(width, height, rational2);
            }
            return false;
        }
    }

    private boolean isRotationNeeded(int i) {
        boolean z;
        Integer num = (Integer) this.mCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        C24361g.m61185s(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int surfaceRotationToDegrees = CameraOrientationUtil.surfaceRotationToDegrees(i);
        Integer num2 = (Integer) this.mCharacteristics.get(CameraCharacteristics.LENS_FACING);
        C24361g.m61185s(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        if (1 == num2.intValue()) {
            z = true;
        } else {
            z = false;
        }
        int relativeImageRotation = CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, num.intValue(), z);
        if (relativeImageRotation == 90 || relativeImageRotation == 270) {
            return true;
        }
        return false;
    }

    private boolean isSensorLandscapeResolution() {
        Size size = (Size) this.mCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        if (size == null || size.getWidth() >= size.getHeight()) {
            return true;
        }
        return false;
    }

    private static boolean ratioIntersectsMod16Segment(int i, int i2, Rational rational) {
        boolean z;
        if (i2 % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61175n(z);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        if (numerator <= ((double) Math.max(0, i2 - 16)) || numerator >= ((double) (i2 + 16))) {
            return false;
        }
        return true;
    }

    private void removeSupportedSizesByTargetSize(List<Size> list, Size size) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Size size2 = list.get(i2);
                if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                    break;
                }
                if (i >= 0) {
                    arrayList.add(list.get(i));
                }
                i = i2;
            }
            list.removeAll(arrayList);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0017, LOOP_START, PHI: r1 
      PHI: (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:0:0x0000, B:4:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean checkSupported(java.util.List<com.veriff.sdk.camera.core.impl.SurfaceConfig> r4) {
        /*
            r3 = this;
            java.util.List<com.veriff.sdk.camera.core.impl.SurfaceCombination> r0 = r3.mSurfaceCombinations
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            com.veriff.sdk.camera.core.impl.SurfaceCombination r1 = (com.veriff.sdk.camera.core.impl.SurfaceCombination) r1
            boolean r1 = r1.isSupported(r4)
            if (r1 == 0) goto L_0x0007
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.internal.SupportedSurfaceCombination.checkSupported(java.util.List):boolean");
    }

    public List<SurfaceCombination> getBurstSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination3);
        return arrayList;
    }

    public List<SurfaceCombination> getFullSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, configSize2));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.ANALYSIS;
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination6);
        return arrayList;
    }

    public List<SurfaceCombination> getLegacySupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.JPEG;
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType3, configSize));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    public List<SurfaceCombination> getLevel3SupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.ANALYSIS;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.RAW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, configSize3));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3));
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    public List<SurfaceCombination> getLimitedSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType3, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination6);
        return arrayList;
    }

    public Size getMaxOutputSizeByFormat(int i) {
        return (Size) Collections.max(Arrays.asList(getAllOutputSizesByFormat(i)), new CompareSizesByArea());
    }

    public List<SurfaceCombination> getRAWSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.RAW;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.JPEG;
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType4, configSize));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType4, configSize));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    public Map<UseCaseConfig<?>, Size> getSuggestedResolutions(List<SurfaceConfig> list, List<UseCaseConfig<?>> list2) {
        HashMap hashMap = new HashMap();
        List<Integer> useCasesPriorityOrder = getUseCasesPriorityOrder(list2);
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : useCasesPriorityOrder) {
            arrayList.add(getSupportedOutputSizes(list2.get(intValue.intValue())));
        }
        Iterator<List<Size>> it = getAllPossibleSizeArrangements(arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List next = it.next();
            ArrayList arrayList2 = new ArrayList(list);
            for (int i = 0; i < next.size(); i++) {
                arrayList2.add(transformSurfaceConfig(list2.get(useCasesPriorityOrder.get(i).intValue()).getInputFormat(), (Size) next.get(i)));
            }
            if (checkSupported(arrayList2)) {
                for (UseCaseConfig next2 : list2) {
                    hashMap.put(next2, (Size) next.get(useCasesPriorityOrder.indexOf(Integer.valueOf(list2.indexOf(next2)))));
                }
            }
        }
        return hashMap;
    }

    public List<Size> getSupportedOutputSizes(UseCaseConfig<?> useCaseConfig) {
        int inputFormat = useCaseConfig.getInputFormat();
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
        Size[] customizedSupportSizesFromConfig = getCustomizedSupportSizesFromConfig(inputFormat, imageOutputConfig);
        if (customizedSupportSizesFromConfig == null) {
            customizedSupportSizesFromConfig = getAllOutputSizesByFormat(inputFormat);
        }
        ArrayList arrayList = new ArrayList();
        Size maxResolution = imageOutputConfig.getMaxResolution((Size) null);
        Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(inputFormat);
        if (maxResolution == null || getArea(maxOutputSizeByFormat) < getArea(maxResolution)) {
            maxResolution = maxOutputSizeByFormat;
        }
        Arrays.sort(customizedSupportSizesFromConfig, new CompareSizesByArea(true));
        Size targetSize = getTargetSize(imageOutputConfig);
        Size size = DEFAULT_SIZE;
        int area = getArea(size);
        if (getArea(maxResolution) < area) {
            size = ZERO_SIZE;
        } else if (targetSize != null && getArea(targetSize) < area) {
            size = targetSize;
        }
        for (Size size2 : customizedSupportSizesFromConfig) {
            if (getArea(size2) <= getArea(maxResolution) && getArea(size2) >= getArea(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (!arrayList.isEmpty()) {
            Rational targetAspectRatio = getTargetAspectRatio(imageOutputConfig);
            if (targetSize == null) {
                targetSize = imageOutputConfig.getDefaultResolution((Size) null);
            }
            ArrayList arrayList2 = new ArrayList();
            new HashMap();
            if (targetAspectRatio == null) {
                arrayList2.addAll(arrayList);
                if (targetSize != null) {
                    removeSupportedSizesByTargetSize(arrayList2, targetSize);
                }
            } else {
                Map<Rational, List<Size>> groupSizesByAspectRatio = groupSizesByAspectRatio(arrayList);
                if (targetSize != null) {
                    for (Rational rational : groupSizesByAspectRatio.keySet()) {
                        removeSupportedSizesByTargetSize(groupSizesByAspectRatio.get(rational), targetSize);
                    }
                }
                ArrayList arrayList3 = new ArrayList(groupSizesByAspectRatio.keySet());
                Collections.sort(arrayList3, new CompareAspectRatiosByDistanceToTargetRatio(targetAspectRatio));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    for (Size size3 : groupSizesByAspectRatio.get((Rational) it.next())) {
                        if (!arrayList2.contains(size3)) {
                            arrayList2.add(size3);
                        }
                    }
                }
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Can not get supported output size under supported maximum for the format: ", inputFormat));
    }

    public SurfaceConfig transformSurfaceConfig(int i, Size size) {
        SurfaceConfig.ConfigType configType;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.NOT_SUPPORT;
        if (i == 35) {
            configType = SurfaceConfig.ConfigType.YUV;
        } else if (i == 256) {
            configType = SurfaceConfig.ConfigType.JPEG;
        } else if (i == 32) {
            configType = SurfaceConfig.ConfigType.RAW;
        } else {
            configType = SurfaceConfig.ConfigType.PRIV;
        }
        Size fetchMaxSize = fetchMaxSize(i);
        if (size.getHeight() * size.getWidth() <= this.mSurfaceSizeDefinition.getAnalysisSize().getHeight() * this.mSurfaceSizeDefinition.getAnalysisSize().getWidth()) {
            configSize = SurfaceConfig.ConfigSize.ANALYSIS;
        } else {
            if (size.getHeight() * size.getWidth() <= this.mSurfaceSizeDefinition.getPreviewSize().getHeight() * this.mSurfaceSizeDefinition.getPreviewSize().getWidth()) {
                configSize = SurfaceConfig.ConfigSize.PREVIEW;
            } else {
                if (size.getHeight() * size.getWidth() <= this.mSurfaceSizeDefinition.getRecordSize().getHeight() * this.mSurfaceSizeDefinition.getRecordSize().getWidth()) {
                    configSize = SurfaceConfig.ConfigSize.RECORD;
                } else {
                    if (size.getHeight() * size.getWidth() <= fetchMaxSize.getHeight() * fetchMaxSize.getWidth()) {
                        configSize = SurfaceConfig.ConfigSize.MAXIMUM;
                    }
                }
            }
        }
        return SurfaceConfig.create(configType, configSize);
    }
}
