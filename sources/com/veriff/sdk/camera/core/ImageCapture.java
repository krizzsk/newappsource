package com.veriff.sdk.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Rational;
import android.util.Size;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.veriff.sdk.camera.core.ForwardingImageProxy;
import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CameraCaptureFailure;
import com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$AeState;
import com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$AfMode;
import com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$AfState;
import com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$AwbState;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import com.veriff.sdk.camera.core.impl.CameraControlInternal;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.CaptureBundle;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.CaptureProcessor;
import com.veriff.sdk.camera.core.impl.CaptureStage;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.ImageCaptureConfig;
import com.veriff.sdk.camera.core.impl.ImageInputConfig;
import com.veriff.sdk.camera.core.impl.ImageOutputConfig;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;
import com.veriff.sdk.camera.core.impl.ImmediateSurface;
import com.veriff.sdk.camera.core.impl.MutableConfig;
import com.veriff.sdk.camera.core.impl.MutableOptionsBundle;
import com.veriff.sdk.camera.core.impl.OptionsBundle;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfigFactory;
import com.veriff.sdk.camera.core.impl.utils.Exif;
import com.veriff.sdk.camera.core.impl.utils.Threads;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureChain;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import com.veriff.sdk.camera.core.internal.IoConfig;
import com.veriff.sdk.camera.core.internal.TargetConfig;
import com.veriff.sdk.camera.core.internal.YuvToJpegProcessor;
import com.veriff.sdk.camera.core.internal.compat.quirk.DeviceQuirks;
import com.veriff.sdk.camera.core.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import com.veriff.sdk.camera.core.internal.compat.workaround.ExifRotationAvailability;
import com.veriff.sdk.camera.core.internal.utils.ImageUtil;
import fd0.C12685f;
import fd0.C12690k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24361g;
import p001a0.C0016g;
import p145k5.C5485d;
import p217q2.C6147b;
import p304x.C7042e0;
import p304x.C7067k;
import p304x.C7078n;
import p304x.C7096q1;
import p358af.C13437d;
import p638lr.C18262i;
import p695od.C18728c;
import p977zz.C20953n;

public final class ImageCapture extends UseCase {
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private CaptureBundle mCaptureBundle;
    private CaptureConfig mCaptureConfig;
    private final int mCaptureMode;
    private CaptureProcessor mCaptureProcessor;
    private final ImageReaderProxy.OnImageAvailableListener mClosingListener = new C13437d();
    private Rational mCropAspectRatio = null;
    private DeferrableSurface mDeferrableSurface;
    private final boolean mEnableCheck3AConverged;
    private ExecutorService mExecutor;
    private int mFlashMode = -1;
    private ImageCaptureRequestProcessor mImageCaptureRequestProcessor;
    public SafeCloseImageReaderProxy mImageReader;
    public final Executor mIoExecutor;
    private final AtomicReference<Integer> mLockedFlashMode = new AtomicReference<>((Object) null);
    private int mMaxCaptureStages;
    private CameraCaptureCallback mMetadataMatchingCaptureCallback;
    public ProcessingImageReader mProcessingImageReader;
    public final Executor mSequentialIoExecutor;
    private final CaptureCallbackChecker mSessionCallbackChecker = new CaptureCallbackChecker();
    public SessionConfig.Builder mSessionConfigBuilder;
    private boolean mUseSoftwareJpeg;
    private final boolean mUseTorchFlash;

