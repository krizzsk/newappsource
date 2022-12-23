package com.veriff.sdk.camera.camera2.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;
import com.veriff.sdk.camera.core.CameraControl;
import com.veriff.sdk.camera.core.FocusMeteringAction;
import com.veriff.sdk.camera.core.FocusMeteringResult;
import com.veriff.sdk.camera.core.MeteringPoint;
import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CameraCaptureFailure;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import com.veriff.sdk.camera.core.impl.CameraControlInternal;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.TagBundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p695od.C18728c;

class FocusMeteringControl {
    private static final MeteringRectangle[] EMPTY_RECTANGLES = new MeteringRectangle[0];
    private MeteringRectangle[] mAeRects;
    private MeteringRectangle[] mAfRects;
    private ScheduledFuture<?> mAutoCancelHandle;
    private MeteringRectangle[] mAwbRects;
    private final Camera2CameraControlImpl mCameraControl;
    public Integer mCurrentAfState = 0;
    public final Executor mExecutor;
    public long mFocusTimeoutCounter = 0;
    private volatile boolean mIsActive = false;
    public boolean mIsAutoFocusCompleted = false;
    public boolean mIsFocusSuccessful = false;
    private boolean mIsInAfAutoMode = false;
    private volatile Rational mPreviewAspectRatio = null;
    public CallbackToFutureAdapter.C0673a<FocusMeteringResult> mRunningActionCompleter;
    public CallbackToFutureAdapter.C0673a<Void> mRunningCancelCompleter;
    private final ScheduledExecutorService mScheduler;
    private Camera2CameraControlImpl.CaptureResultListener mSessionListenerForCancel = null;
    private Camera2CameraControlImpl.CaptureResultListener mSessionListenerForFocus = null;
    private int mTemplate = 1;

    public FocusMeteringControl(Camera2CameraControlImpl camera2CameraControlImpl, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr;
        this.mAwbRects = meteringRectangleArr;
        this.mRunningActionCompleter = null;
        this.mRunningCancelCompleter = null;
        this.mCameraControl = camera2CameraControlImpl;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
    }

    private void completeActionFuture(boolean z) {
        CallbackToFutureAdapter.C0673a<FocusMeteringResult> aVar = this.mRunningActionCompleter;
        if (aVar != null) {
            aVar.mo2697b(FocusMeteringResult.create(z));
            this.mRunningActionCompleter = null;
        }
    }

    private void completeCancelFuture() {
        CallbackToFutureAdapter.C0673a<Void> aVar = this.mRunningCancelCompleter;
        if (aVar != null) {
            aVar.mo2697b(null);
            this.mRunningCancelCompleter = null;
        }
    }

