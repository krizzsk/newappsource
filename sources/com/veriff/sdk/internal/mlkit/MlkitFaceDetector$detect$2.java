package com.veriff.sdk.internal.mlkit;

import android.graphics.Rect;
import cf0.C21136j;
import com.google.android.gms.tasks.OnSuccessListener;
import com.veriff.sdk.detector.EulerAngle;
import com.veriff.sdk.detector.Face;
import com.veriff.sdk.detector.FaceDetector;
import com.veriff.sdk.detector.Rectangle;
import com.veriff.sdk.detector.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import mf0.C24362h;
import p839ug.C19907a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo59060d2 = {"", "Lug/a;", "kotlin.jvm.PlatformType", "", "faces", "Lbf0/d;", "onSuccess", "(Ljava/util/List;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
public final class MlkitFaceDetector$detect$2<TResult> implements OnSuccessListener<List<C19907a>> {
    public final /* synthetic */ FaceDetector.Callback $callback;
    public final /* synthetic */ Rectangle $cropRect;
    public final /* synthetic */ CountDownLatch $latch;
    public final /* synthetic */ Size $previewSize;
    public final /* synthetic */ long $start;

    public MlkitFaceDetector$detect$2(CountDownLatch countDownLatch, Rectangle rectangle, Size size, long j, FaceDetector.Callback callback) {
        this.$latch = countDownLatch;
        this.$cropRect = rectangle;
        this.$previewSize = size;
        this.$start = j;
        this.$callback = callback;
    }

    public final void onSuccess(List<C19907a> list) {
        this.$latch.countDown();
        C24362h.m61210e(list, "faces");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(list, 10));
        for (C19907a aVar : list) {
            C24362h.m61210e(aVar, "face");
            Rect rect = aVar.f50542a;
            C24362h.m61210e(rect, "face.boundingBox");
            arrayList.add(new Face(MlkitFaceDetectorKt.toRectangle(rect, this.$cropRect, this.$previewSize), new EulerAngle(aVar.f50547f, aVar.f50548g, aVar.f50549h)));
        }
        this.$callback.onDetectResult(arrayList, 1000.0f / ((float) (System.currentTimeMillis() - this.$start)));
    }
}
