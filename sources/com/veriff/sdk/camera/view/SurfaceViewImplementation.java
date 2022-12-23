package com.veriff.sdk.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import com.veriff.sdk.camera.view.PreviewViewImplementation;
import p090g1.C4732a;
import p695od.C18728c;

final class SurfaceViewImplementation extends PreviewViewImplementation {
    private PreviewViewImplementation.OnSurfaceNotInUseListener mOnSurfaceNotInUseListener;
    public final SurfaceRequestCallback mSurfaceRequestCallback = new SurfaceRequestCallback();
    public SurfaceView mSurfaceView;

    public static class Api24Impl {
        public static void pixelCopyRequest(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    public class SurfaceRequestCallback implements SurfaceHolder.Callback {
        private Size mCurrentSurfaceSize;
        private SurfaceRequest mSurfaceRequest;
        private Size mTargetSize;
        private boolean mWasSurfaceProvided = false;

        public SurfaceRequestCallback() {
        }

        private boolean canProvideSurface() {
            Size size;
            if (this.mWasSurfaceProvided || this.mSurfaceRequest == null || (size = this.mTargetSize) == null || !size.equals(this.mCurrentSurfaceSize)) {
                return false;
            }
            return true;
        }

        private void cancelPreviousRequest() {
            if (this.mSurfaceRequest != null) {
                StringBuilder k = C13555b.m33972k("Request canceled: ");
                k.append(this.mSurfaceRequest);
                Logger.m32239d("SurfaceViewImpl", k.toString());
                this.mSurfaceRequest.willNotProvideSurface();
            }
        }

        private void invalidateSurface() {
            if (this.mSurfaceRequest != null) {
                StringBuilder k = C13555b.m33972k("Surface invalidated ");
                k.append(this.mSurfaceRequest);
                Logger.m32239d("SurfaceViewImpl", k.toString());
                this.mSurfaceRequest.getDeferrableSurface().close();
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$tryToComplete$0(SurfaceRequest.Result result) {
            Logger.m32239d("SurfaceViewImpl", "Safe to release surface.");
            SurfaceViewImplementation.this.notifySurfaceNotInUse();
        }

        private boolean tryToComplete() {
            Surface surface = SurfaceViewImplementation.this.mSurfaceView.getHolder().getSurface();
            if (!canProvideSurface()) {
                return false;
            }
            Logger.m32239d("SurfaceViewImpl", "Surface set on Preview.");
            this.mSurfaceRequest.provideSurface(surface, C4732a.getMainExecutor(SurfaceViewImplementation.this.mSurfaceView.getContext()), new C12593j(this));
            this.mWasSurfaceProvided = true;
            SurfaceViewImplementation.this.onSurfaceProvided();
            return true;
        }

        public void setSurfaceRequest(SurfaceRequest surfaceRequest) {
            cancelPreviousRequest();
            this.mSurfaceRequest = surfaceRequest;
            Size resolution = surfaceRequest.getResolution();
            this.mTargetSize = resolution;
            this.mWasSurfaceProvided = false;
            if (!tryToComplete()) {
                Logger.m32239d("SurfaceViewImpl", "Wait for new Surface creation.");
                SurfaceViewImplementation.this.mSurfaceView.getHolder().setFixedSize(resolution.getWidth(), resolution.getHeight());
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Logger.m32239d("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.mCurrentSurfaceSize = new Size(i2, i3);
            tryToComplete();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            Logger.m32239d("SurfaceViewImpl", "Surface created.");
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Logger.m32239d("SurfaceViewImpl", "Surface destroyed.");
            if (this.mWasSurfaceProvided) {
                invalidateSurface();
            } else {
                cancelPreviousRequest();
            }
            this.mWasSurfaceProvided = false;
            this.mSurfaceRequest = null;
            this.mCurrentSurfaceSize = null;
            this.mTargetSize = null;
        }
    }

    public SurfaceViewImplementation(FrameLayout frameLayout, PreviewTransformation previewTransformation) {
        super(frameLayout, previewTransformation);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPreviewBitmap$1(int i) {
        if (i == 0) {
            Logger.m32239d("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        Logger.m32241e("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSurfaceRequested$0(SurfaceRequest surfaceRequest) {
        this.mSurfaceRequestCallback.setSurfaceRequest(surfaceRequest);
    }

    public View getPreview() {
        return this.mSurfaceView;
    }

    public Bitmap getPreviewBitmap() {
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.mSurfaceView.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.mSurfaceView.getWidth(), this.mSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView2 = this.mSurfaceView;
        Api24Impl.pixelCopyRequest(surfaceView2, createBitmap, new C12590g(), surfaceView2.getHandler());
        return createBitmap;
    }

    public void initializePreview() {
        this.mParent.getClass();
        this.mResolution.getClass();
        SurfaceView surfaceView = new SurfaceView(this.mParent.getContext());
        this.mSurfaceView = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.mResolution.getWidth(), this.mResolution.getHeight()));
        this.mParent.removeAllViews();
        this.mParent.addView(this.mSurfaceView);
        this.mSurfaceView.getHolder().addCallback(this.mSurfaceRequestCallback);
    }

    public void notifySurfaceNotInUse() {
        PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener = this.mOnSurfaceNotInUseListener;
        if (onSurfaceNotInUseListener != null) {
            ((C12589f) onSurfaceNotInUseListener).mo39362a();
            this.mOnSurfaceNotInUseListener = null;
        }
    }

    public void onAttachedToWindow() {
    }

    public void onDetachedFromWindow() {
    }

    public void onSurfaceRequested(SurfaceRequest surfaceRequest, PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener) {
        this.mResolution = surfaceRequest.getResolution();
        this.mOnSurfaceNotInUseListener = onSurfaceNotInUseListener;
        initializePreview();
        surfaceRequest.addRequestCancellationListener(C4732a.getMainExecutor(this.mSurfaceView.getContext()), new C12591h(this));
        this.mSurfaceView.post(new C12592i(this, surfaceRequest));
    }

    public C18728c<Void> waitForNextFrame() {
        return Futures.immediateFuture(null);
    }
}
