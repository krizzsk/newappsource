package com.veriff.sdk.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.C0951n;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import com.veriff.sdk.camera.view.PreviewViewImplementation;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24361g;
import p090g1.C4732a;
import p695od.C18728c;

final class TextureViewImplementation extends PreviewViewImplementation {
    public SurfaceTexture mDetachedSurfaceTexture;
    public boolean mIsSurfaceTextureDetachedFromView = false;
    public AtomicReference<CallbackToFutureAdapter.C0673a<Void>> mNextFrameCompleter = new AtomicReference<>();
    public PreviewViewImplementation.OnSurfaceNotInUseListener mOnSurfaceNotInUseListener;
    public C18728c<SurfaceRequest.Result> mSurfaceReleaseFuture;
    public SurfaceRequest mSurfaceRequest;
    public SurfaceTexture mSurfaceTexture;
    public TextureView mTextureView;

    public TextureViewImplementation(FrameLayout frameLayout, PreviewTransformation previewTransformation) {
        super(frameLayout, previewTransformation);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSurfaceRequested$0(SurfaceRequest surfaceRequest) {
        SurfaceRequest surfaceRequest2 = this.mSurfaceRequest;
        if (surfaceRequest2 != null && surfaceRequest2 == surfaceRequest) {
            this.mSurfaceRequest = null;
            this.mSurfaceReleaseFuture = null;
        }
        notifySurfaceNotInUse();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$tryToProvidePreviewSurface$1(Surface surface, CallbackToFutureAdapter.C0673a aVar) throws Exception {
        Logger.m32239d("TextureViewImpl", "Surface set on Preview.");
        SurfaceRequest surfaceRequest = this.mSurfaceRequest;
        Executor directExecutor = CameraXExecutors.directExecutor();
        Objects.requireNonNull(aVar);
        surfaceRequest.provideSurface(surface, directExecutor, new C0951n(aVar, 1));
        return "provideSurface[request=" + this.mSurfaceRequest + " surface=" + surface + "]";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$tryToProvidePreviewSurface$2(Surface surface, C18728c cVar, SurfaceRequest surfaceRequest) {
        Logger.m32239d("TextureViewImpl", "Safe to release surface.");
        notifySurfaceNotInUse();
        surface.release();
        if (this.mSurfaceReleaseFuture == cVar) {
            this.mSurfaceReleaseFuture = null;
        }
        if (this.mSurfaceRequest == surfaceRequest) {
            this.mSurfaceRequest = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$waitForNextFrame$3(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mNextFrameCompleter.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void notifySurfaceNotInUse() {
        PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener = this.mOnSurfaceNotInUseListener;
        if (onSurfaceNotInUseListener != null) {
            ((C12589f) onSurfaceNotInUseListener).mo39362a();
            this.mOnSurfaceNotInUseListener = null;
        }
    }

    private void reattachSurfaceTexture() {
        SurfaceTexture surfaceTexture;
        if (this.mIsSurfaceTextureDetachedFromView && this.mDetachedSurfaceTexture != null && this.mTextureView.getSurfaceTexture() != (surfaceTexture = this.mDetachedSurfaceTexture)) {
            this.mTextureView.setSurfaceTexture(surfaceTexture);
            this.mDetachedSurfaceTexture = null;
            this.mIsSurfaceTextureDetachedFromView = false;
        }
    }

    public View getPreview() {
        return this.mTextureView;
    }

    public Bitmap getPreviewBitmap() {
        TextureView textureView = this.mTextureView;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.mTextureView.getBitmap();
    }

    public void initializePreview() {
        this.mParent.getClass();
        this.mResolution.getClass();
        TextureView textureView = new TextureView(this.mParent.getContext());
        this.mTextureView = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.mResolution.getWidth(), this.mResolution.getHeight()));
        this.mTextureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Logger.m32239d("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
                TextureViewImplementation textureViewImplementation = TextureViewImplementation.this;
                textureViewImplementation.mSurfaceTexture = surfaceTexture;
                if (textureViewImplementation.mSurfaceReleaseFuture != null) {
                    textureViewImplementation.mSurfaceRequest.getClass();
                    Logger.m32239d("TextureViewImpl", "Surface invalidated " + TextureViewImplementation.this.mSurfaceRequest);
                    TextureViewImplementation.this.mSurfaceRequest.getDeferrableSurface().close();
                    return;
                }
                textureViewImplementation.tryToProvidePreviewSurface();
            }

            public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
                TextureViewImplementation textureViewImplementation = TextureViewImplementation.this;
                textureViewImplementation.mSurfaceTexture = null;
                C18728c<SurfaceRequest.Result> cVar = textureViewImplementation.mSurfaceReleaseFuture;
                if (cVar != null) {
                    Futures.addCallback(cVar, new FutureCallback<SurfaceRequest.Result>() {
                        public void onFailure(Throwable th) {
                            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
                        }

                        public void onSuccess(SurfaceRequest.Result result) {
                            C24361g.m61193w("Unexpected result from SurfaceRequest. Surface was provided twice.", result.getResultCode() != 3);
                            Logger.m32239d("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                            surfaceTexture.release();
                            TextureViewImplementation textureViewImplementation = TextureViewImplementation.this;
                            if (textureViewImplementation.mDetachedSurfaceTexture != null) {
                                textureViewImplementation.mDetachedSurfaceTexture = null;
                            }
                        }
                    }, C4732a.getMainExecutor(TextureViewImplementation.this.mTextureView.getContext()));
                    TextureViewImplementation.this.mDetachedSurfaceTexture = surfaceTexture;
                    return false;
                }
                Logger.m32239d("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                Logger.m32239d("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                CallbackToFutureAdapter.C0673a andSet = TextureViewImplementation.this.mNextFrameCompleter.getAndSet((Object) null);
                if (andSet != null) {
                    andSet.mo2697b(null);
                }
            }
        });
        this.mParent.removeAllViews();
        this.mParent.addView(this.mTextureView);
    }

    public void onAttachedToWindow() {
        reattachSurfaceTexture();
    }

    public void onDetachedFromWindow() {
        this.mIsSurfaceTextureDetachedFromView = true;
    }

    public void onSurfaceRequested(SurfaceRequest surfaceRequest, PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener) {
        this.mResolution = surfaceRequest.getResolution();
        this.mOnSurfaceNotInUseListener = onSurfaceNotInUseListener;
        initializePreview();
        SurfaceRequest surfaceRequest2 = this.mSurfaceRequest;
        if (surfaceRequest2 != null) {
            surfaceRequest2.willNotProvideSurface();
        }
        this.mSurfaceRequest = surfaceRequest;
        surfaceRequest.addRequestCancellationListener(C4732a.getMainExecutor(this.mTextureView.getContext()), new C12595l(this, surfaceRequest));
        tryToProvidePreviewSurface();
    }

    public void tryToProvidePreviewSurface() {
        SurfaceTexture surfaceTexture;
        Size size = this.mResolution;
        if (size != null && (surfaceTexture = this.mSurfaceTexture) != null && this.mSurfaceRequest != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.mResolution.getHeight());
            Surface surface = new Surface(this.mSurfaceTexture);
            SurfaceRequest surfaceRequest = this.mSurfaceRequest;
            CallbackToFutureAdapter.C0675c a = CallbackToFutureAdapter.m1884a(new C12596m(this, surface));
            this.mSurfaceReleaseFuture = a;
            a.f2322c.addListener(new C12597n(this, surface, a, surfaceRequest), C4732a.getMainExecutor(this.mTextureView.getContext()));
            onSurfaceProvided();
        }
    }

    public C18728c<Void> waitForNextFrame() {
        return CallbackToFutureAdapter.m1884a(new C12594k(this));
    }
}
