package com.veriff.sdk.detector;

import android.graphics.Bitmap;
import com.veriff.sdk.camera.core.ImageProxy;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000f"}, mo59060d2 = {"Lcom/veriff/sdk/detector/FaceDetector;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/veriff/sdk/detector/Rectangle;", "cropRect", "Lcom/veriff/sdk/detector/Size;", "previewSize", "Lcom/veriff/sdk/detector/FaceDetector$Callback;", "callback", "Lbf0/d;", "detect", "Lcom/veriff/sdk/camera/core/ImageProxy;", "image", "Callback", "detector-common_release"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public interface FaceDetector {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u000b\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH&¨\u0006\f"}, mo59060d2 = {"Lcom/veriff/sdk/detector/FaceDetector$Callback;", "", "", "error", "Lbf0/d;", "onDetectFailed", "", "Lcom/veriff/sdk/detector/Face;", "facesList", "", "fps", "onDetectResult", "detector-common_release"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    public interface Callback {
        void onDetectFailed(Throwable th);

        void onDetectResult(List<Face> list, float f);
    }

    void detect(Bitmap bitmap, Rectangle rectangle, Size size, Callback callback);

    void detect(ImageProxy imageProxy, Rectangle rectangle, Size size, Callback callback);
}
