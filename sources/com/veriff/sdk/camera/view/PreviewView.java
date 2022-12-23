package com.veriff.sdk.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.LiveData;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.MeteringPointFactory;
import com.veriff.sdk.camera.core.Preview;
import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.core.ViewPort;
import com.veriff.sdk.camera.core.impl.CameraInfoInternal;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.utils.Threads;
import com.veriff.sdk.camera.view.internal.compat.quirk.DeviceQuirks;
import com.veriff.sdk.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import com.veriff.sdk.camera.view.transform.OutputTransform;
import java.util.concurrent.atomic.AtomicReference;
import p090g1.C4732a;
import p242s1.C6333d0;
import p451du.C16704a;

public final class PreviewView extends FrameLayout {
    private static final ImplementationMode DEFAULT_IMPL_MODE = ImplementationMode.PERFORMANCE;
    public final AtomicReference<PreviewStreamStateObserver> mActiveStreamStateObserver;
    public PreviewViewImplementation mImplementation;
    public ImplementationMode mImplementationMode;
    private final View.OnLayoutChangeListener mOnLayoutChangeListener;
    public final C1043v<StreamState> mPreviewStreamStateLiveData;
    public final PreviewTransformation mPreviewTransform;
    public PreviewViewMeteringPointFactory mPreviewViewMeteringPointFactory;
    public final Preview.SurfaceProvider mSurfaceProvider;

