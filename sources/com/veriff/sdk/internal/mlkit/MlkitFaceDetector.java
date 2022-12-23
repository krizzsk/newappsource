package com.veriff.sdk.internal.mlkit;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.veriff.sdk.camera.core.ImageProxy;
import com.veriff.sdk.detector.FaceDetector;
import com.veriff.sdk.detector.Rectangle;
import com.veriff.sdk.detector.Size;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import mf0.C24362h;
import p791sg.C19459a;
import p839ug.C19909c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\u0012\u0010\u0014J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/internal/mlkit/MlkitFaceDetector;", "Lcom/veriff/sdk/detector/FaceDetector;", "Lsg/a;", "image", "Lcom/veriff/sdk/detector/Rectangle;", "cropRect", "Lcom/veriff/sdk/detector/Size;", "previewSize", "Lcom/veriff/sdk/detector/FaceDetector$Callback;", "callback", "Lbf0/d;", "detect", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/veriff/sdk/camera/core/ImageProxy;", "Lug/c;", "detector", "Lug/c;", "<init>", "(Lug/c;)V", "()V", "mlkit_release"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class MlkitFaceDetector implements FaceDetector {
    private final C19909c detector;

    public MlkitFaceDetector(C19909c cVar) {
        C24362h.m61211f(cVar, "detector");
        this.detector = cVar;
    }

    public void detect(Bitmap bitmap, Rectangle rectangle, Size size, FaceDetector.Callback callback) {
        C24362h.m61211f(bitmap, "bitmap");
        C24362h.m61211f(rectangle, "cropRect");
        C24362h.m61211f(size, "previewSize");
        C24362h.m61211f(callback, WidgetMessageParser.KEY_CALLBACK);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C19459a aVar = new C19459a(bitmap, 270);
        zzke.zza(zzkc.zzb("vision-common"), -1, 1, elapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), 270);
        detect(aVar, rectangle, size, callback);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MlkitFaceDetector() {
        /*
            r4 = this;
            ug.d r0 = com.veriff.sdk.internal.mlkit.MlkitFaceDetectorKt.options
            java.lang.String r1 = "You must provide a valid FaceDetectorOptions."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            lg.g r2 = p627lg.C18208g.m44941c()
            java.lang.Class<vg.c> r3 = p863vg.C20126c.class
            java.lang.Object r2 = r2.mo50622a(r3)
            vg.c r2 = (p863vg.C20126c) r2
            r2.getClass()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.mlkit.vision.face.internal.FaceDetectorImpl r1 = new com.google.mlkit.vision.face.internal.FaceDetectorImpl
            vg.d r3 = r2.f51068a
            java.lang.Object r3 = r3.get(r0)
            vg.f r3 = (p863vg.C20129f) r3
            lg.d r2 = r2.f51069b
            r1.<init>(r3, r2, r0)
            r4.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.mlkit.MlkitFaceDetector.<init>():void");
    }

    public void detect(ImageProxy imageProxy, Rectangle rectangle, Size size, FaceDetector.Callback callback) {
        C24362h.m61211f(imageProxy, "image");
        C24362h.m61211f(rectangle, "cropRect");
        C24362h.m61211f(size, "previewSize");
        C24362h.m61211f(callback, WidgetMessageParser.KEY_CALLBACK);
        Image image = imageProxy.getImage();
        C24362h.m61208c(image);
        detect(C19459a.m46857a(image, 270), rectangle, size, callback);
    }

    private final void detect(C19459a aVar, Rectangle rectangle, Size size, FaceDetector.Callback callback) {
        long currentTimeMillis = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.detector.mo43890b(aVar).addOnFailureListener(new MlkitFaceDetector$detect$1(countDownLatch, callback)).addOnSuccessListener(new MlkitFaceDetector$detect$2(countDownLatch, rectangle, size, currentTimeMillis, callback));
        countDownLatch.await();
    }
}
