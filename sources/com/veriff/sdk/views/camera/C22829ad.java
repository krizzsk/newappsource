package com.veriff.sdk.views.camera;

import android.media.MediaCodec;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/OsMediaCodecFactory;", "Lcom/veriff/sdk/views/camera/MediaCodecFactory;", "()V", "createCodec", "Landroid/media/MediaCodec;", "name", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ad */
public final class C22829ad implements C22931z {
    /* renamed from: a */
    public MediaCodec mo57635a(String str) {
        C24362h.m61211f(str, "name");
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        C24362h.m61210e(createByCodecName, "MediaCodec.createByCodecName(name)");
        return createByCodecName;
    }
}