    private void disableAutoCancel() {
        ScheduledFuture<?> scheduledFuture = this.mAutoCancelHandle;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.mAutoCancelHandle = null;
        }
    }

    private void executeMeteringAction(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, FocusMeteringAction focusMeteringAction) {
        long j;
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForFocus);
        disableAutoCancel();
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr2;
        this.mAwbRects = meteringRectangleArr3;
        if (shouldTriggerAF()) {
            this.mIsInAfAutoMode = true;
            this.mIsAutoFocusCompleted = false;
            this.mIsFocusSuccessful = false;
            j = this.mCameraControl.updateSessionConfigSynchronous();
            triggerAf((CallbackToFutureAdapter.C0673a<CameraCaptureResult>) null);
        } else {
            this.mIsInAfAutoMode = false;
            this.mIsAutoFocusCompleted = true;
            this.mIsFocusSuccessful = false;
            j = this.mCameraControl.updateSessionConfigSynchronous();
        }
        this.mCurrentAfState = 0;
        C12477v vVar = new C12477v(this, isAfModeSupported(), j);
        this.mSessionListenerForFocus = vVar;
        this.mCameraControl.addCaptureResultListener(vVar);
        if (focusMeteringAction.isAutoCancelEnabled()) {
            long j2 = this.mFocusTimeoutCounter + 1;
            this.mFocusTimeoutCounter = j2;
            this.mAutoCancelHandle = this.mScheduler.schedule(new C12478w(this, j2), focusMeteringAction.getAutoCancelDurationInMillis(), TimeUnit.MILLISECONDS);
        }
    }

    private void failActionFuture(String str) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForFocus);
        CallbackToFutureAdapter.C0673a<FocusMeteringResult> aVar = this.mRunningActionCompleter;
        if (aVar != null) {
            aVar.mo2698c(new CameraControl.OperationCanceledException(str));
            this.mRunningActionCompleter = null;
        }
    }

    private void failCancelFuture(String str) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForCancel);
        CallbackToFutureAdapter.C0673a<Void> aVar = this.mRunningCancelCompleter;
        if (aVar != null) {
            aVar.mo2698c(new CameraControl.OperationCanceledException(str));
            this.mRunningCancelCompleter = null;
        }
    }

    private Rational getDefaultAspectRatio() {
        if (this.mPreviewAspectRatio != null) {
            return this.mPreviewAspectRatio;
        }
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        return new Rational(cropSensorRegion.width(), cropSensorRegion.height());
    }

    private static PointF getFovAdjustedPoint(MeteringPoint meteringPoint, Rational rational, Rational rational2) {
        if (meteringPoint.getSurfaceAspectRatio() != null) {
            rational2 = meteringPoint.getSurfaceAspectRatio();
        }
        PointF pointF = new PointF(meteringPoint.getX(), meteringPoint.getY());
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointF.y = (1.0f / doubleValue) * (((float) ((((double) doubleValue) - 1.0d) / 2.0d)) + pointF.y);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                pointF.x = (1.0f / doubleValue2) * (((float) ((((double) doubleValue2) - 1.0d) / 2.0d)) + pointF.x);
            }
        }
        return pointF;
    }

    private static MeteringRectangle getMeteringRect(MeteringPoint meteringPoint, PointF pointF, Rect rect) {
        int width = (int) ((pointF.x * ((float) rect.width())) + ((float) rect.left));
        int height = (int) ((pointF.y * ((float) rect.height())) + ((float) rect.top));
        int size = ((int) (meteringPoint.getSize() * ((float) rect.width()))) / 2;
        int size2 = ((int) (meteringPoint.getSize() * ((float) rect.height()))) / 2;
        Rect rect2 = new Rect(width - size, height - size2, width + size, height + size2);
        rect2.left = rangeLimit(rect2.left, rect.right, rect.left);
        rect2.right = rangeLimit(rect2.right, rect.right, rect.left);
        rect2.top = rangeLimit(rect2.top, rect.bottom, rect.top);
        rect2.bottom = rangeLimit(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    private static List<MeteringRectangle> getMeteringRectangles(List<MeteringPoint> list, int i, Rational rational, Rect rect) {
        if (list.isEmpty() || i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (MeteringPoint next : list) {
            if (arrayList.size() == i) {
                break;
            } else if (isValid(next)) {
                MeteringRectangle meteringRect = getMeteringRect(next, getFovAdjustedPoint(next, rational2, rational), rect);
                if (!(meteringRect.getWidth() == 0 || meteringRect.getHeight() == 0)) {
                    arrayList.add(meteringRect);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean isAfModeSupported() {
        return this.mCameraControl.getSupportedAfMode(1) == 1;
    }

    private static boolean isSessionUpdated(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        if (!(tag instanceof TagBundle) || (l = (Long) ((TagBundle) tag).getTag("CameraControlSessionUpdateId")) == null || l.longValue() < j) {
            return false;
        }
        return true;
    }

    private static boolean isValid(MeteringPoint meteringPoint) {
        return meteringPoint.getX() >= BitmapDescriptorFactory.HUE_RED && meteringPoint.getX() <= 1.0f && meteringPoint.getY() >= BitmapDescriptorFactory.HUE_RED && meteringPoint.getY() <= 1.0f;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$cancelFocusAndMeteringInternal$7(int i, long j, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i || !isSessionUpdated(totalCaptureResult, j)) {
            return false;
        }
        completeCancelFuture();
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$executeMeteringAction$2(boolean z, long j, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (shouldTriggerAF()) {
            if (!z || num == null) {
                this.mIsFocusSuccessful = true;
                this.mIsAutoFocusCompleted = true;
            } else if (this.mCurrentAfState.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.mIsFocusSuccessful = true;
                    this.mIsAutoFocusCompleted = true;
                } else if (num.intValue() == 5) {
                    this.mIsFocusSuccessful = false;
                    this.mIsAutoFocusCompleted = true;
                }
            }
        }
        if (!this.mIsAutoFocusCompleted || !isSessionUpdated(totalCaptureResult, j)) {
            if (!this.mCurrentAfState.equals(num) && num != null) {
                this.mCurrentAfState = num;
            }
            return false;
        }
        completeActionFuture(this.mIsFocusSuccessful);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$3(long j) {
        if (j == this.mFocusTimeoutCounter) {
            cancelFocusAndMeteringWithoutAsyncResult();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$4(long j) {
        this.mExecutor.execute(new C12479x(this, j));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$startFocusAndMetering$1(FocusMeteringAction focusMeteringAction, CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mExecutor.execute(new C12476u(aVar, this, focusMeteringAction));
        return "startFocusAndMetering";
    }

    private static int rangeLimit(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    private boolean shouldTriggerAF() {
        return this.mAfRects.length > 0;
    }

    public void addFocusMeteringOptions(Camera2ImplConfig.Builder builder) {
        int i;
        if (this.mIsInAfAutoMode) {
            i = 1;
        } else {
            i = getDefaultAfMode();
        }
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.mCameraControl.getSupportedAfMode(i)));
        MeteringRectangle[] meteringRectangleArr = this.mAfRects;
        if (meteringRectangleArr.length != 0) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.mAeRects;
        if (meteringRectangleArr2.length != 0) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.mAwbRects;
        if (meteringRectangleArr3.length != 0) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    public void cancelAfAeTrigger(boolean z, boolean z2) {
        if (this.mIsActive) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setUseRepeatingSurface(true);
            builder.setTemplateType(this.mTemplate);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            if (z) {
                builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (Build.VERSION.SDK_INT >= 23 && z2) {
                builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            builder.addImplementationOptions(builder2.build());
            this.mCameraControl.lambda$submitCaptureRequests$8(Collections.singletonList(builder.build()));
        }
    }

    public void cancelFocusAndMeteringInternal(CallbackToFutureAdapter.C0673a<Void> aVar) {
        failCancelFuture("Cancelled by another cancelFocusAndMetering()");
        failActionFuture("Cancelled by cancelFocusAndMetering()");
        this.mRunningCancelCompleter = aVar;
        disableAutoCancel();
        if (shouldTriggerAF()) {
            cancelAfAeTrigger(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr;
        this.mAwbRects = meteringRectangleArr;
        this.mIsInAfAutoMode = false;
        long updateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
        if (this.mRunningCancelCompleter != null) {
            C12481z zVar = new C12481z(this, this.mCameraControl.getSupportedAfMode(getDefaultAfMode()), updateSessionConfigSynchronous);
            this.mSessionListenerForCancel = zVar;
            this.mCameraControl.addCaptureResultListener(zVar);
        }
    }

    public void cancelFocusAndMeteringWithoutAsyncResult() {
        cancelFocusAndMeteringInternal((CallbackToFutureAdapter.C0673a<Void>) null);
    }

    public int getDefaultAfMode() {
        return this.mTemplate != 3 ? 4 : 3;
    }

    public void setActive(boolean z) {
        if (z != this.mIsActive) {
            this.mIsActive = z;
            if (!this.mIsActive) {
                cancelFocusAndMeteringWithoutAsyncResult();
            }
        }
    }

    public void setPreviewAspectRatio(Rational rational) {
        this.mPreviewAspectRatio = rational;
    }

    public void setTemplate(int i) {
        this.mTemplate = i;
    }

    public C18728c<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        return CallbackToFutureAdapter.m1884a(new C12480y(this, focusMeteringAction));
    }

    /* renamed from: startFocusAndMeteringInternal */
    public void lambda$startFocusAndMetering$0(CallbackToFutureAdapter.C0673a<FocusMeteringResult> aVar, FocusMeteringAction focusMeteringAction) {
        if (!this.mIsActive) {
            aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        Rational defaultAspectRatio = getDefaultAspectRatio();
        List<MeteringRectangle> meteringRectangles = getMeteringRectangles(focusMeteringAction.getMeteringPointsAf(), this.mCameraControl.getMaxAfRegionCount(), defaultAspectRatio, cropSensorRegion);
        List<MeteringRectangle> meteringRectangles2 = getMeteringRectangles(focusMeteringAction.getMeteringPointsAe(), this.mCameraControl.getMaxAeRegionCount(), defaultAspectRatio, cropSensorRegion);
        List<MeteringRectangle> meteringRectangles3 = getMeteringRectangles(focusMeteringAction.getMeteringPointsAwb(), this.mCameraControl.getMaxAwbRegionCount(), defaultAspectRatio, cropSensorRegion);
        if (!meteringRectangles.isEmpty() || !meteringRectangles2.isEmpty() || !meteringRectangles3.isEmpty()) {
            failActionFuture("Cancelled by another startFocusAndMetering()");
            failCancelFuture("Cancelled by another startFocusAndMetering()");
            disableAutoCancel();
            this.mRunningActionCompleter = aVar;
            MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
            executeMeteringAction((MeteringRectangle[]) meteringRectangles.toArray(meteringRectangleArr), (MeteringRectangle[]) meteringRectangles2.toArray(meteringRectangleArr), (MeteringRectangle[]) meteringRectangles3.toArray(meteringRectangleArr), focusMeteringAction);
            return;
        }
        aVar.mo2698c(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
    }

    public void triggerAePrecapture(final CallbackToFutureAdapter.C0673a<CameraCaptureResult> aVar) {
        if (this.mIsActive) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mTemplate);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            builder.addImplementationOptions(builder2.build());
            builder.addCameraCaptureCallback(new CameraCaptureCallback(this) {
                public void onCaptureCancelled() {
                    CallbackToFutureAdapter.C0673a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is closed"));
                    }
                }

                public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                    CallbackToFutureAdapter.C0673a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo2697b(cameraCaptureResult);
                    }
                }

                public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
                    CallbackToFutureAdapter.C0673a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo2698c(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
                    }
                }
            });
            this.mCameraControl.lambda$submitCaptureRequests$8(Collections.singletonList(builder.build()));
        } else if (aVar != null) {
            aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is not active."));
        }
    }

    public void triggerAf(final CallbackToFutureAdapter.C0673a<CameraCaptureResult> aVar) {
        if (this.mIsActive) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mTemplate);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            builder.addImplementationOptions(builder2.build());
            builder.addCameraCaptureCallback(new CameraCaptureCallback(this) {
                public void onCaptureCancelled() {
                    CallbackToFutureAdapter.C0673a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is closed"));
                    }
                }

                public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                    CallbackToFutureAdapter.C0673a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo2697b(cameraCaptureResult);
                    }
                }

                public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
                    CallbackToFutureAdapter.C0673a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo2698c(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
                    }
                }
            });
            this.mCameraControl.lambda$submitCaptureRequests$8(Collections.singletonList(builder.build()));
        } else if (aVar != null) {
            aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is not active."));
        }
    }
}