    public static final class Builder implements UseCaseConfig.Builder<ImageCapture, ImageCaptureConfig, Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        public ImageCapture build() {
            int intValue;
            boolean z;
            if (getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, null) == null || getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null) == null) {
                Integer num = (Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
                boolean z2 = false;
                if (num != null) {
                    if (getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C24361g.m61177o(z, "Cannot set buffer format with CaptureProcessor defined.");
                    getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, num);
                } else if (getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) != null) {
                    getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
                } else {
                    getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
                }
                ImageCapture imageCapture = new ImageCapture(getUseCaseConfig());
                Size size = (Size) getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null);
                if (size != null) {
                    imageCapture.setCropAspectRatio(new Rational(size.getWidth(), size.getHeight()));
                }
                if (((Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES, 2)).intValue() >= 1) {
                    z2 = true;
                }
                C24361g.m61177o(z2, "Maximum outstanding image count must be at least 1");
                C24361g.m61185s((Executor) getMutableConfig().retrieveOption(IoConfig.OPTION_IO_EXECUTOR, CameraXExecutors.ioExecutor()), "The IO executor can't be null");
                MutableConfig mutableConfig = getMutableConfig();
                Config.Option<Integer> option = ImageCaptureConfig.OPTION_FLASH_MODE;
                if (!mutableConfig.containsOption(option) || (intValue = ((Integer) getMutableConfig().retrieveOption(option)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                    return imageCapture;
                }
                throw new IllegalArgumentException(C16759e.m42349e("The flash mode is not allowed to set: ", intValue));
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public Builder setCaptureMode(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE, Integer.valueOf(i));
            return this;
        }

        public Builder setFlashMode(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_MODE, Integer.valueOf(i));
            return this;
        }

        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetAspectRatio(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetClass(Class<ImageCapture> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            Class<ImageCapture> cls = ImageCapture.class;
            this.mMutableConfig = mutableOptionsBundle;
            Class cls2 = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls2 == null || cls2.equals(cls)) {
                setTargetClass(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        public ImageCaptureConfig getUseCaseConfig() {
            return new ImageCaptureConfig(OptionsBundle.from(this.mMutableConfig));
        }
    }

    public static final class CaptureCallbackChecker extends CameraCaptureCallback {
        private final Set<CaptureResultListener> mCaptureResultListeners = new HashSet();

        public interface CaptureResultChecker<T> {
            T check(CameraCaptureResult cameraCaptureResult);
        }

        public interface CaptureResultListener {
            boolean onCaptureResult(CameraCaptureResult cameraCaptureResult);
        }

        private void deliverCaptureResultToListeners(CameraCaptureResult cameraCaptureResult) {
            synchronized (this.mCaptureResultListeners) {
                HashSet hashSet = null;
                Iterator it = new HashSet(this.mCaptureResultListeners).iterator();
                while (it.hasNext()) {
                    CaptureResultListener captureResultListener = (CaptureResultListener) it.next();
                    if (captureResultListener.onCaptureResult(cameraCaptureResult)) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(captureResultListener);
                    }
                }
                if (hashSet != null) {
                    this.mCaptureResultListeners.removeAll(hashSet);
                }
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object lambda$checkCaptureResult$0(CaptureResultChecker captureResultChecker, long j, long j2, Object obj, CallbackToFutureAdapter.C0673a aVar) throws Exception {
            final CaptureResultChecker captureResultChecker2 = captureResultChecker;
            final CallbackToFutureAdapter.C0673a aVar2 = aVar;
            final long j3 = j;
            final long j4 = j2;
            final Object obj2 = obj;
            addListener(new CaptureResultListener(this) {
                public boolean onCaptureResult(CameraCaptureResult cameraCaptureResult) {
                    Object check = captureResultChecker2.check(cameraCaptureResult);
                    if (check != null) {
                        aVar2.mo2697b(check);
                        return true;
                    } else if (j3 <= 0 || SystemClock.elapsedRealtime() - j3 <= j4) {
                        return false;
                    } else {
                        aVar2.mo2697b(obj2);
                        return true;
                    }
                }
            });
            return "checkCaptureResult";
        }

        public void addListener(CaptureResultListener captureResultListener) {
            synchronized (this.mCaptureResultListeners) {
                this.mCaptureResultListeners.add(captureResultListener);
            }
        }

        public <T> C18728c<T> checkCaptureResult(CaptureResultChecker<T> captureResultChecker) {
            return checkCaptureResult(captureResultChecker, 0, (Object) null);
        }

        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            deliverCaptureResultToListeners(cameraCaptureResult);
        }

        public <T> C18728c<T> checkCaptureResult(CaptureResultChecker<T> captureResultChecker, long j, T t) {
            long j2 = 0;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i >= 0) {
                if (i != 0) {
                    j2 = SystemClock.elapsedRealtime();
                }
                return CallbackToFutureAdapter.m1884a(new C12511b0(this, captureResultChecker, j2, j, t));
            }
            throw new IllegalArgumentException(C0016g.m29l("Invalid timeout value: ", j));
        }
    }

    public static final class CaptureFailedException extends RuntimeException {
        public CaptureFailedException(String str) {
            super(str);
        }
    }

    public static final class Defaults {
        private static final ImageCaptureConfig DEFAULT_CONFIG = new Builder().setSurfaceOccupancyPriority(4).setTargetAspectRatio(0).getUseCaseConfig();

        public ImageCaptureConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    public static class ImageCaptureRequest {
        private final OnImageCapturedCallback mCallback;
        public AtomicBoolean mDispatched = new AtomicBoolean(false);
        public final int mJpegQuality;
        private final Executor mListenerExecutor;
        public final int mRotationDegrees;
        private final Rational mTargetRatio;
        private final Rect mViewPortCropRect;

        public ImageCaptureRequest(int i, int i2, Rational rational, Rect rect, Executor executor, OnImageCapturedCallback onImageCapturedCallback) {
            boolean z = false;
            this.mRotationDegrees = i;
            this.mJpegQuality = i2;
            if (rational != null) {
                C24361g.m61177o(!rational.isZero(), "Target ratio cannot be zero");
                C24361g.m61177o(rational.floatValue() > BitmapDescriptorFactory.HUE_RED ? true : z, "Target ratio must be positive");
            }
            this.mTargetRatio = rational;
            this.mViewPortCropRect = rect;
            this.mListenerExecutor = executor;
            this.mCallback = onImageCapturedCallback;
        }

        public static Rect getDispatchCropRect(Rect rect, int i, Size size, int i2) {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) (i2 - i));
            float[] sizeToVertexes = ImageUtil.sizeToVertexes(size);
            matrix.mapPoints(sizeToVertexes);
            matrix.postTranslate(-ImageUtil.min(sizeToVertexes[0], sizeToVertexes[2], sizeToVertexes[4], sizeToVertexes[6]), -ImageUtil.min(sizeToVertexes[1], sizeToVertexes[3], sizeToVertexes[5], sizeToVertexes[7]));
            matrix.invert(matrix);
            RectF rectF = new RectF();
            matrix.mapRect(rectF, new RectF(rect));
            rectF.sort();
            Rect rect2 = new Rect();
            rectF.round(rect2);
            return rect2;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$dispatchImage$0(ImageProxy imageProxy) {
            this.mCallback.onCaptureSuccess(imageProxy);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$notifyCallbackError$1(int i, String str, Throwable th) {
            this.mCallback.onError(new ImageCaptureException(i, str, th));
        }

        public void dispatchImage(ImageProxy imageProxy) {
            int i;
            Size size;
            if (!this.mDispatched.compareAndSet(false, true)) {
                imageProxy.close();
                return;
            }
            if (new ExifRotationAvailability().shouldUseExifOrientation(imageProxy)) {
                try {
                    ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
                    buffer.rewind();
                    byte[] bArr = new byte[buffer.capacity()];
                    buffer.get(bArr);
                    Exif createFromInputStream = Exif.createFromInputStream(new ByteArrayInputStream(bArr));
                    buffer.rewind();
                    size = new Size(createFromInputStream.getWidth(), createFromInputStream.getHeight());
                    i = createFromInputStream.getRotation();
                } catch (IOException e) {
                    notifyCallbackError(1, "Unable to parse JPEG exif", e);
                    imageProxy.close();
                    return;
                }
            } else {
                size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
                i = this.mRotationDegrees;
            }
            SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy, size, ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), i));
            Rect rect = this.mViewPortCropRect;
            if (rect != null) {
                settableImageProxy.setCropRect(getDispatchCropRect(rect, this.mRotationDegrees, size, i));
            } else {
                Rational rational = this.mTargetRatio;
                if (rational != null) {
                    if (i % 180 != 0) {
                        rational = new Rational(this.mTargetRatio.getDenominator(), this.mTargetRatio.getNumerator());
                    }
                    Size size2 = new Size(settableImageProxy.getWidth(), settableImageProxy.getHeight());
                    if (ImageUtil.isAspectRatioValid(size2, rational)) {
                        settableImageProxy.setCropRect(ImageUtil.computeCropRectFromAspectRatio(size2, rational));
                    }
                }
            }
            try {
                this.mListenerExecutor.execute(new C12569s(1, this, settableImageProxy));
            } catch (RejectedExecutionException unused) {
                Logger.m32241e("ImageCapture", "Unable to post to the supplied executor.");
                imageProxy.close();
            }
        }

        public void notifyCallbackError(int i, String str, Throwable th) {
            if (this.mDispatched.compareAndSet(false, true)) {
                try {
                    this.mListenerExecutor.execute(new C12513c0(this, i, str, th));
                } catch (RejectedExecutionException unused) {
                    Logger.m32241e("ImageCapture", "Unable to post to the supplied executor.");
                }
            }
        }
    }

    public static class ImageCaptureRequestProcessor implements ForwardingImageProxy.OnImageCloseListener {
        public ImageCaptureRequest mCurrentRequest = null;
        public C18728c<ImageProxy> mCurrentRequestFuture = null;
        private final ImageCaptor mImageCaptor;
        public final Object mLock = new Object();
        private final int mMaxImages;
        public int mOutstandingImages = 0;
        private final Deque<ImageCaptureRequest> mPendingRequests = new ArrayDeque();

        public interface ImageCaptor {
        }

        public ImageCaptureRequestProcessor(int i, ImageCaptor imageCaptor) {
            this.mMaxImages = i;
            this.mImageCaptor = imageCaptor;
        }

        public void cancelRequests(Throwable th) {
            ImageCaptureRequest imageCaptureRequest;
            C18728c<ImageProxy> cVar;
            ArrayList arrayList;
            synchronized (this.mLock) {
                imageCaptureRequest = this.mCurrentRequest;
                this.mCurrentRequest = null;
                cVar = this.mCurrentRequestFuture;
                this.mCurrentRequestFuture = null;
                arrayList = new ArrayList(this.mPendingRequests);
                this.mPendingRequests.clear();
            }
            if (!(imageCaptureRequest == null || cVar == null)) {
                imageCaptureRequest.notifyCallbackError(ImageCapture.getError(th), th.getMessage(), th);
                cVar.cancel(true);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ImageCaptureRequest) it.next()).notifyCallbackError(ImageCapture.getError(th), th.getMessage(), th);
            }
        }

        public void onImageClose(ImageProxy imageProxy) {
            synchronized (this.mLock) {
                this.mOutstandingImages--;
                processNextRequest();
            }
        }

        public void processNextRequest() {
            synchronized (this.mLock) {
                if (this.mCurrentRequest == null) {
                    if (this.mOutstandingImages >= this.mMaxImages) {
                        Logger.m32245w("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                        return;
                    }
                    final ImageCaptureRequest poll = this.mPendingRequests.poll();
                    if (poll != null) {
                        this.mCurrentRequest = poll;
                        C18728c<ImageProxy> a = ((C12570t) this.mImageCaptor).mo39267a(poll);
                        this.mCurrentRequestFuture = a;
                        Futures.addCallback(a, new FutureCallback<ImageProxy>() {
                            public void onFailure(Throwable th) {
                                String str;
                                synchronized (ImageCaptureRequestProcessor.this.mLock) {
                                    if (!(th instanceof CancellationException)) {
                                        ImageCaptureRequest imageCaptureRequest = poll;
                                        int error = ImageCapture.getError(th);
                                        if (th != null) {
                                            str = th.getMessage();
                                        } else {
                                            str = "Unknown error";
                                        }
                                        imageCaptureRequest.notifyCallbackError(error, str, th);
                                    }
                                    ImageCaptureRequestProcessor imageCaptureRequestProcessor = ImageCaptureRequestProcessor.this;
                                    imageCaptureRequestProcessor.mCurrentRequest = null;
                                    imageCaptureRequestProcessor.mCurrentRequestFuture = null;
                                    imageCaptureRequestProcessor.processNextRequest();
                                }
                            }

                            public void onSuccess(ImageProxy imageProxy) {
                                synchronized (ImageCaptureRequestProcessor.this.mLock) {
                                    imageProxy.getClass();
                                    SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxy);
                                    singleCloseImageProxy.addOnImageCloseListener(ImageCaptureRequestProcessor.this);
                                    ImageCaptureRequestProcessor.this.mOutstandingImages++;
                                    poll.dispatchImage(singleCloseImageProxy);
                                    ImageCaptureRequestProcessor imageCaptureRequestProcessor = ImageCaptureRequestProcessor.this;
                                    imageCaptureRequestProcessor.mCurrentRequest = null;
                                    imageCaptureRequestProcessor.mCurrentRequestFuture = null;
                                    imageCaptureRequestProcessor.processNextRequest();
                                }
                            }
                        }, CameraXExecutors.directExecutor());
                    }
                }
            }
        }

        public void sendRequest(ImageCaptureRequest imageCaptureRequest) {
            int i;
            synchronized (this.mLock) {
                this.mPendingRequests.offer(imageCaptureRequest);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                if (this.mCurrentRequest != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(this.mPendingRequests.size());
                Logger.m32239d("ImageCapture", String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                processNextRequest();
            }
        }
    }

    public static abstract class OnImageCapturedCallback {
        public abstract void onCaptureSuccess(ImageProxy imageProxy);

        public abstract void onError(ImageCaptureException imageCaptureException);
    }

    public static final class TakePictureState {
        public boolean mIsAePrecaptureTriggered = false;
        public boolean mIsAfTriggered = false;
        public boolean mIsTorchOpened = false;
        public CameraCaptureResult mPreCaptureState = CameraCaptureResult.EmptyCameraCaptureResult.create();
    }

    public ImageCapture(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        boolean z = false;
        this.mUseSoftwareJpeg = false;
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) getCurrentConfig();
        Config.Option<Integer> option = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        imageCaptureConfig2.getClass();
        if (C12690k.m32418a(imageCaptureConfig2, option)) {
            this.mCaptureMode = imageCaptureConfig2.getCaptureMode();
        } else {
            this.mCaptureMode = 1;
        }
        Executor ioExecutor = imageCaptureConfig2.getIoExecutor(CameraXExecutors.ioExecutor());
        ioExecutor.getClass();
        this.mIoExecutor = ioExecutor;
        this.mSequentialIoExecutor = CameraXExecutors.newSequentialExecutor(ioExecutor);
        if (this.mCaptureMode == 0) {
            this.mEnableCheck3AConverged = true;
        } else {
            this.mEnableCheck3AConverged = false;
        }
        z = DeviceQuirks.get(ImageCaptureWashedOutImageQuirk.class) != null ? true : z;
        this.mUseTorchFlash = z;
        if (z) {
            Logger.m32239d("ImageCapture", "Open and close torch to replace the flash fired by flash mode.");
        }
    }

    private void abortImageCaptureRequests() {
        this.mImageCaptureRequestProcessor.cancelRequests(new CameraClosedException("Camera is closed."));
    }

    private void closeTorch(TakePictureState takePictureState) {
        if (takePictureState.mIsTorchOpened) {
            CameraControlInternal cameraControl = getCameraControl();
            takePictureState.mIsTorchOpened = false;
            cameraControl.enableTorch(false).addListener(new C7067k(5), CameraXExecutors.directExecutor());
        }
    }

    public static boolean enforceSoftwareJpegConstraints(MutableConfig mutableConfig) {
        Config.Option<Boolean> option = ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
        Boolean bool = Boolean.FALSE;
        boolean z = false;
        if (((Boolean) mutableConfig.retrieveOption(option, bool)).booleanValue()) {
            boolean z2 = true;
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                Logger.m32245w("ImageCapture", "Software JPEG only supported on API 26+, but current API level is " + i);
                z2 = false;
            }
            Integer num = (Integer) mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num == null || num.intValue() == 256) {
                z = z2;
            } else {
                Logger.m32245w("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                Logger.m32245w("ImageCapture", "Unable to support software JPEG. Disabling.");
                mutableConfig.insertOption(option, bool);
            }
        }
        return z;
    }

    private CaptureBundle getCaptureBundle(CaptureBundle captureBundle) {
        List<CaptureStage> captureStages = this.mCaptureBundle.getCaptureStages();
        if (captureStages == null || captureStages.isEmpty()) {
            return captureBundle;
        }
        return CaptureBundles.createCaptureBundle(captureStages);
    }

    public static int getError(Throwable th) {
        if (th instanceof CameraClosedException) {
            return 3;
        }
        if (th instanceof CaptureFailedException) {
            return 2;
        }
        return 0;
    }

    private int getJpegQuality() {
        int i = this.mCaptureMode;
        if (i == 0) {
            return 100;
        }
        if (i == 1) {
            return 95;
        }
        throw new IllegalStateException(C13437d.m33707l(C13555b.m33972k("CaptureMode "), this.mCaptureMode, " is invalid"));
    }

    private C18728c<CameraCaptureResult> getPreCaptureStateIfNeeded() {
        if (this.mEnableCheck3AConverged || getFlashMode() == 0) {
            return this.mSessionCallbackChecker.checkCaptureResult(new CaptureCallbackChecker.CaptureResultChecker<CameraCaptureResult>(this) {
                public CameraCaptureResult check(CameraCaptureResult cameraCaptureResult) {
                    if (Logger.isDebugEnabled("ImageCapture")) {
                        StringBuilder k = C13555b.m33972k("preCaptureState, AE=");
                        k.append(cameraCaptureResult.getAeState());
                        k.append(" AF =");
                        k.append(cameraCaptureResult.getAfState());
                        k.append(" AWB=");
                        k.append(cameraCaptureResult.getAwbState());
                        Logger.m32239d("ImageCapture", k.toString());
                    }
                    return cameraCaptureResult;
                }
            });
        }
        return Futures.immediateFuture(null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$closeTorch$16() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$createPipeline$1(YuvToJpegProcessor yuvToJpegProcessor, CaptureProcessorPipeline captureProcessorPipeline) {
        if (Build.VERSION.SDK_INT >= 26) {
            yuvToJpegProcessor.close();
            captureProcessorPipeline.close();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createPipeline$3(String str, ImageCaptureConfig imageCaptureConfig, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        clearPipeline();
        if (isCurrentCamera(str)) {
            SessionConfig.Builder createPipeline = createPipeline(str, imageCaptureConfig, size);
            this.mSessionConfigBuilder = createPipeline;
            updateSessionConfig(createPipeline.build());
            notifyReset();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$issueTakePicture$19(CaptureConfig.Builder builder, List list, CaptureStage captureStage, final CallbackToFutureAdapter.C0673a aVar) throws Exception {
        builder.addCameraCaptureCallback(new CameraCaptureCallback(this) {
            public void onCaptureCancelled() {
                aVar.mo2698c(new CameraClosedException("Capture request is cancelled because camera is closed"));
            }

            public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                aVar.mo2697b(null);
            }

            public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
                StringBuilder k = C13555b.m33972k("Capture request failed with reason ");
                k.append(cameraCaptureFailure.getReason());
                aVar.mo2698c(new CaptureFailedException(k.toString()));
            }
        });
        list.add(builder.build());
        return "issueTakePicture[stage=" + captureStage.getId() + "]";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void lambda$issueTakePicture$20(List list) {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        ImageProxy acquireLatestImage;
        try {
            acquireLatestImage = imageReaderProxy.acquireLatestImage();
            Objects.toString(acquireLatestImage);
            if (acquireLatestImage != null) {
                acquireLatestImage.close();
                return;
            }
            return;
        } catch (IllegalStateException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$openTorch$15(TakePictureState takePictureState, CallbackToFutureAdapter.C0673a aVar) throws Exception {
        CameraControlInternal cameraControl = getCameraControl();
        takePictureState.mIsTorchOpened = true;
        cameraControl.enableTorch(true).addListener(new C12568r(aVar), CameraXExecutors.directExecutor());
        return "openTorch";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C18728c lambda$preTakePicture$11(TakePictureState takePictureState, CameraCaptureResult cameraCaptureResult) throws Exception {
        takePictureState.mPreCaptureState = cameraCaptureResult;
        triggerAfIfNeeded(takePictureState);
        if (!isFlashRequired(takePictureState)) {
            return Futures.immediateFuture(null);
        }
        if (this.mUseTorchFlash) {
            return openTorch(takePictureState);
        }
        return triggerAePrecapture(takePictureState);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C18728c lambda$preTakePicture$12(TakePictureState takePictureState, Void voidR) throws Exception {
        return check3AConverged(takePictureState);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void lambda$preTakePicture$13(Boolean bool) {
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$sendImageCaptureRequest$6(OnImageCapturedCallback onImageCapturedCallback) {
        onImageCapturedCallback.onError(new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", (Throwable) null));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$takePictureInternal$10(ImageCaptureRequest imageCaptureRequest, final CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mImageReader.setOnImageAvailableListener(new C12574x(aVar), CameraXExecutors.mainThreadExecutor());
        final TakePictureState takePictureState = new TakePictureState();
        FutureChain<T> transformAsync = FutureChain.from(preTakePicture(takePictureState)).transformAsync(new C12575y(this, imageCaptureRequest), this.mExecutor);
        Futures.addCallback(transformAsync, new FutureCallback<Void>() {
            public void onFailure(Throwable th) {
                ImageCapture.this.postTakePicture(takePictureState);
                aVar.mo2698c(th);
            }

            public void onSuccess(Void voidR) {
                ImageCapture.this.postTakePicture(takePictureState);
            }
        }, this.mExecutor);
        aVar.mo2696a(new C12567q(transformAsync, 2), CameraXExecutors.directExecutor());
        return "takePictureInternal";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$takePictureInternal$7(CallbackToFutureAdapter.C0673a aVar, ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage == null) {
                aVar.mo2698c(new IllegalStateException("Unable to acquire image"));
            } else if (!aVar.mo2697b(acquireLatestImage)) {
                acquireLatestImage.close();
            }
        } catch (IllegalStateException e) {
            aVar.mo2698c(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C18728c lambda$takePictureInternal$8(ImageCaptureRequest imageCaptureRequest, Void voidR) throws Exception {
        return issueTakePicture(imageCaptureRequest);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void lambda$triggerAePrecapture$18(CameraCaptureResult cameraCaptureResult) {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$triggerAf$17() {
    }

    private void lockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            if (this.mLockedFlashMode.get() == null) {
                this.mLockedFlashMode.set(Integer.valueOf(getFlashMode()));
            }
        }
    }

    private C18728c<Void> openTorch(TakePictureState takePictureState) {
        CameraInternal camera = getCamera();
        if (camera != null && camera.getCameraInfo().getTorchState().getValue().intValue() == 1) {
            return Futures.immediateFuture(null);
        }
        Logger.m32239d("ImageCapture", "openTorch");
        return CallbackToFutureAdapter.m1884a(new C12573w(this, takePictureState, 1));
    }

    private C18728c<Void> preTakePicture(TakePictureState takePictureState) {
        lockFlashMode();
        return FutureChain.from(getPreCaptureStateIfNeeded()).transformAsync(new C12576z(this, takePictureState), this.mExecutor).transformAsync(new C12509a0(this, takePictureState), this.mExecutor).transform(new C7042e0(3), this.mExecutor);
    }

    private void sendImageCaptureRequest(Executor executor, OnImageCapturedCallback onImageCapturedCallback) {
        CameraInternal camera = getCamera();
        if (camera == null) {
            executor.execute(new C7078n(15, this, onImageCapturedCallback));
        } else {
            this.mImageCaptureRequestProcessor.sendRequest(new ImageCaptureRequest(getRelativeRotation(camera), getJpegQuality(), this.mCropAspectRatio, getViewPortCropRect(), executor, onImageCapturedCallback));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: takePictureInternal */
    public C18728c<ImageProxy> lambda$createPipeline$2(ImageCaptureRequest imageCaptureRequest) {
        return CallbackToFutureAdapter.m1884a(new C12573w(this, imageCaptureRequest, 0));
    }

    private void triggerAf(TakePictureState takePictureState) {
        Logger.m32239d("ImageCapture", "triggerAf");
        takePictureState.mIsAfTriggered = true;
        getCameraControl().triggerAf().addListener(new C20953n(1), CameraXExecutors.directExecutor());
    }

    private void trySetFlashModeToCameraControl() {
        synchronized (this.mLockedFlashMode) {
            if (this.mLockedFlashMode.get() == null) {
                getCameraControl().setFlashMode(getFlashMode());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void unlockFlashMode() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.mLockedFlashMode
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.mLockedFlashMode     // Catch:{ all -> 0x001f }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x001f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x0010:
            int r1 = r1.intValue()     // Catch:{ all -> 0x001f }
            int r2 = r3.getFlashMode()     // Catch:{ all -> 0x001f }
            if (r1 == r2) goto L_0x001d
            r3.trySetFlashModeToCameraControl()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.ImageCapture.unlockFlashMode():void");
    }

    public void cancelAfAeTrigger(TakePictureState takePictureState) {
        if (takePictureState.mIsAfTriggered || takePictureState.mIsAePrecaptureTriggered) {
            getCameraControl().cancelAfAeTrigger(takePictureState.mIsAfTriggered, takePictureState.mIsAePrecaptureTriggered);
            takePictureState.mIsAfTriggered = false;
            takePictureState.mIsAePrecaptureTriggered = false;
        }
    }

    public C18728c<Boolean> check3AConverged(TakePictureState takePictureState) {
        if (this.mEnableCheck3AConverged || takePictureState.mIsAePrecaptureTriggered || takePictureState.mIsTorchOpened) {
            return this.mSessionCallbackChecker.checkCaptureResult(new CaptureCallbackChecker.CaptureResultChecker<Boolean>() {
                public Boolean check(CameraCaptureResult cameraCaptureResult) {
                    if (Logger.isDebugEnabled("ImageCapture")) {
                        StringBuilder k = C13555b.m33972k("checkCaptureResult, AE=");
                        k.append(cameraCaptureResult.getAeState());
                        k.append(" AF =");
                        k.append(cameraCaptureResult.getAfState());
                        k.append(" AWB=");
                        k.append(cameraCaptureResult.getAwbState());
                        Logger.m32239d("ImageCapture", k.toString());
                    }
                    if (ImageCapture.this.is3AConverged(cameraCaptureResult)) {
                        return Boolean.TRUE;
                    }
                    return null;
                }
            }, 1000, Boolean.FALSE);
        }
        return Futures.immediateFuture(Boolean.FALSE);
    }

    public void clearPipeline() {
        Threads.checkMainThread();
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        this.mDeferrableSurface = null;
        this.mImageReader = null;
        this.mProcessingImageReader = null;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
    }

    public SessionConfig.Builder createPipeline(String str, ImageCaptureConfig imageCaptureConfig, Size size) {
        int i;
        CaptureProcessor captureProcessor;
        CaptureProcessorPipeline captureProcessorPipeline;
        YuvToJpegProcessor yuvToJpegProcessor;
        YuvToJpegProcessor yuvToJpegProcessor2;
        YuvToJpegProcessor yuvToJpegProcessor3;
        Threads.checkMainThread();
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(imageCaptureConfig);
        createFrom.addRepeatingCameraCaptureCallback(this.mSessionCallbackChecker);
        if (imageCaptureConfig.getImageReaderProxyProvider() != null) {
            this.mImageReader = new SafeCloseImageReaderProxy(imageCaptureConfig.getImageReaderProxyProvider().newInstance(size.getWidth(), size.getHeight(), getImageFormat(), 2, 0));
            this.mMetadataMatchingCaptureCallback = new CameraCaptureCallback(this) {
            };
        } else {
            CaptureProcessor captureProcessor2 = this.mCaptureProcessor;
            if (captureProcessor2 != null || this.mUseSoftwareJpeg) {
                int imageFormat = getImageFormat();
                int imageFormat2 = getImageFormat();
                if (!this.mUseSoftwareJpeg) {
                    captureProcessor = captureProcessor2;
                    i = imageFormat2;
                    yuvToJpegProcessor = null;
                    captureProcessorPipeline = null;
                } else if (Build.VERSION.SDK_INT >= 26) {
                    Logger.m32243i("ImageCapture", "Using software JPEG encoder.");
                    if (this.mCaptureProcessor != null) {
                        YuvToJpegProcessor yuvToJpegProcessor4 = new YuvToJpegProcessor(getJpegQuality(), this.mMaxCaptureStages);
                        captureProcessorPipeline = new CaptureProcessorPipeline(this.mCaptureProcessor, this.mMaxCaptureStages, yuvToJpegProcessor4, this.mExecutor);
                        yuvToJpegProcessor2 = yuvToJpegProcessor4;
                        yuvToJpegProcessor3 = captureProcessorPipeline;
                    } else {
                        yuvToJpegProcessor3 = new YuvToJpegProcessor(getJpegQuality(), this.mMaxCaptureStages);
                        captureProcessorPipeline = null;
                        yuvToJpegProcessor2 = yuvToJpegProcessor3;
                    }
                    captureProcessor = yuvToJpegProcessor3;
                    yuvToJpegProcessor = yuvToJpegProcessor2;
                    i = 256;
                } else {
                    throw new IllegalStateException("Software JPEG only supported on API 26+");
                }
                ProcessingImageReader processingImageReader = new ProcessingImageReader(size.getWidth(), size.getHeight(), imageFormat, this.mMaxCaptureStages, this.mExecutor, getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle()), captureProcessor, i);
                this.mProcessingImageReader = processingImageReader;
                this.mMetadataMatchingCaptureCallback = processingImageReader.getCameraCaptureCallback();
                this.mImageReader = new SafeCloseImageReaderProxy(this.mProcessingImageReader);
                if (yuvToJpegProcessor != null) {
                    this.mProcessingImageReader.getCloseFuture().addListener(new C12569s(0, yuvToJpegProcessor, captureProcessorPipeline), CameraXExecutors.directExecutor());
                }
            } else {
                MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), getImageFormat(), 2);
                this.mMetadataMatchingCaptureCallback = metadataImageReader.getCameraCaptureCallback();
                this.mImageReader = new SafeCloseImageReaderProxy(metadataImageReader);
            }
        }
        this.mImageCaptureRequestProcessor = new ImageCaptureRequestProcessor(2, new C12570t(this));
        this.mImageReader.setOnImageAvailableListener(this.mClosingListener, CameraXExecutors.mainThreadExecutor());
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mImageReader;
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(this.mImageReader.getSurface(), new Size(this.mImageReader.getWidth(), this.mImageReader.getHeight()), this.mImageReader.getImageFormat());
        this.mDeferrableSurface = immediateSurface;
        C18728c<Void> terminationFuture = immediateSurface.getTerminationFuture();
        Objects.requireNonNull(safeCloseImageReaderProxy);
        terminationFuture.addListener(new C12571u(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
        createFrom.addNonRepeatingSurface(this.mDeferrableSurface);
        createFrom.addErrorListener(new C12572v(this, str, imageCaptureConfig, size));
        return createFrom;
    }

    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE);
        if (z) {
            config = C12685f.m32409b(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getFlashMode() {
        int i;
        synchronized (this.mLockedFlashMode) {
            i = this.mFlashMode;
            if (i == -1) {
                i = ((ImageCaptureConfig) getCurrentConfig()).getFlashMode(2);
            }
        }
        return i;
    }

    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    public boolean is3AConverged(CameraCaptureResult cameraCaptureResult) {
        boolean z;
        boolean z2;
        boolean z3;
        if (cameraCaptureResult == null) {
            return false;
        }
        if (cameraCaptureResult.getAfMode() == CameraCaptureMetaData$AfMode.ON_CONTINUOUS_AUTO || cameraCaptureResult.getAfMode() == CameraCaptureMetaData$AfMode.OFF || cameraCaptureResult.getAfMode() == CameraCaptureMetaData$AfMode.UNKNOWN || cameraCaptureResult.getAfState() == CameraCaptureMetaData$AfState.FOCUSED || cameraCaptureResult.getAfState() == CameraCaptureMetaData$AfState.LOCKED_FOCUSED || cameraCaptureResult.getAfState() == CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED) {
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResult.getAeState() == CameraCaptureMetaData$AeState.CONVERGED || cameraCaptureResult.getAeState() == CameraCaptureMetaData$AeState.FLASH_REQUIRED || cameraCaptureResult.getAeState() == CameraCaptureMetaData$AeState.UNKNOWN) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResult.getAwbState() == CameraCaptureMetaData$AwbState.CONVERGED || cameraCaptureResult.getAwbState() == CameraCaptureMetaData$AwbState.UNKNOWN) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    public boolean isFlashRequired(TakePictureState takePictureState) {
        int flashMode = getFlashMode();
        if (flashMode != 0) {
            if (flashMode == 1) {
                return true;
            }
            if (flashMode == 2) {
                return false;
            }
            throw new AssertionError(getFlashMode());
        } else if (takePictureState.mPreCaptureState.getAeState() == CameraCaptureMetaData$AeState.FLASH_REQUIRED) {
            return true;
        } else {
            return false;
        }
    }

    public C18728c<Void> issueTakePicture(ImageCaptureRequest imageCaptureRequest) {
        String str;
        CaptureBundle captureBundle;
        Logger.m32239d("ImageCapture", "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.mProcessingImageReader != null) {
            captureBundle = getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
            if (captureBundle == null) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (this.mCaptureProcessor == null && captureBundle.getCaptureStages().size() > 1) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            }
            if (captureBundle.getCaptureStages().size() > this.mMaxCaptureStages) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.mProcessingImageReader.setCaptureBundle(captureBundle);
            str = this.mProcessingImageReader.getTagBundleKey();
        } else {
            captureBundle = getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
            if (captureBundle.getCaptureStages().size() > 1) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
            str = null;
        }
        for (CaptureStage next : captureBundle.getCaptureStages()) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mCaptureConfig.getTemplateType());
            builder.addImplementationOptions(this.mCaptureConfig.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(this.mSessionConfigBuilder.getSingleCameraCaptureCallbacks());
            builder.addSurface(this.mDeferrableSurface);
            if (new ExifRotationAvailability().isRotationOptionSupported()) {
                builder.addImplementationOption(CaptureConfig.OPTION_ROTATION, Integer.valueOf(imageCaptureRequest.mRotationDegrees));
            }
            builder.addImplementationOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(imageCaptureRequest.mJpegQuality));
            builder.addImplementationOptions(next.getCaptureConfig().getImplementationOptions());
            if (str != null) {
                builder.addTag(str, Integer.valueOf(next.getId()));
            }
            builder.addCameraCaptureCallback(this.mMetadataMatchingCaptureCallback);
            arrayList.add(CallbackToFutureAdapter.m1884a(new C7096q1(this, builder, arrayList2, next)));
        }
        getCameraControl().submitCaptureRequests(arrayList2);
        return Futures.transform(Futures.allAsList(arrayList), new C6147b(1), CameraXExecutors.directExecutor());
    }

    public void onAttached() {
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) getCurrentConfig();
        this.mCaptureConfig = CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        this.mCaptureProcessor = imageCaptureConfig.getCaptureProcessor((CaptureProcessor) null);
        this.mMaxCaptureStages = imageCaptureConfig.getMaxCaptureStages(2);
        this.mCaptureBundle = imageCaptureConfig.getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
        this.mUseSoftwareJpeg = imageCaptureConfig.isSoftwareJpegEncoderRequested();
        this.mExecutor = Executors.newFixedThreadPool(1, new ThreadFactory(this) {
            private final AtomicInteger mId = new AtomicInteger(0);

            public Thread newThread(Runnable runnable) {
                StringBuilder k = C13555b.m33972k("CameraX-image_capture_");
                k.append(this.mId.getAndIncrement());
                return new Thread(runnable, k.toString());
            }
        });
    }

    public void onCameraControlReady() {
        trySetFlashModeToCameraControl();
    }

    public void onDetached() {
        abortImageCaptureRequests();
        clearPipeline();
        this.mUseSoftwareJpeg = false;
        this.mExecutor.shutdown();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.veriff.sdk.camera.core.ExtendableBuilder, com.veriff.sdk.camera.core.impl.UseCaseConfig$Builder<?, ?, ?>, com.veriff.sdk.camera.core.impl.UseCaseConfig$Builder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.camera.core.impl.UseCaseConfig<?> onMergeConfig(com.veriff.sdk.camera.core.impl.CameraInfoInternal r8, com.veriff.sdk.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r9) {
        /*
            r7 = this;
            com.veriff.sdk.camera.core.impl.UseCaseConfig r0 = r9.getUseCaseConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<com.veriff.sdk.camera.core.impl.CaptureProcessor> r1 = com.veriff.sdk.camera.core.impl.ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR
            r2 = 0
            java.lang.Object r0 = r0.retrieveOption(r1, r2)
            java.lang.String r3 = "ImageCapture"
            if (r0 == 0) goto L_0x0026
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r0 < r4) goto L_0x0026
            java.lang.String r8 = "Requesting software JPEG due to a CaptureProcessor is set."
            com.veriff.sdk.camera.core.Logger.m32243i(r3, r8)
            com.veriff.sdk.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<java.lang.Boolean> r0 = com.veriff.sdk.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r8.insertOption(r0, r3)
            goto L_0x0058
        L_0x0026:
            com.veriff.sdk.camera.core.impl.Quirks r8 = r8.getCameraQuirks()
            java.lang.Class<com.veriff.sdk.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk> r0 = com.veriff.sdk.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk.class
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L_0x0058
            com.veriff.sdk.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<java.lang.Boolean> r0 = com.veriff.sdk.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r8 = r8.retrieveOption(r0, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x004c
            java.lang.String r8 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            com.veriff.sdk.camera.core.Logger.m32245w(r3, r8)
            goto L_0x0058
        L_0x004c:
            java.lang.String r8 = "Requesting software JPEG due to device quirk."
            com.veriff.sdk.camera.core.Logger.m32243i(r3, r8)
            com.veriff.sdk.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            r8.insertOption(r0, r4)
        L_0x0058:
            com.veriff.sdk.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            boolean r8 = enforceSoftwareJpegConstraints(r8)
            com.veriff.sdk.camera.core.impl.MutableConfig r0 = r9.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<java.lang.Integer> r3 = com.veriff.sdk.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT
            java.lang.Object r0 = r0.retrieveOption(r3, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3 = 35
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0099
            com.veriff.sdk.camera.core.impl.MutableConfig r6 = r9.getMutableConfig()
            java.lang.Object r1 = r6.retrieveOption(r1, r2)
            if (r1 != 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            java.lang.String r2 = "Cannot set buffer format with CaptureProcessor defined."
            mf0.C24361g.m61177o(r1, r2)
            com.veriff.sdk.camera.core.impl.MutableConfig r1 = r9.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<java.lang.Integer> r2 = com.veriff.sdk.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            if (r8 == 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            int r3 = r0.intValue()
        L_0x0091:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r1.insertOption(r2, r8)
            goto L_0x00c3
        L_0x0099:
            com.veriff.sdk.camera.core.impl.MutableConfig r0 = r9.getMutableConfig()
            java.lang.Object r0 = r0.retrieveOption(r1, r2)
            if (r0 != 0) goto L_0x00b6
            if (r8 == 0) goto L_0x00a6
            goto L_0x00b6
        L_0x00a6:
            com.veriff.sdk.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<java.lang.Integer> r0 = com.veriff.sdk.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            r1 = 256(0x100, float:3.59E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.insertOption(r0, r1)
            goto L_0x00c3
        L_0x00b6:
            com.veriff.sdk.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<java.lang.Integer> r0 = com.veriff.sdk.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r8.insertOption(r0, r1)
        L_0x00c3:
            com.veriff.sdk.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<java.lang.Integer> r0 = com.veriff.sdk.camera.core.impl.ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r8 = r8.retrieveOption(r0, r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < r5) goto L_0x00db
            r4 = 1
        L_0x00db:
            java.lang.String r8 = "Maximum outstanding image count must be at least 1"
            mf0.C24361g.m61177o(r4, r8)
            com.veriff.sdk.camera.core.impl.UseCaseConfig r8 = r9.getUseCaseConfig()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.ImageCapture.onMergeConfig(com.veriff.sdk.camera.core.impl.CameraInfoInternal, com.veriff.sdk.camera.core.impl.UseCaseConfig$Builder):com.veriff.sdk.camera.core.impl.UseCaseConfig");
    }

    public void onStateDetached() {
        abortImageCaptureRequests();
    }

    public Size onSuggestedResolutionUpdated(Size size) {
        SessionConfig.Builder createPipeline = createPipeline(getCameraId(), (ImageCaptureConfig) getCurrentConfig(), size);
        this.mSessionConfigBuilder = createPipeline;
        updateSessionConfig(createPipeline.build());
        notifyActive();
        return size;
    }

    public void postTakePicture(TakePictureState takePictureState) {
        closeTorch(takePictureState);
        cancelAfAeTrigger(takePictureState);
        unlockFlashMode();
    }

    public void setCropAspectRatio(Rational rational) {
        this.mCropAspectRatio = rational;
    }

    /* renamed from: takePicture */
    public void lambda$takePicture$4(Executor executor, OnImageCapturedCallback onImageCapturedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new C5485d(5, this, executor, onImageCapturedCallback));
        } else {
            sendImageCaptureRequest(executor, onImageCapturedCallback);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ImageCapture:");
        k.append(getName());
        return k.toString();
    }

    public C18728c<Void> triggerAePrecapture(TakePictureState takePictureState) {
        Logger.m32239d("ImageCapture", "triggerAePrecapture");
        takePictureState.mIsAePrecaptureTriggered = true;
        return Futures.transform(getCameraControl().triggerAePrecapture(), new C18262i(1), CameraXExecutors.directExecutor());
    }

    public void triggerAfIfNeeded(TakePictureState takePictureState) {
        if (this.mEnableCheck3AConverged && takePictureState.mPreCaptureState.getAfMode() == CameraCaptureMetaData$AfMode.ON_MANUAL_AUTO && takePictureState.mPreCaptureState.getAfState() == CameraCaptureMetaData$AfState.INACTIVE) {
            triggerAf(takePictureState);
        }
    }
}
