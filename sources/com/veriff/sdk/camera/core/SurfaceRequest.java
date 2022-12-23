package com.veriff.sdk.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24361g;
import p001a0.C0016g;
import p028ba.C1512f;
import p054d0.C4317w0;
import p229r1.C6231a;
import p304x.C7078n;
import p695od.C18728c;

public final class SurfaceRequest {
    private final CameraInternal mCamera;
    private final DeferrableSurface mInternalDeferrableSurface;
    private final boolean mRGBA8888Required;
    private final CallbackToFutureAdapter.C0673a<Void> mRequestCancellationCompleter;
    private final Size mResolution;
    private final C18728c<Void> mSessionStatusFuture;
    private final CallbackToFutureAdapter.C0673a<Surface> mSurfaceCompleter;
    public final C18728c<Surface> mSurfaceFuture;
    private TransformationInfo mTransformationInfo;
    private Executor mTransformationInfoExecutor;
    private TransformationInfoListener mTransformationInfoListener;

    public static final class RequestCancelledException extends RuntimeException {
        public RequestCancelledException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static abstract class Result {
        /* renamed from: of */
        public static Result m32265of(int i, Surface surface) {
            return new AutoValue_SurfaceRequest_Result(i, surface);
        }

        public abstract int getResultCode();

        public abstract Surface getSurface();
    }

    public static abstract class TransformationInfo {
        /* renamed from: of */
        public static TransformationInfo m32266of(Rect rect, int i, int i2) {
            return new AutoValue_SurfaceRequest_TransformationInfo(rect, i, i2);
        }

        public abstract Rect getCropRect();

        public abstract int getRotationDegrees();

        public abstract int getTargetRotation();
    }

    public interface TransformationInfoListener {
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, boolean z) {
        this.mResolution = size;
        this.mCamera = cameraInternal;
        this.mRGBA8888Required = z;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        final CallbackToFutureAdapter.C0675c a = CallbackToFutureAdapter.m1884a(new C1512f(9, atomicReference, str));
        final CallbackToFutureAdapter.C0673a<Void> aVar = (CallbackToFutureAdapter.C0673a) atomicReference.get();
        aVar.getClass();
        this.mRequestCancellationCompleter = aVar;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        CallbackToFutureAdapter.C0675c a2 = CallbackToFutureAdapter.m1884a(new C12560k0(atomicReference2, str));
        this.mSessionStatusFuture = a2;
        Futures.addCallback(a2, new FutureCallback<Void>(this) {
            public void onFailure(Throwable th) {
                if (th instanceof RequestCancelledException) {
                    C24361g.m61193w((String) null, a.cancel(false));
                } else {
                    C24361g.m61193w((String) null, aVar.mo2697b(null));
                }
            }

            public void onSuccess(Void voidR) {
                C24361g.m61193w((String) null, aVar.mo2697b(null));
            }
        }, CameraXExecutors.directExecutor());
        final CallbackToFutureAdapter.C0673a aVar2 = (CallbackToFutureAdapter.C0673a) atomicReference2.get();
        aVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        CallbackToFutureAdapter.C0675c a3 = CallbackToFutureAdapter.m1884a(new C4317w0(atomicReference3, str, 1));
        this.mSurfaceFuture = a3;
        CallbackToFutureAdapter.C0673a<Surface> aVar3 = (CallbackToFutureAdapter.C0673a) atomicReference3.get();
        aVar3.getClass();
        this.mSurfaceCompleter = aVar3;
        C125042 r1 = new DeferrableSurface(size, 34) {
            public C18728c<Surface> provideSurface() {
                return SurfaceRequest.this.mSurfaceFuture;
            }
        };
        this.mInternalDeferrableSurface = r1;
        final C18728c<Void> terminationFuture = r1.getTerminationFuture();
        Futures.addCallback(a3, new FutureCallback<Surface>(this) {
            public void onFailure(Throwable th) {
                if (th instanceof CancellationException) {
                    C24361g.m61193w((String) null, aVar2.mo2698c(new RequestCancelledException(C0016g.m31o(new StringBuilder(), str, " cancelled."), th)));
                } else {
                    aVar2.mo2697b(null);
                }
            }

            public void onSuccess(Surface surface) {
                Futures.propagate(terminationFuture, aVar2);
            }
        }, CameraXExecutors.directExecutor());
        terminationFuture.addListener(new C12561l(this, 1), CameraXExecutors.directExecutor());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        this.mSurfaceFuture.cancel(true);
    }

    @SuppressLint({"PairedRegistration"})
    public void addRequestCancellationListener(Executor executor, Runnable runnable) {
        this.mRequestCancellationCompleter.mo2696a(runnable, executor);
    }

    public CameraInternal getCamera() {
        return this.mCamera;
    }

    public DeferrableSurface getDeferrableSurface() {
        return this.mInternalDeferrableSurface;
    }

    public Size getResolution() {
        return this.mResolution;
    }

    public boolean isRGBA8888Required() {
        return this.mRGBA8888Required;
    }

    public void provideSurface(final Surface surface, Executor executor, final C6231a<Result> aVar) {
        if (this.mSurfaceCompleter.mo2697b(surface) || this.mSurfaceFuture.isCancelled()) {
            Futures.addCallback(this.mSessionStatusFuture, new FutureCallback<Void>(this) {
                public void onFailure(Throwable th) {
                    C24361g.m61193w("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof RequestCancelledException);
                    aVar.accept(Result.m32265of(1, surface));
                }

                public void onSuccess(Void voidR) {
                    aVar.accept(Result.m32265of(0, surface));
                }
            }, executor);
            return;
        }
        C24361g.m61193w((String) null, this.mSurfaceFuture.isDone());
        try {
            this.mSurfaceFuture.get();
            executor.execute(new C12521g0(1, aVar, surface));
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new C12522h(1, aVar, surface));
        }
    }

    public void setTransformationInfoListener(Executor executor, TransformationInfoListener transformationInfoListener) {
        this.mTransformationInfoListener = transformationInfoListener;
        this.mTransformationInfoExecutor = executor;
        TransformationInfo transformationInfo = this.mTransformationInfo;
        if (transformationInfo != null) {
            executor.execute(new C12562l0(transformationInfoListener, transformationInfo));
        }
    }

    public void updateTransformationInfo(TransformationInfo transformationInfo) {
        this.mTransformationInfo = transformationInfo;
        TransformationInfoListener transformationInfoListener = this.mTransformationInfoListener;
        if (transformationInfoListener != null) {
            this.mTransformationInfoExecutor.execute(new C7078n(17, transformationInfoListener, transformationInfo));
        }
    }

    public boolean willNotProvideSurface() {
        return this.mSurfaceCompleter.mo2698c(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }
}
