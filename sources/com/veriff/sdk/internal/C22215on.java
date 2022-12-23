package com.veriff.sdk.internal;

import com.veriff.sdk.detector.Face;
import com.veriff.sdk.detector.Rectangle;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/SelfieAutoCaptureConstraints;", "Lcom/veriff/sdk/views/autocapture/FaceConstraints;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "(Lcom/veriff/sdk/internal/data/FeatureFlags;)V", "check", "", "face", "Lcom/veriff/sdk/detector/Face;", "overlayRectangle", "Lcom/veriff/sdk/detector/Rectangle;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.on */
public final class C22215on implements C22200oi {

    /* renamed from: a */
    private final C21789ix f56000a;

    public C22215on(C21789ix ixVar) {
        C24362h.m61211f(ixVar, "featureFlags");
        this.f56000a = ixVar;
    }

    /* renamed from: a */
    public boolean mo56110a(Face face, Rectangle rectangle) {
        C24362h.m61211f(face, "face");
        C24362h.m61211f(rectangle, "overlayRectangle");
        float Q = this.f56000a.mo55440Q();
        float width = rectangle.getWidth() * (((float) 1) - this.f56000a.mo55439P());
        float width2 = face.getBoundingBox().getWidth();
        if (width2 < rectangle.getWidth() * Q || width2 > width || !rectangle.getCenter().grow(this.f56000a.mo55439P()).contains(face.getBoundingBox().getCenter()) || Math.max(face.getOrientation().getX(), Math.max(face.getOrientation().getY(), face.getOrientation().getZ())) > ((float) this.f56000a.mo55441R())) {
            return false;
        }
        return true;
    }
}
