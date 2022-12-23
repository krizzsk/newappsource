package com.veriff.sdk.internal.mlkit;

import com.google.android.gms.tasks.OnFailureListener;
import com.veriff.sdk.detector.FaceDetector;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Ljava/lang/Exception;", "it", "Lbf0/d;", "onFailure", "(Ljava/lang/Exception;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
public final class MlkitFaceDetector$detect$1 implements OnFailureListener {
    public final /* synthetic */ FaceDetector.Callback $callback;
    public final /* synthetic */ CountDownLatch $latch;

    public MlkitFaceDetector$detect$1(CountDownLatch countDownLatch, FaceDetector.Callback callback) {
        this.$latch = countDownLatch;
        this.$callback = callback;
    }

    public final void onFailure(Exception exc) {
        C24362h.m61211f(exc, "it");
        this.$latch.countDown();
        this.$callback.onDetectFailed(exc);
    }
}
