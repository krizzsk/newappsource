package com.veriff.sdk.internal.video;

import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo59060d2 = {"com/veriff/sdk/internal/video/VideoPlayer$observer$1", "Landroidx/lifecycle/o;", "Lbf0/d;", "onDestroy", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class VideoPlayer$observer$1 implements C1031o {

    /* renamed from: a */
    public final /* synthetic */ C22623a f57068a;

    public VideoPlayer$observer$1(C22623a aVar) {
        this.f57068a = aVar;
    }

    @C1045x(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.f57068a.f57070b = false;
        this.f57068a.f57071c.release();
    }
}
