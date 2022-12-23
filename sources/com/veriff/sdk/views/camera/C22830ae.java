package com.veriff.sdk.views.camera;

import android.util.Size;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/Rotation;", "", "(Ljava/lang/String;I)V", "apply", "Landroid/util/Size;", "size", "NONE", "CLOCKWISE", "HALF_TURN", "COUNTER_CLOCKWISE", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ae */
public enum C22830ae {
    NONE,
    CLOCKWISE,
    HALF_TURN,
    COUNTER_CLOCKWISE;

    /* renamed from: a */
    public final Size mo57636a(Size size) {
        C24362h.m61211f(size, "size");
        int i = C22831af.f57933a[ordinal()];
        if (i == 1 || i == 2) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }
}
