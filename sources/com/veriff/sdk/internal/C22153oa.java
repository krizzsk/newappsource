package com.veriff.sdk.internal;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.veriff.sdk.detector.Rectangle;
import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, mo59060d2 = {"computeRect", "Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "input", "Lcom/veriff/sdk/detector/Rectangle;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.oa */
public final class C22153oa {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final RectF m53963b(Canvas canvas, Rectangle rectangle) {
        return new RectF(rectangle.getTopLeft().getX() * ((float) canvas.getWidth()), rectangle.getTopLeft().getY() * ((float) canvas.getHeight()), rectangle.getBottomRight().getX() * ((float) canvas.getWidth()), rectangle.getBottomRight().getY() * ((float) canvas.getHeight()));
    }
}
