package com.veriff.sdk.internal;

import android.graphics.Rect;
import com.veriff.sdk.detector.Point;
import com.veriff.sdk.detector.Rectangle;
import kotlin.Metadata;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo59060d2 = {"log", "Lmobi/lab/veriff/util/Log;", "kotlin.jvm.PlatformType", "toRectangle", "Lcom/veriff/sdk/detector/Rectangle;", "Landroid/graphics/Rect;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.oe */
public final class C22191oe {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C24465j f55951a = C24465j.m61536a(C22181od.class);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Rectangle m54006b(Rect rect) {
        return new Rectangle(new Point((float) rect.left, (float) rect.top), new Point((float) rect.right, (float) rect.bottom));
    }
}
