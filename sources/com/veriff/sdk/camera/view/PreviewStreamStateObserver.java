package com.veriff.sdk.camera.view;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C1043v;
import com.veriff.sdk.camera.core.CameraInfo;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import com.veriff.sdk.camera.core.impl.CameraInfoInternal;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.Observable;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureChain;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import com.veriff.sdk.camera.view.PreviewView;
import java.util.ArrayList;
import java.util.List;
import p695od.C18728c;

final class PreviewStreamStateObserver implements Observable.Observer<CameraInternal.State> {
    private final CameraInfoInternal mCameraInfoInternal;
    public C18728c<Void> mFlowFuture;
    private boolean mHasStartedPreviewStreamFlow = false;
    private PreviewView.StreamState mPreviewStreamState;
    private final C1043v<PreviewView.StreamState> mPreviewStreamStateLiveData;
    private final PreviewViewImplementation mPreviewViewImplementation;

    public PreviewStreamStateObserver(CameraInfoInternal cameraInfoInternal, C1043v<PreviewView.StreamState> vVar, PreviewViewImplementation previewViewImplementation) {
        this.mCameraInfoInternal = cameraInfoInternal;
        this.mPreviewStreamStateLiveData = vVar;
        this.mPreviewViewImplementation = previewViewImplementation;
        synchronized (this) {
            this.mPreviewStreamState = vVar.getValue();
        }
    }

    private void cancelFlow() {
        C18728c<Void> cVar = this.mFlowFuture;
        if (cVar != null) {
            cVar.cancel(false);
            this.mFlowFuture = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C18728c lambda$startPreviewStreamStateFlow$0(Void voidR) throws Exception {
        return this.mPreviewViewImplementation.waitForNextFrame();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void lambda$startPreviewStreamStateFlow$1(Void voidR) {
        updatePreviewStreamState(PreviewView.StreamState.STREAMING);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$waitForCaptureResult$2(final CameraInfo cameraInfo, List list, final CallbackToFutureAdapter.C0673a aVar) throws Exception {
        C125782 r0 = new CameraCaptureCallback(this) {
            public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                aVar.mo2697b(null);
                ((CameraInfoInternal) cameraInfo).removeSessionCaptureCallback(this);
            }
        };
        list.add(r0);
        ((CameraInfoInternal) cameraInfo).addSessionCaptureCallback(CameraXExecutors.directExecutor(), r0);
        return "waitForCaptureResult";
    }

    private void startPreviewStreamStateFlow(final CameraInfo cameraInfo) {
        updatePreviewStreamState(PreviewView.StreamState.IDLE);
        final ArrayList arrayList = new ArrayList();
        FutureChain<T> transform = FutureChain.from(waitForCaptureResult(cameraInfo, arrayList)).transformAsync(new C12584a(this), CameraXExecutors.directExecutor()).transform(new C12585b(this), CameraXExecutors.directExecutor());
        this.mFlowFuture = transform;
        Futures.addCallback(transform, new FutureCallback<Void>() {
            public void onFailure(Throwable th) {
                PreviewStreamStateObserver.this.mFlowFuture = null;
                if (!arrayList.isEmpty()) {
                    for (CameraCaptureCallback removeSessionCaptureCallback : arrayList) {
                        ((CameraInfoInternal) cameraInfo).removeSessionCaptureCallback(removeSessionCaptureCallback);
                    }
                    arrayList.clear();
                }
            }

            public void onSuccess(Void voidR) {
                PreviewStreamStateObserver.this.mFlowFuture = null;
            }
        }, CameraXExecutors.directExecutor());
    }

    private C18728c<Void> waitForCaptureResult(CameraInfo cameraInfo, List<CameraCaptureCallback> list) {
        return CallbackToFutureAdapter.m1884a(new C12586c(this, list, cameraInfo));
    }

    public void clear() {
        cancelFlow();
    }

    public void onError(Throwable th) {
        clear();
        updatePreviewStreamState(PreviewView.StreamState.IDLE);
    }

    public void updatePreviewStreamState(PreviewView.StreamState streamState) {
        synchronized (this) {
            if (!this.mPreviewStreamState.equals(streamState)) {
                this.mPreviewStreamState = streamState;
                Logger.m32239d("StreamStateObserver", "Update Preview stream state to " + streamState);
                this.mPreviewStreamStateLiveData.postValue(streamState);
            }
        }
    }

    public void onNewData(CameraInternal.State state) {
        if (state == CameraInternal.State.CLOSING || state == CameraInternal.State.CLOSED || state == CameraInternal.State.RELEASING || state == CameraInternal.State.RELEASED) {
            updatePreviewStreamState(PreviewView.StreamState.IDLE);
            if (this.mHasStartedPreviewStreamFlow) {
                this.mHasStartedPreviewStreamFlow = false;
                cancelFlow();
            }
        } else if ((state == CameraInternal.State.OPENING || state == CameraInternal.State.OPEN || state == CameraInternal.State.PENDING_OPEN) && !this.mHasStartedPreviewStreamFlow) {
            startPreviewStreamStateFlow(this.mCameraInfoInternal);
            this.mHasStartedPreviewStreamFlow = true;
        }
    }
}