    /* renamed from: com.veriff.sdk.camera.view.PreviewView$2 */
    public static /* synthetic */ class C125812 {

        /* renamed from: $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ImplementationMode */
        public static final /* synthetic */ int[] f31114xa3c50f1;
        public static final /* synthetic */ int[] $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        static {
            /*
                com.veriff.sdk.camera.view.PreviewView$ImplementationMode[] r0 = com.veriff.sdk.camera.view.PreviewView.ImplementationMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31114xa3c50f1 = r0
                r1 = 1
                com.veriff.sdk.camera.view.PreviewView$ImplementationMode r2 = com.veriff.sdk.camera.view.PreviewView.ImplementationMode.COMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f31114xa3c50f1     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.camera.view.PreviewView$ImplementationMode r3 = com.veriff.sdk.camera.view.PreviewView.ImplementationMode.PERFORMANCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.veriff.sdk.camera.view.PreviewView$ScaleType[] r2 = com.veriff.sdk.camera.view.PreviewView.ScaleType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType = r2
                com.veriff.sdk.camera.view.PreviewView$ScaleType r3 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FILL_END     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.veriff.sdk.camera.view.PreviewView$ScaleType r2 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FILL_CENTER     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.veriff.sdk.camera.view.PreviewView$ScaleType r1 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FILL_START     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType     // Catch:{ NoSuchFieldError -> 0x004e }
                com.veriff.sdk.camera.view.PreviewView$ScaleType r1 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.veriff.sdk.camera.view.PreviewView$ScaleType r1 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.veriff.sdk.camera.view.PreviewView$ScaleType r1 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.view.PreviewView.C125812.<clinit>():void");
        }
    }

    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);
        
        private final int mId;

        private ImplementationMode(int i) {
            this.mId = i;
        }

        public static ImplementationMode fromId(int i) {
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException(C16759e.m42349e("Unknown implementation mode id ", i));
        }

        public int getId() {
            return this.mId;
        }
    }

    public class PinchToZoomOnScaleGestureListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public PinchToZoomOnScaleGestureListener() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PreviewView.this.getClass();
            return true;
        }
    }

    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        
        private final int mId;

        private ScaleType(int i) {
            this.mId = i;
        }

        public static ScaleType fromId(int i) {
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException(C16759e.m42349e("Unknown scale type id ", i));
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum StreamState {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void attachToControllerIfReady(boolean z) {
        getDisplay();
        getViewPort();
    }

    private int getViewPortScaleType() {
        switch (C125812.$SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                StringBuilder k = C13555b.m33972k("Unexpected scale type: ");
                k.append(getScaleType());
                throw new IllegalStateException(k.toString());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            redrawPreview();
            attachToControllerIfReady(true);
        }
    }

    public static boolean shouldUseTextureView(SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        boolean z;
        int i;
        boolean equals = surfaceRequest.getCamera().getCameraInfoInternal().getImplementationType().equals("com.veriff.sdk.camera.camera2.legacy");
        if (DeviceQuirks.get(SurfaceViewStretchedQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        if (surfaceRequest.isRGBA8888Required() || Build.VERSION.SDK_INT <= 24 || equals || z || (i = C125812.f31114xa3c50f1[implementationMode.ordinal()]) == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
    }

    public Bitmap getBitmap() {
        Threads.checkMainThread();
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation == null) {
            return null;
        }
        return previewViewImplementation.getBitmap();
    }

    public CameraController getController() {
        Threads.checkMainThread();
        return null;
    }

    public ImplementationMode getImplementationMode() {
        Threads.checkMainThread();
        return this.mImplementationMode;
    }

    public MeteringPointFactory getMeteringPointFactory() {
        Threads.checkMainThread();
        return this.mPreviewViewMeteringPointFactory;
    }

    public OutputTransform getOutputTransform() {
        Matrix matrix;
        Threads.checkMainThread();
        try {
            matrix = this.mPreviewTransform.getSurfaceToPreviewViewMatrix(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect surfaceCropRect = this.mPreviewTransform.getSurfaceCropRect();
        if (matrix == null || surfaceCropRect == null) {
            Logger.m32239d("PreviewView", "Transform info is not ready");
            return null;
        }
        matrix.preConcat(TransformUtils.getNormalizedToBuffer(surfaceCropRect));
        if (this.mImplementation instanceof TextureViewImplementation) {
            matrix.postConcat(getMatrix());
        } else {
            Logger.m32245w("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new OutputTransform(matrix, new Size(surfaceCropRect.width(), surfaceCropRect.height()));
    }

    public LiveData<StreamState> getPreviewStreamState() {
        return this.mPreviewStreamStateLiveData;
    }

    public ScaleType getScaleType() {
        Threads.checkMainThread();
        return this.mPreviewTransform.getScaleType();
    }

    public Preview.SurfaceProvider getSurfaceProvider() {
        Threads.checkMainThread();
        return this.mSurfaceProvider;
    }

    public ViewPort getViewPort() {
        Threads.checkMainThread();
        if (getDisplay() == null) {
            return null;
        }
        return getViewPort(getDisplay().getRotation());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.onAttachedToWindow();
        }
        attachToControllerIfReady(true);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.onDetachedFromWindow();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        return super.performClick();
    }

    public void redrawPreview() {
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.redrawPreview();
        }
        this.mPreviewViewMeteringPointFactory.recalculate(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public void setController(CameraController cameraController) {
        Threads.checkMainThread();
        attachToControllerIfReady(false);
    }

    public void setImplementationMode(ImplementationMode implementationMode) {
        Threads.checkMainThread();
        this.mImplementationMode = implementationMode;
    }

    public void setScaleType(ScaleType scaleType) {
        Threads.checkMainThread();
        this.mPreviewTransform.setScaleType(scaleType);
        redrawPreview();
        attachToControllerIfReady(false);
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX INFO: finally extract failed */
    public PreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ImplementationMode implementationMode = DEFAULT_IMPL_MODE;
        this.mImplementationMode = implementationMode;
        PreviewTransformation previewTransformation = new PreviewTransformation();
        this.mPreviewTransform = previewTransformation;
        this.mPreviewStreamStateLiveData = new C1043v<>(StreamState.IDLE);
        this.mActiveStreamStateObserver = new AtomicReference<>();
        this.mPreviewViewMeteringPointFactory = new PreviewViewMeteringPointFactory(previewTransformation);
        this.mOnLayoutChangeListener = new C16704a(this, 2);
        this.mSurfaceProvider = new Preview.SurfaceProvider() {
            /* access modifiers changed from: private */
            public /* synthetic */ void lambda$onSurfaceRequested$0(SurfaceRequest surfaceRequest) {
                PreviewView.this.mSurfaceProvider.onSurfaceRequested(surfaceRequest);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void lambda$onSurfaceRequested$1(CameraInternal cameraInternal, SurfaceRequest surfaceRequest, SurfaceRequest.TransformationInfo transformationInfo) {
                boolean z;
                Logger.m32239d("PreviewView", "Preview transformation info updated. " + transformationInfo);
                if (cameraInternal.getCameraInfoInternal().getLensFacing().intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                PreviewView.this.mPreviewTransform.setTransformationInfo(transformationInfo, surfaceRequest.getResolution(), z);
                PreviewView.this.redrawPreview();
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void lambda$onSurfaceRequested$2(PreviewStreamStateObserver previewStreamStateObserver, CameraInternal cameraInternal) {
                boolean z;
                AtomicReference<PreviewStreamStateObserver> atomicReference = PreviewView.this.mActiveStreamStateObserver;
                while (true) {
                    if (!atomicReference.compareAndSet(previewStreamStateObserver, (Object) null)) {
                        if (atomicReference.get() != previewStreamStateObserver) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    previewStreamStateObserver.updatePreviewStreamState(StreamState.IDLE);
                }
                previewStreamStateObserver.clear();
                cameraInternal.getCameraState().removeObserver(previewStreamStateObserver);
            }

            public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                PreviewViewImplementation previewViewImplementation;
                if (!Threads.isMainThread()) {
                    C4732a.getMainExecutor(PreviewView.this.getContext()).execute(new C12587d(this, surfaceRequest));
                    return;
                }
                Logger.m32239d("PreviewView", "Surface requested by Preview.");
                CameraInternal camera = surfaceRequest.getCamera();
                surfaceRequest.setTransformationInfoListener(C4732a.getMainExecutor(PreviewView.this.getContext()), new C12588e(this, camera, surfaceRequest));
                PreviewView previewView = PreviewView.this;
                if (PreviewView.shouldUseTextureView(surfaceRequest, previewView.mImplementationMode)) {
                    PreviewView previewView2 = PreviewView.this;
                    previewViewImplementation = new TextureViewImplementation(previewView2, previewView2.mPreviewTransform);
                } else {
                    PreviewView previewView3 = PreviewView.this;
                    previewViewImplementation = new SurfaceViewImplementation(previewView3, previewView3.mPreviewTransform);
                }
                previewView.mImplementation = previewViewImplementation;
                CameraInfoInternal cameraInfoInternal = camera.getCameraInfoInternal();
                PreviewView previewView4 = PreviewView.this;
                PreviewStreamStateObserver previewStreamStateObserver = new PreviewStreamStateObserver(cameraInfoInternal, previewView4.mPreviewStreamStateLiveData, previewView4.mImplementation);
                PreviewView.this.mActiveStreamStateObserver.set(previewStreamStateObserver);
                camera.getCameraState().addObserver(C4732a.getMainExecutor(PreviewView.this.getContext()), previewStreamStateObserver);
                PreviewView.this.mImplementation.onSurfaceRequested(surfaceRequest, new C12589f(this, previewStreamStateObserver, camera));
            }
        };
        Threads.checkMainThread();
        Resources.Theme theme = context.getTheme();
        int[] iArr = R$styleable.vrffPreviewView;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
        C6333d0.m15028p(this, context, iArr, attributeSet, obtainStyledAttributes, i, i2);
        try {
            setScaleType(ScaleType.fromId(obtainStyledAttributes.getInteger(R$styleable.vrffPreviewView_vrffScaleType, previewTransformation.getScaleType().getId())));
            setImplementationMode(ImplementationMode.fromId(obtainStyledAttributes.getInteger(R$styleable.vrffPreviewView_vrffImplementationMode, implementationMode.getId())));
            obtainStyledAttributes.recycle();
            new ScaleGestureDetector(context, new PinchToZoomOnScaleGestureListener());
            if (getBackground() == null) {
                setBackgroundColor(C4732a.getColor(getContext(), 17170444));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @SuppressLint({"WrongConstant"})
    public ViewPort getViewPort(int i) {
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new ViewPort.Builder(new Rational(getWidth(), getHeight()), i).setScaleType(getViewPortScaleType()).setLayoutDirection(getLayoutDirection()).build();
    }
}
