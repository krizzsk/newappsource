package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.p017os.OperationCanceledException;
import com.veriff.sdk.camera.core.ImageAnalysis;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.Executor;
import p695od.C18728c;

abstract class ImageAnalysisAbstractAnalyzer implements ImageReaderProxy.OnImageAvailableListener {
    private final Object mAnalyzerLock = new Object();
    public boolean mIsAttached = true;
    private volatile int mRelativeRotation;
    private ImageAnalysis.Analyzer mSubscribedAnalyzer;
    private Executor mUserExecutor;

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$analyzeImage$0(ImageProxy imageProxy, ImageAnalysis.Analyzer analyzer, CallbackToFutureAdapter.C0673a aVar) {
        if (this.mIsAttached) {
            analyzer.analyze(new SettableImageProxy(imageProxy, ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), this.mRelativeRotation)));
            aVar.mo2697b(null);
            return;
        }
        aVar.mo2698c(new OperationCanceledException("ImageAnalysis is detached"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$analyzeImage$1(Executor executor, ImageProxy imageProxy, ImageAnalysis.Analyzer analyzer, CallbackToFutureAdapter.C0673a aVar) throws Exception {
        executor.execute(new C12565o(this, imageProxy, analyzer, aVar));
        return "analyzeImage";
    }

    public abstract ImageProxy acquireImage(ImageReaderProxy imageReaderProxy);

    public C18728c<Void> analyzeImage(ImageProxy imageProxy) {
        Executor executor;
        ImageAnalysis.Analyzer analyzer;
        synchronized (this.mAnalyzerLock) {
            executor = this.mUserExecutor;
            analyzer = this.mSubscribedAnalyzer;
        }
        if (analyzer == null || executor == null) {
            return Futures.immediateFailedFuture(new OperationCanceledException("No analyzer or executor currently set."));
        }
        return CallbackToFutureAdapter.m1884a(new C12564n(this, executor, imageProxy, analyzer));
    }

    public void attach() {
        this.mIsAttached = true;
    }

    public abstract void clearCache();

    public void detach() {
        this.mIsAttached = false;
        clearCache();
    }

    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireImage = acquireImage(imageReaderProxy);
            if (acquireImage != null) {
                onValidImageAvailable(acquireImage);
            }
        } catch (IllegalStateException e) {
            Logger.m32242e("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public abstract void onValidImageAvailable(ImageProxy imageProxy);

    public void setAnalyzer(Executor executor, ImageAnalysis.Analyzer analyzer) {
        synchronized (this.mAnalyzerLock) {
            if (analyzer == null) {
                clearCache();
            }
            this.mSubscribedAnalyzer = analyzer;
            this.mUserExecutor = executor;
        }
    }

    public void setRelativeRotation(int i) {
        this.mRelativeRotation = i;
    }
}
