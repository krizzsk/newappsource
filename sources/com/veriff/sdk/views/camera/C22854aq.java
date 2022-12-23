package com.veriff.sdk.views.camera;

import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0006"}, mo59060d2 = {"slice", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "off", "", "size", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.aq */
public final class C22854aq {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final ByteBuffer m56259b(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.position(i);
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(i2);
        return slice;
    }
}
