package com.veriff.sdk.internal.mlkit;

import android.graphics.Rect;
import com.veriff.sdk.detector.Point;
import com.veriff.sdk.detector.Rectangle;
import com.veriff.sdk.detector.Size;
import kotlin.Metadata;
import p839ug.C19910d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, mo59060d2 = {"Landroid/graphics/Rect;", "Lcom/veriff/sdk/detector/Rectangle;", "cropRect", "Lcom/veriff/sdk/detector/Size;", "previewView", "toRectangle", "Lcom/veriff/sdk/detector/Point;", "previewSize", "correct", "Lug/d;", "options", "Lug/d;", "mlkit_release"}, mo59061k = 2, mo59062mv = {1, 4, 2})
public final class MlkitFaceDetectorKt {
    /* access modifiers changed from: private */
    public static final C19910d options = new C19910d(1, 1, 1);

    private static final Point correct(Point point, Rectangle rectangle, Size size) {
        float height = rectangle.getHeight();
        float width = rectangle.getWidth();
        float height2 = (width / size.getHeight()) * size.getWidth();
        return new Point(((float) 1) - ((point.getX() - ((height - height2) * 0.5f)) / height2), point.getY() / width);
    }

    /* access modifiers changed from: private */
    public static final Rectangle toRectangle(Rect rect, Rectangle rectangle, Size size) {
        return new Rectangle(correct(new Point((float) rect.left, (float) rect.top), rectangle, size), correct(new Point((float) rect.right, (float) rect.bottom), rectangle, size)).normalize();
    }
}
